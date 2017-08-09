package com.thegayman.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thegayman.model.OrderAll;
import com.thegayman.model.OrderItem;
import com.thegayman.model.Orders;
import com.thegayman.model.Product;
import com.thegayman.service.OrdersService;
import com.thegayman.utils.ConstantUtil;

import jdk.internal.org.objectweb.asm.TypeReference;
import net.minidev.json.writer.BeansMapper.Bean;

/**
 * order
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */
@RestController
@RequestMapping("orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	private ObjectMapper MAPPER = new ObjectMapper();
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public List<Orders> list(HttpServletRequest request) {
		//根据用户id获取订单信息
		String userid = request.getParameter("userid");
	List<Orders> orders= ordersService.queryByUserId(userid);	
	
	
		return orders;
	}

	/**
	 * 开启线程处理订单
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public void save(HttpServletRequest request) {
		try {
			String param = request.getParameter("order");
			String paramList=request.getParameter("produceList");
			Thread thread = new Thread(new deal(param,paramList));
			thread.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public Integer delete(HttpServletRequest request) {
		
		try {
			String param = request.getParameter(ConstantUtil.PARAM_NAME);
			String[] array = MAPPER.readValue(param,String[].class);
			if (array!=null&&array.length>0) {
				int x = ordersService.deleteByIds(array);
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		return null;
	}

	/**
	 * 处理订单线程
	 * 
	 * @author ye
	 *
	 */
	class deal implements Runnable {
		String param;
		String paramList;
		public deal(String param,String paramList) {
			this.param = param;
			this.paramList=paramList;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Orders	order = MAPPER.readValue(param, Orders.class);
				order.setOid((int) (Math.random()*9000+1000));
				order.setOrderTime(new Date(System.currentTimeMillis()));
				JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, OrderAll.class); 
				List<OrderAll> orderList=MAPPER.readValue(paramList, javaType);//前台传过来一个produce集合,后面处理
				List<OrderItem> orderItemList=new ArrayList<OrderItem>();
				for(OrderAll pro:orderList) {
					OrderItem item=new OrderItem();
					item.setPid(pro.getPid());
					item.setOid(order.getOid());
					item.setCount(pro.getCount());
					item.setItemTotal(pro.getProPrice());
					item.setItemId((int) (Math.random()*9000+1000));
					orderItemList.add(item);
				}
				ordersService.save(order,orderItemList);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		}

	}
}

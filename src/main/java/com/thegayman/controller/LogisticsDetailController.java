package com.thegayman.controller;

import java.util.Date;
import java.util.List;  
import com.thegayman.model.LogisticsDetail;
import com.thegayman.service.LogisticsDetailService;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import javax.servlet.http.HttpServletRequest;
/**
 * 物流信息(logistics_detail)
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */
@RestController
@RequestMapping("logisticsdetail")
public class LogisticsDetailController {
 
	@Autowired
	private LogisticsDetailService logisticsDetailService;

	
	
	
}

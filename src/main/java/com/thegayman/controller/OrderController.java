package com.thegayman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0/order")
public class OrderController {  
	@RequestMapping("/add")
	 public void add(){
		System.out.println("add!!!"); 
	 }
}

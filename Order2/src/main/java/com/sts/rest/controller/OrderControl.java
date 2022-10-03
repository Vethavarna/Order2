package com.sts.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.rest.entity.Orders;
import com.sts.rest.services.OrderServices;
@RestController
public class OrderControl {
	@Autowired
	private OrderServices serviceRepo;
	@GetMapping("/orders")
	public List<Orders> getAllOrders()
	{
		return serviceRepo.getAllOrders();
	}
	@PostMapping("/addorder")
	public void addCustomer(@RequestBody Orders order)
	{
		this.serviceRepo.addOrders(order);
	}
	@PutMapping("/customer/{orderid}")
	public void updateCustomer(@PathVariable String orderId,@RequestBody Orders order)
	{
		this.serviceRepo.updateOrders(Integer.parseInt(orderId), order);
	}
	@DeleteMapping("/delete/{orderId}")
	public void deleteCustomer(@PathVariable Orders orderId) 
	{
		this.serviceRepo.addCustomer(orderId);
	}
}

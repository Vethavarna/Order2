package com.sts.rest.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.rest.entity.Orders;
import com.sts.rest.repository.ordersRepo;


@Service

public class OrderServices {
	@Autowired
	private ordersRepo serviceRepo;
	public List<Orders> getAllOrders()
	{
		List<Orders> list=new ArrayList<Orders>();
		this.serviceRepo.findAll().forEach(list::add);
		return list;
		
	}
	public void addOrders(Orders order) {
		// TODO Auto-generated method stub
		this.serviceRepo.save(order);
	}
	public void updateOrders(int parseInt, Orders order) {
		// TODO Auto-generated method stub
		this.serviceRepo.save(order);
	}
	public void addCustomer(Orders orderId) {
		// TODO Auto-generated method stub
		this.serviceRepo.save(orderId);
	}
}

package com.wawa.hcl.workloadmanagement.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wawa.hcl.workloadmanagement.dao.Item;
import com.wawa.hcl.workloadmanagement.dao.OrderItem;
import com.wawa.hcl.workloadmanagement.dao.OrderRepository;
import com.wawa.hcl.workloadmanagement.model.OrderRequest;

@Service
public class WorkLoadService {
	private static final Logger LOGGER = LoggerFactory.getLogger(WorkLoadService.class);
	@Autowired
	private OrderRepository orderRepository;

	public OrderItem placeOrder(OrderRequest orderRequest) {
		return null;
	}

	public OrderItem saveItem(Item item) {
		return null;
	}

}

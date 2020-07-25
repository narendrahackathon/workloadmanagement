package com.wawa.hcl.workloadmanagement.service;

import com.wawa.hcl.workloadmanagement.dao.OrderRepository;
import com.wawa.hcl.workloadmanagement.model.OrderRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wawa.hcl.workloadmanagement.dao.OrderItem;

@Service
public class WorkLoadService {
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkLoadService.class);
    @Autowired
    private OrderRepository orderRepository;

    public OrderItem placeOrder(OrderItem orderRequest) {
         return orderRepository.save(orderRequest);
    }


}

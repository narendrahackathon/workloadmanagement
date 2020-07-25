package com.wawa.hcl.workloadmanagement.service;

import com.wawa.hcl.workloadmanagement.dao.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkLoadService {
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkLoadService.class);
    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
         return orderRepository.save(order);
    }


}

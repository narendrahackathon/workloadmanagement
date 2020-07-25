package com.wawa.hcl.workloadmanagement.controller;

import com.wawa.hcl.workloadmanagement.model.OrderRequest;
import com.wawa.hcl.workloadmanagement.service.WorkLoadService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workload")
public class WorkLoadController implements HealthIndicator {

    @Autowired
    WorkLoadService workLoadService;

    @PostMapping(path = "/order", consumes = "application/json" , produces = "application/json")
    public ResponseEntity<Object> order(@RequestBody OrderRequest orderRequest){
        workLoadService.placeOrder(orderRequest);
        return null;
    }

    @PostMapping(path = "/station", consumes = "application/json" , produces = "application/json")
    public ResponseEntity<Object> station(@RequestBody Order station){
        return null;
    }


    @Override
    public Health getHealth(boolean includeDetails) {
        return null;
    }

    @Override
    public Health health() {
        return null;
    }
}

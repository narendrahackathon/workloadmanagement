package com.wawa.hcl.workloadmanagement.controller;

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

    @PostMapping(path = "/order", consumes = "application/json" , produces = "application/json")
    public ResponseEntity<Object> order(@RequestBody String order){
        return null;
    }

    @PostMapping(path = "/station", consumes = "application/json" , produces = "application/json")
    public ResponseEntity<Object> station(@RequestBody String station){
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

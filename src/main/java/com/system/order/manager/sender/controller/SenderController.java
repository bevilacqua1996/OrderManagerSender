package com.system.order.manager.sender.controller;

import com.system.order.manager.sender.model.OrderRequest;
import com.system.order.manager.sender.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class SenderController {

    @Autowired
    private SenderService senderService;

    @PostMapping(consumes = "application/json")
    public ResponseEntity<String> sendOrderCreation(@RequestBody OrderRequest orderRequest) {
        senderService.sendOrder(orderRequest);
        return new ResponseEntity<>("Order request sent!", HttpStatus.CREATED);
    }

}

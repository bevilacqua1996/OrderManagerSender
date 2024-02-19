package com.system.order.manager.sender.service;

import com.system.order.manager.sender.constants.Constants;
import com.system.order.manager.sender.model.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendOrder(OrderRequest orderRequest) {
        kafkaTemplate.send(Constants.EXTERNAL_ORDER_TOPIC, orderRequest);
    }

}

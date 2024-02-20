package com.system.order.manager.sender.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.system.order.manager.sender.model.OrderRequest;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class CustomSerializer implements Serializer<OrderRequest> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public byte[] serialize(String topic, OrderRequest data) {
        try {
            if (data == null){
                return null;
            }
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            throw new SerializationException("Error when serializing OrderRequest to byte[]");
        }
    }

    @Override
    public void close() {
    }
}

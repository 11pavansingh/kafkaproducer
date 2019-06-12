package com.spring.kafka.producerdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.kafka.producerdemo.beans.User;

@Service
public class ProducerServiceImpl implements ProducerService{
	
	/*@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;*/
	
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	private static final String TOPIC = "test";
	
	/*@Override
	public String publishMessage(String message) {
		kafkaTemplate.send(TOPIC,message);
		return "published successfully";
	}*/
	
	@Override
	public String publishJson(User user) {
		kafkaTemplate.send(TOPIC,user);
		return "published successfully";
	}

}

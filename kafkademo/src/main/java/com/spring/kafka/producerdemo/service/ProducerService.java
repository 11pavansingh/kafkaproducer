package com.spring.kafka.producerdemo.service;

import com.spring.kafka.producerdemo.beans.User;

public interface ProducerService {

	String publishJson(User user);

	//String publishMessage(String message);

}

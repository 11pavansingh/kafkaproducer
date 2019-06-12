package com.spring.kafka.producerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.producerdemo.beans.User;
import com.spring.kafka.producerdemo.service.ProducerService;

@RestController
@RequestMapping("kafka")
public class ProducerController {
	
	@Autowired
	private ProducerService producerService;
	
	
	/*@GetMapping("/publish/{message}")
	public String publish(@PathVariable("message") final String message) {
		kafkaTemplate.send(TOPIC,message);
		return "published successfully";
	}*/
	
	/*@GetMapping("/publish/{message}")
	public String publishMessage(@PathVariable("message") final String message) {
		String response = producerService.publishMessage(message);
		return response;
	}*/
	
	@PostMapping("/publishJson")
	public String publishJson(@RequestBody User user) {
		String response = producerService.publishJson(user);
		return response;
	}

}

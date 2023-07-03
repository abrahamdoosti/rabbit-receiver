package com.example.rabbitreceiver.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitreceiver.config.AmqpConfig;


@RestController
@RequestMapping(value = "/messages")
public class RabbitReply {

	private final RabbitTemplate rabbitTemplate;

	public RabbitReply(RabbitTemplate rabbitTemplate) {
		// this.receiver = receiver;
		this.rabbitTemplate = rabbitTemplate;
	}

	@PostMapping
	public ResponseEntity<String> sendRabbitMessage(@RequestBody String message) {
		// send to rabbit
        this.rabbitTemplate.convertAndSend(AmqpConfig.topicExchangeName, "reply", message);
        return new ResponseEntity<String>(message + " sent!", HttpStatus.OK);
	}

}

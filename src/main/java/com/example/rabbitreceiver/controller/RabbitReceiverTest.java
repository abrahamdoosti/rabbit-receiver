package com.example.rabbitreceiver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class RabbitReceiverTest {

	@GetMapping(value = "/")
	public String getRabbitSender() {
		return "You have reached test end point for RabbitReceiver!";
	}

}

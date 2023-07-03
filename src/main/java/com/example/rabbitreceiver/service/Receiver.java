package com.example.rabbitreceiver.service;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Receiver {

	/*
	 * private CountDownLatch latch = new CountDownLatch(1);
	 * 
	 * public void receiveMessage(String message) { System.out.println("Received <"
	 * + message + ">"); latch.countDown(); }
	 * 
	 * public CountDownLatch getLatch() { return latch; }
	 */

	public void defaultReceive(String message) {
		log.info("Message Recieved: {}", message);
		// System.out.println(message);

	}

}

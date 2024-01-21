/**
 * 
 */
package com.alibou.wikimedia.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 */
@Slf4j
@Service
public class WikimediaConsumer {
	
	@KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
	public void consumeMsg(String msg) {
		log.info(String.format("Consuming message from wikimedia-stream topic:: %s", msg));
		// Please feel free to do anything you want with the data
	}

}

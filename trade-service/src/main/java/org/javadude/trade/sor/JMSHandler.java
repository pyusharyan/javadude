package org.javadude.trade.sor;

import org.springframework.integration.Message;
import org.springframework.integration.support.MessageBuilder;

public class JMSHandler {

	public Message<?> jmsResponseHandler(Message<?> message){
		return MessageBuilder.withPayload("Trade Dispatched Successfully").build();
	}
}

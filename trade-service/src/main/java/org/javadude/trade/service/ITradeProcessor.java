package org.javadude.trade.service;

import org.springframework.integration.Message;

public interface ITradeProcessor {

	public Message<?> processTrade(Message<?> message);
}

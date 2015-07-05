package org.javadude.trade.enricher;

import org.apache.log4j.Logger;
import org.javadude.trade.router.ValidationRouter;
import org.javadude.trade.validation.Validation;
import org.javadude.trade.vo.Trade;
import org.springframework.integration.Message;
import org.springframework.integration.support.MessageBuilder;

public class MarketEnricher {

	private static final Logger LOGGER = Logger.getLogger(MarketEnricher.class);
	
	public Message<?> enrichPayloadMarket(Message<Validation> message){
		
		Validation validation = (Validation)message.getPayload();
		Trade trade = validation.getTrade();
		trade.setTradeMarket("US");
		validation.setTrade(trade);
		
		LOGGER.info("Trade Status : "+trade.getStatus());
		
		return MessageBuilder.withPayload(validation).build();
	}
}

package org.javadude.trade.router;

import org.apache.log4j.Logger;
import org.javadude.trade.utils.TradeConstants;
import org.javadude.trade.validation.Validation;
import org.javadude.trade.vo.Trade;
import org.springframework.integration.Message;

public class MarketRouter {

	private static final Logger LOGGER = Logger.getLogger(MarketRouter.class);
	
	public String marketRouter(Message<?> message){
		String channel = null;
		Validation validation = (Validation)message.getPayload();
		Trade trade = validation.getTrade();
		if(TradeConstants.TPV==trade.getStatus())
			channel = "header-enricher-input";
		else
			channel = "sor-request-channel";
		
		LOGGER.info("Channel selected by market router : "+channel);
		return channel;
	}
}

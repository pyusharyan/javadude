package org.javadude.trade.service.impl;

import org.apache.log4j.Logger;
import org.javadude.trade.utils.StringUtil;
import org.javadude.trade.utils.TradeConstants;
import org.javadude.trade.validation.Validation;
import org.javadude.trade.vo.Trade;
import org.springframework.integration.Message;
import org.springframework.integration.support.MessageBuilder;

public class TradeValidate{

	private static final Logger LOGGER = Logger.getLogger(TradeValidate.class);
	

	public Message<?> validateTrade(Message<?> message) {
		
		String tradeStatus = null;
		String validationStatus = null;
		Validation validation = (Validation)message.getPayload();
		Trade trade = validation.getTrade();
		
		//LOGGER.info(trade);
		
		if(TradeConstants.BLANK.equals(StringUtil.checkForNullString(trade.getTradeId()))){
			tradeStatus = TradeConstants.TRJ;
			validationStatus = TradeConstants.VFAIL;
			LOGGER.info("TradeId is missing");
		}
		else if(TradeConstants.BLANK.equals(StringUtil.checkForNullString(trade.getTradeName()))){
			tradeStatus = TradeConstants.TRJ;
			validationStatus = TradeConstants.VFAIL;
			LOGGER.info("TradeName is missing");
		}
		else if(TradeConstants.BLANK.equals(StringUtil.checkForNullString(trade.getTradeSource()))){
			tradeStatus = TradeConstants.TRJ;
			validationStatus = TradeConstants.VFAIL;
			LOGGER.info("TradeSource is missing");
		}
		
		else if(TradeConstants.BLANK.equals(StringUtil.checkForNullString(trade.getTradeMarket()))){
			tradeStatus =  TradeConstants.TPV;
			validationStatus = TradeConstants.VSUCC;
			LOGGER.info("All mandatory fields are present Except Market");
		}
		else{
			tradeStatus =  TradeConstants.TSV;
			validationStatus = TradeConstants.VSUCC;
			LOGGER.info("All mandatory fields are present");
		}
		
		validation.setValidationStatus(validationStatus);
		trade.setStatus(tradeStatus);
		validation.setTrade(trade);
		LOGGER.info("Trade Status : "+trade.getStatus());
		return MessageBuilder.withPayload(validation).build();
		
		}

			

}

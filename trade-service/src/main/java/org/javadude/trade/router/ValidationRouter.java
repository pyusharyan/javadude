package org.javadude.trade.router;

import org.apache.log4j.Logger;
import org.javadude.trade.utils.TradeConstants;
import org.javadude.trade.validation.Validation;
import org.springframework.integration.Message;

public class ValidationRouter {

	private static final Logger LOGGER = Logger.getLogger(ValidationRouter.class);
	
	public String validationRouter(Message<?> message){
		String channel = null;
		Validation validation = (Validation)message.getPayload();
		if(validation.getValidationStatus()==TradeConstants.VFAIL)
			channel="trade-execute-output";
		else
			channel="trade-accpet-input";
		
		LOGGER.info("Channel selected by validation router : "+channel);
		
		return channel;
	}
}

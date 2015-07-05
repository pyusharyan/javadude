package org.javadude.trade.sbi;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.javadude.trade.context.TradeContext;
import org.javadude.trade.request.InsertTradeRequest;
import org.javadude.trade.request.Trade;
import org.javadude.trade.request.Validation;
import org.javadude.trade.response.InsertTradeResponse;
import org.javadude.trade.response.Transaction;
import org.javadude.trade.sei.TradeSEI;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TradeSBI implements TradeSEI {

	final String CLASS_NAME = "TradeSBI";
	Logger log = Logger.getLogger(CLASS_NAME);
	
	
	TradeService tradeService;
	
	@PayloadRoot(namespace="www.javadude.org/trade", localPart="insertTradeRequest")
	@ResponsePayload
	public InsertTradeResponse insertTrade(@RequestPayload InsertTradeRequest insertTradeRequest) {
		
		InsertTradeResponse insertTradeResponse = new InsertTradeResponse();
		log.setLevel(Level.FINE);
		log.log(Level.FINE,"Calling Service");
		
		Validation validation = insertTradeRequest.getValidation();
		if(validation != null){
		Trade trade = validation.getTrade();
		if(trade != null){
		
		tradeService = TradeContext.getTradeServiceInstance();
		Transaction transaction = 
				tradeService.persistTrade(trade);
		
		log.log(Level.FINE,"Inserted Succesfully");
		
		insertTradeResponse.setTransaction(transaction);
		}
		else{
			log.log(Level.WARNING,"Trade is null");
		}
		}
		else{
			log.log(Level.WARNING,"Validation is null");
		}
		
		return insertTradeResponse;
	}

}

package org.javadude.trade.sbi;



import org.apache.log4j.Level;
import org.apache.log4j.Logger;
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
	
	Logger debugLog = Logger.getLogger("debugLogger");
	Logger infoLog = Logger.getLogger(CLASS_NAME);
	
	TradeService tradeService;
	
	
	@PayloadRoot(namespace="www.javadude.org/trade", localPart="insertTradeRequest")
	@ResponsePayload
	public InsertTradeResponse insertTrade(@RequestPayload InsertTradeRequest insertTradeRequest) {
		
		debugLog.debug(CLASS_NAME+" : Entering method InsertTradeResponse");
		InsertTradeResponse insertTradeResponse = new InsertTradeResponse();
		
		infoLog.info("Calling Service");
		long startTime = System.currentTimeMillis();
		Validation validation = insertTradeRequest.getValidation();
		if(validation != null){
		Trade trade = validation.getTrade();
		if(trade != null){
		
		tradeService = TradeContext.getTradeServiceInstance();
		Transaction transaction = 
				tradeService.persistTrade(trade);
		
		infoLog.info("Inserted Succesfully");
		
		insertTradeResponse.setTransaction(transaction);
		}
		else{
			infoLog.warn("Trade is null");
		}
		}
		else{
			infoLog.warn("Validation is null");
		}
		long endTime = System.currentTimeMillis();
		debugLog.debug("total time taken to persist : "+(endTime-startTime)+" millis");
		debugLog.debug(CLASS_NAME+" : Exiting method InsertTradeResponse");
		return insertTradeResponse;
	}

}

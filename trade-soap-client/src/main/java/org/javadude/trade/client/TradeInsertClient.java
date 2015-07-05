package org.javadude.trade.client;

import org.javadude.trade.InsertTradeRequest;
import org.javadude.trade.InsertTradeResponse;
import org.javadude.trade.TradeService;
import org.javadude.trade.TradeServiceService;

public class TradeInsertClient {

	public InsertTradeResponse insertTradeRequest(InsertTradeRequest insertTradeRequest) {
		
		TradeService tradeService = new TradeServiceService().getTradeServiceSoap11();
		InsertTradeResponse insertTradeResponse = tradeService.insertTrade(insertTradeRequest);
		return insertTradeResponse;

	}

}

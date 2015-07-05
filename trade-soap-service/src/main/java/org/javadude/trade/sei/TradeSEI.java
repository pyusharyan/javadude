package org.javadude.trade.sei;

import org.javadude.trade.request.InsertTradeRequest;
import org.javadude.trade.response.InsertTradeResponse;


public interface TradeSEI {

	public InsertTradeResponse insertTrade(InsertTradeRequest insertTradeRequest);
}

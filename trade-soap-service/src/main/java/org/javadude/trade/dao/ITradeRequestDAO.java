package org.javadude.trade.dao;

import org.javadude.trade.exception.TradeException;
import org.javadude.trade.request.Trade;
import org.javadude.trade.response.InsertTradeResponse;
import org.springframework.dao.DataAccessException;

public interface ITradeRequestDAO {

	public int insertTrade(Trade trade) throws TradeException;
}

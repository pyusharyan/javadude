package org.javadude.trade.sbi;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.javadude.trade.dao.ITradeRequestDAO;
import org.javadude.trade.dao.impl.TradeRequestDAOImpl;
import org.javadude.trade.exception.TradeException;
import org.javadude.trade.request.Trade;
import org.javadude.trade.response.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TradeService {
	
	@Autowired
	TradeRequestDAOImpl tradeDAO;
	
	final String CLASS_NAME = "TradeService";
	Logger log = Logger.getLogger(CLASS_NAME);
	
	public Transaction persistTrade(Trade trade){
		int auditId = 0;
		 Transaction transaction = new Transaction();
		 
		try{ 
			log.setLevel(Level.FINE);
			log.log(Level.FINE,"Calling Dao");
			auditId = tradeDAO.insertTrade(trade);
			log.log(Level.FINE,"Persisted Succesfully");
			transaction.setTransactionId(String.valueOf(auditId));
			transaction.setTransactionMessage("Trade Persisted Successfully");
		}
		catch(TradeException te){
			log.log(Level.SEVERE, te.getMessage(), te);
			transaction.setTransactionId(String.valueOf(auditId));
			transaction.setTransactionMessage("Persist Failure");
		}
		
		return transaction;
	}
}

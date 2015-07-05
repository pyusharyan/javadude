package org.javadude.trade.sbi;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
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
	
	Logger debugLog = Logger.getLogger("debugLogger");
	Logger infoLog = Logger.getLogger(CLASS_NAME);
	
	public Transaction persistTrade(Trade trade){
		debugLog.debug(CLASS_NAME+": Entering method persistTrade");
		int auditId = 0;
		 Transaction transaction = new Transaction();
		 
		try{ 
			infoLog.info("Calling Dao");
			auditId = tradeDAO.insertTrade(trade);
			infoLog.info("Persisted Succesfully");
			transaction.setTransactionId(String.valueOf(auditId));
			transaction.setTransactionMessage("Trade Persisted Successfully");
		}
		catch(TradeException te){
			infoLog.error(te.getMessage(), te);
			transaction.setTransactionId(String.valueOf(auditId));
			transaction.setTransactionMessage("Persist Failure");
		}
		debugLog.debug(CLASS_NAME+" : Exiting method persistTrade");
		return transaction;
	}
}

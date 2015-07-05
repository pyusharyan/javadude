package org.javadude.trade.dao.impl;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.javadude.trade.base.TradeBaseDao;
import org.javadude.trade.base.TradeStoredProcedure;
import org.javadude.trade.context.TradeContext;
import org.javadude.trade.dao.ITradeRequestDAO;
import org.javadude.trade.exception.TradeException;
import org.javadude.trade.request.Trade;
import org.javadude.trade.response.InsertTradeResponse;
import org.javadude.trade.util.MapUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
@Repository
public class TradeRequestDAOImpl extends TradeBaseDao implements ITradeRequestDAO {
	
	final String CLASS_NAME = "TradeRequestDAOImpl";
	Logger log = Logger.getLogger(CLASS_NAME);
	@Override
	public int insertTrade(Trade trade) throws TradeException{
		
		TradeStoredProcedure objStoredProcedure = null;
		Map<String,Object> tradeMap = null;
		int auditId = 0;
		log.setLevel(Level.FINE);
		
		try{
		
			objStoredProcedure = TradeContext.getTradeStoredProcInstance("insertTradeRequest");
			tradeMap = MapUtil.createMap(tradeMap, trade);
			Map map =objStoredProcedure.execute(tradeMap);
			auditId = (int) map.get("P_AUDIT_ID");
			log.log(Level.FINE,"Audit Id = "+auditId);
		}catch(DataAccessException dae){
			log.log(Level.SEVERE, dae.getMessage(), dae);
			throw new TradeException(dae.getMessage());
		}
		
		return auditId;
	}

}

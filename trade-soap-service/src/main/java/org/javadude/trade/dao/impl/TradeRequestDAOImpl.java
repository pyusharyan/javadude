package org.javadude.trade.dao.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.javadude.trade.base.TradeBaseDao;
import org.javadude.trade.base.TradeStoredProcedure;
import org.javadude.trade.context.TradeContext;
import org.javadude.trade.dao.ITradeRequestDAO;
import org.javadude.trade.exception.TradeException;
import org.javadude.trade.request.Trade;
import org.javadude.trade.util.MapUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
@Repository
public class TradeRequestDAOImpl extends TradeBaseDao implements ITradeRequestDAO {
	
	final String CLASS_NAME = "TradeRequestDAOImpl";
	Logger debugLog = Logger.getLogger("debugLogger");
	Logger infoLog = Logger.getLogger(CLASS_NAME);
	@Override
	public int insertTrade(Trade trade) throws TradeException{
		debugLog.debug(CLASS_NAME+": Entering method insertTrade");
		TradeStoredProcedure objStoredProcedure = null;
		Map<String,Object> tradeMap = null;
		int auditId = 0;
		try{
		
			objStoredProcedure = TradeContext.getTradeStoredProcInstance("insertTradeRequest");
			tradeMap = MapUtil.createMap(tradeMap, trade);
			Map map =objStoredProcedure.execute(tradeMap);
			auditId = (int) map.get("P_AUDIT_ID");
			infoLog.info("Audit Id = "+auditId);
		}catch(DataAccessException dae){
			infoLog.error(dae.getMessage(), dae);
			throw new TradeException(dae.getMessage());
		}
		debugLog.debug(CLASS_NAME+": Exiting method insertTrade");
		return auditId;
	}

}

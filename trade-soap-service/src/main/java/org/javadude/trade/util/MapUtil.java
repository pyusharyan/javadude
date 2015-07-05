package org.javadude.trade.util;

import java.util.HashMap;
import java.util.Map;

import org.javadude.trade.request.Trade;

public class MapUtil {

	public static Map<String,Object> createMap(Map<String,Object> map, Object object){
		
		map = new HashMap<String,Object>();
		
		if(object instanceof Trade){
			Trade trade = (Trade) object;
			map = new HashMap<String,Object>();
			map.put("P_TRADE_ID", trade.getTradeId());
			map.put("P_TRADE_NM", trade.getTradeName());
			map.put("P_TRADE_SRC", trade.getTradeSource());
			map.put("P_TRADE_MKT", trade.getTradeMarket());
			map.put("P_TRADE_PRC", trade.getTradePrice());
			map.put("P_TRADE_STA", trade.getStatus());
			map.put("P_PRODUCT_ID", trade.getProductId());
		}
		
		return map;
	}
}

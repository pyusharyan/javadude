package org.javadude.trade.context;

import org.javadude.trade.base.TradeStoredProcedure;
import org.javadude.trade.sbi.TradeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TradeContext {

	private static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		applicationContext = new ClassPathXmlApplicationContext("spring-application-context.xml"); 
		return applicationContext;
	}

	public static void setApplicationContext(ApplicationContext applicationContext) {
		TradeContext.applicationContext = applicationContext;
	}
	
	public static TradeService getTradeServiceInstance() {
		TradeService tradeService = getApplicationContext().getBean("tradeService",TradeService.class);
		return tradeService;
	}
	
	public static TradeStoredProcedure getTradeStoredProcInstance(String id) {
		TradeStoredProcedure tradeStoredProc = (TradeStoredProcedure) getApplicationContext().getBean(id);
		return tradeStoredProc;
	}
	
}

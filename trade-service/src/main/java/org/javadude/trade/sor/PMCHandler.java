package org.javadude.trade.sor;

import java.util.List;

import org.apache.log4j.Logger;
import org.javadude.client.ProductInfoClient;
import org.javadude.trade.router.MarketRouter;
import org.javadude.trade.utils.TradeConstants;
import org.javadude.trade.validation.Validation;
import org.javadude.trade.vo.Product;
import org.javadude.trade.vo.Trade;
import org.springframework.integration.Message;

public class PMCHandler {

	private static final Logger LOGGER = Logger.getLogger(PMCHandler.class);
	private Validation validation;
	private Trade trade;
	
	public String pmcRequestHandler(Message<?> message){
		
		ProductInfoClient client = new ProductInfoClient();
		String response = null;
		
		Validation validation = (Validation)message.getPayload();
		Trade trade = validation.getTrade();
		
		this.validation = validation;
		this.trade = trade;
		
		String productId = trade.getProductId();
		trade.setStatus(TradeConstants.TPD);
		response = client.getProductInfo(productId);
		LOGGER.info("Trade Status : "+trade.getStatus());
	//	LOGGER.info(response);
		return response;
	}
	
	public Validation pmcResponseHandler(Message<?> message){
	
		Product product = (Product)message.getPayload();
		
		trade.setStatus(TradeConstants.TRS);
		trade.setTradePrice(product.getPrice());
		trade.setProduct(product);
		validation.setTrade(trade);
		LOGGER.info("Trade Status : "+trade.getStatus());
	//	LOGGER.info(product);
		return validation;
	}
}

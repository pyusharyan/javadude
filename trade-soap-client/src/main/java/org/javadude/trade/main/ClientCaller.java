package org.javadude.trade.main;

import org.javadude.trade.InsertTradeRequest;
import org.javadude.trade.InsertTradeResponse;
import org.javadude.trade.Product;
import org.javadude.trade.Trade;
import org.javadude.trade.Validation;
import org.javadude.trade.client.TradeInsertClient;

public class ClientCaller {

	public static void main(String[] args) {
		
		InsertTradeRequest insertTradeRequest = new InsertTradeRequest();
		
		Validation validation = new Validation();
		
		Trade trade = new Trade();
		
		Product product = new Product();
		product.setManufacturer("Apple Inc.");
		product.setPrice(54000);
		product.setProductId("P001");
		product.setProductName("MacBook Pro");
		product.setYearOfManufacture("2015-06-07");
		
		trade.setProduct(product);
		trade.setProductId("P001");
		trade.setStatus("TRS");
		trade.setTradeId("T001");
		trade.setTradeMarket("US");
		trade.setTradeName("TUSINAPP");
		trade.setTradePrice(54000);
		trade.setTradeSource("Apple Inc.");
		
		validation.setTrade(trade);
		validation.setValidationStatus("VALIDATION SUCCESS");
		
		insertTradeRequest.setValidation(validation);
		
		TradeInsertClient client = new TradeInsertClient();
		
		InsertTradeResponse  insertTradeResponse = 
				client.insertTradeRequest(insertTradeRequest);
		
		System.out.println(insertTradeResponse);
		
		

	}

}

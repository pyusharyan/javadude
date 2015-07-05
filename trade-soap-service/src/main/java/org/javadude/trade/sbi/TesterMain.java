package org.javadude.trade.sbi;

import org.javadude.trade.request.InsertTradeRequest;
import org.javadude.trade.request.Product;
import org.javadude.trade.request.Trade;
import org.javadude.trade.request.Validation;
import org.javadude.trade.response.InsertTradeResponse;



public class TesterMain {

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
		
		TradeSBI client = new TradeSBI();
		
		InsertTradeResponse  insertTradeResponse = 
				client.insertTrade(insertTradeRequest);
		
		System.out.println(insertTradeResponse);

	}

}

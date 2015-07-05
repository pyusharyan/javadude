package org.javadude.trade.exception;

public class TradeException extends Exception {

	static final long serialVersionUID = -1L;
	
	public TradeException(){
		super();
	}
	public TradeException(String message){
		super(message);
	}
}

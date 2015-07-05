package org.javadude.trade.validation;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.javadude.trade.vo.Trade;
@XmlRootElement
public class Validation {

	private String validationStatus;
	private static Validation validation;
	private Trade trade;
	
	private Validation() {}
	
	public String getValidationStatus() {
		return validationStatus;
	}
	public void setValidationStatus(String validationStatus) {
		this.validationStatus = validationStatus;
	}
	public Trade getTrade() {
		return trade;
	}

	public void setTrade(Trade trade) {
		this.trade = trade;
	}

	public static Validation getInstance(){
		return new Validation();
	}
	
public static List<String> trackValidation(List<String> list, String string){
	    
	if(list == null){
		list = new ArrayList<String>();
	}
		list.add(string);
		return list;
	}
	
	
}

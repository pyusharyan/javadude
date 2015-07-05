package org.javadude.trade.utils;

public class StringUtil {

	public static String checkForNullString(String input){
		String output="";
		if(input==null){
			input = TradeConstants.BLANK;
		}
		output = input.trim();	
		return output;
	}
}

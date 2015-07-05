/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.javadude.trade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.support.MessageBuilder;
import org.javadude.trade.service.ITradeProcessor;
import org.javadude.trade.service.StringConversionService;
import org.javadude.trade.service.impl.TradeValidate;
import org.javadude.trade.validation.Validation;
import org.javadude.trade.vo.Trade;


/**
 * Starts the Spring Context and will initialize the Spring Integration routes.
 *
 * @author Priyanshu
 * @since 1.0
 *
 */
public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class);

	/**
	 * Load the Spring Integration Application Context
	 *
	 * @param args - command line arguments
	 */
	public static void main(final String... args) {

		

		final AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:META-INF/spring/integration/*-context.xml");

		context.registerShutdownHook();

		

		ITradeProcessor service = context.getBean(ITradeProcessor.class);
		
			
			Trade t = new Trade("T001","P001","TUSINAPP","Apple Inc.","");
			Validation validation = Validation.getInstance();
			validation.setTrade(t);
			try {

				Message<?> m = service.processTrade(MessageBuilder.withPayload(validation).build());
				//String msg = (String);
				System.out.println("Final Trade : "+m.getPayload());
				

			} catch (Exception e) {
				LOGGER.error("An exception was caught: " + e);
			}


	}
}

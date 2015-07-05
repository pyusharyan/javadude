package org.javadude.product.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductServiceContext {

	protected static ApplicationContext context;

	public ApplicationContext getContext() {
		return context;
	}

	static{
		context = new ClassPathXmlApplicationContext("spring-application-context.xml");
	}
}

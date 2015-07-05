package org.javadude.product;

import org.javadude.product.service.ProductServiceImpl;

public class ProductMain {

	public static void main(String[] args) {
		
		ProductServiceImpl p = new ProductServiceImpl();
		System.out.println(p.getProductService("P002"));

	}

}

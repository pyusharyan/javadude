package org.javadude.product.dao;

import javax.sql.DataSource;

import org.javadude.product.Product;

public interface ProductInfoDAO {

	public Product getProductInfo(String productId);
}

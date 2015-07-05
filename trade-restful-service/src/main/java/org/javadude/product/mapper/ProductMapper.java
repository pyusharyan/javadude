package org.javadude.product.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.javadude.product.Product;
import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product>{

	
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setProductId(rs.getString("PRODUCT_ID"));
		product.setProductName(rs.getString("PRODUCT_NM"));
		product.setManufacturer(rs.getString("PRODUCT_MNFCT"));
		product.setPrice(rs.getInt("PRODUCT_PRC"));
		product.setYearOfManufacture(rs.getDate("PRODUCT_YOM"));
		return product;
	}

}

package org.javadude.product.dao.impl;

import javax.sql.DataSource;

import org.javadude.product.Product;
import org.javadude.product.ProductJDBCTemplate;
import org.javadude.product.dao.ProductInfoDAO;
import org.javadude.product.mapper.ProductMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductInfoDAOImpl extends ProductJDBCTemplate implements ProductInfoDAO {

	private DataSource dataSoruce;
	private JdbcTemplate jdbcTemplate;
	
	public Product getProductInfo(String productId) {
		String sql = "SELECT * FROM LENOVO.PRODUCT_INFO WHERE PRODUCT_ID = ?";
		Product proudct = jdbcTemplate.queryForObject(sql, new Object[]{productId}, new ProductMapper());
		return proudct;
	}

	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

}

package org.javadude.product;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProductJDBCTemplate {

	protected DataSource dataSource;
	protected JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	
	
	
	
	
	
}

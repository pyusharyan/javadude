package org.javadude.trade.base;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class TradeBaseDao {

	protected NamedParameterJdbcTemplate jdbcTemplate;
	protected DataSource dataSource;
	
	public TradeBaseDao() {
		jdbcTemplate = null;
		dataSource = null;
	}

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		this.dataSource = dataSource;
	}

	
	
	
	
	
}

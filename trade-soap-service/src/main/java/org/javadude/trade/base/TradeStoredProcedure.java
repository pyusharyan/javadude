package org.javadude.trade.base;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

public class TradeStoredProcedure extends StoredProcedure {

	@SuppressWarnings("unused")
	private DataSource dataSource;
	@SuppressWarnings("unused")
	private List<SqlParameter> declaredParameters;
	@SuppressWarnings("unused")
	private RowMapper rowMapper;
	@SuppressWarnings("unused")
	private String strProcName;
	
	public TradeStoredProcedure(DataSource dataSource,String strProcName,
			List<SqlParameter> declaredParameters, RowMapper rowMapper) {

		setDataSource(dataSource);
		this.declaredParameters = declaredParameters;
		this.rowMapper = rowMapper;
		this.strProcName = strProcName;
		
		if(rowMapper != null){
			declareParameter(new SqlReturnResultSet("RESULTSET", rowMapper));
		}
		
		if(declaredParameters != null){
			for(SqlParameter sqlParam : declaredParameters)
				declareParameter(sqlParam);
		}
		setSql(strProcName);
		compile();
	}
	
	
}

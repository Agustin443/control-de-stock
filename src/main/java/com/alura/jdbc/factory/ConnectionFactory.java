package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	private DataSource datasource;
	
	public ConnectionFactory() {
		var pooledDataSouce = new ComboPooledDataSource();
		pooledDataSouce.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
		pooledDataSouce.setUser("root");
		pooledDataSouce.setPassword("Nomeacuerdo1");
		
		this.datasource = pooledDataSouce;
	}
	
	public Connection recuperaConexion() throws SQLException{
		
		return this.datasource.getConnection();
                
	}
}

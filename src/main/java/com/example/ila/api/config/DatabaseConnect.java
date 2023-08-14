package com.example.ila.api.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.example.ila.api.config")
public class DatabaseConnect {
	private static final String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=coffee_sem4;"
            + "encrypt=true;trustServerCertificate=true";
    private static final String username = "sa";
    private static final String password = "123";
	//
	private static DatabaseConnect instance = null;
	//
	public static DatabaseConnect getInstance() {
		if (instance == null) {
			instance = new DatabaseConnect();
		}
		return instance;
	}

	public DataSource dbDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		try {
			dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			dataSource.setUrl(dbURL);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Return DataSource");
		}

		return dataSource;
	}
}

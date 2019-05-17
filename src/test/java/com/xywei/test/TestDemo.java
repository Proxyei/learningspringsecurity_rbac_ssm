package com.xywei.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.xywei.service.TestService;

public class TestDemo extends TestUnit {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTempate;

	@Autowired
	private TestService testService;

	@Autowired
	private DataSourceTransactionManager transactionManager;

	@Test
	public void test1() {

		System.err.println("datasource" + dataSource == null);
		try {
			System.err.println("datasource getConnection " + (dataSource.getConnection())==null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.err.println("jdbcTempate" + jdbcTempate == null);

	}

	@Test
	public void test2() {
		System.err.println("testService" + testService == null);
		if (testService != null) {
			testService.test();
		}
	}

	@Test
	public void testDataSourceTransactionManager() {
		System.out.println("DataSourceTransactionManager======" + transactionManager == null);
		System.out.println("DataSourceTransactionManager======" + transactionManager);
	}

}

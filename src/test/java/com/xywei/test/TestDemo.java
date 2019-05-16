package com.xywei.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xywei.service.TestService;

public class TestDemo extends TestUnit {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTempate;

	@Autowired
	private TestService testService;

	@Test
	public void test1() {

		System.err.println("datasource" + dataSource == null);
		System.err.println("jdbcTempate" + jdbcTempate == null);

	}

	@Test
	public void test2() {
		System.err.println("testService" + testService == null);
		if (testService != null) {
			testService.test();
		}
	}

}

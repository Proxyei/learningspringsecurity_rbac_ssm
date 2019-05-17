package com.xywei.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xywei.dao.TestDao;

@Repository
public class TestDaoImpl implements TestDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void test() {
		System.out.println("testdaoimpl" + jdbcTemplate == null);

	}

}

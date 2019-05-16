package com.xywei.dao.impl;

import org.springframework.stereotype.Repository;

import com.xywei.dao.TestDao;

@Repository
public class TestDaoImpl implements TestDao {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	@Override
	public void test() {
		System.out.println("testdaoimpl" +  null);

	}

}

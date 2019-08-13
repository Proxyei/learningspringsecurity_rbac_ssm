package com.xywei.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xywei.domain.UserTest;
import com.xywei.mapper.UserTestMapper2;

public class TestUserTestMapper extends TestUnit {

	@Autowired
	private UserTestMapper2 userTestMapper;

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	@Test
	public void test1() {

		System.out.println(userTestMapper == null);

		List<UserTest> user = userTestMapper.getUserTest();

//		List<UserTest> users =  jdbcTemplate.query("select * from user_test", new RowMapper<UserTest>() {
//
//			@Override
//			public UserTest mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//				UserTest userTest = new UserTest();
//				userTest.setId(rs.getInt("id"));
//				userTest.setName(rs.getString("name"));
//
//				return userTest;
//			}
//
//		});
		System.out.println(user);

	}

}

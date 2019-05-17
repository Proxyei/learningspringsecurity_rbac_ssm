package com.xywei.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xywei.domain.UserTest;
import com.xywei.mapper.UserTestMapper;

public class TestUserTestMapper extends TestUnit {

	@Autowired
	private UserTestMapper userTestMapper;


//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	@Test
	public void test1() {

		 System.out.println(userTestMapper == null);
		
		 UserTest user = userTestMapper.getUserTest();
		

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

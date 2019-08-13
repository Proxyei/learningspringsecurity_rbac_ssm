package com.xywei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xywei.dao.TestDao;
import com.xywei.domain.UserTest;
import com.xywei.mapper.UserTestMapper2;
import com.xywei.service.TestService;

@Service
public class testServiceImpl implements TestService {

	@Autowired
	private TestDao testDaoImpl;

	@Autowired
	private UserTestMapper2 userTestMapper2;

	@Override
	public void test() {

		System.out.println("testServiceImpl==null" + testDaoImpl == null);

		if (null != testDaoImpl) {
			testDaoImpl.test();
		}

	}

	@Override
	public List<UserTest> getUserTest() {

		return userTestMapper2.getUserTest();
	}

}

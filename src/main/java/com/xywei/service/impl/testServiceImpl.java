package com.xywei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xywei.dao.TestDao;
import com.xywei.service.TestService;

@Service
public class testServiceImpl implements TestService {

	@Autowired
	private TestDao testDaoImpl;

	@Override
	public void test() {

		System.out.println("testServiceImpl==null" + testDaoImpl == null);

		if (null != testDaoImpl) {
			testDaoImpl.test();
		}

	}

}

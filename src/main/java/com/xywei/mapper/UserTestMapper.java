package com.xywei.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xywei.domain.UserTest;

public interface UserTestMapper {

	List<UserTest> getUserTest();
}

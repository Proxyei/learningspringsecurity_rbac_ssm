package com.xywei.mapper;

import java.util.List;

import com.xywei.domain.Permission;
import com.xywei.domain.User;

public interface UserMapper {

	User findUserByUsername(String username);

	List<Permission> findPermissionsByUsername(String username);

	void updateUserPassword(User user);
}

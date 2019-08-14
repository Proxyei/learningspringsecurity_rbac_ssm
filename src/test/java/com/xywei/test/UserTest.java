package com.xywei.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.xywei.domain.Permission;
import com.xywei.domain.User;
import com.xywei.mapper.UserMapper;

public class UserTest extends TestUnit {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testUser() {

		String username = "A";
		User user = userMapper.findUserByUsername(username);
		System.out.println("user>>>>>>>>>>>:" + user);

	}

	@Test
	public void testFindPermissionByUsername() {

		String username = "b";

		List<Permission> permissions = userMapper.findPermissionsByUsername(username);

		System.out.println(permissions);
		for (Permission permission : permissions) {
			System.out.println(
					permission.getPermissionName() + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>" + permission.getPermissionTag());
		}

	}

	@Test
	public void testUpdatePassword() {

		PasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("1"));

	}

}

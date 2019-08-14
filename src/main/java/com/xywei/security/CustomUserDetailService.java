package com.xywei.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.xywei.domain.Permission;
import com.xywei.domain.User;
import com.xywei.mapper.UserMapper;

public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userMapper.findUserByUsername(username);

		if (user != null) {

			List<Permission> permissions = userMapper.findPermissionsByUsername(username);

			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

			for (Permission permission : permissions) {

				GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getPermissionTag());
				authorities.add(grantedAuthority);
			}
			user.setAuthorities(authorities);

		}

		return user;
	}

}

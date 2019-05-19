package com.xywei.domain;

import java.io.Serializable;

public class UserTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4876333281609919547L;
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserTest [id=" + id + ", name=" + name + "]";
	}
}

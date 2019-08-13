package com.xywei.domain;

import java.io.Serializable;

public class Permission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4382811916197595256L;
	private Integer id;
	private String permissionName;
	private String permissionTag;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionTag() {
		return permissionTag;
	}

	public void setPermissionTag(String permissionTag) {
		this.permissionTag = permissionTag;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", permissionName=" + permissionName + ", permissionTag=" + permissionTag + "]";
	}

}

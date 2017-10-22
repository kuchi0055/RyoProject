package com.Easy3.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class UserInfoDto implements Serializable{

	private static final long serialVersionUID = 1L;

	public String userId;
	public String userName;
	public String empNmKanjiLastname;
	public String empNmKanjiName;
	public String userAuthority;

	public String getEmpNmKanjiName() {
		return empNmKanjiName;
	}

	public void setEmpNmKanjiName(String empNmKanjiName) {
		this.empNmKanjiName = empNmKanjiName;
	}

	public String getEmpNmKanjiLastname() {
		return empNmKanjiLastname;
	}

	public void setEmpNmKanjiLastname(String empNmKanjiLastname) {
		this.empNmKanjiLastname = empNmKanjiLastname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUserAuthority() {
		return userAuthority;
	}

	public void setUserAuthority(String userAuthority) {
		this.userAuthority = userAuthority;
	}
}

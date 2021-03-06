package com.Easy3.service;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;

import com.Easy3.dao.TEmployeeDatasDao;
import com.Easy3.dto.UserInfoDto;
import com.Easy3.entity.TEmployeeDatas;

public class LoginService {

	@Resource
	protected TEmployeeDatasDao tEmployeeDatasDao;

	@Resource
	protected UserInfoDto userInfoDto;

	public UserInfoDto getUserInfoDto() {
		return userInfoDto;
	}
	public void setUserInfoDto(UserInfoDto userInfoDto) {
		this.userInfoDto = userInfoDto;
	}

	public boolean login(String userId) {
		TEmployeeDatas tEmployeeDatas = tEmployeeDatasDao.getSelectTEmployeeDatas(userId);
        if(tEmployeeDatas == null){
            return false;
        }else{
            Beans.copy(tEmployeeDatas, userInfoDto).execute();
            return true;
        }
    }
    public boolean isLoginOK(){
        return userInfoDto.userId == null ? false : true;
    }

    public String logout(){
    	return "/SC0101/SC0101.jsp";
    }
}

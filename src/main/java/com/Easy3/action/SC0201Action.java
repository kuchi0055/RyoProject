package com.Easy3.action;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.Easy3.form.SC0201Form;
import com.Easy3.service.LoginService;


public class SC0201Action {

	@Resource
	@ActionForm
	protected SC0201Form sC0201Form;

	@Resource
	protected LoginService loginService;

//	@Resource
//	protected UserInfoDto userInfoDto;

    @Execute(validator = false)
    public String index(){
		return "SC0201.jsp";
	}

    @Execute(validator = false)
    public String SC0301(){
    	return "SC0301.jsp";
    }

    // ログアウト
    @Execute(validator = false)
    @RemoveSession(name = "UserInfoDto")
    public String logout(){
    	return loginService.logout();
    }
}

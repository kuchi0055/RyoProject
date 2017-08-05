package com.Easy3.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.Easy3.dto.UserInfoDto;
import com.Easy3.form.SC0201Form;


public class SC0201Action {

	@Resource
	@ActionForm
	protected SC0201Form sC0201Form;

//	@Resource
//	protected UserInfoDto userInfoDto;

    @Execute(validator = false)
    public String index(){
		return "SC0201.jsp";
	}

//    // ログアウト
//    @Execute(validator=false)
//    public String logout(){
//
//        // セッションを破棄
//    	userInfoDto.userId = null;
//
//        // ログイン画面へ戻る
//    	return "/?redirect=true";
//    }
}

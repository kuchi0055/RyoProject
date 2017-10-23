package com.Easy3.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.Easy3.form.SA0104Form;

public class SA0201Action {

	@ActionForm
	@Resource
	protected SA0104Form sA0104Form;

	@Execute(validator = false)
    public String index(){
		return "/SA0104/SA0104.jsp";
	}

	@Execute(validator = false,urlPattern="SA0104")
    public String showEventInput(){
		return "/SA0104/SA0104.jsp";
	}

    @Execute(validator = false)
	public String backMenu() {
    	return "/SC0201/SC0201.jsp";
	}
}

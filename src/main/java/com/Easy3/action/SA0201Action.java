package com.Easy3.action;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.Easy3.entity.TEmployeeDatas;
import com.Easy3.form.SA0104Form;
import com.Easy3.service.TEmployeeDatasService;

public class SA0201Action {

	@ActionForm
	@Resource
	protected SA0104Form sA0104Form;

	public TEmployeeDatasService tEmployeeDatasService;

	public String errorMsg;

	@Execute(validator = false)
    public String index(){
		return "/SA0104/SA0104.jsp";
	}

	@Execute(validator = false,urlPattern="SA0104")
    public String showEventInput(){

		ArrayList<TEmployeeDatas> userList = new ArrayList<TEmployeeDatas>();

		TEmployeeDatas[] tEmployeeDatasList = tEmployeeDatasService.findAll();
		for(TEmployeeDatas listdata : tEmployeeDatasList){
			userList.add(listdata);
		}
		// エラーメッセージはなし。
		errorMsg = "";

		sA0104Form.setUserList(userList);

		return "/SA0104/SA0104.jsp";
	}

    @Execute(validator = false)
	public String backMenu() {
    	return "/SC0201/SC0201.jsp";
	}
}

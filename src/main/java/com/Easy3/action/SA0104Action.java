package com.Easy3.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.Easy3.form.SA0104Form;

public class SA0104Action {

	@ActionForm
	@Resource
	protected SA0104Form sA0104Form;

	public SA0104Form getsA0104Form() {
		return sA0104Form;
	}

	public void setsA0104Form(SA0104Form sA0104Form) {
		this.sA0104Form = sA0104Form;
	}

	@Execute(validate = "validate", input = "SA0104.jsp")
	public String inputEvent(){
		return "SA0109.jsp";
	}
}

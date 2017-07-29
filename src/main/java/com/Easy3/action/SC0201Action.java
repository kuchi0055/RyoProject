package com.Easy3.action;

import javax.annotation.Resource;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import com.Easy3.form.SC0201Form;


public class SC0201Action {

	@Resource
	@ActionForm
	protected SC0201Form sC0201Form;

    @Execute(validator = false)
    public String index(){
		return "SC0201.jsp";
	}

    // 2017/7/29に追加する予定。
}

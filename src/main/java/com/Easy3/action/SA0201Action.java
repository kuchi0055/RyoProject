package com.Easy3.action;

import org.seasar.struts.annotation.Execute;

public class SA0201Action {

    @Execute(validator = false)
	public String backMenu() {
    	return "SC0201.jsp";
	}

}

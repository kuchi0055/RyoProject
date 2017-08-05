package com.Easy3.form;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.Required;


public class SC0101Form {

	@Required(arg0=@Arg(key="label.userId",resource=true))
	public String userId;

	@Required(arg0=@Arg(key="label.password",resource=true))
	public String password;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

//	public ActionMessages validateUserId(){
//		ActionMessages errors = new ActionMessages();
//
//		// ユーザーIDがnull または　空だった場合はエラー
//		if(userId == null || userId.equals("")){
//			errors.add(ActionMessages.GLOBAL_MESSAGE,
//					new ActionMessage("errors.invalid","AAAAA"));
//		}
//		return errors;
//	}
}

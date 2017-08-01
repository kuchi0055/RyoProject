package com.Easy3.Util;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;

import com.Easy3.dto.UserInfoDto;
import com.Easy3.service.LoginService;

public class LoginConfirmInterceptor extends AbstractInterceptor{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Resource
	protected LoginService loginService;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO 自動生成されたメソッド・ス
		// 両方の条件を満たしていない場合、Loginページへ飛ばす。
				return (!isExecuteMethod(invocation) || loginService.isLoginOK()) ? invocation.proceed() : "/login/";
	}

	/**
	 * 実行されたActionに@Executeがついていたかどうか。
	 * @param invocation
	 * @return アノテーションがついていればtrue
	 */
	private boolean isExecuteMethod(MethodInvocation invocation) {
		return invocation.getMethod().isAnnotationPresent(Execute.class);
	}

//	/**
//	 * セッション上にDtoがあるか、あった場合その中にuserIDは保持されているか。
//	 * @return 上記の条件を両方満たしていればtrue
//	 */
//	private boolean isLoggedIn() {
//		return (userInfoDto != null && userInfoDto.userId != null);
//	}
}

package com.Easy3.service;

import org.junit.runner.RunWith;
import org.seasar.framework.unit.S2Assert;
import org.seasar.framework.unit.Seasar2;

import com.Easy3.dto.UserInfoDto;

@RunWith(Seasar2.class)
public class LoginServiceTest{

	private LoginService loginService;

	protected void setUp() throws Exception {
		System.out.println("setup実行");
	}

	public void testisLoginOKOKMethod(){
		loginService.userInfoDto.userId = "00055";
		boolean result = loginService.isLoginOK();
		//実行結果と期待値を比較する
		S2Assert.assertEquals(result, true);
	}

	public void testisLoginOKNGMethod(){
		loginService.userInfoDto.userId = null;
		boolean result = loginService.isLoginOK();
		//実行結果と期待値を比較する
		S2Assert.assertEquals(result, false);
	}

	public void testLoginOKMethod(){
		boolean result = loginService.login("0001");
		//実行結果と期待値を比較する
		S2Assert.assertEquals(result, true);
	}

	public void testLoginNGMethod(){
		boolean result = loginService.login("0000");
		//実行結果と期待値を比較する
		S2Assert.assertEquals(result, false);
	}

	public void testgetUserInfoDtoMethod(){

		//実行結果と期待値を比較する
		S2Assert.assertEquals(new UserInfoDto().getClass(), loginService.getUserInfoDto().getClass());

	}

	public void testsetUserInfoDtoMethod(){

		UserInfoDto userInfoDto = new UserInfoDto();
		userInfoDto.setUserId("9999");
		loginService.setUserInfoDto(userInfoDto);

		String userId = loginService.getUserInfoDto().getUserId();
		//実行結果と期待値を比較する
		S2Assert.assertEquals("9999", userId);
	}

	// logoutテスト
	public void testlogoutMethod() {

		//テスト対象のメソッドを実行
		String result = loginService.logout();

		//実行結果と期待値を比較する
		S2Assert.assertEquals(result, "/SC0101/SC0101.jsp");
	}

	protected void tearDown() throws Exception {
		System.out.println("tearDown");
	}

}

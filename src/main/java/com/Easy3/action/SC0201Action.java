package com.Easy3.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.Easy3.entity.TEvent;
import com.Easy3.form.SA0201Form;
import com.Easy3.form.SC0201Form;
import com.Easy3.service.EventService;
import com.Easy3.service.LoginService;


public class SC0201Action {

	// イベント一覧情報
    public List<TEvent> eventDataList = null;
    // イベント一覧情報数
    public int eventCount;

	@Resource
	@ActionForm
	protected SC0201Form sC0201Form;

	@Resource
	@ActionForm
	protected SA0201Form sA0201Form;

	@Resource
	protected LoginService loginService;

	@Resource
	protected EventService eventService;

    @Execute(validator = false)
    public String index(){
		return "SC0201.jsp";
	}

    @Execute(validator = false)
    public String showEvent(){

        // セッション情報の取得
    	String userId = loginService.getUserInfoDto().userId;
        //String userName = loginService.getUserInfoDto().userName;
        String userAuthFlg = loginService.getUserInfoDto().getUserAuthority();

        // ユーザ権限"管理者"の場合
        if (userAuthFlg.equals(CommonEasyConstants.AUTHORITY_SUPER_USER)) {

            // 全てのイベント一覧の取得（イベント開催日時降順）
//            Query<T_Event> query = T_Event.find.orderBy(DESCEND_EVENTDATETIME);
//            datas = query.findList();
        	eventDataList = eventService.getAllEvent("desc");
        	eventCount = eventDataList.size();
        }
        // ユーザ権限"管理者"以外の場合
        else {
//
//            // 論理削除されていないイベント一覧の取得（イベント開催日時降順）
//            Query<T_Event> query = T_Event.find.where(WHERE_DELETEFLG).
//                                  setParameter(1, CommonEasyConstants.INDEX_FLAG_OFF).orderBy(DESCEND_EVENTDATETIME);
//            datas = query.findList();
        }

        // DBエラーの場合
        if (eventDataList == null) {

//            // エラーメッセージの取得
//            errMsg = FC0102.getMsg(CommonEasyConstants.MESSAGE_KEY_ER0002);
//            // ログ出力
//            FC0108.setLog(CommonEasyConstants.MESSAGE_KEY_ER0002, CommonEasyConstants.LOG_LEVEL_ERROR);
//
//            // イベント一覧画面を表示（DBエラー）
//            return ok(SA0201.render(userName, list ,list.size(), errMsg, userAuthFlg));

        	System.out.println("イベント一覧データの取得失敗！！！！！");
        }
//
//        // イベント管理情報テーブルの値を画面表示用に編集
//        list = SetData(userId, userAuthFlg, datas);
        eventService.SetData(userId, userAuthFlg, eventDataList);

        // イベント情報が0件の場合
        if (eventDataList.size() == 0) {

//            // エラーメッセージの取得
//            errMsg = FC0102.getMsg(CommonEasyConstants.MESSAGE_KEY_ER0003);
//            // ログ出力
//            FC0108.setLog(CommonEasyConstants.MESSAGE_KEY_ER0003, CommonEasyConstants.LOG_LEVEL_INFO);
//
//            // イベント一覧画面を表示（件数0件）
//            return ok(SA0201.render(userName, list ,list.size(), errMsg, userAuthFlg));
        	System.out.println("イベントは0件！！！！");

        }
//
//        // 終了メッセージ
//        FC0108.setLog(CommonEasyConstants.MESSAGE_KEY_CM0018, CommonEasyConstants.LOG_LEVEL_DEBUG);
//
//        // イベント一覧画面を表示（正常）
//        return ok(SA0201.render(userName, list ,list.size(), CommonEasyConstants.INDEX_BLANK, userAuthFlg));

    	// イベント一覧画面へ。
    	return "SA0201.jsp";
    }

    // ログアウト
    @Execute(validator = false)
    @RemoveSession(name = "UserInfoDto")
    public String logout(){
    	return loginService.logout();
    }
}

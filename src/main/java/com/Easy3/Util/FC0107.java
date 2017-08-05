package com.Easy3.Util;
/*
import models.T_Employee_Datas;
import models.T_Event;
import play.mvc.Controller;
import play.mvc.Security;

import com.avaje.ebean.Query;
*/
/**
 * イベントステータスを更新するクラス
 *
 * @version 1.0
 * @auther 和田 慎也
 */
public class FC0107/* extends Controller */{

    /** プレースホルダーの引数 */
//    private static final int INDEX1 = 1;
//    private static final int INDEX2 = 2;
//    private static final int INDEX3 = 3;

    /** イベントステータス */
//    private static final String EVENT_STATUS_0 = "0";
//    private static final String EVENT_STATUS_1 = "1";

    /** 空白文字 */
    private static final String KUHAKU = "  ";

    /** フラグオフの"0" */
//    private static final String FLAG_OFF = "0";
//
//    /** イベント管理情報取得SQL条件句 */
//    private static final String SQL_EVENT_1 = "event_datetime < ? AND eventStatus = ? AND delete_flg = ? ";
//
//    /** イベントID取得SQL条件句 */
//    private static final String SQL_EVENT_2 = "event_id = ? ";
//
//    /** ユーザ名取得SQL条件句 */
//    private static final String SQL_WHERE_3 = "user_id = ?";


//    /**
//     * イベントステータスの更新
//     *
//     */
//    @Security.Authenticated(FC0106.class)
//    public static void updateEvent()throws SQLException {
//
//        // 現在日付の取得
//        Calendar cal = Calendar.getInstance();
//        Date nowDate = cal.getTime();
//
//        // イベント管理情報取得処理(イベント開催日が過ぎたもの)
//        Query<T_Event> query = T_Event.find.where(SQL_EVENT_1).setParameter(INDEX1,nowDate).
//        		setParameter(INDEX2,EVENT_STATUS_0).setParameter(INDEX3,FLAG_OFF);
//        List<T_Event> datas = query.findList();
//
//        //イベント管理情報更新
//        updateEventStatus(datas);
//
//    }

//    /**
//    * イベント管理情報から取得したデータを編集します。
//    *
//    * @param <datas:取得データ>
//    */
//    private static void updateEventStatus(List<T_Event> datas){
//
//    	// 取得したデータ分繰り返し
//    	for(T_Event data : datas){
//
//	        // イベント管理情報から対象のものを取得
//	        Query<T_Event> query = T_Event.find.where(SQL_EVENT_2).setParameter(INDEX1, data.eventId);
//	        T_Event t_Event = query.findUnique();
//
//	        // イベントスタータスを開催済み("1")に更新
//	        t_Event.eventStatus = EVENT_STATUS_1;
//	        t_Event.updateUser = data.eventId;
//	        t_Event.update();
//
//        }
//
//    }

//    /**
//     * ユーザIDからユーザ名を取得する。
//     *
//     * @param <userid:ユーザID>
//     * @return <userName:ユーザ名>
//     */
//    public static String SetUserName(String userId) {
//
//        // ユーザー名の初期化
//        String userName = null;
//
//        // ユーザー一覧の取得
//        Query<T_Employee_Datas> query = T_Employee_Datas.find.where(SQL_WHERE_3).setParameter(INDEX1, userId);
//        List<T_Employee_Datas> datas = query.findList();
//        T_Employee_Datas t_user = datas.iterator().next();
//
//        // ユーザ名の取得
//        userName = FC0107.SetKanjiUserName(t_user.empNmKanjiLastname, t_user.empNmKanjiName);
//
//        // ユーザ名を返却
//        return userName;
//
//    }

    /**
     * 社員姓漢字と社員名漢字を連結する。
     *
     * @param <kanjiLastname:社員姓漢字>
     * @param <kanjiName:社員名漢字>
     * @return <KanjiUserName:ユーザ名>
     */
    public static String SetKanjiUserName(String kanjiLastname, String kanjiName) {

        // ユーザー名の初期化
        String KanjiUserName = null;

        // ユーザ名の連結
        KanjiUserName = kanjiLastname + KUHAKU + kanjiName;

        // ユーザ名を返却
        return KanjiUserName;
    }
}
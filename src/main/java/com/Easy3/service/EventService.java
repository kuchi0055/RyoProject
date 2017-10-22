package com.Easy3.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import com.Easy3.action.CommonEasyConstants;
import com.Easy3.dao.TEventDao;
import com.Easy3.dto.EventInfoDto;
import com.Easy3.entity.TEvent;

public class EventService {

    /** データNo */
    private static final String DATA_NO = "id";
    /** イベントID（DB項目） */
    private static final String EVENT_ID = "event_id";
    /** イベント名（DB項目） */
    private static final String EVENT_NAME = "event_name";
    /** イベント開催日時（DB項目） */
    private static final String EVENT_DATETIME = "event_datetime";
    /** イベントステータス（DB項目） */
    private static final String EVENT_STATUS = "event_status";
    /** イベント担当者ユーザ（DB項目） */
    private static final String EVENT_USER = "event_user";
    /** イベント公開フラグ（DB項目） */
    private static final String EVENT_BOSS = "event_boss";
    /** 画面表示名：イベント作成者 */
    //private static final String EVENT_CREATE_USER = "作成者／担当者";

	@Resource
	protected TEventDao tEventDao;

	@Resource
	protected EventInfoDto eventInfoDto;

    /** 画面送信情報格納リスト */
    public static ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();


	public List<TEvent> getAllEvent(String option) {
		List<TEvent> tEventList = tEventDao.getAllEvent(option);
		return tEventList;
    }

    /**
     * イベント管理情報から取得したデータを編集
     *
     * @param <userId:ユーザID>
     * @param <userAuthFlag:権限>
     * @param <datas:取得データ>
     * @return <list:編集後データ>
     */
    public void SetData(String loginUserId, String userAuthFlg,List<TEvent> datas) {

        // データ格納用マップ
        HashMap<String, Object> map = new HashMap<String, Object>();
        // 画面表示用No.カウント用変数
        int i = 1;

        try {
            // 件数分繰り返し
            for (TEvent data : datas) {

                // 各値の初期化
                map = new HashMap<String, Object>();
                String eventstatus = CommonEasyConstants.INDEX_BLANK;
                String eventUser = CommonEasyConstants.INDEX_BLANK;
                String eventBoss = CommonEasyConstants.INDEX_BLANK;

                // 権限"管理者"以外はイベントの表示可否をチェック
                if (!userAuthFlg.equals(CommonEasyConstants.AUTHORITY_SUPER_USER)) {

                    // 結果格納変数の初期化
                    Boolean checkResult = false;

                    // 権限"部課長"の場合、公開されたイベントであれば表示
                    if (userAuthFlg.equals(CommonEasyConstants.AUTHORITY_EVENT_MANAGE)
                        /*&& data.eventPublicFlg.equals(CommonEasyConstants.INDEX_FLAG_OFF)*/) {
                        checkResult = true;
                    }

                    // ここまでで条件満たせていない場合、有効な出欠情報が存在すれば表示
                    else {
//                        Query<T_Eventattendance> query = T_Eventattendance.find.where(WHERE_USERID_EVENTID_DELETEFLG).
//                                 setParameter(1, loginUserId).setParameter(2, data.eventId).
//                                 setParameter(3, CommonEasyConstants.INDEX_FLAG_OFF);
//                        List<T_Eventattendance> queryResult = query.findList();
//                        if (!queryResult.isEmpty()) {
//                            checkResult = true;
//                        }
                    }

                    // 表示条件を満たせない場合、後処理をスキップして次のレコードの処理へ
                    if (checkResult == false) {
                        continue;
                    }
                }

//                // イベントIDの取得（画面表示用に復号化）
//                String eventid = FC0105.getEnBase64(data.eventId);
                String eventid = data.eventId;

                // イベント名の取得
                String eventname = data.eventName;

                // イベント開催日時の取得（yyyy/MM/dd HH:mm:ss形式に編集）
                String year = data.eventDatetime.substring(0, 4);
                String mnth = data.eventDatetime.substring(5, 7);
                String day  = data.eventDatetime.substring(8, 10);
                String hour = data.eventDatetime.substring(11, 13);
                String mini = data.eventDatetime.substring(14, 16);
                String eventdatetime = year + CommonEasyConstants.HALF_SLASH + mnth + CommonEasyConstants.HALF_SLASH +
                                  day + CommonEasyConstants.HALF_SPACE + hour + CommonEasyConstants.HALF_COLON + mini;

                // イベントステータスの取得（区分値→表示名の変換）
                if (data.eventStatus.equals(CommonEasyConstants.EVENTSTATUS_WILL)) {
                    eventstatus = CommonEasyConstants.DISPNAME_EVENTSTATUS_WILL;
                }
                else if (data.eventStatus.equals(CommonEasyConstants.EVENTSTATUS_DONE)) {
                    eventstatus = CommonEasyConstants.DISPNAME_EVENTSTATUS_DONE;
                }
                else if (data.eventStatus.equals(CommonEasyConstants.EVENTSTATUS_CANCEL)) {
                    eventstatus = CommonEasyConstants.DISPNAME_EVENTSTATUS_CANCEL;
                }

//                // イベント担当状況を取得（権限"管理者"・作成者・担当者の場合に表示）
//                if (userAuthFlg.equals(CommonEasyConstants.AUTHORITY_SUPER_USER)
//                    || data.userId.equals(loginUserId) || data.eventResponsibleUser.equals(loginUserId)) {
//                    eventUser = EVENT_CREATE_USER;
//                }
//
//                // イベント公開フラグの取得（区分値→表示名の変換 権限"管理者"・作成者・担当者の場合に表示）
//                if (userAuthFlg.equals(CommonEasyConstants.AUTHORITY_SUPER_USER)
//                    || data.userId.equals(loginUserId) || data.eventResponsibleUser.equals(loginUserId)) {
//
//                	if (data.eventPublicFlg.equals(CommonEasyConstants.INDEX_FLAG_OFF)) {
//                        eventBoss = CommonEasyConstants.PRIVACY_FLAG_OFF;
//                    }
//                    else if (data.eventPublicFlg.equals(CommonEasyConstants.INDEX_FLAG_ON)) {
//                        eventBoss = CommonEasyConstants.PRIVACY_FLAG_ON;
//                    }
//                }

                // 取得データをマップに格納
                map.put(DATA_NO, i);
                map.put(EVENT_ID, eventid);
                map.put(EVENT_NAME, eventname);
                map.put(EVENT_DATETIME, eventdatetime);
                map.put(EVENT_STATUS, eventstatus);
                map.put(EVENT_USER, eventUser);
                map.put(EVENT_BOSS, eventBoss);

                // 画面表示用No.カウントアップ
                i++;
                // 画面送信情報格納リストにセット
                list.add(map);
            }
        }
        catch (Exception e) {

//            // ログ出力
//            FC0108.setLog(CommonEasyConstants.MESSAGE_KEY_ER0004, CommonEasyConstants.LOG_LEVEL_ERROR);
//            // 画面送信情報格納リストの初期化
//            list.clear();
        }
        // 取得結果を返却
        //return list;
    }

}

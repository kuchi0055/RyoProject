package com.Easy3.action;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;

import com.Easy3.Util.FC0105;
import com.Easy3.Util.FC0107;
import com.Easy3.dao.TEmployeeDatasDao;
import com.Easy3.dto.UserInfoDto;
import com.Easy3.entity.TEmployeeDatas;
import com.Easy3.form.SC0101Form;
import com.Easy3.service.LoginService;


public class SC0101Action {

    /** ブランク */
    private static final String INDEX_BLANK = "";

    /** エラーメッセージ */
    public static String errMsg = INDEX_BLANK;

    /** エラーメッセージ */
    public static String attendMsg = INDEX_BLANK;

    /** ユーザーIDの桁数を４に設定 */
    public static final Integer USERID_LENGHT  = 4;

    /** パスワード最大値の桁数 */
    public static final Integer PASSWORD_MAXLENGTH  = 64;

    /** パスワード最小値の桁数 */
    public static final Integer PASSWORD_MINLENGHT  = 8;

    public String userName;

    /** フラグオフの"0" */
//    private static final String FLAG_OFF = "0";
//
//    /** ユーザー情報チェックSQL条件句 */
//    private static final String SQL_USERID = "user_id = ?  and  delete_flg = ? ";
//
//    /** パスワード情報チェックSQL条件句 */
//    private static final String SQL_PASSWORD = "user_id = ?  and delete_flg = ? ";
//
//    /** イベント情報チェックSQL条件句 */
//    private static final String SQL_EVENT = "event_id = ?  and delete_flg = ? ";
//
//    /** プレースホルダーの引数 */
//    private static final int INDEX1 = 1;
//
//    /** プレースホルダーの引数 */
//    private static final int INDEX2 = 2;

    /** ログレベル */
//    private static final String ERROR = "ERROR";

    private static final String PATH = "com/Easy3/dao/TEmployeeDatasDao.dicon";

	@Resource
	@ActionForm
	protected SC0101Form sC0101Form;

	@Resource
	protected LoginService loginService;

	@Execute(validator = false)
    public String index(){
		return "SC0101.jsp";
	}

//    // ログイン画面表示
//    public static Result showLogin() {
//
//        // イベントID
//        String eventId = INDEX_BLANK;
//        attendMsg=INDEX_BLANK;
//
//        // GETパラメータ(eventId)をリクエストから取得
//        String[] params = {"user"};
//        DynamicForm input = Form.form();
//        input = input.bindFromRequest(params);
//        String eventIdEncryption = input.data().get("eventId");
//
//        // イベントIDの復号化
//        // イベントIDが設定されている場合（メールのURLから遷移した場合）
//        if (eventIdEncryption != null && !eventIdEncryption.equals(INDEX_BLANK)) {
//
//                // イベントIDを複合化する。
//                eventId = FC0105.getDecBase64(eventIdEncryption);
//
//                // メールから遷移した場合はメッセージを設定
//                attendMsg = FC0102.getMsg("CM0014");
//        }
//
//        // GETパラメータ(eventId)がないときのNullPointer対応
//        if (eventId == null) {
//
//            // ブランクを設定
//            eventId = INDEX_BLANK;
//        }
//
//        // イベント出欠画面で使用するため、セッションに登録する。
//        session("eventId", eventId);
//
//        // 次画面へ遷移
//        return ok(SC0101.render(INDEX_BLANK,INDEX_BLANK,INDEX_BLANK,attendMsg));
//    }

    // ログイン判定
    @Execute(validator=true,input="SC0101.jsp")
    public String selectMenu() throws SQLException, NoSuchAlgorithmException {

//        // GETパラメータを取得
//        String[] params = {"user"};
//        DynamicForm input = Form.form();
//        input = input.bindFromRequest(params);
//        attendMsg = INDEX_BLANK;
//
//        ///イベントID/パスワード/ユーザIDを取得
//        String userId = input.data().get("userId");
//        String password = input.data().get("password");
//        String eventId = session("eventId");
//
//        // GETパラメータ(eventId)がないときのNullPointer対応
//        if (eventId == null) {
//
//            // ブランクを設定
//            eventId = INDEX_BLANK;
//        }
//
//        // 入力チェック
//        if (!checkUserIdPassword(userId, password)) {
//
//            // メールから遷移した場合はメッセージを設定
//            if (!eventId.equals(INDEX_BLANK)) {
//
//                // メッセージを取得
//                attendMsg = FC0102.getMsg("CM0014");
//            }
//
//            // エラーメッセージを返却
//            return ok(SC0101.render(errMsg, userId, password, attendMsg));
//        }
//
        // DBに接続し、IDとパスワードが存在するかどうかを確認 *（userAuthorityFlag）を追記
    	//TEmployeeDatas userInfo = selectUserId(sC0101Form.getUserId(), sC0101Form.getPassword());
    	if(loginService.login(sC0101Form.getUserId())){
    		//return "index?redirect=true";
    	}else{
    		throw new ActionMessagesException("DBに登録されていない", false);
    	}

//        // ユーザ管理情報の取得に失敗した場合（エラー有り）
//        if (!errMsg.isEmpty()) {
//
//            // メールから遷移した場合はメッセージを設定
//            if (!eventId.equals(INDEX_BLANK)) {
//
//                // メッセージを取得
//                attendMsg = FC0102.getMsg("CM0014");
//            }
//
//            // エラーメッセージを返却
//            return ok(SC0101.render(errMsg, userId, password, attendMsg));
//        }
//
        String username = FC0107.SetKanjiUserName(loginService.getUserInfoDto().empNmKanjiLastname,
        		loginService.getUserInfoDto().empNmKanjiName);
        loginService.getUserInfoDto().setUserName(username);

        // Sessionにユーザー情報を格納
//        session("userId", userId);
//        session("userName", username);
//        session("userFlag", userInfo.listIterator().next().userAuthority);


        // セッションタイムアウトの設定
//        FC0106.loginSessionTimeOut(username);
//
//        // ユーザーのパスワードが変更されているかどうかチェック
//        if (!checkUserPasswordChange(userId)) {
//
//            // 画面遷移先の制御に使用する情報を格納
//            session("passwordStatus", "noChange");
//
//            // 1度も変更されていないため、パスワード変更画面へ遷移
//            return FA0107.showFirstPasswordInput();
//        }
//
//        // 各画面に遷移
//        // URLパラメータなしの場合は、イベント確認画面遷移
//        if (eventId == null || eventId.trim().equals(attendMsg)) {
//
//            // 統合メニュー画面へ遷移
//            return FC0201.showMenu();
//        }
//
//        // GETパラメータがイベントIDかどうかチェック
//        // イベントIDでなかった場合、不正アクセスとしてエラー文言を表示
//        if (!checkEventId(eventId)) {
//
//            //メールから遷移した場合はメッセージを設定
//            if (!eventId.equals(INDEX_BLANK)) {
//
//                // メッセージを取得
//                attendMsg = FC0102.getMsg("CM0014");
//            }
//
//            // 不正アクセス
//            return ok(SC0101.render(errMsg, userId, password, attendMsg));
//        }
//
//        // SessionにイベントIDを格納
//        session("eventId", eventId);
//
//        // 出欠回答画面へ遷移
//        return FU0101.showAnswerInput();

    	// 一旦統合メニュー画面へ遷移
    	return "SC0201.jsp";
    }


//    /**
//     * 入力チェック処理.
//     * @param <inputUserid:入力ユーザID>
//     * @param <inputPassword:入力パスワード>
//     * @return <true/false>
//     * @throws IOException
//     */
//     private static Boolean checkUserIdPassword (String inputUserid, String inputPassword){
//
//         // ユーザIDとパスワードの空白を削除
//         String userid = inputUserid.trim();
//         String password = inputPassword.trim();
//
//         // エラーメッセージ初期化
//         errMsg = INDEX_BLANK;
//
//         // 入力チェック(ユーザID/パスワード)
//         if ((userid == null || userid.equals(INDEX_BLANK)) && (password == null || password.trim().equals(INDEX_BLANK))) {
//
//             // メッセージ出力機能呼び出し
//             errMsg = FC0102.getMsg("CM0003");
//
//             // ログ出力機能呼び出し
//             FC0108.setLog("CM0003", ERROR);
//             return false;
//
//         // 入力チェック(ユーザID)
//         } else if (userid == null || userid.equals(INDEX_BLANK)) {
//
//             // メッセージ出力機能呼び出し
//             errMsg = FC0102.getMsg("CM0004");
//
//             // ログ出力機能呼び出し
//             FC0108.setLog("CM0004", ERROR);
//
//             return false;
//
//         // 入力チェック(パスワード)
//         } else if (password == null || password.trim().equals(INDEX_BLANK)) {
//
//             // メッセージ出力機能呼び出し
//             errMsg = FC0102.getMsg("CM0005");
//
//             // ログ出力機能呼び出し
//             FC0108.setLog("CM0005", ERROR);
//
//             return false;
//         }
//
//         // 入力桁数チェック（ユーザID）
//         if (userid.length() != USERID_LENGHT) {
//
//             // メッセージ出力機能呼び出し
//             errMsg = FC0102.getMsg("CM0013");
//
//             // ログ出力機能呼び出し
//             FC0108.setLog("CM0012", ERROR);
//
//             return false;
//         }
//
//         // 入力最大桁数チェック（パスワード）
//         if (password.length() > PASSWORD_MAXLENGTH) {
//
//             // メッセージ出力機能呼び出し
//             errMsg = FC0102.getMsg("CM0013");
//
//             // ログ出力機能呼び出し
//             FC0108.setLog("CM0007", ERROR);
//
//             return false;
//         }
//
//         // 入力最小桁数チェック（パスワード）
//         if (password.length() < PASSWORD_MINLENGHT) {
//
//             // メッセージ出力機能呼び出し
//             errMsg = FC0102.getMsg("CM0013");
//
//             // ログ出力機能呼び出し
//             FC0108.setLog("CM0011", ERROR);
//
//             return false;
//         }
//
//         // 属性チェック（ユーザID）
//         if (!userid.matches("[0-9a-zA-Z]+")) {
//
//             // メッセージ出力機能呼び出し
//             errMsg = FC0102.getMsg("CM0013");
//
//             // ログ出力機能呼び出し
//             FC0108.setLog("CM0008", ERROR);
//
//             return false;
//         }
//
//         // 属性チェック（パスワード）
//         if (!password.matches("[0-9a-zA-Z]+")) {
//
//             // メッセージ出力機能呼び出し
//             errMsg = FC0102.getMsg("CM0013");
//
//             // ログ出力機能呼び出し
//             FC0108.setLog("CM0009", ERROR);
//
//             return false;
//         }
//
//         return true;
//     }
//
//
//     /**
//      * 入力パスワードのチェックするメソッドです。
//      * 入力したパスワードを暗号化して登録されているパスワードと一致するが確認する。
//      *
//      * @param userId ユーザID
//      *        password パスワード
//      * @return ユーザ情報(datas)
//      */
//     private static TEmployeeDatas selectUserId(String userId, String password) throws NoSuchAlgorithmException {
//
//    	 // ログインユーザーチェック
// 		S2Container container = S2ContainerFactory.create(PATH);
// 		container.init();
//// 		TEmployeeDatasDao dao = (TEmployeeDatasDao) container.getComponent(TEmployeeDatasDao.class);
////		TEmployeeDatas tEmployeeDatas = dao.getSelectTEmployeeDatas(userId);
//
////    	 Query<T_Employee_Datas> query = T_Employee_Datas.find.where(SQL_USERID).setParameter(INDEX1,userId).setParameter(INDEX2,FLAG_OFF);
////    	 List<T_Employee_Datas> datas = query.findList();
//
//
//
//
////    	 // ユーザ情報が存在しない場合
////    	 if (tEmployeeDatas == null) {
//
////    		 // メッセージ出力機能呼び出し
////    		 errMsg = FC0102.getMsg("CM0013");
////
////    		 // ログ出力機能呼び出し
////    		 FC0108.setLog("CM0013", ERROR);
////
//    		 throw new ActionMessagesException("DBに登録されていない", false);
//
//    		 //return tEmployeeDatas;
////    	 }
//
//    	 // 入力されたパスワードを暗号化して、DBに格納されているPWを比較する。
//    	 // 取得したユーザ情報
////    	 T_Employee_Datas t_user = datas.iterator().next();
//
//    	 // パスワードの暗号化
////    	 String cryptPassword = getCryptPassword(password);z
//
////    	 // 入力パスワードとDBのパスワードを比較
////    	 if (!cryptPassword.equals(tEmployeeDatas.encryptionPassword)) {
//
////    		 // メッセージ出力機能呼び出し
////    		 errMsg = FC0102.getMsg("CM0013");
////
////    		 // ログ出力機能呼び出し
////    		 FC0108.setLog("CM0013", ERROR);
////
////    		 // ユーザ情報を返却
////    		 return datas;
////    	 }
//
//    	 // ユーザ情報を返却
//    	 return tEmployeeDatas;
//     }
//
//
//    /**
//     * パスワードの変更チェックするメソッドです。
//     *
//     * @param userId ユーザID
//     * @return チェックフラグ(true/false)
//     */
//    private static boolean checkUserPasswordChange(String userId) {
//
//        // ログインユーザーチェック
//        Query<T_Employee_Datas> query = T_Employee_Datas.find.where(SQL_PASSWORD).setParameter(INDEX1,userId).setParameter(INDEX2,FLAG_OFF);
//        List<T_Employee_Datas> datas = query.findList();
//
//        // ユーザ情報が存在しない場合
//        if (datas.isEmpty()) {
//
//            // チェックNG
//            return false;
//        }
//
//        // 取得したユーザ情報
//        T_Employee_Datas t_user = datas.iterator().next();
//
//        // パスワード変更フラグが未変更（"0"'）の場合
//        if (t_user.passwordChangeFlag == null || t_user.passwordChangeFlag.equals(FLAG_OFF)) {
//
//            //未変更
//            return false;
//        }
//
//        return true;
//    }
//
//
//    /**
//     * イベントIDをチェックするメソッドです.
//     *
//     * @param eventId イベントID
//     * @return チェックフラグ(true/false)
//     */
//    private static boolean checkEventId(String eventId) {
//
//        Query<T_Event> query = T_Event.find.where(SQL_EVENT).setParameter(INDEX1, eventId).setParameter(INDEX2,FLAG_OFF);
//        List<T_Event> datas = query.findList();
//
//        // イベント情報の取得なし
//        if (datas.isEmpty()) {
//
//             // メッセージ出力機能呼び出し
//             errMsg = FC0102.getMsg("CM0002");
//
//             // ログ出力機能呼び出し
//             FC0108.setLog("CM0002", ERROR);
//
//            return false;
//        }
//
//        return true;
//    }
//
//
//     // ログアウト
//     @Execute(validator=false)
//     public String logout(){
//
//         // セッションを破棄
//     	userInfoDto.userId = null;
//
//         // ログイン画面へ戻る
//     	return "/?redirect=true";
//     }

    /**
     * @param password
     * @return 暗号化パスワード
     * @throws NoSuchAlgorithmException
     *
     */
    public static String getCryptPassword(String password) throws NoSuchAlgorithmException {

        // パスワードのハッシュ化
        String encPassword = FC0105.getEnSHA1(password);

        // ハッシュしたパスワードを返却
        return encPassword;
    }

}

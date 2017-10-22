package com.Easy3.action;
/**
 * システム内部で使用する共通定数クラスです.
 *
 * @vesion 1.0
 * @since 2015/07/17
 * @author Noboru Harada
 * @author Yuta Katakura
 */
public class CommonEasyConstants {

    /** 共通定数：空文字 */
    public static final String INDEX_BLANK = "";

    /** 共通定数：SQLのプレースホルダー1 */
    public static final int INDEX_PLACE_1 = 1;

    /** 共通定数：SQLのプレースホルダー2 */
    public static final int INDEX_PLACE_2 = 2;

    /** 共通定数：SQLのプレースホルダー3 */
    public static final int INDEX_PLACE_3 = 3;

    /** 共通定数：半角スペース */
    public static final String HALF_SPACE = " ";

    /** 共通定数：全角スペース */
    public static final String FULL_SPACE = "　";

    /** 共通定数：半角スラッシュ */
    public static final String HALF_SLASH = "/";

    /** 共通定数：半角コロン */
    public static final String HALF_COLON = ":";

    /** 共通定数：フラグオフの"0" */
    public static final String INDEX_FLAG_OFF = "0";

    /** 共通定数：フラグオンの"1" */
    public static final String INDEX_FLAG_ON = "1";

    /** 共通定数：イベントステータス区分値(開催予定) */
    public static final String EVENTSTATUS_WILL = "0";

    /** 共通定数：イベントステータス区分値(開催済み) */
    public static final String EVENTSTATUS_DONE = "1";

    /** 共通定数：イベントステータス区分値(中止) */
    public static final String EVENTSTATUS_CANCEL = "2";

    /** 共通定数：イベントステータス表示名(開催予定) */
    public static final String DISPNAME_EVENTSTATUS_WILL = "開催予定";

    /** 共通定数：イベントステータス表示名(開催済み) */
    public static final String DISPNAME_EVENTSTATUS_DONE = "開催済み";

    /** 共通定数：イベントステータス表示名(中止) */
    public static final String DISPNAME_EVENTSTATUS_CANCEL = "中止";

    /** 共通定数：出欠ステータス"0"(未回答) */
    public static final String ATTEND_STATUS_CD0 = "0";

    /** 共通定数：出欠ステータス"1"(欠席) */
    public static final String ATTEND_STATUS_CD1 = "1";

    /** 共通定数：出欠ステータス"2"(出席) */
    public static final String ATTEND_STATUS_CD2 = "2";

    /** 共通定数：文字キャラクターチェック"半角数字" */
    public static final String CHAR_TYPE_HALF_NUM = "^[0-9]+$";

    /** 共通定数：文字キャラクターチェック"半角英数" */
    public static final String CHAR_TYPE_HALF = "[0-9a-zA-Z]+$";

    /** 共通定数：文字キャラクターチェック"全角文字" */
    public static final String CHAR_TYPE_FULL = "^[^ -~｡-ﾟ]+$";

    /** 共通定数：文字キャラクターチェック"全角カナ" */
    public static final String CHAR_TYPE_FULL_KANA = "^[ァ-ヶ]+$";

    /** 共通定数：文字キャラクターチェック"メールアドレスフォーマット */
    public static final String CHAR_TYPE_MAIL = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";

    /** 共通定数：POPのアドレス. */
    public static final String POP = "wiss1.co.jp";

    /** 共通定数：SMTPアドレス */
    public static final String SMTP_ADDRESS = "smtp.wiss1.co.jp";

    /** 共通定数：SMTPポート. */
    public static final int SMTP_PORT = 587;

    /** 共通定数：SMTPID */
    public static final String SMTP_ID = "easy";

    /** 共通定数：SMTPパスワード */
    public static final String SMTP_PASSWORD = "easy_Web2014";

    /** 共通定数：セッションキーの"errMsg" */
    public static final String SESSION_KEY_ERRORMESSAGE = "errMsg";

    /** 共通定数：セッションキーの"userId" */
    public static final String SESSION_KEY_USERID = "userId";

    /** 共通定数：セッションキーの"userName" */
    public static final String SESSION_KEY_USERNAME = "userName";

    /** 共通定数：セッションキーの"userFlag" */
    public static final String SESSION_KEY_USERFLAG = "userFlag";

    /** 共通定数：セッションキーの"password" */
    public static final String SESSION_KEY_PASSWORD = "password";

    /** 共通定数：セッションキーの"eventId" */
    public static final String SESSION_KEY_EVENTID = "eventId";

    /** 共通定数：セッションキーの"eventName" */
    public static final String SESSION_KEY_EVENTNAME = "eventName";

    /** 共通定数：セッションキーの"eventDateTime */
    public static final String SESSION_KEY_EVENTDATETIME = "eventDateTime";

    /** 共通定数：セッションキーの"eventPlace" */
    public static final String SESSION_KEY_EVENTPLACE = "eventPlace";

    /** 共通定数：セッションキーの"eventSummary */
    public static final String SESSION_KEY_EVENTSUMMARY = "eventSummary";

    /** 共通定数：セッションキーの"eventPersonnel" */
    public static final String SESSION_KEY_EVENTPERSONNEL = "eventPersonnel";

    /** 共通定数：セッションキーの"attendanceDeadlineDatetime" */
    public static final String SESSION_KEY_ATTENDANCEDEADLINEDATETIME = "attendanceDeadlineDatetime";

    /** 共通定数：セッションキーの"registUserId" */
    public static final String SESSION_KEY_REGIST_USERID = "registUserId";

    /** 共通定数：セッションキーの"registUserName" */
    public static final String SESSION_KEY_REGIST_USERNAME = "registUserName";

    /** 共通定数：セッションキーの"registUserNameKana" */
    public static final String SESSION_KEY_REGIST_USERNAMEKANA = "registUserNameKana";

    /** 共通定数：セッションキーの"registUserNameKana" */
    public static final String SESSION_KEY_REGIST_MAILADDRESS = "registMailAddress";

    /** 共通定数：セッションキーの"registTelephoneNumber" */
    public static final String SESSION_KEY_REGIST_BIRTHDATE = "registBirthDate";

    /** 共通定数：セッションキーの"registTelephoneNumber" */
    public static final String SESSION_KEY_REGIST_TELEPHONENUNBER = "registTelephoneNumber";

    /** 共通定数：セッションキーの"registFamilyName" */
    public static final String SESSION_KEY_REGIST_FAMILYNAME = "registFamilyName";

    /** 共通定数：セッションキーの"registFirstName" */
    public static final String SESSION_KEY_REGIST_FIRSTNAME = "registFirstName";

    /** 共通定数：セッションキーの"registFamilyNameKana" */
    public static final String SESSION_KEY_REGIST_FAMILYNAME_KANA = "registFamilyNameKana";

    /** 共通定数：セッションキーの"registFirstName" */
    public static final String SESSION_KEY_REGIST_FIRSTNAME_KANA = "registFirstNameKana";

    /** 共通定数：セッションキーの"registGender" */
    public static final String SESSION_KEY_REGIST_GENDER = "registGender";

    /** 共通定数：セッションキーの"registbirthday" */
    public static final String SESSION_KEY_REGIST_BIRTHDAY = "registbirthday";

    /** 共通定数：セッションキーの"registjoindeDate" */
    public static final String SESSION_KEY_REGIST_JOINDEDATE = "registjoindeDate";

    /** 共通定数：セッションキーの"registbloodType" */
    public static final String SESSION_KEY_REGIST_BLOODTYPE = "registbloodType";

    /** 共通定数：セッションキーの"registmailAddress1" */
    public static final String SESSION_KEY_REGIST_MAILADDRESS1 = "registmailAddress1";

    /** 共通定数：セッションキーの"registmailAddress1" */
    public static final String SESSION_KEY_REGIST_MAILADDRESS2 = "registmailAddress2";

    /** 共通定数：セッションキーの"registtelephone1" */
    public static final String SESSION_KEY_REGIST_TELEPHONE1 = "registtelephone1";

    /** 共通定数：セッションキーの"registtelephone1" */
    public static final String SESSION_KEY_REGIST_TELEPHONE2 = "registtelephone2";

    /** 共通定数：セッションキーの"registzipCode" */
    public static final String SESSION_KEY_REGIST_ZIPCODE = "registzipCode";

    /** 共通定数：セッションキーの"registaddress" */
    public static final String SESSION_KEY_REGIST_ADDRESS = "registaddress";

    /** 共通定数：セッションキーの"registpostCode" */
    public static final String SESSION_KEY_REGIST_POSTCODE = "registpostCode";

    /** 共通定数：セッションキーの"registunitCode" */
    public static final String SESSION_KEY_REGIST_UNITCODE = "registunitCode";

    /** 共通定数：セッションキーの"registdivisionCode" */
    public static final String SESSION_KEY_REGIST_DIVISIONCODE = "registdivisionCode";

    /** 共通定数：セッションキーの"registbossFlg" */
    public static final String SESSION_KEY_REGIST_BOSSFLG = "registbossFlg";

    /** 共通定数：セッションキーの"masterList" */
    public static final String SESSION_KEY_MASTERLIST = "masterList";

    /** 共通定数：セッションキーの"codeId" */
    public static final String SESSION_KEY_CODE_ID = "codeId";

    /** 共通定数：セッションキーの"codeName" */
    public static final String SESSION_KEY_CODE_NAME = "codeName";

    /** 共通定数：セッション情報  氏名姓漢字 */
    public static final String SESSION_KEY_FAMILY_NAME = "empNmKanjiLastname";

    /** 共通定数：セッション情報  氏名名漢字 */
    public static final String SESSION_KEY_FIRST_NAME = "empNmKanjiName";

    /** 共通定数：セッション情報  メアド１ */
    public static final String SESSION_KEY_MAIL_ADDRESS_1 = "mailAddress1";

    /** 共通定数：セッション情報  メアド２ */
    public static final String SESSION_KEY_MAIL_ADDRESS_2 = "mailAddress2";

    /** 共通定数：セッション情報  端末識別情報 */
    public static final String SESSION_KEY_TERMIDENTIFICATION = "termIdentiFication";

    /** 共通定数：セッション情報  氏名姓カナ */
    public static final String SESSION_KEY_FAMILY_NAME_KANA = "empNmKanaLasyname";

    /** 共通定数：セッション情報  氏名名カナ */
    public static final String SESSION_KEY_FIRST_NAME_KANA = "empNmKanaName";

    /** 共通定数：セッション情報  生年月日 */
    public static final String SESSION_KEY_BIRTHDAY = "dateOfBirth";

    /** 共通定数：セッション情報  生年月日フラグ */
    public static final String SESSION_KEY_BIRTHDAYFLG = "dateOfBirthflg";

    /** 共通定数：セッション情報  入社年月日 */
    public static final String SESSION_KEY_JOINED_DATE = "joinedDate";

    /** 共通定数：セッション情報  性別 */
    public static final String SESSION_KEY_GENDER = "gender";

    /** 共通定数：セッション情報  血液型 */
    public static final String SESSION_KEY_BLOOD_TYPE = "bloodType";

    /** 共通定数：セッション情報  電話番号1 */
    public static final String SESSION_KEY_TELEPFONE_1 = "tel1";

    /** 共通定数：セッション情報  電話番号2 */
    public static final String SESSION_KEY_TELEPFONE_2 = "tel2";

    /** 共通定数：セッション情報  電話番号1フラグ */
    public static final String SESSION_KEY_TELEPFONE_1FLG = "tel1flg";

    /** 共通定数：セッション情報  電話番号2フラグ */
    public static final String SESSION_KEY_TELEPFONE_2FLG = "tel2flg";

    /** 共通定数：セッション情報  郵便番号 */
    public static final String SESSION_KEY_ZIP_CODE = "zipCode";

    /** 共通定数：セッション情報  住所 */
    public static final String SESSION_KEY_ADDRESS = "address";

    /** 共通定数：セッション情報  住所フラグ */
    public static final String SESSION_KEY_ADDRESSFLG = "addressflg";

    /** 共通定数：セッション情報  郵便番号 */
    public static final String SESSION_KEY_POST_CODE = "postCode";

    /** 共通定数：セッション情報  最寄駅路線名 */
    public static final String SESSION_KEY_NEARESTLINE = "nearestline";

    /** 共通定数：セッション情報  最寄駅名 */
    public static final String SESSION_KEY_NEARESTNAME = "nearestname";

    /** 共通定数：セッション情報  会社 */
    public static final String SESSION_KEY_COMPANY_CODE = "companyCode";

    /** 共通定数：セッション情報  役職 */
    public static final String SESSION_KEY_DIVISION_CODE = "divisionCode";

    /** 共通定数：セッション情報  所属 */
    public static final String SESSION_KEY_USER_AUTHORITY = "userAuthority";

    /** 共通定数：セッション情報  所属 */
    public static final String SESSION_KEY_TELBOOK_PUBLICFLG = "telBookPublicFlg";

    /** 共通定数：セッションキーの"searchFlag" */
    public static final String SESSION_KEY_SEARCH_FLAG = "searchFlag";

    /** 共通定数：セッションキーの"searchCompanyCode" */
    public static final String SESSION_KEY_SEARCH_COMPANY_CD = "searchCompanyCode";

    /** 共通定数：ログレベルの"ERROR" */
    public static final String LOG_LEVEL_ERROR = "ERROR";

    /** 共通定数：ログレベルの"WARN" */
    public static final String LOG_LEVEL_WARN = "WARN";

    /** 共通定数：ログレベルの"DEBUG" */
    public static final String LOG_LEVEL_DEBUG = "DEBUG";

    /** 共通定数：ログレベルの"INFO" */
    public static final String LOG_LEVEL_INFO = "INFO";

    /** 共通定数：エラーメッセージキーの"CM0002" */
    public static final String MESSAGE_KEY_CM0002 = "CM0002";

    /** 共通定数：エラーメッセージキーの"CM0004" */
    public static final String MESSAGE_KEY_CM0004 = "CM0004";

    /** 共通定数：エラーメッセージキーの"CM0005" */
    public static final String MESSAGE_KEY_CM0005 = "CM0005";

    /** 共通定数：エラーメッセージキーの"CM0007" */
    public static final String MESSAGE_KEY_CM0007 = "CM0007";

    /** 共通定数：エラーメッセージキーの"CM0008" */
    public static final String MESSAGE_KEY_CM0008 = "CM0008";

    /** 共通定数：エラーメッセージキーの"CM0009" */
    public static final String MESSAGE_KEY_CM0009 = "CM0009";

    /** 共通定数：エラーメッセージキーの"CM0011" */
    public static final String MESSAGE_KEY_CM0011 = "CM0011";

    /** 共通定数：エラーメッセージキーの"CM0012" */
    public static final String MESSAGE_KEY_CM0012 = "CM0012";

    /** 共通定数：エラーメッセージキーの"CM0013" */
    public static final String MESSAGE_KEY_CM0013 = "CM0013";

    /** 共通定数：エラーメッセージキーの"CM0014" */
    public static final String MESSAGE_KEY_CM0014 = "CM0014";

    /** 共通定数：エラーメッセージキーの"CM0015" */
    public static final String MESSAGE_KEY_CM0015 = "CM0015";

    /** 共通定数：エラーメッセージキーの"CM0016" */
    public static final String MESSAGE_KEY_CM0016 = "CM0016";

    /** 共通定数：エラーメッセージキーの"CM0017" */
    public static final String MESSAGE_KEY_CM0017 = "CM0017";

    /** 共通定数：エラーメッセージキーの"CM0018" */
    public static final String MESSAGE_KEY_CM0018 = "CM0018";

    /** 共通定数：エラーメッセージキーの"ER0001" */
    public static final String MESSAGE_KEY_ER0001 = "ER0001";

    /** 共通定数：エラーメッセージキーの"ER0002" */
    public static final String MESSAGE_KEY_ER0002 = "ER0002";

    /** 共通定数：エラーメッセージキーの"ER0003" */
    public static final String MESSAGE_KEY_ER0003 = "ER0003";

    /** 共通定数：エラーメッセージキーの"ER0004" */
    public static final String MESSAGE_KEY_ER0004 = "ER0004";

    /** 共通定数：エラーメッセージキーの"ER0005" */
    public static final String MESSAGE_KEY_ER0005 = "ER0005";

    /** 共通定数：エラーメッセージキーの"ER0007" */
    public static final String MESSAGE_KEY_ER0007 = "ER0007";

    /** 共通定数：エラーメッセージキーの"ER0008" */
    public static final String MESSAGE_KEY_ER0008 = "ER0008";

    /** 共通定数：エラーメッセージキーの"ER0009" */
    public static final String MESSAGE_KEY_ER0009 = "ER0009";

    /** 共通定数：エラーメッセージキーの"ER0010" */
    public static final String MESSAGE_KEY_ER0010 = "ER0010";

    /** 共通定数：エラーメッセージキーの"ER0011" */
    public static final String MESSAGE_KEY_ER0011 = "ER0011";

    /** 共通定数：エラーメッセージキーの"ER0016" */
    public static final String MESSAGE_KEY_ER0016 = "ER0016";

    /** 共通定数：エラーメッセージキーの"ER0017" */
    public static final String MESSAGE_KEY_ER0017 = "ER0017";

    /** 共通定数：エラーメッセージキーの"ER0018" */
    public static final String MESSAGE_KEY_ER0018 = "ER0018";

    /** 共通定数：エラーメッセージキーの"RG0005" */
    public static final String MESSAGE_KEY_RG0005 = "RG0005";

    /** 共通定数：エラーメッセージキーの"RG0006" */
    public static final String MESSAGE_KEY_RG0006 = "RG0006";

    /** 共通定数：エラーメッセージキーの"RG0007" */
    public static final String MESSAGE_KEY_RG0007 = "RG0007";

    /** 共通定数：エラーメッセージキーの"RG0008" */
    public static final String MESSAGE_KEY_RG0008 = "RG0008";

    /** 共通定数：エラーメッセージキーの"RG0009" */
    public static final String MESSAGE_KEY_RG0009 = "RG0009";

    /** 共通定数：エラーメッセージキーの"RG0012" */
    public static final String MESSAGE_KEY_RG0012 = "RG0012";

    /** 共通定数：エラーメッセージキーの"RG0013" */
    public static final String MESSAGE_KEY_RG0013 = "RG0013";

    /** 共通定数：エラーメッセージキーの"RG0014 */
    public static final String MESSAGE_KEY_RG0014 = "RG0014";

    /** 共通定数：エラーメッセージキーの"RG0015 */
    public static final String MESSAGE_KEY_RG0015 = "RG0015";

    /** 共通定数：エラーメッセージキーの"RG0016 */
    public static final String MESSAGE_KEY_RG0016 = "RG0016";

    /** 共通定数：エラーメッセージキーの"RG0017" */
    public static final String MESSAGE_KEY_RG0017 = "RG0017";

    /** 共通定数：エラーメッセージキーの"RG0018" */
    public static final String MESSAGE_KEY_RG0018 = "RG0018";

    /** 共通定数：エラーメッセージキーの"RG0019" */
    public static final String MESSAGE_KEY_RG0019 = "RG0019";

    /** 共通定数：エラーメッセージキーの"RG0020" */
    public static final String MESSAGE_KEY_RG0020 = "RG0020";

    /** 共通定数：エラーメッセージキーの"RG0022" */
    public static final String MESSAGE_KEY_RG0022 = "RG0022";

    /** 共通定数：エラーメッセージキーの"RG0023" */
    public static final String MESSAGE_KEY_RG0023 = "RG0023";

    /** 共通定数：エラーメッセージキーの"RG0024" */
    public static final String MESSAGE_KEY_RG0024 = "RG0024";

    /** 共通定数：エラーメッセージキーの"RG0025" */
    public static final String MESSAGE_KEY_RG0025 = "RG0025";

    /** 共通定数：エラーメッセージキーの"RG0026" */
    public static final String MESSAGE_KEY_RG0026 = "RG0026";

    /** 共通定数：エラーメッセージキーの"RG0027" */
    public static final String MESSAGE_KEY_RG0027 = "RG0027";

    /** 共通定数：エラーメッセージキーの"RG0028" */
    public static final String MESSAGE_KEY_RG0028 = "RG0028";

    /** 共通定数：エラーメッセージキーの"RG0029" */
    public static final String MESSAGE_KEY_RG0029 = "RG0029";

    /** 共通定数：エラーメッセージキーの"RG0030" */
    public static final String MESSAGE_KEY_RG0030 = "RG0030";

    /** 共通定数：エラーメッセージキーの"RG0031" */
    public static final String MESSAGE_KEY_RG0031 = "RG0031";

    /** 共通定数：エラーメッセージキーの"RG0032" */
    public static final String MESSAGE_KEY_RG0032 = "RG0032";

    /** 共通定数：エラーメッセージキーの"RG0033" */
    public static final String MESSAGE_KEY_RG0033 = "RG0033";

    /** 共通定数：エラーメッセージキーの"RG0034" */
    public static final String MESSAGE_KEY_RG0034 = "RG0034";

    /** 共通定数：エラーメッセージキーの"RG0035" */
    public static final String MESSAGE_KEY_RG0035 = "RG0035";

    /** 共通定数：エラーメッセージキーの"RG0036" */
    public static final String MESSAGE_KEY_RG0036 = "RG0036";

    /** 共通定数：エラーメッセージキーの"RG0037" */
    public static final String MESSAGE_KEY_RG0037 = "RG0037";

    /** 共通定数：エラーメッセージキーの"RG0046" */
    public static final String MESSAGE_KEY_RG0046 = "RG0046";

    /** 共通定数：エラーメッセージキーの"RG0047" */
    public static final String MESSAGE_KEY_RG0047 = "RG0047";

    /** 共通定数：エラーメッセージキーの"RG0048" */
    public static final String MESSAGE_KEY_RG0048 = "RG0048";

    /** 共通定数：エラーメッセージキーの"RG0049 */
    public static final String MESSAGE_KEY_RG0049 = "RG0049";

    /** 共通定数：エラーメッセージキーの"RG0050" */
    public static final String MESSAGE_KEY_RG0050 = "RG0050";

    /** 共通定数：エラーメッセージキーの"RG0051" */
    public static final String MESSAGE_KEY_RG0051 = "RG0051";

    /** 共通定数：エラーメッセージキーの"RG0052" */
    public static final String MESSAGE_KEY_RG0052 = "RG0052";

    /** 共通定数：エラーメッセージキーの"RG0054" */
    public static final String MESSAGE_KEY_RG0054 = "RG0054";

    /** 共通定数：エラーメッセージキーの"RG0055" */
    public static final String MESSAGE_KEY_RG0055 = "RG0055";

    /** 共通定数：エラーメッセージキーの"RG0056" */
    public static final String MESSAGE_KEY_RG0056 = "RG0056";

    /** 共通定数：エラーメッセージキーの"RG0057" */
    public static final String MESSAGE_KEY_RG0057 = "RG0057";

    /** 共通定数：エラーメッセージキーの"RG0058" */
    public static final String MESSAGE_KEY_RG0058 = "RG0058";

    /** 共通定数：エラーメッセージキーの"RG0059" */
    public static final String MESSAGE_KEY_RG0059 = "RG0059";

    /** 共通定数：エラーメッセージキーの"RG0060" */
    public static final String MESSAGE_KEY_RG0060 = "RG0060";

    /** 共通定数：エラーメッセージキーの"RG0061" */
    public static final String MESSAGE_KEY_RG0061 = "RG0061";

    /** 共通定数：エラーメッセージキーの"RG0062" */
    public static final String MESSAGE_KEY_RG0062 = "RG0062";

    /** 共通定数：エラーメッセージキーの"RG0063" */
    public static final String MESSAGE_KEY_RG0063 = "RG0063";

    /** 共通定数：エラーメッセージキーの"RG0064" */
    public static final String MESSAGE_KEY_RG0064 = "RG0064";

    /** 共通定数：エラーメッセージキーの"RG0065" */
    public static final String MESSAGE_KEY_RG0065 = "RG0065";

    /** 共通定数：エラーメッセージキーの"RG0066" */
    public static final String MESSAGE_KEY_RG0066 = "RG0066";

    /** 共通定数：エラーメッセージキーの"RG0067" */
    public static final String MESSAGE_KEY_RG0067 = "RG0067";

    /** 共通定数：エラーメッセージキーの"RG0068" */
    public static final String MESSAGE_KEY_RG0068 = "RG0068";

    /** 共通定数：エラーメッセージキーの"RG0069" */
    public static final String MESSAGE_KEY_RG0069 = "RG0069";

    /** 共通定数：エラーメッセージキーの"RG0070" */
    public static final String MESSAGE_KEY_RG0070 = "RG0070";

    /** 共通定数：エラーメッセージキーの"RG0071" */
    public static final String MESSAGE_KEY_RG0071 = "RG0071";

    /** 共通定数：エラーメッセージキーの"RG0072" */
    public static final String MESSAGE_KEY_RG0072 = "RG0072";

    /** 共通定数：エラーメッセージキーの"RG0073" */
    public static final String MESSAGE_KEY_RG0073 = "RG0073";

    /** 共通定数：エラーメッセージキーの"RG0074" */
    public static final String MESSAGE_KEY_RG0074 = "RG0074";

    /** 共通定数：エラーメッセージキーの"RG0075" */
    public static final String MESSAGE_KEY_RG0075 = "RG0075";

    /** 共通定数：エラーメッセージキーの"RG0076" */
    public static final String MESSAGE_KEY_RG0076 = "RG0076";

    /** 共通定数：エラーメッセージキーの"RG0077" */
    public static final String MESSAGE_KEY_RG0077 = "RG0077";

    /** 共通定数：エラーメッセージキーの"RG0078" */
    public static final String MESSAGE_KEY_RG0078 = "RG0078";

    /** 共通定数：エラーメッセージキーの"RG0079" */
    public static final String MESSAGE_KEY_RG0079 = "RG0079";

    /** 共通定数：エラーメッセージキーの"RG0080" */
    public static final String MESSAGE_KEY_RG0080 = "RG0080";

    /** 共通定数：エラーメッセージキーの"RG0081" */
    public static final String MESSAGE_KEY_RG0081 = "RG0081";

    /** 共通定数：エラーメッセージキーの"RG0082" */
    public static final String MESSAGE_KEY_RG0082 = "RG0082";

    /** 共通定数：エラーメッセージキーの"RG0083" */
    public static final String MESSAGE_KEY_RG0083 = "RG0083";

    /** 共通定数：エラーメッセージキーの"RG0084" */
    public static final String MESSAGE_KEY_RG0084 = "RG0084";

    /** 共通定数：エラーメッセージキーの"RG0085" */
    public static final String MESSAGE_KEY_RG0085 = "RG0085";

    /** 共通定数：エラーメッセージキーの"RG0086" */
    public static final String MESSAGE_KEY_RG0086 = "RG0086";

    /** 共通定数：エラーメッセージキーの"RG0087" */
    public static final String MESSAGE_KEY_RG0087 = "RG0087";

    /** 共通定数：エラーメッセージキーの"RG0088" */
    public static final String MESSAGE_KEY_RG0088 = "RG0088";

    /** 共通定数：エラーメッセージキーの"RG0089" */
    public static final String MESSAGE_KEY_RG0089 = "RG0089";

    /** 共通定数：エラーメッセージキーの"RG0090" */
    public static final String MESSAGE_KEY_RG0090 = "RG0090";

    /** 共通定数：エラーメッセージキーの"RG0091" */
    public static final String MESSAGE_KEY_RG0091 = "RG0091";

    /** 共通定数：エラーメッセージキーの"RG0092" */
    public static final String MESSAGE_KEY_RG0092 = "RG0092";

    /** 共通定数：エラーメッセージキーの"RG0093" */
    public static final String MESSAGE_KEY_RG0093 = "RG0093";

    /** 共通定数：エラーメッセージキーの"RG0094" */
    public static final String MESSAGE_KEY_RG0094 = "RG0094";

    /** 共通定数：エラーメッセージキーの"RG0095" */
    public static final String MESSAGE_KEY_RG0095 = "RG0095";

    /** 共通定数：エラーメッセージキーの"RG0096" */
    public static final String MESSAGE_KEY_RG0096 = "RG0096";

    /** 共通定数：エラーメッセージキーの"RG0097" */
    public static final String MESSAGE_KEY_RG0097 = "RG0097";

    /** 共通定数：エラーメッセージキーの"RG0098" */
    public static final String MESSAGE_KEY_RG0098 = "RG0098";

    /** 共通定数：エラーメッセージキーの"RG0099" */
    public static final String MESSAGE_KEY_RG0099 = "RG0099";

    /** 共通定数：エラーメッセージキーの"RG0100" */
    public static final String MESSAGE_KEY_RG0100 = "RG0100";

    /** 共通定数：エラーメッセージキーの"RG0101" */
    public static final String MESSAGE_KEY_RG0101 = "RG0101";

    /** 共通定数：エラーメッセージキーの"RG0102" */
    public static final String MESSAGE_KEY_RG0102 = "RG0102";

    /** 共通定数：エラーメッセージキーの"RG0103" */
    public static final String MESSAGE_KEY_RG0103 = "RG0103";

    /** 共通定数：エラーメッセージキーの"RG0104" */
    public static final String MESSAGE_KEY_RG0104 = "RG0104";

    /** 共通定数：エラーメッセージキーの"RG0105" */
    public static final String MESSAGE_KEY_RG0105 = "RG0105";

    /** 共通定数：エラーメッセージキーの"RG0106" */
    public static final String MESSAGE_KEY_RG0106 = "RG0106";

    /** 共通定数：エラーメッセージキーの"RG0107" */
    public static final String MESSAGE_KEY_RG0107 = "RG0107";

    /** 共通定数：エラーメッセージキーの"RG0108" */
    public static final String MESSAGE_KEY_RG0108 = "RG0108";

    /** 共通定数：エラーメッセージキーの"RG0109" */
    public static final String MESSAGE_KEY_RG0109 = "RG0109";

    /** 共通定数：エラーメッセージキーの"RG0110" */
    public static final String MESSAGE_KEY_RG0110 = "RG0110";

    /** 共通定数：エラーメッセージキーの"RG0111" */
    public static final String MESSAGE_KEY_RG0111 = "RG0111";

    /** 共通定数：エラーメッセージキーの"RG0112" */
    public static final String MESSAGE_KEY_RG0112 = "RG0112";

    /** 共通定数：エラーメッセージキーの"RG0113" */
    public static final String MESSAGE_KEY_RG0113 = "RG0113";

    /** 共通定数：エラーメッセージキーの"RG0114" */
    public static final String MESSAGE_KEY_RG0114 = "RG0114";

    /** 共通定数：エラーメッセージキーの"RG0115" */
    public static final String MESSAGE_KEY_RG0115 = "RG0115";

    /** 共通定数：エラーメッセージキーの"RG0116" */
    public static final String MESSAGE_KEY_RG0116 = "RG0116";

    /** 共通定数：エラーメッセージキーの"RG0117" */
    public static final String MESSAGE_KEY_RG0117 = "RG0117";

    /** 共通定数：エラーメッセージキーの"RG7777" */
    public static final String MESSAGE_KEY_RG7777 = "RG7777";

    /** 共通定数：エラーメッセージキーの"UA0008" */
    public static final String MESSAGE_KEY_UA0008 = "UA0008";

    /** 共通定数：エラーメッセージキーの"UA0009" */
    public static final String MESSAGE_KEY_UA0009 = "UA0009";

    /** 共通定数：エラーメッセージキーの"UA0010" */
    public static final String MESSAGE_KEY_UA0010 = "UA0010";

    /** 共通定数：エラーメッセージキーの"UA0011" */
    public static final String MESSAGE_KEY_UA0011 = "UA0011";

    /** 共通定数：エラーメッセージキーの"UA0012" */
    public static final String MESSAGE_KEY_UA0012 = "UA0012";

    /** 共通定数：エラーメッセージキーの"UA0013" */
    public static final String MESSAGE_KEY_UA0013 = "UA0013";

    /** 共通定数：共通取得キー"user" */
    public static final String FORM_KEY_USER = "user";

    /** 共通定数：画面入力情報のユーザID */
    public static final String FORM_KEY_USERID = "registUserId";

    /** 共通定数：画面入力情報のユーザー名 */
    public static final String FORM_KEY_USERNAME = "registUserName";

    /** 共通定数：画面入力情報のユーザー名カナ */
    public static final String FORM_KEY_USERNAME_KANA = "registUserNameKana";

    /** 共通定数：画面入力情報のメールアドレス */
    public static final String FORM_KEY_MAILADDRESS = "registMailAddress";

    /** 共通定数：画面入力情報の生年月日 */
    public static final String FORM_KEY_BIRTHDATE = "registBirthDate";

    /** 共通定数：画面入力情報の電話番号 */
    public static final String FORM_KEY_TELEPHONE_NUNBER = "registTelephoneNumber";

    /** 共通定数：画面入力情報のイベント名 */
    public static final String FORM_KEY_EVENTNAME = "event_name";

    /** 共通定数：画面入力情報のイベント日程 */
    public static final String FORM_KEY_EVENTDATE = "event_date";

    /** 共通定数：画面入力情報のイベント開催場所 */
    public static final String FORM_KEY_EVENTPLACE = "event_place";

    /** 共通定数：画面入力情報のイベント概要 */
    public static final String FORM_KEY_EVENTSUMMARY = "event_summary";

    /** 共通定数：画面入力情報のイベント担当者 */
    public static final String FORM_KEY_EVENTPERSONEL = "event_personnel";

    /** 共通定数：画面入力情報の返信期限 */
    public static final String FORM_KEY_DEADKINEDATETIME = "attendance_deadline_datetime";

    /** 共通定数：コードID"0000" */
    public static final String CODE_ID_BLANK = "0000";

    /** 共通定数：コードID"0001"（会社コード） */
    public static final String CODE_ID_COMPANY = "0001";

    /** 共通定数：コードID"0002"（部署コード） */
    public static final String CODE_ID_DIVISION = "0002";

    /** 共通定数：コードID"0003"（役職コード） */
    public static final String CODE_ID_POST = "0003";

    /** 共通定数：コードID"0004"（技術コード） */
    public static final String CODE_ID_TECHS = "0004";

    /** 共通定数：コードID"0005"（作業コード） */
    public static final String CODE_ID_WORK = "0005";

    /** 共通定数：コードID"0006"（開発系統コード） */
    public static final String CODE_ID_DEVGROUP = "0006";

    /** 共通定数：コードID"0007"（業務コード） */
    public static final String CODE_ID_BUSINESS = "0007";

    /** 共通定数：性別コード"1"(男) */
    public static final String SEXCODE_MAN = "1";

    /** 共通定数：性別コード"2"(女) */
    public static final String SEXCODE_WOMAN = "2";

    /** 共通定数：血液型コード"0"(未選択) */
    public static final String BLOODCODE_NOT = "0";

    /** 共通定数：血液型コード"1"(A型) */
    public static final String BLOODECODE_A = "1";

    /** 共通定数：血液型コード"2"(B型) */
    public static final String BLOODECODE_B = "2";

    /** 共通定数：血液型コード"3"(O型) */
    public static final String BLOODECODE_O = "3";

    /** 共通定数：血液型コード"4"(AB型) */
    public static final String BLOODECODE_AB = "4";

    /** 共通定数：ユーザ権限コード"0"(管理者) */
    public static final String AUTHORITY_SUPER_USER = "0";

    /** 共通定数：ユーザ権限コード"1"(部課長) */
    public static final String AUTHORITY_EVENT_MANAGE = "1";

    /** 共通定数：ユーザ権限コード"2"(主任) */
    public static final String AUTHORITY_EVENT_CHIEF = "2";

    /** 共通定数：ユーザ権限コード"3"(一般) */
    public static final String AUTHORITY_PUBLIC = "3";

    /** 共通定数：性別"男" */
    public static final String MAN = "男";

    /** 共通定数：性別"女" */
    public static final String WOMAN = "女";

    /** 共通定数：血液型"未選択" */
    public static final String BLOODTYPE_NOT = "未選択";

    /** 共通定数：血液型"A型" */
    public static final String BLOODETYPE_A = "A型";

    /** 共通定数：血液型"B型" */
    public static final String BLOODETYPE_B = "B型";

    /** 共通定数：血液型"O型" */
    public static final String BLOODETYPE_O = "O型";

    /** 共通定数：血液型"AB型" */
    public static final String BLOODETYPE_AB = "AB型";

    /** 共通定数：ユーザ種別"管理者" */
    public static final String AUTHORITY_TYPE_0 = "管理者";

    /** 共通定数：ユーザ種別"部課長" */
    public static final String AUTHORITY_TYPE_1 = "部課長";

    /** 共通定数：ユーザ種別"主任" */
    public static final String AUTHORITY_TYPE_2 = "主任";

    /** 共通定数：ユーザ種別"一般" */
    public static final String AUTHORITY_TYPE_3 = "一般";

    /** 共通定数：情報公開可否"公開する" */
    public static final String PRIVACY_FLAG_OFF = "公開する";

    /** 共通定数：情報公開可否"公開しない" */
    public static final String PRIVACY_FLAG_ON = "公開しない";

    /** 共通定数：正常の"1" */
    public static final String INDEX_FLAG_SUCCESS = "1";

    /** 共通定数：エラーの"0" */
    public static final String INDEX_FLAG_ERROR = "0";

    /** 共通定数：エラーメッセージキーの"E0000" */
    public static final String ERR_CODE_E0000 = "E0000";

    /** 共通定数：エラーメッセージキーの"E0101" */
    public static final String ERR_CODE_E0101 = "E0101";

    /** 共通定数：エラーメッセージキーの"E0102" */
    public static final String ERR_CODE_E0102 = "E0102";

    /** 共通定数：エラーメッセージキーの"E0103" */
    public static final String ERR_CODE_E0103 = "E0103";

    /** 共通定数：エラーメッセージキーの"E0104" */
    public static final String ERR_CODE_E0104 = "E0104";

    /** 共通定数：エラーメッセージキーの"E0201" */
    public static final String ERR_CODE_E0201 = "E0201";

    /** 共通定数：エラーメッセージキーの"E0202" */
    public static final String ERR_CODE_E0202 = "E0202";

    /** 共通定数：エラーメッセージキーの"E0203" */
    public static final String ERR_CODE_E0203 = "E0203";

    /** 共通定数：エラーメッセージキーの"E0204" */
    public static final String ERR_CODE_E0204 = "E0204";

    /** 共通定数：エラーメッセージキーの"E0205" */
    public static final String ERR_CODE_E0205 = "E0205";

    /** 共通定数：エラーメッセージキーの"E0206" */
    public static final String ERR_CODE_E0206 = "E0206";

    /** 共通定数：エラーメッセージキーの"E0207" */
    public static final String ERR_CODE_E0207 = "E0207";

    /** 共通定数：エラーメッセージキーの"E0301" */
    public static final String ERR_CODE_E0301 = "E0301";

    /** 共通定数：エラーメッセージキーの"E0302" */
    public static final String ERR_CODE_E0302 = "E0302";

    /** 共通定数：エラーメッセージキーの"E0303" */
    public static final String ERR_CODE_E0303 = "E0303";

    /** 共通定数：エラーメッセージキーの"E0304" */
    public static final String ERR_CODE_E0304 = "E0304";

    /** 共通定数：エラーメッセージキーの"E0305" */
    public static final String ERR_CODE_E0305 = "E0305";

    /** 共通定数：エラーメッセージキーの"E0306" */
    public static final String ERR_CODE_E0306 = "E0306";

    /** 共通定数：エラーメッセージ"E0000" */
    public static final String ERR_MESSAGE_E0000 = "正常です。";

    /** 共通定数：エラーメッセージ"E0101" */
    public static final String ERR_MESSAGE_E0101 = "リクエストから個体識別ＩＤを取得できません。";

    /** 共通定数：エラーメッセージ"E0102" */
    public static final String ERR_MESSAGE_E0102 = "リクエストからユーザーＩＤを取得できません。";

    /** 共通定数：エラーメッセージ"E0103" */
    public static final String ERR_MESSAGE_E0103 = "リクエストからパスワードを取得できません。";

    /** 共通定数：エラーメッセージ"E0104" */
    public static final String ERR_MESSAGE_E0104 = "リクエストからアクセストークンを取得できません。";

    /** 共通定数：エラーメッセージ"E0201" */
    public static final String ERR_MESSAGE_E0201 = "ＤＢに個体識別ＩＤが登録されていません。";

    /** 共通定数：エラーメッセージ"E0202" */
    public static final String ERR_MESSAGE_E0202 = "ＤＢにユーザーＩＤが登録されていません。";

    /** 共通定数：エラーメッセージ"E0203" */
    public static final String ERR_MESSAGE_E0203 = "ＤＢにパスワードが登録されていません。";

    /** 共通定数：エラーメッセージ"E0204" */
    public static final String ERR_MESSAGE_E0204 = "ＤＢにアクセストークンが登録されていません。";

    /** 共通定数：エラーメッセージ"E0205" */
    public static final String ERR_MESSAGE_E0205 = "ＤＢにアクセストークンがアップデートできません。";

    /** 共通定数：エラーメッセージ"E0206" */
    public static final String ERR_MESSAGE_E0206 = "ＤＢに個体識別ＩＤとアクセストークンがアップデートできません。";

    /** 共通定数：エラーメッセージ"E0207" */
    public static final String ERR_MESSAGE_E0207 = "ＤＢにアクセストークンの初期化ができません。";

    /** 共通定数：エラーメッセージ"E0301" */
    public static final String ERR_MESSAGE_E0301 = "パスワードが一致しません。";

    /** 共通定数：エラーメッセージ"E0302" */
    public static final String ERR_MESSAGE_E0302 = "パスワードのハッシュ化に失敗しました。";

    /** 共通定数：エラーメッセージ"E0303" */
    public static final String ERR_MESSAGE_E0303 = "社員情報のＸＭＬ生成に失敗しました。";

    /** 共通定数：エラーメッセージ"E0304" */
    public static final String ERR_MESSAGE_E0304 = "勤怠情報のJSON生成に失敗しました。";

    /** 共通定数：エラーメッセージ"E0305" */
    public static final String ERR_MESSAGE_E0305 = "承認済みエラー：更新しようとしている月の勤怠情報は既に承認済みです。";

    /** 共通定数：エラーメッセージ"E0306" */
    public static final String ERR_MESSAGE_E0306 = "ＤＢにユーザーＩＤと紐づく出勤日が登録されていません。";

}

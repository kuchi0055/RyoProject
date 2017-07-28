package com.Easy3.Util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;


/**
* @param str
* @return getEnBase64,getDecBase64,getEnSHA1
* @author 多田 直樹
* @version 1.00
*/

public class FC0105 {

    //BASE64でエンコード
    public static String getEnBase64 (String str) {

        //エンコード処理
        byte[] encoded = Base64.encodeBase64(str.getBytes());

        return new String(encoded);
    }

    //BASE64でデコード
    public static String getDecBase64 (String str) {

        //デコード処理
        byte[] decoded = Base64.decodeBase64(str.getBytes());

        //デコード結果のbyte[]を文字列にする
        String decodedStr = new String(decoded);

        return (decodedStr);
    }

    //SHA-1でハッシュ値を出力
    public static String getEnSHA1 (String str) throws NoSuchAlgorithmException {

        //メッセージダイジェストオブジェクト作成
        MessageDigest md = MessageDigest.getInstance("SHA-1");

        //ダイジェスト処理し、digestに入力
        byte[] digest = md.digest(str.getBytes());

        //16進数に変換し、文字列で値を返します。
        return new String(Hex.encodeHex(digest));
    }
}
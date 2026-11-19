package com.zykj.utlils;

import android.os.Environment;

/* loaded from: classes.dex */
public class SharedTokenProviderUtil {
    public static final String FILE_NAME = "system.zy";
    public static final String LOCATE_NAME = "locate.zy";
    public static final String SECRET_PATH = Environment.getExternalStorageDirectory().toString() + "/Android/data/";
    private static final String TAG = "SharedTokenProviderUtil";

    public static String getToken() {
        String strDecryptThreeDESECB = null;
        try {
            strDecryptThreeDESECB = EncryptUtil.decryptThreeDESECB(FileUtils.readFile(SECRET_PATH + FILE_NAME));
            LogUtils.m13i(TAG, "getToken------>>>" + strDecryptThreeDESECB);
            return strDecryptThreeDESECB;
        } catch (Exception e) {
            e.printStackTrace();
            return strDecryptThreeDESECB;
        }
    }

    public static void setToken(String str) throws Throwable {
        try {
            LogUtils.m13i(TAG, "setToken------>>>" + str);
            if (str == null) {
                FileUtils.saveFile(SECRET_PATH, FILE_NAME, "zykj");
            } else {
                FileUtils.saveFile(SECRET_PATH, FILE_NAME, EncryptUtil.encryptThreeDESECB(str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getBaseUrl() {
        String strDecryptThreeDESECB = null;
        try {
            strDecryptThreeDESECB = EncryptUtil.decryptThreeDESECB(FileUtils.readFile(SECRET_PATH + LOCATE_NAME));
            LogUtils.m13i(TAG, "getUrl------>>>" + strDecryptThreeDESECB);
            return strDecryptThreeDESECB;
        } catch (Exception e) {
            e.printStackTrace();
            return strDecryptThreeDESECB;
        }
    }

    public static void setBaseUrl(String str) throws Throwable {
        try {
            LogUtils.m13i(TAG, "setUrl------>>>" + str);
            if (str == null) {
                FileUtils.saveFile(SECRET_PATH, LOCATE_NAME, "zykj");
            } else {
                FileUtils.saveFile(SECRET_PATH, LOCATE_NAME, EncryptUtil.encryptThreeDESECB(str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

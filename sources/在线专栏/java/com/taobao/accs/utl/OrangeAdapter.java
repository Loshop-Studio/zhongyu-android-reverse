package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;

/* loaded from: classes.dex */
public class OrangeAdapter {
    public static final String NAMESPACE = "accs";
    private static final String TAG = "OrangeAdapter";
    private static final String TNET_LOG_KEY = "tnet_log_off";
    public static final boolean mOrangeValid = false;

    public static String getConfig(String str, String str2, String str3) {
        return str3;
    }

    private static boolean getConfigFromSP(Context context, String str, boolean z3) {
        try {
            return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getBoolean(str, z3);
        } catch (Exception e4) {
            ALog.m6091e(TAG, "getConfigFromSP fail:", e4, "key", str);
            return z3;
        }
    }

    public static boolean isBindService(Context context) {
        boolean configFromSP;
        try {
            configFromSP = getConfigFromSP(context, Constants.SP_KEY_BIND_SERVICE_ENABLE, true);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "isBindService", th, new Object[0]);
            configFromSP = true;
        }
        ALog.m6090d(TAG, "isBindService", "result", Boolean.valueOf(configFromSP));
        return configFromSP;
    }

    public static boolean isSmartHb() {
        boolean configFromSP;
        try {
            configFromSP = getConfigFromSP(GlobalClientInfo.getContext(), Constants.SP_KEY_HB_SMART_ENABLE, true);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "isSmartHb", th, new Object[0]);
            configFromSP = true;
        }
        ALog.m6090d(TAG, "isSmartHb", "result", Boolean.valueOf(configFromSP));
        return configFromSP;
    }

    public static boolean isTnetLogOff(boolean z3) {
        boolean z4;
        String config;
        boolean zBooleanValue;
        if (z3) {
            try {
                config = getConfig("accs", "tnet_log_off", AccsClientConfig.DEFAULT_CONFIG_TAG);
            } catch (Throwable th) {
                th = th;
                z4 = true;
                ALog.m6091e(TAG, "isTnetLogOff", th, new Object[0]);
                zBooleanValue = z4;
                ALog.m6093i(TAG, "isTnetLogOff", "result", Boolean.valueOf(zBooleanValue));
                return zBooleanValue;
            }
        } else {
            config = AccsClientConfig.DEFAULT_CONFIG_TAG;
        }
        if (config.equals(AccsClientConfig.DEFAULT_CONFIG_TAG)) {
            zBooleanValue = getConfigFromSP(GlobalClientInfo.getContext(), "tnet_log_off", true);
        } else {
            zBooleanValue = Boolean.valueOf(config).booleanValue();
            try {
                saveConfigToSP(GlobalClientInfo.getContext(), "tnet_log_off", zBooleanValue);
            } catch (Throwable th2) {
                z4 = zBooleanValue;
                th = th2;
                ALog.m6091e(TAG, "isTnetLogOff", th, new Object[0]);
                zBooleanValue = z4;
                ALog.m6093i(TAG, "isTnetLogOff", "result", Boolean.valueOf(zBooleanValue));
                return zBooleanValue;
            }
        }
        ALog.m6093i(TAG, "isTnetLogOff", "result", Boolean.valueOf(zBooleanValue));
        return zBooleanValue;
    }

    private static void saveConfigToSP(Context context, String str, boolean z3) {
        try {
        } catch (Exception e4) {
            ALog.m6091e(TAG, "saveConfigToSP fail:", e4, "key", str, "value", Boolean.valueOf(z3));
        }
        if (context == null) {
            ALog.m6092e(TAG, "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        editorEdit.putBoolean(str, z3);
        editorEdit.apply();
        ALog.m6093i(TAG, "saveConfigToSP", "key", str, "value", Boolean.valueOf(z3));
    }

    public static void saveConfigToSP(Context context, String str, int i4) {
        try {
        } catch (Exception e4) {
            ALog.m6091e(TAG, "saveConfigToSP fail:", e4, "key", str, "value", Integer.valueOf(i4));
        }
        if (context == null) {
            ALog.m6092e(TAG, "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        editorEdit.putInt(str, i4);
        editorEdit.apply();
        ALog.m6093i(TAG, "saveConfigToSP", "key", str, "value", Integer.valueOf(i4));
    }
}

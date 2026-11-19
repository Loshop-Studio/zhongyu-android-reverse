package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;

/* loaded from: classes5.dex */
public class OrangeAdapter {
    public static final String NAMESPACE = "accs";
    private static final String TAG = "OrangeAdapter";
    private static final String TNET_LOG_KEY = "tnet_log_off";
    public static final boolean mOrangeValid = false;

    public static String getConfig(String str, String str2, String str3) {
        return str3;
    }

    private static boolean getConfigFromSP(Context context, String str, boolean z10) {
        try {
            return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getBoolean(str, z10);
        } catch (Exception e10) {
            ALog.m10117e(TAG, "getConfigFromSP fail:", e10, "key", str);
            return z10;
        }
    }

    public static boolean isBindService(Context context) {
        boolean configFromSP = true;
        try {
            configFromSP = getConfigFromSP(context, Constants.SP_KEY_BIND_SERVICE_ENABLE, true);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "isBindService", th, new Object[0]);
        }
        ALog.m10116d(TAG, "isBindService", "result", Boolean.valueOf(configFromSP));
        return configFromSP;
    }

    public static boolean isSmartHb() {
        boolean configFromSP = true;
        try {
            configFromSP = getConfigFromSP(GlobalClientInfo.getContext(), Constants.SP_KEY_HB_SMART_ENABLE, true);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "isSmartHb", th, new Object[0]);
        }
        ALog.m10116d(TAG, "isSmartHb", "result", Boolean.valueOf(configFromSP));
        return configFromSP;
    }

    public static boolean isTnetLogOff(boolean z10) {
        String config;
        boolean configFromSP;
        boolean zBooleanValue = true;
        if (z10) {
            try {
                config = getConfig("accs", "tnet_log_off", AccsClientConfig.DEFAULT_CONFIG_TAG);
            } catch (Throwable th) {
                ALog.m10117e(TAG, "isTnetLogOff", th, new Object[0]);
            }
        } else {
            config = AccsClientConfig.DEFAULT_CONFIG_TAG;
        }
        if (config.equals(AccsClientConfig.DEFAULT_CONFIG_TAG)) {
            configFromSP = getConfigFromSP(GlobalClientInfo.getContext(), "tnet_log_off", true);
            ALog.m10119i(TAG, "isTnetLogOff", "result", Boolean.valueOf(configFromSP));
            return configFromSP;
        }
        zBooleanValue = Boolean.valueOf(config).booleanValue();
        saveConfigToSP(GlobalClientInfo.getContext(), "tnet_log_off", zBooleanValue);
        configFromSP = zBooleanValue;
        ALog.m10119i(TAG, "isTnetLogOff", "result", Boolean.valueOf(configFromSP));
        return configFromSP;
    }

    private static void saveConfigToSP(Context context, String str, boolean z10) {
        try {
        } catch (Exception e10) {
            ALog.m10117e(TAG, "saveConfigToSP fail:", e10, "key", str, "value", Boolean.valueOf(z10));
        }
        if (context == null) {
            ALog.m10118e(TAG, "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
        ALog.m10119i(TAG, "saveConfigToSP", "key", str, "value", Boolean.valueOf(z10));
    }

    public static void saveConfigToSP(Context context, String str, int i10) {
        try {
        } catch (Exception e10) {
            ALog.m10117e(TAG, "saveConfigToSP fail:", e10, "key", str, "value", Integer.valueOf(i10));
        }
        if (context == null) {
            ALog.m10118e(TAG, "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        editorEdit.putInt(str, i10);
        editorEdit.apply();
        ALog.m10119i(TAG, "saveConfigToSP", "key", str, "value", Integer.valueOf(i10));
    }
}

package com.alibaba.sdk.android.push.register;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.alibaba.sdk.android.push.register.ReporterFactory;
import com.alibaba.sdk.thirdpush.impl.BuildConfig;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes3.dex */
public class ThirdPushManager {
    private static final String TAG = "com.alibaba.sdk.android.push.register.ThirdPushManager";

    public enum ThirdPushReportKeyword {
        HONOR("HONOR_TOKEN", AgooConstants.MESSAGE_SYSTEM_SOURCE_HONOR, "ho_"),
        HUAWEI("HW_TOKEN", AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI, "h_"),
        XIAOMI("MI_TOKEN", AgooConstants.MESSAGE_SYSTEM_SOURCE_XIAOMI, "mi_"),
        OPPO("OPPO_TOKEN", AgooConstants.MESSAGE_SYSTEM_SOURCE_OPPO, "o_"),
        VIVO("VIVO_TOKEN", AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO, "v_"),
        MEIZU("MZ_TOKEN", AgooConstants.MESSAGE_SYSTEM_SOURCE_MEIZU, "mz_"),
        FCM(AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM, AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM, "f_");

        public final String thirdMsgKeyword;
        public final String thirdSdkVersionPrefix;
        public final String thirdTokenKeyword;

        ThirdPushReportKeyword(String str, String str2, String str3) {
            this.thirdTokenKeyword = str;
            this.thirdMsgKeyword = str2;
            this.thirdSdkVersionPrefix = str3;
        }
    }

    public static void onPushMsg(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ALog.m10118e(TAG, "Incorrect parameter", new Object[0]);
            return;
        }
        try {
            ReporterFactory.getMsgReporter().sendMsgToDecrypt(context, str, str2.getBytes(Request.DEFAULT_CHARSET), null);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "onPushMsg", th, new Object[0]);
        }
    }

    public static void registerImpl(BaseNotifyClickActivity.INotifyListener iNotifyListener) {
        if (iNotifyListener != null) {
            BaseNotifyClickActivity.addNotifyListener(iNotifyListener);
        } else {
            ALog.m10118e(TAG, "BaseNotifyClickActivity.INotifyListener cannot be empty.", new Object[0]);
        }
    }

    public static void reportToken(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ALog.m10118e(TAG, "Incorrect parameter", new Object[0]);
            return;
        }
        ReporterFactory.ITokenReporter tokenReporter = ReporterFactory.getTokenReporter();
        String strAddPrefix = ReporterFactory.addPrefix(str, str3);
        if (tokenReporter instanceof ReporterFactory.ITokenReporterV2) {
            try {
                ALog.m10119i(TAG, "report sdkVer:3.9.4.1, source: " + str + ", ThirdToken: " + str2 + ", version: " + strAddPrefix, new Object[0]);
                ((ReporterFactory.ITokenReporterV2) tokenReporter).reportToken(context, BuildConfig.VERSION_NAME, str, strAddPrefix, str2);
                return;
            } catch (Throwable th) {
                ALog.m10117e(TAG, "reportToken", th, new Object[0]);
                return;
            }
        }
        try {
            ALog.m10119i(TAG, "report " + str + " ThirdToken: " + str2 + ", version: " + strAddPrefix, new Object[0]);
            tokenReporter.reportToken(context, str, strAddPrefix, str2);
        } catch (Throwable th2) {
            ALog.m10117e(TAG, "reportToken", th2, new Object[0]);
        }
    }
}

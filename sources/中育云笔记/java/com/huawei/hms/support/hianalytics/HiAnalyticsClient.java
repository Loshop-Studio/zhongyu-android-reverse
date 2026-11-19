package com.huawei.hms.support.hianalytics;

import android.content.Context;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.util.Map;

/* loaded from: classes5.dex */
public class HiAnalyticsClient extends AbstractC7345a {
    @Deprecated
    public static String reportEntry(Context context, String str) {
        if (context != null) {
            return reportEntry(context, str, Util.getAppId(context), 0);
        }
        HMSLog.m8725e("HiAnalyticsClient", "<reportEntry 2 param> context is null.");
        return "";
    }

    public static void reportExit(Context context, String str, String str2, int i10, int i11) {
        if (context == null) {
            HMSLog.m8725e("HiAnalyticsClient", "<reportExit 5 param> context is null.");
        } else {
            reportExit(context, str, str2, Util.getAppId(context), i10, i11, 0);
        }
    }

    public static void reportExit(Context context, String str, String str2, int i10, int i11, int i12) {
        if (context == null) {
            HMSLog.m8725e("HiAnalyticsClient", "<reportExit 6 param> context is null.");
        } else {
            reportExit(context, str, str2, Util.getAppId(context), i10, i11, i12);
        }
    }

    public static String reportEntry(Context context, String str, int i10) {
        if (context == null) {
            HMSLog.m8725e("HiAnalyticsClient", "<reportEntry 3 param> context is null.");
            return "";
        }
        return reportEntry(context, str, Util.getAppId(context), i10);
    }

    public static void reportExit(Context context, String str, String str2, String str3, int i10, int i11, int i12) {
        if (context == null) {
            HMSLog.m8725e("HiAnalyticsClient", "<reportExit 7 param> context is null.");
            return;
        }
        Map mapM8718a = AbstractC7345a.m8718a(context, str);
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str3);
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, str2);
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(i10));
        mapM8718a.put("result", String.valueOf(i11));
        mapM8718a.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(i12)));
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_KIT_API_CALLED, mapM8718a);
    }

    public static String reportEntry(Context context, String str, String str2, int i10) {
        if (context == null) {
            HMSLog.m8725e("HiAnalyticsClient", "<reportEntry 4 param> context is null.");
            return "";
        }
        String id2 = TransactionIdCreater.getId(str2, str);
        Map mapM8718a = AbstractC7345a.m8718a(context, str);
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str2);
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, id2);
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        mapM8718a.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(i10)));
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_KIT_API_CALLED, mapM8718a);
        return id2;
    }
}

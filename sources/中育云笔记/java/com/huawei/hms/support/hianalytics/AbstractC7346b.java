package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.Util;
import java.util.Map;

/* renamed from: com.huawei.hms.support.hianalytics.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7346b extends AbstractC7345a {
    /* renamed from: b */
    public static void m8719b(Context context, String str, String str2, String str3, String str4) {
        Map mapM8718a = AbstractC7345a.m8718a(context, str);
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = TransactionIdCreater.getId(str2, str);
        }
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, str3);
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
        if (!TextUtils.isEmpty(str4)) {
            mapM8718a.put("version", HiAnalyticsUtil.versionCodeToName(str4));
        }
        mapM8718a.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_API_CALLED, mapM8718a);
    }

    /* renamed from: c */
    public static void m8720c(Context context, ResponseHeader responseHeader, String str) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader);
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
        if (!TextUtils.isEmpty(str)) {
            mapFromRequestHeader.put("version", HiAnalyticsUtil.versionCodeToName(str));
        }
        mapFromRequestHeader.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_BASE_API_CALLED, mapFromRequestHeader);
    }
}

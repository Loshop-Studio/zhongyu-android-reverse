package com.tendcloud.tenddata;

import android.app.Activity;
import android.content.Context;
import java.util.Map;

/* loaded from: classes5.dex */
public final class TalkingDataSDK {
    public static final int ANALYTICS_INTELLIGENT_DISABLE = 2;
    public static final int ANTI_CHEATING_DISABLE = 8;
    public static final int DEVICE_IDENTIFICATION_DISABLE = 4;
    public static final int PRECISE_AREA_DISABLE = 1;

    public static synchronized String getDeviceId(Context context) {
        return C7844ac.m11111d(context, AbstractC7841a.UNIVERSAL);
    }

    public static int getNFCStatus(Context context) {
        return C7844ac.m11094b(context);
    }

    public static synchronized String getOAID(Context context) {
        return C7844ac.m11114e(context, AbstractC7841a.UNIVERSAL);
    }

    public static synchronized void getShortUrl(Map<String, Object> map, TDGenerateUrl tDGenerateUrl) {
        C7844ac.m11091a(map, tDGenerateUrl, AbstractC7841a.UNIVERSAL);
    }

    public static void init(Context context, String str, String str2, String str3) {
        C7844ac.m11052a(context, str, str2, str3, AbstractC7841a.UNIVERSAL);
    }

    public static void onCreateCard(String str, String str2, String str3) {
        C7844ac.m11089a(str, str2, str3, AbstractC7841a.UNIVERSAL);
    }

    public static void onError(Context context, Throwable th) {
        C7844ac.m11058a(context, th, AbstractC7841a.UNIVERSAL);
    }

    @Deprecated
    public static void onEvent(Context context, String str, double d10, Map<String, Object> map) {
        onEvent(context, str, map);
    }

    public static void onFavorite(String str, String str2) {
        C7844ac.m11104b(str, str2, AbstractC7841a.UNIVERSAL);
    }

    public static void onLogin(String str, TalkingDataProfile talkingDataProfile) {
        C7844ac.m11072a(str, talkingDataProfile, AbstractC7841a.UNIVERSAL);
    }

    public static void onPageBegin(Context context, String str) {
        C7844ac.m11050a(context, str, AbstractC7841a.UNIVERSAL);
    }

    public static void onPageEnd(Context context, String str) {
        C7844ac.m11098b(context, str, AbstractC7841a.UNIVERSAL);
    }

    @Deprecated
    public static void onPause(Activity activity) {
        C7844ac.m11097b(activity, AbstractC7841a.UNIVERSAL);
    }

    public static void onProfileUpdate(TalkingDataProfile talkingDataProfile) {
        C7844ac.m11063a(talkingDataProfile, AbstractC7841a.UNIVERSAL);
    }

    public static void onPunch(String str, String str2) {
        C7844ac.m11113d(str, str2, AbstractC7841a.UNIVERSAL);
    }

    public static void onReceiveDeepLink(String str) {
        C7844ac.m11112d(str, AbstractC7841a.UNIVERSAL);
    }

    public static void onRegister(String str, TalkingDataProfile talkingDataProfile, String str2) {
        C7844ac.m11073a(str, talkingDataProfile, str2, AbstractC7841a.UNIVERSAL);
    }

    @Deprecated
    public static void onResume(Activity activity) {
        C7844ac.m11046a(activity, AbstractC7841a.UNIVERSAL);
    }

    public static void onSearch(TalkingDataSearch talkingDataSearch) {
        C7844ac.m11064a(talkingDataSearch, AbstractC7841a.UNIVERSAL);
    }

    public static void onShare(String str, String str2) {
        C7844ac.m11110c(str, str2, AbstractC7841a.UNIVERSAL);
    }

    public static void removeGlobalKV(String str) {
        C7844ac.m11076a(str, AbstractC7841a.UNIVERSAL);
    }

    public static synchronized void setConfigurationDisable(int i10) {
        C7844ac.setConfigurationDisable(i10);
    }

    public static synchronized void setCustomDataSwitch(TalkingDataSharingFilter talkingDataSharingFilter) {
        C7844ac.m11065a(talkingDataSharingFilter, AbstractC7841a.UNIVERSAL);
    }

    public static void setGlobalKV(String str, Object obj) {
        C7844ac.m11079a(str, obj, AbstractC7841a.UNIVERSAL);
    }

    public static void setReportUncaughtExceptions(boolean z10) {
        C7844ac.m11092a(z10, AbstractC7841a.UNIVERSAL);
    }

    public static void setVerboseLogDisable() {
        C7844ac.m11107c();
    }

    public static void init(Context context, String str, String str2, String str3, Map<String, Object> map) {
        C7844ac.m11052a(context, str, str2, str3, AbstractC7841a.UNIVERSAL);
    }

    public static void onEvent(Context context, String str, Map<String, Object> map) {
        C7844ac.m11056a(context, str, map, AbstractC7841a.UNIVERSAL);
    }

    public static void onFavorite(String str, String str2, Map<String, Object> map) {
        C7844ac.m11090a(str, str2, map, AbstractC7841a.UNIVERSAL);
    }

    public static void onLogin(String str, TalkingDataProfile talkingDataProfile, Map<String, Object> map) {
        C7844ac.m11075a(str, talkingDataProfile, map, AbstractC7841a.UNIVERSAL);
    }

    public static void onRegister(String str, TalkingDataProfile talkingDataProfile, String str2, Map<String, Object> map) {
        C7844ac.m11074a(str, talkingDataProfile, str2, map, AbstractC7841a.UNIVERSAL);
    }

    public static void onShare(String str, String str2, Map<String, Object> map) {
        C7844ac.m11105b(str, str2, map, AbstractC7841a.UNIVERSAL);
    }

    public static void onEvent(Context context, String str, Map<String, Object> map, Map<String, Object> map2) {
        C7844ac.m11057a(context, str, map, map2, AbstractC7841a.UNIVERSAL);
    }
}

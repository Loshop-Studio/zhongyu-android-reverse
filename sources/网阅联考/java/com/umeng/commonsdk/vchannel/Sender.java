package com.umeng.commonsdk.vchannel;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.C3450b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Sender {
    private static long INTERVAL_THRESHOLD = 500;
    public static final String VCHANNEL_VERSION = "1.0.0";
    private static Map<String, String> customHeader;
    private static long lastTriggerTime;

    public static void handleEvent(Context context, C3512b c3512b) {
        if (context == null) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> Sender:handleEvent: context is null.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C3335ai.f1672aM, "1.0.0");
                Map<String, String> map = customHeader;
                if (map != null && map.size() > 0) {
                    for (String str : customHeader.keySet()) {
                        jSONObject.put(str, customHeader.get(str));
                    }
                }
            } catch (Throwable unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("analytics", c3512b.m4015d());
            UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2, C3511a.f3033c, C3335ai.f1662aC, "1.0.0");
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    public static void onEvent(Context context, String str, Map<String, Object> map) {
        if (context == null) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: context is null.");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: eventID is null or an empty string.");
            return;
        }
        if (map == null) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: map is null.");
            return;
        }
        if (!UMFrUtils.isOnline(context)) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: Network unavailable.");
            return;
        }
        if (System.currentTimeMillis() - lastTriggerTime < INTERVAL_THRESHOLD) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: The interval between events is less than 500 milliseconds.");
            return;
        }
        C3512b c3512b = new C3512b(context);
        c3512b.m4011a(str);
        c3512b.m4010a(System.currentTimeMillis());
        c3512b.m4012a(map);
        try {
            UMWorkDispatch.sendEvent(context, C3449a.f2590o, C3450b.m3469a(context).m3470a(), c3512b);
        } catch (Throwable unused) {
        }
        lastTriggerTime = System.currentTimeMillis();
    }

    public static void setCustomHeader(Map<String, String> map) {
        if (map != null) {
            customHeader = map;
        }
    }
}

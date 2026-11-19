package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public class HiAnalyticsOfCpUtils {

    /* renamed from: a */
    public static HiAnalyticsInstance f11699a;

    /* renamed from: a */
    public static HiAnalyticsInstance m8665a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f11699a = analyticsInstance;
        return analyticsInstance;
    }

    public static void onEvent(Context context, String str, String str2) {
        if (m8665a(context) != null) {
            f11699a.onEvent(context, str, str2);
        }
    }

    public static void onReport(Context context, int i10) {
        if (m8665a(context) != null) {
            f11699a.onReport(i10);
        }
    }

    public static void onStreamEvent(Context context, int i10, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m8665a(context) != null) {
            f11699a.onStreamEvent(i10, str, linkedHashMap);
        }
    }

    public static void onEvent(Context context, int i10, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (m8665a(context) != null) {
            f11699a.onEvent(i10, str, linkedHashMap);
        }
    }
}

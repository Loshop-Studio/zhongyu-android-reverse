package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.commonsdk.statistics.internal.a */
/* loaded from: classes2.dex */
public class C3494a {

    /* renamed from: a */
    private static Context f2836a;

    /* renamed from: b */
    private String f2837b;

    /* renamed from: c */
    private String f2838c;

    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a */
    public static class a {

        /* renamed from: a */
        private static final C3494a f2839a = new C3494a();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3494a m3793a(Context context) {
        if (f2836a == null && context != null) {
            f2836a = context.getApplicationContext();
        }
        return a.f2839a;
    }

    /* renamed from: e */
    private void m3794e(String str) {
        try {
            this.f2837b = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", "/") + "/" + AnalyticsConstants.SDK_TYPE + "/" + Build.DISPLAY + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE + " " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f2836a));
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f2836a, th);
        }
    }

    /* renamed from: f */
    private void m3795f(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String[] strArrSplit = str2.split("&=");
            StringBuilder sb = new StringBuilder();
            sb.append(C3335ai.f1673aN);
            for (String str3 : strArrSplit) {
                if (!TextUtils.isEmpty(str3)) {
                    String strSubstring = str3.substring(0, 2);
                    if (strSubstring.endsWith("=")) {
                        strSubstring = strSubstring.replace("=", "");
                    }
                    sb.append(strSubstring);
                }
            }
            this.f2838c = sb.toString();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f2836a, th);
        }
    }

    /* renamed from: b */
    public boolean m3799b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C3335ai.f1665aF);
    }

    /* renamed from: c */
    public boolean m3800c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C3335ai.f1661aB);
    }

    /* renamed from: d */
    public void m3801d(String str) {
        String strSubstring = str.substring(0, str.indexOf(95));
        m3795f(strSubstring);
        m3794e(strSubstring);
    }

    private C3494a() {
        this.f2837b = null;
        this.f2838c = null;
    }

    /* renamed from: b */
    public String m3798b() {
        return this.f2837b;
    }

    /* renamed from: a */
    public boolean m3797a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C3335ai.f1705at);
    }

    /* renamed from: a */
    public String m3796a() {
        return this.f2838c;
    }
}

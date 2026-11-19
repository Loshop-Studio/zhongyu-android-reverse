package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.commonsdk.statistics.internal.a */
/* loaded from: classes.dex */
public class C2010a {

    /* renamed from: a */
    private static Context f9428a;

    /* renamed from: b */
    private String f9429b;

    /* renamed from: c */
    private String f9430c;

    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a */
    private static class a {

        /* renamed from: a */
        private static final C2010a f9431a = new C2010a();

        private a() {
        }
    }

    /* renamed from: a */
    public static C2010a m7716a(Context context) {
        if (f9428a == null && context != null) {
            f9428a = context.getApplicationContext();
        }
        return a.f9431a;
    }

    /* renamed from: e */
    private void m7717e(String str) {
        try {
            this.f9429b = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", "/") + "/Android/" + Build.DISPLAY + "/" + Build.MODEL + "/" + Build.VERSION.RELEASE + " " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f9428a));
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9428a, th);
        }
    }

    /* renamed from: f */
    private void m7718f(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            String[] strArrSplit = str2.split("&=");
            StringBuilder sb = new StringBuilder();
            sb.append(C1851ai.f8265aN);
            for (String str3 : strArrSplit) {
                if (!TextUtils.isEmpty(str3)) {
                    String strSubstring = str3.substring(0, 2);
                    if (strSubstring.endsWith("=")) {
                        strSubstring = strSubstring.replace("=", "");
                    }
                    sb.append(strSubstring);
                }
            }
            this.f9430c = sb.toString();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f9428a, th);
        }
    }

    /* renamed from: b */
    public boolean m7722b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("t");
    }

    /* renamed from: c */
    public boolean m7723c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C1851ai.f8253aB);
    }

    /* renamed from: d */
    public void m7724d(String str) {
        String strSubstring = str.substring(0, str.indexOf(95));
        m7718f(strSubstring);
        m7717e(strSubstring);
    }

    private C2010a() {
        this.f9429b = null;
        this.f9430c = null;
    }

    /* renamed from: b */
    public String m7721b() {
        return this.f9429b;
    }

    /* renamed from: a */
    public boolean m7720a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C1851ai.f8297at);
    }

    /* renamed from: a */
    public String m7719a() {
        return this.f9430c;
    }
}

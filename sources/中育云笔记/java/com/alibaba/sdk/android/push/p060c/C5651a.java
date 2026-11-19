package com.alibaba.sdk.android.push.p060c;

import android.app.Application;
import android.content.Context;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;

/* renamed from: com.alibaba.sdk.android.push.c.a */
/* loaded from: classes3.dex */
public class C5651a {

    /* renamed from: a */
    private static final AmsLogger f4216a = AmsLogger.getLogger("MPS:ReportManager");

    /* renamed from: b */
    private static volatile C5651a f4217b = null;

    /* renamed from: c */
    private long f4218c;

    /* renamed from: d */
    private boolean f4219d = true;

    private C5651a(Context context) {
        this.f4218c = 0L;
        if (context != null && (context.getApplicationContext() instanceof Application) && this.f4218c == 0) {
            this.f4218c = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public static C5651a m3610a() {
        return f4217b;
    }

    /* renamed from: a */
    public static C5651a m3611a(Context context) {
        if (f4217b == null) {
            synchronized (C5651a.class) {
                try {
                    if (f4217b == null) {
                        f4217b = new C5651a(context);
                    }
                } finally {
                }
            }
        }
        return f4217b;
    }

    /* renamed from: a */
    public void m3612a(String str) {
    }

    /* renamed from: a */
    public void m3613a(String str, String str2, int i10) {
        if (this.f4219d) {
            return;
        }
        f4216a.m3420e("report switch turned off");
    }

    /* renamed from: a */
    public void m3614a(String str, String str2, long j10) {
        if (this.f4219d) {
            return;
        }
        f4216a.m3420e("report switch turned off");
    }

    /* renamed from: a */
    public void m3615a(String str, String str2, String str3) {
        if (this.f4219d) {
            return;
        }
        f4216a.m3420e("report switch turned off");
    }

    /* renamed from: a */
    public void m3616a(String str, String str2, String str3, String str4) {
        if (this.f4219d) {
            return;
        }
        f4216a.m3420e("report switch turned off");
    }
}

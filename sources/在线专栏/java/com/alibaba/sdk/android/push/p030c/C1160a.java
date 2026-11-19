package com.alibaba.sdk.android.push.p030c;

import android.app.Application;
import android.content.Context;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;

/* renamed from: com.alibaba.sdk.android.push.c.a */
/* loaded from: classes.dex */
public class C1160a {

    /* renamed from: a */
    private static final AmsLogger f6692a = AmsLogger.getLogger("MPS:ReportManager");

    /* renamed from: b */
    private static volatile C1160a f6693b = null;

    /* renamed from: c */
    private long f6694c;

    /* renamed from: d */
    private boolean f6695d = true;

    private C1160a(Context context) {
        this.f6694c = 0L;
        if (context != null && (context.getApplicationContext() instanceof Application) && this.f6694c == 0) {
            this.f6694c = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public static C1160a m5159a() {
        return f6693b;
    }

    /* renamed from: a */
    public static C1160a m5160a(Context context) {
        if (f6693b == null) {
            synchronized (C1160a.class) {
                if (f6693b == null) {
                    f6693b = new C1160a(context);
                }
            }
        }
        return f6693b;
    }

    /* renamed from: a */
    public void m5161a(String str) {
    }

    /* renamed from: a */
    public void m5162a(String str, String str2, int i4) {
        if (this.f6695d) {
            return;
        }
        f6692a.m5019e("report switch turned off");
    }

    /* renamed from: a */
    public void m5163a(String str, String str2, long j4) {
        if (this.f6695d) {
            return;
        }
        f6692a.m5019e("report switch turned off");
    }

    /* renamed from: a */
    public void m5164a(String str, String str2, String str3) {
        if (this.f6695d) {
            return;
        }
        f6692a.m5019e("report switch turned off");
    }

    /* renamed from: a */
    public void m5165a(String str, String str2, String str3, String str4) {
        if (this.f6695d) {
            return;
        }
        f6692a.m5019e("report switch turned off");
    }
}

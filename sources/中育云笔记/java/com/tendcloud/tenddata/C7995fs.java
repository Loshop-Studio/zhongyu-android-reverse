package com.tendcloud.tenddata;

import android.os.SystemClock;

/* renamed from: com.tendcloud.tenddata.fs */
/* loaded from: classes5.dex */
public class C7995fs extends AbstractC7987fk {
    public C7995fs() {
        m11979a("bootTime", Long.valueOf(m12004c()));
        m11979a("activeTime", Long.valueOf(SystemClock.elapsedRealtime()));
        m11979a("freeDiskSpace", Integer.valueOf(m12003a()));
        m11979a("batteryLevel", Integer.valueOf(C7899cd.m11445f(C7843ab.f14307g)));
        m11979a("batteryState", Integer.valueOf(C7899cd.m11447g(C7843ab.f14307g)));
    }

    /* renamed from: a */
    public static int m12003a() {
        try {
            int[] iArrM11476u = C7899cd.m11476u();
            if (iArrM11476u != null) {
                return iArrM11476u[1];
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static long m12004c() {
        try {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        } catch (Throwable unused) {
            return -1L;
        }
    }
}

package com.efs.sdk.p036pa.p037a;

import android.os.SystemClock;
import android.util.Printer;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.efs.sdk.pa.a.e */
/* loaded from: classes2.dex */
final class C2983e implements Printer {

    /* renamed from: f */
    private long f1231f;

    /* renamed from: b */
    private boolean f1227b = false;

    /* renamed from: c */
    private String f1228c = null;

    /* renamed from: d */
    private long f1229d = -1;

    /* renamed from: e */
    private long f1230e = -1;

    /* renamed from: a */
    Vector<InterfaceC2982d> f1226a = new Vector<>();

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            this.f1229d = SystemClock.elapsedRealtime();
            this.f1230e = SystemClock.currentThreadTimeMillis();
            this.f1228c = str;
            this.f1227b = true;
            Iterator<InterfaceC2982d> it = this.f1226a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        if (this.f1227b && str.startsWith("<")) {
            this.f1227b = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f1229d;
            if (jElapsedRealtime > this.f1231f) {
                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f1230e;
                Iterator<InterfaceC2982d> it2 = this.f1226a.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2242a(this.f1228c, jElapsedRealtime, jCurrentThreadTimeMillis);
                }
            }
        }
    }
}

package com.efs.sdk.p051pa.p052a;

import android.os.SystemClock;
import android.util.Printer;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.efs.sdk.pa.a.e */
/* loaded from: classes.dex */
final class C1355e implements Printer {

    /* renamed from: f */
    private long f7201f;

    /* renamed from: b */
    private boolean f7197b = false;

    /* renamed from: c */
    private String f7198c = null;

    /* renamed from: d */
    private long f7199d = -1;

    /* renamed from: e */
    private long f7200e = -1;

    /* renamed from: a */
    Vector<InterfaceC1354d> f7196a = new Vector<>();

    C1355e() {
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            this.f7199d = SystemClock.elapsedRealtime();
            this.f7200e = SystemClock.currentThreadTimeMillis();
            this.f7198c = str;
            this.f7197b = true;
            Iterator<InterfaceC1354d> it = this.f7196a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        if (this.f7197b && str.startsWith("<")) {
            this.f7197b = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7199d;
            if (jElapsedRealtime > this.f7201f) {
                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f7200e;
                Iterator<InterfaceC1354d> it2 = this.f7196a.iterator();
                while (it2.hasNext()) {
                    it2.next().mo5601a(this.f7198c, jElapsedRealtime, jCurrentThreadTimeMillis);
                }
            }
        }
    }
}

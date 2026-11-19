package com.efs.sdk.p055pa.p056a;

import android.os.SystemClock;
import android.util.Printer;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.efs.sdk.pa.a.e */
/* loaded from: classes3.dex */
final class C5723e implements Printer {

    /* renamed from: f */
    private long f4835f;

    /* renamed from: b */
    private boolean f4831b = false;

    /* renamed from: c */
    private String f4832c = null;

    /* renamed from: d */
    private long f4833d = -1;

    /* renamed from: e */
    private long f4834e = -1;

    /* renamed from: a */
    Vector<InterfaceC5722d> f4830a = new Vector<>();

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            this.f4833d = SystemClock.elapsedRealtime();
            this.f4834e = SystemClock.currentThreadTimeMillis();
            this.f4832c = str;
            this.f4831b = true;
            Iterator<InterfaceC5722d> it = this.f4830a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        if (this.f4831b && str.startsWith("<")) {
            this.f4831b = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f4833d;
            if (jElapsedRealtime > this.f4835f) {
                long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f4834e;
                Iterator<InterfaceC5722d> it2 = this.f4830a.iterator();
                while (it2.hasNext()) {
                    it2.next().mo4211a(this.f4832c, jElapsedRealtime, jCurrentThreadTimeMillis);
                }
            }
        }
    }
}

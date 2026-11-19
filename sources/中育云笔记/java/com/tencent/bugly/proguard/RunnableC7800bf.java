package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.bf */
/* loaded from: classes5.dex */
public final class RunnableC7800bf implements Runnable {

    /* renamed from: a */
    final Handler f13910a;

    /* renamed from: d */
    long f13913d;

    /* renamed from: e */
    private final String f13914e;

    /* renamed from: f */
    private final List<C7795ba> f13915f = new LinkedList();

    /* renamed from: b */
    long f13911b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: g */
    private final long f13916g = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: c */
    boolean f13912c = true;

    public RunnableC7800bf(Handler handler, String str) {
        this.f13910a = handler;
        this.f13914e = str;
    }

    /* renamed from: e */
    private Thread m10812e() {
        return this.f13910a.getLooper().getThread();
    }

    /* renamed from: a */
    public final boolean m10813a() {
        return !this.f13912c && SystemClock.uptimeMillis() >= this.f13913d + this.f13911b;
    }

    /* renamed from: b */
    public final long m10814b() {
        return SystemClock.uptimeMillis() - this.f13913d;
    }

    /* renamed from: c */
    public final List<C7795ba> m10815c() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f13915f) {
            try {
                arrayList = new ArrayList(this.f13915f.size());
                for (int i10 = 0; i10 < this.f13915f.size(); i10++) {
                    C7795ba c7795ba = this.f13915f.get(i10);
                    if (!c7795ba.f13891e && jCurrentTimeMillis - c7795ba.f13888b < 200000) {
                        arrayList.add(c7795ba);
                        c7795ba.f13891e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void m10816d() {
        StringBuilder sb2 = new StringBuilder(1024);
        long jNanoTime = System.nanoTime();
        try {
            StackTraceElement[] stackTrace = m10812e().getStackTrace();
            if (stackTrace.length == 0) {
                sb2.append("Thread does not have stack trace.\n");
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb2.append(stackTraceElement);
                    sb2.append(SignParameters.NEW_LINE);
                }
            }
        } catch (SecurityException e10) {
            sb2.append("getStackTrace() encountered:\n");
            sb2.append(e10.getMessage());
            sb2.append(SignParameters.NEW_LINE);
            C7779al.m10614a(e10);
        }
        long jNanoTime2 = System.nanoTime();
        C7795ba c7795ba = new C7795ba(sb2.toString(), System.currentTimeMillis());
        c7795ba.f13890d = jNanoTime2 - jNanoTime;
        String name = m10812e().getName();
        if (name == null) {
            name = "";
        }
        c7795ba.f13887a = name;
        synchronized (this.f13915f) {
            while (this.f13915f.size() >= 32) {
                try {
                    this.f13915f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f13915f.add(c7795ba);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13912c = true;
        this.f13911b = this.f13916g;
    }
}

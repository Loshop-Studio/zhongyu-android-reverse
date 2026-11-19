package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.SystemClock;
import android.view.CoroutineLiveDataKt;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.bf */
/* loaded from: classes3.dex */
public final class RunnableC4078bf implements Runnable {

    /* renamed from: a */
    final Handler f3670a;

    /* renamed from: d */
    long f3673d;

    /* renamed from: e */
    private final String f3674e;

    /* renamed from: f */
    private final List<C4073ba> f3675f = new LinkedList();

    /* renamed from: b */
    long f3671b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: g */
    private final long f3676g = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: c */
    boolean f3672c = true;

    public RunnableC4078bf(Handler handler, String str) {
        this.f3670a = handler;
        this.f3674e = str;
    }

    /* renamed from: e */
    private Thread m3219e() {
        return this.f3670a.getLooper().getThread();
    }

    /* renamed from: a */
    public final boolean m3220a() {
        return !this.f3672c && SystemClock.uptimeMillis() >= this.f3673d + this.f3671b;
    }

    /* renamed from: b */
    public final long m3221b() {
        return SystemClock.uptimeMillis() - this.f3673d;
    }

    /* renamed from: c */
    public final List<C4073ba> m3222c() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f3675f) {
            try {
                arrayList = new ArrayList(this.f3675f.size());
                for (int i = 0; i < this.f3675f.size(); i++) {
                    C4073ba c4073ba = this.f3675f.get(i);
                    if (!c4073ba.f3651e && jCurrentTimeMillis - c4073ba.f3648b < 200000) {
                        arrayList.add(c4073ba);
                        c4073ba.f3651e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void m3223d() {
        StringBuilder sb = new StringBuilder(1024);
        long jNanoTime = System.nanoTime();
        try {
            StackTraceElement[] stackTrace = m3219e().getStackTrace();
            if (stackTrace.length == 0) {
                sb.append("Thread does not have stack trace.\n");
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement);
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        } catch (SecurityException e) {
            sb.append("getStackTrace() encountered:\n");
            sb.append(e.getMessage());
            sb.append(SignParameters.NEW_LINE);
            C4055al.m3022a(e);
        }
        long jNanoTime2 = System.nanoTime();
        C4073ba c4073ba = new C4073ba(sb.toString(), System.currentTimeMillis());
        c4073ba.f3650d = jNanoTime2 - jNanoTime;
        String name = m3219e().getName();
        if (name == null) {
            name = "";
        }
        c4073ba.f3647a = name;
        synchronized (this.f3675f) {
            while (this.f3675f.size() >= 32) {
                try {
                    this.f3675f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f3675f.add(c4073ba);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3672c = true;
        this.f3671b = this.f3676g;
    }
}

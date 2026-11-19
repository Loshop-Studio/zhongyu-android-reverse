package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.bf */
/* loaded from: classes4.dex */
public final class RunnableC6435bf implements Runnable {

    /* renamed from: a */
    final Handler f5468a;

    /* renamed from: d */
    long f5471d;

    /* renamed from: e */
    private final String f5472e;

    /* renamed from: f */
    private final List<C6430ba> f5473f = new LinkedList();

    /* renamed from: b */
    long f5469b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: g */
    private final long f5474g = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: c */
    boolean f5470c = true;

    public RunnableC6435bf(Handler handler, String str) {
        this.f5468a = handler;
        this.f5472e = str;
    }

    /* renamed from: e */
    private Thread m5122e() {
        return this.f5468a.getLooper().getThread();
    }

    /* renamed from: a */
    public final boolean m5123a() {
        return !this.f5470c && SystemClock.uptimeMillis() >= this.f5471d + this.f5469b;
    }

    /* renamed from: b */
    public final long m5124b() {
        return SystemClock.uptimeMillis() - this.f5471d;
    }

    /* renamed from: c */
    public final List<C6430ba> m5125c() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f5473f) {
            try {
                arrayList = new ArrayList(this.f5473f.size());
                for (int i10 = 0; i10 < this.f5473f.size(); i10++) {
                    C6430ba c6430ba = this.f5473f.get(i10);
                    if (!c6430ba.f5449e && jCurrentTimeMillis - c6430ba.f5446b < 200000) {
                        arrayList.add(c6430ba);
                        c6430ba.f5449e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void m5126d() {
        StringBuilder sb = new StringBuilder(1024);
        long jNanoTime = System.nanoTime();
        try {
            StackTraceElement[] stackTrace = m5122e().getStackTrace();
            if (stackTrace.length == 0) {
                sb.append("Thread does not have stack trace.\n");
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement);
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        } catch (SecurityException e10) {
            sb.append("getStackTrace() encountered:\n");
            sb.append(e10.getMessage());
            sb.append(SignParameters.NEW_LINE);
            C6414al.m4924a(e10);
        }
        long jNanoTime2 = System.nanoTime();
        C6430ba c6430ba = new C6430ba(sb.toString(), System.currentTimeMillis());
        c6430ba.f5448d = jNanoTime2 - jNanoTime;
        String name = m5122e().getName();
        if (name == null) {
            name = "";
        }
        c6430ba.f5445a = name;
        synchronized (this.f5473f) {
            while (this.f5473f.size() >= 32) {
                try {
                    this.f5473f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5473f.add(c6430ba);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5470c = true;
        this.f5469b = this.f5474g;
    }
}

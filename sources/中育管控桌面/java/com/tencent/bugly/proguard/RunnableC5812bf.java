package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.bf */
/* loaded from: classes3.dex */
public final class RunnableC5812bf implements Runnable {

    /* renamed from: a */
    final Handler f4189a;

    /* renamed from: d */
    long f4192d;

    /* renamed from: e */
    private final String f4193e;

    /* renamed from: f */
    private final List<C5807ba> f4194f = new LinkedList();

    /* renamed from: b */
    long f4190b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: g */
    private final long f4195g = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: c */
    boolean f4191c = true;

    public RunnableC5812bf(Handler handler, String str) {
        this.f4189a = handler;
        this.f4193e = str;
    }

    /* renamed from: e */
    private Thread m4127e() {
        return this.f4189a.getLooper().getThread();
    }

    /* renamed from: a */
    public final boolean m4128a() {
        return !this.f4191c && SystemClock.uptimeMillis() >= this.f4192d + this.f4190b;
    }

    /* renamed from: b */
    public final long m4129b() {
        return SystemClock.uptimeMillis() - this.f4192d;
    }

    /* renamed from: c */
    public final List<C5807ba> m4130c() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f4194f) {
            try {
                arrayList = new ArrayList(this.f4194f.size());
                for (int i6 = 0; i6 < this.f4194f.size(); i6++) {
                    C5807ba c5807ba = this.f4194f.get(i6);
                    if (!c5807ba.f4170e && jCurrentTimeMillis - c5807ba.f4167b < 200000) {
                        arrayList.add(c5807ba);
                        c5807ba.f4170e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void m4131d() {
        StringBuilder sb = new StringBuilder(1024);
        long jNanoTime = System.nanoTime();
        try {
            StackTraceElement[] stackTrace = m4127e().getStackTrace();
            if (stackTrace.length == 0) {
                sb.append("Thread does not have stack trace.\n");
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement);
                    sb.append(SignParameters.NEW_LINE);
                }
            }
        } catch (SecurityException e6) {
            sb.append("getStackTrace() encountered:\n");
            sb.append(e6.getMessage());
            sb.append(SignParameters.NEW_LINE);
            C5791al.m3929a(e6);
        }
        long jNanoTime2 = System.nanoTime();
        C5807ba c5807ba = new C5807ba(sb.toString(), System.currentTimeMillis());
        c5807ba.f4169d = jNanoTime2 - jNanoTime;
        String name = m4127e().getName();
        if (name == null) {
            name = "";
        }
        c5807ba.f4166a = name;
        synchronized (this.f4194f) {
            while (this.f4194f.size() >= 32) {
                try {
                    this.f4194f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f4194f.add(c5807ba);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4191c = true;
        this.f4190b = this.f4195g;
    }
}

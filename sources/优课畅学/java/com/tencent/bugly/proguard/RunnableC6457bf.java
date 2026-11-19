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
public final class RunnableC6457bf implements Runnable {

    /* renamed from: a */
    final Handler f4811a;

    /* renamed from: d */
    long f4814d;

    /* renamed from: e */
    private final String f4815e;

    /* renamed from: f */
    private final List<C6452ba> f4816f = new LinkedList();

    /* renamed from: b */
    long f4812b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: g */
    private final long f4817g = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: c */
    boolean f4813c = true;

    public RunnableC6457bf(Handler handler, String str) {
        this.f4811a = handler;
        this.f4815e = str;
    }

    /* renamed from: e */
    private Thread m4482e() {
        return this.f4811a.getLooper().getThread();
    }

    /* renamed from: a */
    public final boolean m4483a() {
        return !this.f4813c && SystemClock.uptimeMillis() >= this.f4814d + this.f4812b;
    }

    /* renamed from: b */
    public final long m4484b() {
        return SystemClock.uptimeMillis() - this.f4814d;
    }

    /* renamed from: c */
    public final List<C6452ba> m4485c() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f4816f) {
            try {
                arrayList = new ArrayList(this.f4816f.size());
                for (int i10 = 0; i10 < this.f4816f.size(); i10++) {
                    C6452ba c6452ba = this.f4816f.get(i10);
                    if (!c6452ba.f4792e && jCurrentTimeMillis - c6452ba.f4789b < 200000) {
                        arrayList.add(c6452ba);
                        c6452ba.f4792e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void m4486d() {
        StringBuilder sb = new StringBuilder(1024);
        long jNanoTime = System.nanoTime();
        try {
            StackTraceElement[] stackTrace = m4482e().getStackTrace();
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
            C6436al.m4284a(e10);
        }
        long jNanoTime2 = System.nanoTime();
        C6452ba c6452ba = new C6452ba(sb.toString(), System.currentTimeMillis());
        c6452ba.f4791d = jNanoTime2 - jNanoTime;
        String name = m4482e().getName();
        if (name == null) {
            name = "";
        }
        c6452ba.f4788a = name;
        synchronized (this.f4816f) {
            while (this.f4816f.size() >= 32) {
                try {
                    this.f4816f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f4816f.add(c6452ba);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4813c = true;
        this.f4812b = this.f4817g;
    }
}

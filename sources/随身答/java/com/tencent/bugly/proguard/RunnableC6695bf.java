package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.bf */
/* loaded from: classes4.dex */
public final class RunnableC6695bf implements Runnable {

    /* renamed from: a */
    final Handler f6045a;

    /* renamed from: d */
    long f6048d;

    /* renamed from: e */
    private final String f6049e;

    /* renamed from: f */
    private final List<C6690ba> f6050f = new LinkedList();

    /* renamed from: b */
    long f6046b = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: g */
    private final long f6051g = CoroutineLiveDataKt.DEFAULT_TIMEOUT;

    /* renamed from: c */
    boolean f6047c = true;

    public RunnableC6695bf(Handler handler, String str) {
        this.f6045a = handler;
        this.f6049e = str;
    }

    /* renamed from: e */
    private Thread m5301e() {
        return this.f6045a.getLooper().getThread();
    }

    /* renamed from: a */
    public final boolean m5302a() {
        return !this.f6047c && SystemClock.uptimeMillis() >= this.f6048d + this.f6046b;
    }

    /* renamed from: b */
    public final long m5303b() {
        return SystemClock.uptimeMillis() - this.f6048d;
    }

    /* renamed from: c */
    public final List<C6690ba> m5304c() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f6050f) {
            try {
                arrayList = new ArrayList(this.f6050f.size());
                for (int i9 = 0; i9 < this.f6050f.size(); i9++) {
                    C6690ba c6690ba = this.f6050f.get(i9);
                    if (!c6690ba.f6026e && jCurrentTimeMillis - c6690ba.f6023b < 200000) {
                        arrayList.add(c6690ba);
                        c6690ba.f6026e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void m5305d() {
        StringBuilder sb = new StringBuilder(1024);
        long jNanoTime = System.nanoTime();
        try {
            StackTraceElement[] stackTrace = m5301e().getStackTrace();
            if (stackTrace.length == 0) {
                sb.append("Thread does not have stack trace.\n");
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement);
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                }
            }
        } catch (SecurityException e10) {
            sb.append("getStackTrace() encountered:\n");
            sb.append(e10.getMessage());
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            C6674al.m5103a(e10);
        }
        long jNanoTime2 = System.nanoTime();
        C6690ba c6690ba = new C6690ba(sb.toString(), System.currentTimeMillis());
        c6690ba.f6025d = jNanoTime2 - jNanoTime;
        String name = m5301e().getName();
        if (name == null) {
            name = "";
        }
        c6690ba.f6022a = name;
        synchronized (this.f6050f) {
            while (this.f6050f.size() >= 32) {
                try {
                    this.f6050f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f6050f.add(c6690ba);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6047c = true;
        this.f6046b = this.f6051g;
    }
}

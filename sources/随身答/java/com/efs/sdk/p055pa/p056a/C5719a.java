package com.efs.sdk.p055pa.p056a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.p055pa.PAANRListener;
import java.util.Map;
import java.util.Set;

/* renamed from: com.efs.sdk.pa.a.a */
/* loaded from: classes3.dex */
public final class C5719a {

    /* renamed from: a */
    volatile boolean f4796a;

    /* renamed from: b */
    final Handler f4797b;

    /* renamed from: c */
    final Thread f4798c;

    /* renamed from: d */
    long f4799d;

    /* renamed from: e */
    long f4800e;

    /* renamed from: f */
    boolean f4801f;

    /* renamed from: g */
    Handler f4802g;

    /* renamed from: h */
    PAANRListener f4803h;

    /* renamed from: i */
    long f4804i;

    /* renamed from: j */
    long f4805j;

    /* renamed from: k */
    final long f4806k;

    /* renamed from: l */
    boolean f4807l;

    /* renamed from: m */
    final Runnable f4808m;

    /* renamed from: n */
    final Runnable f4809n;

    /* renamed from: o */
    private HandlerThread f4810o;

    /* renamed from: p */
    private Application f4811p;

    public C5719a(Application application, long j9) {
        this(application, j9, true);
    }

    /* renamed from: a */
    public static boolean m4210a(StringBuilder sb) {
        Set<Map.Entry<Thread, StackTraceElement[]>> setEntrySet = Thread.getAllStackTraces().entrySet();
        if (setEntrySet.size() == 0) {
            return false;
        }
        boolean z9 = false;
        for (Map.Entry<Thread, StackTraceElement[]> entry : setEntrySet) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (key.getId() == Looper.getMainLooper().getThread().getId()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(key.getName());
                sb2.append(" ");
                sb2.append(key.getPriority());
                sb2.append(" ");
                sb2.append(key.getState());
                sb2.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                for (StackTraceElement stackTraceElement : value) {
                    String string = stackTraceElement.toString();
                    sb2.append("  at  ");
                    sb2.append(string);
                    sb2.append('\n');
                }
                sb2.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                sb.insert(0, (CharSequence) sb2);
                z9 = true;
            } else {
                sb.append(key.getName());
                sb.append(" ");
                sb.append(key.getPriority());
                sb.append(" ");
                sb.append(key.getState());
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                for (StackTraceElement stackTraceElement2 : value) {
                    String string2 = stackTraceElement2.toString();
                    sb.append("  at  ");
                    sb.append(string2);
                    sb.append('\n');
                }
                sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            }
        }
        if (!z9) {
            sb.insert(0, m4209a(Looper.getMainLooper().getThread()));
        }
        return true;
    }

    public C5719a(Application application, long j9, boolean z9) {
        this.f4796a = true;
        this.f4800e = 4L;
        this.f4801f = true;
        this.f4804i = 0L;
        this.f4808m = new Runnable() { // from class: com.efs.sdk.pa.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                PAANRListener pAANRListener;
                if (C5719a.this.f4801f) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                C5719a c5719a = C5719a.this;
                long j10 = jUptimeMillis - c5719a.f4805j;
                if (j10 > c5719a.f4806k && (pAANRListener = c5719a.f4803h) != null) {
                    pAANRListener.unexcept(Long.valueOf(j10));
                }
                if (C5719a.this.f4796a) {
                    C5719a c5719a2 = C5719a.this;
                    c5719a2.f4804i = 0L;
                    c5719a2.f4796a = false;
                    C5719a c5719a3 = C5719a.this;
                    c5719a3.f4797b.postAtFrontOfQueue(c5719a3.f4809n);
                } else {
                    C5719a c5719a4 = C5719a.this;
                    c5719a4.f4804i++;
                    if (!c5719a4.f4796a) {
                        C5719a c5719a5 = C5719a.this;
                        long j11 = c5719a5.f4804i;
                        long j12 = c5719a5.f4800e;
                        if (j11 >= j12 && j11 == j12) {
                            StringBuilder sb = new StringBuilder();
                            if (c5719a5.f4807l) {
                                sb.append(C5719a.m4209a(c5719a5.f4798c));
                            } else if (C5719a.m4210a(sb)) {
                            }
                            if (c5719a5.f4803h != null && sb.length() > 0) {
                                c5719a5.f4803h.anrStack(sb.toString());
                            }
                        }
                    }
                }
                C5719a.this.f4805j = SystemClock.uptimeMillis();
                C5719a c5719a6 = C5719a.this;
                c5719a6.f4802g.postDelayed(c5719a6.f4808m, c5719a6.f4799d);
            }
        };
        this.f4809n = new Runnable() { // from class: com.efs.sdk.pa.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                C5719a.this.f4796a = true;
            }
        };
        this.f4806k = j9;
        this.f4811p = application;
        this.f4807l = z9;
        long j10 = ((long) (j9 * 0.8f)) / this.f4800e;
        this.f4799d = j10;
        if (j10 < 100) {
            this.f4799d = 100L;
            this.f4800e = j9 / 100;
        }
        Log.i("Matrix.AnrTracer", "anrTrace, final mAnrBeatTime:" + this.f4799d + ", mAnrBeatRate:" + this.f4799d);
        this.f4798c = Looper.getMainLooper().getThread();
        this.f4797b = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("ANR HANDLER THREAD");
        this.f4810o = handlerThread;
        handlerThread.start();
        this.f4802g = new Handler(this.f4810o.getLooper());
    }

    /* renamed from: a */
    public static String m4209a(Thread thread) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        sb.append(thread.getName());
        sb.append(" ");
        sb.append(thread.getPriority());
        sb.append(" ");
        sb.append(thread.getState());
        sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
        for (StackTraceElement stackTraceElement : stackTrace) {
            String string = stackTraceElement.toString();
            sb.append("  at  ");
            sb.append(string);
            sb.append('\n');
        }
        sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
        return sb.toString();
    }
}

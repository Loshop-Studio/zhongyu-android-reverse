package com.efs.sdk.p051pa.p052a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.efs.sdk.p051pa.PAANRListener;
import java.util.Map;
import java.util.Set;

/* renamed from: com.efs.sdk.pa.a.a */
/* loaded from: classes.dex */
public final class C1351a {

    /* renamed from: a */
    volatile boolean f7162a;

    /* renamed from: b */
    final Handler f7163b;

    /* renamed from: c */
    final Thread f7164c;

    /* renamed from: d */
    long f7165d;

    /* renamed from: e */
    long f7166e;

    /* renamed from: f */
    boolean f7167f;

    /* renamed from: g */
    Handler f7168g;

    /* renamed from: h */
    PAANRListener f7169h;

    /* renamed from: i */
    long f7170i;

    /* renamed from: j */
    long f7171j;

    /* renamed from: k */
    final long f7172k;

    /* renamed from: l */
    boolean f7173l;

    /* renamed from: m */
    final Runnable f7174m;

    /* renamed from: n */
    final Runnable f7175n;

    /* renamed from: o */
    private HandlerThread f7176o;

    /* renamed from: p */
    private Application f7177p;

    public C1351a(Application application, long j4) {
        this(application, j4, true);
    }

    /* renamed from: a */
    static boolean m5600a(StringBuilder sb) {
        Set<Map.Entry<Thread, StackTraceElement[]>> setEntrySet = Thread.getAllStackTraces().entrySet();
        if (setEntrySet.size() == 0) {
            return false;
        }
        boolean z3 = false;
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
                sb2.append("\n");
                for (StackTraceElement stackTraceElement : value) {
                    String string = stackTraceElement.toString();
                    sb2.append("  at  ");
                    sb2.append(string);
                    sb2.append('\n');
                }
                sb2.append("\n");
                sb.insert(0, (CharSequence) sb2);
                z3 = true;
            } else {
                sb.append(key.getName());
                sb.append(" ");
                sb.append(key.getPriority());
                sb.append(" ");
                sb.append(key.getState());
                sb.append("\n");
                for (StackTraceElement stackTraceElement2 : value) {
                    String string2 = stackTraceElement2.toString();
                    sb.append("  at  ");
                    sb.append(string2);
                    sb.append('\n');
                }
                sb.append("\n");
            }
        }
        if (!z3) {
            sb.insert(0, m5599a(Looper.getMainLooper().getThread()));
        }
        return true;
    }

    public C1351a(Application application, long j4, boolean z3) {
        this.f7162a = true;
        this.f7166e = 4L;
        this.f7167f = true;
        this.f7170i = 0L;
        this.f7174m = new Runnable() { // from class: com.efs.sdk.pa.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                PAANRListener pAANRListener;
                if (C1351a.this.f7167f) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                C1351a c1351a = C1351a.this;
                long j5 = jUptimeMillis - c1351a.f7171j;
                if (j5 > c1351a.f7172k && (pAANRListener = c1351a.f7169h) != null) {
                    pAANRListener.unexcept(Long.valueOf(j5));
                }
                if (C1351a.this.f7162a) {
                    C1351a c1351a2 = C1351a.this;
                    c1351a2.f7170i = 0L;
                    c1351a2.f7162a = false;
                    C1351a c1351a3 = C1351a.this;
                    c1351a3.f7163b.postAtFrontOfQueue(c1351a3.f7175n);
                } else {
                    C1351a c1351a4 = C1351a.this;
                    c1351a4.f7170i++;
                    if (!c1351a4.f7162a) {
                        C1351a c1351a5 = C1351a.this;
                        long j6 = c1351a5.f7170i;
                        long j7 = c1351a5.f7166e;
                        if (j6 >= j7 && j6 == j7) {
                            StringBuilder sb = new StringBuilder();
                            if (c1351a5.f7173l) {
                                sb.append(C1351a.m5599a(c1351a5.f7164c));
                            } else if (C1351a.m5600a(sb)) {
                            }
                            if (c1351a5.f7169h != null && sb.length() > 0) {
                                c1351a5.f7169h.anrStack(sb.toString());
                            }
                        }
                    }
                }
                C1351a.this.f7171j = SystemClock.uptimeMillis();
                C1351a c1351a6 = C1351a.this;
                c1351a6.f7168g.postDelayed(c1351a6.f7174m, c1351a6.f7165d);
            }
        };
        this.f7175n = new Runnable() { // from class: com.efs.sdk.pa.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                C1351a.this.f7162a = true;
            }
        };
        this.f7172k = j4;
        this.f7177p = application;
        this.f7173l = z3;
        long j5 = ((long) (j4 * 0.8f)) / this.f7166e;
        this.f7165d = j5;
        if (j5 < 100) {
            this.f7165d = 100L;
            this.f7166e = j4 / 100;
        }
        Log.i("Matrix.AnrTracer", "anrTrace, final mAnrBeatTime:" + this.f7165d + ", mAnrBeatRate:" + this.f7165d);
        this.f7164c = Looper.getMainLooper().getThread();
        this.f7163b = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("ANR HANDLER THREAD");
        this.f7176o = handlerThread;
        handlerThread.start();
        this.f7168g = new Handler(this.f7176o.getLooper());
    }

    /* renamed from: a */
    static String m5599a(Thread thread) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        sb.append(thread.getName());
        sb.append(" ");
        sb.append(thread.getPriority());
        sb.append(" ");
        sb.append(thread.getState());
        sb.append("\n");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String string = stackTraceElement.toString();
            sb.append("  at  ");
            sb.append(string);
            sb.append('\n');
        }
        sb.append("\n");
        return sb.toString();
    }
}

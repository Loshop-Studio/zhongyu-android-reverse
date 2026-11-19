package com.efs.sdk.p036pa.p037a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.efs.sdk.p036pa.PAANRListener;
import java.util.Map;
import java.util.Set;

/* renamed from: com.efs.sdk.pa.a.a */
/* loaded from: classes2.dex */
public final class C2979a {

    /* renamed from: a */
    volatile boolean f1192a;

    /* renamed from: b */
    final Handler f1193b;

    /* renamed from: c */
    final Thread f1194c;

    /* renamed from: d */
    long f1195d;

    /* renamed from: e */
    long f1196e;

    /* renamed from: f */
    boolean f1197f;

    /* renamed from: g */
    Handler f1198g;

    /* renamed from: h */
    PAANRListener f1199h;

    /* renamed from: i */
    long f1200i;

    /* renamed from: j */
    long f1201j;

    /* renamed from: k */
    final long f1202k;

    /* renamed from: l */
    boolean f1203l;

    /* renamed from: m */
    final Runnable f1204m;

    /* renamed from: n */
    final Runnable f1205n;

    /* renamed from: o */
    private HandlerThread f1206o;

    /* renamed from: p */
    private Application f1207p;

    public C2979a(Application application, long j4) {
        this(application, j4, true);
    }

    /* renamed from: a */
    public static boolean m2241a(StringBuilder sb) {
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
            sb.insert(0, m2240a(Looper.getMainLooper().getThread()));
        }
        return true;
    }

    public C2979a(Application application, long j4, boolean z3) {
        this.f1192a = true;
        this.f1196e = 4L;
        this.f1197f = true;
        this.f1200i = 0L;
        this.f1204m = new Runnable() { // from class: com.efs.sdk.pa.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                PAANRListener pAANRListener;
                if (C2979a.this.f1197f) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                C2979a c2979a = C2979a.this;
                long j5 = jUptimeMillis - c2979a.f1201j;
                if (j5 > c2979a.f1202k && (pAANRListener = c2979a.f1199h) != null) {
                    pAANRListener.unexcept(Long.valueOf(j5));
                }
                if (C2979a.this.f1192a) {
                    C2979a c2979a2 = C2979a.this;
                    c2979a2.f1200i = 0L;
                    c2979a2.f1192a = false;
                    C2979a c2979a3 = C2979a.this;
                    c2979a3.f1193b.postAtFrontOfQueue(c2979a3.f1205n);
                } else {
                    C2979a c2979a4 = C2979a.this;
                    c2979a4.f1200i++;
                    if (!c2979a4.f1192a) {
                        C2979a c2979a5 = C2979a.this;
                        long j6 = c2979a5.f1200i;
                        long j7 = c2979a5.f1196e;
                        if (j6 >= j7 && j6 == j7) {
                            StringBuilder sb = new StringBuilder();
                            if (c2979a5.f1203l) {
                                sb.append(C2979a.m2240a(c2979a5.f1194c));
                            } else if (C2979a.m2241a(sb)) {
                            }
                            if (c2979a5.f1199h != null && sb.length() > 0) {
                                c2979a5.f1199h.anrStack(sb.toString());
                            }
                        }
                    }
                }
                C2979a.this.f1201j = SystemClock.uptimeMillis();
                C2979a c2979a6 = C2979a.this;
                c2979a6.f1198g.postDelayed(c2979a6.f1204m, c2979a6.f1195d);
            }
        };
        this.f1205n = new Runnable() { // from class: com.efs.sdk.pa.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                C2979a.this.f1192a = true;
            }
        };
        this.f1202k = j4;
        this.f1207p = application;
        this.f1203l = z3;
        long j5 = ((long) (j4 * 0.8f)) / this.f1196e;
        this.f1195d = j5;
        if (j5 < 100) {
            this.f1195d = 100L;
            this.f1196e = j4 / 100;
        }
        Log.i("Matrix.AnrTracer", "anrTrace, final mAnrBeatTime:" + this.f1195d + ", mAnrBeatRate:" + this.f1195d);
        this.f1194c = Looper.getMainLooper().getThread();
        this.f1193b = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("ANR HANDLER THREAD");
        this.f1206o = handlerThread;
        handlerThread.start();
        this.f1198g = new Handler(this.f1206o.getLooper());
    }

    /* renamed from: a */
    public static String m2240a(Thread thread) {
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

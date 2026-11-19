package io.reactivex.internal.schedulers;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.k */
/* loaded from: classes.dex */
public abstract class AbstractC5725k {

    /* renamed from: a */
    public static final boolean f9052a;

    /* renamed from: b */
    public static final int f9053b;

    /* renamed from: c */
    public static final AtomicReference f9054c = new AtomicReference();

    /* renamed from: d */
    public static final ConcurrentHashMap f9055d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[LOOP:0: B:19:0x003c->B:28:0x006e, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            io.reactivex.internal.schedulers.AbstractC5725k.f9054c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            io.reactivex.internal.schedulers.AbstractC5725k.f9055d = r0
            java.lang.String r0 = "rx2.purge-enabled"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L19
            goto L21
        L19:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r0 = r1
        L22:
            io.reactivex.internal.schedulers.AbstractC5725k.f9052a = r0
            java.lang.String r2 = "rx2.purge-period-seconds"
            if (r0 == 0) goto L35
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L30
            goto L35
        L30:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L35
            goto L36
        L35:
            r0 = r1
        L36:
            io.reactivex.internal.schedulers.AbstractC5725k.f9053b = r0
            boolean r0 = io.reactivex.internal.schedulers.AbstractC5725k.f9052a
            if (r0 == 0) goto L72
        L3c:
            java.util.concurrent.atomic.AtomicReference r0 = io.reactivex.internal.schedulers.AbstractC5725k.f9054c
            java.lang.Object r2 = r0.get()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            if (r2 == 0) goto L47
            goto L72
        L47:
            io.reactivex.internal.schedulers.RxThreadFactory r3 = new io.reactivex.internal.schedulers.RxThreadFactory
            java.lang.String r4 = "RxSchedulerPurge"
            r3.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r3)
        L52:
            boolean r3 = r0.compareAndSet(r2, r5)
            if (r3 == 0) goto L68
            com.blankj.utilcode.util.a r6 = new com.blankj.utilcode.util.a
            r0 = 6
            r6.<init>(r0)
            int r0 = io.reactivex.internal.schedulers.AbstractC5725k.f9053b
            long r7 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r9 = r7
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L72
        L68:
            java.lang.Object r3 = r0.get()
            if (r3 == r2) goto L52
            r5.shutdownNow()
            goto L3c
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.schedulers.AbstractC5725k.<clinit>():void");
    }
}

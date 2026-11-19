package p153r7;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.animation.core.AnimationKt;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC5830k;
import p016b0.RunnableC3059a;
import p139p7.AbstractC6396c;
import p139p7.ThreadFactoryC6395b;
import p140q.C6400d;

/* renamed from: r7.c */
/* loaded from: classes4.dex */
public final class C6481c {

    /* renamed from: h */
    public static final C6481c f10656h;

    /* renamed from: i */
    public static final Logger f10657i;

    /* renamed from: a */
    public final C6400d f10658a;

    /* renamed from: c */
    public boolean f10660c;

    /* renamed from: d */
    public long f10661d;

    /* renamed from: b */
    public int f10659b = 10000;

    /* renamed from: e */
    public final ArrayList f10662e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f10663f = new ArrayList();

    /* renamed from: g */
    public final RunnableC3059a f10664g = new RunnableC3059a(this, 18);

    static {
        String name = AbstractC6396c.f10493h + " TaskRunner";
        AbstractC5830k.m5330g(name, "name");
        f10656h = new C6481c(new C6400d(new ThreadFactoryC6395b(name, true)));
        Logger logger = Logger.getLogger(C6481c.class.getName());
        AbstractC5830k.m5329f(logger, "getLogger(TaskRunner::class.java.name)");
        f10657i = logger;
    }

    public C6481c(C6400d c6400d) {
        this.f10658a = c6400d;
    }

    /* renamed from: a */
    public static final void m6132a(C6481c c6481c, AbstractC6479a abstractC6479a) {
        byte[] bArr = AbstractC6396c.f10486a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC6479a.f10646a);
        try {
            long jMo5932a = abstractC6479a.mo5932a();
            synchronized (c6481c) {
                c6481c.m6133b(abstractC6479a, jMo5932a);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (c6481c) {
                c6481c.m6133b(abstractC6479a, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m6133b(AbstractC6479a abstractC6479a, long j7) {
        byte[] bArr = AbstractC6396c.f10486a;
        C6480b c6480b = abstractC6479a.f10648c;
        AbstractC5830k.m5327d(c6480b);
        if (c6480b.f10653d != abstractC6479a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z8 = c6480b.f10655f;
        c6480b.f10655f = false;
        c6480b.f10653d = null;
        this.f10662e.remove(c6480b);
        if (j7 != -1 && !z8 && !c6480b.f10652c) {
            c6480b.m6130c(abstractC6479a, j7, true);
        }
        if (c6480b.f10654e.isEmpty()) {
            return;
        }
        this.f10663f.add(c6480b);
    }

    /* renamed from: c */
    public final AbstractC6479a m6134c() {
        long j7;
        AbstractC6479a abstractC6479a;
        boolean z8;
        byte[] bArr = AbstractC6396c.f10486a;
        while (true) {
            ArrayList arrayList = this.f10663f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i = 0;
            AbstractC6479a abstractC6479a2 = null;
            while (true) {
                if (i >= size) {
                    j7 = jNanoTime;
                    abstractC6479a = null;
                    z8 = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                AbstractC6479a abstractC6479a3 = (AbstractC6479a) ((C6480b) obj).f10654e.get(0);
                j7 = jNanoTime;
                abstractC6479a = null;
                long jMax = Math.max(0L, abstractC6479a3.f10649d - j7);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC6479a2 != null) {
                        z8 = true;
                        break;
                    }
                    abstractC6479a2 = abstractC6479a3;
                }
                jNanoTime = j7;
            }
            ArrayList arrayList2 = this.f10662e;
            if (abstractC6479a2 != null) {
                byte[] bArr2 = AbstractC6396c.f10486a;
                abstractC6479a2.f10649d = -1L;
                C6480b c6480b = abstractC6479a2.f10648c;
                AbstractC5830k.m5327d(c6480b);
                c6480b.f10654e.remove(abstractC6479a2);
                arrayList.remove(c6480b);
                c6480b.f10653d = abstractC6479a2;
                arrayList2.add(c6480b);
                if (z8 || (!this.f10660c && !arrayList.isEmpty())) {
                    RunnableC3059a runnable = this.f10664g;
                    AbstractC5830k.m5330g(runnable, "runnable");
                    ((ThreadPoolExecutor) this.f10658a.f10500a).execute(runnable);
                }
                return abstractC6479a2;
            }
            if (this.f10660c) {
                if (jMin >= this.f10661d - j7) {
                    return abstractC6479a;
                }
                notify();
                return abstractC6479a;
            }
            this.f10660c = true;
            this.f10661d = j7 + jMin;
            try {
                try {
                    long j8 = jMin / AnimationKt.MillisToNanos;
                    long j9 = jMin - (AnimationKt.MillisToNanos * j8);
                    if (j8 > 0 || jMin > 0) {
                        wait(j8, (int) j9);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((C6480b) arrayList2.get(size2)).m6128a();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        C6480b c6480b2 = (C6480b) arrayList.get(size3);
                        c6480b2.m6128a();
                        if (c6480b2.f10654e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f10660c = false;
            }
        }
    }

    /* renamed from: d */
    public final void m6135d(C6480b taskQueue) {
        AbstractC5830k.m5330g(taskQueue, "taskQueue");
        byte[] bArr = AbstractC6396c.f10486a;
        if (taskQueue.f10653d == null) {
            boolean zIsEmpty = taskQueue.f10654e.isEmpty();
            ArrayList arrayList = this.f10663f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                AbstractC5830k.m5330g(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f10660c) {
            notify();
            return;
        }
        RunnableC3059a runnable = this.f10664g;
        AbstractC5830k.m5330g(runnable, "runnable");
        ((ThreadPoolExecutor) this.f10658a.f10500a).execute(runnable);
    }

    /* renamed from: e */
    public final C6480b m6136e() {
        int i;
        synchronized (this) {
            i = this.f10659b;
            this.f10659b = i + 1;
        }
        return new C6480b(this, AbstractC0037f.m81f(i, "Q"));
    }
}

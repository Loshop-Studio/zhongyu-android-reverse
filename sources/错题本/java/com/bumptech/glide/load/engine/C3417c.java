package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.support.v4.media.AbstractC0037f;
import android.util.Log;
import com.bumptech.glide.C3409c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.C3420a;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import io.reactivex.internal.operators.observable.C5712h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p016b0.AbstractC3085o;
import p016b0.C3060a0;
import p016b0.C3063c;
import p016b0.C3065d;
import p016b0.C3066d0;
import p016b0.C3071g;
import p016b0.C3077j;
import p016b0.C3080k0;
import p016b0.C3087q;
import p016b0.C3089s;
import p016b0.C3090t;
import p016b0.C3093w;
import p016b0.C3095y;
import p016b0.InterfaceC3072g0;
import p016b0.InterfaceC3094x;
import p016b0.InterfaceC3096z;
import p039d0.C5403f;
import p048e0.ExecutorServiceC5452b;
import p129o2.C6268a;
import p180v0.AbstractC6659f;
import p202y.C6763f;
import p202y.InterfaceC6760c;

/* renamed from: com.bumptech.glide.load.engine.c */
/* loaded from: classes2.dex */
public final class C3417c implements InterfaceC3094x, InterfaceC3096z {

    /* renamed from: i */
    public static final boolean f2290i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C3066d0 f2291a;

    /* renamed from: b */
    public final C5712h f2292b;

    /* renamed from: c */
    public final C5403f f2293c;

    /* renamed from: d */
    public final C3089s f2294d;

    /* renamed from: e */
    public final C3080k0 f2295e;

    /* renamed from: f */
    public final C3090t f2296f;

    /* renamed from: g */
    public final C3087q f2297g;

    /* renamed from: h */
    public final C3065d f2298h;

    public C3417c(C5403f c5403f, C6268a c6268a, ExecutorServiceC5452b executorServiceC5452b, ExecutorServiceC5452b executorServiceC5452b2, ExecutorServiceC5452b executorServiceC5452b3, ExecutorServiceC5452b executorServiceC5452b4) throws Throwable {
        this.f2293c = c5403f;
        C3090t c3090t = new C3090t(c6268a);
        this.f2296f = c3090t;
        C3065d c3065d = new C3065d(0);
        this.f2298h = c3065d;
        synchronized (this) {
            try {
                try {
                    synchronized (c3065d) {
                        try {
                            c3065d.f1398d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.f2292b = new C5712h(1);
                    this.f2291a = new C3066d0(0);
                    this.f2294d = new C3089s(executorServiceC5452b, executorServiceC5452b2, executorServiceC5452b3, executorServiceC5452b4, this, this);
                    this.f2297g = new C3087q(c3090t);
                    this.f2295e = new C3080k0();
                    c5403f.f8355d = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static void m2406c(String str, long j7, C3095y c3095y) {
        StringBuilder sbM98w = AbstractC0037f.m98w(str, " in ");
        sbM98w.append(AbstractC6659f.m6315a(j7));
        sbM98w.append("ms, key: ");
        sbM98w.append(c3095y);
        Log.v("Engine", sbM98w.toString());
    }

    /* renamed from: f */
    public static void m2407f(InterfaceC3072g0 interfaceC3072g0) {
        if (!(interfaceC3072g0 instanceof C3060a0)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C3060a0) interfaceC3072g0).m2006c();
    }

    /* renamed from: a */
    public final C3071g m2408a(C3409c c3409c, Object obj, InterfaceC6760c interfaceC6760c, int i, int i8, Class cls, Class cls2, Priority priority, AbstractC3085o abstractC3085o, CachedHashCodeArrayMap cachedHashCodeArrayMap, boolean z8, boolean z9, C6763f c6763f, boolean z10, boolean z11, C3420a c3420a, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f2290i) {
            int i9 = AbstractC6659f.f11234b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f2292b.getClass();
        C3095y c3095y = new C3095y(obj, interfaceC6760c, i, i8, cachedHashCodeArrayMap, cls, cls2, c6763f);
        synchronized (this) {
            try {
                C3060a0 c3060a0M2409b = m2409b(c3095y, z10, jElapsedRealtimeNanos);
                if (c3060a0M2409b == null) {
                    return m2412g(c3409c, obj, interfaceC6760c, i, i8, cls, cls2, priority, abstractC3085o, cachedHashCodeArrayMap, z8, z9, c6763f, z10, z11, c3420a, executor, c3095y, jElapsedRealtimeNanos);
                }
                c3420a.m2429k(c3060a0M2409b, DataSource.MEMORY_CACHE);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final C3060a0 m2409b(C3095y c3095y, boolean z8, long j7) throws Throwable {
        Throwable th;
        C3060a0 c3060a0;
        Throwable th2;
        C3417c c3417c;
        C3095y c3095y2;
        C3060a0 c3060a02;
        if (z8) {
            C3065d c3065d = this.f2298h;
            synchronized (c3065d) {
                try {
                    C3063c c3063c = (C3063c) ((HashMap) c3065d.f1396b).get(c3095y);
                    if (c3063c == null) {
                        c3060a0 = null;
                    } else {
                        c3060a0 = (C3060a0) c3063c.get();
                        if (c3060a0 == null) {
                            try {
                                c3065d.m2010d(c3063c);
                            } catch (Throwable th3) {
                                th = th3;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                    th = th4;
                                }
                            }
                        }
                    }
                    if (c3060a0 != null) {
                        c3060a0.m2005b();
                    }
                    if (c3060a0 != null) {
                        if (f2290i) {
                            m2406c("Loaded resource from active resources", j7, c3095y);
                        }
                        return c3060a0;
                    }
                    C5403f c5403f = this.f2293c;
                    synchronized (c5403f) {
                        try {
                            Object objRemove = c5403f.f11235a.remove(c3095y);
                            if (objRemove != null) {
                                try {
                                    c5403f.f11237c -= c5403f.mo4797b(objRemove);
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    while (true) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                        }
                                        th2 = th6;
                                    }
                                }
                            }
                            InterfaceC3072g0 interfaceC3072g0 = (InterfaceC3072g0) objRemove;
                            if (interfaceC3072g0 == null) {
                                c3417c = this;
                                c3095y2 = c3095y;
                                c3060a02 = null;
                            } else if (interfaceC3072g0 instanceof C3060a0) {
                                c3060a02 = (C3060a0) interfaceC3072g0;
                                c3417c = this;
                                c3095y2 = c3095y;
                            } else {
                                c3417c = this;
                                c3095y2 = c3095y;
                                c3060a02 = new C3060a0(interfaceC3072g0, true, true, c3095y2, c3417c);
                            }
                            if (c3060a02 != null) {
                                c3060a02.m2005b();
                                c3417c.f2298h.m2007a(c3095y2, c3060a02);
                            }
                            if (c3060a02 != null) {
                                if (f2290i) {
                                    m2406c("Loaded resource from cache", j7, c3095y2);
                                }
                                return c3060a02;
                            }
                        } catch (Throwable th7) {
                            th2 = th7;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final synchronized void m2410d(C3093w c3093w, InterfaceC6760c interfaceC6760c, C3060a0 c3060a0) {
        if (c3060a0 != null) {
            try {
                if (c3060a0.f1382a) {
                    this.f2298h.m2007a(interfaceC6760c, c3060a0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3066d0 c3066d0 = this.f2291a;
        c3066d0.getClass();
        c3093w.getClass();
        HashMap map = c3066d0.f1399a;
        if (c3093w.equals(map.get(interfaceC6760c))) {
            map.remove(interfaceC6760c);
        }
    }

    /* renamed from: e */
    public final void m2411e(InterfaceC6760c interfaceC6760c, C3060a0 c3060a0) {
        C3065d c3065d = this.f2298h;
        synchronized (c3065d) {
            C3063c c3063c = (C3063c) ((HashMap) c3065d.f1396b).remove(interfaceC6760c);
            if (c3063c != null) {
                c3063c.f1394c = null;
                c3063c.clear();
            }
        }
        if (c3060a0.f1382a) {
        } else {
            this.f2295e.m2039i(c3060a0, false);
        }
    }

    /* renamed from: g */
    public final C3071g m2412g(C3409c c3409c, Object obj, InterfaceC6760c interfaceC6760c, int i, int i8, Class cls, Class cls2, Priority priority, AbstractC3085o abstractC3085o, Map map, boolean z8, boolean z9, C6763f c6763f, boolean z10, boolean z11, C3420a c3420a, Executor executor, C3095y c3095y, long j7) {
        C3093w c3093w = (C3093w) this.f2291a.f1399a.get(c3095y);
        if (c3093w != null) {
            c3093w.m2054a(c3420a, executor);
            if (f2290i) {
                m2406c("Added to existing load", j7, c3095y);
            }
            return new C3071g(this, c3420a, c3093w);
        }
        C3093w c3093w2 = (C3093w) this.f2294d.f1494g.acquire();
        synchronized (c3093w2) {
            c3093w2.f1511k = c3095y;
            c3093w2.f1512l = z10;
            c3093w2.f1513m = z11;
        }
        C3087q c3087q = this.f2297g;
        RunnableC3416b runnableC3416b = (RunnableC3416b) c3087q.f1485b.acquire();
        int i9 = c3087q.f1486c;
        c3087q.f1486c = i9 + 1;
        C3077j c3077j = runnableC3416b.f2264a;
        C3090t c3090t = runnableC3416b.f2267d;
        c3077j.f1444c = c3409c;
        c3077j.f1445d = obj;
        c3077j.f1455n = interfaceC6760c;
        c3077j.f1446e = i;
        c3077j.f1447f = i8;
        c3077j.f1457p = abstractC3085o;
        c3077j.f1448g = cls;
        c3077j.f1449h = c3090t;
        c3077j.f1452k = cls2;
        c3077j.f1456o = priority;
        c3077j.f1450i = c6763f;
        c3077j.f1451j = map;
        c3077j.f1458q = z8;
        c3077j.f1459r = z9;
        runnableC3416b.f2271h = c3409c;
        runnableC3416b.f2272i = interfaceC6760c;
        runnableC3416b.f2273j = priority;
        runnableC3416b.f2274k = c3095y;
        runnableC3416b.f2275l = i;
        runnableC3416b.f2276m = i8;
        runnableC3416b.f2277n = abstractC3085o;
        runnableC3416b.f2278o = c6763f;
        runnableC3416b.f2279p = c3093w2;
        runnableC3416b.f2280q = i9;
        runnableC3416b.f2282s = DecodeJob$RunReason.INITIALIZE;
        runnableC3416b.f2284u = obj;
        C3066d0 c3066d0 = this.f2291a;
        c3066d0.getClass();
        c3066d0.f1399a.put(c3095y, c3093w2);
        c3093w2.m2054a(c3420a, executor);
        synchronized (c3093w2) {
            c3093w2.f1520t = runnableC3416b;
            DecodeJob$Stage decodeJob$StageM2398h = runnableC3416b.m2398h(DecodeJob$Stage.INITIALIZE);
            ((decodeJob$StageM2398h == DecodeJob$Stage.RESOURCE_CACHE || decodeJob$StageM2398h == DecodeJob$Stage.DATA_CACHE) ? c3093w2.f1507g : c3093w2.f1513m ? c3093w2.f1509i : c3093w2.f1508h).execute(runnableC3416b);
        }
        if (f2290i) {
            m2406c("Started new load", j7, c3095y);
        }
        return new C3071g(this, c3420a, c3093w2);
    }
}

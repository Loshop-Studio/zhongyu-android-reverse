package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.media.AbstractC0037f;
import android.util.Log;
import com.bumptech.glide.C3409c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C3417c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p016b0.AbstractC3085o;
import p016b0.C3071g;
import p016b0.C3093w;
import p016b0.InterfaceC3072g0;
import p147r0.AbstractC6443a;
import p147r0.FutureC6445c;
import p147r0.InterfaceC6444b;
import p155s0.InterfaceC6549h;
import p155s0.InterfaceC6550i;
import p163t0.C6580a;
import p169t6.AbstractC6600a;
import p180v0.AbstractC6659f;
import p180v0.AbstractC6664k;
import p187w0.C6700h;
import p202y.C6763f;
import p202y.InterfaceC6760c;

/* renamed from: com.bumptech.glide.request.a */
/* loaded from: classes2.dex */
public final class C3420a implements InterfaceC6444b, InterfaceC6549h {

    /* renamed from: B */
    public static final boolean f2332B = Log.isLoggable("Request", 2);

    /* renamed from: A */
    public boolean f2333A;

    /* renamed from: a */
    public final String f2334a;

    /* renamed from: b */
    public final C6700h f2335b;

    /* renamed from: c */
    public final Object f2336c;

    /* renamed from: d */
    public final FutureC6445c f2337d;

    /* renamed from: e */
    public final Context f2338e;

    /* renamed from: f */
    public final C3409c f2339f;

    /* renamed from: g */
    public final Object f2340g;

    /* renamed from: h */
    public final Class f2341h;

    /* renamed from: i */
    public final AbstractC6443a f2342i;

    /* renamed from: j */
    public final int f2343j;

    /* renamed from: k */
    public final int f2344k;

    /* renamed from: l */
    public final Priority f2345l;

    /* renamed from: m */
    public final InterfaceC6550i f2346m;

    /* renamed from: n */
    public final List f2347n;

    /* renamed from: o */
    public final C6580a f2348o;

    /* renamed from: p */
    public final Executor f2349p;

    /* renamed from: q */
    public InterfaceC3072g0 f2350q;

    /* renamed from: r */
    public C3071g f2351r;

    /* renamed from: s */
    public long f2352s;

    /* renamed from: t */
    public volatile C3417c f2353t;

    /* renamed from: u */
    public SingleRequest$Status f2354u;

    /* renamed from: v */
    public Drawable f2355v;

    /* renamed from: w */
    public Drawable f2356w;

    /* renamed from: x */
    public Drawable f2357x;

    /* renamed from: y */
    public int f2358y;

    /* renamed from: z */
    public int f2359z;

    public C3420a(Context context, C3409c c3409c, Object obj, Object obj2, Class cls, AbstractC6443a abstractC6443a, int i, int i8, Priority priority, InterfaceC6550i interfaceC6550i, FutureC6445c futureC6445c, ArrayList arrayList, C3417c c3417c, C6580a c6580a, Executor executor) {
        this.f2334a = f2332B ? String.valueOf(hashCode()) : null;
        this.f2335b = new C6700h();
        this.f2336c = obj;
        this.f2338e = context;
        this.f2339f = c3409c;
        this.f2340g = obj2;
        this.f2341h = cls;
        this.f2342i = abstractC6443a;
        this.f2343j = i;
        this.f2344k = i8;
        this.f2345l = priority;
        this.f2346m = interfaceC6550i;
        this.f2337d = futureC6445c;
        this.f2347n = arrayList;
        this.f2353t = c3417c;
        this.f2348o = c6580a;
        this.f2349p = executor;
        this.f2354u = SingleRequest$Status.PENDING;
        c3409c.getClass();
    }

    /* renamed from: a */
    public final void m2419a() {
        synchronized (this.f2336c) {
            try {
                if (this.f2333A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f2335b.m6399a();
                int i = AbstractC6659f.f11234b;
                this.f2352s = SystemClock.elapsedRealtimeNanos();
                if (this.f2340g == null) {
                    if (AbstractC6664k.m6327g(this.f2343j, this.f2344k)) {
                        this.f2358y = this.f2343j;
                        this.f2359z = this.f2344k;
                    }
                    if (this.f2357x == null) {
                        this.f2342i.getClass();
                        this.f2357x = null;
                    }
                    m2428j(new GlideException("Received null model"), this.f2357x == null ? 5 : 3);
                    return;
                }
                SingleRequest$Status singleRequest$Status = this.f2354u;
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.RUNNING;
                if (singleRequest$Status == singleRequest$Status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (singleRequest$Status == SingleRequest$Status.COMPLETE) {
                    m2429k(this.f2350q, DataSource.MEMORY_CACHE);
                    return;
                }
                SingleRequest$Status singleRequest$Status3 = SingleRequest$Status.WAITING_FOR_SIZE;
                this.f2354u = singleRequest$Status3;
                if (AbstractC6664k.m6327g(this.f2343j, this.f2344k)) {
                    m2431m(this.f2343j, this.f2344k);
                } else {
                    this.f2346m.mo6103d(this);
                }
                SingleRequest$Status singleRequest$Status4 = this.f2354u;
                if (singleRequest$Status4 == singleRequest$Status2 || singleRequest$Status4 == singleRequest$Status3) {
                    this.f2346m.mo6104e(m2422d());
                }
                if (f2332B) {
                    m2427i("finished run method in " + AbstractC6659f.m6315a(this.f2352s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m2420b() {
        if (this.f2333A) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f2335b.m6399a();
        this.f2346m.mo6102b(this);
        C3071g c3071g = this.f2351r;
        if (c3071g != null) {
            synchronized (((C3417c) c3071g.f1422d)) {
                ((C3093w) c3071g.f1420b).m2060h((C3420a) c3071g.f1421c);
            }
            this.f2351r = null;
        }
    }

    /* renamed from: c */
    public final void m2421c() {
        synchronized (this.f2336c) {
            try {
                if (this.f2333A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f2335b.m6399a();
                SingleRequest$Status singleRequest$Status = this.f2354u;
                SingleRequest$Status singleRequest$Status2 = SingleRequest$Status.CLEARED;
                if (singleRequest$Status == singleRequest$Status2) {
                    return;
                }
                m2420b();
                InterfaceC3072g0 interfaceC3072g0 = this.f2350q;
                if (interfaceC3072g0 != null) {
                    this.f2350q = null;
                } else {
                    interfaceC3072g0 = null;
                }
                this.f2346m.mo5786f(m2422d());
                this.f2354u = singleRequest$Status2;
                if (interfaceC3072g0 != null) {
                    this.f2353t.getClass();
                    C3417c.m2407f(interfaceC3072g0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final Drawable m2422d() {
        if (this.f2356w == null) {
            AbstractC6443a abstractC6443a = this.f2342i;
            abstractC6443a.getClass();
            this.f2356w = null;
            int i = abstractC6443a.f10567e;
            if (i > 0) {
                this.f2356w = m2426h(i);
            }
        }
        return this.f2356w;
    }

    /* renamed from: e */
    public final boolean m2423e() {
        boolean z8;
        synchronized (this.f2336c) {
            z8 = this.f2354u == SingleRequest$Status.CLEARED;
        }
        return z8;
    }

    /* renamed from: f */
    public final boolean m2424f() {
        boolean z8;
        synchronized (this.f2336c) {
            z8 = this.f2354u == SingleRequest$Status.COMPLETE;
        }
        return z8;
    }

    /* renamed from: g */
    public final boolean m2425g() {
        boolean z8;
        synchronized (this.f2336c) {
            try {
                SingleRequest$Status singleRequest$Status = this.f2354u;
                z8 = singleRequest$Status == SingleRequest$Status.RUNNING || singleRequest$Status == SingleRequest$Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z8;
    }

    /* renamed from: h */
    public final Drawable m2426h(int i) {
        this.f2342i.getClass();
        Resources.Theme theme = this.f2338e.getTheme();
        C3409c c3409c = this.f2339f;
        return AbstractC6600a.m6233d(c3409c, c3409c, i, theme);
    }

    /* renamed from: i */
    public final void m2427i(String str) {
        StringBuilder sbM98w = AbstractC0037f.m98w(str, " this: ");
        sbM98w.append(this.f2334a);
        Log.v("Request", sbM98w.toString());
    }

    /* renamed from: j */
    public final void m2428j(GlideException glideException, int i) {
        boolean zM6107j;
        Drawable drawableM2422d;
        this.f2335b.m6399a();
        synchronized (this.f2336c) {
            try {
                glideException.setOrigin(null);
                int i8 = this.f2339f.f2215h;
                if (i8 <= i) {
                    Log.w("Glide", "Load failed for " + this.f2340g + " with size [" + this.f2358y + "x" + this.f2359z + "]", glideException);
                    if (i8 <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f2351r = null;
                this.f2354u = SingleRequest$Status.FAILED;
                boolean z8 = true;
                this.f2333A = true;
                try {
                    List list = this.f2347n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zM6107j = false;
                        while (it.hasNext()) {
                            zM6107j |= ((FutureC6445c) it.next()).m6107j(glideException);
                        }
                    } else {
                        zM6107j = false;
                    }
                    FutureC6445c futureC6445c = this.f2337d;
                    if (futureC6445c == null || !futureC6445c.m6107j(glideException)) {
                        z8 = false;
                    }
                    if (!(zM6107j | z8)) {
                        if (this.f2340g == null) {
                            if (this.f2357x == null) {
                                this.f2342i.getClass();
                                this.f2357x = null;
                            }
                            drawableM2422d = this.f2357x;
                        } else {
                            drawableM2422d = null;
                        }
                        if (drawableM2422d == null) {
                            if (this.f2355v == null) {
                                AbstractC6443a abstractC6443a = this.f2342i;
                                abstractC6443a.getClass();
                                this.f2355v = null;
                                int i9 = abstractC6443a.f10566d;
                                if (i9 > 0) {
                                    this.f2355v = m2426h(i9);
                                }
                            }
                            drawableM2422d = this.f2355v;
                        }
                        if (drawableM2422d == null) {
                            drawableM2422d = m2422d();
                        }
                        this.f2346m.mo2381h(drawableM2422d);
                    }
                    this.f2333A = false;
                } catch (Throwable th) {
                    this.f2333A = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final void m2429k(InterfaceC3072g0 interfaceC3072g0, DataSource dataSource) {
        this.f2335b.m6399a();
        InterfaceC3072g0 interfaceC3072g02 = null;
        try {
            synchronized (this.f2336c) {
                try {
                    this.f2351r = null;
                    if (interfaceC3072g0 == null) {
                        m2428j(new GlideException("Expected to receive a Resource<R> with an object of " + this.f2341h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC3072g0.get();
                    if (obj != null && this.f2341h.isAssignableFrom(obj.getClass())) {
                        m2430l(interfaceC3072g0, obj, dataSource);
                        return;
                    }
                    try {
                        this.f2350q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f2341h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(interfaceC3072g0);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        m2428j(new GlideException(sb.toString()), 5);
                        this.f2353t.getClass();
                        C3417c.m2407f(interfaceC3072g0);
                    } catch (Throwable th) {
                        interfaceC3072g02 = interfaceC3072g0;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC3072g02 != null) {
                this.f2353t.getClass();
                C3417c.m2407f(interfaceC3072g02);
            }
            throw th3;
        }
    }

    /* renamed from: l */
    public final void m2430l(InterfaceC3072g0 interfaceC3072g0, Object obj, DataSource dataSource) {
        boolean zM6108k;
        this.f2354u = SingleRequest$Status.COMPLETE;
        this.f2350q = interfaceC3072g0;
        if (this.f2339f.f2215h <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + dataSource + " for " + this.f2340g + " with size [" + this.f2358y + "x" + this.f2359z + "] in " + AbstractC6659f.m6315a(this.f2352s) + " ms");
        }
        boolean z8 = true;
        this.f2333A = true;
        try {
            List list = this.f2347n;
            if (list != null) {
                Iterator it = list.iterator();
                zM6108k = false;
                while (it.hasNext()) {
                    zM6108k |= ((FutureC6445c) it.next()).m6108k(obj);
                }
            } else {
                zM6108k = false;
            }
            FutureC6445c futureC6445c = this.f2337d;
            if (futureC6445c == null || !futureC6445c.m6108k(obj)) {
                z8 = false;
            }
            if (!(z8 | zM6108k)) {
                this.f2348o.getClass();
                this.f2346m.mo2380c(obj);
            }
            this.f2333A = false;
        } catch (Throwable th) {
            this.f2333A = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final void m2431m(int i, int i8) throws Throwable {
        C3420a c3420a = this;
        int iRound = i;
        c3420a.f2335b.m6399a();
        Object obj = c3420a.f2336c;
        synchronized (obj) {
            try {
                try {
                    boolean z8 = f2332B;
                    if (z8) {
                        c3420a.m2427i("Got onSizeReady in " + AbstractC6659f.m6315a(c3420a.f2352s));
                    }
                    if (c3420a.f2354u == SingleRequest$Status.WAITING_FOR_SIZE) {
                        SingleRequest$Status singleRequest$Status = SingleRequest$Status.RUNNING;
                        c3420a.f2354u = singleRequest$Status;
                        c3420a.f2342i.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        c3420a.f2358y = iRound;
                        c3420a.f2359z = i8 == Integer.MIN_VALUE ? i8 : Math.round(1.0f * i8);
                        if (z8) {
                            c3420a.m2427i("finished setup for calling load in " + AbstractC6659f.m6315a(c3420a.f2352s));
                        }
                        C3417c c3417c = c3420a.f2353t;
                        C3409c c3409c = c3420a.f2339f;
                        Object obj2 = c3420a.f2340g;
                        AbstractC6443a abstractC6443a = c3420a.f2342i;
                        InterfaceC6760c interfaceC6760c = abstractC6443a.f10571i;
                        try {
                            int i9 = c3420a.f2358y;
                            int i10 = c3420a.f2359z;
                            Class cls = abstractC6443a.f10575m;
                            try {
                                Class cls2 = c3420a.f2341h;
                                Priority priority = c3420a.f2345l;
                                AbstractC3085o abstractC3085o = abstractC6443a.f10564b;
                                try {
                                    CachedHashCodeArrayMap cachedHashCodeArrayMap = abstractC6443a.f10574l;
                                    boolean z9 = abstractC6443a.f10572j;
                                    boolean z10 = abstractC6443a.f10578p;
                                    try {
                                        C6763f c6763f = abstractC6443a.f10573k;
                                        boolean z11 = abstractC6443a.f10568f;
                                        boolean z12 = abstractC6443a.f10579q;
                                        Executor executor = c3420a.f2349p;
                                        c3420a = obj;
                                        try {
                                            c3420a.f2351r = c3417c.m2408a(c3409c, obj2, interfaceC6760c, i9, i10, cls, cls2, priority, abstractC3085o, cachedHashCodeArrayMap, z9, z10, c6763f, z11, z12, c3420a, executor);
                                            if (c3420a.f2354u != singleRequest$Status) {
                                                c3420a.f2351r = null;
                                            }
                                            if (z8) {
                                                c3420a.m2427i("finished onSizeReady in " + AbstractC6659f.m6315a(c3420a.f2352s));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c3420a = obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c3420a = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c3420a = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c3420a = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                c3420a = obj;
            }
        }
    }
}

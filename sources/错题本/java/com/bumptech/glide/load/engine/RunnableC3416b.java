package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0039h;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import com.bumptech.glide.C3409c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import io.reactivex.internal.operators.observable.C5711g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p016b0.AbstractC3085o;
import p016b0.C3060a0;
import p016b0.C3067e;
import p016b0.C3068e0;
import p016b0.C3070f0;
import p016b0.C3071g;
import p016b0.C3074h0;
import p016b0.C3077j;
import p016b0.C3079k;
import p016b0.C3082l0;
import p016b0.C3090t;
import p016b0.C3091u;
import p016b0.C3092v;
import p016b0.C3093w;
import p016b0.C3095y;
import p016b0.InterfaceC3064c0;
import p016b0.InterfaceC3072g0;
import p016b0.InterfaceC3073h;
import p016b0.InterfaceC3075i;
import p016b0.InterfaceC3096z;
import p077i0.C5657m;
import p180v0.AbstractC6659f;
import p187w0.C6696d;
import p187w0.C6700h;
import p187w0.InterfaceC6697e;
import p202y.C6762e;
import p202y.C6763f;
import p202y.InterfaceC6760c;
import p202y.InterfaceC6765h;
import p208z.C6803h;
import p208z.InterfaceC6800e;
import p208z.InterfaceC6801f;
import p208z.InterfaceC6802g;

/* renamed from: com.bumptech.glide.load.engine.b */
/* loaded from: classes2.dex */
public final class RunnableC3416b implements InterfaceC3073h, Runnable, Comparable, InterfaceC6697e {

    /* renamed from: A */
    public InterfaceC6800e f2260A;

    /* renamed from: B */
    public volatile InterfaceC3075i f2261B;

    /* renamed from: C */
    public volatile boolean f2262C;

    /* renamed from: D */
    public volatile boolean f2263D;

    /* renamed from: d */
    public final C3090t f2267d;

    /* renamed from: e */
    public final Pools.Pool f2268e;

    /* renamed from: h */
    public C3409c f2271h;

    /* renamed from: i */
    public InterfaceC6760c f2272i;

    /* renamed from: j */
    public Priority f2273j;

    /* renamed from: k */
    public C3095y f2274k;

    /* renamed from: l */
    public int f2275l;

    /* renamed from: m */
    public int f2276m;

    /* renamed from: n */
    public AbstractC3085o f2277n;

    /* renamed from: o */
    public C6763f f2278o;

    /* renamed from: p */
    public C3093w f2279p;

    /* renamed from: q */
    public int f2280q;

    /* renamed from: r */
    public DecodeJob$Stage f2281r;

    /* renamed from: s */
    public DecodeJob$RunReason f2282s;

    /* renamed from: t */
    public long f2283t;

    /* renamed from: u */
    public Object f2284u;

    /* renamed from: v */
    public Thread f2285v;

    /* renamed from: w */
    public InterfaceC6760c f2286w;

    /* renamed from: x */
    public InterfaceC6760c f2287x;

    /* renamed from: y */
    public Object f2288y;

    /* renamed from: z */
    public DataSource f2289z;

    /* renamed from: a */
    public final C3077j f2264a = new C3077j();

    /* renamed from: b */
    public final ArrayList f2265b = new ArrayList();

    /* renamed from: c */
    public final C6700h f2266c = new C6700h();

    /* renamed from: f */
    public final C3071g f2269f = new C3071g(1);

    /* renamed from: g */
    public final C3079k f2270g = new C3079k();

    public RunnableC3416b(C3090t c3090t, C6696d c6696d) {
        this.f2267d = c3090t;
        this.f2268e = c6696d;
    }

    @Override // p016b0.InterfaceC3073h
    /* renamed from: a */
    public final void mo2023a(InterfaceC6760c interfaceC6760c, Exception exc, InterfaceC6800e interfaceC6800e, DataSource dataSource) {
        interfaceC6800e.mo21a();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(interfaceC6760c, dataSource, interfaceC6800e.mo22b());
        this.f2265b.add(glideException);
        if (Thread.currentThread() == this.f2285v) {
            m2403m();
            return;
        }
        this.f2282s = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        C3093w c3093w = this.f2279p;
        (c3093w.f1513m ? c3093w.f1509i : c3093w.f1508h).execute(this);
    }

    @Override // p016b0.InterfaceC3073h
    /* renamed from: b */
    public final void mo2024b(InterfaceC6760c interfaceC6760c, Object obj, InterfaceC6800e interfaceC6800e, DataSource dataSource, InterfaceC6760c interfaceC6760c2) {
        this.f2286w = interfaceC6760c;
        this.f2288y = obj;
        this.f2260A = interfaceC6800e;
        this.f2289z = dataSource;
        this.f2287x = interfaceC6760c2;
        if (Thread.currentThread() == this.f2285v) {
            m2396f();
            return;
        }
        this.f2282s = DecodeJob$RunReason.DECODE_DATA;
        C3093w c3093w = this.f2279p;
        (c3093w.f1513m ? c3093w.f1509i : c3093w.f1508h).execute(this);
    }

    @Override // p187w0.InterfaceC6697e
    /* renamed from: c */
    public final C6700h mo2015c() {
        return this.f2266c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC3416b runnableC3416b = (RunnableC3416b) obj;
        int iOrdinal = this.f2273j.ordinal() - runnableC3416b.f2273j.ordinal();
        return iOrdinal == 0 ? this.f2280q - runnableC3416b.f2280q : iOrdinal;
    }

    /* renamed from: d */
    public final InterfaceC3072g0 m2394d(InterfaceC6800e interfaceC6800e, Object obj, DataSource dataSource) {
        if (obj == null) {
            return null;
        }
        try {
            int i = AbstractC6659f.f11234b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC3072g0 interfaceC3072g0M2395e = m2395e(obj, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m2399i(jElapsedRealtimeNanos, "Decoded result " + interfaceC3072g0M2395e, null);
            }
            return interfaceC3072g0M2395e;
        } finally {
            interfaceC6800e.mo21a();
        }
    }

    /* renamed from: e */
    public final InterfaceC3072g0 m2395e(Object obj, DataSource dataSource) {
        InterfaceC6802g interfaceC6802gMo5090a;
        C3068e0 c3068e0M2027c = this.f2264a.m2027c(obj.getClass());
        C6763f c6763f = this.f2278o;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z8 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f2264a.f1459r;
            C6762e c6762e = C5657m.f8805i;
            Boolean bool = (Boolean) c6763f.m6436c(c6762e);
            if (bool == null || (bool.booleanValue() && !z8)) {
                c6763f = new C6763f();
                c6763f.f11435b.putAll((SimpleArrayMap) this.f2278o.f11435b);
                c6763f.f11435b.put(c6762e, Boolean.valueOf(z8));
            }
        }
        C6763f c6763f2 = c6763f;
        C6803h c6803h = this.f2271h.f2209b.f2221e;
        synchronized (c6803h) {
            try {
                InterfaceC6801f interfaceC6801f = (InterfaceC6801f) ((HashMap) c6803h.f11475b).get(obj.getClass());
                if (interfaceC6801f == null) {
                    Iterator it = ((HashMap) c6803h.f11475b).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC6801f interfaceC6801f2 = (InterfaceC6801f) it.next();
                        if (interfaceC6801f2.mo5091b().isAssignableFrom(obj.getClass())) {
                            interfaceC6801f = interfaceC6801f2;
                            break;
                        }
                    }
                }
                if (interfaceC6801f == null) {
                    interfaceC6801f = C6803h.f11473c;
                }
                interfaceC6802gMo5090a = interfaceC6801f.mo5090a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c3068e0M2027c.m2012a(this.f2275l, this.f2276m, new C0039h(1, this, dataSource), c6763f2, interfaceC6802gMo5090a);
        } finally {
            interfaceC6802gMo5090a.mo4974a();
        }
    }

    /* renamed from: f */
    public final void m2396f() {
        InterfaceC3072g0 interfaceC3072g0M2394d;
        boolean zM2030a;
        if (Log.isLoggable("DecodeJob", 2)) {
            m2399i(this.f2283t, "Retrieved data", "data: " + this.f2288y + ", cache key: " + this.f2286w + ", fetcher: " + this.f2260A);
        }
        C3070f0 c3070f0 = null;
        try {
            interfaceC3072g0M2394d = m2394d(this.f2260A, this.f2288y, this.f2289z);
        } catch (GlideException e) {
            e.setLoggingDetails(this.f2287x, this.f2289z);
            this.f2265b.add(e);
            interfaceC3072g0M2394d = null;
        }
        if (interfaceC3072g0M2394d == null) {
            m2403m();
            return;
        }
        DataSource dataSource = this.f2289z;
        if (interfaceC3072g0M2394d instanceof InterfaceC3064c0) {
            ((InterfaceC3064c0) interfaceC3072g0M2394d).initialize();
        }
        if (((C3070f0) this.f2269f.f1422d) != null) {
            c3070f0 = (C3070f0) C3070f0.f1414e.acquire();
            c3070f0.f1418d = false;
            c3070f0.f1417c = true;
            c3070f0.f1416b = interfaceC3072g0M2394d;
            interfaceC3072g0M2394d = c3070f0;
        }
        m2405o();
        C3093w c3093w = this.f2279p;
        synchronized (c3093w) {
            c3093w.f1514n = interfaceC3072g0M2394d;
            c3093w.f1515o = dataSource;
        }
        synchronized (c3093w) {
            try {
                c3093w.f1502b.m6399a();
                if (c3093w.f1521u) {
                    c3093w.f1514n.recycle();
                    c3093w.m2059g();
                } else {
                    if (c3093w.f1501a.f1499a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c3093w.f1516p) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C5711g c5711g = c3093w.f1505e;
                    InterfaceC3072g0 interfaceC3072g0 = c3093w.f1514n;
                    boolean z8 = c3093w.f1512l;
                    C3095y c3095y = c3093w.f1511k;
                    InterfaceC3096z interfaceC3096z = c3093w.f1503c;
                    c5711g.getClass();
                    c3093w.f1519s = new C3060a0(interfaceC3072g0, z8, true, c3095y, interfaceC3096z);
                    c3093w.f1516p = true;
                    C3092v c3092v = c3093w.f1501a;
                    c3092v.getClass();
                    ArrayList arrayList = new ArrayList(c3092v.f1499a);
                    c3093w.m2057e(arrayList.size() + 1);
                    ((C3417c) c3093w.f1506f).m2410d(c3093w, c3093w.f1511k, c3093w.f1519s);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        C3091u c3091u = (C3091u) obj;
                        c3091u.f1498b.execute(new RunnableC3418d(c3093w, c3091u.f1497a, 1));
                    }
                    c3093w.m2056d();
                }
            } finally {
            }
        }
        this.f2281r = DecodeJob$Stage.ENCODE;
        try {
            C3071g c3071g = this.f2269f;
            if (((C3070f0) c3071g.f1422d) != null) {
                C3090t c3090t = this.f2267d;
                C6763f c6763f = this.f2278o;
                c3071g.getClass();
                try {
                    c3090t.m2053a().mo4794c((InterfaceC6760c) c3071g.f1420b, new C3071g((InterfaceC6765h) c3071g.f1421c, (C3070f0) c3071g.f1422d, 0, c6763f));
                    ((C3070f0) c3071g.f1422d).m2014b();
                } catch (Throwable th) {
                    ((C3070f0) c3071g.f1422d).m2014b();
                    throw th;
                }
            }
            C3079k c3079k = this.f2270g;
            synchronized (c3079k) {
                c3079k.f1462b = true;
                zM2030a = c3079k.m2030a();
            }
            if (zM2030a) {
                m2401k();
            }
        } finally {
            if (c3070f0 != null) {
                c3070f0.m2014b();
            }
        }
    }

    /* renamed from: g */
    public final InterfaceC3075i m2397g() {
        int i = AbstractC3415a.f2258b[this.f2281r.ordinal()];
        C3077j c3077j = this.f2264a;
        if (i == 1) {
            return new C3074h0(c3077j, this);
        }
        if (i == 2) {
            return new C3067e(c3077j.m2025a(), c3077j, this);
        }
        if (i == 3) {
            return new C3082l0(c3077j, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f2281r);
    }

    /* renamed from: h */
    public final DecodeJob$Stage m2398h(DecodeJob$Stage decodeJob$Stage) {
        int i = AbstractC3415a.f2258b[decodeJob$Stage.ordinal()];
        if (i == 1) {
            return this.f2277n.mo2048a() ? DecodeJob$Stage.DATA_CACHE : m2398h(DecodeJob$Stage.DATA_CACHE);
        }
        if (i == 2) {
            return DecodeJob$Stage.SOURCE;
        }
        if (i == 3 || i == 4) {
            return DecodeJob$Stage.FINISHED;
        }
        if (i == 5) {
            return this.f2277n.mo2049b() ? DecodeJob$Stage.RESOURCE_CACHE : m2398h(DecodeJob$Stage.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + decodeJob$Stage);
    }

    /* renamed from: i */
    public final void m2399i(long j7, String str, String str2) {
        StringBuilder sbM98w = AbstractC0037f.m98w(str, " in ");
        sbM98w.append(AbstractC6659f.m6315a(j7));
        sbM98w.append(", load key: ");
        sbM98w.append(this.f2274k);
        sbM98w.append(str2 != null ? ", ".concat(str2) : "");
        sbM98w.append(", thread: ");
        sbM98w.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM98w.toString());
    }

    /* renamed from: j */
    public final void m2400j() {
        boolean zM2030a;
        m2405o();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f2265b));
        C3093w c3093w = this.f2279p;
        synchronized (c3093w) {
            c3093w.f1517q = glideException;
        }
        synchronized (c3093w) {
            try {
                c3093w.f1502b.m6399a();
                if (c3093w.f1521u) {
                    c3093w.m2059g();
                } else {
                    if (c3093w.f1501a.f1499a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c3093w.f1518r) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c3093w.f1518r = true;
                    C3095y c3095y = c3093w.f1511k;
                    C3092v c3092v = c3093w.f1501a;
                    c3092v.getClass();
                    ArrayList arrayList = new ArrayList(c3092v.f1499a);
                    c3093w.m2057e(arrayList.size() + 1);
                    ((C3417c) c3093w.f1506f).m2410d(c3093w, c3095y, null);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        C3091u c3091u = (C3091u) obj;
                        c3091u.f1498b.execute(new RunnableC3418d(c3093w, c3091u.f1497a, 0));
                    }
                    c3093w.m2056d();
                }
            } finally {
            }
        }
        C3079k c3079k = this.f2270g;
        synchronized (c3079k) {
            c3079k.f1463c = true;
            zM2030a = c3079k.m2030a();
        }
        if (zM2030a) {
            m2401k();
        }
    }

    /* renamed from: k */
    public final void m2401k() {
        C3079k c3079k = this.f2270g;
        synchronized (c3079k) {
            c3079k.f1462b = false;
            c3079k.f1461a = false;
            c3079k.f1463c = false;
        }
        C3071g c3071g = this.f2269f;
        c3071g.f1420b = null;
        c3071g.f1421c = null;
        c3071g.f1422d = null;
        C3077j c3077j = this.f2264a;
        c3077j.f1444c = null;
        c3077j.f1445d = null;
        c3077j.f1455n = null;
        c3077j.f1448g = null;
        c3077j.f1452k = null;
        c3077j.f1450i = null;
        c3077j.f1456o = null;
        c3077j.f1451j = null;
        c3077j.f1457p = null;
        c3077j.f1442a.clear();
        c3077j.f1453l = false;
        c3077j.f1443b.clear();
        c3077j.f1454m = false;
        this.f2262C = false;
        this.f2271h = null;
        this.f2272i = null;
        this.f2278o = null;
        this.f2273j = null;
        this.f2274k = null;
        this.f2279p = null;
        this.f2281r = null;
        this.f2261B = null;
        this.f2285v = null;
        this.f2286w = null;
        this.f2288y = null;
        this.f2289z = null;
        this.f2260A = null;
        this.f2283t = 0L;
        this.f2263D = false;
        this.f2284u = null;
        this.f2265b.clear();
        this.f2268e.release(this);
    }

    /* renamed from: l */
    public final void m2402l() {
        this.f2282s = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        C3093w c3093w = this.f2279p;
        (c3093w.f1513m ? c3093w.f1509i : c3093w.f1508h).execute(this);
    }

    /* renamed from: m */
    public final void m2403m() {
        this.f2285v = Thread.currentThread();
        int i = AbstractC6659f.f11234b;
        this.f2283t = SystemClock.elapsedRealtimeNanos();
        boolean zMo2011d = false;
        while (!this.f2263D && this.f2261B != null && !(zMo2011d = this.f2261B.mo2011d())) {
            this.f2281r = m2398h(this.f2281r);
            this.f2261B = m2397g();
            if (this.f2281r == DecodeJob$Stage.SOURCE) {
                m2402l();
                return;
            }
        }
        if ((this.f2281r == DecodeJob$Stage.FINISHED || this.f2263D) && !zMo2011d) {
            m2400j();
        }
    }

    /* renamed from: n */
    public final void m2404n() {
        int i = AbstractC3415a.f2257a[this.f2282s.ordinal()];
        if (i == 1) {
            this.f2281r = m2398h(DecodeJob$Stage.INITIALIZE);
            this.f2261B = m2397g();
            m2403m();
        } else if (i == 2) {
            m2403m();
        } else if (i == 3) {
            m2396f();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f2282s);
        }
    }

    /* renamed from: o */
    public final void m2405o() {
        Throwable th;
        this.f2266c.m6399a();
        if (!this.f2262C) {
            this.f2262C = true;
            return;
        }
        if (this.f2265b.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f2265b;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6800e interfaceC6800e = this.f2260A;
        try {
            try {
                try {
                    if (this.f2263D) {
                        m2400j();
                        if (interfaceC6800e != null) {
                            interfaceC6800e.mo21a();
                            return;
                        }
                        return;
                    }
                    m2404n();
                    if (interfaceC6800e != null) {
                        interfaceC6800e.mo21a();
                    }
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f2263D + ", stage: " + this.f2281r, th);
                    }
                    if (this.f2281r != DecodeJob$Stage.ENCODE) {
                        this.f2265b.add(th);
                        m2400j();
                    }
                    if (!this.f2263D) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (interfaceC6800e != null) {
                interfaceC6800e.mo21a();
            }
            throw th2;
        }
    }
}

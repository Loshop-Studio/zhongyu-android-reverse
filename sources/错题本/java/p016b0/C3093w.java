package p016b0;

import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C3417c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.RunnableC3416b;
import com.bumptech.glide.load.engine.RunnableC3418d;
import com.bumptech.glide.request.C3420a;
import io.reactivex.internal.operators.observable.C5711g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p048e0.ExecutorServiceC5452b;
import p180v0.AbstractC6658e;
import p185v7.AbstractC6675d;
import p187w0.C6696d;
import p187w0.C6700h;
import p187w0.InterfaceC6697e;

/* renamed from: b0.w */
/* loaded from: classes2.dex */
public final class C3093w implements InterfaceC6697e {

    /* renamed from: v */
    public static final C5711g f1500v = new C5711g(1);

    /* renamed from: c */
    public final InterfaceC3096z f1503c;

    /* renamed from: d */
    public final Pools.Pool f1504d;

    /* renamed from: f */
    public final InterfaceC3094x f1506f;

    /* renamed from: g */
    public final ExecutorServiceC5452b f1507g;

    /* renamed from: h */
    public final ExecutorServiceC5452b f1508h;

    /* renamed from: i */
    public final ExecutorServiceC5452b f1509i;

    /* renamed from: k */
    public C3095y f1511k;

    /* renamed from: l */
    public boolean f1512l;

    /* renamed from: m */
    public boolean f1513m;

    /* renamed from: n */
    public InterfaceC3072g0 f1514n;

    /* renamed from: o */
    public DataSource f1515o;

    /* renamed from: p */
    public boolean f1516p;

    /* renamed from: q */
    public GlideException f1517q;

    /* renamed from: r */
    public boolean f1518r;

    /* renamed from: s */
    public C3060a0 f1519s;

    /* renamed from: t */
    public RunnableC3416b f1520t;

    /* renamed from: u */
    public volatile boolean f1521u;

    /* renamed from: a */
    public final C3092v f1501a = new C3092v(new ArrayList(2));

    /* renamed from: b */
    public final C6700h f1502b = new C6700h();

    /* renamed from: j */
    public final AtomicInteger f1510j = new AtomicInteger();

    /* renamed from: e */
    public final C5711g f1505e = f1500v;

    public C3093w(ExecutorServiceC5452b executorServiceC5452b, ExecutorServiceC5452b executorServiceC5452b2, ExecutorServiceC5452b executorServiceC5452b3, ExecutorServiceC5452b executorServiceC5452b4, C3417c c3417c, C3417c c3417c2, C6696d c6696d) {
        this.f1507g = executorServiceC5452b;
        this.f1508h = executorServiceC5452b2;
        this.f1509i = executorServiceC5452b4;
        this.f1506f = c3417c;
        this.f1503c = c3417c2;
        this.f1504d = c6696d;
    }

    /* renamed from: a */
    public final synchronized void m2054a(C3420a c3420a, Executor executor) {
        try {
            this.f1502b.m6399a();
            this.f1501a.f1499a.add(new C3091u(c3420a, executor));
            if (this.f1516p) {
                m2057e(1);
                executor.execute(new RunnableC3418d(this, c3420a, 1));
            } else if (this.f1518r) {
                m2057e(1);
                executor.execute(new RunnableC3418d(this, c3420a, 0));
            } else {
                AbstractC6675d.m6342d("Cannot add callbacks to a cancelled EngineJob", !this.f1521u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final void m2055b() {
        if (m2058f()) {
            return;
        }
        this.f1521u = true;
        RunnableC3416b runnableC3416b = this.f1520t;
        runnableC3416b.f2263D = true;
        InterfaceC3075i interfaceC3075i = runnableC3416b.f2261B;
        if (interfaceC3075i != null) {
            interfaceC3075i.cancel();
        }
        InterfaceC3094x interfaceC3094x = this.f1506f;
        C3095y c3095y = this.f1511k;
        C3417c c3417c = (C3417c) interfaceC3094x;
        synchronized (c3417c) {
            C3066d0 c3066d0 = c3417c.f2291a;
            c3066d0.getClass();
            HashMap map = c3066d0.f1399a;
            if (equals(map.get(c3095y))) {
                map.remove(c3095y);
            }
        }
    }

    @Override // p187w0.InterfaceC6697e
    /* renamed from: c */
    public final C6700h mo2015c() {
        return this.f1502b;
    }

    /* renamed from: d */
    public final void m2056d() {
        C3060a0 c3060a0;
        synchronized (this) {
            try {
                this.f1502b.m6399a();
                AbstractC6675d.m6342d("Not yet complete!", m2058f());
                int iDecrementAndGet = this.f1510j.decrementAndGet();
                AbstractC6675d.m6342d("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c3060a0 = this.f1519s;
                    m2059g();
                } else {
                    c3060a0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3060a0 != null) {
            c3060a0.m2006c();
        }
    }

    /* renamed from: e */
    public final synchronized void m2057e(int i) {
        C3060a0 c3060a0;
        AbstractC6675d.m6342d("Not yet complete!", m2058f());
        if (this.f1510j.getAndAdd(i) == 0 && (c3060a0 = this.f1519s) != null) {
            c3060a0.m2005b();
        }
    }

    /* renamed from: f */
    public final boolean m2058f() {
        return this.f1518r || this.f1516p || this.f1521u;
    }

    /* renamed from: g */
    public final synchronized void m2059g() {
        boolean zM2030a;
        if (this.f1511k == null) {
            throw new IllegalArgumentException();
        }
        this.f1501a.f1499a.clear();
        this.f1511k = null;
        this.f1519s = null;
        this.f1514n = null;
        this.f1518r = false;
        this.f1521u = false;
        this.f1516p = false;
        RunnableC3416b runnableC3416b = this.f1520t;
        C3079k c3079k = runnableC3416b.f2270g;
        synchronized (c3079k) {
            c3079k.f1461a = true;
            zM2030a = c3079k.m2030a();
        }
        if (zM2030a) {
            runnableC3416b.m2401k();
        }
        this.f1520t = null;
        this.f1517q = null;
        this.f1515o = null;
        this.f1504d.release(this);
    }

    /* renamed from: h */
    public final synchronized void m2060h(C3420a c3420a) {
        try {
            this.f1502b.m6399a();
            this.f1501a.f1499a.remove(new C3091u(c3420a, AbstractC6658e.f11232b));
            if (this.f1501a.f1499a.isEmpty()) {
                m2055b();
                if (this.f1516p || this.f1518r) {
                    if (this.f1510j.get() == 0) {
                        m2059g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C2860e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2877f;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p016c0.AbstractC2750a;
import p016c0.InterfaceC2751b;
import p016c0.InterfaceC2752c;
import p016c0.InterfaceC2754e;
import p047d0.InterfaceC3697g;
import p047d0.InterfaceC3698h;
import p052e0.InterfaceC3723c;
import p062g0.AbstractC3745e;
import p062g0.AbstractC3750j;
import p067h0.AbstractC3764c;
import p093m.InterfaceC4361j;
import p130v.AbstractC4613a;

/* loaded from: classes2.dex */
public final class SingleRequest implements InterfaceC2751b, InterfaceC3697g, InterfaceC2754e {

    /* renamed from: D */
    public static final boolean f957D = Log.isLoggable("Request", 2);

    /* renamed from: A */
    public int f958A;

    /* renamed from: B */
    public boolean f959B;

    /* renamed from: C */
    public RuntimeException f960C;

    /* renamed from: a */
    public final String f961a;

    /* renamed from: b */
    public final AbstractC3764c f962b;

    /* renamed from: c */
    public final Object f963c;

    /* renamed from: d */
    public final InterfaceC2752c f964d;

    /* renamed from: e */
    public final RequestCoordinator f965e;

    /* renamed from: f */
    public final Context f966f;

    /* renamed from: g */
    public final C2860e f967g;

    /* renamed from: h */
    public final Object f968h;

    /* renamed from: i */
    public final Class f969i;

    /* renamed from: j */
    public final AbstractC2750a f970j;

    /* renamed from: k */
    public final int f971k;

    /* renamed from: l */
    public final int f972l;

    /* renamed from: m */
    public final Priority f973m;

    /* renamed from: n */
    public final InterfaceC3698h f974n;

    /* renamed from: o */
    public final List f975o;

    /* renamed from: p */
    public final InterfaceC3723c f976p;

    /* renamed from: q */
    public final Executor f977q;

    /* renamed from: r */
    public InterfaceC4361j f978r;

    /* renamed from: s */
    public C2877f.d f979s;

    /* renamed from: t */
    public long f980t;

    /* renamed from: u */
    public volatile C2877f f981u;

    /* renamed from: v */
    public Status f982v;

    /* renamed from: w */
    public Drawable f983w;

    /* renamed from: x */
    public Drawable f984x;

    /* renamed from: y */
    public Drawable f985y;

    /* renamed from: z */
    public int f986z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C2860e c2860e, Object obj, Object obj2, Class cls, AbstractC2750a abstractC2750a, int i4, int i5, Priority priority, InterfaceC3698h interfaceC3698h, InterfaceC2752c interfaceC2752c, List list, RequestCoordinator requestCoordinator, C2877f c2877f, InterfaceC3723c interfaceC3723c, Executor executor) {
        this.f961a = f957D ? String.valueOf(super.hashCode()) : null;
        this.f962b = AbstractC3764c.m4863a();
        this.f963c = obj;
        this.f966f = context;
        this.f967g = c2860e;
        this.f968h = obj2;
        this.f969i = cls;
        this.f970j = abstractC2750a;
        this.f971k = i4;
        this.f972l = i5;
        this.f973m = priority;
        this.f974n = interfaceC3698h;
        this.f964d = interfaceC2752c;
        this.f975o = list;
        this.f965e = requestCoordinator;
        this.f981u = c2877f;
        this.f976p = interfaceC3723c;
        this.f977q = executor;
        this.f982v = Status.PENDING;
        if (this.f960C == null && c2860e.m1711i()) {
            this.f960C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: u */
    public static int m2027u(int i4, float f4) {
        return i4 == Integer.MIN_VALUE ? i4 : Math.round(f4 * i4);
    }

    /* renamed from: x */
    public static SingleRequest m2028x(Context context, C2860e c2860e, Object obj, Object obj2, Class cls, AbstractC2750a abstractC2750a, int i4, int i5, Priority priority, InterfaceC3698h interfaceC3698h, InterfaceC2752c interfaceC2752c, List list, RequestCoordinator requestCoordinator, C2877f c2877f, InterfaceC3723c interfaceC3723c, Executor executor) {
        return new SingleRequest(context, c2860e, obj, obj2, cls, abstractC2750a, i4, i5, priority, interfaceC3698h, interfaceC2752c, list, requestCoordinator, c2877f, interfaceC3723c, executor);
    }

    /* renamed from: A */
    public final void m2029A() {
        if (m2033l()) {
            Drawable drawableM2037p = this.f968h == null ? m2037p() : null;
            if (drawableM2037p == null) {
                drawableM2037p = m2036o();
            }
            if (drawableM2037p == null) {
                drawableM2037p = m2038q();
            }
            this.f974n.mo4668a(drawableM2037p);
        }
    }

    @Override // p016c0.InterfaceC2754e
    /* renamed from: a */
    public void mo1622a(InterfaceC4361j interfaceC4361j, DataSource dataSource) {
        this.f962b.mo4865c();
        InterfaceC4361j interfaceC4361j2 = null;
        try {
            synchronized (this.f963c) {
                try {
                    this.f979s = null;
                    if (interfaceC4361j == null) {
                        mo1623b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f969i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC4361j.get();
                    try {
                        if (obj != null && this.f969i.isAssignableFrom(obj.getClass())) {
                            if (m2034m()) {
                                m2045z(interfaceC4361j, obj, dataSource);
                                return;
                            }
                            this.f978r = null;
                            this.f982v = Status.COMPLETE;
                            this.f981u.m1868k(interfaceC4361j);
                            return;
                        }
                        this.f978r = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f969i);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(interfaceC4361j);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        mo1623b(new GlideException(sb.toString()));
                        this.f981u.m1868k(interfaceC4361j);
                    } catch (Throwable th) {
                        interfaceC4361j2 = interfaceC4361j;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC4361j2 != null) {
                this.f981u.m1868k(interfaceC4361j2);
            }
            throw th3;
        }
    }

    @Override // p016c0.InterfaceC2754e
    /* renamed from: b */
    public void mo1623b(GlideException glideException) {
        m2044y(glideException, 5);
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: c */
    public boolean mo1614c() {
        boolean z3;
        synchronized (this.f963c) {
            z3 = this.f982v == Status.COMPLETE;
        }
        return z3;
    }

    @Override // p016c0.InterfaceC2751b
    public void clear() {
        synchronized (this.f963c) {
            m2031i();
            this.f962b.mo4865c();
            Status status = this.f982v;
            Status status2 = Status.CLEARED;
            if (status == status2) {
                return;
            }
            m2035n();
            InterfaceC4361j interfaceC4361j = this.f978r;
            if (interfaceC4361j != null) {
                this.f978r = null;
            } else {
                interfaceC4361j = null;
            }
            if (m2032k()) {
                this.f974n.mo2004i(m2038q());
            }
            this.f982v = status2;
            if (interfaceC4361j != null) {
                this.f981u.m1868k(interfaceC4361j);
            }
        }
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: d */
    public boolean mo1615d(InterfaceC2751b interfaceC2751b) {
        int i4;
        int i5;
        Object obj;
        Class cls;
        AbstractC2750a abstractC2750a;
        Priority priority;
        int size;
        int i6;
        int i7;
        Object obj2;
        Class cls2;
        AbstractC2750a abstractC2750a2;
        Priority priority2;
        int size2;
        if (!(interfaceC2751b instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f963c) {
            i4 = this.f971k;
            i5 = this.f972l;
            obj = this.f968h;
            cls = this.f969i;
            abstractC2750a = this.f970j;
            priority = this.f973m;
            List list = this.f975o;
            size = list != null ? list.size() : 0;
        }
        SingleRequest singleRequest = (SingleRequest) interfaceC2751b;
        synchronized (singleRequest.f963c) {
            i6 = singleRequest.f971k;
            i7 = singleRequest.f972l;
            obj2 = singleRequest.f968h;
            cls2 = singleRequest.f969i;
            abstractC2750a2 = singleRequest.f970j;
            priority2 = singleRequest.f973m;
            List list2 = singleRequest.f975o;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i4 == i6 && i5 == i7 && AbstractC3750j.m4771b(obj, obj2) && cls.equals(cls2) && abstractC2750a.equals(abstractC2750a2) && priority == priority2 && size == size2;
    }

    @Override // p047d0.InterfaceC3697g
    /* renamed from: e */
    public void mo2030e(int i4, int i5) throws Throwable {
        Object obj;
        this.f962b.mo4865c();
        Object obj2 = this.f963c;
        synchronized (obj2) {
            try {
                try {
                    boolean z3 = f957D;
                    if (z3) {
                        m2041t("Got onSizeReady in " + AbstractC3745e.m4751a(this.f980t));
                    }
                    if (this.f982v == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        this.f982v = status;
                        float fM1612y = this.f970j.m1612y();
                        this.f986z = m2027u(i4, fM1612y);
                        this.f958A = m2027u(i5, fM1612y);
                        if (z3) {
                            m2041t("finished setup for calling load in " + AbstractC3745e.m4751a(this.f980t));
                        }
                        obj = obj2;
                        try {
                            this.f979s = this.f981u.m1864f(this.f967g, this.f968h, this.f970j.m1611x(), this.f986z, this.f958A, this.f970j.m1610w(), this.f969i, this.f973m, this.f970j.m1598k(), this.f970j.m1557A(), this.f970j.m1565J(), this.f970j.m1562F(), this.f970j.m1604q(), this.f970j.m1560D(), this.f970j.m1559C(), this.f970j.m1558B(), this.f970j.m1603p(), this, this.f977q);
                            if (this.f982v != status) {
                                this.f979s = null;
                            }
                            if (z3) {
                                m2041t("finished onSizeReady in " + AbstractC3745e.m4751a(this.f980t));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: f */
    public boolean mo1616f() {
        boolean z3;
        synchronized (this.f963c) {
            z3 = this.f982v == Status.CLEARED;
        }
        return z3;
    }

    @Override // p016c0.InterfaceC2754e
    /* renamed from: g */
    public Object mo1624g() {
        this.f962b.mo4865c();
        return this.f963c;
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: h */
    public void mo1617h() {
        synchronized (this.f963c) {
            m2031i();
            this.f962b.mo4865c();
            this.f980t = AbstractC3745e.m4752b();
            if (this.f968h == null) {
                if (AbstractC3750j.m4787r(this.f971k, this.f972l)) {
                    this.f986z = this.f971k;
                    this.f958A = this.f972l;
                }
                m2044y(new GlideException("Received null model"), m2037p() == null ? 5 : 3);
                return;
            }
            Status status = this.f982v;
            Status status2 = Status.RUNNING;
            if (status == status2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (status == Status.COMPLETE) {
                mo1622a(this.f978r, DataSource.MEMORY_CACHE);
                return;
            }
            Status status3 = Status.WAITING_FOR_SIZE;
            this.f982v = status3;
            if (AbstractC3750j.m4787r(this.f971k, this.f972l)) {
                mo2030e(this.f971k, this.f972l);
            } else {
                this.f974n.mo4672b(this);
            }
            Status status4 = this.f982v;
            if ((status4 == status2 || status4 == status3) && m2033l()) {
                this.f974n.mo4669e(m2038q());
            }
            if (f957D) {
                m2041t("finished run method in " + AbstractC3745e.m4751a(this.f980t));
            }
        }
    }

    /* renamed from: i */
    public final void m2031i() {
        if (this.f959B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // p016c0.InterfaceC2751b
    public boolean isRunning() {
        boolean z3;
        synchronized (this.f963c) {
            Status status = this.f982v;
            z3 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
        }
        return z3;
    }

    @Override // p016c0.InterfaceC2751b
    /* renamed from: j */
    public boolean mo1618j() {
        boolean z3;
        synchronized (this.f963c) {
            z3 = this.f982v == Status.COMPLETE;
        }
        return z3;
    }

    /* renamed from: k */
    public final boolean m2032k() {
        RequestCoordinator requestCoordinator = this.f965e;
        return requestCoordinator == null || requestCoordinator.mo2024g(this);
    }

    /* renamed from: l */
    public final boolean m2033l() {
        RequestCoordinator requestCoordinator = this.f965e;
        return requestCoordinator == null || requestCoordinator.mo2025i(this);
    }

    /* renamed from: m */
    public final boolean m2034m() {
        RequestCoordinator requestCoordinator = this.f965e;
        return requestCoordinator == null || requestCoordinator.mo2022b(this);
    }

    /* renamed from: n */
    public final void m2035n() {
        m2031i();
        this.f962b.mo4865c();
        this.f974n.mo4674g(this);
        C2877f.d dVar = this.f979s;
        if (dVar != null) {
            dVar.m1875a();
            this.f979s = null;
        }
    }

    /* renamed from: o */
    public final Drawable m2036o() {
        if (this.f983w == null) {
            Drawable drawableM1600m = this.f970j.m1600m();
            this.f983w = drawableM1600m;
            if (drawableM1600m == null && this.f970j.m1599l() > 0) {
                this.f983w = m2040s(this.f970j.m1599l());
            }
        }
        return this.f983w;
    }

    /* renamed from: p */
    public final Drawable m2037p() {
        if (this.f985y == null) {
            Drawable drawableM1601n = this.f970j.m1601n();
            this.f985y = drawableM1601n;
            if (drawableM1601n == null && this.f970j.m1602o() > 0) {
                this.f985y = m2040s(this.f970j.m1602o());
            }
        }
        return this.f985y;
    }

    @Override // p016c0.InterfaceC2751b
    public void pause() {
        synchronized (this.f963c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* renamed from: q */
    public final Drawable m2038q() {
        if (this.f984x == null) {
            Drawable drawableM1607t = this.f970j.m1607t();
            this.f984x = drawableM1607t;
            if (drawableM1607t == null && this.f970j.m1608u() > 0) {
                this.f984x = m2040s(this.f970j.m1608u());
            }
        }
        return this.f984x;
    }

    /* renamed from: r */
    public final boolean m2039r() {
        RequestCoordinator requestCoordinator = this.f965e;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo1614c();
    }

    /* renamed from: s */
    public final Drawable m2040s(int i4) {
        return AbstractC4613a.m6373a(this.f967g, i4, this.f970j.m1613z() != null ? this.f970j.m1613z() : this.f966f.getTheme());
    }

    /* renamed from: t */
    public final void m2041t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f961a);
    }

    /* renamed from: v */
    public final void m2042v() {
        RequestCoordinator requestCoordinator = this.f965e;
        if (requestCoordinator != null) {
            requestCoordinator.mo2023e(this);
        }
    }

    /* renamed from: w */
    public final void m2043w() {
        RequestCoordinator requestCoordinator = this.f965e;
        if (requestCoordinator != null) {
            requestCoordinator.mo2021a(this);
        }
    }

    /* renamed from: y */
    public final void m2044y(GlideException glideException, int i4) {
        boolean zMo13b;
        this.f962b.mo4865c();
        synchronized (this.f963c) {
            glideException.m1818k(this.f960C);
            int iM1709g = this.f967g.m1709g();
            if (iM1709g <= i4) {
                Log.w("Glide", "Load failed for " + this.f968h + " with size [" + this.f986z + "x" + this.f958A + "]", glideException);
                if (iM1709g <= 4) {
                    glideException.m1814g("Glide");
                }
            }
            this.f979s = null;
            this.f982v = Status.FAILED;
            boolean z3 = true;
            this.f959B = true;
            try {
                List list = this.f975o;
                if (list != null) {
                    Iterator it = list.iterator();
                    zMo13b = false;
                    while (it.hasNext()) {
                        zMo13b |= ((InterfaceC2752c) it.next()).mo13b(glideException, this.f968h, this.f974n, m2039r());
                    }
                } else {
                    zMo13b = false;
                }
                InterfaceC2752c interfaceC2752c = this.f964d;
                if (interfaceC2752c == null || !interfaceC2752c.mo13b(glideException, this.f968h, this.f974n, m2039r())) {
                    z3 = false;
                }
                if (!(zMo13b | z3)) {
                    m2029A();
                }
                this.f959B = false;
                m2042v();
            } catch (Throwable th) {
                this.f959B = false;
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final void m2045z(InterfaceC4361j interfaceC4361j, Object obj, DataSource dataSource) {
        boolean zMo12a;
        boolean zM2039r = m2039r();
        this.f982v = Status.COMPLETE;
        this.f978r = interfaceC4361j;
        if (this.f967g.m1709g() <= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Finished loading ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(dataSource);
            sb.append(" for ");
            sb.append(this.f968h);
            sb.append(" with size [");
            sb.append(this.f986z);
            sb.append("x");
            sb.append(this.f958A);
            sb.append("] in ");
            sb.append(AbstractC3745e.m4751a(this.f980t));
            sb.append(" ms");
        }
        boolean z3 = true;
        this.f959B = true;
        try {
            List list = this.f975o;
            if (list != null) {
                Iterator it = list.iterator();
                zMo12a = false;
                while (it.hasNext()) {
                    zMo12a |= ((InterfaceC2752c) it.next()).mo12a(obj, this.f968h, this.f974n, dataSource, zM2039r);
                }
            } else {
                zMo12a = false;
            }
            InterfaceC2752c interfaceC2752c = this.f964d;
            if (interfaceC2752c == null || !interfaceC2752c.mo12a(obj, this.f968h, this.f974n, dataSource, zM2039r)) {
                z3 = false;
            }
            if (!(z3 | zMo12a)) {
                this.f974n.mo2003f(obj, this.f976p.mo4723a(dataSource, zM2039r));
            }
            this.f959B = false;
            m2043w();
        } catch (Throwable th) {
            this.f959B = false;
            throw th;
        }
    }
}

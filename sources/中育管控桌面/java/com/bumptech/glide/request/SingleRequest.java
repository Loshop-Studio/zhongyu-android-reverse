package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C4679d;
import com.bumptech.glide.C4680e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C4715f;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p016b1.AbstractC4404f;
import p016b1.AbstractC4409k;
import p024c1.AbstractC4483b;
import p024c1.AbstractC4484c;
import p053f0.C6285d;
import p053f0.InterfaceC6283b;
import p067h0.AbstractC6433c;
import p067h0.InterfaceC6440j;
import p132q0.AbstractC7613h;
import p181x0.AbstractC7823a;
import p181x0.InterfaceC7824b;
import p181x0.InterfaceC7825c;
import p181x0.InterfaceC7827e;
import p188y0.InterfaceC7893g;
import p188y0.InterfaceC7894h;
import p195z0.InterfaceC7931c;

/* loaded from: classes3.dex */
public final class SingleRequest implements InterfaceC7824b, InterfaceC7893g, InterfaceC7827e {

    /* renamed from: E */
    public static final boolean f2613E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f2614A;

    /* renamed from: B */
    public int f2615B;

    /* renamed from: C */
    public boolean f2616C;

    /* renamed from: D */
    public RuntimeException f2617D;

    /* renamed from: a */
    public int f2618a;

    /* renamed from: b */
    public final String f2619b;

    /* renamed from: c */
    public final AbstractC4484c f2620c;

    /* renamed from: d */
    public final Object f2621d;

    /* renamed from: e */
    public final InterfaceC7825c f2622e;

    /* renamed from: f */
    public final RequestCoordinator f2623f;

    /* renamed from: g */
    public final Context f2624g;

    /* renamed from: h */
    public final C4680e f2625h;

    /* renamed from: i */
    public final Object f2626i;

    /* renamed from: j */
    public final Class f2627j;

    /* renamed from: k */
    public final AbstractC7823a f2628k;

    /* renamed from: l */
    public final int f2629l;

    /* renamed from: m */
    public final int f2630m;

    /* renamed from: n */
    public final Priority f2631n;

    /* renamed from: o */
    public final InterfaceC7894h f2632o;

    /* renamed from: p */
    public final List f2633p;

    /* renamed from: q */
    public final InterfaceC7931c f2634q;

    /* renamed from: r */
    public final Executor f2635r;

    /* renamed from: s */
    public InterfaceC6440j f2636s;

    /* renamed from: t */
    public C4715f.d f2637t;

    /* renamed from: u */
    public long f2638u;

    /* renamed from: v */
    public volatile C4715f f2639v;

    /* renamed from: w */
    public Status f2640w;

    /* renamed from: x */
    public Drawable f2641x;

    /* renamed from: y */
    public Drawable f2642y;

    /* renamed from: z */
    public Drawable f2643z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C4680e c4680e, Object obj, Object obj2, Class cls, AbstractC7823a abstractC7823a, int i6, int i7, Priority priority, InterfaceC7894h interfaceC7894h, InterfaceC7825c interfaceC7825c, List list, RequestCoordinator requestCoordinator, C4715f c4715f, InterfaceC7931c interfaceC7931c, Executor executor) {
        this.f2619b = f2613E ? String.valueOf(super.hashCode()) : null;
        this.f2620c = AbstractC4484c.m1593a();
        this.f2621d = obj;
        this.f2624g = context;
        this.f2625h = c4680e;
        this.f2626i = obj2;
        this.f2627j = cls;
        this.f2628k = abstractC7823a;
        this.f2629l = i6;
        this.f2630m = i7;
        this.f2631n = priority;
        this.f2632o = interfaceC7894h;
        this.f2622e = interfaceC7825c;
        this.f2633p = list;
        this.f2623f = requestCoordinator;
        this.f2639v = c4715f;
        this.f2634q = interfaceC7931c;
        this.f2635r = executor;
        this.f2640w = Status.PENDING;
        if (this.f2617D == null && c4680e.m2499g().m2502a(C4679d.c.class)) {
            this.f2617D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: u */
    public static int m2894u(int i6, float f6) {
        return i6 == Integer.MIN_VALUE ? i6 : Math.round(f6 * i6);
    }

    /* renamed from: x */
    public static SingleRequest m2895x(Context context, C4680e c4680e, Object obj, Object obj2, Class cls, AbstractC7823a abstractC7823a, int i6, int i7, Priority priority, InterfaceC7894h interfaceC7894h, InterfaceC7825c interfaceC7825c, List list, RequestCoordinator requestCoordinator, C4715f c4715f, InterfaceC7931c interfaceC7931c, Executor executor) {
        return new SingleRequest(context, c4680e, obj, obj2, cls, abstractC7823a, i6, i7, priority, interfaceC7894h, interfaceC7825c, list, requestCoordinator, c4715f, interfaceC7931c, executor);
    }

    /* renamed from: A */
    public final void m2896A() {
        if (m2906k()) {
            Drawable drawableM2911p = this.f2626i == null ? m2911p() : null;
            if (drawableM2911p == null) {
                drawableM2911p = m2910o();
            }
            if (drawableM2911p == null) {
                drawableM2911p = m2912q();
            }
            this.f2632o.mo9677b(drawableM2911p);
        }
    }

    @Override // p181x0.InterfaceC7824b
    /* renamed from: a */
    public boolean mo2886a() {
        boolean z6;
        synchronized (this.f2621d) {
            z6 = this.f2640w == Status.COMPLETE;
        }
        return z6;
    }

    @Override // p181x0.InterfaceC7827e
    /* renamed from: b */
    public void mo2897b(InterfaceC6440j interfaceC6440j, DataSource dataSource, boolean z6) {
        this.f2620c.mo1595c();
        InterfaceC6440j interfaceC6440j2 = null;
        try {
            synchronized (this.f2621d) {
                try {
                    this.f2637t = null;
                    if (interfaceC6440j == null) {
                        mo2898c(new GlideException("Expected to receive a Resource<R> with an object of " + this.f2627j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC6440j.get();
                    try {
                        if (obj == null || !this.f2627j.isAssignableFrom(obj.getClass())) {
                            this.f2636s = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected to receive an object of ");
                            sb.append(this.f2627j);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC6440j);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            mo2898c(new GlideException(sb.toString()));
                        } else if (m2907l()) {
                            m2919z(interfaceC6440j, obj, dataSource, z6);
                            return;
                        } else {
                            this.f2636s = null;
                            this.f2640w = Status.COMPLETE;
                            AbstractC4483b.m1592f("GlideRequest", this.f2618a);
                        }
                        this.f2639v.m2721k(interfaceC6440j);
                    } catch (Throwable th) {
                        interfaceC6440j2 = interfaceC6440j;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC6440j2 != null) {
                this.f2639v.m2721k(interfaceC6440j2);
            }
            throw th3;
        }
    }

    @Override // p181x0.InterfaceC7827e
    /* renamed from: c */
    public void mo2898c(GlideException glideException) {
        m2918y(glideException, 5);
    }

    @Override // p181x0.InterfaceC7824b
    public void clear() {
        synchronized (this.f2621d) {
            try {
                m2903h();
                this.f2620c.mo1595c();
                Status status = this.f2640w;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m2908m();
                InterfaceC6440j interfaceC6440j = this.f2636s;
                if (interfaceC6440j != null) {
                    this.f2636s = null;
                } else {
                    interfaceC6440j = null;
                }
                if (m2905j()) {
                    this.f2632o.mo2883f(m2912q());
                }
                AbstractC4483b.m1592f("GlideRequest", this.f2618a);
                this.f2640w = status2;
                if (interfaceC6440j != null) {
                    this.f2639v.m2721k(interfaceC6440j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p188y0.InterfaceC7893g
    /* renamed from: d */
    public void mo2899d(int i6, int i7) throws Throwable {
        SingleRequest singleRequest = this;
        singleRequest.f2620c.mo1595c();
        Object obj = singleRequest.f2621d;
        synchronized (obj) {
            try {
                try {
                    boolean z6 = f2613E;
                    if (z6) {
                        singleRequest.m2915t("Got onSizeReady in " + AbstractC4404f.m1421a(singleRequest.f2638u));
                    }
                    if (singleRequest.f2640w == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        singleRequest.f2640w = status;
                        float fM9413A = singleRequest.f2628k.m9413A();
                        singleRequest.f2614A = m2894u(i6, fM9413A);
                        singleRequest.f2615B = m2894u(i7, fM9413A);
                        if (z6) {
                            singleRequest.m2915t("finished setup for calling load in " + AbstractC4404f.m1421a(singleRequest.f2638u));
                        }
                        try {
                            C4715f c4715f = singleRequest.f2639v;
                            C4680e c4680e = singleRequest.f2625h;
                            try {
                                Object obj2 = singleRequest.f2626i;
                                InterfaceC6283b interfaceC6283bM9449z = singleRequest.f2628k.m9449z();
                                try {
                                    int i8 = singleRequest.f2614A;
                                    int i9 = singleRequest.f2615B;
                                    Class clsM9448y = singleRequest.f2628k.m9448y();
                                    Class cls = singleRequest.f2627j;
                                    try {
                                        Priority priority = singleRequest.f2631n;
                                        AbstractC6433c abstractC6433cM9436m = singleRequest.f2628k.m9436m();
                                        Map mapM9415C = singleRequest.f2628k.m9415C();
                                        boolean zM9425N = singleRequest.f2628k.m9425N();
                                        boolean zM9422J = singleRequest.f2628k.m9422J();
                                        C6285d c6285dM9442s = singleRequest.f2628k.m9442s();
                                        boolean zM9420H = singleRequest.f2628k.m9420H();
                                        boolean zM9417E = singleRequest.f2628k.m9417E();
                                        boolean zM9416D = singleRequest.f2628k.m9416D();
                                        boolean zM9441r = singleRequest.f2628k.m9441r();
                                        Executor executor = singleRequest.f2635r;
                                        singleRequest = obj;
                                        try {
                                            singleRequest.f2637t = c4715f.m2717f(c4680e, obj2, interfaceC6283bM9449z, i8, i9, clsM9448y, cls, priority, abstractC6433cM9436m, mapM9415C, zM9425N, zM9422J, c6285dM9442s, zM9420H, zM9417E, zM9416D, zM9441r, singleRequest, executor);
                                            if (singleRequest.f2640w != status) {
                                                singleRequest.f2637t = null;
                                            }
                                            if (z6) {
                                                singleRequest.m2915t("finished onSizeReady in " + AbstractC4404f.m1421a(singleRequest.f2638u));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        singleRequest = obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    singleRequest = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                singleRequest = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            singleRequest = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    singleRequest = obj;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    @Override // p181x0.InterfaceC7824b
    /* renamed from: e */
    public boolean mo2900e() {
        boolean z6;
        synchronized (this.f2621d) {
            z6 = this.f2640w == Status.CLEARED;
        }
        return z6;
    }

    @Override // p181x0.InterfaceC7827e
    /* renamed from: f */
    public Object mo2901f() {
        this.f2620c.mo1595c();
        return this.f2621d;
    }

    @Override // p181x0.InterfaceC7824b
    /* renamed from: g */
    public boolean mo2902g(InterfaceC7824b interfaceC7824b) {
        int i6;
        int i7;
        Object obj;
        Class cls;
        AbstractC7823a abstractC7823a;
        Priority priority;
        int size;
        int i8;
        int i9;
        Object obj2;
        Class cls2;
        AbstractC7823a abstractC7823a2;
        Priority priority2;
        int size2;
        if (!(interfaceC7824b instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f2621d) {
            try {
                i6 = this.f2629l;
                i7 = this.f2630m;
                obj = this.f2626i;
                cls = this.f2627j;
                abstractC7823a = this.f2628k;
                priority = this.f2631n;
                List list = this.f2633p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) interfaceC7824b;
        synchronized (singleRequest.f2621d) {
            try {
                i8 = singleRequest.f2629l;
                i9 = singleRequest.f2630m;
                obj2 = singleRequest.f2626i;
                cls2 = singleRequest.f2627j;
                abstractC7823a2 = singleRequest.f2628k;
                priority2 = singleRequest.f2631n;
                List list2 = singleRequest.f2633p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i6 == i8 && i7 == i9 && AbstractC4409k.m1442c(obj, obj2) && cls.equals(cls2) && AbstractC4409k.m1441b(abstractC7823a, abstractC7823a2) && priority == priority2 && size == size2;
    }

    /* renamed from: h */
    public final void m2903h() {
        if (this.f2616C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // p181x0.InterfaceC7824b
    /* renamed from: i */
    public void mo2904i() {
        synchronized (this.f2621d) {
            try {
                m2903h();
                this.f2620c.mo1595c();
                this.f2638u = AbstractC4404f.m1422b();
                Object obj = this.f2626i;
                if (obj == null) {
                    if (AbstractC4409k.m1459t(this.f2629l, this.f2630m)) {
                        this.f2614A = this.f2629l;
                        this.f2615B = this.f2630m;
                    }
                    m2918y(new GlideException("Received null model"), m2911p() == null ? 5 : 3);
                    return;
                }
                Status status = this.f2640w;
                Status status2 = Status.RUNNING;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    mo2897b(this.f2636s, DataSource.MEMORY_CACHE, false);
                    return;
                }
                m2909n(obj);
                this.f2618a = AbstractC4483b.m1588b("GlideRequest");
                Status status3 = Status.WAITING_FOR_SIZE;
                this.f2640w = status3;
                if (AbstractC4409k.m1459t(this.f2629l, this.f2630m)) {
                    mo2899d(this.f2629l, this.f2630m);
                } else {
                    this.f2632o.mo9682g(this);
                }
                Status status4 = this.f2640w;
                if ((status4 == status2 || status4 == status3) && m2906k()) {
                    this.f2632o.mo9678e(m2912q());
                }
                if (f2613E) {
                    m2915t("finished run method in " + AbstractC4404f.m1421a(this.f2638u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p181x0.InterfaceC7824b
    public boolean isComplete() {
        boolean z6;
        synchronized (this.f2621d) {
            z6 = this.f2640w == Status.COMPLETE;
        }
        return z6;
    }

    @Override // p181x0.InterfaceC7824b
    public boolean isRunning() {
        boolean z6;
        synchronized (this.f2621d) {
            try {
                Status status = this.f2640w;
                z6 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z6;
    }

    /* renamed from: j */
    public final boolean m2905j() {
        RequestCoordinator requestCoordinator = this.f2623f;
        return requestCoordinator == null || requestCoordinator.mo2888c(this);
    }

    /* renamed from: k */
    public final boolean m2906k() {
        RequestCoordinator requestCoordinator = this.f2623f;
        return requestCoordinator == null || requestCoordinator.mo2887b(this);
    }

    /* renamed from: l */
    public final boolean m2907l() {
        RequestCoordinator requestCoordinator = this.f2623f;
        return requestCoordinator == null || requestCoordinator.mo2890f(this);
    }

    /* renamed from: m */
    public final void m2908m() {
        m2903h();
        this.f2620c.mo1595c();
        this.f2632o.mo9684i(this);
        C4715f.d dVar = this.f2637t;
        if (dVar != null) {
            dVar.m2727a();
            this.f2637t = null;
        }
    }

    /* renamed from: n */
    public final void m2909n(Object obj) {
        List<InterfaceC7825c> list = this.f2633p;
        if (list == null) {
            return;
        }
        for (InterfaceC7825c interfaceC7825c : list) {
        }
    }

    /* renamed from: o */
    public final Drawable m2910o() {
        if (this.f2641x == null) {
            Drawable drawableM9438o = this.f2628k.m9438o();
            this.f2641x = drawableM9438o;
            if (drawableM9438o == null && this.f2628k.m9437n() > 0) {
                this.f2641x = m2914s(this.f2628k.m9437n());
            }
        }
        return this.f2641x;
    }

    /* renamed from: p */
    public final Drawable m2911p() {
        if (this.f2643z == null) {
            Drawable drawableM9439p = this.f2628k.m9439p();
            this.f2643z = drawableM9439p;
            if (drawableM9439p == null && this.f2628k.m9440q() > 0) {
                this.f2643z = m2914s(this.f2628k.m9440q());
            }
        }
        return this.f2643z;
    }

    @Override // p181x0.InterfaceC7824b
    public void pause() {
        synchronized (this.f2621d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: q */
    public final Drawable m2912q() {
        if (this.f2642y == null) {
            Drawable drawableM9445v = this.f2628k.m9445v();
            this.f2642y = drawableM9445v;
            if (drawableM9445v == null && this.f2628k.m9446w() > 0) {
                this.f2642y = m2914s(this.f2628k.m9446w());
            }
        }
        return this.f2642y;
    }

    /* renamed from: r */
    public final boolean m2913r() {
        RequestCoordinator requestCoordinator = this.f2623f;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo2886a();
    }

    /* renamed from: s */
    public final Drawable m2914s(int i6) {
        return AbstractC7613h.m9040a(this.f2624g, i6, this.f2628k.m9414B() != null ? this.f2628k.m9414B() : this.f2624g.getTheme());
    }

    /* renamed from: t */
    public final void m2915t(String str) {
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f2621d) {
            obj = this.f2626i;
            cls = this.f2627j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* renamed from: v */
    public final void m2916v() {
        RequestCoordinator requestCoordinator = this.f2623f;
        if (requestCoordinator != null) {
            requestCoordinator.mo2891h(this);
        }
    }

    /* renamed from: w */
    public final void m2917w() {
        RequestCoordinator requestCoordinator = this.f2623f;
        if (requestCoordinator != null) {
            requestCoordinator.mo2889d(this);
        }
    }

    /* renamed from: y */
    public final void m2918y(GlideException glideException, int i6) {
        boolean zMo7603a;
        this.f2620c.mo1595c();
        synchronized (this.f2621d) {
            try {
                glideException.m2672k(this.f2617D);
                int iM2500h = this.f2625h.m2500h();
                if (iM2500h <= i6) {
                    Log.w("Glide", "Load failed for [" + this.f2626i + "] with dimensions [" + this.f2614A + "x" + this.f2615B + "]", glideException);
                    if (iM2500h <= 4) {
                        glideException.m2668g("Glide");
                    }
                }
                this.f2637t = null;
                this.f2640w = Status.FAILED;
                m2916v();
                boolean z6 = true;
                this.f2616C = true;
                try {
                    List list = this.f2633p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zMo7603a = false;
                        while (it.hasNext()) {
                            zMo7603a |= ((InterfaceC7825c) it.next()).mo7603a(glideException, this.f2626i, this.f2632o, m2913r());
                        }
                    } else {
                        zMo7603a = false;
                    }
                    InterfaceC7825c interfaceC7825c = this.f2622e;
                    if (interfaceC7825c == null || !interfaceC7825c.mo7603a(glideException, this.f2626i, this.f2632o, m2913r())) {
                        z6 = false;
                    }
                    if (!(zMo7603a | z6)) {
                        m2896A();
                    }
                    this.f2616C = false;
                    AbstractC4483b.m1592f("GlideRequest", this.f2618a);
                } catch (Throwable th) {
                    this.f2616C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final void m2919z(InterfaceC6440j interfaceC6440j, Object obj, DataSource dataSource, boolean z6) {
        boolean zMo7604b;
        boolean zM2913r = m2913r();
        this.f2640w = Status.COMPLETE;
        this.f2636s = interfaceC6440j;
        if (this.f2625h.m2500h() <= 3) {
            obj.getClass();
            Objects.toString(dataSource);
            Objects.toString(this.f2626i);
            AbstractC4404f.m1421a(this.f2638u);
        }
        m2917w();
        boolean z7 = true;
        this.f2616C = true;
        try {
            List list = this.f2633p;
            if (list != null) {
                Iterator it = list.iterator();
                zMo7604b = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    DataSource dataSource2 = dataSource;
                    zMo7604b |= ((InterfaceC7825c) it.next()).mo7604b(obj2, this.f2626i, this.f2632o, dataSource2, zM2913r);
                    obj = obj2;
                    dataSource = dataSource2;
                }
            } else {
                zMo7604b = false;
            }
            Object obj3 = obj;
            DataSource dataSource3 = dataSource;
            InterfaceC7825c interfaceC7825c = this.f2622e;
            if (interfaceC7825c == null || !interfaceC7825c.mo7604b(obj3, this.f2626i, this.f2632o, dataSource3, zM2913r)) {
                z7 = false;
            }
            if (!(z7 | zMo7604b)) {
                this.f2632o.mo2882c(obj3, this.f2634q.mo9734a(dataSource3, zM2913r));
            }
            this.f2616C = false;
            AbstractC4483b.m1592f("GlideRequest", this.f2618a);
        } catch (Throwable th) {
            this.f2616C = false;
            throw th;
        }
    }
}

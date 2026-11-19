package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C5343c;
import com.bumptech.glide.C5344d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5379f;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p073e1.AbstractC7324a;
import p073e1.InterfaceC7325b;
import p073e1.InterfaceC7326c;
import p073e1.InterfaceC7328e;
import p084f1.InterfaceC7430g;
import p084f1.InterfaceC7431h;
import p095g1.InterfaceC7510c;
import p117i1.AbstractC7647f;
import p117i1.AbstractC7652k;
import p128j1.AbstractC7779b;
import p128j1.AbstractC7780c;
import p162m0.C8539d;
import p162m0.InterfaceC8537b;
import p184o0.AbstractC8683c;
import p184o0.InterfaceC8690j;
import p281x0.AbstractC9834h;

/* loaded from: classes3.dex */
public final class SingleRequest implements InterfaceC7325b, InterfaceC7430g, InterfaceC7328e {

    /* renamed from: E */
    public static final boolean f3822E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f3823A;

    /* renamed from: B */
    public int f3824B;

    /* renamed from: C */
    public boolean f3825C;

    /* renamed from: D */
    public RuntimeException f3826D;

    /* renamed from: a */
    public int f3827a;

    /* renamed from: b */
    public final String f3828b;

    /* renamed from: c */
    public final AbstractC7780c f3829c;

    /* renamed from: d */
    public final Object f3830d;

    /* renamed from: e */
    public final InterfaceC7326c f3831e;

    /* renamed from: f */
    public final RequestCoordinator f3832f;

    /* renamed from: g */
    public final Context f3833g;

    /* renamed from: h */
    public final C5344d f3834h;

    /* renamed from: i */
    public final Object f3835i;

    /* renamed from: j */
    public final Class f3836j;

    /* renamed from: k */
    public final AbstractC7324a f3837k;

    /* renamed from: l */
    public final int f3838l;

    /* renamed from: m */
    public final int f3839m;

    /* renamed from: n */
    public final Priority f3840n;

    /* renamed from: o */
    public final InterfaceC7431h f3841o;

    /* renamed from: p */
    public final List f3842p;

    /* renamed from: q */
    public final InterfaceC7510c f3843q;

    /* renamed from: r */
    public final Executor f3844r;

    /* renamed from: s */
    public InterfaceC8690j f3845s;

    /* renamed from: t */
    public C5379f.d f3846t;

    /* renamed from: u */
    public long f3847u;

    /* renamed from: v */
    public volatile C5379f f3848v;

    /* renamed from: w */
    public Status f3849w;

    /* renamed from: x */
    public Drawable f3850x;

    /* renamed from: y */
    public Drawable f3851y;

    /* renamed from: z */
    public Drawable f3852z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C5344d c5344d, Object obj, Object obj2, Class cls, AbstractC7324a abstractC7324a, int i10, int i11, Priority priority, InterfaceC7431h interfaceC7431h, InterfaceC7326c interfaceC7326c, List list, RequestCoordinator requestCoordinator, C5379f c5379f, InterfaceC7510c interfaceC7510c, Executor executor) {
        this.f3828b = f3822E ? String.valueOf(super.hashCode()) : null;
        this.f3829c = AbstractC7780c.m13149a();
        this.f3830d = obj;
        this.f3833g = context;
        this.f3834h = c5344d;
        this.f3835i = obj2;
        this.f3836j = cls;
        this.f3837k = abstractC7324a;
        this.f3838l = i10;
        this.f3839m = i11;
        this.f3840n = priority;
        this.f3841o = interfaceC7431h;
        this.f3831e = interfaceC7326c;
        this.f3842p = list;
        this.f3832f = requestCoordinator;
        this.f3848v = c5379f;
        this.f3843q = interfaceC7510c;
        this.f3844r = executor;
        this.f3849w = Status.PENDING;
        if (this.f3826D == null && c5344d.m3320g().m3323a(C5343c.c.class)) {
            this.f3826D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: u */
    public static int m3714u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    /* renamed from: x */
    public static SingleRequest m3715x(Context context, C5344d c5344d, Object obj, Object obj2, Class cls, AbstractC7324a abstractC7324a, int i10, int i11, Priority priority, InterfaceC7431h interfaceC7431h, InterfaceC7326c interfaceC7326c, List list, RequestCoordinator requestCoordinator, C5379f c5379f, InterfaceC7510c interfaceC7510c, Executor executor) {
        return new SingleRequest(context, c5344d, obj, obj2, cls, abstractC7324a, i10, i11, priority, interfaceC7431h, interfaceC7326c, list, requestCoordinator, c5379f, interfaceC7510c, executor);
    }

    /* renamed from: A */
    public final void m3716A() {
        if (m3726k()) {
            Drawable drawableM3731p = this.f3835i == null ? m3731p() : null;
            if (drawableM3731p == null) {
                drawableM3731p = m3730o();
            }
            if (drawableM3731p == null) {
                drawableM3731p = m3732q();
            }
            this.f3841o.mo11953b(drawableM3731p);
        }
    }

    @Override // p073e1.InterfaceC7328e
    /* renamed from: a */
    public void mo3717a(InterfaceC8690j interfaceC8690j, DataSource dataSource, boolean z9) {
        this.f3829c.mo13151c();
        InterfaceC8690j interfaceC8690j2 = null;
        try {
            synchronized (this.f3830d) {
                try {
                    this.f3846t = null;
                    if (interfaceC8690j == null) {
                        mo3718c(new GlideException("Expected to receive a Resource<R> with an object of " + this.f3836j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC8690j.get();
                    try {
                        if (obj == null || !this.f3836j.isAssignableFrom(obj.getClass())) {
                            this.f3845s = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected to receive an object of ");
                            sb.append(this.f3836j);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC8690j);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            mo3718c(new GlideException(sb.toString()));
                        } else if (m3727l()) {
                            m3739z(interfaceC8690j, obj, dataSource, z9);
                            return;
                        } else {
                            this.f3845s = null;
                            this.f3849w = Status.COMPLETE;
                            AbstractC7779b.m13148f("GlideRequest", this.f3827a);
                        }
                        this.f3848v.m3541k(interfaceC8690j);
                    } catch (Throwable th) {
                        interfaceC8690j2 = interfaceC8690j;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC8690j2 != null) {
                this.f3848v.m3541k(interfaceC8690j2);
            }
            throw th3;
        }
    }

    @Override // p073e1.InterfaceC7325b
    /* renamed from: b */
    public boolean mo3706b() {
        boolean z9;
        synchronized (this.f3830d) {
            z9 = this.f3849w == Status.COMPLETE;
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7328e
    /* renamed from: c */
    public void mo3718c(GlideException glideException) {
        m3738y(glideException, 5);
    }

    @Override // p073e1.InterfaceC7325b
    public void clear() {
        synchronized (this.f3830d) {
            try {
                m3723h();
                this.f3829c.mo13151c();
                Status status = this.f3849w;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m3728m();
                InterfaceC8690j interfaceC8690j = this.f3845s;
                if (interfaceC8690j != null) {
                    this.f3845s = null;
                } else {
                    interfaceC8690j = null;
                }
                if (m3724i()) {
                    this.f3841o.mo3703f(m3732q());
                }
                AbstractC7779b.m13148f("GlideRequest", this.f3827a);
                this.f3849w = status2;
                if (interfaceC8690j != null) {
                    this.f3848v.m3541k(interfaceC8690j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p084f1.InterfaceC7430g
    /* renamed from: d */
    public void mo3719d(int i10, int i11) throws Throwable {
        SingleRequest singleRequest = this;
        singleRequest.f3829c.mo13151c();
        Object obj = singleRequest.f3830d;
        synchronized (obj) {
            try {
                try {
                    boolean z9 = f3822E;
                    if (z9) {
                        singleRequest.m3735t("Got onSizeReady in " + AbstractC7647f.m12666a(singleRequest.f3847u));
                    }
                    if (singleRequest.f3849w == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        singleRequest.f3849w = status;
                        float fM11646A = singleRequest.f3837k.m11646A();
                        singleRequest.f3823A = m3714u(i10, fM11646A);
                        singleRequest.f3824B = m3714u(i11, fM11646A);
                        if (z9) {
                            singleRequest.m3735t("finished setup for calling load in " + AbstractC7647f.m12666a(singleRequest.f3847u));
                        }
                        try {
                            C5379f c5379f = singleRequest.f3848v;
                            C5344d c5344d = singleRequest.f3834h;
                            try {
                                Object obj2 = singleRequest.f3835i;
                                InterfaceC8537b interfaceC8537bM11702z = singleRequest.f3837k.m11702z();
                                try {
                                    int i12 = singleRequest.f3823A;
                                    int i13 = singleRequest.f3824B;
                                    Class clsM11701y = singleRequest.f3837k.m11701y();
                                    Class cls = singleRequest.f3836j;
                                    try {
                                        Priority priority = singleRequest.f3840n;
                                        AbstractC8683c abstractC8683cM11689l = singleRequest.f3837k.m11689l();
                                        Map mapM11648C = singleRequest.f3837k.m11648C();
                                        boolean zM11658N = singleRequest.f3837k.m11658N();
                                        boolean zM11655J = singleRequest.f3837k.m11655J();
                                        C8539d c8539dM11695s = singleRequest.f3837k.m11695s();
                                        boolean zM11653H = singleRequest.f3837k.m11653H();
                                        boolean zM11650E = singleRequest.f3837k.m11650E();
                                        boolean zM11649D = singleRequest.f3837k.m11649D();
                                        boolean zM11694r = singleRequest.f3837k.m11694r();
                                        Executor executor = singleRequest.f3844r;
                                        singleRequest = obj;
                                        try {
                                            singleRequest.f3846t = c5379f.m3537f(c5344d, obj2, interfaceC8537bM11702z, i12, i13, clsM11701y, cls, priority, abstractC8683cM11689l, mapM11648C, zM11658N, zM11655J, c8539dM11695s, zM11653H, zM11650E, zM11649D, zM11694r, singleRequest, executor);
                                            if (singleRequest.f3849w != status) {
                                                singleRequest.f3846t = null;
                                            }
                                            if (z9) {
                                                singleRequest.m3735t("finished onSizeReady in " + AbstractC7647f.m12666a(singleRequest.f3847u));
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

    @Override // p073e1.InterfaceC7325b
    /* renamed from: e */
    public boolean mo3720e(InterfaceC7325b interfaceC7325b) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        AbstractC7324a abstractC7324a;
        Priority priority;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        AbstractC7324a abstractC7324a2;
        Priority priority2;
        int size2;
        if (!(interfaceC7325b instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f3830d) {
            try {
                i10 = this.f3838l;
                i11 = this.f3839m;
                obj = this.f3835i;
                cls = this.f3836j;
                abstractC7324a = this.f3837k;
                priority = this.f3840n;
                List list = this.f3842p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) interfaceC7325b;
        synchronized (singleRequest.f3830d) {
            try {
                i12 = singleRequest.f3838l;
                i13 = singleRequest.f3839m;
                obj2 = singleRequest.f3835i;
                cls2 = singleRequest.f3836j;
                abstractC7324a2 = singleRequest.f3837k;
                priority2 = singleRequest.f3840n;
                List list2 = singleRequest.f3842p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && AbstractC7652k.m12687c(obj, obj2) && cls.equals(cls2) && AbstractC7652k.m12686b(abstractC7324a, abstractC7324a2) && priority == priority2 && size == size2;
    }

    @Override // p073e1.InterfaceC7325b
    /* renamed from: f */
    public boolean mo3721f() {
        boolean z9;
        synchronized (this.f3830d) {
            z9 = this.f3849w == Status.CLEARED;
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7328e
    /* renamed from: g */
    public Object mo3722g() {
        this.f3829c.mo13151c();
        return this.f3830d;
    }

    /* renamed from: h */
    public final void m3723h() {
        if (this.f3825C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: i */
    public final boolean m3724i() {
        RequestCoordinator requestCoordinator = this.f3832f;
        return requestCoordinator == null || requestCoordinator.mo3708d(this);
    }

    @Override // p073e1.InterfaceC7325b
    public boolean isComplete() {
        boolean z9;
        synchronized (this.f3830d) {
            z9 = this.f3849w == Status.COMPLETE;
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7325b
    public boolean isRunning() {
        boolean z9;
        synchronized (this.f3830d) {
            try {
                Status status = this.f3849w;
                z9 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z9;
    }

    @Override // p073e1.InterfaceC7325b
    /* renamed from: j */
    public void mo3725j() {
        synchronized (this.f3830d) {
            try {
                m3723h();
                this.f3829c.mo13151c();
                this.f3847u = AbstractC7647f.m12667b();
                Object obj = this.f3835i;
                if (obj == null) {
                    if (AbstractC7652k.m12704t(this.f3838l, this.f3839m)) {
                        this.f3823A = this.f3838l;
                        this.f3824B = this.f3839m;
                    }
                    m3738y(new GlideException("Received null model"), m3731p() == null ? 5 : 3);
                    return;
                }
                Status status = this.f3849w;
                Status status2 = Status.RUNNING;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    mo3717a(this.f3845s, DataSource.MEMORY_CACHE, false);
                    return;
                }
                m3729n(obj);
                this.f3827a = AbstractC7779b.m13144b("GlideRequest");
                Status status3 = Status.WAITING_FOR_SIZE;
                this.f3849w = status3;
                if (AbstractC7652k.m12704t(this.f3838l, this.f3839m)) {
                    mo3719d(this.f3838l, this.f3839m);
                } else {
                    this.f3841o.mo11960h(this);
                }
                Status status4 = this.f3849w;
                if ((status4 == status2 || status4 == status3) && m3726k()) {
                    this.f3841o.mo11954e(m3732q());
                }
                if (f3822E) {
                    m3735t("finished run method in " + AbstractC7647f.m12666a(this.f3847u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final boolean m3726k() {
        RequestCoordinator requestCoordinator = this.f3832f;
        return requestCoordinator == null || requestCoordinator.mo3710h(this);
    }

    /* renamed from: l */
    public final boolean m3727l() {
        RequestCoordinator requestCoordinator = this.f3832f;
        return requestCoordinator == null || requestCoordinator.mo3707c(this);
    }

    /* renamed from: m */
    public final void m3728m() {
        m3723h();
        this.f3829c.mo13151c();
        this.f3841o.mo11959g(this);
        C5379f.d dVar = this.f3846t;
        if (dVar != null) {
            dVar.m3547a();
            this.f3846t = null;
        }
    }

    /* renamed from: n */
    public final void m3729n(Object obj) {
        List<InterfaceC7326c> list = this.f3842p;
        if (list == null) {
            return;
        }
        for (InterfaceC7326c interfaceC7326c : list) {
        }
    }

    /* renamed from: o */
    public final Drawable m3730o() {
        if (this.f3850x == null) {
            Drawable drawableM11691n = this.f3837k.m11691n();
            this.f3850x = drawableM11691n;
            if (drawableM11691n == null && this.f3837k.m11690m() > 0) {
                this.f3850x = m3734s(this.f3837k.m11690m());
            }
        }
        return this.f3850x;
    }

    /* renamed from: p */
    public final Drawable m3731p() {
        if (this.f3852z == null) {
            Drawable drawableM11692p = this.f3837k.m11692p();
            this.f3852z = drawableM11692p;
            if (drawableM11692p == null && this.f3837k.m11693q() > 0) {
                this.f3852z = m3734s(this.f3837k.m11693q());
            }
        }
        return this.f3852z;
    }

    @Override // p073e1.InterfaceC7325b
    public void pause() {
        synchronized (this.f3830d) {
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
    public final Drawable m3732q() {
        if (this.f3851y == null) {
            Drawable drawableM11698v = this.f3837k.m11698v();
            this.f3851y = drawableM11698v;
            if (drawableM11698v == null && this.f3837k.m11699w() > 0) {
                this.f3851y = m3734s(this.f3837k.m11699w());
            }
        }
        return this.f3851y;
    }

    /* renamed from: r */
    public final boolean m3733r() {
        RequestCoordinator requestCoordinator = this.f3832f;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo3706b();
    }

    /* renamed from: s */
    public final Drawable m3734s(int i10) {
        return AbstractC9834h.m16466a(this.f3833g, i10, this.f3837k.m11647B() != null ? this.f3837k.m11647B() : this.f3833g.getTheme());
    }

    /* renamed from: t */
    public final void m3735t(String str) {
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f3830d) {
            obj = this.f3835i;
            cls = this.f3836j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* renamed from: v */
    public final void m3736v() {
        RequestCoordinator requestCoordinator = this.f3832f;
        if (requestCoordinator != null) {
            requestCoordinator.mo3709g(this);
        }
    }

    /* renamed from: w */
    public final void m3737w() {
        RequestCoordinator requestCoordinator = this.f3832f;
        if (requestCoordinator != null) {
            requestCoordinator.mo3711i(this);
        }
    }

    /* renamed from: y */
    public final void m3738y(GlideException glideException, int i10) {
        boolean zMo11704b;
        this.f3829c.mo13151c();
        synchronized (this.f3830d) {
            try {
                glideException.m3492u(this.f3826D);
                int iM3321h = this.f3834h.m3321h();
                if (iM3321h <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f3835i + "] with dimensions [" + this.f3823A + "x" + this.f3824B + "]", glideException);
                    if (iM3321h <= 4) {
                        glideException.m3488q("Glide");
                    }
                }
                this.f3846t = null;
                this.f3849w = Status.FAILED;
                m3736v();
                boolean z9 = true;
                this.f3825C = true;
                try {
                    List list = this.f3842p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zMo11704b = false;
                        while (it.hasNext()) {
                            zMo11704b |= ((InterfaceC7326c) it.next()).mo11704b(glideException, this.f3835i, this.f3841o, m3733r());
                        }
                    } else {
                        zMo11704b = false;
                    }
                    InterfaceC7326c interfaceC7326c = this.f3831e;
                    if (interfaceC7326c == null || !interfaceC7326c.mo11704b(glideException, this.f3835i, this.f3841o, m3733r())) {
                        z9 = false;
                    }
                    if (!(zMo11704b | z9)) {
                        m3716A();
                    }
                    this.f3825C = false;
                    AbstractC7779b.m13148f("GlideRequest", this.f3827a);
                } catch (Throwable th) {
                    this.f3825C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final void m3739z(InterfaceC8690j interfaceC8690j, Object obj, DataSource dataSource, boolean z9) {
        boolean zMo11703a;
        boolean zM3733r = m3733r();
        this.f3849w = Status.COMPLETE;
        this.f3845s = interfaceC8690j;
        if (this.f3834h.m3321h() <= 3) {
            obj.getClass();
            Objects.toString(dataSource);
            Objects.toString(this.f3835i);
            AbstractC7647f.m12666a(this.f3847u);
        }
        m3737w();
        boolean z10 = true;
        this.f3825C = true;
        try {
            List list = this.f3842p;
            if (list != null) {
                Iterator it = list.iterator();
                zMo11703a = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    DataSource dataSource2 = dataSource;
                    zMo11703a |= ((InterfaceC7326c) it.next()).mo11703a(obj2, this.f3835i, this.f3841o, dataSource2, zM3733r);
                    obj = obj2;
                    dataSource = dataSource2;
                }
            } else {
                zMo11703a = false;
            }
            Object obj3 = obj;
            DataSource dataSource3 = dataSource;
            InterfaceC7326c interfaceC7326c = this.f3831e;
            if (interfaceC7326c == null || !interfaceC7326c.mo11703a(obj3, this.f3835i, this.f3841o, dataSource3, zM3733r)) {
                z10 = false;
            }
            if (!(z10 | zMo11703a)) {
                this.f3841o.mo3702d(obj3, this.f3843q.mo12217a(dataSource3, zM3733r));
            }
            this.f3825C = false;
            AbstractC7779b.m13148f("GlideRequest", this.f3827a);
        } catch (Throwable th) {
            this.f3825C = false;
            throw th;
        }
    }
}

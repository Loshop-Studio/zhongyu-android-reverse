package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C5811c;
import com.bumptech.glide.C5812d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5847f;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p002a1.InterfaceC0036g;
import p002a1.InterfaceC0037h;
import p027b1.InterfaceC5143c;
import p109d1.AbstractC8905f;
import p109d1.AbstractC8910k;
import p125e1.AbstractC9070b;
import p125e1.AbstractC9071c;
import p168h0.C9438e;
import p168h0.InterfaceC9435b;
import p198j0.AbstractC9650c;
import p198j0.InterfaceC9657j;
import p328s0.AbstractC11029h;
import p428z0.AbstractC11952a;
import p428z0.InterfaceC11953b;
import p428z0.InterfaceC11954c;
import p428z0.InterfaceC11956e;

/* loaded from: classes3.dex */
public final class SingleRequest implements InterfaceC11953b, InterfaceC0036g, InterfaceC11956e {

    /* renamed from: E */
    public static final boolean f5025E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f5026A;

    /* renamed from: B */
    public int f5027B;

    /* renamed from: C */
    public boolean f5028C;

    /* renamed from: D */
    public RuntimeException f5029D;

    /* renamed from: a */
    public int f5030a;

    /* renamed from: b */
    public final String f5031b;

    /* renamed from: c */
    public final AbstractC9071c f5032c;

    /* renamed from: d */
    public final Object f5033d;

    /* renamed from: e */
    public final InterfaceC11954c f5034e;

    /* renamed from: f */
    public final RequestCoordinator f5035f;

    /* renamed from: g */
    public final Context f5036g;

    /* renamed from: h */
    public final C5812d f5037h;

    /* renamed from: i */
    public final Object f5038i;

    /* renamed from: j */
    public final Class f5039j;

    /* renamed from: k */
    public final AbstractC11952a f5040k;

    /* renamed from: l */
    public final int f5041l;

    /* renamed from: m */
    public final int f5042m;

    /* renamed from: n */
    public final Priority f5043n;

    /* renamed from: o */
    public final InterfaceC0037h f5044o;

    /* renamed from: p */
    public final List f5045p;

    /* renamed from: q */
    public final InterfaceC5143c f5046q;

    /* renamed from: r */
    public final Executor f5047r;

    /* renamed from: s */
    public InterfaceC9657j f5048s;

    /* renamed from: t */
    public C5847f.d f5049t;

    /* renamed from: u */
    public long f5050u;

    /* renamed from: v */
    public volatile C5847f f5051v;

    /* renamed from: w */
    public Status f5052w;

    /* renamed from: x */
    public Drawable f5053x;

    /* renamed from: y */
    public Drawable f5054y;

    /* renamed from: z */
    public Drawable f5055z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C5812d c5812d, Object obj, Object obj2, Class cls, AbstractC11952a abstractC11952a, int i10, int i11, Priority priority, InterfaceC0037h interfaceC0037h, InterfaceC11954c interfaceC11954c, List list, RequestCoordinator requestCoordinator, C5847f c5847f, InterfaceC5143c interfaceC5143c, Executor executor) {
        this.f5031b = f5025E ? String.valueOf(super.hashCode()) : null;
        this.f5032c = AbstractC9071c.m17870a();
        this.f5033d = obj;
        this.f5036g = context;
        this.f5037h = c5812d;
        this.f5038i = obj2;
        this.f5039j = cls;
        this.f5040k = abstractC11952a;
        this.f5041l = i10;
        this.f5042m = i11;
        this.f5043n = priority;
        this.f5044o = interfaceC0037h;
        this.f5034e = interfaceC11954c;
        this.f5045p = list;
        this.f5035f = requestCoordinator;
        this.f5051v = c5847f;
        this.f5046q = interfaceC5143c;
        this.f5047r = executor;
        this.f5052w = Status.PENDING;
        if (this.f5029D == null && c5812d.m3970g().m3973a(C5811c.c.class)) {
            this.f5029D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: u */
    public static int m4361u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    /* renamed from: x */
    public static SingleRequest m4362x(Context context, C5812d c5812d, Object obj, Object obj2, Class cls, AbstractC11952a abstractC11952a, int i10, int i11, Priority priority, InterfaceC0037h interfaceC0037h, InterfaceC11954c interfaceC11954c, List list, RequestCoordinator requestCoordinator, C5847f c5847f, InterfaceC5143c interfaceC5143c, Executor executor) {
        return new SingleRequest(context, c5812d, obj, obj2, cls, abstractC11952a, i10, i11, priority, interfaceC0037h, interfaceC11954c, list, requestCoordinator, c5847f, interfaceC5143c, executor);
    }

    /* renamed from: A */
    public final void m4363A() {
        if (m4372k()) {
            Drawable drawableM4377p = this.f5038i == null ? m4377p() : null;
            if (drawableM4377p == null) {
                drawableM4377p = m4376o();
            }
            if (drawableM4377p == null) {
                drawableM4377p = m4378q();
            }
            this.f5044o.mo60b(drawableM4377p);
        }
    }

    @Override // p428z0.InterfaceC11953b
    /* renamed from: a */
    public boolean mo4353a() {
        boolean z10;
        synchronized (this.f5033d) {
            z10 = this.f5052w == Status.COMPLETE;
        }
        return z10;
    }

    @Override // p428z0.InterfaceC11956e
    /* renamed from: b */
    public void mo4364b(GlideException glideException) {
        m4384y(glideException, 5);
    }

    @Override // p428z0.InterfaceC11956e
    /* renamed from: c */
    public void mo4365c(InterfaceC9657j interfaceC9657j, DataSource dataSource, boolean z10) {
        this.f5032c.mo17872c();
        InterfaceC9657j interfaceC9657j2 = null;
        try {
            synchronized (this.f5033d) {
                try {
                    this.f5049t = null;
                    if (interfaceC9657j == null) {
                        mo4364b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f5039j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC9657j.get();
                    try {
                        if (obj == null || !this.f5039j.isAssignableFrom(obj.getClass())) {
                            this.f5048s = null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.f5039j);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(interfaceC9657j);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            mo4364b(new GlideException(sb2.toString()));
                        } else if (m4373l()) {
                            m4385z(interfaceC9657j, obj, dataSource, z10);
                            return;
                        } else {
                            this.f5048s = null;
                            this.f5052w = Status.COMPLETE;
                            AbstractC9070b.m17869f("GlideRequest", this.f5030a);
                        }
                        this.f5051v.m4191k(interfaceC9657j);
                    } catch (Throwable th) {
                        interfaceC9657j2 = interfaceC9657j;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC9657j2 != null) {
                this.f5051v.m4191k(interfaceC9657j2);
            }
            throw th3;
        }
    }

    @Override // p428z0.InterfaceC11953b
    public void clear() {
        synchronized (this.f5033d) {
            try {
                m4368g();
                this.f5032c.mo17872c();
                Status status = this.f5052w;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m4374m();
                InterfaceC9657j interfaceC9657j = this.f5048s;
                if (interfaceC9657j != null) {
                    this.f5048s = null;
                } else {
                    interfaceC9657j = null;
                }
                if (m4371j()) {
                    this.f5044o.mo62e(m4378q());
                }
                AbstractC9070b.m17869f("GlideRequest", this.f5030a);
                this.f5052w = status2;
                if (interfaceC9657j != null) {
                    this.f5051v.m4191k(interfaceC9657j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002a1.InterfaceC0036g
    /* renamed from: d */
    public void mo75d(int i10, int i11) throws Throwable {
        SingleRequest singleRequest = this;
        singleRequest.f5032c.mo17872c();
        Object obj = singleRequest.f5033d;
        synchronized (obj) {
            try {
                try {
                    boolean z10 = f5025E;
                    if (z10) {
                        singleRequest.m4381t("Got onSizeReady in " + AbstractC8905f.m17451a(singleRequest.f5050u));
                    }
                    if (singleRequest.f5052w == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        singleRequest.f5052w = status;
                        float fM26574z = singleRequest.f5040k.m26574z();
                        singleRequest.f5026A = m4361u(i10, fM26574z);
                        singleRequest.f5027B = m4361u(i11, fM26574z);
                        if (z10) {
                            singleRequest.m4381t("finished setup for calling load in " + AbstractC8905f.m17451a(singleRequest.f5050u));
                        }
                        try {
                            C5847f c5847f = singleRequest.f5051v;
                            C5812d c5812d = singleRequest.f5037h;
                            try {
                                Object obj2 = singleRequest.f5038i;
                                InterfaceC9435b interfaceC9435bM26573y = singleRequest.f5040k.m26573y();
                                try {
                                    int i12 = singleRequest.f5026A;
                                    int i13 = singleRequest.f5027B;
                                    Class clsM26572x = singleRequest.f5040k.m26572x();
                                    Class cls = singleRequest.f5039j;
                                    try {
                                        Priority priority = singleRequest.f5043n;
                                        AbstractC9650c abstractC9650cM26557l = singleRequest.f5040k.m26557l();
                                        Map mapM26515B = singleRequest.f5040k.m26515B();
                                        boolean zM26525M = singleRequest.f5040k.m26525M();
                                        boolean zM26522I = singleRequest.f5040k.m26522I();
                                        C9438e c9438eM26566r = singleRequest.f5040k.m26566r();
                                        boolean zM26520G = singleRequest.f5040k.m26520G();
                                        boolean zM26517D = singleRequest.f5040k.m26517D();
                                        boolean zM26516C = singleRequest.f5040k.m26516C();
                                        boolean zM26565q = singleRequest.f5040k.m26565q();
                                        Executor executor = singleRequest.f5047r;
                                        singleRequest = obj;
                                        try {
                                            singleRequest.f5049t = c5847f.m4187f(c5812d, obj2, interfaceC9435bM26573y, i12, i13, clsM26572x, cls, priority, abstractC9650cM26557l, mapM26515B, zM26525M, zM26522I, c9438eM26566r, zM26520G, zM26517D, zM26516C, zM26565q, singleRequest, executor);
                                            if (singleRequest.f5052w != status) {
                                                singleRequest.f5049t = null;
                                            }
                                            if (z10) {
                                                singleRequest.m4381t("finished onSizeReady in " + AbstractC8905f.m17451a(singleRequest.f5050u));
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

    @Override // p428z0.InterfaceC11953b
    /* renamed from: e */
    public boolean mo4366e() {
        boolean z10;
        synchronized (this.f5033d) {
            z10 = this.f5052w == Status.CLEARED;
        }
        return z10;
    }

    @Override // p428z0.InterfaceC11956e
    /* renamed from: f */
    public Object mo4367f() {
        this.f5032c.mo17872c();
        return this.f5033d;
    }

    /* renamed from: g */
    public final void m4368g() {
        if (this.f5028C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // p428z0.InterfaceC11953b
    /* renamed from: h */
    public void mo4369h() {
        synchronized (this.f5033d) {
            try {
                m4368g();
                this.f5032c.mo17872c();
                this.f5050u = AbstractC8905f.m17452b();
                Object obj = this.f5038i;
                if (obj == null) {
                    if (AbstractC8910k.m17490u(this.f5041l, this.f5042m)) {
                        this.f5026A = this.f5041l;
                        this.f5027B = this.f5042m;
                    }
                    m4384y(new GlideException("Received null model"), m4377p() == null ? 5 : 3);
                    return;
                }
                Status status = this.f5052w;
                Status status2 = Status.RUNNING;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    mo4365c(this.f5048s, DataSource.MEMORY_CACHE, false);
                    return;
                }
                m4375n(obj);
                this.f5030a = AbstractC9070b.m17865b("GlideRequest");
                Status status3 = Status.WAITING_FOR_SIZE;
                this.f5052w = status3;
                if (AbstractC8910k.m17490u(this.f5041l, this.f5042m)) {
                    mo75d(this.f5041l, this.f5042m);
                } else {
                    this.f5044o.mo67g(this);
                }
                Status status4 = this.f5052w;
                if ((status4 == status2 || status4 == status3) && m4372k()) {
                    this.f5044o.mo61c(m4378q());
                }
                if (f5025E) {
                    m4381t("finished run method in " + AbstractC8905f.m17451a(this.f5050u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p428z0.InterfaceC11953b
    /* renamed from: i */
    public boolean mo4370i(InterfaceC11953b interfaceC11953b) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        AbstractC11952a abstractC11952a;
        Priority priority;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        AbstractC11952a abstractC11952a2;
        Priority priority2;
        int size2;
        if (!(interfaceC11953b instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f5033d) {
            try {
                i10 = this.f5041l;
                i11 = this.f5042m;
                obj = this.f5038i;
                cls = this.f5039j;
                abstractC11952a = this.f5040k;
                priority = this.f5043n;
                List list = this.f5045p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) interfaceC11953b;
        synchronized (singleRequest.f5033d) {
            try {
                i12 = singleRequest.f5041l;
                i13 = singleRequest.f5042m;
                obj2 = singleRequest.f5038i;
                cls2 = singleRequest.f5039j;
                abstractC11952a2 = singleRequest.f5040k;
                priority2 = singleRequest.f5043n;
                List list2 = singleRequest.f5045p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && AbstractC8910k.m17472c(obj, obj2) && cls.equals(cls2) && AbstractC8910k.m17471b(abstractC11952a, abstractC11952a2) && priority == priority2 && size == size2;
    }

    @Override // p428z0.InterfaceC11953b
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f5033d) {
            z10 = this.f5052w == Status.COMPLETE;
        }
        return z10;
    }

    @Override // p428z0.InterfaceC11953b
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f5033d) {
            try {
                Status status = this.f5052w;
                z10 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    /* renamed from: j */
    public final boolean m4371j() {
        RequestCoordinator requestCoordinator = this.f5035f;
        return requestCoordinator == null || requestCoordinator.mo4357f(this);
    }

    /* renamed from: k */
    public final boolean m4372k() {
        RequestCoordinator requestCoordinator = this.f5035f;
        return requestCoordinator == null || requestCoordinator.mo4358g(this);
    }

    /* renamed from: l */
    public final boolean m4373l() {
        RequestCoordinator requestCoordinator = this.f5035f;
        return requestCoordinator == null || requestCoordinator.mo4356d(this);
    }

    /* renamed from: m */
    public final void m4374m() {
        m4368g();
        this.f5032c.mo17872c();
        this.f5044o.mo66d(this);
        C5847f.d dVar = this.f5049t;
        if (dVar != null) {
            dVar.m4197a();
            this.f5049t = null;
        }
    }

    /* renamed from: n */
    public final void m4375n(Object obj) {
        List<InterfaceC11954c> list = this.f5045p;
        if (list == null) {
            return;
        }
        for (InterfaceC11954c interfaceC11954c : list) {
        }
    }

    /* renamed from: o */
    public final Drawable m4376o() {
        if (this.f5053x == null) {
            Drawable drawableM26561n = this.f5040k.m26561n();
            this.f5053x = drawableM26561n;
            if (drawableM26561n == null && this.f5040k.m26559m() > 0) {
                this.f5053x = m4380s(this.f5040k.m26559m());
            }
        }
        return this.f5053x;
    }

    /* renamed from: p */
    public final Drawable m4377p() {
        if (this.f5055z == null) {
            Drawable drawableM26563o = this.f5040k.m26563o();
            this.f5055z = drawableM26563o;
            if (drawableM26563o == null && this.f5040k.m26564p() > 0) {
                this.f5055z = m4380s(this.f5040k.m26564p());
            }
        }
        return this.f5055z;
    }

    @Override // p428z0.InterfaceC11953b
    public void pause() {
        synchronized (this.f5033d) {
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
    public final Drawable m4378q() {
        if (this.f5054y == null) {
            Drawable drawableM26569u = this.f5040k.m26569u();
            this.f5054y = drawableM26569u;
            if (drawableM26569u == null && this.f5040k.m26570v() > 0) {
                this.f5054y = m4380s(this.f5040k.m26570v());
            }
        }
        return this.f5054y;
    }

    /* renamed from: r */
    public final boolean m4379r() {
        RequestCoordinator requestCoordinator = this.f5035f;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo4353a();
    }

    /* renamed from: s */
    public final Drawable m4380s(int i10) {
        return AbstractC11029h.m24372a(this.f5036g, i10, this.f5040k.m26514A() != null ? this.f5040k.m26514A() : this.f5036g.getTheme());
    }

    /* renamed from: t */
    public final void m4381t(String str) {
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f5033d) {
            obj = this.f5038i;
            cls = this.f5039j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* renamed from: v */
    public final void m4382v() {
        RequestCoordinator requestCoordinator = this.f5035f;
        if (requestCoordinator != null) {
            requestCoordinator.mo4354b(this);
        }
    }

    /* renamed from: w */
    public final void m4383w() {
        RequestCoordinator requestCoordinator = this.f5035f;
        if (requestCoordinator != null) {
            requestCoordinator.mo4355c(this);
        }
    }

    /* renamed from: y */
    public final void m4384y(GlideException glideException, int i10) {
        boolean zMo6152a;
        this.f5032c.mo17872c();
        synchronized (this.f5033d) {
            try {
                glideException.m4142p(this.f5029D);
                int iM3971h = this.f5037h.m3971h();
                if (iM3971h <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f5038i + "] with dimensions [" + this.f5026A + "x" + this.f5027B + "]", glideException);
                    if (iM3971h <= 4) {
                        glideException.m4138k("Glide");
                    }
                }
                this.f5049t = null;
                this.f5052w = Status.FAILED;
                m4382v();
                boolean z10 = true;
                this.f5028C = true;
                try {
                    List list = this.f5045p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zMo6152a = false;
                        while (it.hasNext()) {
                            zMo6152a |= ((InterfaceC11954c) it.next()).mo6152a(glideException, this.f5038i, this.f5044o, m4379r());
                        }
                    } else {
                        zMo6152a = false;
                    }
                    InterfaceC11954c interfaceC11954c = this.f5034e;
                    if (interfaceC11954c == null || !interfaceC11954c.mo6152a(glideException, this.f5038i, this.f5044o, m4379r())) {
                        z10 = false;
                    }
                    if (!(zMo6152a | z10)) {
                        m4363A();
                    }
                    this.f5028C = false;
                    AbstractC9070b.m17869f("GlideRequest", this.f5030a);
                } catch (Throwable th) {
                    this.f5028C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final void m4385z(InterfaceC9657j interfaceC9657j, Object obj, DataSource dataSource, boolean z10) {
        boolean zMo6153b;
        boolean zM4379r = m4379r();
        this.f5052w = Status.COMPLETE;
        this.f5048s = interfaceC9657j;
        if (this.f5037h.m3971h() <= 3) {
            obj.getClass();
            Objects.toString(dataSource);
            Objects.toString(this.f5038i);
            AbstractC8905f.m17451a(this.f5050u);
        }
        m4383w();
        boolean z11 = true;
        this.f5028C = true;
        try {
            List list = this.f5045p;
            if (list != null) {
                Iterator it = list.iterator();
                zMo6153b = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    DataSource dataSource2 = dataSource;
                    zMo6153b |= ((InterfaceC11954c) it.next()).mo6153b(obj2, this.f5038i, this.f5044o, dataSource2, zM4379r);
                    obj = obj2;
                    dataSource = dataSource2;
                }
            } else {
                zMo6153b = false;
            }
            Object obj3 = obj;
            DataSource dataSource3 = dataSource;
            InterfaceC11954c interfaceC11954c = this.f5034e;
            if (interfaceC11954c == null || !interfaceC11954c.mo6153b(obj3, this.f5038i, this.f5044o, dataSource3, zM4379r)) {
                z11 = false;
            }
            if (!(z11 | zMo6153b)) {
                this.f5044o.mo70f(obj3, this.f5046q.mo2660a(dataSource3, zM4379r));
            }
            this.f5028C = false;
            AbstractC9070b.m17869f("GlideRequest", this.f5030a);
        } catch (Throwable th) {
            this.f5028C = false;
            throw th;
        }
    }
}

package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C5392c;
import com.bumptech.glide.C5393d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5428f;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p069d0.AbstractC8269a;
import p069d0.InterfaceC8270b;
import p069d0.InterfaceC8271c;
import p069d0.InterfaceC8273e;
import p081e0.InterfaceC8343h;
import p081e0.InterfaceC8344i;
import p093f0.InterfaceC8405c;
import p116h0.AbstractC8702f;
import p116h0.AbstractC8707k;
import p127i0.AbstractC8749b;
import p127i0.AbstractC8750c;
import p160l.C9230d;
import p160l.InterfaceC9228b;
import p182n.AbstractC9350c;
import p182n.InterfaceC9357j;
import p281w.AbstractC10266h;

/* loaded from: classes3.dex */
public final class SingleRequest implements InterfaceC8270b, InterfaceC8343h, InterfaceC8273e {

    /* renamed from: E */
    public static final boolean f3255E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f3256A;

    /* renamed from: B */
    public int f3257B;

    /* renamed from: C */
    public boolean f3258C;

    /* renamed from: D */
    public RuntimeException f3259D;

    /* renamed from: a */
    public int f3260a;

    /* renamed from: b */
    public final String f3261b;

    /* renamed from: c */
    public final AbstractC8750c f3262c;

    /* renamed from: d */
    public final Object f3263d;

    /* renamed from: e */
    public final InterfaceC8271c f3264e;

    /* renamed from: f */
    public final RequestCoordinator f3265f;

    /* renamed from: g */
    public final Context f3266g;

    /* renamed from: h */
    public final C5393d f3267h;

    /* renamed from: i */
    public final Object f3268i;

    /* renamed from: j */
    public final Class f3269j;

    /* renamed from: k */
    public final AbstractC8269a f3270k;

    /* renamed from: l */
    public final int f3271l;

    /* renamed from: m */
    public final int f3272m;

    /* renamed from: n */
    public final Priority f3273n;

    /* renamed from: o */
    public final InterfaceC8344i f3274o;

    /* renamed from: p */
    public final List f3275p;

    /* renamed from: q */
    public final InterfaceC8405c f3276q;

    /* renamed from: r */
    public final Executor f3277r;

    /* renamed from: s */
    public InterfaceC9357j f3278s;

    /* renamed from: t */
    public C5428f.d f3279t;

    /* renamed from: u */
    public long f3280u;

    /* renamed from: v */
    public volatile C5428f f3281v;

    /* renamed from: w */
    public Status f3282w;

    /* renamed from: x */
    public Drawable f3283x;

    /* renamed from: y */
    public Drawable f3284y;

    /* renamed from: z */
    public Drawable f3285z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C5393d c5393d, Object obj, Object obj2, Class cls, AbstractC8269a abstractC8269a, int i10, int i11, Priority priority, InterfaceC8344i interfaceC8344i, InterfaceC8271c interfaceC8271c, List list, RequestCoordinator requestCoordinator, C5428f c5428f, InterfaceC8405c interfaceC8405c, Executor executor) {
        this.f3261b = f3255E ? String.valueOf(super.hashCode()) : null;
        this.f3262c = AbstractC8750c.m14421a();
        this.f3263d = obj;
        this.f3266g = context;
        this.f3267h = c5393d;
        this.f3268i = obj2;
        this.f3269j = cls;
        this.f3270k = abstractC8269a;
        this.f3271l = i10;
        this.f3272m = i11;
        this.f3273n = priority;
        this.f3274o = interfaceC8344i;
        this.f3264e = interfaceC8271c;
        this.f3275p = list;
        this.f3265f = requestCoordinator;
        this.f3281v = c5428f;
        this.f3276q = interfaceC8405c;
        this.f3277r = executor;
        this.f3282w = Status.PENDING;
        if (this.f3259D == null && c5393d.m2761g().m2764a(C5392c.c.class)) {
            this.f3259D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: u */
    public static int m3158u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    /* renamed from: x */
    public static SingleRequest m3159x(Context context, C5393d c5393d, Object obj, Object obj2, Class cls, AbstractC8269a abstractC8269a, int i10, int i11, Priority priority, InterfaceC8344i interfaceC8344i, InterfaceC8271c interfaceC8271c, List list, RequestCoordinator requestCoordinator, C5428f c5428f, InterfaceC8405c interfaceC8405c, Executor executor) {
        return new SingleRequest(context, c5393d, obj, obj2, cls, abstractC8269a, i10, i11, priority, interfaceC8344i, interfaceC8271c, list, requestCoordinator, c5428f, interfaceC8405c, executor);
    }

    /* renamed from: A */
    public final void m3160A() {
        if (m3170k()) {
            Drawable drawableM3175p = this.f3268i == null ? m3175p() : null;
            if (drawableM3175p == null) {
                drawableM3175p = m3174o();
            }
            if (drawableM3175p == null) {
                drawableM3175p = m3176q();
            }
            this.f3274o.mo2815a(drawableM3175p);
        }
    }

    @Override // p069d0.InterfaceC8270b
    /* renamed from: a */
    public boolean mo3150a() {
        boolean z10;
        synchronized (this.f3263d) {
            z10 = this.f3282w == Status.COMPLETE;
        }
        return z10;
    }

    @Override // p069d0.InterfaceC8273e
    /* renamed from: b */
    public void mo3161b(InterfaceC9357j interfaceC9357j, DataSource dataSource, boolean z10) {
        this.f3262c.mo14423c();
        InterfaceC9357j interfaceC9357j2 = null;
        try {
            synchronized (this.f3263d) {
                try {
                    this.f3279t = null;
                    if (interfaceC9357j == null) {
                        mo3162c(new GlideException("Expected to receive a Resource<R> with an object of " + this.f3269j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC9357j.get();
                    try {
                        if (obj == null || !this.f3269j.isAssignableFrom(obj.getClass())) {
                            this.f3278s = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected to receive an object of ");
                            sb.append(this.f3269j);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC9357j);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            mo3162c(new GlideException(sb.toString()));
                        } else if (m3171l()) {
                            m3183z(interfaceC9357j, obj, dataSource, z10);
                            return;
                        } else {
                            this.f3278s = null;
                            this.f3282w = Status.COMPLETE;
                            AbstractC8749b.m14420f("GlideRequest", this.f3260a);
                        }
                        this.f3281v.m2987k(interfaceC9357j);
                    } catch (Throwable th) {
                        interfaceC9357j2 = interfaceC9357j;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC9357j2 != null) {
                this.f3281v.m2987k(interfaceC9357j2);
            }
            throw th3;
        }
    }

    @Override // p069d0.InterfaceC8273e
    /* renamed from: c */
    public void mo3162c(GlideException glideException) {
        m3182y(glideException, 5);
    }

    @Override // p069d0.InterfaceC8270b
    public void clear() {
        synchronized (this.f3263d) {
            try {
                m3167h();
                this.f3262c.mo14423c();
                Status status = this.f3282w;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m3172m();
                InterfaceC9357j interfaceC9357j = this.f3278s;
                if (interfaceC9357j != null) {
                    this.f3278s = null;
                } else {
                    interfaceC9357j = null;
                }
                if (m3169j()) {
                    this.f3274o.mo3147f(m3176q());
                }
                AbstractC8749b.m14420f("GlideRequest", this.f3260a);
                this.f3282w = status2;
                if (interfaceC9357j != null) {
                    this.f3281v.m2987k(interfaceC9357j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC8343h
    /* renamed from: d */
    public void mo3163d(int i10, int i11) throws Throwable {
        SingleRequest singleRequest = this;
        singleRequest.f3262c.mo14423c();
        Object obj = singleRequest.f3263d;
        synchronized (obj) {
            try {
                try {
                    boolean z10 = f3255E;
                    if (z10) {
                        singleRequest.m3179t("Got onSizeReady in " + AbstractC8702f.m14164a(singleRequest.f3280u));
                    }
                    if (singleRequest.f3282w == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        singleRequest.f3282w = status;
                        float fM13355A = singleRequest.f3270k.m13355A();
                        singleRequest.f3256A = m3158u(i10, fM13355A);
                        singleRequest.f3257B = m3158u(i11, fM13355A);
                        if (z10) {
                            singleRequest.m3179t("finished setup for calling load in " + AbstractC8702f.m14164a(singleRequest.f3280u));
                        }
                        try {
                            C5428f c5428f = singleRequest.f3281v;
                            C5393d c5393d = singleRequest.f3267h;
                            try {
                                Object obj2 = singleRequest.f3268i;
                                InterfaceC9228b interfaceC9228bM13411z = singleRequest.f3270k.m13411z();
                                try {
                                    int i12 = singleRequest.f3256A;
                                    int i13 = singleRequest.f3257B;
                                    Class clsM13410y = singleRequest.f3270k.m13410y();
                                    Class cls = singleRequest.f3269j;
                                    try {
                                        Priority priority = singleRequest.f3273n;
                                        AbstractC9350c abstractC9350cM13398m = singleRequest.f3270k.m13398m();
                                        Map mapM13357C = singleRequest.f3270k.m13357C();
                                        boolean zM13367N = singleRequest.f3270k.m13367N();
                                        boolean zM13364J = singleRequest.f3270k.m13364J();
                                        C9230d c9230dM13404s = singleRequest.f3270k.m13404s();
                                        boolean zM13362H = singleRequest.f3270k.m13362H();
                                        boolean zM13359E = singleRequest.f3270k.m13359E();
                                        boolean zM13358D = singleRequest.f3270k.m13358D();
                                        boolean zM13403r = singleRequest.f3270k.m13403r();
                                        Executor executor = singleRequest.f3277r;
                                        singleRequest = obj;
                                        try {
                                            singleRequest.f3279t = c5428f.m2983f(c5393d, obj2, interfaceC9228bM13411z, i12, i13, clsM13410y, cls, priority, abstractC9350cM13398m, mapM13357C, zM13367N, zM13364J, c9230dM13404s, zM13362H, zM13359E, zM13358D, zM13403r, singleRequest, executor);
                                            if (singleRequest.f3282w != status) {
                                                singleRequest.f3279t = null;
                                            }
                                            if (z10) {
                                                singleRequest.m3179t("finished onSizeReady in " + AbstractC8702f.m14164a(singleRequest.f3280u));
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

    @Override // p069d0.InterfaceC8270b
    /* renamed from: e */
    public boolean mo3164e() {
        boolean z10;
        synchronized (this.f3263d) {
            z10 = this.f3282w == Status.CLEARED;
        }
        return z10;
    }

    @Override // p069d0.InterfaceC8273e
    /* renamed from: f */
    public Object mo3165f() {
        this.f3262c.mo14423c();
        return this.f3263d;
    }

    @Override // p069d0.InterfaceC8270b
    /* renamed from: g */
    public boolean mo3166g(InterfaceC8270b interfaceC8270b) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        AbstractC8269a abstractC8269a;
        Priority priority;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        AbstractC8269a abstractC8269a2;
        Priority priority2;
        int size2;
        if (!(interfaceC8270b instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f3263d) {
            try {
                i10 = this.f3271l;
                i11 = this.f3272m;
                obj = this.f3268i;
                cls = this.f3269j;
                abstractC8269a = this.f3270k;
                priority = this.f3273n;
                List list = this.f3275p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) interfaceC8270b;
        synchronized (singleRequest.f3263d) {
            try {
                i12 = singleRequest.f3271l;
                i13 = singleRequest.f3272m;
                obj2 = singleRequest.f3268i;
                cls2 = singleRequest.f3269j;
                abstractC8269a2 = singleRequest.f3270k;
                priority2 = singleRequest.f3273n;
                List list2 = singleRequest.f3275p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && AbstractC8707k.m14185c(obj, obj2) && cls.equals(cls2) && AbstractC8707k.m14184b(abstractC8269a, abstractC8269a2) && priority == priority2 && size == size2;
    }

    /* renamed from: h */
    public final void m3167h() {
        if (this.f3258C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // p069d0.InterfaceC8270b
    /* renamed from: i */
    public void mo3168i() {
        synchronized (this.f3263d) {
            try {
                m3167h();
                this.f3262c.mo14423c();
                this.f3280u = AbstractC8702f.m14165b();
                Object obj = this.f3268i;
                if (obj == null) {
                    if (AbstractC8707k.m14203u(this.f3271l, this.f3272m)) {
                        this.f3256A = this.f3271l;
                        this.f3257B = this.f3272m;
                    }
                    m3182y(new GlideException("Received null model"), m3175p() == null ? 5 : 3);
                    return;
                }
                Status status = this.f3282w;
                Status status2 = Status.RUNNING;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    mo3161b(this.f3278s, DataSource.MEMORY_CACHE, false);
                    return;
                }
                m3173n(obj);
                this.f3260a = AbstractC8749b.m14416b("GlideRequest");
                Status status3 = Status.WAITING_FOR_SIZE;
                this.f3282w = status3;
                if (AbstractC8707k.m14203u(this.f3271l, this.f3272m)) {
                    mo3163d(this.f3271l, this.f3272m);
                } else {
                    this.f3274o.mo13550c(this);
                }
                Status status4 = this.f3282w;
                if ((status4 == status2 || status4 == status3) && m3170k()) {
                    this.f3274o.mo13546d(m3176q());
                }
                if (f3255E) {
                    m3179t("finished run method in " + AbstractC8702f.m14164a(this.f3280u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p069d0.InterfaceC8270b
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f3263d) {
            z10 = this.f3282w == Status.COMPLETE;
        }
        return z10;
    }

    @Override // p069d0.InterfaceC8270b
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f3263d) {
            try {
                Status status = this.f3282w;
                z10 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    /* renamed from: j */
    public final boolean m3169j() {
        RequestCoordinator requestCoordinator = this.f3265f;
        return requestCoordinator == null || requestCoordinator.mo3152c(this);
    }

    /* renamed from: k */
    public final boolean m3170k() {
        RequestCoordinator requestCoordinator = this.f3265f;
        return requestCoordinator == null || requestCoordinator.mo3155h(this);
    }

    /* renamed from: l */
    public final boolean m3171l() {
        RequestCoordinator requestCoordinator = this.f3265f;
        return requestCoordinator == null || requestCoordinator.mo3151b(this);
    }

    /* renamed from: m */
    public final void m3172m() {
        m3167h();
        this.f3262c.mo14423c();
        this.f3274o.mo13549b(this);
        C5428f.d dVar = this.f3279t;
        if (dVar != null) {
            dVar.m2993a();
            this.f3279t = null;
        }
    }

    /* renamed from: n */
    public final void m3173n(Object obj) {
        List<InterfaceC8271c> list = this.f3275p;
        if (list == null) {
            return;
        }
        for (InterfaceC8271c interfaceC8271c : list) {
        }
    }

    /* renamed from: o */
    public final Drawable m3174o() {
        if (this.f3283x == null) {
            Drawable drawableM13400o = this.f3270k.m13400o();
            this.f3283x = drawableM13400o;
            if (drawableM13400o == null && this.f3270k.m13399n() > 0) {
                this.f3283x = m3178s(this.f3270k.m13399n());
            }
        }
        return this.f3283x;
    }

    /* renamed from: p */
    public final Drawable m3175p() {
        if (this.f3285z == null) {
            Drawable drawableM13401p = this.f3270k.m13401p();
            this.f3285z = drawableM13401p;
            if (drawableM13401p == null && this.f3270k.m13402q() > 0) {
                this.f3285z = m3178s(this.f3270k.m13402q());
            }
        }
        return this.f3285z;
    }

    @Override // p069d0.InterfaceC8270b
    public void pause() {
        synchronized (this.f3263d) {
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
    public final Drawable m3176q() {
        if (this.f3284y == null) {
            Drawable drawableM13407v = this.f3270k.m13407v();
            this.f3284y = drawableM13407v;
            if (drawableM13407v == null && this.f3270k.m13408w() > 0) {
                this.f3284y = m3178s(this.f3270k.m13408w());
            }
        }
        return this.f3284y;
    }

    /* renamed from: r */
    public final boolean m3177r() {
        RequestCoordinator requestCoordinator = this.f3265f;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo3150a();
    }

    /* renamed from: s */
    public final Drawable m3178s(int i10) {
        return AbstractC10266h.m19233a(this.f3266g, i10, this.f3270k.m13356B() != null ? this.f3270k.m13356B() : this.f3266g.getTheme());
    }

    /* renamed from: t */
    public final void m3179t(String str) {
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f3263d) {
            obj = this.f3268i;
            cls = this.f3269j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    /* renamed from: v */
    public final void m3180v() {
        RequestCoordinator requestCoordinator = this.f3265f;
        if (requestCoordinator != null) {
            requestCoordinator.mo3153d(this);
        }
    }

    /* renamed from: w */
    public final void m3181w() {
        RequestCoordinator requestCoordinator = this.f3265f;
        if (requestCoordinator != null) {
            requestCoordinator.mo3154f(this);
        }
    }

    /* renamed from: y */
    public final void m3182y(GlideException glideException, int i10) {
        boolean zMo13413b;
        this.f3262c.mo14423c();
        synchronized (this.f3263d) {
            try {
                glideException.m2938l(this.f3259D);
                int iM2762h = this.f3267h.m2762h();
                if (iM2762h <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f3268i + "] with dimensions [" + this.f3256A + "x" + this.f3257B + "]", glideException);
                    if (iM2762h <= 4) {
                        glideException.m2934h("Glide");
                    }
                }
                this.f3279t = null;
                this.f3282w = Status.FAILED;
                m3180v();
                boolean z10 = true;
                this.f3258C = true;
                try {
                    List list = this.f3275p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zMo13413b = false;
                        while (it.hasNext()) {
                            zMo13413b |= ((InterfaceC8271c) it.next()).mo13413b(glideException, this.f3268i, this.f3274o, m3177r());
                        }
                    } else {
                        zMo13413b = false;
                    }
                    InterfaceC8271c interfaceC8271c = this.f3264e;
                    if (interfaceC8271c == null || !interfaceC8271c.mo13413b(glideException, this.f3268i, this.f3274o, m3177r())) {
                        z10 = false;
                    }
                    if (!(zMo13413b | z10)) {
                        m3160A();
                    }
                    this.f3258C = false;
                    AbstractC8749b.m14420f("GlideRequest", this.f3260a);
                } catch (Throwable th) {
                    this.f3258C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: z */
    public final void m3183z(InterfaceC9357j interfaceC9357j, Object obj, DataSource dataSource, boolean z10) {
        boolean zMo13412a;
        boolean zM3177r = m3177r();
        this.f3282w = Status.COMPLETE;
        this.f3278s = interfaceC9357j;
        if (this.f3267h.m2762h() <= 3) {
            obj.getClass();
            Objects.toString(dataSource);
            Objects.toString(this.f3268i);
            AbstractC8702f.m14164a(this.f3280u);
        }
        m3181w();
        boolean z11 = true;
        this.f3258C = true;
        try {
            List list = this.f3275p;
            if (list != null) {
                Iterator it = list.iterator();
                zMo13412a = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    DataSource dataSource2 = dataSource;
                    zMo13412a |= ((InterfaceC8271c) it.next()).mo13412a(obj2, this.f3268i, this.f3274o, dataSource2, zM3177r);
                    obj = obj2;
                    dataSource = dataSource2;
                }
            } else {
                zMo13412a = false;
            }
            Object obj3 = obj;
            DataSource dataSource3 = dataSource;
            InterfaceC8271c interfaceC8271c = this.f3264e;
            if (interfaceC8271c == null || !interfaceC8271c.mo13412a(obj3, this.f3268i, this.f3274o, dataSource3, zM3177r)) {
                z11 = false;
            }
            if (!(z11 | zMo13412a)) {
                this.f3274o.mo2816h(obj3, this.f3276q.mo13699a(dataSource3, zM3177r));
            }
            this.f3258C = false;
            AbstractC8749b.m14420f("GlideRequest", this.f3260a);
        } catch (Throwable th) {
            this.f3258C = false;
            throw th;
        }
    }
}

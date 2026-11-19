package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C5473d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5490f;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p002a1.AbstractC0009a;
import p002a1.InterfaceC0010b;
import p002a1.InterfaceC0011c;
import p002a1.InterfaceC0013e;
import p019b1.InterfaceC5096g;
import p019b1.InterfaceC5097h;
import p030c1.InterfaceC5221c;
import p091e1.AbstractC7833e;
import p091e1.AbstractC7838j;
import p102f1.AbstractC7911c;
import p122h0.C8084d;
import p122h0.InterfaceC8082b;
import p152k0.AbstractC8252c;
import p152k0.InterfaceC8259j;
import p248t0.AbstractC9602a;

/* loaded from: classes3.dex */
public final class SingleRequest implements InterfaceC0010b, InterfaceC5096g, InterfaceC0013e {

    /* renamed from: D */
    public static final boolean f3611D = Log.isLoggable("Request", 2);

    /* renamed from: A */
    public int f3612A;

    /* renamed from: B */
    public boolean f3613B;

    /* renamed from: C */
    public RuntimeException f3614C;

    /* renamed from: a */
    public final String f3615a;

    /* renamed from: b */
    public final AbstractC7911c f3616b;

    /* renamed from: c */
    public final Object f3617c;

    /* renamed from: d */
    public final InterfaceC0011c f3618d;

    /* renamed from: e */
    public final RequestCoordinator f3619e;

    /* renamed from: f */
    public final Context f3620f;

    /* renamed from: g */
    public final C5473d f3621g;

    /* renamed from: h */
    public final Object f3622h;

    /* renamed from: i */
    public final Class f3623i;

    /* renamed from: j */
    public final AbstractC0009a f3624j;

    /* renamed from: k */
    public final int f3625k;

    /* renamed from: l */
    public final int f3626l;

    /* renamed from: m */
    public final Priority f3627m;

    /* renamed from: n */
    public final InterfaceC5097h f3628n;

    /* renamed from: o */
    public final List f3629o;

    /* renamed from: p */
    public final InterfaceC5221c f3630p;

    /* renamed from: q */
    public final Executor f3631q;

    /* renamed from: r */
    public InterfaceC8259j f3632r;

    /* renamed from: s */
    public C5490f.d f3633s;

    /* renamed from: t */
    public long f3634t;

    /* renamed from: u */
    public volatile C5490f f3635u;

    /* renamed from: v */
    public Status f3636v;

    /* renamed from: w */
    public Drawable f3637w;

    /* renamed from: x */
    public Drawable f3638x;

    /* renamed from: y */
    public Drawable f3639y;

    /* renamed from: z */
    public int f3640z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C5473d c5473d, Object obj, Object obj2, Class cls, AbstractC0009a abstractC0009a, int i9, int i10, Priority priority, InterfaceC5097h interfaceC5097h, InterfaceC0011c interfaceC0011c, List list, RequestCoordinator requestCoordinator, C5490f c5490f, InterfaceC5221c interfaceC5221c, Executor executor) {
        this.f3615a = f3611D ? String.valueOf(super.hashCode()) : null;
        this.f3616b = AbstractC7911c.m12448a();
        this.f3617c = obj;
        this.f3620f = context;
        this.f3621g = c5473d;
        this.f3622h = obj2;
        this.f3623i = cls;
        this.f3624j = abstractC0009a;
        this.f3625k = i9;
        this.f3626l = i10;
        this.f3627m = priority;
        this.f3628n = interfaceC5097h;
        this.f3618d = interfaceC0011c;
        this.f3629o = list;
        this.f3619e = requestCoordinator;
        this.f3635u = c5490f;
        this.f3630p = interfaceC5221c;
        this.f3631q = executor;
        this.f3636v = Status.PENDING;
        if (this.f3614C == null && c5473d.m3037i()) {
            this.f3614C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: t */
    public static int m3349t(int i9, float f10) {
        return i9 == Integer.MIN_VALUE ? i9 : Math.round(f10 * i9);
    }

    /* renamed from: w */
    public static SingleRequest m3350w(Context context, C5473d c5473d, Object obj, Object obj2, Class cls, AbstractC0009a abstractC0009a, int i9, int i10, Priority priority, InterfaceC5097h interfaceC5097h, InterfaceC0011c interfaceC0011c, List list, RequestCoordinator requestCoordinator, C5490f c5490f, InterfaceC5221c interfaceC5221c, Executor executor) {
        return new SingleRequest(context, c5473d, obj, obj2, cls, abstractC0009a, i9, i10, priority, interfaceC5097h, interfaceC0011c, list, requestCoordinator, c5490f, interfaceC5221c, executor);
    }

    @Override // p002a1.InterfaceC0013e
    /* renamed from: a */
    public void mo80a(InterfaceC8259j interfaceC8259j, DataSource dataSource) {
        this.f3616b.mo12450c();
        InterfaceC8259j interfaceC8259j2 = null;
        try {
            synchronized (this.f3617c) {
                try {
                    this.f3633s = null;
                    if (interfaceC8259j == null) {
                        mo81c(new GlideException("Expected to receive a Resource<R> with an object of " + this.f3623i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC8259j.get();
                    try {
                        if (obj == null || !this.f3623i.isAssignableFrom(obj.getClass())) {
                            this.f3632r = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected to receive an object of ");
                            sb.append(this.f3623i);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(interfaceC8259j);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            mo81c(new GlideException(sb.toString()));
                        } else if (m3354l()) {
                            m3365y(interfaceC8259j, obj, dataSource);
                            return;
                        } else {
                            this.f3632r = null;
                            this.f3636v = Status.COMPLETE;
                        }
                        this.f3635u.m3193k(interfaceC8259j);
                    } catch (Throwable th) {
                        interfaceC8259j2 = interfaceC8259j;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC8259j2 != null) {
                this.f3635u.m3193k(interfaceC8259j2);
            }
            throw th3;
        }
    }

    @Override // p002a1.InterfaceC0010b
    /* renamed from: b */
    public boolean mo71b() {
        boolean z9;
        synchronized (this.f3617c) {
            z9 = this.f3636v == Status.COMPLETE;
        }
        return z9;
    }

    @Override // p002a1.InterfaceC0013e
    /* renamed from: c */
    public void mo81c(GlideException glideException) {
        m3364x(glideException, 5);
    }

    @Override // p002a1.InterfaceC0010b
    public void clear() {
        synchronized (this.f3617c) {
            try {
                m3351h();
                this.f3616b.mo12450c();
                Status status = this.f3636v;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m3355m();
                InterfaceC8259j interfaceC8259j = this.f3632r;
                if (interfaceC8259j != null) {
                    this.f3632r = null;
                } else {
                    interfaceC8259j = null;
                }
                if (m3352j()) {
                    this.f3628n.mo2134g(m3358p());
                }
                this.f3636v = status2;
                if (interfaceC8259j != null) {
                    this.f3635u.m3193k(interfaceC8259j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p019b1.InterfaceC5096g
    /* renamed from: d */
    public void mo2147d(int i9, int i10) throws Throwable {
        SingleRequest singleRequest = this;
        singleRequest.f3616b.mo12450c();
        Object obj = singleRequest.f3617c;
        synchronized (obj) {
            try {
                try {
                    boolean z9 = f3611D;
                    if (z9) {
                        singleRequest.m3361s("Got onSizeReady in " + AbstractC7833e.m12239a(singleRequest.f3634t));
                    }
                    if (singleRequest.f3636v == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        singleRequest.f3636v = status;
                        float fM14A = singleRequest.f3624j.m14A();
                        singleRequest.f3640z = m3349t(i9, fM14A);
                        singleRequest.f3612A = m3349t(i10, fM14A);
                        if (z9) {
                            singleRequest.m3361s("finished setup for calling load in " + AbstractC7833e.m12239a(singleRequest.f3634t));
                        }
                        try {
                            C5490f c5490f = singleRequest.f3635u;
                            C5473d c5473d = singleRequest.f3621g;
                            try {
                                Object obj2 = singleRequest.f3622h;
                                InterfaceC8082b interfaceC8082bM70z = singleRequest.f3624j.m70z();
                                try {
                                    int i11 = singleRequest.f3640z;
                                    int i12 = singleRequest.f3612A;
                                    Class clsM69y = singleRequest.f3624j.m69y();
                                    Class cls = singleRequest.f3623i;
                                    try {
                                        Priority priority = singleRequest.f3627m;
                                        AbstractC8252c abstractC8252cM57m = singleRequest.f3624j.m57m();
                                        Map mapM16C = singleRequest.f3624j.m16C();
                                        boolean zM24L = singleRequest.f3624j.m24L();
                                        boolean zM21H = singleRequest.f3624j.m21H();
                                        C8084d c8084dM63s = singleRequest.f3624j.m63s();
                                        boolean zM19F = singleRequest.f3624j.m19F();
                                        boolean zM18E = singleRequest.f3624j.m18E();
                                        boolean zM17D = singleRequest.f3624j.m17D();
                                        boolean zM62r = singleRequest.f3624j.m62r();
                                        Executor executor = singleRequest.f3631q;
                                        singleRequest = obj;
                                        try {
                                            singleRequest.f3633s = c5490f.m3189f(c5473d, obj2, interfaceC8082bM70z, i11, i12, clsM69y, cls, priority, abstractC8252cM57m, mapM16C, zM24L, zM21H, c8084dM63s, zM19F, zM18E, zM17D, zM62r, singleRequest, executor);
                                            if (singleRequest.f3636v != status) {
                                                singleRequest.f3633s = null;
                                            }
                                            if (z9) {
                                                singleRequest.m3361s("finished onSizeReady in " + AbstractC7833e.m12239a(singleRequest.f3634t));
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

    @Override // p002a1.InterfaceC0010b
    /* renamed from: e */
    public boolean mo72e() {
        boolean z9;
        synchronized (this.f3617c) {
            z9 = this.f3636v == Status.CLEARED;
        }
        return z9;
    }

    @Override // p002a1.InterfaceC0013e
    /* renamed from: f */
    public Object mo82f() {
        this.f3616b.mo12450c();
        return this.f3617c;
    }

    @Override // p002a1.InterfaceC0010b
    /* renamed from: g */
    public boolean mo73g(InterfaceC0010b interfaceC0010b) {
        int i9;
        int i10;
        Object obj;
        Class cls;
        AbstractC0009a abstractC0009a;
        Priority priority;
        int size;
        int i11;
        int i12;
        Object obj2;
        Class cls2;
        AbstractC0009a abstractC0009a2;
        Priority priority2;
        int size2;
        if (!(interfaceC0010b instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f3617c) {
            try {
                i9 = this.f3625k;
                i10 = this.f3626l;
                obj = this.f3622h;
                cls = this.f3623i;
                abstractC0009a = this.f3624j;
                priority = this.f3627m;
                List list = this.f3629o;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) interfaceC0010b;
        synchronized (singleRequest.f3617c) {
            try {
                i11 = singleRequest.f3625k;
                i12 = singleRequest.f3626l;
                obj2 = singleRequest.f3622h;
                cls2 = singleRequest.f3623i;
                abstractC0009a2 = singleRequest.f3624j;
                priority2 = singleRequest.f3627m;
                List list2 = singleRequest.f3629o;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i9 == i11 && i10 == i12 && AbstractC7838j.m12259b(obj, obj2) && cls.equals(cls2) && abstractC0009a.equals(abstractC0009a2) && priority == priority2 && size == size2;
    }

    /* renamed from: h */
    public final void m3351h() {
        if (this.f3613B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // p002a1.InterfaceC0010b
    /* renamed from: i */
    public void mo74i() {
        synchronized (this.f3617c) {
            try {
                m3351h();
                this.f3616b.mo12450c();
                this.f3634t = AbstractC7833e.m12240b();
                if (this.f3622h == null) {
                    if (AbstractC7838j.m12275r(this.f3625k, this.f3626l)) {
                        this.f3640z = this.f3625k;
                        this.f3612A = this.f3626l;
                    }
                    m3364x(new GlideException("Received null model"), m3357o() == null ? 5 : 3);
                    return;
                }
                Status status = this.f3636v;
                Status status2 = Status.RUNNING;
                if (status == status2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    mo80a(this.f3632r, DataSource.MEMORY_CACHE);
                    return;
                }
                Status status3 = Status.WAITING_FOR_SIZE;
                this.f3636v = status3;
                if (AbstractC7838j.m12275r(this.f3625k, this.f3626l)) {
                    mo2147d(this.f3625k, this.f3626l);
                } else {
                    this.f3628n.mo2140h(this);
                }
                Status status4 = this.f3636v;
                if ((status4 == status2 || status4 == status3) && m3353k()) {
                    this.f3628n.mo2133f(m3358p());
                }
                if (f3611D) {
                    m3361s("finished run method in " + AbstractC7833e.m12239a(this.f3634t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p002a1.InterfaceC0010b
    public boolean isComplete() {
        boolean z9;
        synchronized (this.f3617c) {
            z9 = this.f3636v == Status.COMPLETE;
        }
        return z9;
    }

    @Override // p002a1.InterfaceC0010b
    public boolean isRunning() {
        boolean z9;
        synchronized (this.f3617c) {
            try {
                Status status = this.f3636v;
                z9 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z9;
    }

    /* renamed from: j */
    public final boolean m3352j() {
        RequestCoordinator requestCoordinator = this.f3619e;
        return requestCoordinator == null || requestCoordinator.mo3343a(this);
    }

    /* renamed from: k */
    public final boolean m3353k() {
        RequestCoordinator requestCoordinator = this.f3619e;
        return requestCoordinator == null || requestCoordinator.mo3344c(this);
    }

    /* renamed from: l */
    public final boolean m3354l() {
        RequestCoordinator requestCoordinator = this.f3619e;
        return requestCoordinator == null || requestCoordinator.mo3347h(this);
    }

    /* renamed from: m */
    public final void m3355m() {
        m3351h();
        this.f3616b.mo12450c();
        this.f3628n.mo2139e(this);
        C5490f.d dVar = this.f3633s;
        if (dVar != null) {
            dVar.m3199a();
            this.f3633s = null;
        }
    }

    /* renamed from: n */
    public final Drawable m3356n() {
        if (this.f3637w == null) {
            Drawable drawableM59o = this.f3624j.m59o();
            this.f3637w = drawableM59o;
            if (drawableM59o == null && this.f3624j.m58n() > 0) {
                this.f3637w = m3360r(this.f3624j.m58n());
            }
        }
        return this.f3637w;
    }

    /* renamed from: o */
    public final Drawable m3357o() {
        if (this.f3639y == null) {
            Drawable drawableM60p = this.f3624j.m60p();
            this.f3639y = drawableM60p;
            if (drawableM60p == null && this.f3624j.m61q() > 0) {
                this.f3639y = m3360r(this.f3624j.m61q());
            }
        }
        return this.f3639y;
    }

    /* renamed from: p */
    public final Drawable m3358p() {
        if (this.f3638x == null) {
            Drawable drawableM66v = this.f3624j.m66v();
            this.f3638x = drawableM66v;
            if (drawableM66v == null && this.f3624j.m67w() > 0) {
                this.f3638x = m3360r(this.f3624j.m67w());
            }
        }
        return this.f3638x;
    }

    @Override // p002a1.InterfaceC0010b
    public void pause() {
        synchronized (this.f3617c) {
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
    public final boolean m3359q() {
        RequestCoordinator requestCoordinator = this.f3619e;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo71b();
    }

    /* renamed from: r */
    public final Drawable m3360r(int i9) {
        return AbstractC9602a.m15826a(this.f3621g, i9, this.f3624j.m15B() != null ? this.f3624j.m15B() : this.f3620f.getTheme());
    }

    /* renamed from: s */
    public final void m3361s(String str) {
    }

    /* renamed from: u */
    public final void m3362u() {
        RequestCoordinator requestCoordinator = this.f3619e;
        if (requestCoordinator != null) {
            requestCoordinator.mo3345d(this);
        }
    }

    /* renamed from: v */
    public final void m3363v() {
        RequestCoordinator requestCoordinator = this.f3619e;
        if (requestCoordinator != null) {
            requestCoordinator.mo3346f(this);
        }
    }

    /* renamed from: x */
    public final void m3364x(GlideException glideException, int i9) {
        boolean zMo76b;
        this.f3616b.mo12450c();
        synchronized (this.f3617c) {
            try {
                glideException.m3143x(this.f3614C);
                int iM3035g = this.f3621g.m3035g();
                if (iM3035g <= i9) {
                    Log.w("Glide", "Load failed for " + this.f3622h + " with size [" + this.f3640z + "x" + this.f3612A + "]", glideException);
                    if (iM3035g <= 4) {
                        glideException.m3139t("Glide");
                    }
                }
                this.f3633s = null;
                this.f3636v = Status.FAILED;
                boolean z9 = true;
                this.f3613B = true;
                try {
                    List list = this.f3629o;
                    if (list != null) {
                        Iterator it = list.iterator();
                        zMo76b = false;
                        while (it.hasNext()) {
                            zMo76b |= ((InterfaceC0011c) it.next()).mo76b(glideException, this.f3622h, this.f3628n, m3359q());
                        }
                    } else {
                        zMo76b = false;
                    }
                    InterfaceC0011c interfaceC0011c = this.f3618d;
                    if (interfaceC0011c == null || !interfaceC0011c.mo76b(glideException, this.f3622h, this.f3628n, m3359q())) {
                        z9 = false;
                    }
                    if (!(zMo76b | z9)) {
                        m3366z();
                    }
                    this.f3613B = false;
                    m3362u();
                } catch (Throwable th) {
                    this.f3613B = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    public final void m3365y(InterfaceC8259j interfaceC8259j, Object obj, DataSource dataSource) {
        boolean zMo75a;
        boolean zM3359q = m3359q();
        this.f3636v = Status.COMPLETE;
        this.f3632r = interfaceC8259j;
        if (this.f3621g.m3035g() <= 3) {
            obj.getClass();
            Objects.toString(dataSource);
            Objects.toString(this.f3622h);
            AbstractC7833e.m12239a(this.f3634t);
        }
        boolean z9 = true;
        this.f3613B = true;
        try {
            List list = this.f3629o;
            if (list != null) {
                Iterator it = list.iterator();
                zMo75a = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    DataSource dataSource2 = dataSource;
                    zMo75a |= ((InterfaceC0011c) it.next()).mo75a(obj2, this.f3622h, this.f3628n, dataSource2, zM3359q);
                    obj = obj2;
                    dataSource = dataSource2;
                }
            } else {
                zMo75a = false;
            }
            Object obj3 = obj;
            DataSource dataSource3 = dataSource;
            InterfaceC0011c interfaceC0011c = this.f3618d;
            if (interfaceC0011c == null || !interfaceC0011c.mo75a(obj3, this.f3622h, this.f3628n, dataSource3, zM3359q)) {
                z9 = false;
            }
            if (!(z9 | zMo75a)) {
                this.f3628n.mo2142c(obj3, this.f3630p.mo2312a(dataSource3, zM3359q));
            }
            this.f3613B = false;
            m3363v();
        } catch (Throwable th) {
            this.f3613B = false;
            throw th;
        }
    }

    /* renamed from: z */
    public final void m3366z() {
        if (m3353k()) {
            Drawable drawableM3357o = this.f3622h == null ? m3357o() : null;
            if (drawableM3357o == null) {
                drawableM3357o = m3356n();
            }
            if (drawableM3357o == null) {
                drawableM3357o = m3358p();
            }
            this.f3628n.mo2132b(drawableM3357o);
        }
    }
}

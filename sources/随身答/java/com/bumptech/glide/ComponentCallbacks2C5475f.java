package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p002a1.C0012d;
import p002a1.InterfaceC0010b;
import p019b1.InterfaceC5097h;
import p091e1.AbstractC7838j;
import p152k0.AbstractC8252c;
import p288x0.C9862o;
import p288x0.C9863p;
import p288x0.InterfaceC9850c;
import p288x0.InterfaceC9851d;
import p288x0.InterfaceC9855h;
import p288x0.InterfaceC9856i;
import p288x0.InterfaceC9861n;

/* renamed from: com.bumptech.glide.f */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C5475f implements ComponentCallbacks2, InterfaceC9856i {

    /* renamed from: m */
    public static final C0012d f3275m = (C0012d) C0012d.m77j0(Bitmap.class).m27O();

    /* renamed from: n */
    public static final C0012d f3276n = (C0012d) C0012d.m77j0(GifDrawable.class).m27O();

    /* renamed from: o */
    public static final C0012d f3277o = (C0012d) ((C0012d) C0012d.m78k0(AbstractC8252c.f14325c).m35W(Priority.LOW)).m44d0(true);

    /* renamed from: a */
    public final ComponentCallbacks2C5471b f3278a;

    /* renamed from: b */
    public final Context f3279b;

    /* renamed from: c */
    public final InterfaceC9855h f3280c;

    /* renamed from: d */
    public final C9862o f3281d;

    /* renamed from: e */
    public final InterfaceC9861n f3282e;

    /* renamed from: f */
    public final C9863p f3283f;

    /* renamed from: g */
    public final Runnable f3284g;

    /* renamed from: h */
    public final Handler f3285h;

    /* renamed from: i */
    public final InterfaceC9850c f3286i;

    /* renamed from: j */
    public final CopyOnWriteArrayList f3287j;

    /* renamed from: k */
    public C0012d f3288k;

    /* renamed from: l */
    public boolean f3289l;

    /* renamed from: com.bumptech.glide.f$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C5475f componentCallbacks2C5475f = ComponentCallbacks2C5475f.this;
            componentCallbacks2C5475f.f3280c.mo16787b(componentCallbacks2C5475f);
        }
    }

    /* renamed from: com.bumptech.glide.f$b */
    public class b implements InterfaceC9850c.a {

        /* renamed from: a */
        public final C9862o f3291a;

        public b(C9862o c9862o) {
            this.f3291a = c9862o;
        }

        @Override // p288x0.InterfaceC9850c.a
        /* renamed from: a */
        public void mo3075a(boolean z9) {
            if (z9) {
                synchronized (ComponentCallbacks2C5475f.this) {
                    this.f3291a.m16834e();
                }
            }
        }
    }

    public ComponentCallbacks2C5475f(ComponentCallbacks2C5471b componentCallbacks2C5471b, InterfaceC9855h interfaceC9855h, InterfaceC9861n interfaceC9861n, Context context) {
        this(componentCallbacks2C5471b, interfaceC9855h, interfaceC9861n, new C9862o(), componentCallbacks2C5471b.m3018g(), context);
    }

    /* renamed from: i */
    public C5474e m3057i(Class cls) {
        return new C5474e(this.f3278a, this, cls, this.f3279b);
    }

    /* renamed from: j */
    public C5474e m3058j() {
        return m3057i(Bitmap.class).mo40b(f3275m);
    }

    /* renamed from: k */
    public C5474e m3059k() {
        return m3057i(Drawable.class);
    }

    /* renamed from: l */
    public C5474e m3060l() {
        return m3057i(GifDrawable.class).mo40b(f3276n);
    }

    /* renamed from: m */
    public void m3061m(InterfaceC5097h interfaceC5097h) {
        if (interfaceC5097h == null) {
            return;
        }
        m3074z(interfaceC5097h);
    }

    /* renamed from: n */
    public List m3062n() {
        return this.f3287j;
    }

    /* renamed from: o */
    public synchronized C0012d m3063o() {
        return this.f3288k;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p288x0.InterfaceC9856i
    public synchronized void onDestroy() {
        try {
            this.f3283f.onDestroy();
            Iterator it = this.f3283f.m16838j().iterator();
            while (it.hasNext()) {
                m3061m((InterfaceC5097h) it.next());
            }
            this.f3283f.m16837i();
            this.f3281d.m16831b();
            this.f3280c.mo16786a(this);
            this.f3280c.mo16786a(this.f3286i);
            this.f3285h.removeCallbacks(this.f3284g);
            this.f3278a.m3026s(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // p288x0.InterfaceC9856i
    public synchronized void onStart() {
        m3070v();
        this.f3283f.onStart();
    }

    @Override // p288x0.InterfaceC9856i
    public synchronized void onStop() {
        m3069u();
        this.f3283f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i9) {
        if (i9 == 60 && this.f3289l) {
            m3068t();
        }
    }

    /* renamed from: p */
    public AbstractC5476g m3064p(Class cls) {
        return this.f3278a.m3020i().m3033e(cls);
    }

    /* renamed from: q */
    public C5474e m3065q(Object obj) {
        return m3059k().m3054x0(obj);
    }

    /* renamed from: r */
    public C5474e m3066r(String str) {
        return m3059k().m3055y0(str);
    }

    /* renamed from: s */
    public synchronized void m3067s() {
        this.f3281d.m16832c();
    }

    /* renamed from: t */
    public synchronized void m3068t() {
        m3067s();
        Iterator it = this.f3282e.mo3342a().iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C5475f) it.next()).m3067s();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3281d + ", treeNode=" + this.f3282e + "}";
    }

    /* renamed from: u */
    public synchronized void m3069u() {
        this.f3281d.m16833d();
    }

    /* renamed from: v */
    public synchronized void m3070v() {
        this.f3281d.m16835f();
    }

    /* renamed from: w */
    public synchronized void m3071w(C0012d c0012d) {
        this.f3288k = (C0012d) ((C0012d) c0012d.mo49g()).m43d();
    }

    /* renamed from: x */
    public synchronized void m3072x(InterfaceC5097h interfaceC5097h, InterfaceC0010b interfaceC0010b) {
        this.f3283f.m16839k(interfaceC5097h);
        this.f3281d.m16836g(interfaceC0010b);
    }

    /* renamed from: y */
    public synchronized boolean m3073y(InterfaceC5097h interfaceC5097h) {
        InterfaceC0010b interfaceC0010bMo2137a = interfaceC5097h.mo2137a();
        if (interfaceC0010bMo2137a == null) {
            return true;
        }
        if (!this.f3281d.m16830a(interfaceC0010bMo2137a)) {
            return false;
        }
        this.f3283f.m16840l(interfaceC5097h);
        interfaceC5097h.mo2138d(null);
        return true;
    }

    /* renamed from: z */
    public final void m3074z(InterfaceC5097h interfaceC5097h) {
        boolean zM3073y = m3073y(interfaceC5097h);
        InterfaceC0010b interfaceC0010bMo2137a = interfaceC5097h.mo2137a();
        if (zM3073y || this.f3278a.m3024p(interfaceC5097h) || interfaceC0010bMo2137a == null) {
            return;
        }
        interfaceC5097h.mo2138d(null);
        interfaceC0010bMo2137a.clear();
    }

    public ComponentCallbacks2C5475f(ComponentCallbacks2C5471b componentCallbacks2C5471b, InterfaceC9855h interfaceC9855h, InterfaceC9861n interfaceC9861n, C9862o c9862o, InterfaceC9851d interfaceC9851d, Context context) {
        this.f3283f = new C9863p();
        a aVar = new a();
        this.f3284g = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f3285h = handler;
        this.f3278a = componentCallbacks2C5471b;
        this.f3280c = interfaceC9855h;
        this.f3282e = interfaceC9861n;
        this.f3281d = c9862o;
        this.f3279b = context;
        InterfaceC9850c interfaceC9850cMo16791a = interfaceC9851d.mo16791a(context.getApplicationContext(), new b(c9862o));
        this.f3286i = interfaceC9850cMo16791a;
        if (AbstractC7838j.m12272o()) {
            handler.post(aVar);
        } else {
            interfaceC9855h.mo16787b(this);
        }
        interfaceC9855h.mo16787b(interfaceC9850cMo16791a);
        this.f3287j = new CopyOnWriteArrayList(componentCallbacks2C5471b.m3020i().m3031c());
        m3071w(componentCallbacks2C5471b.m3020i().m3032d());
        componentCallbacks2C5471b.m3023o(this);
    }
}

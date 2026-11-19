package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p020b1.C4958q;
import p020b1.C4960s;
import p020b1.InterfaceC4943b;
import p020b1.InterfaceC4944c;
import p020b1.InterfaceC4951j;
import p020b1.InterfaceC4953l;
import p020b1.InterfaceC4957p;
import p073e1.C7327d;
import p073e1.InterfaceC7325b;
import p084f1.InterfaceC7431h;
import p117i1.AbstractC7652k;
import p184o0.AbstractC8683c;

/* renamed from: com.bumptech.glide.h */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C5348h implements ComponentCallbacks2, InterfaceC4953l {

    /* renamed from: m */
    public static final C7327d f3444m = (C7327d) C7327d.m11705l0(Bitmap.class).m11661Q();

    /* renamed from: n */
    public static final C7327d f3445n = (C7327d) C7327d.m11705l0(GifDrawable.class).m11661Q();

    /* renamed from: o */
    public static final C7327d f3446o = (C7327d) ((C7327d) C7327d.m11706m0(AbstractC8683c.f14424c).m11669Y(Priority.LOW)).m11679f0(true);

    /* renamed from: a */
    public final ComponentCallbacks2C5342b f3447a;

    /* renamed from: b */
    public final Context f3448b;

    /* renamed from: c */
    public final InterfaceC4951j f3449c;

    /* renamed from: d */
    public final C4958q f3450d;

    /* renamed from: e */
    public final InterfaceC4957p f3451e;

    /* renamed from: f */
    public final C4960s f3452f;

    /* renamed from: g */
    public final Runnable f3453g;

    /* renamed from: h */
    public final InterfaceC4943b f3454h;

    /* renamed from: i */
    public final CopyOnWriteArrayList f3455i;

    /* renamed from: j */
    public C7327d f3456j;

    /* renamed from: k */
    public boolean f3457k;

    /* renamed from: l */
    public boolean f3458l;

    /* renamed from: com.bumptech.glide.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C5348h componentCallbacks2C5348h = ComponentCallbacks2C5348h.this;
            componentCallbacks2C5348h.f3449c.mo2329b(componentCallbacks2C5348h);
        }
    }

    /* renamed from: com.bumptech.glide.h$b */
    public class b implements InterfaceC4943b.a {

        /* renamed from: a */
        public final C4958q f3460a;

        public b(C4958q c4958q) {
            this.f3460a = c4958q;
        }

        @Override // p020b1.InterfaceC4943b.a
        /* renamed from: a */
        public void mo2330a(boolean z9) {
            if (z9) {
                synchronized (ComponentCallbacks2C5348h.this) {
                    this.f3460a.m2356e();
                }
            }
        }
    }

    public ComponentCallbacks2C5348h(ComponentCallbacks2C5342b componentCallbacks2C5342b, InterfaceC4951j interfaceC4951j, InterfaceC4957p interfaceC4957p, Context context) {
        this(componentCallbacks2C5342b, interfaceC4951j, interfaceC4957p, new C4958q(), componentCallbacks2C5342b.m3303g(), context);
    }

    /* renamed from: A */
    public final void m3352A(InterfaceC7431h interfaceC7431h) {
        boolean zM3370z = m3370z(interfaceC7431h);
        InterfaceC7325b interfaceC7325bMo11957a = interfaceC7431h.mo11957a();
        if (zM3370z || this.f3447a.m3309p(interfaceC7431h) || interfaceC7325bMo11957a == null) {
            return;
        }
        interfaceC7431h.mo11958c(null);
        interfaceC7325bMo11957a.clear();
    }

    /* renamed from: i */
    public C5347g m3353i(Class cls) {
        return new C5347g(this.f3447a, this, cls, this.f3448b);
    }

    /* renamed from: j */
    public C5347g m3354j() {
        return m3353i(Bitmap.class).mo3335b(f3444m);
    }

    /* renamed from: k */
    public C5347g m3355k() {
        return m3353i(Drawable.class);
    }

    /* renamed from: l */
    public C5347g m3356l() {
        return m3353i(GifDrawable.class).mo3335b(f3445n);
    }

    /* renamed from: m */
    public void m3357m(InterfaceC7431h interfaceC7431h) {
        if (interfaceC7431h == null) {
            return;
        }
        m3352A(interfaceC7431h);
    }

    /* renamed from: n */
    public final synchronized void m3358n() {
        try {
            Iterator it = this.f3452f.m2369j().iterator();
            while (it.hasNext()) {
                m3357m((InterfaceC7431h) it.next());
            }
            this.f3452f.m2368i();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: o */
    public List m3359o() {
        return this.f3455i;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p020b1.InterfaceC4953l
    public synchronized void onDestroy() {
        this.f3452f.onDestroy();
        m3358n();
        this.f3450d.m2353b();
        this.f3449c.mo2328a(this);
        this.f3449c.mo2328a(this.f3454h);
        AbstractC7652k.m12706v(this.f3453g);
        this.f3447a.m3311s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // p020b1.InterfaceC4953l
    public synchronized void onStart() {
        m3367w();
        this.f3452f.onStart();
    }

    @Override // p020b1.InterfaceC4953l
    public synchronized void onStop() {
        try {
            this.f3452f.onStop();
            if (this.f3458l) {
                m3358n();
            } else {
                m3366v();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f3457k) {
            m3365u();
        }
    }

    /* renamed from: p */
    public synchronized C7327d m3360p() {
        return this.f3456j;
    }

    /* renamed from: q */
    public AbstractC5349i m3361q(Class cls) {
        return this.f3447a.m3305i().m3318e(cls);
    }

    /* renamed from: r */
    public C5347g m3362r(Object obj) {
        return m3355k().m3351z0(obj);
    }

    /* renamed from: s */
    public C5347g m3363s(String str) {
        return m3355k().m3331A0(str);
    }

    /* renamed from: t */
    public synchronized void m3364t() {
        this.f3450d.m2354c();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3450d + ", treeNode=" + this.f3451e + "}";
    }

    /* renamed from: u */
    public synchronized void m3365u() {
        m3364t();
        Iterator it = this.f3451e.mo2335a().iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C5348h) it.next()).m3364t();
        }
    }

    /* renamed from: v */
    public synchronized void m3366v() {
        this.f3450d.m2355d();
    }

    /* renamed from: w */
    public synchronized void m3367w() {
        this.f3450d.m2357f();
    }

    /* renamed from: x */
    public synchronized void m3368x(C7327d c7327d) {
        this.f3456j = (C7327d) ((C7327d) c7327d.clone()).m11673c();
    }

    /* renamed from: y */
    public synchronized void m3369y(InterfaceC7431h interfaceC7431h, InterfaceC7325b interfaceC7325b) {
        this.f3452f.m2370k(interfaceC7431h);
        this.f3450d.m2358g(interfaceC7325b);
    }

    /* renamed from: z */
    public synchronized boolean m3370z(InterfaceC7431h interfaceC7431h) {
        InterfaceC7325b interfaceC7325bMo11957a = interfaceC7431h.mo11957a();
        if (interfaceC7325bMo11957a == null) {
            return true;
        }
        if (!this.f3450d.m2352a(interfaceC7325bMo11957a)) {
            return false;
        }
        this.f3452f.m2371l(interfaceC7431h);
        interfaceC7431h.mo11958c(null);
        return true;
    }

    public ComponentCallbacks2C5348h(ComponentCallbacks2C5342b componentCallbacks2C5342b, InterfaceC4951j interfaceC4951j, InterfaceC4957p interfaceC4957p, C4958q c4958q, InterfaceC4944c interfaceC4944c, Context context) {
        this.f3452f = new C4960s();
        a aVar = new a();
        this.f3453g = aVar;
        this.f3447a = componentCallbacks2C5342b;
        this.f3449c = interfaceC4951j;
        this.f3451e = interfaceC4957p;
        this.f3450d = c4958q;
        this.f3448b = context;
        InterfaceC4943b interfaceC4943bMo2331a = interfaceC4944c.mo2331a(context.getApplicationContext(), new b(c4958q));
        this.f3454h = interfaceC4943bMo2331a;
        componentCallbacks2C5342b.m3308o(this);
        if (AbstractC7652k.m12701q()) {
            AbstractC7652k.m12705u(aVar);
        } else {
            interfaceC4951j.mo2329b(this);
        }
        interfaceC4951j.mo2329b(interfaceC4943bMo2331a);
        this.f3455i = new CopyOnWriteArrayList(componentCallbacks2C5342b.m3305i().m3316c());
        m3368x(componentCallbacks2C5342b.m3305i().m3317d());
    }
}

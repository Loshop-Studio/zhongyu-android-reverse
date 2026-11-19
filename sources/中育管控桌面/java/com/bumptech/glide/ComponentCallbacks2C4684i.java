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
import p016b1.AbstractC4409k;
import p067h0.AbstractC6433c;
import p160u0.C7764q;
import p160u0.C7766s;
import p160u0.InterfaceC7749b;
import p160u0.InterfaceC7750c;
import p160u0.InterfaceC7757j;
import p160u0.InterfaceC7759l;
import p160u0.InterfaceC7763p;
import p181x0.C7826d;
import p181x0.InterfaceC7824b;
import p188y0.InterfaceC7894h;

/* renamed from: com.bumptech.glide.i */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C4684i implements ComponentCallbacks2, InterfaceC7759l {

    /* renamed from: m */
    public static final C7826d f2235m = (C7826d) C7826d.m9451m0(Bitmap.class).mo7341Q();

    /* renamed from: n */
    public static final C7826d f2236n = (C7826d) C7826d.m9451m0(GifDrawable.class).mo7341Q();

    /* renamed from: o */
    public static final C7826d f2237o = (C7826d) ((C7826d) C7826d.m9452n0(AbstractC6433c.f8114c).mo7347Y(Priority.LOW)).mo7353f0(true);

    /* renamed from: a */
    public final ComponentCallbacks2C4678c f2238a;

    /* renamed from: b */
    public final Context f2239b;

    /* renamed from: c */
    public final InterfaceC7757j f2240c;

    /* renamed from: d */
    public final C7764q f2241d;

    /* renamed from: e */
    public final InterfaceC7763p f2242e;

    /* renamed from: f */
    public final C7766s f2243f;

    /* renamed from: g */
    public final Runnable f2244g;

    /* renamed from: h */
    public final InterfaceC7749b f2245h;

    /* renamed from: i */
    public final CopyOnWriteArrayList f2246i;

    /* renamed from: j */
    public C7826d f2247j;

    /* renamed from: k */
    public boolean f2248k;

    /* renamed from: l */
    public boolean f2249l;

    /* renamed from: com.bumptech.glide.i$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C4684i componentCallbacks2C4684i = ComponentCallbacks2C4684i.this;
            componentCallbacks2C4684i.f2240c.mo9258b(componentCallbacks2C4684i);
        }
    }

    /* renamed from: com.bumptech.glide.i$b */
    public class b implements InterfaceC7749b.a {

        /* renamed from: a */
        public final C7764q f2251a;

        public b(C7764q c7764q) {
            this.f2251a = c7764q;
        }

        @Override // p160u0.InterfaceC7749b.a
        /* renamed from: a */
        public void mo2551a(boolean z6) {
            if (z6) {
                synchronized (ComponentCallbacks2C4684i.this) {
                    this.f2251a.m9283e();
                }
            }
        }
    }

    public ComponentCallbacks2C4684i(ComponentCallbacks2C4678c componentCallbacks2C4678c, InterfaceC7757j interfaceC7757j, InterfaceC7763p interfaceC7763p, Context context) {
        this(componentCallbacks2C4678c, interfaceC7757j, interfaceC7763p, new C7764q(), componentCallbacks2C4678c.m2482g(), context);
    }

    /* renamed from: A */
    public synchronized boolean m2531A(InterfaceC7894h interfaceC7894h) {
        InterfaceC7824b interfaceC7824bMo9681a = interfaceC7894h.mo9681a();
        if (interfaceC7824bMo9681a == null) {
            return true;
        }
        if (!this.f2241d.m9279a(interfaceC7824bMo9681a)) {
            return false;
        }
        this.f2243f.m9298m(interfaceC7894h);
        interfaceC7894h.mo9683h(null);
        return true;
    }

    /* renamed from: B */
    public final void m2532B(InterfaceC7894h interfaceC7894h) {
        boolean zM2531A = m2531A(interfaceC7894h);
        InterfaceC7824b interfaceC7824bMo9681a = interfaceC7894h.mo9681a();
        if (zM2531A || this.f2238a.m2488p(interfaceC7894h) || interfaceC7824bMo9681a == null) {
            return;
        }
        interfaceC7894h.mo9683h(null);
        interfaceC7824bMo9681a.clear();
    }

    @Override // p160u0.InterfaceC7759l
    /* renamed from: d */
    public synchronized void mo2533d() {
        this.f2243f.mo2533d();
        m2539o();
        this.f2241d.m9280b();
        this.f2240c.mo9257a(this);
        this.f2240c.mo9257a(this.f2245h);
        AbstractC4409k.m1461v(this.f2244g);
        this.f2238a.m2490s(this);
    }

    /* renamed from: j */
    public C4683h mo2534j(Class cls) {
        return new C4683h(this.f2238a, this, cls, this.f2239b);
    }

    /* renamed from: k */
    public C4683h mo2535k() {
        return mo2534j(Bitmap.class).mo2514b(f2235m);
    }

    /* renamed from: l */
    public C4683h mo2536l() {
        return mo2534j(Drawable.class);
    }

    /* renamed from: m */
    public C4683h mo2537m() {
        return mo2534j(GifDrawable.class).mo2514b(f2236n);
    }

    /* renamed from: n */
    public void m2538n(InterfaceC7894h interfaceC7894h) {
        if (interfaceC7894h == null) {
            return;
        }
        m2532B(interfaceC7894h);
    }

    /* renamed from: o */
    public final synchronized void m2539o() {
        try {
            Iterator it = this.f2243f.m9296k().iterator();
            while (it.hasNext()) {
                m2538n((InterfaceC7894h) it.next());
            }
            this.f2243f.m9295j();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // p160u0.InterfaceC7759l
    public synchronized void onStart() {
        m2548x();
        this.f2243f.onStart();
    }

    @Override // p160u0.InterfaceC7759l
    public synchronized void onStop() {
        try {
            this.f2243f.onStop();
            if (this.f2249l) {
                m2539o();
            } else {
                m2547w();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        if (i6 == 60 && this.f2248k) {
            m2546v();
        }
    }

    /* renamed from: p */
    public List m2540p() {
        return this.f2246i;
    }

    /* renamed from: q */
    public synchronized C7826d m2541q() {
        return this.f2247j;
    }

    /* renamed from: r */
    public AbstractC4685j m2542r(Class cls) {
        return this.f2238a.m2484i().m2497e(cls);
    }

    /* renamed from: s */
    public C4683h mo2543s(Object obj) {
        return mo2536l().mo2530z0(obj);
    }

    /* renamed from: t */
    public C4683h mo2544t(String str) {
        return mo2536l().mo2510A0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2241d + ", treeNode=" + this.f2242e + "}";
    }

    /* renamed from: u */
    public synchronized void m2545u() {
        this.f2241d.m9281c();
    }

    /* renamed from: v */
    public synchronized void m2546v() {
        m2545u();
        Iterator it = this.f2242e.mo9263a().iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C4684i) it.next()).m2545u();
        }
    }

    /* renamed from: w */
    public synchronized void m2547w() {
        this.f2241d.m9282d();
    }

    /* renamed from: x */
    public synchronized void m2548x() {
        this.f2241d.m9284f();
    }

    /* renamed from: y */
    public synchronized void mo2549y(C7826d c7826d) {
        this.f2247j = (C7826d) ((C7826d) c7826d.clone()).mo7349d();
    }

    /* renamed from: z */
    public synchronized void m2550z(InterfaceC7894h interfaceC7894h, InterfaceC7824b interfaceC7824b) {
        this.f2243f.m9297l(interfaceC7894h);
        this.f2241d.m9285g(interfaceC7824b);
    }

    public ComponentCallbacks2C4684i(ComponentCallbacks2C4678c componentCallbacks2C4678c, InterfaceC7757j interfaceC7757j, InterfaceC7763p interfaceC7763p, C7764q c7764q, InterfaceC7750c interfaceC7750c, Context context) {
        this.f2243f = new C7766s();
        a aVar = new a();
        this.f2244g = aVar;
        this.f2238a = componentCallbacks2C4678c;
        this.f2240c = interfaceC7757j;
        this.f2242e = interfaceC7763p;
        this.f2241d = c7764q;
        this.f2239b = context;
        InterfaceC7749b interfaceC7749bMo9259a = interfaceC7750c.mo9259a(context.getApplicationContext(), new b(c7764q));
        this.f2245h = interfaceC7749bMo9259a;
        componentCallbacks2C4678c.m2487o(this);
        if (AbstractC4409k.m1456q()) {
            AbstractC4409k.m1460u(aVar);
        } else {
            interfaceC7757j.mo9258b(this);
        }
        interfaceC7757j.mo9258b(interfaceC7749bMo9259a);
        this.f2246i = new CopyOnWriteArrayList(componentCallbacks2C4678c.m2484i().m2495c());
        mo2549y(componentCallbacks2C4678c.m2484i().m2496d());
    }
}

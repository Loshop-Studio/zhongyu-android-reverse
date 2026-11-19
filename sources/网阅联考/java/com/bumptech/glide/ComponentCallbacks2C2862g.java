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
import p016c0.C2753d;
import p016c0.InterfaceC2751b;
import p047d0.InterfaceC3698h;
import p062g0.AbstractC3750j;
import p093m.AbstractC4354c;
import p146z.C4703o;
import p146z.C4704p;
import p146z.InterfaceC4691c;
import p146z.InterfaceC4692d;
import p146z.InterfaceC4696h;
import p146z.InterfaceC4697i;
import p146z.InterfaceC4702n;

/* renamed from: com.bumptech.glide.g */
/* loaded from: classes2.dex */
public class ComponentCallbacks2C2862g implements ComponentCallbacks2, InterfaceC4697i {

    /* renamed from: m */
    public static final C2753d f621m = (C2753d) C2753d.m1619k0(Bitmap.class).m1568M();

    /* renamed from: n */
    public static final C2753d f622n = (C2753d) C2753d.m1619k0(GifDrawable.class).m1568M();

    /* renamed from: o */
    public static final C2753d f623o = (C2753d) ((C2753d) C2753d.m1620l0(AbstractC4354c.f4867c).m1576X(Priority.LOW)).m1587e0(true);

    /* renamed from: a */
    public final ComponentCallbacks2C2858c f624a;

    /* renamed from: b */
    public final Context f625b;

    /* renamed from: c */
    public final InterfaceC4696h f626c;

    /* renamed from: d */
    public final C4703o f627d;

    /* renamed from: e */
    public final InterfaceC4702n f628e;

    /* renamed from: f */
    public final C4704p f629f;

    /* renamed from: g */
    public final Runnable f630g;

    /* renamed from: h */
    public final Handler f631h;

    /* renamed from: i */
    public final InterfaceC4691c f632i;

    /* renamed from: j */
    public final CopyOnWriteArrayList f633j;

    /* renamed from: k */
    public C2753d f634k;

    /* renamed from: l */
    public boolean f635l;

    /* renamed from: com.bumptech.glide.g$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C2862g componentCallbacks2C2862g = ComponentCallbacks2C2862g.this;
            componentCallbacks2C2862g.f626c.mo6654b(componentCallbacks2C2862g);
        }
    }

    /* renamed from: com.bumptech.glide.g$b */
    public class b implements InterfaceC4691c.a {

        /* renamed from: a */
        public final C4703o f637a;

        public b(C4703o c4703o) {
            this.f637a = c4703o;
        }

        @Override // p146z.InterfaceC4691c.a
        /* renamed from: a */
        public void mo1750a(boolean z3) {
            if (z3) {
                synchronized (ComponentCallbacks2C2862g.this) {
                    this.f637a.m6701e();
                }
            }
        }
    }

    public ComponentCallbacks2C2862g(ComponentCallbacks2C2858c componentCallbacks2C2858c, InterfaceC4696h interfaceC4696h, InterfaceC4702n interfaceC4702n, Context context) {
        this(componentCallbacks2C2858c, interfaceC4696h, interfaceC4702n, new C4703o(), componentCallbacks2C2858c.m1692g(), context);
    }

    /* renamed from: A */
    public final void m1731A(InterfaceC3698h interfaceC3698h) {
        boolean zM1749z = m1749z(interfaceC3698h);
        InterfaceC2751b interfaceC2751bMo4675h = interfaceC3698h.mo4675h();
        if (zM1749z || this.f624a.m1698p(interfaceC3698h) || interfaceC2751bMo4675h == null) {
            return;
        }
        interfaceC3698h.mo4673d(null);
        interfaceC2751bMo4675h.clear();
    }

    @Override // p146z.InterfaceC4697i
    /* renamed from: c */
    public synchronized void mo1732c() {
        this.f629f.mo1732c();
        Iterator it = this.f629f.m6705k().iterator();
        while (it.hasNext()) {
            m1737n((InterfaceC3698h) it.next());
        }
        this.f629f.m6704j();
        this.f627d.m6698b();
        this.f626c.mo6653a(this);
        this.f626c.mo6653a(this.f632i);
        this.f631h.removeCallbacks(this.f630g);
        this.f624a.m1700s(this);
    }

    /* renamed from: j */
    public C2861f m1733j(Class cls) {
        return new C2861f(this.f624a, this, cls, this.f625b);
    }

    /* renamed from: k */
    public C2861f m1734k() {
        return m1733j(Bitmap.class).mo1579a(f621m);
    }

    /* renamed from: l */
    public C2861f m1735l() {
        return m1733j(Drawable.class);
    }

    /* renamed from: m */
    public C2861f m1736m() {
        return m1733j(GifDrawable.class).mo1579a(f622n);
    }

    /* renamed from: n */
    public void m1737n(InterfaceC3698h interfaceC3698h) {
        if (interfaceC3698h == null) {
            return;
        }
        m1731A(interfaceC3698h);
    }

    /* renamed from: o */
    public List m1738o() {
        return this.f633j;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // p146z.InterfaceC4697i
    public synchronized void onStart() {
        m1746w();
        this.f629f.onStart();
    }

    @Override // p146z.InterfaceC4697i
    public synchronized void onStop() {
        m1745v();
        this.f629f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        if (i4 == 60 && this.f635l) {
            m1744u();
        }
    }

    /* renamed from: p */
    public synchronized C2753d m1739p() {
        return this.f634k;
    }

    /* renamed from: q */
    public AbstractC2863h m1740q(Class cls) {
        return this.f624a.m1694i().m1707e(cls);
    }

    /* renamed from: r */
    public C2861f m1741r(Object obj) {
        return m1735l().m1729y0(obj);
    }

    /* renamed from: s */
    public C2861f m1742s(String str) {
        return m1735l().m1730z0(str);
    }

    /* renamed from: t */
    public synchronized void m1743t() {
        this.f627d.m6699c();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f627d + ", treeNode=" + this.f628e + "}";
    }

    /* renamed from: u */
    public synchronized void m1744u() {
        m1743t();
        Iterator it = this.f628e.mo2020a().iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C2862g) it.next()).m1743t();
        }
    }

    /* renamed from: v */
    public synchronized void m1745v() {
        this.f627d.m6700d();
    }

    /* renamed from: w */
    public synchronized void m1746w() {
        this.f627d.m6702f();
    }

    /* renamed from: x */
    public synchronized void m1747x(C2753d c2753d) {
        this.f634k = (C2753d) ((C2753d) c2753d.mo1588f()).m1582c();
    }

    /* renamed from: y */
    public synchronized void m1748y(InterfaceC3698h interfaceC3698h, InterfaceC2751b interfaceC2751b) {
        this.f629f.m6706l(interfaceC3698h);
        this.f627d.m6703g(interfaceC2751b);
    }

    /* renamed from: z */
    public synchronized boolean m1749z(InterfaceC3698h interfaceC3698h) {
        InterfaceC2751b interfaceC2751bMo4675h = interfaceC3698h.mo4675h();
        if (interfaceC2751bMo4675h == null) {
            return true;
        }
        if (!this.f627d.m6697a(interfaceC2751bMo4675h)) {
            return false;
        }
        this.f629f.m6707m(interfaceC3698h);
        interfaceC3698h.mo4673d(null);
        return true;
    }

    public ComponentCallbacks2C2862g(ComponentCallbacks2C2858c componentCallbacks2C2858c, InterfaceC4696h interfaceC4696h, InterfaceC4702n interfaceC4702n, C4703o c4703o, InterfaceC4692d interfaceC4692d, Context context) {
        this.f629f = new C4704p();
        a aVar = new a();
        this.f630g = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f631h = handler;
        this.f624a = componentCallbacks2C2858c;
        this.f626c = interfaceC4696h;
        this.f628e = interfaceC4702n;
        this.f627d = c4703o;
        this.f625b = context;
        InterfaceC4691c interfaceC4691cMo6658a = interfaceC4692d.mo6658a(context.getApplicationContext(), new b(c4703o));
        this.f632i = interfaceC4691cMo6658a;
        if (AbstractC3750j.m4784o()) {
            handler.post(aVar);
        } else {
            interfaceC4696h.mo6654b(this);
        }
        interfaceC4696h.mo6654b(interfaceC4691cMo6658a);
        this.f633j = new CopyOnWriteArrayList(componentCallbacks2C2858c.m1694i().m1705c());
        m1747x(componentCallbacks2C2858c.m1694i().m1706d());
        componentCallbacks2C2858c.m1697o(this);
    }
}

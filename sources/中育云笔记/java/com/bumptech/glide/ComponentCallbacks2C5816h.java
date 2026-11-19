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
import p002a1.InterfaceC0037h;
import p109d1.AbstractC8910k;
import p198j0.AbstractC9650c;
import p381w0.C11657q;
import p381w0.C11659s;
import p381w0.InterfaceC11642b;
import p381w0.InterfaceC11643c;
import p381w0.InterfaceC11650j;
import p381w0.InterfaceC11652l;
import p381w0.InterfaceC11656p;
import p428z0.C11955d;
import p428z0.InterfaceC11953b;

/* renamed from: com.bumptech.glide.h */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C5816h implements ComponentCallbacks2, InterfaceC11652l {

    /* renamed from: o */
    public static final C11955d f4647o = (C11955d) C11955d.m26575o0(Bitmap.class).m26528P();

    /* renamed from: p */
    public static final C11955d f4648p = (C11955d) C11955d.m26575o0(GifDrawable.class).m26528P();

    /* renamed from: q */
    public static final C11955d f4649q = (C11955d) ((C11955d) C11955d.m26576p0(AbstractC9650c.f22357c).m26536X(Priority.LOW)).m26548g0(true);

    /* renamed from: c */
    public final ComponentCallbacks2C5810b f4650c;

    /* renamed from: d */
    public final Context f4651d;

    /* renamed from: e */
    public final InterfaceC11650j f4652e;

    /* renamed from: f */
    public final C11657q f4653f;

    /* renamed from: g */
    public final InterfaceC11656p f4654g;

    /* renamed from: h */
    public final C11659s f4655h;

    /* renamed from: i */
    public final Runnable f4656i;

    /* renamed from: j */
    public final InterfaceC11642b f4657j;

    /* renamed from: k */
    public final CopyOnWriteArrayList f4658k;

    /* renamed from: l */
    public C11955d f4659l;

    /* renamed from: m */
    public boolean f4660m;

    /* renamed from: n */
    public boolean f4661n;

    /* renamed from: com.bumptech.glide.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C5816h componentCallbacks2C5816h = ComponentCallbacks2C5816h.this;
            componentCallbacks2C5816h.f4652e.mo25758a(componentCallbacks2C5816h);
        }
    }

    /* renamed from: com.bumptech.glide.h$b */
    public class b implements InterfaceC11642b.a {

        /* renamed from: a */
        public final C11657q f4663a;

        public b(C11657q c11657q) {
            this.f4663a = c11657q;
        }

        @Override // p381w0.InterfaceC11642b.a
        /* renamed from: a */
        public void mo4023a(boolean z10) {
            if (z10) {
                synchronized (ComponentCallbacks2C5816h.this) {
                    this.f4663a.m25785e();
                }
            }
        }
    }

    public ComponentCallbacks2C5816h(ComponentCallbacks2C5810b componentCallbacks2C5810b, InterfaceC11650j interfaceC11650j, InterfaceC11656p interfaceC11656p, Context context) {
        this(componentCallbacks2C5810b, interfaceC11650j, interfaceC11656p, new C11657q(), componentCallbacks2C5810b.m3953g(), context);
    }

    /* renamed from: A */
    public synchronized boolean m4003A(InterfaceC0037h interfaceC0037h) {
        InterfaceC11953b interfaceC11953bMo65a = interfaceC0037h.mo65a();
        if (interfaceC11953bMo65a == null) {
            return true;
        }
        if (!this.f4653f.m25781a(interfaceC11953bMo65a)) {
            return false;
        }
        this.f4655h.m25799l(interfaceC0037h);
        interfaceC0037h.mo68h(null);
        return true;
    }

    /* renamed from: B */
    public final void m4004B(InterfaceC0037h interfaceC0037h) {
        boolean zM4003A = m4003A(interfaceC0037h);
        InterfaceC11953b interfaceC11953bMo65a = interfaceC0037h.mo65a();
        if (zM4003A || this.f4650c.m3959p(interfaceC0037h) || interfaceC11953bMo65a == null) {
            return;
        }
        interfaceC0037h.mo68h(null);
        interfaceC11953bMo65a.clear();
    }

    /* renamed from: i */
    public C5815g m4005i(Class cls) {
        return new C5815g(this.f4650c, this, cls, this.f4651d);
    }

    /* renamed from: j */
    public C5815g m4006j() {
        return m4005i(Bitmap.class).mo3989b(f4647o);
    }

    /* renamed from: k */
    public C5815g m4007k() {
        return m4005i(Drawable.class);
    }

    /* renamed from: l */
    public C5815g m4008l() {
        return m4005i(GifDrawable.class).mo3989b(f4648p);
    }

    /* renamed from: m */
    public void m4009m(InterfaceC0037h interfaceC0037h) {
        if (interfaceC0037h == null) {
            return;
        }
        m4004B(interfaceC0037h);
    }

    /* renamed from: n */
    public final synchronized void m4010n() {
        try {
            Iterator it = this.f4655h.m25797j().iterator();
            while (it.hasNext()) {
                m4009m((InterfaceC0037h) it.next());
            }
            this.f4655h.m25796i();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: o */
    public List m4011o() {
        return this.f4658k;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p381w0.InterfaceC11652l
    public synchronized void onDestroy() {
        this.f4655h.onDestroy();
        m4010n();
        this.f4653f.m25782b();
        this.f4652e.mo25759b(this);
        this.f4652e.mo25759b(this.f4657j);
        AbstractC8910k.m17492w(this.f4656i);
        this.f4650c.m3961s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // p381w0.InterfaceC11652l
    public synchronized void onStart() {
        m4020x();
        this.f4655h.onStart();
    }

    @Override // p381w0.InterfaceC11652l
    public synchronized void onStop() {
        try {
            this.f4655h.onStop();
            if (this.f4661n) {
                m4010n();
            } else {
                m4019w();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f4660m) {
            m4018v();
        }
    }

    /* renamed from: p */
    public synchronized C11955d m4012p() {
        return this.f4659l;
    }

    /* renamed from: q */
    public AbstractC5817i m4013q(Class cls) {
        return this.f4650c.m3955i().m3968e(cls);
    }

    /* renamed from: r */
    public C5815g m4014r(Integer num) {
        return m4007k().m3984D0(num);
    }

    /* renamed from: s */
    public C5815g m4015s(Object obj) {
        return m4007k().m3985E0(obj);
    }

    /* renamed from: t */
    public C5815g m4016t(String str) {
        return m4007k().m3986F0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f4653f + ", treeNode=" + this.f4654g + "}";
    }

    /* renamed from: u */
    public synchronized void m4017u() {
        this.f4653f.m25783c();
    }

    /* renamed from: v */
    public synchronized void m4018v() {
        m4017u();
        Iterator it = this.f4654g.mo25764a().iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C5816h) it.next()).m4017u();
        }
    }

    /* renamed from: w */
    public synchronized void m4019w() {
        this.f4653f.m25784d();
    }

    /* renamed from: x */
    public synchronized void m4020x() {
        this.f4653f.m25786f();
    }

    /* renamed from: y */
    public synchronized void m4021y(C11955d c11955d) {
        this.f4659l = (C11955d) ((C11955d) c11955d.clone()).m26542d();
    }

    /* renamed from: z */
    public synchronized void m4022z(InterfaceC0037h interfaceC0037h, InterfaceC11953b interfaceC11953b) {
        this.f4655h.m25798k(interfaceC0037h);
        this.f4653f.m25787g(interfaceC11953b);
    }

    public ComponentCallbacks2C5816h(ComponentCallbacks2C5810b componentCallbacks2C5810b, InterfaceC11650j interfaceC11650j, InterfaceC11656p interfaceC11656p, C11657q c11657q, InterfaceC11643c interfaceC11643c, Context context) {
        this.f4655h = new C11659s();
        a aVar = new a();
        this.f4656i = aVar;
        this.f4650c = componentCallbacks2C5810b;
        this.f4652e = interfaceC11650j;
        this.f4654g = interfaceC11656p;
        this.f4653f = c11657q;
        this.f4651d = context;
        InterfaceC11642b interfaceC11642bMo25760a = interfaceC11643c.mo25760a(context.getApplicationContext(), new b(c11657q));
        this.f4657j = interfaceC11642bMo25760a;
        componentCallbacks2C5810b.m3958o(this);
        if (AbstractC8910k.m17487r()) {
            AbstractC8910k.m17491v(aVar);
        } else {
            interfaceC11650j.mo25758a(this);
        }
        interfaceC11650j.mo25758a(interfaceC11642bMo25760a);
        this.f4658k = new CopyOnWriteArrayList(componentCallbacks2C5810b.m3955i().m3966c());
        m4021y(componentCallbacks2C5810b.m3955i().m3967d());
    }
}

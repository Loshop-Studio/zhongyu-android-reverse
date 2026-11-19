package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p001a0.C0017q;
import p001a0.C0019s;
import p001a0.InterfaceC0002b;
import p001a0.InterfaceC0003c;
import p001a0.InterfaceC0010j;
import p001a0.InterfaceC0012l;
import p001a0.InterfaceC0016p;
import p069d0.C8272d;
import p069d0.InterfaceC8270b;
import p081e0.AbstractC8339d;
import p081e0.InterfaceC8344i;
import p093f0.InterfaceC8404b;
import p116h0.AbstractC8707k;
import p182n.AbstractC9350c;

/* renamed from: com.bumptech.glide.h */
/* loaded from: classes3.dex */
public class ComponentCallbacks2C5397h implements ComponentCallbacks2, InterfaceC0012l {

    /* renamed from: m */
    public static final C8272d f2877m = (C8272d) C8272d.m13414l0(Bitmap.class).m13370Q();

    /* renamed from: n */
    public static final C8272d f2878n = (C8272d) C8272d.m13414l0(GifDrawable.class).m13370Q();

    /* renamed from: o */
    public static final C8272d f2879o = (C8272d) ((C8272d) C8272d.m13415m0(AbstractC9350c.f18466c).m13378Y(Priority.LOW)).m13387f0(true);

    /* renamed from: a */
    public final ComponentCallbacks2C5391b f2880a;

    /* renamed from: b */
    public final Context f2881b;

    /* renamed from: c */
    public final InterfaceC0010j f2882c;

    /* renamed from: d */
    public final C0017q f2883d;

    /* renamed from: e */
    public final InterfaceC0016p f2884e;

    /* renamed from: f */
    public final C0019s f2885f;

    /* renamed from: g */
    public final Runnable f2886g;

    /* renamed from: h */
    public final InterfaceC0002b f2887h;

    /* renamed from: i */
    public final CopyOnWriteArrayList f2888i;

    /* renamed from: j */
    public C8272d f2889j;

    /* renamed from: k */
    public boolean f2890k;

    /* renamed from: l */
    public boolean f2891l;

    /* renamed from: com.bumptech.glide.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C5397h componentCallbacks2C5397h = ComponentCallbacks2C5397h.this;
            componentCallbacks2C5397h.f2882c.mo0a(componentCallbacks2C5397h);
        }
    }

    /* renamed from: com.bumptech.glide.h$c */
    public class c implements InterfaceC0002b.a {

        /* renamed from: a */
        public final C0017q f2893a;

        public c(C0017q c0017q) {
            this.f2893a = c0017q;
        }

        @Override // p001a0.InterfaceC0002b.a
        /* renamed from: a */
        public void mo2a(boolean z10) {
            if (z10) {
                synchronized (ComponentCallbacks2C5397h.this) {
                    this.f2893a.m28e();
                }
            }
        }
    }

    public ComponentCallbacks2C5397h(ComponentCallbacks2C5391b componentCallbacks2C5391b, InterfaceC0010j interfaceC0010j, InterfaceC0016p interfaceC0016p, Context context) {
        this(componentCallbacks2C5391b, interfaceC0010j, interfaceC0016p, new C0017q(), componentCallbacks2C5391b.m2744g(), context);
    }

    /* renamed from: A */
    public synchronized void m2794A(InterfaceC8344i interfaceC8344i, InterfaceC8270b interfaceC8270b) {
        this.f2885f.m42k(interfaceC8344i);
        this.f2883d.m30g(interfaceC8270b);
    }

    /* renamed from: B */
    public synchronized boolean m2795B(InterfaceC8344i interfaceC8344i) {
        InterfaceC8270b interfaceC8270bMo13551e = interfaceC8344i.mo13551e();
        if (interfaceC8270bMo13551e == null) {
            return true;
        }
        if (!this.f2883d.m24a(interfaceC8270bMo13551e)) {
            return false;
        }
        this.f2885f.m43l(interfaceC8344i);
        interfaceC8344i.mo13552g(null);
        return true;
    }

    /* renamed from: C */
    public final void m2796C(InterfaceC8344i interfaceC8344i) {
        boolean zM2795B = m2795B(interfaceC8344i);
        InterfaceC8270b interfaceC8270bMo13551e = interfaceC8344i.mo13551e();
        if (zM2795B || this.f2880a.m2750p(interfaceC8344i) || interfaceC8270bMo13551e == null) {
            return;
        }
        interfaceC8344i.mo13552g(null);
        interfaceC8270bMo13551e.clear();
    }

    /* renamed from: i */
    public C5396g m2797i(Class cls) {
        return new C5396g(this.f2880a, this, cls, this.f2881b);
    }

    /* renamed from: j */
    public C5396g m2798j() {
        return m2797i(Bitmap.class).mo2777c(f2877m);
    }

    /* renamed from: k */
    public C5396g m2799k() {
        return m2797i(Drawable.class);
    }

    /* renamed from: l */
    public C5396g m2800l() {
        return m2797i(GifDrawable.class).mo2777c(f2878n);
    }

    /* renamed from: m */
    public void m2801m(View view) {
        m2802n(new b(view));
    }

    /* renamed from: n */
    public void m2802n(InterfaceC8344i interfaceC8344i) {
        if (interfaceC8344i == null) {
            return;
        }
        m2796C(interfaceC8344i);
    }

    /* renamed from: o */
    public final synchronized void m2803o() {
        try {
            Iterator it = this.f2885f.m41j().iterator();
            while (it.hasNext()) {
                m2802n((InterfaceC8344i) it.next());
            }
            this.f2885f.m40i();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p001a0.InterfaceC0012l
    public synchronized void onDestroy() {
        this.f2885f.onDestroy();
        m2803o();
        this.f2883d.m25b();
        this.f2882c.mo1b(this);
        this.f2882c.mo1b(this.f2887h);
        AbstractC8707k.m14205w(this.f2886g);
        this.f2880a.m2752s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // p001a0.InterfaceC0012l
    public synchronized void onStart() {
        m2813y();
        this.f2885f.onStart();
    }

    @Override // p001a0.InterfaceC0012l
    public synchronized void onStop() {
        try {
            this.f2885f.onStop();
            if (this.f2891l) {
                m2803o();
            } else {
                m2812x();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f2890k) {
            m2811w();
        }
    }

    /* renamed from: p */
    public List m2804p() {
        return this.f2888i;
    }

    /* renamed from: q */
    public synchronized C8272d m2805q() {
        return this.f2889j;
    }

    /* renamed from: r */
    public AbstractC5398i m2806r(Class cls) {
        return this.f2880a.m2746i().m2759e(cls);
    }

    /* renamed from: s */
    public C5396g m2807s(File file) {
        return m2799k().m2793z0(file);
    }

    /* renamed from: t */
    public C5396g m2808t(Object obj) {
        return m2799k().m2772A0(obj);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2883d + ", treeNode=" + this.f2884e + "}";
    }

    /* renamed from: u */
    public C5396g m2809u(String str) {
        return m2799k().m2773B0(str);
    }

    /* renamed from: v */
    public synchronized void m2810v() {
        this.f2883d.m26c();
    }

    /* renamed from: w */
    public synchronized void m2811w() {
        m2810v();
        Iterator it = this.f2884e.mo7a().iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C5397h) it.next()).m2810v();
        }
    }

    /* renamed from: x */
    public synchronized void m2812x() {
        this.f2883d.m27d();
    }

    /* renamed from: y */
    public synchronized void m2813y() {
        this.f2883d.m29f();
    }

    /* renamed from: z */
    public synchronized void m2814z(C8272d c8272d) {
        this.f2889j = (C8272d) ((C8272d) c8272d.clone()).m13384e();
    }

    public ComponentCallbacks2C5397h(ComponentCallbacks2C5391b componentCallbacks2C5391b, InterfaceC0010j interfaceC0010j, InterfaceC0016p interfaceC0016p, C0017q c0017q, InterfaceC0003c interfaceC0003c, Context context) {
        this.f2885f = new C0019s();
        a aVar = new a();
        this.f2886g = aVar;
        this.f2880a = componentCallbacks2C5391b;
        this.f2882c = interfaceC0010j;
        this.f2884e = interfaceC0016p;
        this.f2883d = c0017q;
        this.f2881b = context;
        InterfaceC0002b interfaceC0002bMo3a = interfaceC0003c.mo3a(context.getApplicationContext(), new c(c0017q));
        this.f2887h = interfaceC0002bMo3a;
        componentCallbacks2C5391b.m2749o(this);
        if (AbstractC8707k.m14200r()) {
            AbstractC8707k.m14204v(aVar);
        } else {
            interfaceC0010j.mo0a(this);
        }
        interfaceC0010j.mo0a(interfaceC0002bMo3a);
        this.f2888i = new CopyOnWriteArrayList(componentCallbacks2C5391b.m2746i().m2757c());
        m2814z(componentCallbacks2C5391b.m2746i().m2758d());
    }

    /* renamed from: com.bumptech.glide.h$b */
    public static class b extends AbstractC8339d {
        public b(View view) {
            super(view);
        }

        @Override // p081e0.InterfaceC8344i
        /* renamed from: a */
        public void mo2815a(Drawable drawable) {
        }

        @Override // p081e0.AbstractC8339d
        /* renamed from: l */
        public void mo2817l(Drawable drawable) {
        }

        @Override // p081e0.InterfaceC8344i
        /* renamed from: h */
        public void mo2816h(Object obj, InterfaceC8404b interfaceC8404b) {
        }
    }
}

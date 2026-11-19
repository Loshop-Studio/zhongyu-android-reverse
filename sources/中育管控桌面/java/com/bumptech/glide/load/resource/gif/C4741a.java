package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C4683h;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.ComponentCallbacks2C4684i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0007b;
import p016b1.AbstractC4408j;
import p016b1.AbstractC4409k;
import p046e0.InterfaceC6256a;
import p053f0.InterfaceC6283b;
import p053f0.InterfaceC6288g;
import p067h0.AbstractC6433c;
import p074i0.InterfaceC6499d;
import p181x0.C7826d;
import p188y0.AbstractC7889c;
import p195z0.InterfaceC7930b;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
/* loaded from: classes3.dex */
public class C4741a {

    /* renamed from: a */
    public final InterfaceC6256a f2583a;

    /* renamed from: b */
    public final Handler f2584b;

    /* renamed from: c */
    public final List f2585c;

    /* renamed from: d */
    public final ComponentCallbacks2C4684i f2586d;

    /* renamed from: e */
    public final InterfaceC6499d f2587e;

    /* renamed from: f */
    public boolean f2588f;

    /* renamed from: g */
    public boolean f2589g;

    /* renamed from: h */
    public boolean f2590h;

    /* renamed from: i */
    public C4683h f2591i;

    /* renamed from: j */
    public a f2592j;

    /* renamed from: k */
    public boolean f2593k;

    /* renamed from: l */
    public a f2594l;

    /* renamed from: m */
    public Bitmap f2595m;

    /* renamed from: n */
    public InterfaceC6288g f2596n;

    /* renamed from: o */
    public a f2597o;

    /* renamed from: p */
    public int f2598p;

    /* renamed from: q */
    public int f2599q;

    /* renamed from: r */
    public int f2600r;

    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    public static class a extends AbstractC7889c {

        /* renamed from: d */
        public final Handler f2601d;

        /* renamed from: e */
        public final int f2602e;

        /* renamed from: f */
        public final long f2603f;

        /* renamed from: g */
        public Bitmap f2604g;

        public a(Handler handler, int i6, long j6) {
            this.f2601d = handler;
            this.f2602e = i6;
            this.f2603f = j6;
        }

        @Override // p188y0.InterfaceC7894h
        /* renamed from: f */
        public void mo2883f(Drawable drawable) {
            this.f2604g = null;
        }

        /* renamed from: j */
        public Bitmap m2884j() {
            return this.f2604g;
        }

        @Override // p188y0.InterfaceC7894h
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo2882c(Bitmap bitmap, InterfaceC7930b interfaceC7930b) {
            this.f2604g = bitmap;
            this.f2601d.sendMessageAtTime(this.f2601d.obtainMessage(1, this), this.f2603f);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    public interface b {
        /* renamed from: a */
        void mo2848a();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$c */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == 1) {
                C4741a.this.m2875m((a) message.obj);
                return true;
            }
            if (i6 != 2) {
                return false;
            }
            C4741a.this.f2586d.m2538n((a) message.obj);
            return false;
        }
    }

    public C4741a(ComponentCallbacks2C4678c componentCallbacks2C4678c, InterfaceC6256a interfaceC6256a, int i6, int i7, InterfaceC6288g interfaceC6288g, Bitmap bitmap) {
        this(componentCallbacks2C4678c.m2481f(), ComponentCallbacks2C4678c.m2476t(componentCallbacks2C4678c.m2483h()), interfaceC6256a, null, m2864i(ComponentCallbacks2C4678c.m2476t(componentCallbacks2C4678c.m2483h()), i6, i7), interfaceC6288g, bitmap);
    }

    /* renamed from: g */
    public static InterfaceC6283b m2863g() {
        return new C0007b(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    public static C4683h m2864i(ComponentCallbacks2C4684i componentCallbacks2C4684i, int i6, int i7) {
        return componentCallbacks2C4684i.mo2535k().mo2514b(((C7826d) ((C7826d) C7826d.m9452n0(AbstractC6433c.f8113b).mo7358k0(true)).mo7353f0(true)).mo7345W(i6, i7));
    }

    /* renamed from: a */
    public void m2865a() {
        this.f2585c.clear();
        m2876n();
        m2879q();
        a aVar = this.f2592j;
        if (aVar != null) {
            this.f2586d.m2538n(aVar);
            this.f2592j = null;
        }
        a aVar2 = this.f2594l;
        if (aVar2 != null) {
            this.f2586d.m2538n(aVar2);
            this.f2594l = null;
        }
        a aVar3 = this.f2597o;
        if (aVar3 != null) {
            this.f2586d.m2538n(aVar3);
            this.f2597o = null;
        }
        this.f2583a.clear();
        this.f2593k = true;
    }

    /* renamed from: b */
    public ByteBuffer m2866b() {
        return this.f2583a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m2867c() {
        a aVar = this.f2592j;
        return aVar != null ? aVar.m2884j() : this.f2595m;
    }

    /* renamed from: d */
    public int m2868d() {
        a aVar = this.f2592j;
        if (aVar != null) {
            return aVar.f2602e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m2869e() {
        return this.f2595m;
    }

    /* renamed from: f */
    public int m2870f() {
        return this.f2583a.mo6353c();
    }

    /* renamed from: h */
    public int m2871h() {
        return this.f2600r;
    }

    /* renamed from: j */
    public int m2872j() {
        return this.f2583a.mo6358h() + this.f2598p;
    }

    /* renamed from: k */
    public int m2873k() {
        return this.f2599q;
    }

    /* renamed from: l */
    public final void m2874l() {
        if (!this.f2588f || this.f2589g) {
            return;
        }
        if (this.f2590h) {
            AbstractC4408j.m1435a(this.f2597o == null, "Pending target must be null when starting from the first frame");
            this.f2583a.mo6356f();
            this.f2590h = false;
        }
        a aVar = this.f2597o;
        if (aVar != null) {
            this.f2597o = null;
            m2875m(aVar);
            return;
        }
        this.f2589g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f2583a.mo6355e();
        this.f2583a.mo6352b();
        this.f2594l = new a(this.f2584b, this.f2583a.mo6357g(), jUptimeMillis);
        this.f2591i.mo2514b(C7826d.m9453o0(m2863g())).mo2530z0(this.f2583a).m2524t0(this.f2594l);
    }

    /* renamed from: m */
    public void m2875m(a aVar) {
        this.f2589g = false;
        if (this.f2593k) {
            this.f2584b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f2588f) {
            if (this.f2590h) {
                this.f2584b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f2597o = aVar;
                return;
            }
        }
        if (aVar.m2884j() != null) {
            m2876n();
            a aVar2 = this.f2592j;
            this.f2592j = aVar;
            for (int size = this.f2585c.size() - 1; size >= 0; size--) {
                ((b) this.f2585c.get(size)).mo2848a();
            }
            if (aVar2 != null) {
                this.f2584b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m2874l();
    }

    /* renamed from: n */
    public final void m2876n() {
        Bitmap bitmap = this.f2595m;
        if (bitmap != null) {
            this.f2587e.mo7197c(bitmap);
            this.f2595m = null;
        }
    }

    /* renamed from: o */
    public void m2877o(InterfaceC6288g interfaceC6288g, Bitmap bitmap) {
        this.f2596n = (InterfaceC6288g) AbstractC4408j.m1438d(interfaceC6288g);
        this.f2595m = (Bitmap) AbstractC4408j.m1438d(bitmap);
        this.f2591i = this.f2591i.mo2514b(new C7826d().mo7354h0(interfaceC6288g));
        this.f2598p = AbstractC4409k.m1447h(bitmap);
        this.f2599q = bitmap.getWidth();
        this.f2600r = bitmap.getHeight();
    }

    /* renamed from: p */
    public final void m2878p() {
        if (this.f2588f) {
            return;
        }
        this.f2588f = true;
        this.f2593k = false;
        m2874l();
    }

    /* renamed from: q */
    public final void m2879q() {
        this.f2588f = false;
    }

    /* renamed from: r */
    public void m2880r(b bVar) {
        if (this.f2593k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f2585c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f2585c.isEmpty();
        this.f2585c.add(bVar);
        if (zIsEmpty) {
            m2878p();
        }
    }

    /* renamed from: s */
    public void m2881s(b bVar) {
        this.f2585c.remove(bVar);
        if (this.f2585c.isEmpty()) {
            m2879q();
        }
    }

    public C4741a(InterfaceC6499d interfaceC6499d, ComponentCallbacks2C4684i componentCallbacks2C4684i, InterfaceC6256a interfaceC6256a, Handler handler, C4683h c4683h, InterfaceC6288g interfaceC6288g, Bitmap bitmap) {
        this.f2585c = new ArrayList();
        this.f2586d = componentCallbacks2C4684i;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f2587e = interfaceC6499d;
        this.f2584b = handler;
        this.f2591i = c4683h;
        this.f2583a = interfaceC6256a;
        m2877o(interfaceC6288g, bitmap);
    }
}

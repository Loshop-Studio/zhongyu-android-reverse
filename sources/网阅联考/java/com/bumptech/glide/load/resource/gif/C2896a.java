package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C2861f;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.ComponentCallbacks2C2862g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p016c0.C2753d;
import p047d0.AbstractC3693c;
import p052e0.InterfaceC3722b;
import p057f0.C3731b;
import p062g0.AbstractC3749i;
import p062g0.AbstractC3750j;
import p071i.InterfaceC3771a;
import p076j.InterfaceC3792b;
import p076j.InterfaceC3797g;
import p093m.AbstractC4354c;
import p098n.InterfaceC4395d;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
/* loaded from: classes2.dex */
public class C2896a {

    /* renamed from: a */
    public final InterfaceC3771a f920a;

    /* renamed from: b */
    public final Handler f921b;

    /* renamed from: c */
    public final List f922c;

    /* renamed from: d */
    public final ComponentCallbacks2C2862g f923d;

    /* renamed from: e */
    public final InterfaceC4395d f924e;

    /* renamed from: f */
    public boolean f925f;

    /* renamed from: g */
    public boolean f926g;

    /* renamed from: h */
    public boolean f927h;

    /* renamed from: i */
    public C2861f f928i;

    /* renamed from: j */
    public a f929j;

    /* renamed from: k */
    public boolean f930k;

    /* renamed from: l */
    public a f931l;

    /* renamed from: m */
    public Bitmap f932m;

    /* renamed from: n */
    public InterfaceC3797g f933n;

    /* renamed from: o */
    public a f934o;

    /* renamed from: p */
    public int f935p;

    /* renamed from: q */
    public int f936q;

    /* renamed from: r */
    public int f937r;

    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    public static class a extends AbstractC3693c {

        /* renamed from: d */
        public final Handler f938d;

        /* renamed from: e */
        public final int f939e;

        /* renamed from: f */
        public final long f940f;

        /* renamed from: g */
        public Bitmap f941g;

        public a(Handler handler, int i4, long j4) {
            this.f938d = handler;
            this.f939e = i4;
            this.f940f = j4;
        }

        @Override // p047d0.InterfaceC3698h
        /* renamed from: i */
        public void mo2004i(Drawable drawable) {
            this.f941g = null;
        }

        /* renamed from: j */
        public Bitmap m2005j() {
            return this.f941g;
        }

        @Override // p047d0.InterfaceC3698h
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo2003f(Bitmap bitmap, InterfaceC3722b interfaceC3722b) {
            this.f941g = bitmap;
            this.f938d.sendMessageAtTime(this.f938d.obtainMessage(1, this), this.f940f);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    public interface b {
        /* renamed from: a */
        void mo1969a();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$c */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                C2896a.this.m1996m((a) message.obj);
                return true;
            }
            if (i4 != 2) {
                return false;
            }
            C2896a.this.f923d.m1737n((a) message.obj);
            return false;
        }
    }

    public C2896a(ComponentCallbacks2C2858c componentCallbacks2C2858c, InterfaceC3771a interfaceC3771a, int i4, int i5, InterfaceC3797g interfaceC3797g, Bitmap bitmap) {
        this(componentCallbacks2C2858c.m1691f(), ComponentCallbacks2C2858c.m1686t(componentCallbacks2C2858c.m1693h()), interfaceC3771a, null, m1985i(ComponentCallbacks2C2858c.m1686t(componentCallbacks2C2858c.m1693h()), i4, i5), interfaceC3797g, bitmap);
    }

    /* renamed from: g */
    public static InterfaceC3792b m1984g() {
        return new C3731b(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    public static C2861f m1985i(ComponentCallbacks2C2862g componentCallbacks2C2862g, int i4, int i5) {
        return componentCallbacks2C2862g.m1734k().mo1579a(((C2753d) ((C2753d) C2753d.m1620l0(AbstractC4354c.f4866b).m1597j0(true)).m1587e0(true)).m1574V(i4, i5));
    }

    /* renamed from: a */
    public void m1986a() {
        this.f922c.clear();
        m1997n();
        m2000q();
        a aVar = this.f929j;
        if (aVar != null) {
            this.f923d.m1737n(aVar);
            this.f929j = null;
        }
        a aVar2 = this.f931l;
        if (aVar2 != null) {
            this.f923d.m1737n(aVar2);
            this.f931l = null;
        }
        a aVar3 = this.f934o;
        if (aVar3 != null) {
            this.f923d.m1737n(aVar3);
            this.f934o = null;
        }
        this.f920a.clear();
        this.f930k = true;
    }

    /* renamed from: b */
    public ByteBuffer m1987b() {
        return this.f920a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m1988c() {
        a aVar = this.f929j;
        return aVar != null ? aVar.m2005j() : this.f932m;
    }

    /* renamed from: d */
    public int m1989d() {
        a aVar = this.f929j;
        if (aVar != null) {
            return aVar.f939e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m1990e() {
        return this.f932m;
    }

    /* renamed from: f */
    public int m1991f() {
        return this.f920a.mo4877c();
    }

    /* renamed from: h */
    public int m1992h() {
        return this.f937r;
    }

    /* renamed from: j */
    public int m1993j() {
        return this.f920a.mo4882h() + this.f935p;
    }

    /* renamed from: k */
    public int m1994k() {
        return this.f936q;
    }

    /* renamed from: l */
    public final void m1995l() {
        if (!this.f925f || this.f926g) {
            return;
        }
        if (this.f927h) {
            AbstractC3749i.m4765a(this.f934o == null, "Pending target must be null when starting from the first frame");
            this.f920a.mo4880f();
            this.f927h = false;
        }
        a aVar = this.f934o;
        if (aVar != null) {
            this.f934o = null;
            m1996m(aVar);
            return;
        }
        this.f926g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f920a.mo4878d();
        this.f920a.mo4876b();
        this.f931l = new a(this.f921b, this.f920a.mo4881g(), jUptimeMillis);
        this.f928i.mo1579a(C2753d.m1621m0(m1984g())).m1729y0(this.f920a).m1723s0(this.f931l);
    }

    /* renamed from: m */
    public void m1996m(a aVar) {
        this.f926g = false;
        if (this.f930k) {
            this.f921b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f925f) {
            this.f934o = aVar;
            return;
        }
        if (aVar.m2005j() != null) {
            m1997n();
            a aVar2 = this.f929j;
            this.f929j = aVar;
            for (int size = this.f922c.size() - 1; size >= 0; size--) {
                ((b) this.f922c.get(size)).mo1969a();
            }
            if (aVar2 != null) {
                this.f921b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m1995l();
    }

    /* renamed from: n */
    public final void m1997n() {
        Bitmap bitmap = this.f932m;
        if (bitmap != null) {
            this.f924e.mo5392c(bitmap);
            this.f932m = null;
        }
    }

    /* renamed from: o */
    public void m1998o(InterfaceC3797g interfaceC3797g, Bitmap bitmap) {
        this.f933n = (InterfaceC3797g) AbstractC3749i.m4768d(interfaceC3797g);
        this.f932m = (Bitmap) AbstractC3749i.m4768d(bitmap);
        this.f928i = this.f928i.mo1579a(new C2753d().m1591g0(interfaceC3797g));
        this.f935p = AbstractC3750j.m4776g(bitmap);
        this.f936q = bitmap.getWidth();
        this.f937r = bitmap.getHeight();
    }

    /* renamed from: p */
    public final void m1999p() {
        if (this.f925f) {
            return;
        }
        this.f925f = true;
        this.f930k = false;
        m1995l();
    }

    /* renamed from: q */
    public final void m2000q() {
        this.f925f = false;
    }

    /* renamed from: r */
    public void m2001r(b bVar) {
        if (this.f930k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f922c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f922c.isEmpty();
        this.f922c.add(bVar);
        if (zIsEmpty) {
            m1999p();
        }
    }

    /* renamed from: s */
    public void m2002s(b bVar) {
        this.f922c.remove(bVar);
        if (this.f922c.isEmpty()) {
            m2000q();
        }
    }

    public C2896a(InterfaceC4395d interfaceC4395d, ComponentCallbacks2C2862g componentCallbacks2C2862g, InterfaceC3771a interfaceC3771a, Handler handler, C2861f c2861f, InterfaceC3797g interfaceC3797g, Bitmap bitmap) {
        this.f922c = new ArrayList();
        this.f923d = componentCallbacks2C2862g;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f924e = interfaceC4395d;
        this.f921b = handler;
        this.f928i = c2861f;
        this.f920a = interfaceC3771a;
        m1998o(interfaceC3797g, bitmap);
    }
}

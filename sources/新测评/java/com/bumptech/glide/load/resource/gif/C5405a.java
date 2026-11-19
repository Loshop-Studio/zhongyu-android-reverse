package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C5347g;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.bumptech.glide.ComponentCallbacks2C5348h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p073e1.C7327d;
import p084f1.AbstractC7426c;
import p095g1.InterfaceC7509b;
import p106h1.C7617b;
import p117i1.AbstractC7651j;
import p117i1.AbstractC7652k;
import p151l0.InterfaceC8482a;
import p162m0.InterfaceC8537b;
import p162m0.InterfaceC8542g;
import p184o0.AbstractC8683c;
import p195p0.InterfaceC8804d;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
/* loaded from: classes3.dex */
public class C5405a {

    /* renamed from: a */
    public final InterfaceC8482a f3792a;

    /* renamed from: b */
    public final Handler f3793b;

    /* renamed from: c */
    public final List f3794c;

    /* renamed from: d */
    public final ComponentCallbacks2C5348h f3795d;

    /* renamed from: e */
    public final InterfaceC8804d f3796e;

    /* renamed from: f */
    public boolean f3797f;

    /* renamed from: g */
    public boolean f3798g;

    /* renamed from: h */
    public boolean f3799h;

    /* renamed from: i */
    public C5347g f3800i;

    /* renamed from: j */
    public a f3801j;

    /* renamed from: k */
    public boolean f3802k;

    /* renamed from: l */
    public a f3803l;

    /* renamed from: m */
    public Bitmap f3804m;

    /* renamed from: n */
    public InterfaceC8542g f3805n;

    /* renamed from: o */
    public a f3806o;

    /* renamed from: p */
    public int f3807p;

    /* renamed from: q */
    public int f3808q;

    /* renamed from: r */
    public int f3809r;

    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    public static class a extends AbstractC7426c {

        /* renamed from: d */
        public final Handler f3810d;

        /* renamed from: e */
        public final int f3811e;

        /* renamed from: f */
        public final long f3812f;

        /* renamed from: g */
        public Bitmap f3813g;

        public a(Handler handler, int i10, long j10) {
            this.f3810d = handler;
            this.f3811e = i10;
            this.f3812f = j10;
        }

        @Override // p084f1.InterfaceC7431h
        /* renamed from: f */
        public void mo3703f(Drawable drawable) {
            this.f3813g = null;
        }

        /* renamed from: i */
        public Bitmap m3704i() {
            return this.f3813g;
        }

        @Override // p084f1.InterfaceC7431h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo3702d(Bitmap bitmap, InterfaceC7509b interfaceC7509b) {
            this.f3813g = bitmap;
            this.f3810d.sendMessageAtTime(this.f3810d.obtainMessage(1, this), this.f3812f);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    public interface b {
        /* renamed from: a */
        void mo3668a();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$c */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                C5405a.this.m3695m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            C5405a.this.f3795d.m3357m((a) message.obj);
            return false;
        }
    }

    public C5405a(ComponentCallbacks2C5342b componentCallbacks2C5342b, InterfaceC8482a interfaceC8482a, int i10, int i11, InterfaceC8542g interfaceC8542g, Bitmap bitmap) {
        this(componentCallbacks2C5342b.m3302f(), ComponentCallbacks2C5342b.m3297t(componentCallbacks2C5342b.m3304h()), interfaceC8482a, null, m3684i(ComponentCallbacks2C5342b.m3297t(componentCallbacks2C5342b.m3304h()), i10, i11), interfaceC8542g, bitmap);
    }

    /* renamed from: g */
    public static InterfaceC8537b m3683g() {
        return new C7617b(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    public static C5347g m3684i(ComponentCallbacks2C5348h componentCallbacks2C5348h, int i10, int i11) {
        return componentCallbacks2C5348h.m3354j().mo3335b(((C7327d) ((C7327d) C7327d.m11706m0(AbstractC8683c.f14423b).m11688k0(true)).m11679f0(true)).m11667W(i10, i11));
    }

    /* renamed from: a */
    public void m3685a() {
        this.f3794c.clear();
        m3696n();
        m3699q();
        a aVar = this.f3801j;
        if (aVar != null) {
            this.f3795d.m3357m(aVar);
            this.f3801j = null;
        }
        a aVar2 = this.f3803l;
        if (aVar2 != null) {
            this.f3795d.m3357m(aVar2);
            this.f3803l = null;
        }
        a aVar3 = this.f3806o;
        if (aVar3 != null) {
            this.f3795d.m3357m(aVar3);
            this.f3806o = null;
        }
        this.f3792a.clear();
        this.f3802k = true;
    }

    /* renamed from: b */
    public ByteBuffer m3686b() {
        return this.f3792a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m3687c() {
        a aVar = this.f3801j;
        return aVar != null ? aVar.m3704i() : this.f3804m;
    }

    /* renamed from: d */
    public int m3688d() {
        a aVar = this.f3801j;
        if (aVar != null) {
            return aVar.f3811e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m3689e() {
        return this.f3804m;
    }

    /* renamed from: f */
    public int m3690f() {
        return this.f3792a.mo13868c();
    }

    /* renamed from: h */
    public int m3691h() {
        return this.f3809r;
    }

    /* renamed from: j */
    public int m3692j() {
        return this.f3792a.mo13873h() + this.f3807p;
    }

    /* renamed from: k */
    public int m3693k() {
        return this.f3808q;
    }

    /* renamed from: l */
    public final void m3694l() {
        if (!this.f3797f || this.f3798g) {
            return;
        }
        if (this.f3799h) {
            AbstractC7651j.m12680a(this.f3806o == null, "Pending target must be null when starting from the first frame");
            this.f3792a.mo13871f();
            this.f3799h = false;
        }
        a aVar = this.f3806o;
        if (aVar != null) {
            this.f3806o = null;
            m3695m(aVar);
            return;
        }
        this.f3798g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f3792a.mo13870e();
        this.f3792a.mo13867b();
        this.f3803l = new a(this.f3793b, this.f3792a.mo13872g(), jUptimeMillis);
        this.f3800i.mo3335b(C7327d.m11707n0(m3683g())).m3351z0(this.f3792a).m3345t0(this.f3803l);
    }

    /* renamed from: m */
    public void m3695m(a aVar) {
        this.f3798g = false;
        if (this.f3802k) {
            this.f3793b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f3797f) {
            if (this.f3799h) {
                this.f3793b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f3806o = aVar;
                return;
            }
        }
        if (aVar.m3704i() != null) {
            m3696n();
            a aVar2 = this.f3801j;
            this.f3801j = aVar;
            for (int size = this.f3794c.size() - 1; size >= 0; size--) {
                ((b) this.f3794c.get(size)).mo3668a();
            }
            if (aVar2 != null) {
                this.f3793b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m3694l();
    }

    /* renamed from: n */
    public final void m3696n() {
        Bitmap bitmap = this.f3804m;
        if (bitmap != null) {
            this.f3796e.mo14712c(bitmap);
            this.f3804m = null;
        }
    }

    /* renamed from: o */
    public void m3697o(InterfaceC8542g interfaceC8542g, Bitmap bitmap) {
        this.f3805n = (InterfaceC8542g) AbstractC7651j.m12683d(interfaceC8542g);
        this.f3804m = (Bitmap) AbstractC7651j.m12683d(bitmap);
        this.f3800i = this.f3800i.mo3335b(new C7327d().m11685i0(interfaceC8542g));
        this.f3807p = AbstractC7652k.m12692h(bitmap);
        this.f3808q = bitmap.getWidth();
        this.f3809r = bitmap.getHeight();
    }

    /* renamed from: p */
    public final void m3698p() {
        if (this.f3797f) {
            return;
        }
        this.f3797f = true;
        this.f3802k = false;
        m3694l();
    }

    /* renamed from: q */
    public final void m3699q() {
        this.f3797f = false;
    }

    /* renamed from: r */
    public void m3700r(b bVar) {
        if (this.f3802k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f3794c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f3794c.isEmpty();
        this.f3794c.add(bVar);
        if (zIsEmpty) {
            m3698p();
        }
    }

    /* renamed from: s */
    public void m3701s(b bVar) {
        this.f3794c.remove(bVar);
        if (this.f3794c.isEmpty()) {
            m3699q();
        }
    }

    public C5405a(InterfaceC8804d interfaceC8804d, ComponentCallbacks2C5348h componentCallbacks2C5348h, InterfaceC8482a interfaceC8482a, Handler handler, C5347g c5347g, InterfaceC8542g interfaceC8542g, Bitmap bitmap) {
        this.f3794c = new ArrayList();
        this.f3795d = componentCallbacks2C5348h;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f3796e = interfaceC8804d;
        this.f3793b = handler;
        this.f3800i = c5347g;
        this.f3792a = interfaceC8482a;
        m3697o(interfaceC8542g, bitmap);
    }
}

package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C5474e;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.bumptech.glide.ComponentCallbacks2C5475f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0012d;
import p019b1.AbstractC5092c;
import p030c1.InterfaceC5220b;
import p080d1.C7737b;
import p091e1.AbstractC7837i;
import p091e1.AbstractC7838j;
import p112g0.InterfaceC7983a;
import p122h0.InterfaceC8082b;
import p122h0.InterfaceC8087g;
import p152k0.AbstractC8252c;
import p164l0.InterfaceC8867d;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
/* loaded from: classes3.dex */
public class C5509a {

    /* renamed from: a */
    public final InterfaceC7983a f3574a;

    /* renamed from: b */
    public final Handler f3575b;

    /* renamed from: c */
    public final List f3576c;

    /* renamed from: d */
    public final ComponentCallbacks2C5475f f3577d;

    /* renamed from: e */
    public final InterfaceC8867d f3578e;

    /* renamed from: f */
    public boolean f3579f;

    /* renamed from: g */
    public boolean f3580g;

    /* renamed from: h */
    public boolean f3581h;

    /* renamed from: i */
    public C5474e f3582i;

    /* renamed from: j */
    public a f3583j;

    /* renamed from: k */
    public boolean f3584k;

    /* renamed from: l */
    public a f3585l;

    /* renamed from: m */
    public Bitmap f3586m;

    /* renamed from: n */
    public InterfaceC8087g f3587n;

    /* renamed from: o */
    public a f3588o;

    /* renamed from: p */
    public int f3589p;

    /* renamed from: q */
    public int f3590q;

    /* renamed from: r */
    public int f3591r;

    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    public static class a extends AbstractC5092c {

        /* renamed from: d */
        public final Handler f3592d;

        /* renamed from: e */
        public final int f3593e;

        /* renamed from: f */
        public final long f3594f;

        /* renamed from: g */
        public Bitmap f3595g;

        public a(Handler handler, int i9, long j9) {
            this.f3592d = handler;
            this.f3593e = i9;
            this.f3594f = j9;
        }

        @Override // p019b1.InterfaceC5097h
        /* renamed from: g */
        public void mo2134g(Drawable drawable) {
            this.f3595g = null;
        }

        /* renamed from: i */
        public Bitmap m3327i() {
            return this.f3595g;
        }

        @Override // p019b1.InterfaceC5097h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2142c(Bitmap bitmap, InterfaceC5220b interfaceC5220b) {
            this.f3595g = bitmap;
            this.f3592d.sendMessageAtTime(this.f3592d.obtainMessage(1, this), this.f3594f);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    public interface b {
        /* renamed from: a */
        void mo3293a();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$c */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 1) {
                C5509a.this.m3320m((a) message.obj);
                return true;
            }
            if (i9 != 2) {
                return false;
            }
            C5509a.this.f3577d.m3061m((a) message.obj);
            return false;
        }
    }

    public C5509a(ComponentCallbacks2C5471b componentCallbacks2C5471b, InterfaceC7983a interfaceC7983a, int i9, int i10, InterfaceC8087g interfaceC8087g, Bitmap bitmap) {
        this(componentCallbacks2C5471b.m3017f(), ComponentCallbacks2C5471b.m3012t(componentCallbacks2C5471b.m3019h()), interfaceC7983a, null, m3309i(ComponentCallbacks2C5471b.m3012t(componentCallbacks2C5471b.m3019h()), i9, i10), interfaceC8087g, bitmap);
    }

    /* renamed from: g */
    public static InterfaceC8082b m3308g() {
        return new C7737b(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    public static C5474e m3309i(ComponentCallbacks2C5475f componentCallbacks2C5475f, int i9, int i10) {
        return componentCallbacks2C5475f.m3058j().mo40b(((C0012d) ((C0012d) C0012d.m78k0(AbstractC8252c.f14324b).m54i0(true)).m44d0(true)).m33U(i9, i10));
    }

    /* renamed from: a */
    public void m3310a() {
        this.f3576c.clear();
        m3321n();
        m3324q();
        a aVar = this.f3583j;
        if (aVar != null) {
            this.f3577d.m3061m(aVar);
            this.f3583j = null;
        }
        a aVar2 = this.f3585l;
        if (aVar2 != null) {
            this.f3577d.m3061m(aVar2);
            this.f3585l = null;
        }
        a aVar3 = this.f3588o;
        if (aVar3 != null) {
            this.f3577d.m3061m(aVar3);
            this.f3588o = null;
        }
        this.f3574a.clear();
        this.f3584k = true;
    }

    /* renamed from: b */
    public ByteBuffer m3311b() {
        return this.f3574a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m3312c() {
        a aVar = this.f3583j;
        return aVar != null ? aVar.m3327i() : this.f3586m;
    }

    /* renamed from: d */
    public int m3313d() {
        a aVar = this.f3583j;
        if (aVar != null) {
            return aVar.f3593e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m3314e() {
        return this.f3586m;
    }

    /* renamed from: f */
    public int m3315f() {
        return this.f3574a.mo12504c();
    }

    /* renamed from: h */
    public int m3316h() {
        return this.f3591r;
    }

    /* renamed from: j */
    public int m3317j() {
        return this.f3574a.mo12509h() + this.f3589p;
    }

    /* renamed from: k */
    public int m3318k() {
        return this.f3590q;
    }

    /* renamed from: l */
    public final void m3319l() {
        if (!this.f3579f || this.f3580g) {
            return;
        }
        if (this.f3581h) {
            AbstractC7837i.m12253a(this.f3588o == null, "Pending target must be null when starting from the first frame");
            this.f3574a.mo12507f();
            this.f3581h = false;
        }
        a aVar = this.f3588o;
        if (aVar != null) {
            this.f3588o = null;
            m3320m(aVar);
            return;
        }
        this.f3580g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f3574a.mo12506e();
        this.f3574a.mo12503b();
        this.f3585l = new a(this.f3575b, this.f3574a.mo12508g(), jUptimeMillis);
        this.f3582i.mo40b(C0012d.m79l0(m3308g())).m3054x0(this.f3574a).m3048r0(this.f3585l);
    }

    /* renamed from: m */
    public void m3320m(a aVar) {
        this.f3580g = false;
        if (this.f3584k) {
            this.f3575b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f3579f) {
            this.f3588o = aVar;
            return;
        }
        if (aVar.m3327i() != null) {
            m3321n();
            a aVar2 = this.f3583j;
            this.f3583j = aVar;
            for (int size = this.f3576c.size() - 1; size >= 0; size--) {
                ((b) this.f3576c.get(size)).mo3293a();
            }
            if (aVar2 != null) {
                this.f3575b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m3319l();
    }

    /* renamed from: n */
    public final void m3321n() {
        Bitmap bitmap = this.f3586m;
        if (bitmap != null) {
            this.f3578e.mo13732c(bitmap);
            this.f3586m = null;
        }
    }

    /* renamed from: o */
    public void m3322o(InterfaceC8087g interfaceC8087g, Bitmap bitmap) {
        this.f3587n = (InterfaceC8087g) AbstractC7837i.m12256d(interfaceC8087g);
        this.f3586m = (Bitmap) AbstractC7837i.m12256d(bitmap);
        this.f3582i = this.f3582i.mo40b(new C0012d().m48f0(interfaceC8087g));
        this.f3589p = AbstractC7838j.m12264g(bitmap);
        this.f3590q = bitmap.getWidth();
        this.f3591r = bitmap.getHeight();
    }

    /* renamed from: p */
    public final void m3323p() {
        if (this.f3579f) {
            return;
        }
        this.f3579f = true;
        this.f3584k = false;
        m3319l();
    }

    /* renamed from: q */
    public final void m3324q() {
        this.f3579f = false;
    }

    /* renamed from: r */
    public void m3325r(b bVar) {
        if (this.f3584k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f3576c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f3576c.isEmpty();
        this.f3576c.add(bVar);
        if (zIsEmpty) {
            m3323p();
        }
    }

    /* renamed from: s */
    public void m3326s(b bVar) {
        this.f3576c.remove(bVar);
        if (this.f3576c.isEmpty()) {
            m3324q();
        }
    }

    public C5509a(InterfaceC8867d interfaceC8867d, ComponentCallbacks2C5475f componentCallbacks2C5475f, InterfaceC7983a interfaceC7983a, Handler handler, C5474e c5474e, InterfaceC8087g interfaceC8087g, Bitmap bitmap) {
        this.f3576c = new ArrayList();
        this.f3577d = componentCallbacks2C5475f;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f3578e = interfaceC8867d;
        this.f3575b = handler;
        this.f3582i = c5474e;
        this.f3574a = interfaceC7983a;
        m3322o(interfaceC8087g, bitmap);
    }
}

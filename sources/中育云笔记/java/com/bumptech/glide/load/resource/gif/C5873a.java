package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C5815g;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import com.bumptech.glide.ComponentCallbacks2C5816h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p002a1.AbstractC0032c;
import p027b1.InterfaceC5142b;
import p039c1.C5222d;
import p109d1.AbstractC8909j;
import p109d1.AbstractC8910k;
import p156g0.InterfaceC9253a;
import p168h0.InterfaceC9435b;
import p168h0.InterfaceC9441h;
import p198j0.AbstractC9650c;
import p213k0.InterfaceC9772d;
import p428z0.C11955d;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
/* loaded from: classes3.dex */
public class C5873a {

    /* renamed from: a */
    public final InterfaceC9253a f4995a;

    /* renamed from: b */
    public final Handler f4996b;

    /* renamed from: c */
    public final List f4997c;

    /* renamed from: d */
    public final ComponentCallbacks2C5816h f4998d;

    /* renamed from: e */
    public final InterfaceC9772d f4999e;

    /* renamed from: f */
    public boolean f5000f;

    /* renamed from: g */
    public boolean f5001g;

    /* renamed from: h */
    public boolean f5002h;

    /* renamed from: i */
    public C5815g f5003i;

    /* renamed from: j */
    public a f5004j;

    /* renamed from: k */
    public boolean f5005k;

    /* renamed from: l */
    public a f5006l;

    /* renamed from: m */
    public Bitmap f5007m;

    /* renamed from: n */
    public InterfaceC9441h f5008n;

    /* renamed from: o */
    public a f5009o;

    /* renamed from: p */
    public int f5010p;

    /* renamed from: q */
    public int f5011q;

    /* renamed from: r */
    public int f5012r;

    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    public static class a extends AbstractC0032c {

        /* renamed from: f */
        public final Handler f5013f;

        /* renamed from: g */
        public final int f5014g;

        /* renamed from: h */
        public final long f5015h;

        /* renamed from: i */
        public Bitmap f5016i;

        public a(Handler handler, int i10, long j10) {
            this.f5013f = handler;
            this.f5014g = i10;
            this.f5015h = j10;
        }

        @Override // p002a1.InterfaceC0037h
        /* renamed from: e */
        public void mo62e(Drawable drawable) {
            this.f5016i = null;
        }

        /* renamed from: i */
        public Bitmap m4351i() {
            return this.f5016i;
        }

        @Override // p002a1.InterfaceC0037h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo70f(Bitmap bitmap, InterfaceC5142b interfaceC5142b) {
            this.f5016i = bitmap;
            this.f5013f.sendMessageAtTime(this.f5013f.obtainMessage(1, this), this.f5015h);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    public interface b {
        /* renamed from: a */
        void mo4317a();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$c */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                C5873a.this.m4344m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            C5873a.this.f4998d.m4009m((a) message.obj);
            return false;
        }
    }

    public C5873a(ComponentCallbacks2C5810b componentCallbacks2C5810b, InterfaceC9253a interfaceC9253a, int i10, int i11, InterfaceC9441h interfaceC9441h, Bitmap bitmap) {
        this(componentCallbacks2C5810b.m3952f(), ComponentCallbacks2C5810b.m3946t(componentCallbacks2C5810b.m3954h()), interfaceC9253a, null, m4333i(ComponentCallbacks2C5810b.m3946t(componentCallbacks2C5810b.m3954h()), i10, i11), interfaceC9441h, bitmap);
    }

    /* renamed from: g */
    public static InterfaceC9435b m4332g() {
        return new C5222d(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    public static C5815g m4333i(ComponentCallbacks2C5816h componentCallbacks2C5816h, int i10, int i11) {
        return componentCallbacks2C5816h.m4006j().mo3989b(((C11955d) ((C11955d) C11955d.m26576p0(AbstractC9650c.f22356b).m26562n0(true)).m26548g0(true)).m26534V(i10, i11));
    }

    /* renamed from: a */
    public void m4334a() {
        this.f4997c.clear();
        m4345n();
        m4348q();
        a aVar = this.f5004j;
        if (aVar != null) {
            this.f4998d.m4009m(aVar);
            this.f5004j = null;
        }
        a aVar2 = this.f5006l;
        if (aVar2 != null) {
            this.f4998d.m4009m(aVar2);
            this.f5006l = null;
        }
        a aVar3 = this.f5009o;
        if (aVar3 != null) {
            this.f4998d.m4009m(aVar3);
            this.f5009o = null;
        }
        this.f4995a.clear();
        this.f5005k = true;
    }

    /* renamed from: b */
    public ByteBuffer m4335b() {
        return this.f4995a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m4336c() {
        a aVar = this.f5004j;
        return aVar != null ? aVar.m4351i() : this.f5007m;
    }

    /* renamed from: d */
    public int m4337d() {
        a aVar = this.f5004j;
        if (aVar != null) {
            return aVar.f5014g;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m4338e() {
        return this.f5007m;
    }

    /* renamed from: f */
    public int m4339f() {
        return this.f4995a.mo18210c();
    }

    /* renamed from: h */
    public int m4340h() {
        return this.f5012r;
    }

    /* renamed from: j */
    public int m4341j() {
        return this.f4995a.mo18215h() + this.f5010p;
    }

    /* renamed from: k */
    public int m4342k() {
        return this.f5011q;
    }

    /* renamed from: l */
    public final void m4343l() {
        if (!this.f5000f || this.f5001g) {
            return;
        }
        if (this.f5002h) {
            AbstractC8909j.m17465a(this.f5009o == null, "Pending target must be null when starting from the first frame");
            this.f4995a.mo18213f();
            this.f5002h = false;
        }
        a aVar = this.f5009o;
        if (aVar != null) {
            this.f5009o = null;
            m4344m(aVar);
            return;
        }
        this.f5001g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f4995a.mo18212e();
        this.f4995a.mo18209b();
        this.f5006l = new a(this.f4996b, this.f4995a.mo18214g(), jUptimeMillis);
        this.f5003i.mo3989b(C11955d.m26577q0(m4332g())).m3985E0(this.f4995a).m4000x0(this.f5006l);
    }

    /* renamed from: m */
    public void m4344m(a aVar) {
        this.f5001g = false;
        if (this.f5005k) {
            this.f4996b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f5000f) {
            if (this.f5002h) {
                this.f4996b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f5009o = aVar;
                return;
            }
        }
        if (aVar.m4351i() != null) {
            m4345n();
            a aVar2 = this.f5004j;
            this.f5004j = aVar;
            for (int size = this.f4997c.size() - 1; size >= 0; size--) {
                ((b) this.f4997c.get(size)).mo4317a();
            }
            if (aVar2 != null) {
                this.f4996b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m4343l();
    }

    /* renamed from: n */
    public final void m4345n() {
        Bitmap bitmap = this.f5007m;
        if (bitmap != null) {
            this.f4999e.mo19710c(bitmap);
            this.f5007m = null;
        }
    }

    /* renamed from: o */
    public void m4346o(InterfaceC9441h interfaceC9441h, Bitmap bitmap) {
        this.f5008n = (InterfaceC9441h) AbstractC8909j.m17468d(interfaceC9441h);
        this.f5007m = (Bitmap) AbstractC8909j.m17468d(bitmap);
        this.f5003i = this.f5003i.mo3989b(new C11955d().m26554j0(interfaceC9441h));
        this.f5010p = AbstractC8910k.m17477h(bitmap);
        this.f5011q = bitmap.getWidth();
        this.f5012r = bitmap.getHeight();
    }

    /* renamed from: p */
    public final void m4347p() {
        if (this.f5000f) {
            return;
        }
        this.f5000f = true;
        this.f5005k = false;
        m4343l();
    }

    /* renamed from: q */
    public final void m4348q() {
        this.f5000f = false;
    }

    /* renamed from: r */
    public void m4349r(b bVar) {
        if (this.f5005k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f4997c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f4997c.isEmpty();
        this.f4997c.add(bVar);
        if (zIsEmpty) {
            m4347p();
        }
    }

    /* renamed from: s */
    public void m4350s(b bVar) {
        this.f4997c.remove(bVar);
        if (this.f4997c.isEmpty()) {
            m4348q();
        }
    }

    public C5873a(InterfaceC9772d interfaceC9772d, ComponentCallbacks2C5816h componentCallbacks2C5816h, InterfaceC9253a interfaceC9253a, Handler handler, C5815g c5815g, InterfaceC9441h interfaceC9441h, Bitmap bitmap) {
        this.f4997c = new ArrayList();
        this.f4998d = componentCallbacks2C5816h;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f4999e = interfaceC9772d;
        this.f4996b = handler;
        this.f5003i = c5815g;
        this.f4995a = interfaceC9253a;
        m4346o(interfaceC9441h, bitmap);
    }
}

package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C5396g;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.bumptech.glide.ComponentCallbacks2C5397h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p069d0.C8272d;
import p081e0.AbstractC8338c;
import p093f0.InterfaceC8404b;
import p105g0.C8514b;
import p116h0.AbstractC8706j;
import p116h0.AbstractC8707k;
import p148k.InterfaceC9042a;
import p160l.InterfaceC9228b;
import p160l.InterfaceC9233g;
import p182n.AbstractC9350c;
import p193o.InterfaceC9500d;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
/* loaded from: classes3.dex */
public class C5454a {

    /* renamed from: a */
    public final InterfaceC9042a f3225a;

    /* renamed from: b */
    public final Handler f3226b;

    /* renamed from: c */
    public final List f3227c;

    /* renamed from: d */
    public final ComponentCallbacks2C5397h f3228d;

    /* renamed from: e */
    public final InterfaceC9500d f3229e;

    /* renamed from: f */
    public boolean f3230f;

    /* renamed from: g */
    public boolean f3231g;

    /* renamed from: h */
    public boolean f3232h;

    /* renamed from: i */
    public C5396g f3233i;

    /* renamed from: j */
    public a f3234j;

    /* renamed from: k */
    public boolean f3235k;

    /* renamed from: l */
    public a f3236l;

    /* renamed from: m */
    public Bitmap f3237m;

    /* renamed from: n */
    public InterfaceC9233g f3238n;

    /* renamed from: o */
    public a f3239o;

    /* renamed from: p */
    public int f3240p;

    /* renamed from: q */
    public int f3241q;

    /* renamed from: r */
    public int f3242r;

    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    public static class a extends AbstractC8338c {

        /* renamed from: d */
        public final Handler f3243d;

        /* renamed from: e */
        public final int f3244e;

        /* renamed from: f */
        public final long f3245f;

        /* renamed from: g */
        public Bitmap f3246g;

        public a(Handler handler, int i10, long j10) {
            this.f3243d = handler;
            this.f3244e = i10;
            this.f3245f = j10;
        }

        @Override // p081e0.InterfaceC8344i
        /* renamed from: f */
        public void mo3147f(Drawable drawable) {
            this.f3246g = null;
        }

        /* renamed from: i */
        public Bitmap m3148i() {
            return this.f3246g;
        }

        @Override // p081e0.InterfaceC8344i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo2816h(Bitmap bitmap, InterfaceC8404b interfaceC8404b) {
            this.f3246g = bitmap;
            this.f3243d.sendMessageAtTime(this.f3243d.obtainMessage(1, this), this.f3245f);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    public interface b {
        /* renamed from: a */
        void mo3113a();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$c */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                C5454a.this.m3140m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            C5454a.this.f3228d.m2802n((a) message.obj);
            return false;
        }
    }

    public C5454a(ComponentCallbacks2C5391b componentCallbacks2C5391b, InterfaceC9042a interfaceC9042a, int i10, int i11, InterfaceC9233g interfaceC9233g, Bitmap bitmap) {
        this(componentCallbacks2C5391b.m2743f(), ComponentCallbacks2C5391b.m2738t(componentCallbacks2C5391b.m2745h()), interfaceC9042a, null, m3129i(ComponentCallbacks2C5391b.m2738t(componentCallbacks2C5391b.m2745h()), i10, i11), interfaceC9233g, bitmap);
    }

    /* renamed from: g */
    public static InterfaceC9228b m3128g() {
        return new C8514b(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    public static C5396g m3129i(ComponentCallbacks2C5397h componentCallbacks2C5397h, int i10, int i11) {
        return componentCallbacks2C5397h.m2798j().mo2777c(((C8272d) ((C8272d) C8272d.m13415m0(AbstractC9350c.f18465b).m13396k0(true)).m13387f0(true)).m13376W(i10, i11));
    }

    /* renamed from: a */
    public void m3130a() {
        this.f3227c.clear();
        m3141n();
        m3144q();
        a aVar = this.f3234j;
        if (aVar != null) {
            this.f3228d.m2802n(aVar);
            this.f3234j = null;
        }
        a aVar2 = this.f3236l;
        if (aVar2 != null) {
            this.f3228d.m2802n(aVar2);
            this.f3236l = null;
        }
        a aVar3 = this.f3239o;
        if (aVar3 != null) {
            this.f3228d.m2802n(aVar3);
            this.f3239o = null;
        }
        this.f3225a.clear();
        this.f3235k = true;
    }

    /* renamed from: b */
    public ByteBuffer m3131b() {
        return this.f3225a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m3132c() {
        a aVar = this.f3234j;
        return aVar != null ? aVar.m3148i() : this.f3237m;
    }

    /* renamed from: d */
    public int m3133d() {
        a aVar = this.f3234j;
        if (aVar != null) {
            return aVar.f3244e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m3134e() {
        return this.f3237m;
    }

    /* renamed from: f */
    public int m3135f() {
        return this.f3225a.mo15796c();
    }

    /* renamed from: h */
    public int m3136h() {
        return this.f3242r;
    }

    /* renamed from: j */
    public int m3137j() {
        return this.f3225a.mo15801h() + this.f3240p;
    }

    /* renamed from: k */
    public int m3138k() {
        return this.f3241q;
    }

    /* renamed from: l */
    public final void m3139l() {
        if (!this.f3230f || this.f3231g) {
            return;
        }
        if (this.f3232h) {
            AbstractC8706j.m14178a(this.f3239o == null, "Pending target must be null when starting from the first frame");
            this.f3225a.mo15799f();
            this.f3232h = false;
        }
        a aVar = this.f3239o;
        if (aVar != null) {
            this.f3239o = null;
            m3140m(aVar);
            return;
        }
        this.f3231g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f3225a.mo15798e();
        this.f3225a.mo15795b();
        this.f3236l = new a(this.f3226b, this.f3225a.mo15800g(), jUptimeMillis);
        this.f3233i.mo2777c(C8272d.m13416n0(m3128g())).m2772A0(this.f3225a).m2787t0(this.f3236l);
    }

    /* renamed from: m */
    public void m3140m(a aVar) {
        this.f3231g = false;
        if (this.f3235k) {
            this.f3226b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f3230f) {
            if (this.f3232h) {
                this.f3226b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f3239o = aVar;
                return;
            }
        }
        if (aVar.m3148i() != null) {
            m3141n();
            a aVar2 = this.f3234j;
            this.f3234j = aVar;
            for (int size = this.f3227c.size() - 1; size >= 0; size--) {
                ((b) this.f3227c.get(size)).mo3113a();
            }
            if (aVar2 != null) {
                this.f3226b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m3139l();
    }

    /* renamed from: n */
    public final void m3141n() {
        Bitmap bitmap = this.f3237m;
        if (bitmap != null) {
            this.f3229e.mo17620b(bitmap);
            this.f3237m = null;
        }
    }

    /* renamed from: o */
    public void m3142o(InterfaceC9233g interfaceC9233g, Bitmap bitmap) {
        this.f3238n = (InterfaceC9233g) AbstractC8706j.m14181d(interfaceC9233g);
        this.f3237m = (Bitmap) AbstractC8706j.m14181d(bitmap);
        this.f3233i = this.f3233i.mo2777c(new C8272d().m13392i0(interfaceC9233g));
        this.f3240p = AbstractC8707k.m14190h(bitmap);
        this.f3241q = bitmap.getWidth();
        this.f3242r = bitmap.getHeight();
    }

    /* renamed from: p */
    public final void m3143p() {
        if (this.f3230f) {
            return;
        }
        this.f3230f = true;
        this.f3235k = false;
        m3139l();
    }

    /* renamed from: q */
    public final void m3144q() {
        this.f3230f = false;
    }

    /* renamed from: r */
    public void m3145r(b bVar) {
        if (this.f3235k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f3227c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f3227c.isEmpty();
        this.f3227c.add(bVar);
        if (zIsEmpty) {
            m3143p();
        }
    }

    /* renamed from: s */
    public void m3146s(b bVar) {
        this.f3227c.remove(bVar);
        if (this.f3227c.isEmpty()) {
            m3144q();
        }
    }

    public C5454a(InterfaceC9500d interfaceC9500d, ComponentCallbacks2C5397h componentCallbacks2C5397h, InterfaceC9042a interfaceC9042a, Handler handler, C5396g c5396g, InterfaceC9233g interfaceC9233g, Bitmap bitmap) {
        this.f3227c = new ArrayList();
        this.f3228d = componentCallbacks2C5397h;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f3229e = interfaceC9500d;
        this.f3226b = handler;
        this.f3233i = c5396g;
        this.f3225a = interfaceC9042a;
        m3142o(interfaceC9233g, bitmap);
    }
}

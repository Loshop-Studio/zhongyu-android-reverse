package p067h0;

import androidx.core.util.Pools;
import p016b1.AbstractC4408j;
import p024c1.AbstractC4482a;
import p024c1.AbstractC4484c;

/* renamed from: h0.i */
/* loaded from: classes3.dex */
public final class C6439i implements InterfaceC6440j, AbstractC4482a.f {

    /* renamed from: e */
    public static final Pools.Pool f8128e = AbstractC4482a.m1580d(20, new a());

    /* renamed from: a */
    public final AbstractC4484c f8129a = AbstractC4484c.m1593a();

    /* renamed from: b */
    public InterfaceC6440j f8130b;

    /* renamed from: c */
    public boolean f8131c;

    /* renamed from: d */
    public boolean f8132d;

    /* renamed from: h0.i$a */
    public class a implements AbstractC4482a.d {
        @Override // p024c1.AbstractC4482a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6439i create() {
            return new C6439i();
        }
    }

    /* renamed from: c */
    public static C6439i m7049c(InterfaceC6440j interfaceC6440j) {
        C6439i c6439i = (C6439i) AbstractC4408j.m1438d((C6439i) f8128e.acquire());
        c6439i.m7051b(interfaceC6440j);
        return c6439i;
    }

    /* renamed from: e */
    private void m7050e() {
        this.f8130b = null;
        f8128e.release(this);
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: a */
    public Class mo2749a() {
        return this.f8130b.mo2749a();
    }

    /* renamed from: b */
    public final void m7051b(InterfaceC6440j interfaceC6440j) {
        this.f8132d = false;
        this.f8131c = true;
        this.f8130b = interfaceC6440j;
    }

    @Override // p024c1.AbstractC4482a.f
    /* renamed from: d */
    public AbstractC4484c mo1586d() {
        return this.f8129a;
    }

    /* renamed from: f */
    public synchronized void m7052f() {
        this.f8129a.mo1595c();
        if (!this.f8131c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f8131c = false;
        if (this.f8132d) {
            recycle();
        }
    }

    @Override // p067h0.InterfaceC6440j
    public Object get() {
        return this.f8130b.get();
    }

    @Override // p067h0.InterfaceC6440j
    public int getSize() {
        return this.f8130b.getSize();
    }

    @Override // p067h0.InterfaceC6440j
    public synchronized void recycle() {
        this.f8129a.mo1595c();
        this.f8132d = true;
        if (!this.f8131c) {
            this.f8130b.recycle();
            m7050e();
        }
    }
}

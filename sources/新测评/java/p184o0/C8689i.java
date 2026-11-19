package p184o0;

import androidx.core.util.Pools;
import p117i1.AbstractC7651j;
import p128j1.AbstractC7778a;
import p128j1.AbstractC7780c;

/* renamed from: o0.i */
/* loaded from: classes3.dex */
public final class C8689i implements InterfaceC8690j, AbstractC7778a.f {

    /* renamed from: e */
    public static final Pools.Pool f14438e = AbstractC7778a.m13137d(20, new a());

    /* renamed from: a */
    public final AbstractC7780c f14439a = AbstractC7780c.m13149a();

    /* renamed from: b */
    public InterfaceC8690j f14440b;

    /* renamed from: c */
    public boolean f14441c;

    /* renamed from: d */
    public boolean f14442d;

    /* renamed from: o0.i$a */
    public class a implements AbstractC7778a.d {
        @Override // p128j1.AbstractC7778a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8689i create() {
            return new C8689i();
        }
    }

    /* renamed from: c */
    public static C8689i m14290c(InterfaceC8690j interfaceC8690j) {
        C8689i c8689i = (C8689i) AbstractC7651j.m12683d((C8689i) f14438e.acquire());
        c8689i.m14292b(interfaceC8690j);
        return c8689i;
    }

    /* renamed from: e */
    private void m14291e() {
        this.f14440b = null;
        f14438e.release(this);
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: a */
    public Class mo3569a() {
        return this.f14440b.mo3569a();
    }

    /* renamed from: b */
    public final void m14292b(InterfaceC8690j interfaceC8690j) {
        this.f14442d = false;
        this.f14441c = true;
        this.f14440b = interfaceC8690j;
    }

    @Override // p128j1.AbstractC7778a.f
    /* renamed from: d */
    public AbstractC7780c mo3443d() {
        return this.f14439a;
    }

    /* renamed from: f */
    public synchronized void m14293f() {
        this.f14439a.mo13151c();
        if (!this.f14441c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f14441c = false;
        if (this.f14442d) {
            recycle();
        }
    }

    @Override // p184o0.InterfaceC8690j
    public Object get() {
        return this.f14440b.get();
    }

    @Override // p184o0.InterfaceC8690j
    public int getSize() {
        return this.f14440b.getSize();
    }

    @Override // p184o0.InterfaceC8690j
    public synchronized void recycle() {
        this.f14439a.mo13151c();
        this.f14442d = true;
        if (!this.f14441c) {
            this.f14440b.recycle();
            m14291e();
        }
    }
}

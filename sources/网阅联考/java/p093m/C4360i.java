package p093m;

import androidx.core.util.Pools;
import p062g0.AbstractC3749i;
import p067h0.AbstractC3762a;
import p067h0.AbstractC3764c;

/* renamed from: m.i */
/* loaded from: classes2.dex */
public final class C4360i implements InterfaceC4361j, AbstractC3762a.f {

    /* renamed from: e */
    public static final Pools.Pool f4881e = AbstractC3762a.m4853d(20, new a());

    /* renamed from: a */
    public final AbstractC3764c f4882a = AbstractC3764c.m4863a();

    /* renamed from: b */
    public InterfaceC4361j f4883b;

    /* renamed from: c */
    public boolean f4884c;

    /* renamed from: d */
    public boolean f4885d;

    /* renamed from: m.i$a */
    public class a implements AbstractC3762a.d {
        @Override // p067h0.AbstractC3762a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4360i mo1871a() {
            return new C4360i();
        }
    }

    /* renamed from: c */
    public static C4360i m5374c(InterfaceC4361j interfaceC4361j) {
        C4360i c4360i = (C4360i) AbstractC3749i.m4768d((C4360i) f4881e.acquire());
        c4360i.m5375a(interfaceC4361j);
        return c4360i;
    }

    /* renamed from: a */
    public final void m5375a(InterfaceC4361j interfaceC4361j) {
        this.f4885d = false;
        this.f4884c = true;
        this.f4883b = interfaceC4361j;
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: b */
    public Class mo1898b() {
        return this.f4883b.mo1898b();
    }

    /* renamed from: d */
    public final void m5376d() {
        this.f4883b = null;
        f4881e.release(this);
    }

    @Override // p067h0.AbstractC3762a.f
    /* renamed from: e */
    public AbstractC3764c mo1772e() {
        return this.f4882a;
    }

    /* renamed from: f */
    public synchronized void m5377f() {
        this.f4882a.mo4865c();
        if (!this.f4884c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f4884c = false;
        if (this.f4885d) {
            recycle();
        }
    }

    @Override // p093m.InterfaceC4361j
    public Object get() {
        return this.f4883b.get();
    }

    @Override // p093m.InterfaceC4361j
    public int getSize() {
        return this.f4883b.getSize();
    }

    @Override // p093m.InterfaceC4361j
    public synchronized void recycle() {
        this.f4882a.mo4865c();
        this.f4885d = true;
        if (!this.f4884c) {
            this.f4883b.recycle();
            m5376d();
        }
    }
}

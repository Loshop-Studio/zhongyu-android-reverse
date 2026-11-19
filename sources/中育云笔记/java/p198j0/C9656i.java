package p198j0;

import androidx.core.util.Pools;
import p109d1.AbstractC8909j;
import p125e1.AbstractC9069a;
import p125e1.AbstractC9071c;

/* renamed from: j0.i */
/* loaded from: classes3.dex */
public final class C9656i implements InterfaceC9657j, AbstractC9069a.f {

    /* renamed from: g */
    public static final Pools.Pool f22371g = AbstractC9069a.m17858d(20, new a());

    /* renamed from: c */
    public final AbstractC9071c f22372c = AbstractC9071c.m17870a();

    /* renamed from: d */
    public InterfaceC9657j f22373d;

    /* renamed from: e */
    public boolean f22374e;

    /* renamed from: f */
    public boolean f22375f;

    /* renamed from: j0.i$a */
    public class a implements AbstractC9069a.d {
        @Override // p125e1.AbstractC9069a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9656i create() {
            return new C9656i();
        }
    }

    /* renamed from: c */
    public static C9656i m19054c(InterfaceC9657j interfaceC9657j) {
        C9656i c9656i = (C9656i) AbstractC8909j.m17468d((C9656i) f22371g.acquire());
        c9656i.m19056b(interfaceC9657j);
        return c9656i;
    }

    /* renamed from: e */
    private void m19055e() {
        this.f22373d = null;
        f22371g.release(this);
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: a */
    public Class mo4219a() {
        return this.f22373d.mo4219a();
    }

    /* renamed from: b */
    public final void m19056b(InterfaceC9657j interfaceC9657j) {
        this.f22375f = false;
        this.f22374e = true;
        this.f22373d = interfaceC9657j;
    }

    @Override // p125e1.AbstractC9069a.f
    /* renamed from: d */
    public AbstractC9071c mo4093d() {
        return this.f22372c;
    }

    /* renamed from: f */
    public synchronized void m19057f() {
        this.f22372c.mo17872c();
        if (!this.f22374e) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f22374e = false;
        if (this.f22375f) {
            recycle();
        }
    }

    @Override // p198j0.InterfaceC9657j
    public Object get() {
        return this.f22373d.get();
    }

    @Override // p198j0.InterfaceC9657j
    public int getSize() {
        return this.f22373d.getSize();
    }

    @Override // p198j0.InterfaceC9657j
    public synchronized void recycle() {
        this.f22372c.mo17872c();
        this.f22375f = true;
        if (!this.f22374e) {
            this.f22373d.recycle();
            m19055e();
        }
    }
}

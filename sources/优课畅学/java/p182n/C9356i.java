package p182n;

import androidx.core.util.Pools;
import p116h0.AbstractC8706j;
import p127i0.AbstractC8748a;
import p127i0.AbstractC8750c;

/* renamed from: n.i */
/* loaded from: classes3.dex */
public final class C9356i implements InterfaceC9357j, AbstractC8748a.f {

    /* renamed from: e */
    public static final Pools.Pool f18480e = AbstractC8748a.m14409d(20, new a());

    /* renamed from: a */
    public final AbstractC8750c f18481a = AbstractC8750c.m14421a();

    /* renamed from: b */
    public InterfaceC9357j f18482b;

    /* renamed from: c */
    public boolean f18483c;

    /* renamed from: d */
    public boolean f18484d;

    /* renamed from: n.i$a */
    public class a implements AbstractC8748a.d {
        @Override // p127i0.AbstractC8748a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C9356i create() {
            return new C9356i();
        }
    }

    /* renamed from: d */
    public static C9356i m17236d(InterfaceC9357j interfaceC9357j) {
        C9356i c9356i = (C9356i) AbstractC8706j.m14181d((C9356i) f18480e.acquire());
        c9356i.m17238c(interfaceC9357j);
        return c9356i;
    }

    /* renamed from: e */
    private void m17237e() {
        this.f18482b = null;
        f18480e.release(this);
    }

    @Override // p127i0.AbstractC8748a.f
    /* renamed from: a */
    public AbstractC8750c mo2886a() {
        return this.f18481a;
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: b */
    public Class mo3016b() {
        return this.f18482b.mo3016b();
    }

    /* renamed from: c */
    public final void m17238c(InterfaceC9357j interfaceC9357j) {
        this.f18484d = false;
        this.f18483c = true;
        this.f18482b = interfaceC9357j;
    }

    /* renamed from: f */
    public synchronized void m17239f() {
        this.f18481a.mo14423c();
        if (!this.f18483c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f18483c = false;
        if (this.f18484d) {
            recycle();
        }
    }

    @Override // p182n.InterfaceC9357j
    public Object get() {
        return this.f18482b.get();
    }

    @Override // p182n.InterfaceC9357j
    public int getSize() {
        return this.f18482b.getSize();
    }

    @Override // p182n.InterfaceC9357j
    public synchronized void recycle() {
        this.f18481a.mo14423c();
        this.f18484d = true;
        if (!this.f18483c) {
            this.f18482b.recycle();
            m17237e();
        }
    }
}

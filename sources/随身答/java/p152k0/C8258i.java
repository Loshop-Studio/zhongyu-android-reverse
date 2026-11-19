package p152k0;

import androidx.core.util.Pools;
import p091e1.AbstractC7837i;
import p102f1.AbstractC7909a;
import p102f1.AbstractC7911c;

/* renamed from: k0.i */
/* loaded from: classes3.dex */
public final class C8258i implements InterfaceC8259j, AbstractC7909a.f {

    /* renamed from: e */
    public static final Pools.Pool f14339e = AbstractC7909a.m12438d(20, new a());

    /* renamed from: a */
    public final AbstractC7911c f14340a = AbstractC7911c.m12448a();

    /* renamed from: b */
    public InterfaceC8259j f14341b;

    /* renamed from: c */
    public boolean f14342c;

    /* renamed from: d */
    public boolean f14343d;

    /* renamed from: k0.i$a */
    public class a implements AbstractC7909a.d {
        @Override // p102f1.AbstractC7909a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8258i create() {
            return new C8258i();
        }
    }

    /* renamed from: d */
    public static C8258i m13301d(InterfaceC8259j interfaceC8259j) {
        C8258i c8258i = (C8258i) AbstractC7837i.m12256d((C8258i) f14339e.acquire());
        c8258i.m13303c(interfaceC8259j);
        return c8258i;
    }

    /* renamed from: e */
    private void m13302e() {
        this.f14341b = null;
        f14339e.release(this);
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: a */
    public Class mo3221a() {
        return this.f14341b.mo3221a();
    }

    @Override // p102f1.AbstractC7909a.f
    /* renamed from: b */
    public AbstractC7911c mo3094b() {
        return this.f14340a;
    }

    /* renamed from: c */
    public final void m13303c(InterfaceC8259j interfaceC8259j) {
        this.f14343d = false;
        this.f14342c = true;
        this.f14341b = interfaceC8259j;
    }

    /* renamed from: f */
    public synchronized void m13304f() {
        this.f14340a.mo12450c();
        if (!this.f14342c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f14342c = false;
        if (this.f14343d) {
            recycle();
        }
    }

    @Override // p152k0.InterfaceC8259j
    public Object get() {
        return this.f14341b.get();
    }

    @Override // p152k0.InterfaceC8259j
    public int getSize() {
        return this.f14341b.getSize();
    }

    @Override // p152k0.InterfaceC8259j
    public synchronized void recycle() {
        this.f14340a.mo12450c();
        this.f14343d = true;
        if (!this.f14342c) {
            this.f14341b.recycle();
            m13302e();
        }
    }
}

package p016b0;

import com.bumptech.glide.load.engine.C3417c;
import p185v7.AbstractC6675d;
import p202y.InterfaceC6760c;

/* renamed from: b0.a0 */
/* loaded from: classes2.dex */
public final class C3060a0 implements InterfaceC3072g0 {

    /* renamed from: a */
    public final boolean f1382a;

    /* renamed from: b */
    public final boolean f1383b;

    /* renamed from: c */
    public final InterfaceC3072g0 f1384c;

    /* renamed from: d */
    public final InterfaceC3096z f1385d;

    /* renamed from: e */
    public final InterfaceC6760c f1386e;

    /* renamed from: f */
    public int f1387f;

    /* renamed from: g */
    public boolean f1388g;

    public C3060a0(InterfaceC3072g0 interfaceC3072g0, boolean z8, boolean z9, InterfaceC6760c interfaceC6760c, InterfaceC3096z interfaceC3096z) {
        AbstractC6675d.m6344f(interfaceC3072g0, "Argument must not be null");
        this.f1384c = interfaceC3072g0;
        this.f1382a = z8;
        this.f1383b = z9;
        this.f1386e = interfaceC6760c;
        AbstractC6675d.m6344f(interfaceC3096z, "Argument must not be null");
        this.f1385d = interfaceC3096z;
    }

    @Override // p016b0.InterfaceC3072g0
    /* renamed from: a */
    public final Class mo2004a() {
        return this.f1384c.mo2004a();
    }

    /* renamed from: b */
    public final synchronized void m2005b() {
        if (this.f1388g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f1387f++;
    }

    /* renamed from: c */
    public final void m2006c() {
        boolean z8;
        synchronized (this) {
            int i = this.f1387f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z8 = true;
            int i8 = i - 1;
            this.f1387f = i8;
            if (i8 != 0) {
                z8 = false;
            }
        }
        if (z8) {
            ((C3417c) this.f1385d).m2411e(this.f1386e, this);
        }
    }

    @Override // p016b0.InterfaceC3072g0
    public final Object get() {
        return this.f1384c.get();
    }

    @Override // p016b0.InterfaceC3072g0
    public final int getSize() {
        return this.f1384c.getSize();
    }

    @Override // p016b0.InterfaceC3072g0
    public final synchronized void recycle() {
        if (this.f1387f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f1388g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f1388g = true;
        if (this.f1383b) {
            this.f1384c.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f1382a + ", listener=" + this.f1385d + ", key=" + this.f1386e + ", acquired=" + this.f1387f + ", isRecycled=" + this.f1388g + ", resource=" + this.f1384c + '}';
    }
}

package p016b0;

import p032c8.C3238c;
import p187w0.AbstractC6699g;
import p187w0.C6696d;
import p187w0.C6700h;
import p187w0.InterfaceC6697e;

/* renamed from: b0.f0 */
/* loaded from: classes2.dex */
public final class C3070f0 implements InterfaceC3072g0, InterfaceC6697e {

    /* renamed from: e */
    public static final C6696d f1414e = AbstractC6699g.m6398a(20, new C3238c());

    /* renamed from: a */
    public final C6700h f1415a = new C6700h();

    /* renamed from: b */
    public InterfaceC3072g0 f1416b;

    /* renamed from: c */
    public boolean f1417c;

    /* renamed from: d */
    public boolean f1418d;

    @Override // p016b0.InterfaceC3072g0
    /* renamed from: a */
    public final Class mo2004a() {
        return this.f1416b.mo2004a();
    }

    /* renamed from: b */
    public final synchronized void m2014b() {
        this.f1415a.m6399a();
        if (!this.f1417c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f1417c = false;
        if (this.f1418d) {
            recycle();
        }
    }

    @Override // p187w0.InterfaceC6697e
    /* renamed from: c */
    public final C6700h mo2015c() {
        return this.f1415a;
    }

    @Override // p016b0.InterfaceC3072g0
    public final Object get() {
        return this.f1416b.get();
    }

    @Override // p016b0.InterfaceC3072g0
    public final int getSize() {
        return this.f1416b.getSize();
    }

    @Override // p016b0.InterfaceC3072g0
    public final synchronized void recycle() {
        this.f1415a.m6399a();
        this.f1418d = true;
        if (!this.f1417c) {
            this.f1416b.recycle();
            this.f1416b = null;
            f1414e.release(this);
        }
    }
}

package p192n9;

import kotlin.jvm.internal.AbstractC9133u;
import p192n9.InterfaceC9494u;

/* renamed from: n9.j */
/* loaded from: classes5.dex */
public final class C9483j implements InterfaceC9494u.b {

    /* renamed from: a */
    public final InterfaceC9494u.a f18747a;

    /* renamed from: b */
    public final boolean f18748b;

    public C9483j(Throwable e10) {
        AbstractC9133u.m16133g(e10, "e");
        this.f18747a = new InterfaceC9494u.a(this, null, e10, 2, null);
    }

    @Override // p192n9.InterfaceC9494u.b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C9488o mo17443a() {
        return (C9488o) m17496f();
    }

    @Override // p192n9.InterfaceC9494u.b, p203o9.InterfaceC9549d.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p192n9.InterfaceC9494u.b
    /* renamed from: c */
    public InterfaceC9494u.a mo17445c() {
        return this.f18747a;
    }

    /* renamed from: d */
    public final InterfaceC9494u.a m17495d() {
        return this.f18747a;
    }

    @Override // p192n9.InterfaceC9494u.b
    /* renamed from: e */
    public InterfaceC9494u.a mo17447e() {
        return this.f18747a;
    }

    /* renamed from: f */
    public Void m17496f() {
        throw new IllegalStateException("unexpected call");
    }

    /* renamed from: g */
    public Void m17497g() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p192n9.InterfaceC9494u.b
    public boolean isReady() {
        return this.f18748b;
    }

    @Override // p192n9.InterfaceC9494u.b
    public /* bridge */ /* synthetic */ InterfaceC9494u.b retry() {
        return (InterfaceC9494u.b) m17497g();
    }
}

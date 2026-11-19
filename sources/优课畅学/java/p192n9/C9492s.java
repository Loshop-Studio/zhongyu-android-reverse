package p192n9;

import kotlin.jvm.internal.AbstractC9133u;
import p192n9.InterfaceC9494u;

/* renamed from: n9.s */
/* loaded from: classes5.dex */
public final class C9492s implements InterfaceC9494u.b {

    /* renamed from: a */
    public final C9488o f18830a;

    /* renamed from: b */
    public final boolean f18831b;

    public C9492s(C9488o connection) {
        AbstractC9133u.m16133g(connection, "connection");
        this.f18830a = connection;
        this.f18831b = true;
    }

    @Override // p192n9.InterfaceC9494u.b
    /* renamed from: a */
    public C9488o mo17443a() {
        return this.f18830a;
    }

    @Override // p192n9.InterfaceC9494u.b, p203o9.InterfaceC9549d.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p192n9.InterfaceC9494u.b
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC9494u.a mo17445c() {
        return (InterfaceC9494u.a) m17587f();
    }

    /* renamed from: d */
    public Void m17586d() {
        throw new IllegalStateException("already connected");
    }

    @Override // p192n9.InterfaceC9494u.b
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC9494u.a mo17447e() {
        return (InterfaceC9494u.a) m17586d();
    }

    /* renamed from: f */
    public Void m17587f() {
        throw new IllegalStateException("already connected");
    }

    /* renamed from: g */
    public final C9488o m17588g() {
        return this.f18830a;
    }

    /* renamed from: h */
    public Void m17589h() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p192n9.InterfaceC9494u.b
    public boolean isReady() {
        return this.f18831b;
    }

    @Override // p192n9.InterfaceC9494u.b
    public /* bridge */ /* synthetic */ InterfaceC9494u.b retry() {
        return (InterfaceC9494u.b) m17589h();
    }
}

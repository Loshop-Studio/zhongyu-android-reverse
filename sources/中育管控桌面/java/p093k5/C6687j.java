package p093k5;

import kotlin.jvm.internal.Intrinsics;
import p093k5.InterfaceC6698u;

/* renamed from: k5.j */
/* loaded from: classes4.dex */
public final class C6687j implements InterfaceC6698u.b {

    /* renamed from: a */
    public final InterfaceC6698u.a f8877a;

    /* renamed from: b */
    public final boolean f8878b;

    public C6687j(Throwable e6) {
        Intrinsics.checkNotNullParameter(e6, "e");
        this.f8877a = new InterfaceC6698u.a(this, null, e6, 2, null);
    }

    @Override // p093k5.InterfaceC6698u.b
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C6692o mo7710a() {
        return (C6692o) m7763e();
    }

    @Override // p093k5.InterfaceC6698u.b, p102l5.InterfaceC7350d.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p093k5.InterfaceC6698u.b
    /* renamed from: c */
    public InterfaceC6698u.a mo7712c() {
        return this.f8877a;
    }

    /* renamed from: d */
    public final InterfaceC6698u.a m7762d() {
        return this.f8877a;
    }

    /* renamed from: e */
    public Void m7763e() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // p093k5.InterfaceC6698u.b
    /* renamed from: f */
    public InterfaceC6698u.a mo7715f() {
        return this.f8877a;
    }

    /* renamed from: g */
    public Void m7764g() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p093k5.InterfaceC6698u.b
    public boolean isReady() {
        return this.f8878b;
    }

    @Override // p093k5.InterfaceC6698u.b
    public /* bridge */ /* synthetic */ InterfaceC6698u.b retry() {
        return (InterfaceC6698u.b) m7764g();
    }
}

package p093k5;

import kotlin.jvm.internal.Intrinsics;
import p093k5.InterfaceC6698u;

/* renamed from: k5.s */
/* loaded from: classes4.dex */
public final class C6696s implements InterfaceC6698u.b {

    /* renamed from: a */
    public final C6692o f8960a;

    /* renamed from: b */
    public final boolean f8961b;

    public C6696s(C6692o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f8960a = connection;
        this.f8961b = true;
    }

    @Override // p093k5.InterfaceC6698u.b
    /* renamed from: a */
    public C6692o mo7710a() {
        return this.f8960a;
    }

    @Override // p093k5.InterfaceC6698u.b, p102l5.InterfaceC7350d.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // p093k5.InterfaceC6698u.b
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC6698u.a mo7712c() {
        return (InterfaceC6698u.a) m7854e();
    }

    /* renamed from: d */
    public Void m7853d() {
        throw new IllegalStateException("already connected");
    }

    /* renamed from: e */
    public Void m7854e() {
        throw new IllegalStateException("already connected");
    }

    @Override // p093k5.InterfaceC6698u.b
    /* renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC6698u.a mo7715f() {
        return (InterfaceC6698u.a) m7853d();
    }

    /* renamed from: g */
    public final C6692o m7855g() {
        return this.f8960a;
    }

    /* renamed from: h */
    public Void m7856h() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // p093k5.InterfaceC6698u.b
    public boolean isReady() {
        return this.f8961b;
    }

    @Override // p093k5.InterfaceC6698u.b
    public /* bridge */ /* synthetic */ InterfaceC6698u.b retry() {
        return (InterfaceC6698u.b) m7856h();
    }
}

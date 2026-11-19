package p093k5;

import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6355a;
import p058f5.C6384w;
import p093k5.InterfaceC6698u;

/* renamed from: k5.l */
/* loaded from: classes4.dex */
public final class C6689l implements InterfaceC6698u {

    /* renamed from: a */
    public final C6694q f8887a;

    public C6689l(C6694q delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f8887a = delegate;
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: a */
    public C6355a mo7770a() {
        return this.f8887a.mo7770a();
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: b */
    public ArrayDeque mo7771b() {
        return this.f8887a.mo7771b();
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: c */
    public InterfaceC6698u.b mo7772c() {
        return this.f8887a.m7846h();
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: e */
    public boolean mo7773e(C6384w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.f8887a.mo7773e(url);
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: f */
    public boolean mo7774f(C6692o c6692o) {
        return this.f8887a.mo7774f(c6692o);
    }

    @Override // p093k5.InterfaceC6698u
    public boolean isCanceled() {
        return this.f8887a.isCanceled();
    }
}

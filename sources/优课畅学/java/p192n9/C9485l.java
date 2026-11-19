package p192n9;

import kotlin.jvm.internal.AbstractC9133u;
import p134i7.C8791m;
import p136i9.C8896a;
import p136i9.C8925w;
import p192n9.InterfaceC9494u;

/* renamed from: n9.l */
/* loaded from: classes5.dex */
public final class C9485l implements InterfaceC9494u {

    /* renamed from: a */
    public final C9490q f18757a;

    public C9485l(C9490q delegate) {
        AbstractC9133u.m16133g(delegate, "delegate");
        this.f18757a = delegate;
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: a */
    public C8896a mo17503a() {
        return this.f18757a.mo17503a();
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: b */
    public boolean mo17504b(C8925w url) {
        AbstractC9133u.m16133g(url, "url");
        return this.f18757a.mo17504b(url);
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: c */
    public C8791m mo17505c() {
        return this.f18757a.mo17505c();
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: d */
    public InterfaceC9494u.b mo17506d() {
        return this.f18757a.m17579h();
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: e */
    public boolean mo17507e(C9488o c9488o) {
        return this.f18757a.mo17507e(c9488o);
    }

    @Override // p192n9.InterfaceC9494u
    public boolean isCanceled() {
        return this.f18757a.isCanceled();
    }
}

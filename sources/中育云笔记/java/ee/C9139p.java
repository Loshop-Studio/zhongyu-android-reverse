package ee;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ee.p */
/* loaded from: classes6.dex */
public final class C9139p implements InterfaceC9129f {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9129f f21336a;

    /* renamed from: b */
    public final String f21337b;

    public C9139p(String serialName, InterfaceC9129f original) {
        AbstractC9979u.m20294g(serialName, "serialName");
        AbstractC9979u.m20294g(original, "original");
        this.f21336a = original;
        this.f21337b = serialName;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: b */
    public boolean mo17957b() {
        return this.f21336a.mo17957b();
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: c */
    public int mo17958c() {
        return this.f21336a.mo17958c();
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: d */
    public String mo17959d(int i10) {
        return this.f21336a.mo17959d(i10);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: e */
    public InterfaceC9129f mo17960e(int i10) {
        return this.f21336a.mo17960e(i10);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: f */
    public String mo17961f() {
        return this.f21337b;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: g */
    public boolean mo17962g(int i10) {
        return this.f21336a.mo17962g(i10);
    }

    @Override // ee.InterfaceC9129f
    public AbstractC9137n getKind() {
        return this.f21336a.getKind();
    }

    @Override // ee.InterfaceC9129f
    public boolean isInline() {
        return this.f21336a.isInline();
    }
}

package ee;

import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* renamed from: ee.c */
/* loaded from: classes6.dex */
public final class C9126c implements InterfaceC9129f {

    /* renamed from: a */
    public final InterfaceC9129f f21297a;

    /* renamed from: b */
    public final InterfaceC10469c f21298b;

    /* renamed from: c */
    public final String f21299c;

    public C9126c(InterfaceC9129f original, InterfaceC10469c kClass) {
        AbstractC9979u.m20294g(original, "original");
        AbstractC9979u.m20294g(kClass, "kClass");
        this.f21297a = original;
        this.f21298b = kClass;
        this.f21299c = original.mo17961f() + '<' + kClass.mo20277f() + '>';
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: b */
    public boolean mo17957b() {
        return this.f21297a.mo17957b();
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: c */
    public int mo17958c() {
        return this.f21297a.mo17958c();
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: d */
    public String mo17959d(int i10) {
        return this.f21297a.mo17959d(i10);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: e */
    public InterfaceC9129f mo17960e(int i10) {
        return this.f21297a.mo17960e(i10);
    }

    public boolean equals(Object obj) {
        C9126c c9126c = obj instanceof C9126c ? (C9126c) obj : null;
        return c9126c != null && AbstractC9979u.m20289b(this.f21297a, c9126c.f21297a) && AbstractC9979u.m20289b(c9126c.f21298b, this.f21298b);
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: f */
    public String mo17961f() {
        return this.f21299c;
    }

    @Override // ee.InterfaceC9129f
    /* renamed from: g */
    public boolean mo17962g(int i10) {
        return this.f21297a.mo17962g(i10);
    }

    @Override // ee.InterfaceC9129f
    public AbstractC9137n getKind() {
        return this.f21297a.getKind();
    }

    public int hashCode() {
        return (this.f21298b.hashCode() * 31) + mo17961f().hashCode();
    }

    @Override // ee.InterfaceC9129f
    public boolean isInline() {
        return this.f21297a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f21298b + ", original: " + this.f21297a + ')';
    }
}

package p268u8;

import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;

/* renamed from: u8.c */
/* loaded from: classes5.dex */
public final class C10207c implements InterfaceC10210f {

    /* renamed from: a */
    public final InterfaceC10210f f20358a;

    /* renamed from: b */
    public final InterfaceC8375c f20359b;

    /* renamed from: c */
    public final String f20360c;

    public C10207c(InterfaceC10210f original, InterfaceC8375c kClass) {
        AbstractC9133u.m16133g(original, "original");
        AbstractC9133u.m16133g(kClass, "kClass");
        this.f20358a = original;
        this.f20359b = kClass;
        this.f20360c = original.mo19089f() + '<' + kClass.mo13672g() + '>';
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: b */
    public boolean mo19085b() {
        return this.f20358a.mo19085b();
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: c */
    public int mo19086c() {
        return this.f20358a.mo19086c();
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: d */
    public String mo19087d(int i10) {
        return this.f20358a.mo19087d(i10);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: e */
    public InterfaceC10210f mo19088e(int i10) {
        return this.f20358a.mo19088e(i10);
    }

    public boolean equals(Object obj) {
        C10207c c10207c = obj instanceof C10207c ? (C10207c) obj : null;
        return c10207c != null && AbstractC9133u.m16128b(this.f20358a, c10207c.f20358a) && AbstractC9133u.m16128b(c10207c.f20359b, this.f20359b);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: f */
    public String mo19089f() {
        return this.f20360c;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: g */
    public boolean mo19090g(int i10) {
        return this.f20358a.mo19090g(i10);
    }

    @Override // p268u8.InterfaceC10210f
    public AbstractC10218n getKind() {
        return this.f20358a.getKind();
    }

    public int hashCode() {
        return (this.f20359b.hashCode() * 31) + mo19089f().hashCode();
    }

    @Override // p268u8.InterfaceC10210f
    public boolean isInline() {
        return this.f20358a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f20359b + ", original: " + this.f20358a + ')';
    }
}

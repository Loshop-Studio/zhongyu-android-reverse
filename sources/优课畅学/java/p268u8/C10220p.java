package p268u8;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: u8.p */
/* loaded from: classes5.dex */
public final class C10220p implements InterfaceC10210f {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10210f f20397a;

    /* renamed from: b */
    public final String f20398b;

    public C10220p(String serialName, InterfaceC10210f original) {
        AbstractC9133u.m16133g(serialName, "serialName");
        AbstractC9133u.m16133g(original, "original");
        this.f20397a = original;
        this.f20398b = serialName;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: b */
    public boolean mo19085b() {
        return this.f20397a.mo19085b();
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: c */
    public int mo19086c() {
        return this.f20397a.mo19086c();
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: d */
    public String mo19087d(int i10) {
        return this.f20397a.mo19087d(i10);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: e */
    public InterfaceC10210f mo19088e(int i10) {
        return this.f20397a.mo19088e(i10);
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: f */
    public String mo19089f() {
        return this.f20398b;
    }

    @Override // p268u8.InterfaceC10210f
    /* renamed from: g */
    public boolean mo19090g(int i10) {
        return this.f20397a.mo19090g(i10);
    }

    @Override // p268u8.InterfaceC10210f
    public AbstractC10218n getKind() {
        return this.f20397a.getKind();
    }

    @Override // p268u8.InterfaceC10210f
    public boolean isInline() {
        return this.f20397a.isInline();
    }
}

package p101k7;

import coil3.network.AbstractC3315g;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5823d;
import p207y6.InterfaceC6779c;

/* renamed from: k7.b */
/* loaded from: classes4.dex */
public final class C5760b implements InterfaceC5765g {

    /* renamed from: a */
    public final C5766h f9116a;

    /* renamed from: b */
    public final InterfaceC6779c f9117b;

    /* renamed from: c */
    public final String f9118c;

    public C5760b(C5766h c5766h, InterfaceC6779c kClass) {
        AbstractC5830k.m5330g(kClass, "kClass");
        this.f9116a = c5766h;
        this.f9117b = kClass;
        this.f9118c = c5766h.f9130a + '<' + ((C5823d) kClass).m5320e() + '>';
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: b */
    public final boolean mo5099b() {
        return false;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        return this.f9116a.mo5100c(name);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        return this.f9116a.f9132c;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: e */
    public final String mo5102e(int i) {
        return this.f9116a.f9135f[i];
    }

    public final boolean equals(Object obj) {
        C5760b c5760b = obj instanceof C5760b ? (C5760b) obj : null;
        return c5760b != null && this.f9116a.equals(c5760b.f9116a) && AbstractC5830k.m5325b(c5760b.f9117b, this.f9117b);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        return this.f9116a.f9137h[i];
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        return this.f9116a.f9136g[i];
    }

    @Override // p101k7.InterfaceC5765g
    public final List getAnnotations() {
        return this.f9116a.f9133d;
    }

    @Override // p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        return this.f9116a.f9131b;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        return this.f9118c;
    }

    public final int hashCode() {
        return this.f9118c.hashCode() + (((C5823d) this.f9117b).hashCode() * 31);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        return this.f9116a.f9138i[i];
    }

    @Override // p101k7.InterfaceC5765g
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f9117b + ", original: " + this.f9116a + ')';
    }
}

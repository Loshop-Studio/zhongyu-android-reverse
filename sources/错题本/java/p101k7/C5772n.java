package p101k7;

import coil3.network.AbstractC3315g;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p118m7.AbstractC6191y0;

/* renamed from: k7.n */
/* loaded from: classes4.dex */
public final class C5772n implements InterfaceC5765g {

    /* renamed from: a */
    public final String f9150a;

    /* renamed from: b */
    public final InterfaceC5765g f9151b;

    public C5772n(String str, InterfaceC5765g original) {
        AbstractC5830k.m5330g(original, "original");
        this.f9150a = str;
        this.f9151b = original;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: b */
    public final boolean mo5099b() {
        return this.f9151b.mo5099b();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        return this.f9151b.mo5100c(name);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        return this.f9151b.mo5101d();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: e */
    public final String mo5102e(int i) {
        return this.f9151b.mo5102e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5772n)) {
            return false;
        }
        C5772n c5772n = (C5772n) obj;
        return AbstractC5830k.m5325b(this.f9150a, c5772n.f9150a) && AbstractC5830k.m5325b(this.f9151b, c5772n.f9151b);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        return this.f9151b.mo5103f(i);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        return this.f9151b.mo5104g(i);
    }

    @Override // p101k7.InterfaceC5765g
    public final List getAnnotations() {
        return this.f9151b.getAnnotations();
    }

    @Override // p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        return this.f9151b.getKind();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        return this.f9150a;
    }

    public final int hashCode() {
        return this.f9151b.hashCode() + (this.f9150a.hashCode() * 31);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        return this.f9151b.mo5106i(i);
    }

    @Override // p101k7.InterfaceC5765g
    public final boolean isInline() {
        return this.f9151b.isInline();
    }

    public final String toString() {
        return AbstractC6191y0.m5843m(this);
    }
}

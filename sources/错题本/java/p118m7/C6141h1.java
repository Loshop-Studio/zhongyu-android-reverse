package p118m7;

import coil3.network.AbstractC3315g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;
import p101k7.InterfaceC5765g;

/* renamed from: m7.h1 */
/* loaded from: classes4.dex */
public final class C6141h1 implements InterfaceC5765g, InterfaceC6151l {

    /* renamed from: a */
    public final InterfaceC5765g f9809a;

    /* renamed from: b */
    public final String f9810b;

    /* renamed from: c */
    public final Set f9811c;

    public C6141h1(InterfaceC5765g original) {
        AbstractC5830k.m5330g(original, "original");
        this.f9809a = original;
        this.f9810b = original.mo5105h() + '?';
        this.f9811c = AbstractC6191y0.m5832b(original);
    }

    @Override // p118m7.InterfaceC6151l
    /* renamed from: a */
    public final Set mo5107a() {
        return this.f9811c;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: b */
    public final boolean mo5099b() {
        return true;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        return this.f9809a.mo5100c(name);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        return this.f9809a.mo5101d();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: e */
    public final String mo5102e(int i) {
        return this.f9809a.mo5102e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6141h1) {
            return AbstractC5830k.m5325b(this.f9809a, ((C6141h1) obj).f9809a);
        }
        return false;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        return this.f9809a.mo5103f(i);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        return this.f9809a.mo5104g(i);
    }

    @Override // p101k7.InterfaceC5765g
    public final List getAnnotations() {
        return this.f9809a.getAnnotations();
    }

    @Override // p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        return this.f9809a.getKind();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        return this.f9810b;
    }

    public final int hashCode() {
        return this.f9809a.hashCode() * 31;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        return this.f9809a.mo5106i(i);
    }

    @Override // p101k7.InterfaceC5765g
    public final boolean isInline() {
        return this.f9809a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9809a);
        sb.append('?');
        return sb.toString();
    }
}

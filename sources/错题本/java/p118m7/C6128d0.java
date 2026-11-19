package p118m7;

import android.support.v4.media.AbstractC0037f;
import coil3.network.AbstractC3315g;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;

/* renamed from: m7.d0 */
/* loaded from: classes4.dex */
public final class C6128d0 implements InterfaceC5765g {

    /* renamed from: a */
    public final String f9785a;

    /* renamed from: b */
    public final InterfaceC5765g f9786b;

    /* renamed from: c */
    public final InterfaceC5765g f9787c;

    public C6128d0(String str, InterfaceC5765g interfaceC5765g, InterfaceC5765g interfaceC5765g2) {
        this.f9785a = str;
        this.f9786b = interfaceC5765g;
        this.f9787c = interfaceC5765g2;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        Integer numM5410D = AbstractC5862w.m5410D(name);
        if (numM5410D != null) {
            return numM5410D.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        return 2;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: e */
    public final String mo5102e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6128d0)) {
            return false;
        }
        C6128d0 c6128d0 = (C6128d0) obj;
        return AbstractC5830k.m5325b(this.f9785a, c6128d0.f9785a) && AbstractC5830k.m5325b(this.f9786b, c6128d0.f9786b) && AbstractC5830k.m5325b(this.f9787c, c6128d0.f9787c);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        throw new IllegalArgumentException(AbstractC0037f.m91p(AbstractC0037f.m94s(i, "Illegal index ", ", "), this.f9785a, " expects only non-negative indices").toString());
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m91p(AbstractC0037f.m94s(i, "Illegal index ", ", "), this.f9785a, " expects only non-negative indices").toString());
        }
        int i8 = i % 2;
        if (i8 == 0) {
            return this.f9786b;
        }
        if (i8 == 1) {
            return this.f9787c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        return C5770l.f9148d;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        return this.f9785a;
    }

    public final int hashCode() {
        return this.f9787c.hashCode() + ((this.f9786b.hashCode() + (this.f9785a.hashCode() * 31)) * 31);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC0037f.m91p(AbstractC0037f.m94s(i, "Illegal index ", ", "), this.f9785a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f9785a + '(' + this.f9786b + ", " + this.f9787c + ')';
    }
}

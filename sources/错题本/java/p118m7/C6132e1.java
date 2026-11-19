package p118m7;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import coil3.network.AbstractC3315g;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p101k7.AbstractC5764f;
import p101k7.InterfaceC5765g;

/* renamed from: m7.e1 */
/* loaded from: classes4.dex */
public final class C6132e1 implements InterfaceC5765g {

    /* renamed from: a */
    public final String f9795a;

    /* renamed from: b */
    public final AbstractC5764f f9796b;

    public C6132e1(String str, AbstractC5764f kind) {
        AbstractC5830k.m5330g(kind, "kind");
        this.f9795a = str;
        this.f9796b = kind;
    }

    /* renamed from: a */
    public final void m5828a() {
        throw new IllegalStateException(AbstractC0037f.m91p(new StringBuilder("Primitive descriptor "), this.f9795a, " does not have elements"));
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        m5828a();
        throw null;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        return 0;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: e */
    public final String mo5102e(int i) {
        m5828a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6132e1)) {
            return false;
        }
        C6132e1 c6132e1 = (C6132e1) obj;
        return AbstractC5830k.m5325b(this.f9795a, c6132e1.f9795a) && AbstractC5830k.m5325b(this.f9796b, c6132e1.f9796b);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        m5828a();
        throw null;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        m5828a();
        throw null;
    }

    @Override // p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        return this.f9796b;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        return this.f9795a;
    }

    public final int hashCode() {
        return (this.f9796b.hashCode() * 31) + this.f9795a.hashCode();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        m5828a();
        throw null;
    }

    public final String toString() {
        return AbstractC0584a.m911l(')', this.f9795a, new StringBuilder("PrimitiveDescriptor("));
    }
}

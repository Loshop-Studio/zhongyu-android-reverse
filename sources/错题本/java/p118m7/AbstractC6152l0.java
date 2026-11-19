package p118m7;

import android.support.v4.media.AbstractC0037f;
import coil3.network.AbstractC3315g;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;

/* renamed from: m7.l0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6152l0 implements InterfaceC5765g {

    /* renamed from: a */
    public final InterfaceC5765g f9823a;

    public AbstractC6152l0(InterfaceC5765g interfaceC5765g) {
        this.f9823a = interfaceC5765g;
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        Integer numM5410D = AbstractC5862w.m5410D(name);
        if (numM5410D != null) {
            return numM5410D.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        return 1;
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
        if (!(obj instanceof AbstractC6152l0)) {
            return false;
        }
        AbstractC6152l0 abstractC6152l0 = (AbstractC6152l0) obj;
        return AbstractC5830k.m5325b(this.f9823a, abstractC6152l0.f9823a) && AbstractC5830k.m5325b(mo5105h(), abstractC6152l0.mo5105h());
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(i, "Illegal index ", ", ");
        sbM94s.append(mo5105h());
        sbM94s.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM94s.toString().toString());
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        if (i >= 0) {
            return this.f9823a;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(i, "Illegal index ", ", ");
        sbM94s.append(mo5105h());
        sbM94s.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM94s.toString().toString());
    }

    @Override // p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        return C5770l.f9147c;
    }

    public final int hashCode() {
        return mo5105h().hashCode() + (this.f9823a.hashCode() * 31);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(i, "Illegal index ", ", ");
        sbM94s.append(mo5105h());
        sbM94s.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM94s.toString().toString());
    }

    public final String toString() {
        return mo5105h() + '(' + this.f9823a + ')';
    }
}

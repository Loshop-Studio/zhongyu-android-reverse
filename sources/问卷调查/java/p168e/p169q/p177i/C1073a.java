package p168e.p169q.p177i;

import p160d.p162f.p164b.C1011d;

/* renamed from: e.q.i.a */
/* loaded from: classes.dex */
public final class C1073a extends AbstractC1075c {

    /* renamed from: a */
    public final InterfaceC1076d f5643a;

    public C1073a(InterfaceC1076d interfaceC1076d) {
        C1011d.m2809e(interfaceC1076d, "trustRootIndex");
        this.f5643a = interfaceC1076d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1073a) && C1011d.m2805a(((C1073a) obj).f5643a, this.f5643a);
    }

    public int hashCode() {
        return this.f5643a.hashCode();
    }
}

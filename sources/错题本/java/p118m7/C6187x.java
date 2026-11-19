package p118m7;

import coil3.network.AbstractC3315g;
import com.zykj.mistake.feature.notebook.detail.C4898w4;
import kotlin.AbstractC5773a;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5434j;
import p045d6.InterfaceC5429e;
import p101k7.C5767i;
import p101k7.C5769k;
import p101k7.InterfaceC5765g;

/* renamed from: m7.x */
/* loaded from: classes4.dex */
public final class C6187x extends C6118a1 {

    /* renamed from: l */
    public final C5769k f9888l;

    /* renamed from: m */
    public final InterfaceC5429e f9889m;

    public C6187x(String str, int i) {
        super(str, null, i);
        this.f9888l = C5769k.f9145b;
        this.f9889m = AbstractC5773a.m5117b(new C4898w4(i, str, this));
    }

    @Override // p118m7.C6118a1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC5765g)) {
            return false;
        }
        InterfaceC5765g interfaceC5765g = (InterfaceC5765g) obj;
        return interfaceC5765g.getKind() == C5769k.f9145b && this.f9764a.equals(interfaceC5765g.mo5105h()) && AbstractC5830k.m5325b(AbstractC6191y0.m5832b(this), AbstractC6191y0.m5832b(interfaceC5765g));
    }

    @Override // p118m7.C6118a1, p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        return ((InterfaceC5765g[]) this.f9889m.getValue())[i];
    }

    @Override // p118m7.C6118a1, p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        return this.f9888l;
    }

    @Override // p118m7.C6118a1
    public final int hashCode() {
        int iHashCode = this.f9764a.hashCode();
        C5434j c5434j = new C5434j(this);
        int iHashCode2 = 1;
        while (c5434j.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) c5434j.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // p118m7.C6118a1
    public final String toString() {
        return AbstractC5805t.m5234n0(new C5767i(this, 0), ", ", this.f9764a.concat("("), ")", null, 56);
    }
}

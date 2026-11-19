package p118m7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5830k;
import p101k7.InterfaceC5765g;

/* renamed from: m7.f0 */
/* loaded from: classes4.dex */
public final class C6134f0 extends C6118a1 {

    /* renamed from: l */
    public final boolean f9798l;

    public C6134f0(String str, C6137g0 c6137g0) {
        super(str, c6137g0, 1);
        this.f9798l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [d6.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [d6.e, java.lang.Object] */
    @Override // p118m7.C6118a1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6134f0) {
            InterfaceC5765g interfaceC5765g = (InterfaceC5765g) obj;
            if (this.f9764a.equals(interfaceC5765g.mo5105h())) {
                C6134f0 c6134f0 = (C6134f0) obj;
                if (c6134f0.f9798l && Arrays.equals((InterfaceC5765g[]) this.f9773j.getValue(), (InterfaceC5765g[]) c6134f0.f9773j.getValue())) {
                    int iMo5101d = interfaceC5765g.mo5101d();
                    int i = this.f9766c;
                    if (i == iMo5101d) {
                        for (int i8 = 0; i8 < i; i8++) {
                            if (AbstractC5830k.m5325b(mo5104g(i8).mo5105h(), interfaceC5765g.mo5104g(i8).mo5105h()) && AbstractC5830k.m5325b(mo5104g(i8).getKind(), interfaceC5765g.mo5104g(i8).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p118m7.C6118a1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p101k7.InterfaceC5765g
    public final boolean isInline() {
        return this.f9798l;
    }
}

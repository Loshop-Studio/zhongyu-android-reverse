package ge;

import ee.InterfaceC9129f;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ge.q0 */
/* loaded from: classes6.dex */
public final class C9369q0 extends C9312d2 {

    /* renamed from: l */
    public final boolean f21784l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9369q0(String name, InterfaceC9349l0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(generatedSerializer, "generatedSerializer");
        this.f21784l = true;
    }

    @Override // ge.C9312d2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9369q0)) {
            return false;
        }
        InterfaceC9129f interfaceC9129f = (InterfaceC9129f) obj;
        if (!AbstractC9979u.m20289b(mo17961f(), interfaceC9129f.mo17961f())) {
            return false;
        }
        C9369q0 c9369q0 = (C9369q0) obj;
        if (!c9369q0.isInline() || !Arrays.equals(m18397r(), c9369q0.m18397r()) || mo17958c() != interfaceC9129f.mo17958c()) {
            return false;
        }
        int iMo17958c = mo17958c();
        for (int i10 = 0; i10 < iMo17958c; i10++) {
            if (!AbstractC9979u.m20289b(mo17960e(i10).mo17961f(), interfaceC9129f.mo17960e(i10).mo17961f()) || !AbstractC9979u.m20289b(mo17960e(i10).getKind(), interfaceC9129f.mo17960e(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // ge.C9312d2
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // ge.C9312d2, ee.InterfaceC9129f
    public boolean isInline() {
        return this.f21784l;
    }
}

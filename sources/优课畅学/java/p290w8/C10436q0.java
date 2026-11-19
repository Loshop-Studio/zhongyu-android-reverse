package p290w8;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p268u8.InterfaceC10210f;

/* renamed from: w8.q0 */
/* loaded from: classes5.dex */
public final class C10436q0 extends C10379d2 {

    /* renamed from: l */
    public final boolean f20757l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10436q0(String name, InterfaceC10416l0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(generatedSerializer, "generatedSerializer");
        this.f20757l = true;
    }

    @Override // p290w8.C10379d2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10436q0)) {
            return false;
        }
        InterfaceC10210f interfaceC10210f = (InterfaceC10210f) obj;
        if (!AbstractC9133u.m16128b(mo19089f(), interfaceC10210f.mo19089f())) {
            return false;
        }
        C10436q0 c10436q0 = (C10436q0) obj;
        if (!c10436q0.isInline() || !Arrays.equals(m19371r(), c10436q0.m19371r()) || mo19086c() != interfaceC10210f.mo19086c()) {
            return false;
        }
        int iMo19086c = mo19086c();
        for (int i10 = 0; i10 < iMo19086c; i10++) {
            if (!AbstractC9133u.m16128b(mo19088e(i10).mo19089f(), interfaceC10210f.mo19088e(i10).mo19089f()) || !AbstractC9133u.m16128b(mo19088e(i10).getKind(), interfaceC10210f.mo19088e(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // p290w8.C10379d2
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p290w8.C10379d2, p268u8.InterfaceC10210f
    public boolean isInline() {
        return this.f20757l;
    }
}

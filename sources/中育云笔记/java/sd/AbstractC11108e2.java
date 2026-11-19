package sd;

import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p426yd.AbstractC11945b;
import vc.InterfaceC11588c;

/* renamed from: sd.e2 */
/* loaded from: classes6.dex */
public abstract class AbstractC11108e2 {
    /* renamed from: a */
    public static final InterfaceC11168v m24700a(InterfaceC10045g interfaceC10045g) {
        return new C11104d2(interfaceC10045g);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC11168v m24701b(InterfaceC10045g interfaceC10045g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10045g = null;
        }
        return m24700a(interfaceC10045g);
    }

    /* renamed from: c */
    public static final Object m24702c(InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        C11100c2 c11100c2 = new C11100c2(interfaceC11588c.getContext(), interfaceC11588c);
        Object objM26507d = AbstractC11945b.m26507d(c11100c2, c11100c2, interfaceC9544p);
        if (objM26507d == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM26507d;
    }
}

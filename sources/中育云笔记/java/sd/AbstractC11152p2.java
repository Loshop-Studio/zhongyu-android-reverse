package sd;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p410xd.AbstractC11850i;
import p410xd.C11848h;
import vc.InterfaceC11588c;

/* renamed from: sd.p2 */
/* loaded from: classes6.dex */
public abstract class AbstractC11152p2 {
    /* renamed from: a */
    public static final Object m24789a(InterfaceC11588c interfaceC11588c) {
        Object objM25952f;
        InterfaceC9945d context = interfaceC11588c.getContext();
        AbstractC11147o1.m24775i(context);
        InterfaceC11588c interfaceC11588cM20224d = IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c);
        C11848h c11848h = interfaceC11588cM20224d instanceof C11848h ? (C11848h) interfaceC11588cM20224d : null;
        if (c11848h == null) {
            objM25952f = C10786q.f26013a;
        } else {
            if (AbstractC11850i.m26280d(c11848h.f28087f, context)) {
                c11848h.m26271l(context, C10786q.f26013a);
            } else {
                C11148o2 c11148o2 = new C11148o2();
                InterfaceC9945d interfaceC9945dPlus = context.plus(c11148o2);
                C10786q c10786q = C10786q.f26013a;
                c11848h.m26271l(interfaceC9945dPlus, c10786q);
                objM25952f = (!c11148o2.f26810c || AbstractC11850i.m26281e(c11848h)) ? AbstractC11725a.m25952f() : c10786q;
            }
            objM25952f = AbstractC11725a.m25952f();
        }
        if (objM25952f == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM25952f == AbstractC11725a.m25952f() ? objM25952f : C10786q.f26013a;
    }
}

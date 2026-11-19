package p410xd;

import p181hd.InterfaceC9544p;

/* renamed from: xd.b */
/* loaded from: classes6.dex */
public abstract class AbstractC11836b {

    /* renamed from: a */
    public static final C11839c0 f28076a = new C11839c0("CLOSED");

    /* renamed from: b */
    public static final AbstractC11838c m26230b(AbstractC11838c abstractC11838c) {
        while (true) {
            Object objM26240g = abstractC11838c.m26240g();
            if (objM26240g == f28076a) {
                return abstractC11838c;
            }
            AbstractC11838c abstractC11838c2 = (AbstractC11838c) objM26240g;
            if (abstractC11838c2 != null) {
                abstractC11838c = abstractC11838c2;
            } else if (abstractC11838c.m26244m()) {
                return abstractC11838c;
            }
        }
    }

    /* renamed from: c */
    public static final Object m26231c(AbstractC11875z abstractC11875z, long j10, InterfaceC9544p interfaceC9544p) {
        while (true) {
            if (abstractC11875z.f28135e >= j10 && !abstractC11875z.mo26242k()) {
                return AbstractC11835a0.m26226a(abstractC11875z);
            }
            Object objM26240g = abstractC11875z.m26240g();
            if (objM26240g == f28076a) {
                return AbstractC11835a0.m26226a(f28076a);
            }
            AbstractC11875z abstractC11875z2 = (AbstractC11875z) ((AbstractC11838c) objM26240g);
            if (abstractC11875z2 == null) {
                abstractC11875z2 = (AbstractC11875z) interfaceC9544p.invoke(Long.valueOf(abstractC11875z.f28135e + 1), abstractC11875z);
                if (abstractC11875z.m26246o(abstractC11875z2)) {
                    if (abstractC11875z.mo26242k()) {
                        abstractC11875z.m26245n();
                    }
                }
            }
            abstractC11875z = abstractC11875z2;
        }
    }
}

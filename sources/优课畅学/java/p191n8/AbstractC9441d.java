package p191n8;

import p300x7.InterfaceC10574p;

/* renamed from: n8.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9441d {

    /* renamed from: a */
    public static final C9442d0 f18647a = new C9442d0("CLOSED");

    /* renamed from: b */
    public static final AbstractC9443e m17306b(AbstractC9443e abstractC9443e) {
        while (true) {
            Object objM17315g = abstractC9443e.m17315g();
            if (objM17315g == f18647a) {
                return abstractC9443e;
            }
            AbstractC9443e abstractC9443e2 = (AbstractC9443e) objM17315g;
            if (abstractC9443e2 != null) {
                abstractC9443e = abstractC9443e2;
            } else if (abstractC9443e.m17318m()) {
                return abstractC9443e;
            }
        }
    }

    /* renamed from: c */
    public static final Object m17307c(AbstractC9436a0 abstractC9436a0, long j10, InterfaceC10574p interfaceC10574p) {
        while (true) {
            if (abstractC9436a0.f18641c >= j10 && !abstractC9436a0.mo17293k()) {
                return AbstractC9438b0.m17300a(abstractC9436a0);
            }
            Object objM17315g = abstractC9436a0.m17315g();
            if (objM17315g == f18647a) {
                return AbstractC9438b0.m17300a(f18647a);
            }
            AbstractC9436a0 abstractC9436a02 = (AbstractC9436a0) ((AbstractC9443e) objM17315g);
            if (abstractC9436a02 == null) {
                abstractC9436a02 = (AbstractC9436a0) interfaceC10574p.invoke(Long.valueOf(abstractC9436a0.f18641c + 1), abstractC9436a0);
                if (abstractC9436a0.m17320o(abstractC9436a02)) {
                    if (abstractC9436a0.mo17293k()) {
                        abstractC9436a0.m17319n();
                    }
                }
            }
            abstractC9436a0 = abstractC9436a02;
        }
    }
}

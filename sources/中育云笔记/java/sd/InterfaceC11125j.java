package sd;

import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import vc.InterfaceC11588c;

/* renamed from: sd.j */
/* loaded from: classes6.dex */
public interface InterfaceC11125j extends InterfaceC11588c {

    /* renamed from: sd.j$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ boolean m24737a(InterfaceC11125j interfaceC11125j, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC11125j.mo20530o(th);
        }
    }

    /* renamed from: C */
    void mo20501C(AbstractC11106e0 abstractC11106e0, Object obj);

    /* renamed from: D */
    void mo20502D(Object obj);

    /* renamed from: c */
    void mo20520c(Object obj, InterfaceC9540l interfaceC9540l);

    boolean isActive();

    /* renamed from: k */
    void mo20526k(Object obj, InterfaceC9545q interfaceC9545q);

    /* renamed from: o */
    boolean mo20530o(Throwable th);

    /* renamed from: r */
    Object mo20533r(Object obj, Object obj2, InterfaceC9545q interfaceC9545q);

    /* renamed from: u */
    void mo20536u(InterfaceC9540l interfaceC9540l);
}

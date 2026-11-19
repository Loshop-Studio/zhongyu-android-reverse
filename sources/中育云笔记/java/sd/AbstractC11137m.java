package sd;

import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.InterfaceC9996b;
import p410xd.C11848h;
import vc.InterfaceC11588c;

/* renamed from: sd.m */
/* loaded from: classes6.dex */
public abstract class AbstractC11137m {
    /* renamed from: a */
    public static final void m24756a(InterfaceC11125j interfaceC11125j, InterfaceC11163t0 interfaceC11163t0) {
        m24758c(interfaceC11125j, new C11166u0(interfaceC11163t0));
    }

    /* renamed from: b */
    public static final C9997c m24757b(InterfaceC11588c interfaceC11588c) {
        if (!(interfaceC11588c instanceof C11848h)) {
            return new C9997c(interfaceC11588c, 1);
        }
        C9997c c9997cM26270j = ((C11848h) interfaceC11588c).m26270j();
        if (c9997cM26270j != null) {
            if (!c9997cM26270j.m20512P()) {
                c9997cM26270j = null;
            }
            if (c9997cM26270j != null) {
                return c9997cM26270j;
            }
        }
        return new C9997c(interfaceC11588c, 2);
    }

    /* renamed from: c */
    public static final void m24758c(InterfaceC11125j interfaceC11125j, InterfaceC9996b interfaceC9996b) {
        if (!(interfaceC11125j instanceof C9997c)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C9997c) interfaceC11125j).m20506I(interfaceC9996b);
    }
}

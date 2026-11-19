package p135i8;

import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.InterfaceC9154b;
import p179m7.InterfaceC9324c;
import p191n8.C9453j;

/* renamed from: i8.l */
/* loaded from: classes5.dex */
public abstract class AbstractC8851l {
    /* renamed from: a */
    public static final void m14878a(InterfaceC8845j interfaceC8845j, InterfaceC8849k0 interfaceC8849k0) {
        m14880c(interfaceC8845j, new C8852l0(interfaceC8849k0));
    }

    /* renamed from: b */
    public static final C9155c m14879b(InterfaceC9324c interfaceC9324c) {
        if (!(interfaceC9324c instanceof C9453j)) {
            return new C9155c(interfaceC9324c, 1);
        }
        C9155c c9155cM17344k = ((C9453j) interfaceC9324c).m17344k();
        if (c9155cM17344k != null) {
            if (!c9155cM17344k.m16352N()) {
                c9155cM17344k = null;
            }
            if (c9155cM17344k != null) {
                return c9155cM17344k;
            }
        }
        return new C9155c(interfaceC9324c, 2);
    }

    /* renamed from: c */
    public static final void m14880c(InterfaceC8845j interfaceC8845j, InterfaceC9154b interfaceC9154b) {
        if (!(interfaceC8845j instanceof C9155c)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C9155c) interfaceC8845j).m16346G(interfaceC9154b);
    }
}

package kotlinx.coroutines.channels;

import p179m7.InterfaceC9324c;
import p191n8.AbstractC9440c0;
import p224q8.InterfaceC9851g;
import p300x7.InterfaceC10570l;

/* renamed from: kotlinx.coroutines.channels.f */
/* loaded from: classes5.dex */
public interface InterfaceC9163f {

    /* renamed from: kotlinx.coroutines.channels.f$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ boolean m16549a(InterfaceC9163f interfaceC9163f, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC9163f.close(th);
        }

        /* renamed from: b */
        public static boolean m16550b(InterfaceC9163f interfaceC9163f, Object obj) throws Throwable {
            Object objMo27213trySendJP2dKIU = interfaceC9163f.mo27213trySendJP2dKIU(obj);
            if (C9160c.m16539j(objMo27213trySendJP2dKIU)) {
                return true;
            }
            Throwable thM16534e = C9160c.m16534e(objMo27213trySendJP2dKIU);
            if (thM16534e == null) {
                return false;
            }
            throw AbstractC9440c0.m17304a(thM16534e);
        }
    }

    boolean close(Throwable th);

    InterfaceC9851g getOnSend();

    void invokeOnClose(InterfaceC10570l interfaceC10570l);

    boolean isClosedForSend();

    boolean offer(Object obj);

    Object send(Object obj, InterfaceC9324c interfaceC9324c);

    /* renamed from: trySend-JP2dKIU */
    Object mo27213trySendJP2dKIU(Object obj);
}

package kotlinx.coroutines.channels;

import ae.InterfaceC0112h;
import p181hd.InterfaceC9540l;
import p410xd.AbstractC11837b0;
import vc.InterfaceC11588c;

/* renamed from: kotlinx.coroutines.channels.f */
/* loaded from: classes6.dex */
public interface InterfaceC10005f {

    /* renamed from: kotlinx.coroutines.channels.f$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ boolean m20742a(InterfaceC10005f interfaceC10005f, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC10005f.close(th);
        }

        /* renamed from: b */
        public static boolean m20743b(InterfaceC10005f interfaceC10005f, Object obj) throws Throwable {
            Object objMo33808trySendJP2dKIU = interfaceC10005f.mo33808trySendJP2dKIU(obj);
            if (C10002c.m20732j(objMo33808trySendJP2dKIU)) {
                return true;
            }
            Throwable thM20727e = C10002c.m20727e(objMo33808trySendJP2dKIU);
            if (thM20727e == null) {
                return false;
            }
            throw AbstractC11837b0.m26232a(thM20727e);
        }
    }

    boolean close(Throwable th);

    InterfaceC0112h getOnSend();

    void invokeOnClose(InterfaceC9540l interfaceC9540l);

    boolean isClosedForSend();

    boolean offer(Object obj);

    Object send(Object obj, InterfaceC11588c interfaceC11588c);

    /* renamed from: trySend-JP2dKIU */
    Object mo33808trySendJP2dKIU(Object obj);
}

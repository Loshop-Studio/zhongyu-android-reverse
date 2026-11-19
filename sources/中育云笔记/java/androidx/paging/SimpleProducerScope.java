package androidx.paging;

import ae.InterfaceC0112h;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public interface SimpleProducerScope<T> extends InterfaceC11122i0, InterfaceC10005f {

    public static final class DefaultImpls {
        @InterfaceC10770a
        public static <T> boolean offer(SimpleProducerScope<T> simpleProducerScope, T t10) {
            return InterfaceC10005f.a.m20743b(simpleProducerScope, t10);
        }
    }

    Object awaitClose(InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C10786q> interfaceC11588c);

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    /* synthetic */ boolean close(Throwable th);

    InterfaceC10005f getChannel();

    @Override // sd.InterfaceC11122i0
    /* synthetic */ InterfaceC9945d getCoroutineContext();

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    /* synthetic */ InterfaceC0112h getOnSend();

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    /* synthetic */ void invokeOnClose(InterfaceC9540l interfaceC9540l);

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    /* synthetic */ boolean isClosedForSend();

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    @InterfaceC10770a
    /* synthetic */ boolean offer(Object obj);

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    /* synthetic */ Object send(Object obj, InterfaceC11588c interfaceC11588c);

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    /* synthetic */ Object mo33808trySendJP2dKIU(Object obj);
}

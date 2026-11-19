package androidx.paging;

import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p224q8.InterfaceC9851g;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public interface SimpleProducerScope<T> extends InterfaceC8822b0, InterfaceC9163f {

    public static final class DefaultImpls {
        @InterfaceC8721a
        public static <T> boolean offer(SimpleProducerScope<T> simpleProducerScope, T t10) {
            return InterfaceC9163f.a.m16550b(simpleProducerScope, t10);
        }
    }

    Object awaitClose(InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    /* synthetic */ boolean close(Throwable th);

    InterfaceC9163f getChannel();

    @Override // p135i8.InterfaceC8822b0
    /* synthetic */ InterfaceC9100d getCoroutineContext();

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    /* synthetic */ InterfaceC9851g getOnSend();

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    /* synthetic */ void invokeOnClose(InterfaceC10570l interfaceC10570l);

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    /* synthetic */ boolean isClosedForSend();

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    @InterfaceC8721a
    /* synthetic */ boolean offer(Object obj);

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    /* synthetic */ Object send(Object obj, InterfaceC9324c interfaceC9324c);

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    /* synthetic */ Object mo27213trySendJP2dKIU(Object obj);
}

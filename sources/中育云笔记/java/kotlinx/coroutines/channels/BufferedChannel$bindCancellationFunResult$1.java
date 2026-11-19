package kotlinx.coroutines.channels;

import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public /* synthetic */ class BufferedChannel$bindCancellationFunResult$1 extends FunctionReferenceImpl implements InterfaceC9545q {
    public BufferedChannel$bindCancellationFunResult$1(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    /* renamed from: g */
    public final void m20676g(Throwable th, Object obj, InterfaceC9945d interfaceC9945d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((BufferedChannel) this.receiver).m20589D0(th, obj, interfaceC9945d);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m20676g((Throwable) obj, ((C10002c) obj2).m20734l(), (InterfaceC9945d) obj3);
        return C10786q.f26013a;
    }
}

package kotlinx.coroutines.channels;

import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public /* synthetic */ class BufferedChannel$bindCancellationFun$2 extends FunctionReferenceImpl implements InterfaceC9545q {
    public BufferedChannel$bindCancellationFun$2(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    /* renamed from: g */
    public final void m20675g(Throwable th, Object obj, InterfaceC9945d interfaceC9945d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((BufferedChannel) this.receiver).m20590E0(th, obj, interfaceC9945d);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m20675g((Throwable) obj, obj2, (InterfaceC9945d) obj3);
        return C10786q.f26013a;
    }
}

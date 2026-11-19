package kotlinx.coroutines.channels;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p224q8.InterfaceC9854j;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public /* synthetic */ class BufferedChannel$onSend$1 extends FunctionReferenceImpl implements InterfaceC10575q {

    /* renamed from: a */
    public static final BufferedChannel$onSend$1 f17625a = new BufferedChannel$onSend$1();

    public BufferedChannel$onSend$1() {
        super(3, BufferedChannel.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: d */
    public final void m16487d(BufferedChannel bufferedChannel, InterfaceC9854j interfaceC9854j, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bufferedChannel.mo16421H0(interfaceC9854j, obj);
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m16487d((BufferedChannel) obj, (InterfaceC9854j) obj2, obj3);
        return C8736p.f16368a;
    }
}

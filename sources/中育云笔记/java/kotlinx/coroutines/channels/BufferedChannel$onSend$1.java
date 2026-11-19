package kotlinx.coroutines.channels;

import ae.InterfaceC0115k;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public /* synthetic */ class BufferedChannel$onSend$1 extends FunctionReferenceImpl implements InterfaceC9545q {

    /* renamed from: c */
    public static final BufferedChannel$onSend$1 f23543c = new BufferedChannel$onSend$1();

    public BufferedChannel$onSend$1() {
        super(3, BufferedChannel.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: g */
    public final void m20681g(BufferedChannel bufferedChannel, InterfaceC0115k interfaceC0115k, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bufferedChannel.mo20625a1(interfaceC0115k, obj);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m20681g((BufferedChannel) obj, (InterfaceC0115k) obj2, obj3);
        return C10786q.f26013a;
    }
}

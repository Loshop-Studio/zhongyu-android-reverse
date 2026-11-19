package kotlinx.coroutines.channels;

import ae.InterfaceC0115k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public /* synthetic */ class BufferedChannel$onReceiveCatching$1 extends FunctionReferenceImpl implements InterfaceC9545q {

    /* renamed from: c */
    public static final BufferedChannel$onReceiveCatching$1 f23541c = new BufferedChannel$onReceiveCatching$1();

    public BufferedChannel$onReceiveCatching$1() {
        super(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: g */
    public final void m20679g(BufferedChannel bufferedChannel, InterfaceC0115k interfaceC0115k, Object obj) {
        bufferedChannel.m20624Z0(interfaceC0115k, obj);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m20679g((BufferedChannel) obj, (InterfaceC0115k) obj2, obj3);
        return C10786q.f26013a;
    }
}

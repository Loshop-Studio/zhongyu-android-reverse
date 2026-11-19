package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p224q8.InterfaceC9854j;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public /* synthetic */ class BufferedChannel$onReceiveCatching$1 extends FunctionReferenceImpl implements InterfaceC10575q {

    /* renamed from: a */
    public static final BufferedChannel$onReceiveCatching$1 f17623a = new BufferedChannel$onReceiveCatching$1();

    public BufferedChannel$onReceiveCatching$1() {
        super(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: d */
    public final void m16485d(BufferedChannel bufferedChannel, InterfaceC9854j interfaceC9854j, Object obj) {
        bufferedChannel.m16419G0(interfaceC9854j, obj);
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m16485d((BufferedChannel) obj, (InterfaceC9854j) obj2, obj3);
        return C8736p.f16368a;
    }
}

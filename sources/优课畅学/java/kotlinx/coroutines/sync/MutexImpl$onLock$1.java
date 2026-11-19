package kotlinx.coroutines.sync;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p224q8.InterfaceC9854j;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements InterfaceC10575q {

    /* renamed from: a */
    public static final MutexImpl$onLock$1 f18178a = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: d */
    public final void m16884d(MutexImpl mutexImpl, InterfaceC9854j interfaceC9854j, Object obj) {
        mutexImpl.m16879y(interfaceC9854j, obj);
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m16884d((MutexImpl) obj, (InterfaceC9854j) obj2, obj3);
        return C8736p.f16368a;
    }
}

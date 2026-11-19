package kotlinx.coroutines.sync;

import ae.InterfaceC0115k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements InterfaceC9545q {

    /* renamed from: c */
    public static final MutexImpl$onLock$1 f24047c = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: g */
    public final void m21017g(MutexImpl mutexImpl, InterfaceC0115k interfaceC0115k, Object obj) {
        mutexImpl.m21005B(interfaceC0115k, obj);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m21017g((MutexImpl) obj, (InterfaceC0115k) obj2, obj3);
        return C10786q.f26013a;
    }
}

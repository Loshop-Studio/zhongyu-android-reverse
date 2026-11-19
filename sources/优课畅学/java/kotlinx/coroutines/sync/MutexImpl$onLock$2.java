package kotlinx.coroutines.sync;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements InterfaceC10575q {

    /* renamed from: a */
    public static final MutexImpl$onLock$2 f18179a = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, MutexImpl.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p300x7.InterfaceC10575q
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object invoke(MutexImpl mutexImpl, Object obj, Object obj2) {
        return mutexImpl.m16878x(obj, obj2);
    }
}

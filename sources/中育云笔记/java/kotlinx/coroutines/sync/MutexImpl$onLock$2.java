package kotlinx.coroutines.sync;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9545q;

/* loaded from: classes6.dex */
public /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements InterfaceC9545q {

    /* renamed from: c */
    public static final MutexImpl$onLock$2 f24048c = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, MutexImpl.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p181hd.InterfaceC9545q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(MutexImpl mutexImpl, Object obj, Object obj2) {
        return mutexImpl.m21004A(obj, obj2);
    }
}

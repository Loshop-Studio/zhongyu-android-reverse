package androidx.concurrent.futures;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p135i8.InterfaceC8831e0;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public /* synthetic */ class SuspendToFutureAdapter$launchFuture$1$1 extends FunctionReferenceImpl implements InterfaceC10570l {
    public SuspendToFutureAdapter$launchFuture$1$1(Object obj) {
        super(1, obj, InterfaceC8831e0.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c<? super T> interfaceC9324c) {
        return ((InterfaceC8831e0) this.receiver).mo14833u(interfaceC9324c);
    }
}

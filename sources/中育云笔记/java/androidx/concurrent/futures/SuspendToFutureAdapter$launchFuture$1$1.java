package androidx.concurrent.futures;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;
import sd.InterfaceC11138m0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public /* synthetic */ class SuspendToFutureAdapter$launchFuture$1$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public SuspendToFutureAdapter$launchFuture$1$1(Object obj) {
        super(1, obj, InterfaceC11138m0.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c<? super T> interfaceC11588c) {
        return ((InterfaceC11138m0) this.receiver).mo24760z(interfaceC11588c);
    }
}

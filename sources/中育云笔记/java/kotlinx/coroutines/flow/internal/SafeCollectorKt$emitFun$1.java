package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9545q;
import p379vd.InterfaceC11595d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements InterfaceC9545q {

    /* renamed from: c */
    public static final SafeCollectorKt$emitFun$1 f23969c = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, InterfaceC11595d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p181hd.InterfaceC9545q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(InterfaceC11595d interfaceC11595d, Object obj, InterfaceC11588c interfaceC11588c) {
        return interfaceC11595d.emit(obj, interfaceC11588c);
    }
}

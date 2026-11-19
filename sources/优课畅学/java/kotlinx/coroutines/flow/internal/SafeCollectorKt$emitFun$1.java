package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements InterfaceC10575q {

    /* renamed from: a */
    public static final SafeCollectorKt$emitFun$1 f18058a = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, InterfaceC9267d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // p300x7.InterfaceC10575q
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object invoke(InterfaceC9267d interfaceC9267d, Object obj, InterfaceC9324c interfaceC9324c) {
        return interfaceC9267d.emit(obj, interfaceC9324c);
    }
}

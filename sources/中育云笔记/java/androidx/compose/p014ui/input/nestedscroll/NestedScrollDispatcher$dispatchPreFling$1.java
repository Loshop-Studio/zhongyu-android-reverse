package androidx.compose.p014ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m26211f = "NestedScrollModifier.kt", m26212l = {200}, m26213m = "dispatchPreFling-QWom1Mo")
/* loaded from: classes2.dex */
public final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, InterfaceC11588c<? super NestedScrollDispatcher$dispatchPreFling$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m31979dispatchPreFlingQWom1Mo(0L, this);
    }
}

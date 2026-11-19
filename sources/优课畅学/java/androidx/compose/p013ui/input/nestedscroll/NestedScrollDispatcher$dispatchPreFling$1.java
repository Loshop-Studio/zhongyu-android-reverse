package androidx.compose.p013ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m17801f = "NestedScrollModifier.kt", m17802l = {200}, m17803m = "dispatchPreFling-QWom1Mo")
/* loaded from: classes2.dex */
public final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, InterfaceC9324c<? super NestedScrollDispatcher$dispatchPreFling$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m25377dispatchPreFlingQWom1Mo(0L, this);
    }
}

package androidx.compose.material3.pulltorefresh;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m26211f = "PullToRefresh.kt", m26212l = {327}, m26213m = "onPreFling-QWom1Mo")
/* loaded from: classes2.dex */
public final class PullToRefreshModifierNode$onPreFling$1 extends ContinuationImpl {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullToRefreshModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onPreFling$1(PullToRefreshModifierNode pullToRefreshModifierNode, InterfaceC11588c<? super PullToRefreshModifierNode$onPreFling$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo27535onPreFlingQWom1Mo(0L, this);
    }
}

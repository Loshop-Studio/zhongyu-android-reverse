package androidx.compose.material3.pulltorefresh;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", m17801f = "PullToRefresh.kt", m17802l = {TbsListener.ErrorCode.TEST_THROWABLE_ISNOT_NULL}, m17803m = "onPreFling-QWom1Mo")
/* loaded from: classes2.dex */
public final class PullToRefreshModifierNode$onPreFling$1 extends ContinuationImpl {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullToRefreshModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onPreFling$1(PullToRefreshModifierNode pullToRefreshModifierNode, InterfaceC9324c<? super PullToRefreshModifierNode$onPreFling$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = pullToRefreshModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo20933onPreFlingQWom1Mo(0L, this);
    }
}

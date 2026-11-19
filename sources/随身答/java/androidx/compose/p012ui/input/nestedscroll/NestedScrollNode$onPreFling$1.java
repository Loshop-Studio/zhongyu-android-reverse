package androidx.compose.p012ui.input.nestedscroll;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.p071uc.crashsdk.export.ExitType;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m13451f = "NestedScrollNode.kt", m13452i = {0, 0, 1}, m13453l = {96, ExitType.UNEXP_FOREGROUND_CRASH}, m13454m = "onPreFling-QWom1Mo", m13455n = {"this", "available", "parentPreConsumed"}, m13456s = {"L$0", "J$0", "J$0"})
/* loaded from: classes2.dex */
public final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, Continuation<? super NestedScrollNode$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo18191onPreFlingQWom1Mo(0L, this);
    }
}

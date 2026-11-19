package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.SingleRunner;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.SingleRunner$Holder", m13451f = "SingleRunner.kt", m13452i = {0, 0, 0}, m13453l = {PatchStatus.CODE_LOAD_LIB_UNDEFINED}, m13454m = "onFinish", m13455n = {"this", "job", "$this$withLock_u24default$iv"}, m13456s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class SingleRunner$Holder$onFinish$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleRunner.Holder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$onFinish$1(SingleRunner.Holder holder, Continuation<? super SingleRunner$Holder$onFinish$1> continuation) {
        super(continuation);
        this.this$0 = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onFinish(null, this);
    }
}

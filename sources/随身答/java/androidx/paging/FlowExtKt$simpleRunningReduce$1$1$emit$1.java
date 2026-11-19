package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.FlowExtKt;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", m13451f = "FlowExt.kt", m13452i = {0}, m13453l = {PatchStatus.CODE_LOAD_MFITEM, PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m13454m = "emit", m13455n = {"this"}, m13456s = {"L$0"})
/* loaded from: classes3.dex */
public final class FlowExtKt$simpleRunningReduce$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtKt.C43641.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleRunningReduce$1$1$emit$1(FlowExtKt.C43641.AnonymousClass1<? super T> anonymousClass1, Continuation<? super FlowExtKt$simpleRunningReduce$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}

package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.CachedPageEventFlow$job$1;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.CachedPageEventFlow$job$1$1", m13451f = "CachedPageEventFlow.kt", m13452i = {0, 0}, m13453l = {PatchStatus.CODE_LOAD_NOT_ZIP_FORMAT, PatchStatus.CODE_LOAD_JIT_CLEAR}, m13454m = "emit", m13455n = {"this", "it"}, m13456s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$job$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachedPageEventFlow$job$1.C43481<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CachedPageEventFlow$job$1$1$emit$1(CachedPageEventFlow$job$1.C43481<? super T> c43481, Continuation<? super CachedPageEventFlow$job$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c43481;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((IndexedValue) null, (Continuation<? super Unit>) this);
    }
}

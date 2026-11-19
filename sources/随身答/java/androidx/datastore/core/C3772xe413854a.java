package androidx.datastore.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.core.MultiProcessCoordinator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.datastore.core.MultiProcessCoordinator$Companion", m13451f = "MultiProcessCoordinator.android.kt", m13452i = {0, 0}, m13453l = {182}, m13454m = "getExclusiveFileLockWithRetryIfDeadlock", m13455n = {"lockFileStream", "backoff"}, m13456s = {"L$0", "J$0"})
/* renamed from: androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 */
/* loaded from: classes2.dex */
public final class C3772xe413854a extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiProcessCoordinator.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3772xe413854a(MultiProcessCoordinator.Companion companion, Continuation<? super C3772xe413854a> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}

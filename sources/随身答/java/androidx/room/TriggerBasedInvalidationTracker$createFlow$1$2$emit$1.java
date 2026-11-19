package androidx.room;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.room.TriggerBasedInvalidationTracker$createFlow$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", m13451f = "InvalidationTracker.kt", m13452i = {0, 0, 1, 1}, m13453l = {241, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m13454m = "emit", m13455n = {"this", "newVersions", "this", "newVersions"}, m13456s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker$createFlow$1.C45972<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(TriggerBasedInvalidationTracker$createFlow$1.C45972<? super T> c45972, Continuation<? super TriggerBasedInvalidationTracker$createFlow$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c45972;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((int[]) null, (Continuation<? super Unit>) this);
    }
}

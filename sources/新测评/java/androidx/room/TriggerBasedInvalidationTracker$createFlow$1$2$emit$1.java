package androidx.room;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.room.TriggerBasedInvalidationTracker$createFlow$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", m13596f = "InvalidationTracker.kt", m13597i = {0, 0, 1, 1}, m13598l = {241, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m13599m = "emit", m13600n = {"this", "newVersions", "this", "newVersions"}, m13601s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker$createFlow$1.C44502<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(TriggerBasedInvalidationTracker$createFlow$1.C44502<? super T> c44502, Continuation<? super TriggerBasedInvalidationTracker$createFlow$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c44502;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((int[]) null, (Continuation<? super Unit>) this);
    }
}

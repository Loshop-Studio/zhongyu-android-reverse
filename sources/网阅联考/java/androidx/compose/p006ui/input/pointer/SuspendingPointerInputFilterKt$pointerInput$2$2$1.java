package androidx.compose.p006ui.input.pointer;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5191c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1", m5192f = "SuspendingPointerInputFilter.kt", m5193i = {}, m5194l = {244}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt$pointerInput$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputScope, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ SuspendingPointerInputFilter $filter;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendingPointerInputFilterKt$pointerInput$2$2$1(SuspendingPointerInputFilter suspendingPointerInputFilter, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super SuspendingPointerInputFilterKt$pointerInput$2$2$1> continuation) {
        super(2, continuation);
        this.$filter = suspendingPointerInputFilter;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuspendingPointerInputFilterKt$pointerInput$2$2$1 suspendingPointerInputFilterKt$pointerInput$2$2$1 = new SuspendingPointerInputFilterKt$pointerInput$2$2$1(this.$filter, this.$block, continuation);
        suspendingPointerInputFilterKt$pointerInput$2$2$1.L$0 = obj;
        return suspendingPointerInputFilterKt$pointerInput$2$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            this.$filter.setCoroutineScope((CoroutineScope) this.L$0);
            Function2<PointerInputScope, Continuation<? super Unit>, Object> function2 = this.$block;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.$filter;
            this.label = 1;
            if (function2.invoke(suspendingPointerInputFilter, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SuspendingPointerInputFilterKt$pointerInput$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

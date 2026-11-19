package androidx.compose.foundation.gestures;

import androidx.compose.p006ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(m5174d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m5175d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
@DebugMetadata(m5191c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", m5192f = "TapGestureDetector.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
    int label;

    public TapGestureDetectorKt$NoPressGesture$1(Continuation<? super TapGestureDetectorKt$NoPressGesture$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
        return m7230invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m7230invoked4ec7I(PressGestureScope pressGestureScope, long j4, Continuation<? super Unit> continuation) {
        return new TapGestureDetectorKt$NoPressGesture$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}

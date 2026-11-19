package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m5174d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
@DebugMetadata(m5191c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", m5192f = "ActualAndroid.android.kt", m5193i = {}, m5194l = {}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
/* loaded from: classes.dex */
public final class DefaultChoreographerFrameClock$choreographer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Choreographer>, Object> {
    int label;

    public DefaultChoreographerFrameClock$choreographer$1(Continuation<? super DefaultChoreographerFrameClock$choreographer$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultChoreographerFrameClock$choreographer$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Choreographer.getInstance();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Choreographer> continuation) {
        return ((DefaultChoreographerFrameClock$choreographer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

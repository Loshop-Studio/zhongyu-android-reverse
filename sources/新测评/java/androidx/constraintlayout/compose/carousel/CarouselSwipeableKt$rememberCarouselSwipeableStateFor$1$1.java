package androidx.constraintlayout.compose.carousel;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1", m13596f = "CarouselSwipeable.kt", m13597i = {}, m13598l = {493}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CarouselSwipeableState<T> $swipeableState;
    final /* synthetic */ T $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1(T t10, CarouselSwipeableState<T> carouselSwipeableState, Continuation<? super CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1> continuation) {
        super(2, continuation);
        this.$value = t10;
        this.$swipeableState = carouselSwipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1(this.$value, this.$swipeableState, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(this.$value, this.$swipeableState.getCurrentValue())) {
                CarouselSwipeableState<T> carouselSwipeableState = this.$swipeableState;
                T t10 = this.$value;
                this.label = 1;
                if (CarouselSwipeableState.animateTo$default(carouselSwipeableState, t10, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CarouselSwipeableKt$rememberCarouselSwipeableStateFor$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$2$1", m13451f = "MotionCarousel.kt", m13452i = {}, m13453l = {209}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes2.dex */
public final class MotionCarouselKt$MotionCarousel$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<CarouselState> $state$delegate;
    final /* synthetic */ String $swipeStateStart;
    final /* synthetic */ CarouselSwipeableState<String> $swipeableState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionCarouselKt$MotionCarousel$2$1(CarouselSwipeableState<String> carouselSwipeableState, String str, MutableState<CarouselState> mutableState, Continuation<? super MotionCarouselKt$MotionCarousel$2$1> continuation) {
        super(2, continuation);
        this.$swipeableState = carouselSwipeableState;
        this.$swipeStateStart = str;
        this.$state$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MotionCarouselKt$MotionCarousel$2$1(this.$swipeableState, this.$swipeStateStart, this.$state$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            if (MotionCarouselKt.MotionCarousel$lambda$4(this.$state$delegate).getIndex() > 0) {
                MotionCarouselKt.MotionCarousel$lambda$4(this.$state$delegate).setIndex(r4.getIndex() - 1);
            }
            CarouselSwipeableState<String> carouselSwipeableState = this.$swipeableState;
            String str = this.$swipeStateStart;
            this.label = 1;
            if (carouselSwipeableState.snapTo(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MotionCarouselKt.MotionCarousel$lambda$4(this.$state$delegate).setDirection(MotionCarouselDirection.FORWARD);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MotionCarouselKt$MotionCarousel$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

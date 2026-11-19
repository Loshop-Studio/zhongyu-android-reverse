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
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1", m13596f = "CarouselSwipeable.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class CarouselSwipeableKt$carouselSwipeable$3$4$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    final /* synthetic */ CarouselSwipeableState<T> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1$1", m13596f = "CarouselSwipeable.kt", m13597i = {}, m13598l = {593}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1$1 */
    public static final class C32171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CarouselSwipeableState<T> $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32171(CarouselSwipeableState<T> carouselSwipeableState, float f10, Continuation<? super C32171> continuation) {
            super(2, continuation);
            this.$state = carouselSwipeableState;
            this.$velocity = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32171(this.$state, this.$velocity, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CarouselSwipeableState<T> carouselSwipeableState = this.$state;
                float f10 = this.$velocity;
                this.label = 1;
                if (carouselSwipeableState.performFling(f10, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
            return ((C32171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableKt$carouselSwipeable$3$4$1(CarouselSwipeableState<T> carouselSwipeableState, Continuation<? super CarouselSwipeableKt$carouselSwipeable$3$4$1> continuation) {
        super(3, continuation);
        this.$state = carouselSwipeableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f10, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, f10.floatValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C32171(this.$state, this.F$0, null), 3, null);
        return Unit.INSTANCE;
    }

    public final Object invoke(CoroutineScope coroutineScope, float f10, Continuation<? super Unit> continuation) {
        CarouselSwipeableKt$carouselSwipeable$3$4$1 carouselSwipeableKt$carouselSwipeable$3$4$1 = new CarouselSwipeableKt$carouselSwipeable$3$4$1(this.$state, continuation);
        carouselSwipeableKt$carouselSwipeable$3$4$1.L$0 = coroutineScope;
        carouselSwipeableKt$carouselSwipeable$3$4$1.F$0 = f10;
        return carouselSwipeableKt$carouselSwipeable$3$4$1.invokeSuspend(Unit.INSTANCE);
    }
}

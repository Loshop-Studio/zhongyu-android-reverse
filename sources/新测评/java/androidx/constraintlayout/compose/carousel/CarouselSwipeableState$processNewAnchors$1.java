package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState", m13596f = "CarouselSwipeable.kt", m13597i = {1, 1, 1, 2, 2, 2}, m13598l = {146, 171, 174}, m13599m = "processNewAnchors$constraintlayout_compose_release", m13600n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, m13601s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableState$processNewAnchors$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselSwipeableState$processNewAnchors$1(CarouselSwipeableState<T> carouselSwipeableState, Continuation<? super CarouselSwipeableState$processNewAnchors$1> continuation) {
        super(continuation);
        this.this$0 = carouselSwipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processNewAnchors$constraintlayout_compose_release(null, null, this);
    }
}

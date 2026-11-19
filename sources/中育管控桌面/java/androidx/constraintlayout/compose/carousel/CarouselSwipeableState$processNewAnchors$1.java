package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState", m7918f = "CarouselSwipeable.kt", m7919i = {1, 1, 1, 2, 2, 2}, m7920l = {146, 171, 174}, m7921m = "processNewAnchors$constraintlayout_compose_release", m7922n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, m7923s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
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

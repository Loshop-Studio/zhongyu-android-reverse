package androidx.constraintlayout.compose.carousel;

import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2", m13596f = "CarouselSwipeable.kt", m13597i = {0, 0}, m13598l = {315}, m13599m = "emit", m13600n = {"this", "anchors"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableState$animateTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableState.C32232<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CarouselSwipeableState$animateTo$2$emit$1(CarouselSwipeableState.C32232<? super T> c32232, Continuation<? super CarouselSwipeableState$animateTo$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c32232;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (Continuation<? super Unit>) this);
    }
}

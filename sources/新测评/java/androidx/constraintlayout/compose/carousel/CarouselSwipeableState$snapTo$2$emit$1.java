package androidx.constraintlayout.compose.carousel;

import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2", m13596f = "CarouselSwipeable.kt", m13597i = {0}, m13598l = {299}, m13599m = "emit", m13600n = {"this"}, m13601s = {"L$0"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableState.C32262<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CarouselSwipeableState$snapTo$2$emit$1(CarouselSwipeableState.C32262<? super T> c32262, Continuation<? super CarouselSwipeableState$snapTo$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c32262;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (Continuation<? super Unit>) this);
    }
}

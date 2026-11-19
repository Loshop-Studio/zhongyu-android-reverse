package androidx.constraintlayout.compose.carousel;

import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2", m13451f = "CarouselSwipeable.kt", m13452i = {0}, m13453l = {299}, m13454m = "emit", m13455n = {"this"}, m13456s = {"L$0"})
/* loaded from: classes2.dex */
public final class CarouselSwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableState.C32142<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CarouselSwipeableState$snapTo$2$emit$1(CarouselSwipeableState.C32142<? super T> c32142, Continuation<? super CarouselSwipeableState$snapTo$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c32142;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (Continuation<? super Unit>) this);
    }
}

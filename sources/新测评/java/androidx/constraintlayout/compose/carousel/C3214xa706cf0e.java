package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1", m13596f = "CarouselSwipeable.kt", m13597i = {0}, m13598l = {842}, m13599m = "onPostFling-RZ2iAVY", m13600n = {"available"}, m13601s = {"J$0"})
/* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 */
/* loaded from: classes2.dex */
public final class C3214xa706cf0e extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3214xa706cf0e(CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1, Continuation<? super C3214xa706cf0e> continuation) {
        super(continuation);
        this.this$0 = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo17452onPostFlingRZ2iAVY(0L, 0L, this);
    }
}

package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m26211f = "DragGestureDetector.kt", m26212l = {1061, 1104}, m26213m = "awaitHorizontalTouchSlopOrCancellation-jO51t88")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(InterfaceC11588c<? super DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1> interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m27145awaitHorizontalTouchSlopOrCancellationjO51t88(null, 0L, null, this);
    }
}

package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m26211f = "DragGestureDetector.kt", m26212l = {111}, m26213m = "drag-jO51t88")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$drag$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$drag$1(InterfaceC11588c<? super DragGestureDetectorKt$drag$1> interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m27156dragjO51t88(null, 0L, null, this);
    }
}

package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m13596f = "MouseWheelScrollable.kt", m13597i = {0, 0, 0, 0, 0}, m13598l = {227}, m13599m = "dispatchMouseWheelScroll$waitNextScrollDelta", m13600n = {"this$0", "targetScrollDelta", "targetValue", "$this_dispatchMouseWheelScroll", "animationState"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 */
/* loaded from: classes.dex */
public final class C1265x7147264e extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public C1265x7147264e(Continuation<? super C1265x7147264e> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(null, null, null, null, null, 0L, this);
    }
}

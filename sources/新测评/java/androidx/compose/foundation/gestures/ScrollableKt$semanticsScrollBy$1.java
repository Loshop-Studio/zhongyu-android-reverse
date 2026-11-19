package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.gestures.ScrollableKt", m13596f = "Scrollable.kt", m13597i = {0, 0}, m13598l = {1023}, m13599m = "semanticsScrollBy-d-4ec7I", m13600n = {"$this$semanticsScrollBy_u2dd_u2d4ec7I", "previousValue"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class ScrollableKt$semanticsScrollBy$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ScrollableKt$semanticsScrollBy$1(Continuation<? super ScrollableKt$semanticsScrollBy$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollableKt.m17451semanticsScrollByd4ec7I(null, 0L, this);
    }
}

package androidx.compose.p013ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m13596f = "NestedScrollModifier.kt", m13597i = {}, m13598l = {223, 225}, m13599m = "dispatchPostFling-RZ2iAVY", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, Continuation<? super NestedScrollDispatcher$dispatchPostFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m22073dispatchPostFlingRZ2iAVY(0L, 0L, this);
    }
}

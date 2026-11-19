package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", m13596f = "WindowInsetsConnection.android.kt", m13597i = {0, 0, 0, 1, 1, 1, 2, 2}, m13598l = {301, 327, 352}, m13599m = "fling-huYlsQE", m13600n = {"this", "available", "flingAmount", "this", "endVelocity", "available", "this", "available"}, m13601s = {"L$0", "J$0", "F$0", "L$0", "L$1", "J$0", "L$0", "J$0"})
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation<? super WindowInsetsNestedScrollConnection$fling$1> continuation) {
        super(continuation);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m17756flinghuYlsQE(0L, 0.0f, false, this);
    }
}

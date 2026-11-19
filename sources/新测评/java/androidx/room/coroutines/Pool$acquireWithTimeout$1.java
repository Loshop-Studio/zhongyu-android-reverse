package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.room.coroutines.Pool", m13596f = "ConnectionPoolImpl.kt", m13597i = {0, 0, 0, 0}, m13598l = {209}, m13599m = "acquireWithTimeout-KLykuaI", m13600n = {"this", "onTimeout", "connection", "timeout"}, m13601s = {"L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes3.dex */
public final class Pool$acquireWithTimeout$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquireWithTimeout$1(Pool pool, Continuation<? super Pool$acquireWithTimeout$1> continuation) {
        super(continuation);
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m24074acquireWithTimeoutKLykuaI(0L, null, this);
    }
}

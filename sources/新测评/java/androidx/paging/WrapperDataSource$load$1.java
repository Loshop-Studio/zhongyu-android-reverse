package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.WrapperDataSource", m13596f = "WrapperDataSource.jvm.kt", m13597i = {0}, m13598l = {68}, m13599m = "load$suspendImpl", m13600n = {"$this"}, m13601s = {"L$0"})
/* loaded from: classes3.dex */
public final class WrapperDataSource$load$1<Key, ValueFrom, ValueTo> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WrapperDataSource<Key, ValueFrom, ValueTo> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource$load$1(WrapperDataSource<Key, ValueFrom, ValueTo> wrapperDataSource, Continuation<? super WrapperDataSource$load$1> continuation) {
        super(continuation);
        this.this$0 = wrapperDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WrapperDataSource.load$suspendImpl(this.this$0, null, this);
    }
}

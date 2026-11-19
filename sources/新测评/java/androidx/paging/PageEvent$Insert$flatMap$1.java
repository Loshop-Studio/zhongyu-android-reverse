package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.PageEvent$Insert", m13596f = "PageEvent.kt", m13597i = {0, 0, 0, 0, 0, 0, 0, 0}, m13598l = {140}, m13599m = "flatMap", m13600n = {"transform", "this_$iv$iv", "destination$iv$iv$iv", "it", "data", "originalIndices", "index$iv", "index"}, m13601s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "I$0", "I$1"})
/* loaded from: classes3.dex */
public final class PageEvent$Insert$flatMap$1<R> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageEvent.Insert<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$flatMap$1(PageEvent.Insert<T> insert, Continuation<? super PageEvent$Insert$flatMap$1> continuation) {
        super(continuation);
        this.this$0 = insert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flatMap(null, this);
    }
}

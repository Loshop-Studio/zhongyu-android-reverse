package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.PageEvent$StaticList", m13596f = "PageEvent.kt", m13597i = {0, 0, 0}, m13598l = {58}, m13599m = "flatMap", m13600n = {"this", "transform", "destination$iv$iv"}, m13601s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class PageEvent$StaticList$flatMap$1<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageEvent.StaticList<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$flatMap$1(PageEvent.StaticList<T> staticList, Continuation<? super PageEvent$StaticList$flatMap$1> continuation) {
        super(continuation);
        this.this$0 = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flatMap(null, this);
    }
}

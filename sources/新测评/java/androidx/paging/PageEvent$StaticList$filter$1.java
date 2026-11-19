package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.PageEvent$StaticList", m13596f = "PageEvent.kt", m13597i = {0, 0, 0, 0}, m13598l = {66}, m13599m = "filter", m13600n = {"this", "predicate", "destination$iv$iv", "element$iv$iv"}, m13601s = {"L$0", "L$1", "L$2", "L$4"})
/* loaded from: classes3.dex */
public final class PageEvent$StaticList$filter$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageEvent.StaticList<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$filter$1(PageEvent.StaticList<T> staticList, Continuation<? super PageEvent$StaticList$filter$1> continuation) {
        super(continuation);
        this.this$0 = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.filter(null, this);
    }
}

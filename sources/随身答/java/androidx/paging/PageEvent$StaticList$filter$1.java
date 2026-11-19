package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.PageEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.PageEvent$StaticList", m13451f = "PageEvent.kt", m13452i = {0, 0, 0, 0}, m13453l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m13454m = "filter", m13455n = {"this", "predicate", "destination$iv$iv", "element$iv$iv"}, m13456s = {"L$0", "L$1", "L$2", "L$4"})
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

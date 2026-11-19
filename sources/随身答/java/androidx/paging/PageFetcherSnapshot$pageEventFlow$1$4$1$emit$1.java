package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.PageFetcherSnapshot$pageEventFlow$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", m13451f = "PageFetcherSnapshot.kt", m13452i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 13, 14, 15, 15}, m13453l = {646, 658, 125, 669, 128, 680, 692, 125, 703, 128, 714, 726, 125, 737, 128, 748}, m13454m = "emit", m13455n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv"}, m13456s = {"L$0", "L$1", "L$3", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$0", "L$3", "L$4", "L$2", "L$3", "L$4", "L$2", "L$3", "L$2", "L$3", "L$4", "L$2", "L$2", "L$3"})
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.C43984.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(PageFetcherSnapshot$pageEventFlow$1.C43984.AnonymousClass1<? super T> anonymousClass1, Continuation<? super PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Unit) null, (Continuation<? super Unit>) this);
    }
}

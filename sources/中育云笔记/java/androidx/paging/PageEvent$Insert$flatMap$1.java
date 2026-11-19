package androidx.paging;

import androidx.paging.PageEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageEvent$Insert", m26211f = "PageEvent.kt", m26212l = {152}, m26213m = "flatMap", m26214v = 1)
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
    public PageEvent$Insert$flatMap$1(PageEvent.Insert<T> insert, InterfaceC11588c<? super PageEvent$Insert$flatMap$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = insert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flatMap(null, this);
    }
}

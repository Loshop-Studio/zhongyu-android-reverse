package androidx.paging;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.AsyncPagingDataDiffer$presenter$1", m26211f = "AsyncPagingDataDiffer.kt", m26212l = {Opcodes.INVOKESPECIAL}, m26213m = "presentPagingDataEvent", m26214v = 1)
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncPagingDataDiffer$presenter$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1(AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1, InterfaceC11588c<? super AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = asyncPagingDataDiffer$presenter$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.presentPagingDataEvent(null, this);
    }
}

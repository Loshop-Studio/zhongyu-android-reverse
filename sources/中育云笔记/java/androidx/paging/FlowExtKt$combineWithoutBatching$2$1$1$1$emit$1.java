package androidx.paging;

import androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1", m26211f = "FlowExt.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_JSON, PatchStatus.CODE_LOAD_LIB_INJECT}, m26213m = "emit", m26214v = 1)
/* loaded from: classes3.dex */
public final class FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtKt$combineWithoutBatching$2$1$1.C42241<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1(FlowExtKt$combineWithoutBatching$2$1$1.C42241<? super T> c42241, InterfaceC11588c<? super FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = c42241;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}

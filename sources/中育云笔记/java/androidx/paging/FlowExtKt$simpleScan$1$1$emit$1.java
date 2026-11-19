package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.FlowExtKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$simpleScan$1$1", m26211f = "FlowExt.kt", m26212l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF, 54}, m26213m = "emit", m26214v = 1)
/* loaded from: classes3.dex */
public final class FlowExtKt$simpleScan$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtKt.C42281.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleScan$1$1$emit$1(FlowExtKt.C42281.AnonymousClass1<? super T> anonymousClass1, InterfaceC11588c<? super FlowExtKt$simpleScan$1$1$emit$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}

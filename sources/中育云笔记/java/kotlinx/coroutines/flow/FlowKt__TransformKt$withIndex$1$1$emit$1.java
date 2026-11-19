package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", m26211f = "Transform.kt", m26212l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class FlowKt__TransformKt$withIndex$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23823c;

    /* renamed from: d */
    public final /* synthetic */ FlowKt__TransformKt$withIndex$1$1 f23824d;

    /* renamed from: e */
    public int f23825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$withIndex$1$1$emit$1(FlowKt__TransformKt$withIndex$1$1 flowKt__TransformKt$withIndex$1$1, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23824d = flowKt__TransformKt$withIndex$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23823c = obj;
        this.f23825e |= Integer.MIN_VALUE;
        return this.f23824d.emit(null, this);
    }
}

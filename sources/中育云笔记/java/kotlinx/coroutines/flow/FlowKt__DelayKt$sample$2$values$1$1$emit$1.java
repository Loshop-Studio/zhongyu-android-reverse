package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", m26211f = "Delay.kt", m26212l = {273}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$sample$2$values$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23669c;

    /* renamed from: d */
    public final /* synthetic */ FlowKt__DelayKt$sample$2$values$1.C100141 f23670d;

    /* renamed from: e */
    public int f23671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$values$1$1$emit$1(FlowKt__DelayKt$sample$2$values$1.C100141 c100141, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23670d = c100141;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23669c = obj;
        this.f23671e |= Integer.MIN_VALUE;
        return this.f23670d.emit(null, this);
    }
}

package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", m26211f = "Limit.kt", m26212l = {22}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$drop$2$1$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23735c;

    /* renamed from: d */
    public final /* synthetic */ FlowKt__LimitKt$drop$2$1 f23736d;

    /* renamed from: e */
    public int f23737e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$drop$2$1$emit$1(FlowKt__LimitKt$drop$2$1 flowKt__LimitKt$drop$2$1, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23736d = flowKt__LimitKt$drop$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23735c = obj;
        this.f23737e |= Integer.MIN_VALUE;
        return this.f23736d.emit(null, this);
    }
}

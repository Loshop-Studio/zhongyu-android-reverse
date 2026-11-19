package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m26211f = "Limit.kt", m26212l = {59, 61}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$take$2$1$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23753c;

    /* renamed from: d */
    public final /* synthetic */ FlowKt__LimitKt$take$2$1 f23754d;

    /* renamed from: e */
    public int f23755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$take$2$1$emit$1(FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23754d = flowKt__LimitKt$take$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23753c = obj;
        this.f23755e |= Integer.MIN_VALUE;
        return this.f23754d.emit(null, this);
    }
}

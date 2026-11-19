package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m26211f = "Builders.kt", m26212l = {330}, m26213m = "collectTo")
/* loaded from: classes6.dex */
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f23596c;

    /* renamed from: d */
    public /* synthetic */ Object f23597d;

    /* renamed from: e */
    public final /* synthetic */ CallbackFlowBuilder f23598e;

    /* renamed from: f */
    public int f23599f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder callbackFlowBuilder, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23598e = callbackFlowBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23597d = obj;
        this.f23599f |= Integer.MIN_VALUE;
        return this.f23598e.mo20757h(null, this);
    }
}

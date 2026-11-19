package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m26211f = "Share.kt", m26212l = {422, 426}, m26213m = "onSubscription")
/* loaded from: classes6.dex */
public final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f23886c;

    /* renamed from: d */
    public Object f23887d;

    /* renamed from: e */
    public /* synthetic */ Object f23888e;

    /* renamed from: f */
    public final /* synthetic */ SubscribedFlowCollector f23889f;

    /* renamed from: g */
    public int f23890g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(SubscribedFlowCollector subscribedFlowCollector, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23889f = subscribedFlowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23888e = obj;
        this.f23890g |= Integer.MIN_VALUE;
        return this.f23889f.m20874b(this);
    }
}

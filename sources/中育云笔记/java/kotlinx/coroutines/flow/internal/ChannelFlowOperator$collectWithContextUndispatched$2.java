package kotlinx.coroutines.flow.internal;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m26211f = "ChannelFlow.kt", m26212l = {Opcodes.LCMP}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23912c;

    /* renamed from: d */
    public /* synthetic */ Object f23913d;

    /* renamed from: e */
    public final /* synthetic */ ChannelFlowOperator f23914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator channelFlowOperator, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23914e = channelFlowOperator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.f23914e, interfaceC11588c);
        channelFlowOperator$collectWithContextUndispatched$2.f23913d = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23912c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.f23913d;
            ChannelFlowOperator channelFlowOperator = this.f23914e;
            this.f23912c = 1;
            if (channelFlowOperator.mo20888q(interfaceC11595d, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}

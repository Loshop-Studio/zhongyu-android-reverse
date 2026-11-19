package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.BufferOverflow;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11729d;
import p394wd.C11741p;
import sd.AbstractC11098c0;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class ChannelFlowOperator extends ChannelFlow {

    /* renamed from: f */
    public final InterfaceC11594c f23911f;

    public ChannelFlowOperator(InterfaceC11594c interfaceC11594c, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9945d, i10, bufferOverflow);
        this.f23911f = interfaceC11594c;
    }

    /* renamed from: n */
    public static /* synthetic */ Object m20885n(ChannelFlowOperator channelFlowOperator, InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        if (channelFlowOperator.f23902d == -3) {
            InterfaceC9945d context = interfaceC11588c.getContext();
            InterfaceC9945d interfaceC9945dM24688j = AbstractC11098c0.m24688j(context, channelFlowOperator.f23901c);
            if (AbstractC9979u.m20289b(interfaceC9945dM24688j, context)) {
                Object objMo20888q = channelFlowOperator.mo20888q(interfaceC11595d, interfaceC11588c);
                return objMo20888q == AbstractC11725a.m25952f() ? objMo20888q : C10786q.f26013a;
            }
            InterfaceC9944c.b bVar = InterfaceC9944c.f23354a0;
            if (AbstractC9979u.m20289b(interfaceC9945dM24688j.get(bVar), context.get(bVar))) {
                Object objM20887p = channelFlowOperator.m20887p(interfaceC11595d, interfaceC9945dM24688j, interfaceC11588c);
                return objM20887p == AbstractC11725a.m25952f() ? objM20887p : C10786q.f26013a;
            }
        }
        Object objCollect = super.collect(interfaceC11595d, interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m20886o(ChannelFlowOperator channelFlowOperator, InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c) {
        Object objMo20888q = channelFlowOperator.mo20888q(new C11741p(interfaceC11395j), interfaceC11588c);
        return objMo20888q == AbstractC11725a.m25952f() ? objMo20888q : C10786q.f26013a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, p379vd.InterfaceC11594c
    public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        return m20885n(this, interfaceC11595d, interfaceC11588c);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: h */
    public Object mo20757h(InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c) {
        return m20886o(this, interfaceC11395j, interfaceC11588c);
    }

    /* renamed from: p */
    public final Object m20887p(InterfaceC11595d interfaceC11595d, InterfaceC9945d interfaceC9945d, InterfaceC11588c interfaceC11588c) {
        return AbstractC11729d.m25962c(interfaceC9945d, AbstractC11729d.m25963d(interfaceC11595d, interfaceC11588c.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), interfaceC11588c, 4, null);
    }

    /* renamed from: q */
    public abstract Object mo20888q(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.f23911f + " -> " + super.toString();
    }
}

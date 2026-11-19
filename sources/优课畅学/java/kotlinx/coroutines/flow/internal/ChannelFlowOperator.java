package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import p123h7.C8736p;
import p157k8.InterfaceC9071g;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p180m8.AbstractC9331d;
import p180m8.C9340m;
import p190n7.AbstractC9434a;

/* loaded from: classes5.dex */
public abstract class ChannelFlowOperator extends ChannelFlow {

    /* renamed from: d */
    public final InterfaceC9266c f17999d;

    public ChannelFlowOperator(InterfaceC9266c interfaceC9266c, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9100d, i10, bufferOverflow);
        this.f17999d = interfaceC9266c;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m16701o(ChannelFlowOperator channelFlowOperator, InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        if (channelFlowOperator.f17990b == -3) {
            InterfaceC9100d context = interfaceC9324c.getContext();
            InterfaceC9100d interfaceC9100dM16216e = CoroutineContextKt.m16216e(context, channelFlowOperator.f17989a);
            if (AbstractC9133u.m16128b(interfaceC9100dM16216e, context)) {
                Object objMo16704r = channelFlowOperator.mo16704r(interfaceC9267d, interfaceC9324c);
                return objMo16704r == AbstractC9434a.m17291f() ? objMo16704r : C8736p.f16368a;
            }
            InterfaceC9099c.b bVar = InterfaceC9099c.f17441b0;
            if (AbstractC9133u.m16128b(interfaceC9100dM16216e.get(bVar), context.get(bVar))) {
                Object objM16703q = channelFlowOperator.m16703q(interfaceC9267d, interfaceC9100dM16216e, interfaceC9324c);
                return objM16703q == AbstractC9434a.m17291f() ? objM16703q : C8736p.f16368a;
            }
        }
        Object objCollect = super.collect(interfaceC9267d, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    /* renamed from: p */
    public static /* synthetic */ Object m16702p(ChannelFlowOperator channelFlowOperator, InterfaceC9071g interfaceC9071g, InterfaceC9324c interfaceC9324c) {
        Object objMo16704r = channelFlowOperator.mo16704r(new C9340m(interfaceC9071g), interfaceC9324c);
        return objMo16704r == AbstractC9434a.m17291f() ? objMo16704r : C8736p.f16368a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, p169l8.InterfaceC9266c
    public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        return m16701o(this, interfaceC9267d, interfaceC9324c);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public Object mo16569i(InterfaceC9071g interfaceC9071g, InterfaceC9324c interfaceC9324c) {
        return m16702p(this, interfaceC9071g, interfaceC9324c);
    }

    /* renamed from: q */
    public final Object m16703q(InterfaceC9267d interfaceC9267d, InterfaceC9100d interfaceC9100d, InterfaceC9324c interfaceC9324c) {
        return AbstractC9331d.m17165c(interfaceC9100d, AbstractC9331d.m17166d(interfaceC9267d, interfaceC9324c.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), interfaceC9324c, 4, null);
    }

    /* renamed from: r */
    public abstract Object mo16704r(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.f17999d + " -> " + super.toString();
    }
}

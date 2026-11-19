package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import p134i7.AbstractC8801r;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p191n8.AbstractC9444e0;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__MergeKt {

    /* renamed from: a */
    public static final int f17829a = AbstractC9444e0.m17322b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* renamed from: a */
    public static final InterfaceC9266c m16609a(InterfaceC9266c interfaceC9266c, InterfaceC10574p interfaceC10574p) {
        return AbstractC9268e.m17009U(interfaceC9266c, new FlowKt__MergeKt$mapLatest$1(interfaceC10574p, null));
    }

    /* renamed from: b */
    public static final InterfaceC9266c m16610b(Iterable iterable) {
        return new ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    /* renamed from: c */
    public static final InterfaceC9266c m16611c(InterfaceC9266c... interfaceC9266cArr) {
        return AbstractC9268e.m16997I(AbstractC8801r.m14711i0(interfaceC9266cArr));
    }

    /* renamed from: d */
    public static final InterfaceC9266c m16612d(InterfaceC9266c interfaceC9266c, InterfaceC10575q interfaceC10575q) {
        return new ChannelFlowTransformLatest(interfaceC10575q, interfaceC9266c, null, 0, null, 28, null);
    }
}

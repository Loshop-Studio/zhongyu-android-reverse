package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p325rc.AbstractC10968r;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p410xd.AbstractC11841d0;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__MergeKt {

    /* renamed from: a */
    public static final int f23756a = AbstractC11841d0.m26250b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* renamed from: a */
    public static final InterfaceC11594c m20797a(InterfaceC11594c interfaceC11594c, InterfaceC9544p interfaceC9544p) {
        return AbstractC11596e.m25549T(interfaceC11594c, new FlowKt__MergeKt$mapLatest$1(interfaceC9544p, null));
    }

    /* renamed from: b */
    public static final InterfaceC11594c m20798b(Iterable iterable) {
        return new ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    /* renamed from: c */
    public static final InterfaceC11594c m20799c(InterfaceC11594c... interfaceC11594cArr) {
        return AbstractC11596e.m25537H(AbstractC10968r.m24080h0(interfaceC11594cArr));
    }

    /* renamed from: d */
    public static final InterfaceC11594c m20800d(InterfaceC11594c interfaceC11594c, InterfaceC9545q interfaceC9545q) {
        return new ChannelFlowTransformLatest(interfaceC9545q, interfaceC11594c, null, 0, null, 28, null);
    }
}

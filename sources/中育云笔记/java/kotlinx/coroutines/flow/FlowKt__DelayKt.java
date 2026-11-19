package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.FlowKt__DelayKt;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import p181hd.InterfaceC9540l;
import p365ud.InterfaceC11397l;
import p379vd.InterfaceC11594c;
import sd.InterfaceC11122i0;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__DelayKt {
    /* renamed from: b */
    public static final InterfaceC11594c m20773b(InterfaceC11594c interfaceC11594c, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? interfaceC11594c : m20775d(interfaceC11594c, new InterfaceC9540l() { // from class: vd.g
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return Long.valueOf(FlowKt__DelayKt.m20774c(j10, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* renamed from: c */
    public static final long m20774c(long j10, Object obj) {
        return j10;
    }

    /* renamed from: d */
    public static final InterfaceC11594c m20775d(InterfaceC11594c interfaceC11594c, InterfaceC9540l interfaceC9540l) {
        return FlowCoroutineKt.m20892b(new FlowKt__DelayKt$debounceInternal$1(interfaceC9540l, interfaceC11594c, null));
    }

    /* renamed from: e */
    public static final InterfaceC11397l m20776e(InterfaceC11122i0 interfaceC11122i0, long j10) {
        return ProduceKt.m20716d(interfaceC11122i0, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(j10, null), 1, null);
    }

    /* renamed from: f */
    public static final InterfaceC11594c m20777f(InterfaceC11594c interfaceC11594c, long j10) {
        if (j10 > 0) {
            return FlowCoroutineKt.m20892b(new FlowKt__DelayKt$sample$2(j10, interfaceC11594c, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }
}

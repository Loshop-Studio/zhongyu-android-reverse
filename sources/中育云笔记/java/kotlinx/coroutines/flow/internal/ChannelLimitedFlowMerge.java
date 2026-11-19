package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p365ud.InterfaceC11397l;
import p379vd.InterfaceC11594c;
import p394wd.C11741p;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class ChannelLimitedFlowMerge extends ChannelFlow {

    /* renamed from: f */
    public final Iterable f23934f;

    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9972n abstractC9972n) {
        this(iterable, (i11 & 2) != 0 ? EmptyCoroutineContext.f23351c : interfaceC9945d, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.f23519c : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: h */
    public Object mo20757h(InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c) {
        C11741p c11741p = new C11741p(interfaceC11395j);
        Iterator it = this.f23934f.iterator();
        while (it.hasNext()) {
            AbstractC11117h.m24726d(interfaceC11395j, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((InterfaceC11594c) it.next(), c11741p, null), 3, null);
        }
        return C10786q.f26013a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public ChannelFlow mo20758i(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.f23934f, interfaceC9945d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: m */
    public InterfaceC11397l mo20884m(InterfaceC11122i0 interfaceC11122i0) {
        return ProduceKt.m20714b(interfaceC11122i0, this.f23901c, this.f23902d, m20882k());
    }

    public ChannelLimitedFlowMerge(Iterable iterable, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9945d, i10, bufferOverflow);
        this.f23934f = iterable;
    }
}

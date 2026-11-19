package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p157k8.InterfaceC9071g;
import p157k8.InterfaceC9073i;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p180m8.C9340m;

/* loaded from: classes5.dex */
public final class ChannelLimitedFlowMerge extends ChannelFlow {

    /* renamed from: d */
    public final Iterable f18022d;

    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9126n abstractC9126n) {
        this(iterable, (i11 & 2) != 0 ? EmptyCoroutineContext.f17438a : interfaceC9100d, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.f17603a : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public Object mo16569i(InterfaceC9071g interfaceC9071g, InterfaceC9324c interfaceC9324c) {
        C9340m c9340m = new C9340m(interfaceC9071g);
        Iterator it = this.f18022d.iterator();
        while (it.hasNext()) {
            AbstractC8839h.m14861d(interfaceC9071g, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((InterfaceC9266c) it.next(), c9340m, null), 3, null);
        }
        return C8736p.f16368a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    public ChannelFlow mo16570j(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.f18022d, interfaceC9100d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: n */
    public InterfaceC9073i mo16700n(InterfaceC8822b0 interfaceC8822b0) {
        return ProduceKt.m16523c(interfaceC8822b0, this.f17989a, this.f17990b, m16698l());
    }

    public ChannelLimitedFlowMerge(Iterable iterable, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9100d, i10, bufferOverflow);
        this.f18022d = iterable;
    }
}

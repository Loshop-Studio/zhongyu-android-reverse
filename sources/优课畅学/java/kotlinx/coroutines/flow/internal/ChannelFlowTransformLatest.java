package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.channels.BufferOverflow;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public final class ChannelFlowTransformLatest extends ChannelFlowOperator {

    /* renamed from: e */
    public final InterfaceC10575q f18003e;

    public /* synthetic */ ChannelFlowTransformLatest(InterfaceC10575q interfaceC10575q, InterfaceC9266c interfaceC9266c, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9126n abstractC9126n) {
        this(interfaceC10575q, interfaceC9266c, (i11 & 4) != 0 ? EmptyCoroutineContext.f17438a : interfaceC9100d, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? BufferOverflow.f17603a : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    public ChannelFlow mo16570j(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f18003e, this.f17999d, interfaceC9100d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    /* renamed from: r */
    public Object mo16704r(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        Object objM16556e = AbstractC9165e.m16556e(new ChannelFlowTransformLatest$flowCollect$3(this, interfaceC9267d, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    public ChannelFlowTransformLatest(InterfaceC10575q interfaceC10575q, InterfaceC9266c interfaceC9266c, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9266c, interfaceC9100d, i10, bufferOverflow);
        this.f18003e = interfaceC10575q;
    }
}

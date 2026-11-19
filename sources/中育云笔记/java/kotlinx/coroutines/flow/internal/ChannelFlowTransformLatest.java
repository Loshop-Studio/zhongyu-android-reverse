package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.channels.BufferOverflow;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class ChannelFlowTransformLatest extends ChannelFlowOperator {

    /* renamed from: g */
    public final InterfaceC9545q f23915g;

    public /* synthetic */ ChannelFlowTransformLatest(InterfaceC9545q interfaceC9545q, InterfaceC11594c interfaceC11594c, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9972n abstractC9972n) {
        this(interfaceC9545q, interfaceC11594c, (i11 & 4) != 0 ? EmptyCoroutineContext.f23351c : interfaceC9945d, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? BufferOverflow.f23519c : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public ChannelFlow mo20758i(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f23915g, this.f23911f, interfaceC9945d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    /* renamed from: q */
    public Object mo20888q(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        Object objM20748e = AbstractC10006d.m20748e(new ChannelFlowTransformLatest$flowCollect$3(this, interfaceC11595d, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public ChannelFlowTransformLatest(InterfaceC9545q interfaceC9545q, InterfaceC11594c interfaceC11594c, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC11594c, interfaceC9945d, i10, bufferOverflow);
        this.f23915g = interfaceC9545q;
    }
}

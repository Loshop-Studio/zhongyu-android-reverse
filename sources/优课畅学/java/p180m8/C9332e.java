package p180m8;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* renamed from: m8.e */
/* loaded from: classes5.dex */
public final class C9332e extends ChannelFlowOperator {
    public /* synthetic */ C9332e(InterfaceC9266c interfaceC9266c, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9126n abstractC9126n) {
        this(interfaceC9266c, (i11 & 2) != 0 ? EmptyCoroutineContext.f17438a : interfaceC9100d, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? BufferOverflow.f17603a : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    public ChannelFlow mo16570j(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return new C9332e(this.f17999d, interfaceC9100d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: k */
    public InterfaceC9266c mo16697k() {
        return this.f17999d;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    /* renamed from: r */
    public Object mo16704r(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        Object objCollect = this.f17999d.collect(interfaceC9267d, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    public C9332e(InterfaceC9266c interfaceC9266c, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9266c, interfaceC9100d, i10, bufferOverflow);
    }
}

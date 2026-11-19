package p169l8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p157k8.InterfaceC9071g;
import p157k8.InterfaceC9073i;
import p179m7.InterfaceC9324c;
import p180m8.C9340m;
import p190n7.AbstractC9434a;

/* renamed from: l8.a */
/* loaded from: classes5.dex */
public final class C9264a extends ChannelFlow {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18264f = AtomicIntegerFieldUpdater.newUpdater(C9264a.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d */
    public final InterfaceC9073i f18265d;

    /* renamed from: e */
    public final boolean f18266e;

    public /* synthetic */ C9264a(InterfaceC9073i interfaceC9073i, boolean z10, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9126n abstractC9126n) {
        this(interfaceC9073i, z10, (i11 & 4) != 0 ? EmptyCoroutineContext.f17438a : interfaceC9100d, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? BufferOverflow.f17603a : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, p169l8.InterfaceC9266c
    public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) throws Throwable {
        if (this.f17990b != -3) {
            Object objCollect = super.collect(interfaceC9267d, interfaceC9324c);
            return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
        }
        m16987p();
        Object objM16579d = FlowKt__ChannelsKt.m16579d(interfaceC9267d, this.f18265d, this.f18266e, interfaceC9324c);
        return objM16579d == AbstractC9434a.m17291f() ? objM16579d : C8736p.f16368a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: f */
    public String mo16696f() {
        return "channel=" + this.f18265d;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public Object mo16569i(InterfaceC9071g interfaceC9071g, InterfaceC9324c interfaceC9324c) throws Throwable {
        Object objM16579d = FlowKt__ChannelsKt.m16579d(new C9340m(interfaceC9071g), this.f18265d, this.f18266e, interfaceC9324c);
        return objM16579d == AbstractC9434a.m17291f() ? objM16579d : C8736p.f16368a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    public ChannelFlow mo16570j(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return new C9264a(this.f18265d, this.f18266e, interfaceC9100d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: k */
    public InterfaceC9266c mo16697k() {
        return new C9264a(this.f18265d, this.f18266e, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: n */
    public InterfaceC9073i mo16700n(InterfaceC8822b0 interfaceC8822b0) {
        m16987p();
        return this.f17990b == -3 ? this.f18265d : super.mo16700n(interfaceC8822b0);
    }

    /* renamed from: p */
    public final void m16987p() {
        if (this.f18266e && f18264f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    public C9264a(InterfaceC9073i interfaceC9073i, boolean z10, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9100d, i10, bufferOverflow);
        this.f18265d = interfaceC9073i;
        this.f18266e = z10;
        this.consumed$volatile = 0;
    }
}

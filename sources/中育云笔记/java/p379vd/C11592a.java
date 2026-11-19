package p379vd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p365ud.InterfaceC11397l;
import p393wc.AbstractC11725a;
import p394wd.C11741p;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* renamed from: vd.a */
/* loaded from: classes6.dex */
public final class C11592a extends ChannelFlow {

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f27494h = AtomicIntegerFieldUpdater.newUpdater(C11592a.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: f */
    public final InterfaceC11397l f27495f;

    /* renamed from: g */
    public final boolean f27496g;

    public /* synthetic */ C11592a(InterfaceC11397l interfaceC11397l, boolean z10, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9972n abstractC9972n) {
        this(interfaceC11397l, z10, (i11 & 4) != 0 ? EmptyCoroutineContext.f23351c : interfaceC9945d, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? BufferOverflow.f23519c : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: c */
    public String mo20880c() {
        return "channel=" + this.f27495f;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, p379vd.InterfaceC11594c
    public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) throws Throwable {
        if (this.f23902d != -3) {
            Object objCollect = super.collect(interfaceC11595d, interfaceC11588c);
            return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
        }
        m25528o();
        Object objM20767d = FlowKt__ChannelsKt.m20767d(interfaceC11595d, this.f27495f, this.f27496g, interfaceC11588c);
        return objM20767d == AbstractC11725a.m25952f() ? objM20767d : C10786q.f26013a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: h */
    public Object mo20757h(InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c) throws Throwable {
        Object objM20767d = FlowKt__ChannelsKt.m20767d(new C11741p(interfaceC11395j), this.f27495f, this.f27496g, interfaceC11588c);
        return objM20767d == AbstractC11725a.m25952f() ? objM20767d : C10786q.f26013a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public ChannelFlow mo20758i(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return new C11592a(this.f27495f, this.f27496g, interfaceC9945d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    public InterfaceC11594c mo20881j() {
        return new C11592a(this.f27495f, this.f27496g, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: m */
    public InterfaceC11397l mo20884m(InterfaceC11122i0 interfaceC11122i0) {
        m25528o();
        return this.f23902d == -3 ? this.f27495f : super.mo20884m(interfaceC11122i0);
    }

    /* renamed from: o */
    public final void m25528o() {
        if (this.f27496g && f27494h.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    public C11592a(InterfaceC11397l interfaceC11397l, boolean z10, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9945d, i10, bufferOverflow);
        this.f27495f = interfaceC11397l;
        this.f27496g = z10;
    }
}

package p394wd;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* renamed from: wd.e */
/* loaded from: classes6.dex */
public final class C11730e extends ChannelFlowOperator {
    public /* synthetic */ C11730e(InterfaceC11594c interfaceC11594c, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9972n abstractC9972n) {
        this(interfaceC11594c, (i11 & 2) != 0 ? EmptyCoroutineContext.f23351c : interfaceC9945d, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? BufferOverflow.f23519c : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public ChannelFlow mo20758i(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return new C11730e(this.f23911f, interfaceC9945d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    public InterfaceC11594c mo20881j() {
        return this.f23911f;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    /* renamed from: q */
    public Object mo20888q(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        Object objCollect = this.f23911f.collect(interfaceC11595d, interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }

    public C11730e(InterfaceC11594c interfaceC11594c, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC11594c, interfaceC9945d, i10, bufferOverflow);
    }
}

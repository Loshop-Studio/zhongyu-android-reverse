package p379vd;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* renamed from: vd.b */
/* loaded from: classes6.dex */
public class C11593b extends ChannelFlow {

    /* renamed from: f */
    public final InterfaceC9544p f27497f;

    public /* synthetic */ C11593b(InterfaceC9544p interfaceC9544p, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9972n abstractC9972n) {
        this(interfaceC9544p, (i11 & 2) != 0 ? EmptyCoroutineContext.f23351c : interfaceC9945d, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.f23519c : bufferOverflow);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m25529n(C11593b c11593b, InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c) {
        Object objInvoke = c11593b.f27497f.invoke(interfaceC11395j, interfaceC11588c);
        return objInvoke == AbstractC11725a.m25952f() ? objInvoke : C10786q.f26013a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: h */
    public Object mo20757h(InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c) {
        return m25529n(this, interfaceC11395j, interfaceC11588c);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public ChannelFlow mo20758i(InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        return new C11593b(this.f27497f, interfaceC9945d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.f27497f + "] -> " + super.toString();
    }

    public C11593b(InterfaceC9544p interfaceC9544p, InterfaceC9945d interfaceC9945d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9945d, i10, bufferOverflow);
        this.f27497f = interfaceC9544p;
    }
}

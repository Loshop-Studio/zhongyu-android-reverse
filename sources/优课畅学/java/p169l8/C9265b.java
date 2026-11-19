package p169l8;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import p123h7.C8736p;
import p157k8.InterfaceC9071g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10574p;

/* renamed from: l8.b */
/* loaded from: classes5.dex */
public class C9265b extends ChannelFlow {

    /* renamed from: d */
    public final InterfaceC10574p f18267d;

    public /* synthetic */ C9265b(InterfaceC10574p interfaceC10574p, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow, int i11, AbstractC9126n abstractC9126n) {
        this(interfaceC10574p, (i11 & 2) != 0 ? EmptyCoroutineContext.f17438a : interfaceC9100d, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.f17603a : bufferOverflow);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m16988o(C9265b c9265b, InterfaceC9071g interfaceC9071g, InterfaceC9324c interfaceC9324c) {
        Object objInvoke = c9265b.f18267d.invoke(interfaceC9071g, interfaceC9324c);
        return objInvoke == AbstractC9434a.m17291f() ? objInvoke : C8736p.f16368a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: i */
    public Object mo16569i(InterfaceC9071g interfaceC9071g, InterfaceC9324c interfaceC9324c) {
        return m16988o(this, interfaceC9071g, interfaceC9324c);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    /* renamed from: j */
    public ChannelFlow mo16570j(InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        return new C9265b(this.f18267d, interfaceC9100d, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.f18267d + "] -> " + super.toString();
    }

    public C9265b(InterfaceC10574p interfaceC10574p, InterfaceC9100d interfaceC9100d, int i10, BufferOverflow bufferOverflow) {
        super(interfaceC9100d, i10, bufferOverflow);
        this.f18267d = interfaceC10574p;
    }
}

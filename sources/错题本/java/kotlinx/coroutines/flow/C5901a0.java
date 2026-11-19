package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.InterfaceC5929k;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.flow.a0 */
/* loaded from: classes4.dex */
public final class C5901a0 implements InterfaceC5944m0, InterfaceC5910f, InterfaceC5929k {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5944m0 f9347a;

    public C5901a0(InterfaceC5959y interfaceC5959y) {
        this.f9347a = interfaceC5959y;
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC5929k
    /* renamed from: b */
    public final InterfaceC5910f mo5520b(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? AbstractC5914h.m5555k(this, interfaceC5636h, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    public final Object collect(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        return this.f9347a.collect(interfaceC5912g, interfaceC5631c);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5944m0
    public final Object getValue() {
        return this.f9347a.getValue();
    }
}

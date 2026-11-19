package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.InterfaceC5929k;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.flow.z */
/* loaded from: classes4.dex */
public final class C5960z implements InterfaceC5905c0, InterfaceC5910f, InterfaceC5929k {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5905c0 f9446a;

    public C5960z(InterfaceC5958x interfaceC5958x) {
        this.f9446a = interfaceC5958x;
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC5929k
    /* renamed from: b */
    public final InterfaceC5910f mo5520b(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        return AbstractC5914h.m5555k(this, interfaceC5636h, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    public final Object collect(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        return this.f9446a.collect(interfaceC5912g, interfaceC5631c);
    }
}

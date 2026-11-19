package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.flow.internal.f */
/* loaded from: classes4.dex */
public final class C5924f extends AbstractC5923e {
    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: f */
    public final AbstractC5922d mo5522f(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        return new C5924f(this.f9393d, interfaceC5636h, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: g */
    public final InterfaceC5910f mo5524g() {
        return this.f9393d;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5923e
    /* renamed from: i */
    public final Object mo5566i(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        Object objCollect = this.f9393d.collect(interfaceC5912g, interfaceC5631c);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : C5443s.f8405a;
    }
}

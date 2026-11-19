package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6474f;

/* renamed from: kotlinx.coroutines.flow.internal.h */
/* loaded from: classes4.dex */
public final class C5926h extends AbstractC5923e {

    /* renamed from: e */
    public final SuspendLambda f9398e;

    /* JADX WARN: Multi-variable type inference failed */
    public C5926h(InterfaceC6474f interfaceC6474f, InterfaceC5910f interfaceC5910f, InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        super(interfaceC5910f, interfaceC5636h, i, bufferOverflow);
        this.f9398e = (SuspendLambda) interfaceC6474f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, r6.f] */
    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: f */
    public final AbstractC5922d mo5522f(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        return new C5926h(this.f9398e, this.f9393d, interfaceC5636h, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5923e
    /* renamed from: i */
    public final Object mo5566i(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new ChannelFlowTransformLatest$flowCollect$3(this, interfaceC5912g, null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }
}

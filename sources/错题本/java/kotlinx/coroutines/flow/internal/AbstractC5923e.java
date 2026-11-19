package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC5884m;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.flow.internal.e */
/* loaded from: classes4.dex */
public abstract class AbstractC5923e extends AbstractC5922d {

    /* renamed from: d */
    public final InterfaceC5910f f9393d;

    public AbstractC5923e(InterfaceC5910f interfaceC5910f, InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        super(interfaceC5636h, i, bufferOverflow);
        this.f9393d = interfaceC5910f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d, kotlinx.coroutines.flow.InterfaceC5910f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.InterfaceC5912g r5, p075h6.InterfaceC5631c r6) {
        /*
            r4 = this;
            int r0 = r4.f9391b
            r1 = -3
            if (r0 != r1) goto L6e
            h6.h r0 = r6.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            e7.t r2 = new e7.t
            r3 = 7
            r2.<init>(r3)
            h6.h r3 = r4.f9390a
            java.lang.Object r1 = r3.fold(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L24
            h6.h r1 = r0.plus(r3)
            goto L29
        L24:
            r1 = 0
            h6.h r1 = kotlinx.coroutines.AbstractC6014x.m5640k(r0, r3, r1)
        L29:
            boolean r2 = kotlin.jvm.internal.AbstractC5830k.m5325b(r1, r0)
            if (r2 == 0) goto L38
            java.lang.Object r5 = r4.mo5566i(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r6) goto L77
            return r5
        L38:
            h6.d r2 = p075h6.C5632d.f8764a
            h6.f r3 = r1.get(r2)
            h6.f r0 = r0.get(r2)
            boolean r0 = kotlin.jvm.internal.AbstractC5830k.m5325b(r3, r0)
            if (r0 == 0) goto L6e
            h6.h r0 = r6.getContext()
            boolean r2 = r5 instanceof kotlinx.coroutines.flow.internal.C5933o
            if (r2 != 0) goto L5b
            boolean r2 = r5 instanceof kotlinx.coroutines.flow.internal.C5931m
            if (r2 == 0) goto L55
            goto L5b
        L55:
            kotlinx.coroutines.flow.internal.r r2 = new kotlinx.coroutines.flow.internal.r
            r2.<init>(r5, r0)
            r5 = r2
        L5b:
            kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
            r2 = 0
            r0.<init>(r4, r2)
            java.lang.Object r2 = p054e7.AbstractC5469a.m4837m(r1)
            java.lang.Object r5 = kotlinx.coroutines.flow.internal.AbstractC5920b.m5565c(r1, r5, r2, r0, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r6) goto L77
            return r5
        L6e:
            java.lang.Object r5 = super.collect(r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r6) goto L77
            return r5
        L77:
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC5923e.collect(kotlinx.coroutines.flow.g, h6.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    /* renamed from: e */
    public final Object mo5521e(InterfaceC5884m interfaceC5884m, InterfaceC5631c interfaceC5631c) {
        Object objMo5566i = mo5566i(new C5933o(interfaceC5884m), interfaceC5631c);
        return objMo5566i == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5566i : C5443s.f8405a;
    }

    /* renamed from: i */
    public abstract Object mo5566i(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c);

    @Override // kotlinx.coroutines.flow.internal.AbstractC5922d
    public final String toString() {
        return this.f9393d + " -> " + super.toString();
    }
}

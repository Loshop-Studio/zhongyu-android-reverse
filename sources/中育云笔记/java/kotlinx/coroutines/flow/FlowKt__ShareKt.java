package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.C11604m;
import p379vd.C11605n;
import p379vd.C11610s;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11607p;
import p379vd.InterfaceC11612u;
import sd.AbstractC11109f;
import sd.InterfaceC11122i0;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__ShareKt {
    /* renamed from: a */
    public static final InterfaceC11607p m20805a(InterfaceC11602k interfaceC11602k) {
        return new C11604m(interfaceC11602k, null);
    }

    /* renamed from: b */
    public static final InterfaceC11612u m20806b(InterfaceC11603l interfaceC11603l) {
        return new C11605n(interfaceC11603l, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p379vd.C11610s m20807c(p379vd.InterfaceC11594c r7, int r8) {
        /*
            kotlinx.coroutines.channels.a$b r0 = kotlinx.coroutines.channels.InterfaceC10000a.f23580c0
            int r0 = r0.m20720a()
            int r0 = p265nd.AbstractC10410o.m21752e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            vd.c r2 = r1.mo20881j()
            if (r2 == 0) goto L3c
            vd.s r7 = new vd.s
            int r3 = r1.f23902d
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f23903e
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.f23519c
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.f23903e
            kotlin.coroutines.d r1 = r1.f23901c
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            vd.s r8 = new vd.s
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.f23519c
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f23351c
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.m20807c(vd.c, int):vd.s");
    }

    /* renamed from: d */
    public static final InterfaceC10045g m20808d(InterfaceC11122i0 interfaceC11122i0, InterfaceC9945d interfaceC9945d, InterfaceC11594c interfaceC11594c, InterfaceC11602k interfaceC11602k, InterfaceC10040a interfaceC10040a, Object obj) {
        return AbstractC11109f.m24705c(interfaceC11122i0, interfaceC9945d, AbstractC9979u.m20289b(interfaceC10040a, InterfaceC10040a.f23896a.m20877c()) ? CoroutineStart.f23476c : CoroutineStart.f23479f, new FlowKt__ShareKt$launchSharing$1(interfaceC10040a, interfaceC11594c, interfaceC11602k, obj, null));
    }

    /* renamed from: e */
    public static final InterfaceC11607p m20809e(InterfaceC11607p interfaceC11607p, InterfaceC9544p interfaceC9544p) {
        return new SubscribedSharedFlow(interfaceC11607p, interfaceC9544p);
    }

    /* renamed from: f */
    public static final InterfaceC11607p m20810f(InterfaceC11594c interfaceC11594c, InterfaceC11122i0 interfaceC11122i0, InterfaceC10040a interfaceC10040a, int i10) {
        C11610s c11610sM20807c = m20807c(interfaceC11594c, i10);
        InterfaceC11602k interfaceC11602kM25591a = AbstractC11608q.m25591a(i10, c11610sM20807c.f27510b, c11610sM20807c.f27511c);
        return new C11604m(interfaceC11602kM25591a, m20808d(interfaceC11122i0, c11610sM20807c.f27512d, c11610sM20807c.f27509a, interfaceC11602kM25591a, interfaceC10040a, AbstractC11608q.f27506a));
    }

    /* renamed from: g */
    public static final InterfaceC11612u m20811g(InterfaceC11594c interfaceC11594c, InterfaceC11122i0 interfaceC11122i0, InterfaceC10040a interfaceC10040a, Object obj) {
        C11610s c11610sM20807c = m20807c(interfaceC11594c, 1);
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(obj);
        return new C11605n(interfaceC11603lM25602a, m20808d(interfaceC11122i0, c11610sM20807c.f27512d, c11610sM20807c.f27509a, interfaceC11603lM25602a, interfaceC10040a, obj));
    }
}

package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8839h;
import p135i8.AbstractC8875t;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8869r;
import p169l8.AbstractC9276m;
import p169l8.AbstractC9281r;
import p169l8.C9272i;
import p169l8.C9273j;
import p169l8.C9278o;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9275l;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__ShareKt {
    /* renamed from: a */
    public static final InterfaceC9275l m16617a(InterfaceC9270g interfaceC9270g) {
        return new C9272i(interfaceC9270g, null);
    }

    /* renamed from: b */
    public static final InterfaceC9280q m16618b(InterfaceC9271h interfaceC9271h) {
        return new C9273j(interfaceC9271h, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p169l8.C9278o m16619c(p169l8.InterfaceC9266c r7, int r8) {
        /*
            kotlinx.coroutines.channels.a$b r0 = kotlinx.coroutines.channels.InterfaceC9158a.f17670d0
            int r0 = r0.m16527a()
            int r0 = p077d8.AbstractC8323h.m13510e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            l8.c r2 = r1.mo16697k()
            if (r2 == 0) goto L3c
            l8.o r7 = new l8.o
            int r3 = r1.f17990b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f17991c
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.f17603a
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
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.f17991c
            kotlin.coroutines.d r1 = r1.f17989a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            l8.o r8 = new l8.o
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.f17603a
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f17438a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.m16619c(l8.c, int):l8.o");
    }

    /* renamed from: d */
    public static final InterfaceC9212n m16620d(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, InterfaceC9266c interfaceC9266c, InterfaceC9270g interfaceC9270g, InterfaceC9198a interfaceC9198a, Object obj) {
        return AbstractC8833f.m14844c(interfaceC8822b0, interfaceC9100d, AbstractC9133u.m16128b(interfaceC9198a, InterfaceC9198a.f17984a.m16693c()) ? CoroutineStart.f17552a : CoroutineStart.f17555d, new FlowKt__ShareKt$launchSharing$1(interfaceC9198a, interfaceC9266c, interfaceC9270g, obj, null));
    }

    /* renamed from: e */
    public static final void m16621e(InterfaceC8822b0 interfaceC8822b0, InterfaceC9100d interfaceC9100d, InterfaceC9266c interfaceC9266c, InterfaceC8869r interfaceC8869r) {
        AbstractC8839h.m14861d(interfaceC8822b0, interfaceC9100d, null, new FlowKt__ShareKt$launchSharingDeferred$1(interfaceC9266c, interfaceC8869r, null), 2, null);
    }

    /* renamed from: f */
    public static final InterfaceC9275l m16622f(InterfaceC9275l interfaceC9275l, InterfaceC10574p interfaceC10574p) {
        return new SubscribedSharedFlow(interfaceC9275l, interfaceC10574p);
    }

    /* renamed from: g */
    public static final InterfaceC9275l m16623g(InterfaceC9266c interfaceC9266c, InterfaceC8822b0 interfaceC8822b0, InterfaceC9198a interfaceC9198a, int i10) {
        C9278o c9278oM16619c = m16619c(interfaceC9266c, i10);
        InterfaceC9270g interfaceC9270gM17043a = AbstractC9276m.m17043a(i10, c9278oM16619c.f18277b, c9278oM16619c.f18278c);
        return new C9272i(interfaceC9270gM17043a, m16620d(interfaceC8822b0, c9278oM16619c.f18279d, c9278oM16619c.f18276a, interfaceC9270gM17043a, interfaceC9198a, AbstractC9276m.f18273a));
    }

    /* renamed from: h */
    public static final Object m16624h(InterfaceC9266c interfaceC9266c, InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        C9278o c9278oM16619c = m16619c(interfaceC9266c, 1);
        InterfaceC8869r interfaceC8869rM14913b = AbstractC8875t.m14913b(null, 1, null);
        m16621e(interfaceC8822b0, c9278oM16619c.f18279d, c9278oM16619c.f18276a, interfaceC8869rM14913b);
        return interfaceC8869rM14913b.mo14833u(interfaceC9324c);
    }

    /* renamed from: i */
    public static final InterfaceC9280q m16625i(InterfaceC9266c interfaceC9266c, InterfaceC8822b0 interfaceC8822b0, InterfaceC9198a interfaceC9198a, Object obj) {
        C9278o c9278oM16619c = m16619c(interfaceC9266c, 1);
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(obj);
        return new C9273j(interfaceC9271hM17054a, m16620d(interfaceC8822b0, c9278oM16619c.f18279d, c9278oM16619c.f18276a, interfaceC9271hM17054a, interfaceC9198a, obj));
    }
}

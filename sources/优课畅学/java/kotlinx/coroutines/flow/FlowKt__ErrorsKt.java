package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p169l8.InterfaceC9266c;
import p300x7.InterfaceC10576r;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__ErrorsKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16599a(p169l8.InterfaceC9266c r4, p169l8.InterfaceC9267d r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.f17775c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17775c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17774b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17775c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f17773a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            kotlin.AbstractC9079b.m15926b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.AbstractC9079b.m15926b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f17773a = r6     // Catch: java.lang.Throwable -> L51
            r0.f17775c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f17473a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m16601c(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.d r6 = r0.getContext()
            boolean r6 = m16600b(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            p123h7.AbstractC8722b.m14228a(r4, r5)
            throw r4
        L72:
            p123h7.AbstractC8722b.m14228a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.m16599a(l8.c, l8.d, m7.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final boolean m16600b(Throwable th, InterfaceC9100d interfaceC9100d) {
        InterfaceC9212n interfaceC9212n = (InterfaceC9212n) interfaceC9100d.get(InterfaceC9212n.f18095c0);
        if (interfaceC9212n == null || !interfaceC9212n.isCancelled()) {
            return false;
        }
        return m16601c(th, interfaceC9212n.mo16281e());
    }

    /* renamed from: c */
    public static final boolean m16601c(Throwable th, Throwable th2) {
        return th2 != null && AbstractC9133u.m16128b(th2, th);
    }

    /* renamed from: d */
    public static final InterfaceC9266c m16602d(InterfaceC9266c interfaceC9266c, InterfaceC10576r interfaceC10576r) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(interfaceC9266c, interfaceC10576r);
    }
}

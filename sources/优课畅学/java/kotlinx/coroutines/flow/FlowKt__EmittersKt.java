package kotlinx.coroutines.flow;

import p169l8.C9283t;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FlowKt__EmittersKt {
    /* renamed from: b */
    public static final void m16595b(InterfaceC9267d interfaceC9267d) {
        if (interfaceC9267d instanceof C9283t) {
            throw ((C9283t) interfaceC9267d).f18283a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16596c(p169l8.InterfaceC9267d r4, p300x7.InterfaceC10575q r5, java.lang.Throwable r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.f17762c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17762c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17761b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17762c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f17760a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.AbstractC9079b.m15926b(r7)
            r0.f17760a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f17762c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            h7.p r4 = p123h7.C8736p.f16368a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            p123h7.AbstractC8722b.m14228a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.m16596c(l8.d, x7.q, java.lang.Throwable, m7.c):java.lang.Object");
    }

    /* renamed from: d */
    public static final InterfaceC9266c m16597d(InterfaceC9266c interfaceC9266c, InterfaceC10575q interfaceC10575q) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(interfaceC9266c, interfaceC10575q);
    }

    /* renamed from: e */
    public static final InterfaceC9266c m16598e(InterfaceC9266c interfaceC9266c, InterfaceC10574p interfaceC10574p) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(interfaceC10574p, interfaceC9266c);
    }
}

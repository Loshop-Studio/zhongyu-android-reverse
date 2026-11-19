package kotlinx.coroutines.flow;

import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p379vd.C11615x;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__EmittersKt {
    /* renamed from: b */
    public static final void m20783b(InterfaceC11595d interfaceC11595d) {
        if (interfaceC11595d instanceof C11615x) {
            throw ((C11615x) interfaceC11595d).f27516c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20784c(p379vd.InterfaceC11595d r4, p181hd.InterfaceC9545q r5, java.lang.Throwable r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1) r0
            int r1 = r0.f23689e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23689e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23688d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23689e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f23687c
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Throwable -> L2e
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
            kotlin.AbstractC9924b.m20071b(r7)
            r0.f23687c = r6     // Catch: java.lang.Throwable -> L2e
            r0.f23689e = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            qc.q r4 = p309qc.C10786q.f26013a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            p309qc.AbstractC10771b.m22973a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.m20784c(vd.d, hd.q, java.lang.Throwable, vc.c):java.lang.Object");
    }

    /* renamed from: d */
    public static final InterfaceC11594c m20785d(InterfaceC11594c interfaceC11594c, InterfaceC9545q interfaceC9545q) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(interfaceC11594c, interfaceC9545q);
    }

    /* renamed from: e */
    public static final InterfaceC11594c m20786e(InterfaceC11594c interfaceC11594c, InterfaceC9544p interfaceC9544p) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(interfaceC9544p, interfaceC11594c);
    }
}

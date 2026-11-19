package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9546r;
import p379vd.InterfaceC11594c;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__ErrorsKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20787a(p379vd.InterfaceC11594c r4, p379vd.InterfaceC11595d r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.f23702e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23702e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23701d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23702e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f23700c
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Throwable -> L2d
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
            kotlin.AbstractC9924b.m20071b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f23700c = r6     // Catch: java.lang.Throwable -> L51
            r0.f23702e = r3     // Catch: java.lang.Throwable -> L51
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
            java.lang.Object r4 = r4.f23402c
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m20789c(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.d r6 = r0.getContext()
            boolean r6 = m20788b(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            p309qc.AbstractC10771b.m22973a(r4, r5)
            throw r4
        L72:
            p309qc.AbstractC10771b.m22973a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.m20787a(vd.c, vd.d, vc.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final boolean m20788b(Throwable th, InterfaceC9945d interfaceC9945d) {
        InterfaceC10045g interfaceC10045g = (InterfaceC10045g) interfaceC9945d.get(InterfaceC10045g.f23976b0);
        if (interfaceC10045g == null || !interfaceC10045g.isCancelled()) {
            return false;
        }
        return m20789c(th, interfaceC10045g.mo20438g());
    }

    /* renamed from: c */
    public static final boolean m20789c(Throwable th, Throwable th2) {
        return th2 != null && AbstractC9979u.m20289b(th2, th);
    }

    /* renamed from: d */
    public static final InterfaceC11594c m20790d(InterfaceC11594c interfaceC11594c, InterfaceC9546r interfaceC9546r) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(interfaceC11594c, interfaceC9546r);
    }
}

package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9544p;
import p379vd.InterfaceC11594c;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements InterfaceC11594c {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9544p f23679c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC11594c f23680d;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m26211f = "Emitters.kt", m26212l = {112, 116}, m26213m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 */
    public static final class C100161 extends ContinuationImpl {

        /* renamed from: c */
        public /* synthetic */ Object f23681c;

        /* renamed from: d */
        public int f23682d;

        /* renamed from: f */
        public Object f23684f;

        /* renamed from: g */
        public Object f23685g;

        /* renamed from: h */
        public Object f23686h;

        public C100161(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23681c = obj;
            this.f23682d |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(InterfaceC9544p interfaceC9544p, InterfaceC11594c interfaceC11594c) {
        this.f23679c = interfaceC9544p;
        this.f23680d = interfaceC11594c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r7.collect(r2, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11594c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p379vd.InterfaceC11595d r7, vc.InterfaceC11588c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.C100161
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.C100161) r0
            int r1 = r0.f23682d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23682d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23681c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23682d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9924b.m20071b(r8)
            goto L83
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f23686h
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            java.lang.Object r2 = r0.f23685g
            vd.d r2 = (p379vd.InterfaceC11595d) r2
            java.lang.Object r4 = r0.f23684f
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) r4
            kotlin.AbstractC9924b.m20071b(r8)     // Catch: java.lang.Throwable -> L44
            goto L6e
        L44:
            r8 = move-exception
            goto L8a
        L46:
            kotlin.AbstractC9924b.m20071b(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.d r2 = r0.getContext()
            r8.<init>(r7, r2)
            hd.p r2 = r6.f23679c     // Catch: java.lang.Throwable -> L86
            r0.f23684f = r6     // Catch: java.lang.Throwable -> L86
            r0.f23685g = r7     // Catch: java.lang.Throwable -> L86
            r0.f23686h = r8     // Catch: java.lang.Throwable -> L86
            r0.f23682d = r4     // Catch: java.lang.Throwable -> L86
            r4 = 6
            kotlin.jvm.internal.AbstractC9977s.m20287c(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
            r4 = 7
            kotlin.jvm.internal.AbstractC9977s.m20287c(r4)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L6b
            goto L82
        L6b:
            r4 = r6
            r2 = r7
            r7 = r8
        L6e:
            r7.releaseIntercepted()
            vd.c r7 = r4.f23680d
            r8 = 0
            r0.f23684f = r8
            r0.f23685g = r8
            r0.f23686h = r8
            r0.f23682d = r3
            java.lang.Object r7 = r7.collect(r2, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        L86:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L8a:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(vd.d, vc.c):java.lang.Object");
    }
}

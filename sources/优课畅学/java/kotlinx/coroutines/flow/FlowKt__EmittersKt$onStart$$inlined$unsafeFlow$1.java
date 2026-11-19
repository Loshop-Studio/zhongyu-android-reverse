package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements InterfaceC9266c {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10574p f17752a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9266c f17753b;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m17801f = "Emitters.kt", m17802l = {115, 119}, m17803m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 */
    public static final class C91731 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f17754a;

        /* renamed from: b */
        public int f17755b;

        /* renamed from: d */
        public Object f17757d;

        /* renamed from: e */
        public Object f17758e;

        /* renamed from: f */
        public Object f17759f;

        public C91731(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17754a = obj;
            this.f17755b |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(InterfaceC10574p interfaceC10574p, InterfaceC9266c interfaceC9266c) {
        this.f17752a = interfaceC10574p;
        this.f17753b = interfaceC9266c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r7.collect(r2, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9266c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p169l8.InterfaceC9267d r7, p179m7.InterfaceC9324c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.C91731
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.C91731) r0
            int r1 = r0.f17755b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17755b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17754a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17755b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9079b.m15926b(r8)
            goto L83
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f17759f
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            java.lang.Object r2 = r0.f17758e
            l8.d r2 = (p169l8.InterfaceC9267d) r2
            java.lang.Object r4 = r0.f17757d
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) r4
            kotlin.AbstractC9079b.m15926b(r8)     // Catch: java.lang.Throwable -> L44
            goto L6e
        L44:
            r8 = move-exception
            goto L8a
        L46:
            kotlin.AbstractC9079b.m15926b(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.d r2 = r0.getContext()
            r8.<init>(r7, r2)
            x7.p r2 = r6.f17752a     // Catch: java.lang.Throwable -> L86
            r0.f17757d = r6     // Catch: java.lang.Throwable -> L86
            r0.f17758e = r7     // Catch: java.lang.Throwable -> L86
            r0.f17759f = r8     // Catch: java.lang.Throwable -> L86
            r0.f17755b = r4     // Catch: java.lang.Throwable -> L86
            r4 = 6
            kotlin.jvm.internal.AbstractC9131s.m16126c(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
            r4 = 7
            kotlin.jvm.internal.AbstractC9131s.m16126c(r4)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L6b
            goto L82
        L6b:
            r4 = r6
            r2 = r7
            r7 = r8
        L6e:
            r7.releaseIntercepted()
            l8.c r7 = r4.f17753b
            r8 = 0
            r0.f17757d = r8
            r0.f17758e = r8
            r0.f17759f = r8
            r0.f17755b = r3
            java.lang.Object r7 = r7.collect(r2, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            h7.p r7 = p123h7.C8736p.f16368a
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(l8.d, m7.c):java.lang.Object");
    }
}

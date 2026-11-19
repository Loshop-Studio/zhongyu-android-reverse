package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements InterfaceC9266c {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9266c f17782a;

    /* renamed from: b */
    public final /* synthetic */ int f17783b;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m17801f = "Limit.kt", m17802l = {115}, m17803m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 */
    public static final class C91751 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f17784a;

        /* renamed from: b */
        public int f17785b;

        /* renamed from: d */
        public Object f17787d;

        public C91751(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17784a = obj;
            this.f17785b |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(InterfaceC9266c interfaceC9266c, int i10) {
        this.f17782a = interfaceC9266c;
        this.f17783b = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9266c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p169l8.InterfaceC9267d r9, p179m7.InterfaceC9324c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C91751
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C91751) r0
            int r1 = r0.f17785b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17785b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f17784a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17785b
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.f17787d
            kotlin.AbstractC9079b.m15926b(r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5d
        L2b:
            r10 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.AbstractC9079b.m15926b(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            l8.c r4 = r8.f17782a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1 r5 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            int r6 = r8.f17783b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r5.<init>(r2, r6, r9, r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.f17787d = r10     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.f17785b = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r9 = r4.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r9 != r1) goto L5d
            return r1
        L56:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L5a:
            p180m8.AbstractC9335h.m17167a(r10, r9)
        L5d:
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.collect(l8.d, m7.c):java.lang.Object");
    }
}

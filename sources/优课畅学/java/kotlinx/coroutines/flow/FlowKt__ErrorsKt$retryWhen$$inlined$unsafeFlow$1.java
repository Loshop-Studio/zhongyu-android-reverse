package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10576r;

/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 implements InterfaceC9266c {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9266c f17763a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10576r f17764b;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m17801f = "Errors.kt", m17802l = {116, 118}, m17803m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 */
    public static final class C91741 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f17765a;

        /* renamed from: b */
        public int f17766b;

        /* renamed from: d */
        public Object f17768d;

        /* renamed from: e */
        public Object f17769e;

        /* renamed from: f */
        public Object f17770f;

        /* renamed from: g */
        public long f17771g;

        /* renamed from: h */
        public int f17772h;

        public C91741(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17765a = obj;
            this.f17766b |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(InterfaceC9266c interfaceC9266c, InterfaceC10576r interfaceC10576r) {
        this.f17763a = interfaceC9266c;
        this.f17764b = interfaceC10576r;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:30:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009a). Please report as a decompilation issue!!! */
    @Override // p169l8.InterfaceC9266c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p169l8.InterfaceC9267d r12, p179m7.InterfaceC9324c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C91741
            if (r0 == 0) goto L13
            r0 = r13
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C91741) r0
            int r1 = r0.f17766b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17766b = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f17765a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17766b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            long r5 = r0.f17771g
            java.lang.Object r12 = r0.f17770f
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.f17769e
            l8.d r2 = (p169l8.InterfaceC9267d) r2
            java.lang.Object r7 = r0.f17768d
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.AbstractC9079b.m15926b(r13)
            goto L9a
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L42:
            int r12 = r0.f17772h
            long r5 = r0.f17771g
            java.lang.Object r2 = r0.f17769e
            l8.d r2 = (p169l8.InterfaceC9267d) r2
            java.lang.Object r7 = r0.f17768d
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.AbstractC9079b.m15926b(r13)
            goto L74
        L52:
            kotlin.AbstractC9079b.m15926b(r13)
            r5 = 0
            r13 = r11
        L58:
            l8.c r2 = r13.f17763a
            r0.f17768d = r13
            r0.f17769e = r12
            r7 = 0
            r0.f17770f = r7
            r0.f17771g = r5
            r7 = 0
            r0.f17772h = r7
            r0.f17766b = r4
            java.lang.Object r2 = p169l8.AbstractC9268e.m17016f(r2, r12, r0)
            if (r2 != r1) goto L6f
            goto L96
        L6f:
            r10 = r2
            r2 = r12
            r12 = r7
            r7 = r13
            r13 = r10
        L74:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            if (r13 == 0) goto La6
            x7.r r12 = r7.f17764b
            java.lang.Long r8 = p201o7.AbstractC9536a.m17799d(r5)
            r0.f17768d = r7
            r0.f17769e = r2
            r0.f17770f = r13
            r0.f17771g = r5
            r0.f17766b = r3
            r9 = 6
            kotlin.jvm.internal.AbstractC9131s.m16126c(r9)
            java.lang.Object r12 = r12.invoke(r2, r13, r8, r0)
            r8 = 7
            kotlin.jvm.internal.AbstractC9131s.m16126c(r8)
            if (r12 != r1) goto L97
        L96:
            return r1
        L97:
            r10 = r13
            r13 = r12
            r12 = r10
        L9a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto La8
            r12 = 1
            long r5 = r5 + r12
            r12 = r4
        La6:
            r13 = r7
            goto La9
        La8:
            throw r12
        La9:
            if (r12 != 0) goto Lae
            h7.p r12 = p123h7.C8736p.f16368a
            return r12
        Lae:
            r12 = r2
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.collect(l8.d, m7.c):java.lang.Object");
    }
}

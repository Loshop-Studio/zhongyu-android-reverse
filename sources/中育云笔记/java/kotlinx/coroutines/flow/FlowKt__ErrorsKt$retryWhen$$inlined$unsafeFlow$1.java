package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9546r;
import p379vd.InterfaceC11594c;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 implements InterfaceC11594c {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11594c f23690c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9546r f23691d;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m26211f = "Errors.kt", m26212l = {113, 115}, m26213m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 */
    public static final class C100171 extends ContinuationImpl {

        /* renamed from: c */
        public /* synthetic */ Object f23692c;

        /* renamed from: d */
        public int f23693d;

        /* renamed from: f */
        public Object f23695f;

        /* renamed from: g */
        public Object f23696g;

        /* renamed from: h */
        public Object f23697h;

        /* renamed from: i */
        public long f23698i;

        /* renamed from: j */
        public int f23699j;

        public C100171(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23692c = obj;
            this.f23693d |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(InterfaceC11594c interfaceC11594c, InterfaceC9546r interfaceC9546r) {
        this.f23690c = interfaceC11594c;
        this.f23691d = interfaceC9546r;
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
    @Override // p379vd.InterfaceC11594c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p379vd.InterfaceC11595d r12, vc.InterfaceC11588c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C100171
            if (r0 == 0) goto L13
            r0 = r13
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C100171) r0
            int r1 = r0.f23693d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23693d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f23692c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23693d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            long r5 = r0.f23698i
            java.lang.Object r12 = r0.f23697h
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.f23696g
            vd.d r2 = (p379vd.InterfaceC11595d) r2
            java.lang.Object r7 = r0.f23695f
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.AbstractC9924b.m20071b(r13)
            goto L9a
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L42:
            int r12 = r0.f23699j
            long r5 = r0.f23698i
            java.lang.Object r2 = r0.f23696g
            vd.d r2 = (p379vd.InterfaceC11595d) r2
            java.lang.Object r7 = r0.f23695f
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.AbstractC9924b.m20071b(r13)
            goto L74
        L52:
            kotlin.AbstractC9924b.m20071b(r13)
            r5 = 0
            r13 = r11
        L58:
            vd.c r2 = r13.f23690c
            r0.f23695f = r13
            r0.f23696g = r12
            r7 = 0
            r0.f23697h = r7
            r0.f23698i = r5
            r7 = 0
            r0.f23699j = r7
            r0.f23693d = r4
            java.lang.Object r2 = p379vd.AbstractC11596e.m25556f(r2, r12, r0)
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
            hd.r r12 = r7.f23691d
            java.lang.Long r8 = p409xc.AbstractC11826a.m26209d(r5)
            r0.f23695f = r7
            r0.f23696g = r2
            r0.f23697h = r13
            r0.f23698i = r5
            r0.f23693d = r3
            r9 = 6
            kotlin.jvm.internal.AbstractC9977s.m20287c(r9)
            java.lang.Object r12 = r12.invoke(r2, r13, r8, r0)
            r8 = 7
            kotlin.jvm.internal.AbstractC9977s.m20287c(r8)
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
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        Lae:
            r12 = r2
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.collect(vd.d, vc.c):java.lang.Object");
    }
}

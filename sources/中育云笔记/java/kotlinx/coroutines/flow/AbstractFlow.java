package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class AbstractFlow implements InterfaceC11594c {

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.AbstractFlow", m26211f = "Flow.kt", m26212l = {226}, m26213m = "collect")
    /* renamed from: kotlinx.coroutines.flow.AbstractFlow$collect$1 */
    public static final class C100091 extends ContinuationImpl {

        /* renamed from: c */
        public Object f23591c;

        /* renamed from: d */
        public /* synthetic */ Object f23592d;

        /* renamed from: f */
        public int f23594f;

        public C100091(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23592d = obj;
            this.f23594f |= Integer.MIN_VALUE;
            return AbstractFlow.this.collect(null, this);
        }
    }

    /* renamed from: c */
    public abstract Object mo20756c(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11594c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(p379vd.InterfaceC11595d r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractFlow.C100091
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = (kotlinx.coroutines.flow.AbstractFlow.C100091) r0
            int r1 = r0.f23594f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23594f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.AbstractFlow$collect$1 r0 = new kotlinx.coroutines.flow.AbstractFlow$collect$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23592d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23594f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f23591c
            kotlinx.coroutines.flow.internal.SafeCollector r6 = (kotlinx.coroutines.flow.internal.SafeCollector) r6
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.AbstractC9924b.m20071b(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.d r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f23591c = r7     // Catch: java.lang.Throwable -> L55
            r0.f23594f = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo20756c(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow.collect(vd.d, vc.c):java.lang.Object");
    }
}

package androidx.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class FullyDrawnReporterKt {

    @InterfaceC11829d(m26210c = "androidx.activity.FullyDrawnReporterKt", m26211f = "FullyDrawnReporter.kt", m26212l = {173}, m26213m = "reportWhenComplete")
    /* renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 */
    public static final class C01621 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01621(InterfaceC11588c<? super C01621> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, qc.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object reportWhenComplete(androidx.activity.FullyDrawnReporter r4, p181hd.InterfaceC9540l r5, vc.InterfaceC11588c<? super p309qc.C10786q> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.activity.FullyDrawnReporterKt.C01621
            if (r0 == 0) goto L13
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt.C01621) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            androidx.activity.FullyDrawnReporter r4 = (androidx.activity.FullyDrawnReporter) r4
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L5d
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.AbstractC9924b.m20071b(r6)
            r4.addReporter()
            boolean r6 = r4.isFullyDrawnReported()
            if (r6 == 0) goto L46
            qc.q r4 = p309qc.C10786q.f26013a
            return r4
        L46:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L51
            return r1
        L51:
            kotlin.jvm.internal.AbstractC9977s.m20286b(r3)
            r4.removeReporter()
            kotlin.jvm.internal.AbstractC9977s.m20285a(r3)
            qc.q r4 = p309qc.C10786q.f26013a
            return r4
        L5d:
            kotlin.jvm.internal.AbstractC9977s.m20286b(r3)
            r4.removeReporter()
            kotlin.jvm.internal.AbstractC9977s.m20285a(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.FullyDrawnReporterKt.reportWhenComplete(androidx.activity.FullyDrawnReporter, hd.l, vc.c):java.lang.Object");
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return C10786q.f26013a;
        }
        try {
            interfaceC9540l.invoke(interfaceC11588c);
            AbstractC9977s.m20286b(1);
            fullyDrawnReporter.removeReporter();
            AbstractC9977s.m20285a(1);
            return C10786q.f26013a;
        } catch (Throwable th) {
            AbstractC9977s.m20286b(1);
            fullyDrawnReporter.removeReporter();
            AbstractC9977s.m20285a(1);
            throw th;
        }
    }
}

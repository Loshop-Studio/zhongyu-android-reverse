package androidx.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9131s;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class FullyDrawnReporterKt {

    @InterfaceC9539d(m17800c = "androidx.activity.FullyDrawnReporterKt", m17801f = "FullyDrawnReporter.kt", m17802l = {173}, m17803m = "reportWhenComplete")
    /* renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 */
    public static final class C00981 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00981(InterfaceC9324c<? super C00981> interfaceC9324c) {
            super(interfaceC9324c);
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
    /* JADX WARN: Type inference failed for: r4v4, types: [h7.p, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object reportWhenComplete(androidx.activity.FullyDrawnReporter r4, p300x7.InterfaceC10570l r5, p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.activity.FullyDrawnReporterKt.C00981
            if (r0 == 0) goto L13
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt.C00981) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            androidx.activity.FullyDrawnReporter r4 = (androidx.activity.FullyDrawnReporter) r4
            kotlin.AbstractC9079b.m15926b(r6)     // Catch: java.lang.Throwable -> L2d
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
            kotlin.AbstractC9079b.m15926b(r6)
            r4.addReporter()
            boolean r6 = r4.isFullyDrawnReported()
            if (r6 == 0) goto L46
            h7.p r4 = p123h7.C8736p.f16368a
            return r4
        L46:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L51
            return r1
        L51:
            kotlin.jvm.internal.AbstractC9131s.m16125b(r3)
            r4.removeReporter()
            kotlin.jvm.internal.AbstractC9131s.m16124a(r3)
            h7.p r4 = p123h7.C8736p.f16368a
            return r4
        L5d:
            kotlin.jvm.internal.AbstractC9131s.m16125b(r3)
            r4.removeReporter()
            kotlin.jvm.internal.AbstractC9131s.m16124a(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.FullyDrawnReporterKt.reportWhenComplete(androidx.activity.FullyDrawnReporter, x7.l, m7.c):java.lang.Object");
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return C8736p.f16368a;
        }
        try {
            interfaceC10570l.invoke(interfaceC9324c);
            AbstractC9131s.m16125b(1);
            fullyDrawnReporter.removeReporter();
            AbstractC9131s.m16124a(1);
            return C8736p.f16368a;
        } catch (Throwable th) {
            AbstractC9131s.m16125b(1);
            fullyDrawnReporter.removeReporter();
            AbstractC9131s.m16124a(1);
            throw th;
        }
    }
}

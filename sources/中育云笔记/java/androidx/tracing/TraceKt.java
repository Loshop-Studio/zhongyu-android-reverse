package androidx.tracing;

import com.taobao.sophix.PatchStatus;
import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class TraceKt {

    @InterfaceC11829d(m26210c = "androidx.tracing.TraceKt", m26211f = "Trace.kt", m26212l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m26213m = "traceAsync")
    /* renamed from: androidx.tracing.TraceKt$traceAsync$1 */
    public static final class C46521<T> extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C46521(InterfaceC11588c<? super C46521> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraceKt.traceAsync(null, 0, null, this);
        }
    }

    public static final <T> T trace(String label, InterfaceC9529a block) {
        AbstractC9979u.m20294g(label, "label");
        AbstractC9979u.m20294g(block, "block");
        Trace.beginSection(label);
        try {
            return (T) block.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            Trace.endSection();
            AbstractC9977s.m20285a(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object traceAsync(java.lang.String r4, int r5, p181hd.InterfaceC9540l r6, vc.InterfaceC11588c<? super T> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.tracing.TraceKt.C46521
            if (r0 == 0) goto L13
            r0 = r7
            androidx.tracing.TraceKt$traceAsync$1 r0 = (androidx.tracing.TraceKt.C46521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.tracing.TraceKt$traceAsync$1 r0 = new androidx.tracing.TraceKt$traceAsync$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r5 = r0.I$0
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Throwable -> L2f
            goto L4c
        L2f:
            r6 = move-exception
            goto L56
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.AbstractC9924b.m20071b(r7)
            androidx.tracing.Trace.beginAsyncSection(r4, r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2f
            r0.I$0 = r5     // Catch: java.lang.Throwable -> L2f
            r0.label = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L4c
            return r1
        L4c:
            kotlin.jvm.internal.AbstractC9977s.m20286b(r3)
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            kotlin.jvm.internal.AbstractC9977s.m20285a(r3)
            return r7
        L56:
            kotlin.jvm.internal.AbstractC9977s.m20286b(r3)
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            kotlin.jvm.internal.AbstractC9977s.m20285a(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceKt.traceAsync(java.lang.String, int, hd.l, vc.c):java.lang.Object");
    }

    private static final <T> Object traceAsync$$forInline(String str, int i10, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super T> interfaceC11588c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Trace.beginAsyncSection(str, i10);
        try {
            return interfaceC9540l.invoke(interfaceC11588c);
        } finally {
            AbstractC9977s.m20286b(1);
            Trace.endAsyncSection(str, i10);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final <T> T trace(InterfaceC9529a lazyLabel, InterfaceC9529a block) {
        AbstractC9979u.m20294g(lazyLabel, "lazyLabel");
        AbstractC9979u.m20294g(block, "block");
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            Trace.beginSection((String) lazyLabel.invoke());
        }
        try {
            return (T) block.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            if (zIsEnabled) {
                Trace.endSection();
            }
            AbstractC9977s.m20285a(1);
        }
    }

    public static final <T> T traceAsync(InterfaceC9529a lazyMethodName, InterfaceC9529a lazyCookie, InterfaceC9529a block) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        int iIntValue;
        AbstractC9979u.m20294g(lazyMethodName, "lazyMethodName");
        AbstractC9979u.m20294g(lazyCookie, "lazyCookie");
        AbstractC9979u.m20294g(block, "block");
        if (Trace.isEnabled()) {
            str = (String) lazyMethodName.invoke();
            iIntValue = ((Number) lazyCookie.invoke()).intValue();
            Trace.beginAsyncSection(str, iIntValue);
        } else {
            str = null;
            iIntValue = 0;
        }
        try {
            return (T) block.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            if (str != null) {
                Trace.endAsyncSection(str, iIntValue);
            }
            AbstractC9977s.m20285a(1);
        }
    }
}

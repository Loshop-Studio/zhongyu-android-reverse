package androidx.tracing;

import java.lang.reflect.InvocationTargetException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class TraceKt {

    @InterfaceC9539d(m17800c = "androidx.tracing.TraceKt", m17801f = "Trace.kt", m17802l = {76}, m17803m = "traceAsync")
    /* renamed from: androidx.tracing.TraceKt$traceAsync$1 */
    public static final class C47031<T> extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C47031(InterfaceC9324c<? super C47031> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraceKt.traceAsync(null, 0, null, this);
        }
    }

    public static final <T> T trace(String label, InterfaceC10559a block) {
        AbstractC9133u.m16133g(label, "label");
        AbstractC9133u.m16133g(block, "block");
        Trace.beginSection(label);
        try {
            return (T) block.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            Trace.endSection();
            AbstractC9131s.m16124a(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object traceAsync(java.lang.String r4, int r5, p300x7.InterfaceC10570l r6, p179m7.InterfaceC9324c<? super T> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.tracing.TraceKt.C47031
            if (r0 == 0) goto L13
            r0 = r7
            androidx.tracing.TraceKt$traceAsync$1 r0 = (androidx.tracing.TraceKt.C47031) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r5 = r0.I$0
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L2f
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
            kotlin.AbstractC9079b.m15926b(r7)
            androidx.tracing.Trace.beginAsyncSection(r4, r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2f
            r0.I$0 = r5     // Catch: java.lang.Throwable -> L2f
            r0.label = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L4c
            return r1
        L4c:
            kotlin.jvm.internal.AbstractC9131s.m16125b(r3)
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            kotlin.jvm.internal.AbstractC9131s.m16124a(r3)
            return r7
        L56:
            kotlin.jvm.internal.AbstractC9131s.m16125b(r3)
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            kotlin.jvm.internal.AbstractC9131s.m16124a(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceKt.traceAsync(java.lang.String, int, x7.l, m7.c):java.lang.Object");
    }

    private static final <T> Object traceAsync$$forInline(String str, int i10, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super T> interfaceC9324c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Trace.beginAsyncSection(str, i10);
        try {
            return interfaceC10570l.invoke(interfaceC9324c);
        } finally {
            AbstractC9131s.m16125b(1);
            Trace.endAsyncSection(str, i10);
            AbstractC9131s.m16124a(1);
        }
    }

    public static final <T> T trace(InterfaceC10559a lazyLabel, InterfaceC10559a block) {
        AbstractC9133u.m16133g(lazyLabel, "lazyLabel");
        AbstractC9133u.m16133g(block, "block");
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            Trace.beginSection((String) lazyLabel.invoke());
        }
        try {
            return (T) block.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            if (zIsEnabled) {
                Trace.endSection();
            }
            AbstractC9131s.m16124a(1);
        }
    }

    public static final <T> T traceAsync(InterfaceC10559a lazyMethodName, InterfaceC10559a lazyCookie, InterfaceC10559a block) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        int iIntValue;
        AbstractC9133u.m16133g(lazyMethodName, "lazyMethodName");
        AbstractC9133u.m16133g(lazyCookie, "lazyCookie");
        AbstractC9133u.m16133g(block, "block");
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
            AbstractC9131s.m16125b(1);
            if (str != null) {
                Trace.endAsyncSection(str, iIntValue);
            }
            AbstractC9131s.m16124a(1);
        }
    }
}

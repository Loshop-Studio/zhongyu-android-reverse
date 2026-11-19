package androidx.tracing;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u001aI\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u001e\b\u0004\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0086Hø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0013\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u0014"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "label", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lr6/a;)Ljava/lang/Object;", "lazyLabel", "(Lr6/a;Lr6/a;)Ljava/lang/Object;", "methodName", "", "cookie", "Lkotlin/Function1;", "Lh6/c;", "", "traceAsync", "(Ljava/lang/String;ILr6/c;Lh6/c;)Ljava/lang/Object;", "lazyMethodName", "lazyCookie", "(Lr6/a;Lr6/a;Lr6/a;)Ljava/lang/Object;", "tracing-ktx_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class TraceKt {

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @DebugMetadata(m5302c = "androidx.tracing.TraceKt", m5303f = "Trace.kt", m5304i = {0, 0}, m5305l = {76}, m5306m = "traceAsync", m5307n = {"methodName", "cookie"}, m5308s = {"L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Trace.kt\nandroidx/tracing/TraceKt$traceAsync$1\n*L\n1#1,111:1\n*E\n"})
    /* renamed from: androidx.tracing.TraceKt$traceAsync$1 */
    public static final class C29811<T> extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C29811(InterfaceC5631c<? super C29811> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraceKt.traceAsync(null, 0, null, this);
        }
    }

    public static final <T> T trace(@NotNull String label, @NotNull InterfaceC6469a block) {
        AbstractC5830k.m5330g(label, "label");
        AbstractC5830k.m5330g(block, "block");
        Trace.beginSection(label);
        try {
            return (T) block.invoke();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object traceAsync(@org.jetbrains.annotations.NotNull java.lang.String r4, int r5, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r6, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super T> r7) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            boolean r0 = r7 instanceof androidx.tracing.TraceKt.C29811
            if (r0 == 0) goto L13
            r0 = r7
            androidx.tracing.TraceKt$traceAsync$1 r0 = (androidx.tracing.TraceKt.C29811) r0
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.I$0
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.AbstractC5774b.m5119b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4a
        L2d:
            r6 = move-exception
            goto L4e
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.AbstractC5774b.m5119b(r7)
            androidx.tracing.Trace.beginAsyncSection(r4, r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2d
            r0.I$0 = r5     // Catch: java.lang.Throwable -> L2d
            r0.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r7 != r1) goto L4a
            return r1
        L4a:
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            return r7
        L4e:
            androidx.tracing.Trace.endAsyncSection(r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.tracing.TraceKt.traceAsync(java.lang.String, int, r6.c, h6.c):java.lang.Object");
    }

    private static final <T> Object traceAsync$$forInline(String str, int i, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super T> interfaceC5631c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Trace.beginAsyncSection(str, i);
        try {
            return interfaceC6471c.invoke(interfaceC5631c);
        } finally {
            Trace.endAsyncSection(str, i);
        }
    }

    public static final <T> T trace(@NotNull InterfaceC6469a lazyLabel, @NotNull InterfaceC6469a block) {
        AbstractC5830k.m5330g(lazyLabel, "lazyLabel");
        AbstractC5830k.m5330g(block, "block");
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            Trace.beginSection((String) lazyLabel.invoke());
        }
        try {
            return (T) block.invoke();
        } finally {
            if (zIsEnabled) {
                Trace.endSection();
            }
        }
    }

    public static final <T> T traceAsync(@NotNull InterfaceC6469a lazyMethodName, @NotNull InterfaceC6469a lazyCookie, @NotNull InterfaceC6469a block) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        int iIntValue;
        AbstractC5830k.m5330g(lazyMethodName, "lazyMethodName");
        AbstractC5830k.m5330g(lazyCookie, "lazyCookie");
        AbstractC5830k.m5330g(block, "block");
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
            if (str != null) {
                Trace.endAsyncSection(str, iIntValue);
            }
        }
    }
}

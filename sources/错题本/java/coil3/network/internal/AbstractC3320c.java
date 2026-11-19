package coil3.network.internal;

/* renamed from: coil3.network.internal.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3320c {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2249a(coil3.network.C3325n r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws java.lang.Exception {
        /*
            boolean r0 = r5 instanceof coil3.network.internal.UtilsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = (coil3.network.internal.UtilsKt$readBuffer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = new coil3.network.internal.UtilsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            okio.Buffer r4 = (okio.Buffer) r4
            java.lang.Object r0 = r0.L$0
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            kotlin.AbstractC5774b.m5119b(r5)     // Catch: java.lang.Throwable -> L2f
            goto L53
        L2f:
            r4 = move-exception
            goto L5d
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.AbstractC5774b.m5119b(r5)
            okio.Buffer r5 = new okio.Buffer     // Catch: java.lang.Throwable -> L5b
            r5.<init>()     // Catch: java.lang.Throwable -> L5b
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L5b
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L5b
            r0.label = r3     // Catch: java.lang.Throwable -> L5b
            okio.BufferedSource r0 = r4.f2030a     // Catch: java.lang.Throwable -> L5b
            r0.readAll(r5)     // Catch: java.lang.Throwable -> L5b
            d6.s r0 = p045d6.C5443s.f8405a     // Catch: java.lang.Throwable -> L5b
            if (r0 != r1) goto L51
            return r1
        L51:
            r0 = r4
            r4 = r5
        L53:
            r5 = 0
            p073h4.AbstractC5625a.m4943c(r0, r5)
            return r4
        L58:
            r0 = r4
            r4 = r5
            goto L5d
        L5b:
            r5 = move-exception
            goto L58
        L5d:
            throw r4     // Catch: java.lang.Throwable -> L5e
        L5e:
            r5 = move-exception
            p073h4.AbstractC5625a.m4943c(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.internal.AbstractC3320c.m2249a(coil3.network.n, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

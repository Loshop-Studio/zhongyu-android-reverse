package kotlinx.coroutines;

/* loaded from: classes6.dex */
public abstract class AwaitKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20371a(java.util.Collection r4, vc.InterfaceC11588c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.AwaitKt$joinAll$3
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = (kotlinx.coroutines.AwaitKt$joinAll$3) r0
            int r1 = r0.f23475e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23475e = r1
            goto L18
        L13:
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = new kotlinx.coroutines.AwaitKt$joinAll$3
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f23474d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23475e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f23473c
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.AbstractC9924b.m20071b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.AbstractC9924b.m20071b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.g r5 = (kotlinx.coroutines.InterfaceC10045g) r5
            r0.f23473c = r4
            r0.f23475e = r3
            java.lang.Object r5 = r5.mo20458v(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            qc.q r4 = p309qc.C10786q.f26013a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AwaitKt.m20371a(java.util.Collection, vc.c):java.lang.Object");
    }
}

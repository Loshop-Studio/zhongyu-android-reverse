package coil3.network.okhttp.internal;

import okhttp3.C6338z;

/* renamed from: coil3.network.okhttp.internal.a */
/* loaded from: classes2.dex */
public final class C3326a {

    /* renamed from: a */
    public final C6338z f2031a;

    public /* synthetic */ C3326a(C6338z c6338z) {
        this.f2031a = c6338z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m2260a(okhttp3.C6338z r8, coil3.network.C3323l r9, p152r6.InterfaceC6473e r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1
            if (r0 == 0) goto L13
            r0 = r11
            coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1 r0 = (coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1 r0 = new coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$0
            java.io.Closeable r8 = (java.io.Closeable) r8
            kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.lang.Throwable -> L33
            goto La7
        L33:
            r9 = move-exception
            goto Laf
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.L$0
            r6.e r8 = (p152r6.InterfaceC6473e) r8
            kotlin.AbstractC5774b.m5119b(r11)
            goto L91
        L46:
            java.lang.Object r8 = r0.L$1
            okhttp3.d r8 = (okhttp3.InterfaceC6290d) r8
            java.lang.Object r9 = r0.L$0
            r10 = r9
            r6.e r10 = (p152r6.InterfaceC6473e) r10
            kotlin.AbstractC5774b.m5119b(r11)
            goto L63
        L53:
            kotlin.AbstractC5774b.m5119b(r11)
            r0.L$0 = r10
            r0.L$1 = r8
            r0.label = r5
            okhttp3.c0 r11 = coil3.network.okhttp.internal.AbstractC3329d.m2262b(r9, r0)
            if (r11 != r1) goto L63
            goto La5
        L63:
            okhttp3.c0 r11 = (okhttp3.C6289c0) r11
            okhttp3.z r8 = (okhttp3.C6338z) r8
            okhttp3.internal.connection.i r8 = r8.m5983c(r11)
            r0.L$0 = r10
            r0.L$1 = r6
            r0.label = r4
            kotlinx.coroutines.g r9 = new kotlinx.coroutines.g
            h6.c r11 = p185v7.AbstractC6683l.m6374n(r0)
            r9.<init>(r5, r11)
            r9.m5584u()
            coil3.network.okhttp.internal.b r11 = new coil3.network.okhttp.internal.b
            r2 = 0
            r11.<init>(r2, r8, r9)
            r8.m5913g(r11)
            r9.mo4966m(r11)
            java.lang.Object r11 = r9.m5583t()
            if (r11 != r1) goto L90
            goto La5
        L90:
            r8 = r10
        L91:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            okhttp3.i0 r10 = (okhttp3.C6301i0) r10     // Catch: java.lang.Throwable -> Lab
            coil3.network.m r10 = coil3.network.okhttp.internal.AbstractC3329d.m2261a(r10)     // Catch: java.lang.Throwable -> Lab
            r0.L$0 = r9     // Catch: java.lang.Throwable -> Lab
            r0.label = r3     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch: java.lang.Throwable -> Lab
            if (r11 != r1) goto La6
        La5:
            return r1
        La6:
            r8 = r9
        La7:
            coil3.network.AbstractC3315g.m2237e(r8, r6)
            return r11
        Lab:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Laf:
            throw r9     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r10 = move-exception
            coil3.network.AbstractC3315g.m2237e(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.C3326a.m2260a(okhttp3.z, coil3.network.l, r6.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3326a) {
            return this.f2031a.equals(((C3326a) obj).f2031a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2031a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f2031a + ')';
    }
}

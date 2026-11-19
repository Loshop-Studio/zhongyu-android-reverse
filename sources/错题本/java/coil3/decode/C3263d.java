package coil3.decode;

import p076h7.C5642e;
import p154s.C6538l;

/* renamed from: coil3.decode.d */
/* loaded from: classes2.dex */
public final class C3263d implements InterfaceC3269j {

    /* renamed from: a */
    public final InterfaceC3275p f1895a;

    /* renamed from: b */
    public final C6538l f1896b;

    /* renamed from: c */
    public final C5642e f1897c;

    /* renamed from: d */
    public final C3272m f1898d;

    public C3263d(InterfaceC3275p interfaceC3275p, C6538l c6538l, C5642e c5642e, C3272m c3272m) {
        this.f1895a = interfaceC3275p;
        this.f1896b = c6538l;
        this.f1897c = c5642e;
        this.f1898d = c3272m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [h7.d] */
    @Override // coil3.decode.InterfaceC3269j
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2191a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof coil3.decode.BitmapFactoryDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = (coil3.decode.BitmapFactoryDecoder$decode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.decode.BitmapFactoryDecoder$decode$1 r0 = new coil3.decode.BitmapFactoryDecoder$decode$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            h7.d r0 = (p076h7.InterfaceC5641d) r0
            kotlin.AbstractC5774b.m5119b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L65
        L2e:
            r7 = move-exception
            goto L71
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.L$0
            h7.d r2 = (p076h7.InterfaceC5641d) r2
            kotlin.AbstractC5774b.m5119b(r7)
            r7 = r2
            goto L51
        L41:
            kotlin.AbstractC5774b.m5119b(r7)
            h7.e r7 = r6.f1897c
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r2 = r7.m5618a(r0)
            if (r2 != r1) goto L51
            goto L61
        L51:
            androidx.navigation.b r2 = new androidx.navigation.b     // Catch: java.lang.Throwable -> L6d
            r4 = 5
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L6d
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L6d
            r0.label = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = kotlinx.coroutines.AbstractC6014x.m5621A(r2, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != r1) goto L62
        L61:
            return r1
        L62:
            r5 = r0
            r0 = r7
            r7 = r5
        L65:
            coil3.decode.g r7 = (coil3.decode.C3266g) r7     // Catch: java.lang.Throwable -> L2e
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C6002b) r0
            r0.m5620c()
            return r7
        L6d:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L71:
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C6002b) r0
            r0.m5620c()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.C3263d.mo2191a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

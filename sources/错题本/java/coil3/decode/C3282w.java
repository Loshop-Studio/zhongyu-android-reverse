package coil3.decode;

import android.graphics.ImageDecoder;
import p076h7.C5642e;
import p154s.C6538l;

/* renamed from: coil3.decode.w */
/* loaded from: classes2.dex */
public final class C3282w implements InterfaceC3269j {

    /* renamed from: a */
    public final ImageDecoder.Source f1929a;

    /* renamed from: b */
    public final AutoCloseable f1930b;

    /* renamed from: c */
    public final C6538l f1931c;

    /* renamed from: d */
    public final C5642e f1932d;

    public C3282w(ImageDecoder.Source source, AutoCloseable autoCloseable, C6538l c6538l, C5642e c5642e) {
        this.f1929a = source;
        this.f1930b = autoCloseable;
        this.f1931c = c6538l;
        this.f1932d = c5642e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.decode.InterfaceC3269j
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2191a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof coil3.decode.StaticImageDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.decode.StaticImageDecoder$decode$1 r0 = (coil3.decode.StaticImageDecoder$decode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.decode.StaticImageDecoder$decode$1 r0 = new coil3.decode.StaticImageDecoder$decode$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            h7.d r0 = (p076h7.InterfaceC5641d) r0
            kotlin.AbstractC5774b.m5119b(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            kotlin.AbstractC5774b.m5119b(r6)
            h7.e r6 = r5.f1932d
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r0 = r6.m5618a(r0)
            if (r0 != r1) goto L43
            return r1
        L43:
            r0 = r6
        L44:
            java.lang.AutoCloseable r6 = r5.f1930b     // Catch: java.lang.Throwable -> L6c
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L6e
            r1.<init>()     // Catch: java.lang.Throwable -> L6e
            android.graphics.ImageDecoder$Source r2 = r5.f1929a     // Catch: java.lang.Throwable -> L6e
            coil3.decode.v r3 = new coil3.decode.v     // Catch: java.lang.Throwable -> L6e
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L6e
            android.graphics.Bitmap r2 = android.view.AbstractC0090j.m193g(r2, r3)     // Catch: java.lang.Throwable -> L6e
            coil3.decode.g r3 = new coil3.decode.g     // Catch: java.lang.Throwable -> L6e
            coil3.a r4 = new coil3.a     // Catch: java.lang.Throwable -> L6e
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            boolean r1 = r1.element     // Catch: java.lang.Throwable -> L6e
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L6e
            r1 = 0
            p073h4.AbstractC5625a.m4943c(r6, r1)     // Catch: java.lang.Throwable -> L6c
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C6002b) r0
            r0.m5620c()
            return r3
        L6c:
            r6 = move-exception
            goto L75
        L6e:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L70
        L70:
            r2 = move-exception
            p073h4.AbstractC5625a.m4943c(r6, r1)     // Catch: java.lang.Throwable -> L6c
            throw r2     // Catch: java.lang.Throwable -> L6c
        L75:
            kotlinx.coroutines.sync.b r0 = (kotlinx.coroutines.sync.C6002b) r0
            r0.m5620c()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.C3282w.mo2191a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

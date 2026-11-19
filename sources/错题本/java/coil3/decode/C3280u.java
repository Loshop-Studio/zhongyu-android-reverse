package coil3.decode;

import p076h7.C5642e;

/* renamed from: coil3.decode.u */
/* loaded from: classes2.dex */
public final class C3280u implements InterfaceC3268i {

    /* renamed from: a */
    public final C5642e f1926a;

    public C3280u(C5642e c5642e) {
        this.f1926a = c5642e;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // coil3.decode.InterfaceC3268i
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final coil3.decode.InterfaceC3269j mo2190a(p119n.C6206k r7, p154s.C6538l r8) throws android.system.ErrnoException {
        /*
            r6 = this;
            android.graphics.Bitmap$Config r0 = p154s.AbstractC6534h.m6186b(r8)
            android.content.Context r1 = r8.f10894a
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r3 = 0
            if (r0 == r2) goto L11
            android.graphics.Bitmap$Config r2 = androidx.compose.p011ui.autofill.AbstractC2079b.m1112c()
            if (r0 != r2) goto L93
        L11:
            coil3.decode.p r0 = r7.f9922a
            okio.FileSystem r2 = r0.getFileSystem()
            okio.FileSystem r4 = okio.FileSystem.SYSTEM
            if (r2 != r4) goto L2a
            okio.Path r2 = r0.mo2193j()
            if (r2 == 0) goto L2a
            java.io.File r0 = r2.toFile()
            android.graphics.ImageDecoder$Source r0 = coil3.decode.AbstractC3278s.m2197d(r0)
            goto L91
        L2a:
            a.a r0 = r0.mo2192i()
            boolean r2 = r0 instanceof coil3.decode.C3260a
            if (r2 == 0) goto L3f
            android.content.res.AssetManager r1 = r1.getAssets()
            coil3.decode.a r0 = (coil3.decode.C3260a) r0
            java.lang.String r0 = r0.f1890a
            android.graphics.ImageDecoder$Source r0 = coil3.decode.AbstractC3278s.m2195b(r1, r0)
            goto L91
        L3f:
            boolean r2 = r0 instanceof coil3.decode.C3265f
            if (r2 == 0) goto L65
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r2 < r4) goto L65
            coil3.decode.f r0 = (coil3.decode.C3265f) r0     // Catch: android.system.ErrnoException -> L90
            android.content.res.AssetFileDescriptor r0 = r0.f1900a     // Catch: android.system.ErrnoException -> L90
            java.io.FileDescriptor r1 = r0.getFileDescriptor()     // Catch: android.system.ErrnoException -> L90
            long r4 = r0.getStartOffset()     // Catch: android.system.ErrnoException -> L90
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: android.system.ErrnoException -> L90
            android.system.Os.lseek(r1, r4, r2)     // Catch: android.system.ErrnoException -> L90
            o5.a r1 = new o5.a     // Catch: android.system.ErrnoException -> L90
            r2 = 2
            r1.<init>(r0, r2)     // Catch: android.system.ErrnoException -> L90
            android.graphics.ImageDecoder$Source r0 = androidx.transition.AbstractC3018c.m1984f(r1)     // Catch: android.system.ErrnoException -> L90
            goto L91
        L65:
            boolean r2 = r0 instanceof coil3.decode.C3276q
            if (r2 == 0) goto L83
            r2 = r0
            coil3.decode.q r2 = (coil3.decode.C3276q) r2
            java.lang.String r4 = r2.f1919a
            java.lang.String r5 = r1.getPackageName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L83
            android.content.res.Resources r0 = r1.getResources()
            int r1 = r2.f1920b
            android.graphics.ImageDecoder$Source r0 = coil3.decode.AbstractC3278s.m2196c(r0, r1)
            goto L91
        L83:
            boolean r1 = r0 instanceof coil3.decode.C3264e
            if (r1 == 0) goto L90
            coil3.decode.e r0 = (coil3.decode.C3264e) r0
            java.nio.ByteBuffer r0 = r0.f1899a
            android.graphics.ImageDecoder$Source r0 = coil3.decode.AbstractC3278s.m2198e(r0)
            goto L91
        L90:
            r0 = r3
        L91:
            if (r0 != 0) goto L94
        L93:
            return r3
        L94:
            coil3.decode.w r1 = new coil3.decode.w
            coil3.decode.p r7 = r7.f9922a
            h7.e r2 = r6.f1926a
            r1.<init>(r0, r7, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.C3280u.mo2190a(n.k, s.l):coil3.decode.j");
    }
}

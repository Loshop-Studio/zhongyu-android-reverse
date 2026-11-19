package p077i0;

import com.bumptech.glide.load.EncodeStrategy;
import p024c0.C3210g;
import p202y.C6762e;
import p202y.C6763f;
import p202y.InterfaceC6765h;

/* renamed from: i0.b */
/* loaded from: classes2.dex */
public final class C5646b implements InterfaceC6765h {

    /* renamed from: b */
    public static final C6762e f8780b = C6762e.m6435a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c */
    public static final C6762e f8781c = new C6762e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C6762e.f11430e);

    /* renamed from: a */
    public final C3210g f8782a;

    public C5646b(C3210g c3210g) {
        this.f8782a = c3210g;
    }

    @Override // p202y.InterfaceC6765h
    /* renamed from: g */
    public final EncodeStrategy mo113g(C6763f c6763f) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    @Override // p202y.InterfaceC6758a
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo124s(java.lang.Object r10, java.io.File r11, p202y.C6763f r12) throws java.lang.Throwable {
        /*
            r9 = this;
            b0.g0 r10 = (p016b0.InterfaceC3072g0) r10
            c0.g r0 = r9.f8782a
            java.lang.String r1 = "BitmapEncoder"
            java.lang.Object r10 = r10.get()
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            y.e r2 = p077i0.C5646b.f8781c
            java.lang.Object r3 = r12.m6436c(r2)
            android.graphics.Bitmap$CompressFormat r3 = (android.graphics.Bitmap.CompressFormat) r3
            if (r3 == 0) goto L17
            goto L22
        L17:
            boolean r3 = r10.hasAlpha()
            if (r3 == 0) goto L20
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG
            goto L22
        L20:
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
        L22:
            r10.getWidth()
            r10.getHeight()
            int r4 = p180v0.AbstractC6659f.f11234b
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            y.e r6 = p077i0.C5646b.f8780b
            java.lang.Object r6 = r12.m6436c(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = 0
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            z.c r7 = new z.c     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5b
            r7.<init>(r8, r0)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5b
            r10.compress(r3, r6, r7)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r7.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            r7.close()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L52
            goto L52
        L4f:
            r10 = move-exception
            goto Lbe
        L52:
            r11 = 1
            goto L6f
        L54:
            r10 = move-exception
            goto Lb8
        L56:
            r11 = move-exception
            goto L5d
        L58:
            r10 = move-exception
            r7 = r8
            goto Lb8
        L5b:
            r11 = move-exception
            r7 = r8
        L5d:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L69
            java.lang.String r0 = "Failed to encode Bitmap"
            android.util.Log.d(r1, r0, r11)     // Catch: java.lang.Throwable -> L54
        L69:
            if (r7 == 0) goto L6e
            r7.close()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L6e
        L6e:
            r11 = 0
        L6f:
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto Lb7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r0.<init>(r6)
            r0.append(r3)
            java.lang.String r3 = " of size "
            r0.append(r3)
            int r3 = p180v0.AbstractC6664k.m6323c(r10)
            r0.append(r3)
            java.lang.String r3 = " in "
            r0.append(r3)
            double r3 = p180v0.AbstractC6659f.m6315a(r4)
            r0.append(r3)
            java.lang.String r3 = ", options format: "
            r0.append(r3)
            java.lang.Object r12 = r12.m6436c(r2)
            r0.append(r12)
            java.lang.String r12 = ", hasAlpha: "
            r0.append(r12)
            boolean r10 = r10.hasAlpha()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            android.util.Log.v(r1, r10)
        Lb7:
            return r11
        Lb8:
            if (r7 == 0) goto Lbf
            r7.close()     // Catch: java.lang.Throwable -> L4f java.io.IOException -> Lbf
            goto Lbf
        Lbe:
            throw r10
        Lbf:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p077i0.C5646b.mo124s(java.lang.Object, java.io.File, y.f):boolean");
    }
}

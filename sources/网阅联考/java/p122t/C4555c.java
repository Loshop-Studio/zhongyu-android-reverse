package p122t;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import p076j.C3793c;
import p076j.C3794d;
import p076j.InterfaceC3796f;
import p098n.InterfaceC4393b;

/* renamed from: t.c */
/* loaded from: classes2.dex */
public class C4555c implements InterfaceC3796f {

    /* renamed from: b */
    public static final C3793c f5723b = C3793c.m4945f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C3793c f5724c = C3793c.m4944e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    public final InterfaceC4393b f5725a;

    public C4555c(InterfaceC4393b interfaceC4393b) {
        this.f5725a = interfaceC4393b;
    }

    @Override // p076j.InterfaceC3796f
    /* renamed from: b */
    public EncodeStrategy mo4954b(C3794d c3794d) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #2 {all -> 0x00b2, blocks: (B:3:0x0021, B:12:0x004b, B:25:0x0063, B:27:0x0069, B:31:0x00ae, B:32:0x00b1, B:22:0x005e), top: B:42:0x0021 }] */
    @Override // p076j.InterfaceC3791a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo4941a(p093m.InterfaceC4361j r8, java.io.File r9, p076j.C3794d r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.m6265d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p067h0.AbstractC3763b.m4861c(r4, r2, r3, r1)
            long r2 = p062g0.AbstractC3745e.m4752b()     // Catch: java.lang.Throwable -> Lb2
            j.c r4 = p122t.C4555c.f5723b     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r4 = r10.m4951c(r4)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lb2
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lb2
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            n.b r9 = r7.f5725a     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            if (r9 == 0) goto L44
            k.c r9 = new k.c     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            n.b r5 = r7.f5725a     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r5 = r9
            goto L45
        L44:
            r5 = r6
        L45:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.close()     // Catch: java.io.IOException -> L4e java.lang.Throwable -> Lb2
        L4e:
            r9 = 1
            goto L62
        L50:
            r8 = move-exception
            r5 = r6
            goto Lac
        L53:
            r5 = r6
            goto L57
        L55:
            r8 = move-exception
            goto Lac
        L57:
            r9 = 3
            boolean r9 = android.util.Log.isLoggable(r0, r9)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.io.IOException -> L61 java.lang.Throwable -> Lb2
        L61:
            r9 = 0
        L62:
            r4 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto La8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r0.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r4 = "Compressed with type: "
            r0.append(r4)     // Catch: java.lang.Throwable -> Lb2
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = " of size "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb2
            int r1 = p062g0.AbstractC3750j.m4776g(r8)     // Catch: java.lang.Throwable -> Lb2
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = " in "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb2
            double r1 = p062g0.AbstractC3745e.m4751a(r2)     // Catch: java.lang.Throwable -> Lb2
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r1 = ", options format: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lb2
            j.c r1 = p122t.C4555c.f5724c     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r10 = r10.m4951c(r1)     // Catch: java.lang.Throwable -> Lb2
            r0.append(r10)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r10 = ", hasAlpha: "
            r0.append(r10)     // Catch: java.lang.Throwable -> Lb2
            boolean r8 = r8.hasAlpha()     // Catch: java.lang.Throwable -> Lb2
            r0.append(r8)     // Catch: java.lang.Throwable -> Lb2
        La8:
            p067h0.AbstractC3763b.m4862d()
            return r9
        Lac:
            if (r5 == 0) goto Lb1
            r5.close()     // Catch: java.io.IOException -> Lb1 java.lang.Throwable -> Lb2
        Lb1:
            throw r8     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r8 = move-exception
            p067h0.AbstractC3763b.m4862d()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p122t.C4555c.mo4941a(m.j, java.io.File, j.d):boolean");
    }

    /* renamed from: d */
    public final Bitmap.CompressFormat m6265d(Bitmap bitmap, C3794d c3794d) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c3794d.m4951c(f5724c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}

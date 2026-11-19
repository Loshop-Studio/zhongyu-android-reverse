package p228r0;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import p122h0.C8083c;
import p122h0.C8084d;
import p122h0.InterfaceC8086f;
import p164l0.InterfaceC8865b;

/* renamed from: r0.c */
/* loaded from: classes3.dex */
public class C9393c implements InterfaceC8086f {

    /* renamed from: b */
    public static final C8083c f16383b = C8083c.m12902f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C8083c f16384c = C8083c.m12901e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    public final InterfaceC8865b f16385a;

    public C9393c(InterfaceC8865b interfaceC8865b) {
        this.f16385a = interfaceC8865b;
    }

    @Override // p122h0.InterfaceC8086f
    /* renamed from: b */
    public EncodeStrategy mo12911b(C8084d c8084d) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #4 {all -> 0x0054, blocks: (B:3:0x0021, B:15:0x0050, B:28:0x0065, B:30:0x006b, B:34:0x0086, B:35:0x0089, B:25:0x0060), top: B:46:0x0021 }] */
    @Override // p122h0.InterfaceC8081a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo12898a(p152k0.InterfaceC8259j r8, java.io.File r9, p122h0.C8084d r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.m15463d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p102f1.AbstractC7910b.m12446c(r4, r2, r3, r1)
            long r2 = p091e1.AbstractC7833e.m12240b()     // Catch: java.lang.Throwable -> L54
            h0.c r4 = p228r0.C9393c.f16383b     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r10.m12908c(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L54
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L54
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            l0.b r9 = r7.f16385a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            if (r9 == 0) goto L49
            i0.c r9 = new i0.c     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            l0.b r5 = r7.f16385a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            r5 = r9
            goto L4a
        L44:
            r8 = move-exception
            r5 = r6
            goto L84
        L47:
            r5 = r6
            goto L5a
        L49:
            r5 = r6
        L4a:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r5.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r5.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L56
            goto L56
        L54:
            r8 = move-exception
            goto L8a
        L56:
            r9 = 1
            goto L64
        L58:
            r8 = move-exception
            goto L84
        L5a:
            r9 = 3
            android.util.Log.isLoggable(r0, r9)     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L63
            r5.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L63
        L63:
            r9 = 0
        L64:
            r4 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L80
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L54
            p091e1.AbstractC7838j.m12264g(r8)     // Catch: java.lang.Throwable -> L54
            p091e1.AbstractC7833e.m12239a(r2)     // Catch: java.lang.Throwable -> L54
            h0.c r0 = p228r0.C9393c.f16384c     // Catch: java.lang.Throwable -> L54
            java.lang.Object r10 = r10.m12908c(r0)     // Catch: java.lang.Throwable -> L54
            java.util.Objects.toString(r10)     // Catch: java.lang.Throwable -> L54
            r8.hasAlpha()     // Catch: java.lang.Throwable -> L54
        L80:
            p102f1.AbstractC7910b.m12447d()
            return r9
        L84:
            if (r5 == 0) goto L89
            r5.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L89
        L89:
            throw r8     // Catch: java.lang.Throwable -> L54
        L8a:
            p102f1.AbstractC7910b.m12447d()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p228r0.C9393c.mo12898a(k0.j, java.io.File, h0.d):boolean");
    }

    /* renamed from: d */
    public final Bitmap.CompressFormat m15463d(Bitmap bitmap, C8084d c8084d) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c8084d.m12908c(f16384c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}

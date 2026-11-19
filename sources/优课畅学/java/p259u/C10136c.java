package p259u;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import p160l.C9229c;
import p160l.C9230d;
import p160l.InterfaceC9232f;
import p193o.InterfaceC9498b;

/* renamed from: u.c */
/* loaded from: classes3.dex */
public class C10136c implements InterfaceC9232f {

    /* renamed from: b */
    public static final C9229c f20254b = C9229c.m16935f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C9229c f20255c = C9229c.m16934e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a */
    public final InterfaceC9498b f20256a;

    public C10136c(InterfaceC9498b interfaceC9498b) {
        this.f20256a = interfaceC9498b;
    }

    @Override // p160l.InterfaceC9232f
    /* renamed from: a */
    public EncodeStrategy mo16943a(C9230d c9230d) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #4 {all -> 0x0054, blocks: (B:3:0x0021, B:15:0x0050, B:28:0x0065, B:30:0x006b, B:34:0x0086, B:35:0x0089, B:25:0x0060), top: B:46:0x0021 }] */
    @Override // p160l.InterfaceC9227a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo16931b(p182n.InterfaceC9357j r8, java.io.File r9, p160l.C9230d r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.m18971d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p127i0.AbstractC8749b.m14418d(r4, r2, r3, r1)
            long r2 = p116h0.AbstractC8702f.m14165b()     // Catch: java.lang.Throwable -> L54
            l.c r4 = p259u.C10136c.f20254b     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r10.m16940c(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L54
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L54
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            o.b r9 = r7.f20256a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            if (r9 == 0) goto L49
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            o.b r5 = r7.f20256a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
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
            p116h0.AbstractC8707k.m14190h(r8)     // Catch: java.lang.Throwable -> L54
            p116h0.AbstractC8702f.m14164a(r2)     // Catch: java.lang.Throwable -> L54
            l.c r0 = p259u.C10136c.f20255c     // Catch: java.lang.Throwable -> L54
            java.lang.Object r10 = r10.m16940c(r0)     // Catch: java.lang.Throwable -> L54
            java.util.Objects.toString(r10)     // Catch: java.lang.Throwable -> L54
            r8.hasAlpha()     // Catch: java.lang.Throwable -> L54
        L80:
            p127i0.AbstractC8749b.m14419e()
            return r9
        L84:
            if (r5 == 0) goto L89
            r5.close()     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L89
        L89:
            throw r8     // Catch: java.lang.Throwable -> L54
        L8a:
            p127i0.AbstractC8749b.m14419e()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p259u.C10136c.mo16931b(n.j, java.io.File, l.d):boolean");
    }

    /* renamed from: d */
    public final Bitmap.CompressFormat m18971d(Bitmap bitmap, C9230d c9230d) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c9230d.m16940c(f20255c);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}

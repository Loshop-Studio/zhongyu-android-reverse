package p127j0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* renamed from: j0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7773d {
    /* renamed from: a */
    public static byte[] m13116a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        byteArray = null;
        byte[] byteArray = null;
        gZIPOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream2 = gZIPOutputStream;
            }
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, bArr.length);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    return byteArray;
                }
            } catch (Exception e13) {
                e = e13;
                gZIPOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e15) {
                    e15.printStackTrace();
                    throw th;
                }
            }
        } catch (Exception e16) {
            e = e16;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e17) {
            e17.printStackTrace();
        }
        return byteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m13117b(byte[] r8) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L51
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L51
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
        L14:
            r5 = 0
            int r6 = r8.read(r3, r5, r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r7 = -1
            if (r6 == r7) goto L25
            r4.write(r3, r5, r6)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            goto L14
        L20:
            r0 = move-exception
            goto L78
        L23:
            r2 = move-exception
            goto L5d
        L25:
            r4.flush()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r4.close()     // Catch: java.lang.Exception -> L30
            goto L34
        L30:
            r2 = move-exception
            r2.printStackTrace()
        L34:
            r8.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r8 = move-exception
            r8.printStackTrace()
        L3c:
            r1.close()     // Catch: java.io.IOException -> L40
            goto L77
        L40:
            r8 = move-exception
            r8.printStackTrace()
            goto L77
        L45:
            r2 = move-exception
            r4 = r0
            r0 = r2
            goto L78
        L49:
            r2 = move-exception
            r4 = r0
            goto L5d
        L4c:
            r8 = move-exception
            r4 = r0
        L4e:
            r0 = r8
            r8 = r4
            goto L78
        L51:
            r2 = move-exception
            r8 = r0
            r4 = r8
            goto L5d
        L55:
            r8 = move-exception
            r1 = r0
            r4 = r1
            goto L4e
        L59:
            r2 = move-exception
            r8 = r0
            r1 = r8
            r4 = r1
        L5d:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L6a
            r4.close()     // Catch: java.lang.Exception -> L66
            goto L6a
        L66:
            r2 = move-exception
            r2.printStackTrace()
        L6a:
            if (r8 == 0) goto L74
            r8.close()     // Catch: java.io.IOException -> L70
            goto L74
        L70:
            r8 = move-exception
            r8.printStackTrace()
        L74:
            if (r1 == 0) goto L77
            goto L3c
        L77:
            return r0
        L78:
            if (r4 == 0) goto L82
            r4.close()     // Catch: java.lang.Exception -> L7e
            goto L82
        L7e:
            r2 = move-exception
            r2.printStackTrace()
        L82:
            if (r8 == 0) goto L8c
            r8.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r8 = move-exception
            r8.printStackTrace()
        L8c:
            if (r1 == 0) goto L96
            r1.close()     // Catch: java.io.IOException -> L92
            goto L96
        L92:
            r8 = move-exception
            r8.printStackTrace()
        L96:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p127j0.AbstractC7773d.m13117b(byte[]):byte[]");
    }
}

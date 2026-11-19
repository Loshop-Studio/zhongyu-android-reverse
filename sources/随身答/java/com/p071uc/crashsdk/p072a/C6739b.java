package com.p071uc.crashsdk.p072a;

import com.taobao.sophix.PatchStatus;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.uc.crashsdk.a.b */
/* loaded from: classes4.dex */
public final class C6739b {

    /* renamed from: a */
    private static final int[] f6333a = {126, 147, 115, 241, 101, 198, 215, PatchStatus.CODE_LOAD_LIB_LOST};

    /* renamed from: b */
    private static final int[] f6334b = {125, 185, 233, 226, 129, 142, 151, 176};

    /* renamed from: c */
    private static final int[] f6335c = {238, 185, 233, 179, 129, 142, 151, 167};

    /* renamed from: a */
    public static String m5569a(String str) throws Throwable {
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream3.read(bArr);
                C6744g.m5612a(fileInputStream3);
                byte[] bArrM5572a = m5572a(bArr, f6333a);
                if (bArrM5572a == null || bArrM5572a.length <= 0) {
                    C6744g.m5612a((Closeable) null);
                    return null;
                }
                int length = bArrM5572a.length - 1;
                String str2 = bArrM5572a[length] == 10 ? new String(bArrM5572a, 0, length) : new String(bArrM5572a);
                C6744g.m5612a((Closeable) null);
                return str2;
            } catch (Exception e10) {
                fileInputStream = fileInputStream3;
                e = e10;
                try {
                    C6744g.m5614a(e);
                    C6744g.m5612a(fileInputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C6744g.m5612a(fileInputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream2 = fileInputStream3;
                th = th2;
                C6744g.m5612a(fileInputStream2);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: b */
    private static byte[] m5573b(byte[] bArr, int[] iArr) {
        if (bArr != null && iArr != null && iArr.length == 8) {
            int length = bArr.length;
            try {
                byte[] bArr2 = new byte[length + 2];
                byte b10 = 0;
                for (int i9 = 0; i9 < length; i9++) {
                    byte b11 = bArr[i9];
                    bArr2[i9] = (byte) (iArr[i9 % 8] ^ b11);
                    b10 = (byte) (b10 ^ b11);
                }
                bArr2[length] = (byte) (iArr[0] ^ b10);
                bArr2[length + 1] = (byte) (iArr[1] ^ b10);
                return bArr2;
            } catch (Exception e10) {
                C6744g.m5614a(e10);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r1 = com.p071uc.crashsdk.p072a.C6744g.m5632e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m5570a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            if (r9 != 0) goto L4
            goto Lbd
        L4:
            boolean r0 = com.p071uc.crashsdk.p072a.C6744g.m5619a(r7)
            if (r0 == 0) goto Lc
            goto Lbd
        Lc:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Lbd
            long r1 = r0.length()
            r3 = 3145728(0x300000, double:1.554196E-317)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L24
            goto Lbd
        L24:
            byte[] r1 = com.p071uc.crashsdk.p072a.C6744g.m5632e(r0)
            if (r1 == 0) goto Lbd
            int r2 = r1.length
            if (r2 > 0) goto L2f
            goto Lbd
        L2f:
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L86
            r9 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L52
            r4.<init>()     // Catch: java.lang.Throwable -> L52
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            r5.write(r1)     // Catch: java.lang.Throwable -> L4b
            r4.flush()     // Catch: java.lang.Throwable -> L4b
        L44:
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r4)
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r5)
            goto L5a
        L4b:
            r9 = move-exception
            goto L56
        L4d:
            r5 = move-exception
            r6 = r5
            r5 = r9
            r9 = r6
            goto L56
        L52:
            r4 = move-exception
            r5 = r9
            r9 = r4
            r4 = r5
        L56:
            com.p071uc.crashsdk.p072a.C6744g.m5614a(r9)     // Catch: java.lang.Throwable -> L7e
            goto L44
        L5a:
            byte[] r1 = r4.toByteArray()     // Catch: java.lang.Throwable -> L60
            r9 = r2
            goto L65
        L60:
            r9 = move-exception
            com.p071uc.crashsdk.p072a.C6744g.m5614a(r9)
            r9 = r3
        L65:
            if (r9 == 0) goto Lbd
            if (r1 == 0) goto Lbd
            int r9 = r1.length
            if (r9 > 0) goto L6d
            goto Lbd
        L6d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = r2
            goto L88
        L7e:
            r7 = move-exception
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r4)
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r5)
            throw r7
        L86:
            r8 = r7
            r9 = r3
        L88:
            if (r9 == 0) goto Lbd
            java.lang.String r9 = r0.getName()
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto La6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r3 = ".tmp"
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            goto La8
        La6:
            r9 = r8
            r2 = r3
        La8:
            java.io.File r3 = new java.io.File
            r3.<init>(r9)
            boolean r9 = com.p071uc.crashsdk.p072a.C6744g.m5618a(r3, r1)
            if (r9 != 0) goto Lb4
            goto Lbd
        Lb4:
            if (r2 == 0) goto Lbc
            r0.delete()
            r3.renameTo(r0)
        Lbc:
            return r8
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.p072a.C6739b.m5570a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    private static byte[] m5572a(byte[] bArr, int[] iArr) {
        if (bArr.length >= 2 && iArr != null && iArr.length == 8) {
            int length = bArr.length;
            int i9 = length - 2;
            try {
                byte[] bArr2 = new byte[i9];
                byte b10 = 0;
                for (int i10 = 0; i10 < i9; i10++) {
                    byte b11 = (byte) (bArr[i10] ^ iArr[i10 % 8]);
                    bArr2[i10] = b11;
                    b10 = (byte) (b10 ^ b11);
                }
                if (bArr[i9] == ((byte) ((iArr[0] ^ b10) & 255)) && bArr[length - 1] == ((byte) ((iArr[1] ^ b10) & 255))) {
                    return bArr2;
                }
                return null;
            } catch (Exception e10) {
                C6744g.m5614a(e10);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m5571a(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            C6744g.m5614a(th);
            fileOutputStream = null;
        }
        if (fileOutputStream == null) {
            return false;
        }
        byte[] bArrM5573b = m5573b(str2.getBytes(), f6333a);
        if (bArrM5573b == null) {
            return false;
        }
        try {
            fileOutputStream.write(bArrM5573b);
            C6744g.m5612a(fileOutputStream);
            return true;
        } catch (Throwable th2) {
            try {
                C6744g.m5614a(th2);
                return false;
            } finally {
                C6744g.m5612a(fileOutputStream);
            }
        }
    }
}

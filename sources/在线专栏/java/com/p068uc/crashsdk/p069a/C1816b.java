package com.p068uc.crashsdk.p069a;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.uc.crashsdk.a.b */
/* loaded from: classes.dex */
public final class C1816b {

    /* renamed from: a */
    private static final int[] f7927a = {126, 147, 115, 241, 101, 198, 215, 134};

    /* renamed from: b */
    private static final int[] f7928b = {125, 185, 233, 226, 129, 142, 151, 176};

    /* renamed from: c */
    private static final int[] f7929c = {238, 185, 233, 179, 129, 142, 151, 167};

    /* renamed from: a */
    public static String m6248a(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        File file = new File(str);
        FileInputStream fileInputStream3 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream2 = new FileInputStream(file);
        } catch (Exception e4) {
            e = e4;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream2.read(bArr);
            C1821g.m6291a(fileInputStream2);
            byte[] bArrM6251a = m6251a(bArr, f7927a);
            if (bArrM6251a == null || bArrM6251a.length <= 0) {
                C1821g.m6291a((Closeable) null);
                return null;
            }
            int length = bArrM6251a.length - 1;
            String str2 = bArrM6251a[length] == 10 ? new String(bArrM6251a, 0, length) : new String(bArrM6251a);
            C1821g.m6291a((Closeable) null);
            return str2;
        } catch (Exception e5) {
            fileInputStream = fileInputStream2;
            e = e5;
            try {
                C1821g.m6293a(e);
                C1821g.m6291a(fileInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream3 = fileInputStream;
                C1821g.m6291a(fileInputStream3);
                throw th;
            }
        } catch (Throwable th3) {
            fileInputStream3 = fileInputStream2;
            th = th3;
            C1821g.m6291a(fileInputStream3);
            throw th;
        }
    }

    /* renamed from: b */
    private static byte[] m6252b(byte[] bArr, int[] iArr) {
        if (bArr != null && iArr != null && iArr.length == 8) {
            int length = bArr.length;
            try {
                byte[] bArr2 = new byte[length + 2];
                byte b4 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    byte b5 = bArr[i4];
                    bArr2[i4] = (byte) (iArr[i4 % 8] ^ b5);
                    b4 = (byte) (b4 ^ b5);
                }
                bArr2[length] = (byte) (iArr[0] ^ b4);
                bArr2[length + 1] = (byte) (iArr[1] ^ b4);
                return bArr2;
            } catch (Exception e4) {
                C1821g.m6293a(e4);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = com.p068uc.crashsdk.p069a.C1821g.m6311e(r0);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6249a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            if (r9 != 0) goto L3
            return r7
        L3:
            boolean r0 = com.p068uc.crashsdk.p069a.C1821g.m6298a(r7)
            if (r0 == 0) goto La
            return r7
        La:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Lbf
            long r1 = r0.length()
            r3 = 3145728(0x300000, double:1.554196E-317)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L22
            goto Lbf
        L22:
            byte[] r1 = com.p068uc.crashsdk.p069a.C1821g.m6311e(r0)
            if (r1 == 0) goto Lbf
            int r2 = r1.length
            if (r2 > 0) goto L2d
            goto Lbf
        L2d:
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L84
            r9 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L4a
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L45
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L45
            r5.write(r1)     // Catch: java.lang.Throwable -> L43
            r4.flush()     // Catch: java.lang.Throwable -> L43
            goto L51
        L43:
            r9 = move-exception
            goto L4e
        L45:
            r5 = move-exception
            r6 = r5
            r5 = r9
            r9 = r6
            goto L4e
        L4a:
            r4 = move-exception
            r5 = r9
            r9 = r4
            r4 = r5
        L4e:
            com.p068uc.crashsdk.p069a.C1821g.m6293a(r9)     // Catch: java.lang.Throwable -> L7c
        L51:
            com.p068uc.crashsdk.p069a.C1821g.m6291a(r4)
            com.p068uc.crashsdk.p069a.C1821g.m6291a(r5)
            byte[] r1 = r4.toByteArray()     // Catch: java.lang.Throwable -> L5d
            r9 = 1
            goto L62
        L5d:
            r9 = move-exception
            com.p068uc.crashsdk.p069a.C1821g.m6293a(r9)
            r9 = 0
        L62:
            if (r9 == 0) goto L7b
            if (r1 == 0) goto L7b
            int r9 = r1.length
            if (r9 > 0) goto L6a
            goto L7b
        L6a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 1
            goto L86
        L7b:
            return r7
        L7c:
            r7 = move-exception
            com.p068uc.crashsdk.p069a.C1821g.m6291a(r4)
            com.p068uc.crashsdk.p069a.C1821g.m6291a(r5)
            throw r7
        L84:
            r8 = r7
            r9 = 0
        L86:
            if (r9 == 0) goto Lbf
            java.lang.String r9 = r0.getName()
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto La5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r4 = ".tmp"
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r4 = 1
            goto La7
        La5:
            r9 = r8
            r4 = 0
        La7:
            java.io.File r5 = new java.io.File
            r5.<init>(r9)
            boolean r9 = com.p068uc.crashsdk.p069a.C1821g.m6297a(r5, r1)
            if (r9 != 0) goto Lb4
            r2 = 0
            goto Lbc
        Lb4:
            if (r4 == 0) goto Lbc
            r0.delete()
            r5.renameTo(r0)
        Lbc:
            if (r2 == 0) goto Lbf
            return r8
        Lbf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.p069a.C1816b.m6249a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    private static byte[] m6251a(byte[] bArr, int[] iArr) {
        if (bArr.length - 0 >= 2 && iArr != null && iArr.length == 8) {
            int length = (bArr.length - 2) - 0;
            try {
                byte[] bArr2 = new byte[length];
                byte b4 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    byte b5 = (byte) (bArr[i4 + 0] ^ iArr[i4 % 8]);
                    bArr2[i4] = b5;
                    b4 = (byte) (b4 ^ b5);
                }
                if (bArr[length + 0] == ((byte) ((iArr[0] ^ b4) & 255)) && bArr[length + 1 + 0] == ((byte) ((iArr[1] ^ b4) & 255))) {
                    return bArr2;
                }
                return null;
            } catch (Exception e4) {
                C1821g.m6293a(e4);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m6250a(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            C1821g.m6293a(th);
            fileOutputStream = null;
        }
        boolean z3 = false;
        if (fileOutputStream == null) {
            return false;
        }
        byte[] bArrM6252b = m6252b(str2.getBytes(), f7927a);
        if (bArrM6252b == null) {
            return false;
        }
        try {
            fileOutputStream.write(bArrM6252b);
            z3 = true;
        } finally {
            try {
                return z3;
            } finally {
            }
        }
        return z3;
    }
}

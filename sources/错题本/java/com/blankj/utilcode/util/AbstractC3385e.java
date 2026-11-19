package com.blankj.utilcode.util;

import java.io.File;
import java.io.IOException;

/* renamed from: com.blankj.utilcode.util.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3385e {

    /* renamed from: a */
    public static final /* synthetic */ int f2155a = 0;

    static {
        System.getProperty("line.separator");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2329a(java.io.File r8, java.io.File r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L92
            if (r9 != 0) goto L7
            goto L92
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.getPath()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L36
            goto L92
        L36:
            boolean r1 = r8.exists()
            if (r1 == 0) goto L92
            boolean r1 = r8.isDirectory()
            if (r1 != 0) goto L43
            goto L92
        L43:
            boolean r9 = m2331c(r9)
            if (r9 != 0) goto L4a
            goto L92
        L4a:
            java.io.File[] r9 = r8.listFiles()
            if (r9 == 0) goto L8a
            int r1 = r9.length
            if (r1 <= 0) goto L8a
            int r1 = r9.length
            r3 = r0
        L55:
            if (r3 >= r1) goto L8a
            r4 = r9[r3]
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = android.support.v4.media.AbstractC0037f.m97v(r2)
            java.lang.String r7 = r4.getName()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7a
            boolean r4 = m2330b(r4, r5)
            if (r4 != 0) goto L87
            goto L92
        L7a:
            boolean r6 = r4.isDirectory()
            if (r6 == 0) goto L87
            boolean r4 = m2329a(r4, r5)
            if (r4 != 0) goto L87
            goto L92
        L87:
            int r3 = r3 + 1
            goto L55
        L8a:
            boolean r8 = m2334f(r8)
            if (r8 == 0) goto L92
            r8 = 1
            return r8
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC3385e.m2329a(java.io.File, java.io.File):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a A[RETURN] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2330b(java.io.File r2, java.io.File r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L5f
            if (r3 != 0) goto L6
            goto L5f
        L6:
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto Ld
            goto L5f
        Ld:
            boolean r1 = r2.exists()
            if (r1 == 0) goto L5f
            boolean r1 = r2.isFile()
            if (r1 != 0) goto L1a
            goto L5f
        L1a:
            boolean r1 = r3.exists()
            if (r1 == 0) goto L27
            boolean r1 = r3.delete()
            if (r1 != 0) goto L27
            goto L5f
        L27:
            java.io.File r1 = r3.getParentFile()
            boolean r1 = m2331c(r1)
            if (r1 != 0) goto L32
            goto L5f
        L32:
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.io.FileNotFoundException -> L5b
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L5b
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L5b
            boolean r3 = com.blankj.utilcode.util.AbstractC3382c.m2319t(r1, r3)     // Catch: java.io.FileNotFoundException -> L5b
            if (r3 == 0) goto L5f
            boolean r3 = r2.exists()     // Catch: java.io.FileNotFoundException -> L5b
            r1 = 1
            if (r3 == 0) goto L57
            boolean r3 = r2.isFile()     // Catch: java.io.FileNotFoundException -> L5b
            if (r3 == 0) goto L55
            boolean r2 = r2.delete()     // Catch: java.io.FileNotFoundException -> L5b
            if (r2 == 0) goto L55
            goto L57
        L55:
            r2 = r0
            goto L58
        L57:
            r2 = r1
        L58:
            if (r2 == 0) goto L5f
            return r1
        L5b:
            r2 = move-exception
            r2.printStackTrace()
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC3385e.m2330b(java.io.File, java.io.File):boolean");
    }

    /* renamed from: c */
    public static boolean m2331c(File file) {
        if (file != null) {
            return file.exists() ? file.isDirectory() : file.mkdirs();
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m2332d(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!m2331c(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m2333e(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return m2334f(file);
        }
        if (file.exists()) {
            return file.isFile() && file.delete();
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m2334f(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !m2334f(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: g */
    public static File m2335g(String str) {
        if (AbstractC3383c0.m2327f(str)) {
            return null;
        }
        return new File(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(8:45|5|6|43|7|(2:48|8)|47|10)|38|11) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r3.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0026 A[EXC_TOP_SPLITTER, PHI: r0 r2
      0x0026: PHI (r0v5 byte[]) = (r0v12 byte[]), (r0v8 byte[]) binds: [B:28:0x0040, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r2v3 java.security.DigestInputStream) = (r2v2 java.security.DigestInputStream), (r2v4 java.security.DigestInputStream) binds: [B:28:0x0040, B:10:0x001e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2336h(java.io.File r3) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            goto L43
        L4:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r3 = 262144(0x40000, float:3.67342E-40)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
        L18:
            int r1 = r2.read(r3)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            if (r1 > 0) goto L18
            java.security.MessageDigest r3 = r2.getMessageDigest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            byte[] r0 = r3.digest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
        L26:
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L43
        L2a:
            r3 = move-exception
            r3.printStackTrace()
            goto L43
        L2f:
            r3 = move-exception
            r0 = r2
            goto L48
        L32:
            r3 = move-exception
            goto L3d
        L34:
            r3 = move-exception
            goto L3d
        L36:
            r3 = move-exception
            goto L48
        L38:
            r3 = move-exception
        L39:
            r2 = r0
            goto L3d
        L3b:
            r3 = move-exception
            goto L39
        L3d:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L43
            goto L26
        L43:
            java.lang.String r3 = com.blankj.utilcode.util.AbstractC3383c0.m2322a(r0)
            return r3
        L48:
            if (r0 == 0) goto L52
            r0.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r0 = move-exception
            r0.printStackTrace()
        L52:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC3385e.m2336h(java.io.File):java.lang.String");
    }
}

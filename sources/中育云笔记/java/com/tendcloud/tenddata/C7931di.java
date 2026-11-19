package com.tendcloud.tenddata;

import android.content.SharedPreferences;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.tendcloud.tenddata.di */
/* loaded from: classes5.dex */
final class C7931di {

    /* renamed from: a */
    private static final String f14703a = "mPBE";

    /* renamed from: b */
    private static final String f14704b = "_Ladder_Project";

    /* renamed from: c */
    private static final String f14705c = "Pythagoras_phase";

    private C7931di() {
    }

    /* renamed from: a */
    public static void m11705a(String str, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append((int) b10);
            sb2.append(",");
        }
        m11704a(C7843ab.f14307g.getFilesDir() + File.separator + f14703a, str, sb2.toString());
    }

    /* renamed from: b */
    public static void m11709b(String str, String str2) {
        m11704a(C7843ab.f14307g.getFilesDir().getPath(), str, str2);
    }

    /* renamed from: c */
    public static void m11711c(String str, String str2) {
        System.getProperties().setProperty(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r2.createNewFile() == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c A[EXC_TOP_SPLITTER, PHI: r1 r4
      0x004c: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:25:0x0050, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r4v4 java.io.FileInputStream) = (r4v3 java.io.FileInputStream), (r4v5 java.io.FileInputStream) binds: [B:25:0x0050, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m11712d(java.lang.String r4, java.lang.String r5) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            java.lang.String r1 = ""
            if (r4 != 0) goto L1a
            boolean r4 = r0.isDirectory()
            if (r4 != 0) goto L1a
            boolean r4 = r0.mkdirs()
            if (r4 != 0) goto L1a
            goto L49
        L1a:
            r4 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r2.<init>(r0, r5)     // Catch: java.lang.Throwable -> L50
            boolean r5 = r2.exists()     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L43
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L50
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L50
            long r2 = r2.length()     // Catch: java.lang.Throwable -> L3f
            int r4 = (int) r2     // Catch: java.lang.Throwable -> L3f
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L3f
            int r0 = r5.read(r4)     // Catch: java.lang.Throwable -> L3f
            if (r0 <= 0) goto L41
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            r1 = r0
            goto L41
        L3f:
            r4 = r5
            goto L50
        L41:
            r4 = r5
            goto L4a
        L43:
            boolean r5 = r2.createNewFile()     // Catch: java.lang.Throwable -> L50
            if (r5 != 0) goto L4a
        L49:
            return r1
        L4a:
            if (r4 == 0) goto L53
        L4c:
            r4.close()     // Catch: java.lang.Throwable -> L53
            goto L53
        L50:
            if (r4 == 0) goto L53
            goto L4c
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7931di.m11712d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static String m11710c(String str) {
        return System.getProperties().getProperty(str);
    }

    /* renamed from: b */
    public static String m11708b(String str) {
        return m11712d(C7843ab.f14307g.getFilesDir().getPath(), str);
    }

    /* renamed from: a */
    public static void m11703a(String str, String str2) {
        m11704a(C7843ab.f14307g.getFilesDir() + File.separator + f14704b, str, str2);
    }

    /* renamed from: a */
    private static void m11704a(String str, String str2, String str3) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.exists() || file.isDirectory() || file.mkdirs()) {
                    File file2 = new File(file, str2);
                    if (file2.exists() || file2.createNewFile()) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                        try {
                            fileOutputStream2.write(str3.getBytes());
                            fileOutputStream2.close();
                        } catch (Throwable unused) {
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    public static byte[] m11707a(String str, int i10) {
        SharedPreferences sharedPreferences = C7843ab.f14307g.getSharedPreferences(f14703a, 0);
        String string = sharedPreferences.getString(str, "");
        String str2 = C7843ab.f14307g.getFilesDir() + File.separator + f14703a;
        String strM11712d = m11712d(str2, str);
        if (C7912cq.m11608b(strM11712d)) {
            if (C7912cq.m11608b(string)) {
                return null;
            }
            m11704a(str2, str, string);
            sharedPreferences.edit().putString(str, "").apply();
            return m11706a(i10, string);
        }
        return m11706a(i10, strM11712d);
    }

    /* renamed from: a */
    public static String m11702a(String str) {
        SharedPreferences sharedPreferences = C7843ab.f14307g.getSharedPreferences(f14705c, 0);
        String string = sharedPreferences.getString(str, "");
        String str2 = C7843ab.f14307g.getFilesDir() + File.separator + f14704b;
        String strM11712d = m11712d(str2, str);
        if (!C7912cq.m11608b(strM11712d) || C7912cq.m11608b(string)) {
            return strM11712d;
        }
        m11704a(str2, str, string);
        sharedPreferences.edit().putString(str, "").apply();
        return string;
    }

    /* renamed from: a */
    private static byte[] m11706a(int i10, String str) {
        try {
            if (C7912cq.m11608b(str)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            String[] strArrSplit = str.split(",");
            for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                bArr[i11] = Byte.parseByte(strArrSplit[i11]);
            }
            return bArr;
        } catch (Throwable unused) {
            return null;
        }
    }
}

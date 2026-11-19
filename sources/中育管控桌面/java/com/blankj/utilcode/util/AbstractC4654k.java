package com.blankj.utilcode.util;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.blankj.utilcode.util.k */
/* loaded from: classes3.dex */
public abstract class AbstractC4654k {

    /* renamed from: a */
    public static int f2087a = 524288;

    /* renamed from: com.blankj.utilcode.util.k$a */
    public interface a {
        /* renamed from: a */
        void m2217a(double d6);
    }

    /* renamed from: a */
    public static byte[] m2209a(File file) {
        return m2210b(file, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[Catch: FileNotFoundException -> 0x0063, SYNTHETIC, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0063, blocks: (B:5:0x0008, B:28:0x005f, B:24:0x0057, B:56:0x0092, B:55:0x008f, B:50:0x0085, B:45:0x007c, B:40:0x0072, B:21:0x0052, B:47:0x0080, B:37:0x006d, B:52:0x008a, B:25:0x005a, B:42:0x0077), top: B:63:0x0008, inners: #1, #3, #5, #7, #8, #10 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m2210b(java.io.File r10, com.blankj.utilcode.util.AbstractC4654k.a r11) throws java.lang.Throwable {
        /*
            boolean r0 = com.blankj.utilcode.util.AbstractC4663o0.m2300C(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L63
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L63
            r2.<init>(r10)     // Catch: java.io.FileNotFoundException -> L63
            int r10 = com.blankj.utilcode.util.AbstractC4654k.f2087a     // Catch: java.io.FileNotFoundException -> L63
            r0.<init>(r2, r10)     // Catch: java.io.FileNotFoundException -> L63
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            r10.<init>()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68
            int r2 = com.blankj.utilcode.util.AbstractC4654k.f2087a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r3 = -1
            r4 = 0
            if (r11 != 0) goto L31
        L21:
            int r11 = com.blankj.utilcode.util.AbstractC4654k.f2087a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r11 = r0.read(r2, r4, r11)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r11 == r3) goto L4e
            r10.write(r2, r4, r11)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L21
        L2d:
            r11 = move-exception
            goto L80
        L2f:
            r11 = move-exception
            goto L6a
        L31:
            int r5 = r0.available()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r7 = 0
            r11.m2217a(r7)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r7 = r4
        L3c:
            int r8 = com.blankj.utilcode.util.AbstractC4654k.f2087a     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r8 = r0.read(r2, r4, r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r8 == r3) goto L4e
            r10.write(r2, r4, r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            int r7 = r7 + r8
            double r8 = (double) r7     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            double r8 = r8 / r5
            r11.m2217a(r8)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L3c
        L4e:
            byte[] r11 = r10.toByteArray()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r0.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L5a:
            r10.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L62:
            return r11
        L63:
            r10 = move-exception
            goto L93
        L65:
            r11 = move-exception
            r10 = r1
            goto L80
        L68:
            r11 = move-exception
            r10 = r1
        L6a:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L2d
            r0.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L75:
            if (r10 == 0) goto L7f
            r10.close()     // Catch: java.io.IOException -> L7b
            goto L7f
        L7b:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L7f:
            return r1
        L80:
            r0.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L88:
            if (r10 == 0) goto L92
            r10.close()     // Catch: java.io.IOException -> L8e
            goto L92
        L8e:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L63
        L92:
            throw r11     // Catch: java.io.FileNotFoundException -> L63
        L93:
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC4654k.m2210b(java.io.File, com.blankj.utilcode.util.k$a):byte[]");
    }

    /* renamed from: c */
    public static String m2211c(File file, String str) {
        byte[] bArrM2209a = m2209a(file);
        if (bArrM2209a == null) {
            return null;
        }
        if (AbstractC4663o0.m2304G(str)) {
            return new String(bArrM2209a);
        }
        try {
            return new String(bArrM2209a, str);
        } catch (UnsupportedEncodingException e6) {
            e6.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static String m2212d(String str) {
        return m2211c(AbstractC4663o0.m2331p(str), null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:76|(6:11|(2:12|(1:14)(0))|24|65|28|79)(6:19|(2:20|(1:22)(0))|24|65|28|79)|71|24|65|28|79) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r7.printStackTrace();
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2213e(java.io.File r7, java.io.InputStream r8, boolean r9, com.blankj.utilcode.util.AbstractC4654k.a r10) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r8 == 0) goto L8c
            boolean r1 = com.blankj.utilcode.util.AbstractC4663o0.m2321f(r7)
            if (r1 != 0) goto Lb
            goto L8c
        Lb:
            r1 = 0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r3.<init>(r7, r9)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            int r7 = com.blankj.utilcode.util.AbstractC4654k.f2087a     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r2.<init>(r3, r7)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r7 = -1
            if (r10 != 0) goto L2f
            int r9 = com.blankj.utilcode.util.AbstractC4654k.f2087a     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
        L1f:
            int r10 = r8.read(r9)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            if (r10 == r7) goto L4e
            r2.write(r9, r0, r10)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L1f
        L29:
            r7 = move-exception
            r1 = r2
            goto L79
        L2c:
            r7 = move-exception
            r1 = r2
            goto L63
        L2f:
            int r9 = r8.available()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            double r3 = (double) r9     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r5 = 0
            r10.m2217a(r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            int r9 = com.blankj.utilcode.util.AbstractC4654k.f2087a     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r1 = r0
        L3e:
            int r5 = r8.read(r9)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            if (r5 == r7) goto L4e
            r2.write(r9, r0, r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            int r1 = r1 + r5
            double r5 = (double) r1     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            double r5 = r5 / r3
            r10.m2217a(r5)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            goto L3e
        L4e:
            r8.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r7 = move-exception
            r7.printStackTrace()
        L56:
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r7 = move-exception
            r7.printStackTrace()
        L5e:
            r7 = 1
            return r7
        L60:
            r7 = move-exception
            goto L79
        L62:
            r7 = move-exception
        L63:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L60
            r8.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r7 = move-exception
            r7.printStackTrace()
        L6e:
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r7 = move-exception
            r7.printStackTrace()
        L78:
            return r0
        L79:
            r8.close()     // Catch: java.io.IOException -> L7d
            goto L81
        L7d:
            r8 = move-exception
            r8.printStackTrace()
        L81:
            if (r1 == 0) goto L8b
            r1.close()     // Catch: java.io.IOException -> L87
            goto L8b
        L87:
            r8 = move-exception
            r8.printStackTrace()
        L8b:
            throw r7
        L8c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "create file <"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "> failed."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "FileIOUtils"
            android.util.Log.e(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.AbstractC4654k.m2213e(java.io.File, java.io.InputStream, boolean, com.blankj.utilcode.util.k$a):boolean");
    }

    /* renamed from: f */
    public static boolean m2214f(String str, InputStream inputStream) {
        return m2213e(AbstractC4663o0.m2331p(str), inputStream, false, null);
    }

    /* renamed from: g */
    public static boolean m2215g(File file, String str, boolean z6) throws Throwable {
        BufferedWriter bufferedWriter;
        if (file == null || str == null) {
            return false;
        }
        if (!AbstractC4663o0.m2321f(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file, z6));
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            try {
                bufferedWriter.close();
                return true;
            } catch (IOException e7) {
                e7.printStackTrace();
                return true;
            }
        } catch (IOException e8) {
            e = e8;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: h */
    public static boolean m2216h(String str, String str2, boolean z6) {
        return m2215g(AbstractC4663o0.m2331p(str), str2, z6);
    }
}

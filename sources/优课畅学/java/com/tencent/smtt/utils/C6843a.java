package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.io.File;

/* renamed from: com.tencent.smtt.utils.a */
/* loaded from: classes4.dex */
public class C6843a {
    /* renamed from: a */
    public static int m6260a(Context context, File file) {
        if (file == null || !file.exists()) {
            return 0;
        }
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
            if (packageArchiveInfo != null) {
                return packageArchiveInfo.versionCode;
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6261a(java.io.File r10) throws java.lang.Throwable {
        /*
            r0 = 16
            char[] r1 = new char[r0]
            r1 = {x0076: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            r2 = 32
            char[] r2 = new char[r2]
            r3 = 0
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5a
            r10 = 8192(0x2000, float:1.148E-41)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
        L1b:
            int r6 = r5.read(r10)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            r7 = -1
            r8 = 0
            if (r6 == r7) goto L2c
            r4.update(r10, r8, r6)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            goto L1b
        L27:
            r10 = move-exception
            r3 = r5
            goto L6a
        L2a:
            r10 = move-exception
            goto L5c
        L2c:
            byte[] r10 = r4.digest()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            r4 = r8
        L31:
            if (r8 >= r0) goto L4a
            r6 = r10[r8]     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            int r7 = r4 + 1
            int r9 = r6 >>> 4
            r9 = r9 & 15
            char r9 = r1[r9]     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            r2[r4] = r9     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            int r4 = r4 + 2
            r6 = r6 & 15
            char r6 = r1[r6]     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            r2[r7] = r6     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            int r8 = r8 + 1
            goto L31
        L4a:
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            r5.close()     // Catch: java.io.IOException -> L53
            return r10
        L53:
            r0 = move-exception
            r0.printStackTrace()
            return r10
        L58:
            r10 = move-exception
            goto L6a
        L5a:
            r10 = move-exception
            r5 = r3
        L5c:
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L69
            r5.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r10 = move-exception
            r10.printStackTrace()
        L69:
            return r3
        L6a:
            if (r3 == 0) goto L74
            r3.close()     // Catch: java.io.IOException -> L70
            goto L74
        L70:
            r0 = move-exception
            r0.printStackTrace()
        L74:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.C6843a.m6261a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m6262a(Context context, File file, long j10, int i10) {
        if (file != null && file.exists()) {
            if (j10 > 0 && j10 != file.length()) {
                return false;
            }
            try {
                if (i10 != m6260a(context, file)) {
                    return false;
                }
                return "3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a".equals(C6845b.m6268a(context, file));
            } catch (Exception unused) {
            }
        }
        return false;
    }
}

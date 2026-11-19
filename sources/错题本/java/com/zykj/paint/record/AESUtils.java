package com.zykj.paint.record;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class AESUtils {
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(4:43|3|41|4)|(3:45|5|6)|39|29|33|(2:35|36)(2:37|38)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        r6.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String Decrypt(java.lang.String r5, java.lang.String r6) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            java.io.File r5 = new java.io.File
            java.lang.String r1 = r0.getName()
            java.lang.String r1 = com.zykj.paint.record.AudioFileUtils.getTempFileAbsolutePath(r1)
            r5.<init>(r1)
            long r1 = r0.length()
            int r1 = (int) r1
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L43 java.io.IOException -> L46 java.io.FileNotFoundException -> L49
            r4.<init>(r0)     // Catch: java.lang.Exception -> L43 java.io.IOException -> L46 java.io.FileNotFoundException -> L49
            r4.read(r1)     // Catch: java.lang.Exception -> L3a java.io.IOException -> L3d java.io.FileNotFoundException -> L40
            byte[] r6 = decryptVoice(r6, r1)     // Catch: java.lang.Exception -> L3a java.io.IOException -> L3d java.io.FileNotFoundException -> L40
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L3a java.io.IOException -> L3d java.io.FileNotFoundException -> L40
            r0.<init>(r5)     // Catch: java.lang.Exception -> L3a java.io.IOException -> L3d java.io.FileNotFoundException -> L40
            r0.write(r6)     // Catch: java.lang.Exception -> L31 java.io.IOException -> L34 java.io.FileNotFoundException -> L37
            r2 = 1
            goto L59
        L31:
            r6 = move-exception
        L32:
            r3 = r4
            goto L4c
        L34:
            r6 = move-exception
        L35:
            r3 = r4
            goto L51
        L37:
            r6 = move-exception
        L38:
            r3 = r4
            goto L55
        L3a:
            r6 = move-exception
            r0 = r3
            goto L32
        L3d:
            r6 = move-exception
            r0 = r3
            goto L35
        L40:
            r6 = move-exception
            r0 = r3
            goto L38
        L43:
            r6 = move-exception
            r0 = r3
            goto L4c
        L46:
            r6 = move-exception
            r0 = r3
            goto L51
        L49:
            r6 = move-exception
            r0 = r3
            goto L55
        L4c:
            r6.printStackTrace()
        L4f:
            r4 = r3
            goto L59
        L51:
            r6.printStackTrace()
            goto L4f
        L55:
            r6.printStackTrace()
            goto L4f
        L59:
            r4.close()     // Catch: java.lang.Exception -> L60
            r0.close()     // Catch: java.lang.Exception -> L60
            goto L64
        L60:
            r6 = move-exception
            r6.printStackTrace()
        L64:
            java.lang.String r6 = "解密 - AES"
            if (r2 == 0) goto L72
            java.lang.String r0 = "解密成功"
            android.util.Log.i(r6, r0)
            java.lang.String r5 = r5.getPath()
            return r5
        L72:
            java.lang.String r5 = "解密失败"
            android.util.Log.i(r6, r5)
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.record.AESUtils.Decrypt(java.lang.String, java.lang.String):java.lang.String"); // DEX body: android/错题本/smali_classes3/com/zykj/paint/record/AESUtils.smali:20
    }

    public static void Encrypt(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        byte[] bArrEncryptVoice;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    File file = new File(str);
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[(int) file.length()];
                        fileInputStream.read(bArr);
                        bArrEncryptVoice = encryptVoice(str2, bArr);
                        fileOutputStream = new FileOutputStream(file);
                    } catch (FileNotFoundException e) {
                        e = e;
                        fileOutputStream = null;
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream = null;
                    } catch (Exception e8) {
                        e = e8;
                        fileOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    fileOutputStream.write(bArrEncryptVoice);
                    try {
                        fileInputStream.close();
                        fileOutputStream.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                    Log.d("加密 - AES", "加密成功");
                } catch (FileNotFoundException e10) {
                    e = e10;
                    fileInputStream2 = fileInputStream;
                    e.printStackTrace();
                    fileInputStream2.close();
                    fileOutputStream.close();
                    Log.d("加密 - AES", "加密失败");
                } catch (IOException e11) {
                    e = e11;
                    fileInputStream2 = fileInputStream;
                    e.printStackTrace();
                    fileInputStream2.close();
                    fileOutputStream.close();
                    Log.d("加密 - AES", "加密失败");
                } catch (Exception e12) {
                    e = e12;
                    fileInputStream2 = fileInputStream;
                    e.printStackTrace();
                    fileInputStream2.close();
                    fileOutputStream.close();
                    Log.d("加密 - AES", "加密失败");
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    try {
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e14) {
                e = e14;
                fileOutputStream = null;
            } catch (IOException e15) {
                e = e15;
                fileOutputStream = null;
            } catch (Exception e16) {
                e = e16;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (IOException e17) {
            e17.printStackTrace();
        }
    }

    private static byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr2);
    }

    private static byte[] decryptVoice(String str, byte[] bArr) throws Exception {
        return decrypt(getRawKey(str.getBytes()), bArr);
    }

    private static byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(1, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr2);
    }

    private static byte[] encryptVoice(String str, byte[] bArr) throws Exception {
        return encrypt(getRawKey(str.getBytes()), bArr);
    }

    private static byte[] getRawKey(byte[] bArr) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        secureRandom.setSeed(bArr);
        keyGenerator.init(128, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }
}

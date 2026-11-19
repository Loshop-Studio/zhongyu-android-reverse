package com.p071uc.crashsdk.p072a;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.blankj.utilcode.constant.TimeConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.uc.crashsdk.a.c */
/* loaded from: classes4.dex */
public class C6740c {

    /* renamed from: a */
    static final /* synthetic */ boolean f6336a = true;

    /* renamed from: b */
    private static String f6337b = "";

    /* renamed from: a */
    public static byte[] m5581a(byte[] bArr, byte[] bArr2) {
        return m5583a(bArr, bArr2, true, false);
    }

    /* renamed from: b */
    public static byte[] m5585b(byte[] bArr, byte[] bArr2) {
        return m5583a(bArr, bArr2, true, true);
    }

    /* renamed from: a */
    public static byte[] m5582a(byte[] bArr, byte[] bArr2, boolean z9) {
        return m5583a(bArr, bArr2, z9, true);
    }

    /* renamed from: b */
    private static boolean m5584b(File file, String str, String str2) throws Throwable {
        try {
            byte[] bArrM5578a = m5578a(file);
            if (bArrM5578a != null && bArrM5578a.length != 0) {
                return m5576a(bArrM5578a, str, str2);
            }
            return false;
        } catch (Exception e10) {
            C6744g.m5614a(e10);
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m5583a(byte[] bArr, byte[] bArr2, boolean z9, boolean z10) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(z9 ? 1 : 2, secretKeySpec, ivParameterSpec);
        if (!z9) {
            return cipher.doFinal(bArr);
        }
        if (!z10) {
            bArr = m5580a(bArr);
        }
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    private static byte[] m5580a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 16];
        int length = bArr.length;
        bArr2[0] = (byte) (length & 255);
        bArr2[1] = (byte) ((length >> 8) & 255);
        bArr2[2] = (byte) ((length >> 16) & 255);
        bArr2[3] = (byte) ((length >> 24) & 255);
        for (int i9 = 4; i9 < 16; i9++) {
            bArr2[i9] = 0;
        }
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m5577a() {
        return new byte[]{48, 25, 6, 55};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m5579a(java.lang.String r7, byte[] r8) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L87
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L87
            java.net.URLConnection r7 = r1.openConnection()     // Catch: java.lang.Throwable -> L87
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: java.lang.Throwable -> L87
            r1 = 5000(0x1388, float:7.006E-42)
            r7.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L83
            r7.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L83
            r1 = 1
            r7.setDoInput(r1)     // Catch: java.lang.Throwable -> L83
            r7.setDoOutput(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "POST"
            r7.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L83
            r1 = 0
            r7.setUseCaches(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r7.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "Content-Length"
            int r3 = r8.length     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L83
            r7.setRequestProperty(r2, r3)     // Catch: java.lang.Throwable -> L83
            java.io.OutputStream r2 = r7.getOutputStream()     // Catch: java.lang.Throwable -> L83
            r2.write(r8)     // Catch: java.lang.Throwable -> L80
            int r8 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L80
            r3 = 200(0xc8, float:2.8E-43)
            if (r8 == r3) goto L51
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r2)
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r0)
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r0)
            r7.disconnect()     // Catch: java.lang.Throwable -> L50
        L50:
            return r0
        L51:
            java.io.InputStream r8 = r7.getInputStream()     // Catch: java.lang.Throwable -> L80
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L7e
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7e
            int r5 = r8.available()     // Catch: java.lang.Throwable -> L7e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7e
        L62:
            int r5 = r8.read(r3)     // Catch: java.lang.Throwable -> L8a
            r6 = -1
            if (r5 == r6) goto L6d
            r4.write(r3, r1, r5)     // Catch: java.lang.Throwable -> L8a
            goto L62
        L6d:
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L8a
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r2)
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r8)
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r4)
            r7.disconnect()     // Catch: java.lang.Throwable -> L7d
        L7d:
            return r0
        L7e:
            r4 = r0
            goto L8a
        L80:
            r8 = r0
            r4 = r8
            goto L8a
        L83:
            r8 = r0
        L84:
            r2 = r8
            r4 = r2
            goto L8a
        L87:
            r7 = r0
            r8 = r7
            goto L84
        L8a:
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r2)
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r8)
            com.p071uc.crashsdk.p072a.C6744g.m5612a(r4)
            if (r7 == 0) goto L98
            r7.disconnect()     // Catch: java.lang.Throwable -> L98
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.p072a.C6740c.m5579a(java.lang.String, byte[]):byte[]");
    }

    /* renamed from: a */
    public static void m5574a(byte[] bArr, int i9, byte[] bArr2) {
        if (!f6336a && bArr2.length != 4) {
            throw new AssertionError();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i10 + i9] = bArr2[i10];
        }
    }

    /* renamed from: a */
    private static byte[] m5578a(File file) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArr;
        int length;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        byte[] bArr2 = null;
        bufferedInputStream2 = null;
        bufferedInputStream2 = null;
        bufferedInputStream2 = null;
        try {
            if (!file.isFile()) {
                return null;
            }
            try {
                length = (int) file.length();
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                } catch (Exception e10) {
                    e = e10;
                    bArr = null;
                }
            } catch (Exception e11) {
                e = e11;
                bArr = null;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                bArr2 = new byte[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = bufferedInputStream.read(bArr2, i9, length - i9);
                    if (-1 == i10) {
                        break;
                    }
                    i9 += i10;
                }
                C6744g.m5612a(bufferedInputStream);
                C6744g.m5612a(fileInputStream);
                return bArr2;
            } catch (Exception e12) {
                e = e12;
                byte[] bArr3 = bArr2;
                bufferedInputStream2 = bufferedInputStream;
                bArr = bArr3;
                C6744g.m5623b(e);
                C6744g.m5612a(bufferedInputStream2);
                C6744g.m5612a(fileInputStream);
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream2 = bufferedInputStream;
                C6744g.m5612a(bufferedInputStream2);
                C6744g.m5612a(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    public static boolean m5575a(File file, String str, String str2) {
        for (int i9 = 0; i9 < 2; i9++) {
            if (m5584b(file, str, str2)) {
                return true;
            }
            C6738a.m5563a("crashsdk", "upload try again: " + str);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5576a(byte[] bArr, String str, String str2) {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        ByteArrayOutputStream byteArrayOutputStream;
        C6738a.m5562a("Uploading to " + str2);
        OutputStream outputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(TimeConstants.MIN);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                StringBuilder sb = new StringBuilder();
                sb.append("------------izQ290kHh6g3Yn2IeyJCoc\r\n");
                sb.append("Content-Disposition: form-data; name=\"file\";");
                sb.append(" filename=\"");
                sb.append(str);
                sb.append("\"\r\n");
                sb.append("Content-Type: application/octet-stream\r\n");
                sb.append("\r\n");
                int length = sb.length() + 40 + bArr.length;
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=----------izQ290kHh6g3Yn2IeyJCoc");
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"file\"; filename=" + str);
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(length));
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(sb.toString().getBytes());
                    outputStream2.write(bArr);
                    outputStream2.write("\r\n------------izQ290kHh6g3Yn2IeyJCoc--\r\n".getBytes());
                    int responseCode = httpURLConnection.getResponseCode();
                    C6738a.m5563a("crashsdk", "Response code: " + responseCode);
                    if (responseCode != 200) {
                        C6744g.m5612a(outputStream2);
                        C6744g.m5612a((Closeable) null);
                        C6744g.m5612a((Closeable) null);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused) {
                        }
                        return false;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                        while (true) {
                            try {
                                int i9 = inputStream.read(bArr2);
                                if (i9 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i9);
                            } catch (Throwable th) {
                                th = th;
                                outputStream = outputStream2;
                                try {
                                    C6744g.m5623b(th);
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    return false;
                                } finally {
                                    C6744g.m5612a(outputStream);
                                    C6744g.m5612a(inputStream);
                                    C6744g.m5612a(byteArrayOutputStream);
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                }
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (byteArray != null) {
                            C6738a.m5563a("crashsdk", "Log upload response: " + new String(byteArray));
                            C6744g.m5612a(outputStream2);
                            C6744g.m5612a(inputStream);
                            C6744g.m5612a(byteArrayOutputStream);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable unused4) {
                            }
                            return true;
                        }
                        C6744g.m5612a(outputStream2);
                        C6744g.m5612a(inputStream);
                        C6744g.m5612a(byteArrayOutputStream);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused5) {
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            httpURLConnection = null;
            byteArrayOutputStream = null;
        }
    }
}

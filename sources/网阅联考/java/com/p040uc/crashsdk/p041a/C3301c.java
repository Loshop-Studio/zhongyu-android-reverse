package com.p040uc.crashsdk.p041a;

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
/* loaded from: classes2.dex */
public class C3301c {

    /* renamed from: a */
    static final /* synthetic */ boolean f1338a = true;

    /* renamed from: b */
    private static String f1339b = "";

    /* renamed from: a */
    public static byte[] m2337a(byte[] bArr, byte[] bArr2) {
        return m2339a(bArr, bArr2, true, false);
    }

    /* renamed from: b */
    public static byte[] m2341b(byte[] bArr, byte[] bArr2) {
        return m2339a(bArr, bArr2, true, true);
    }

    /* renamed from: a */
    public static byte[] m2338a(byte[] bArr, byte[] bArr2, boolean z3) {
        return m2339a(bArr, bArr2, z3, true);
    }

    /* renamed from: b */
    private static boolean m2340b(File file, String str, String str2) throws Throwable {
        try {
            byte[] bArrM2334a = m2334a(file);
            if (bArrM2334a != null && bArrM2334a.length != 0) {
                return m2332a(bArrM2334a, str, str2);
            }
            return false;
        } catch (Exception e4) {
            C3305g.m2370a(e4);
            return false;
        }
    }

    /* renamed from: a */
    private static byte[] m2339a(byte[] bArr, byte[] bArr2, boolean z3, boolean z4) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(z3 ? 1 : 2, secretKeySpec, ivParameterSpec);
        if (!z3) {
            return cipher.doFinal(bArr);
        }
        if (!z4) {
            bArr = m2336a(bArr);
        }
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    private static byte[] m2336a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 16];
        int length = bArr.length;
        bArr2[0] = (byte) ((length >> 0) & 255);
        bArr2[1] = (byte) ((length >> 8) & 255);
        bArr2[2] = (byte) ((length >> 16) & 255);
        bArr2[3] = (byte) ((length >> 24) & 255);
        for (int i4 = 4; i4 < 16; i4++) {
            bArr2[i4] = 0;
        }
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m2333a() {
        return new byte[]{48, 25, 6, 55};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
    public static byte[] m2335a(java.lang.String r7, byte[] r8) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L85
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L85
            java.net.URLConnection r7 = r1.openConnection()     // Catch: java.lang.Throwable -> L85
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: java.lang.Throwable -> L85
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
            com.p040uc.crashsdk.p041a.C3305g.m2368a(r2)
            com.p040uc.crashsdk.p041a.C3305g.m2368a(r0)
            com.p040uc.crashsdk.p041a.C3305g.m2368a(r0)
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
            int r5 = r8.read(r3)     // Catch: java.lang.Throwable -> L89
            r6 = -1
            if (r5 == r6) goto L6d
            r4.write(r3, r1, r5)     // Catch: java.lang.Throwable -> L89
            goto L62
        L6d:
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L89
            com.p040uc.crashsdk.p041a.C3305g.m2368a(r2)
            com.p040uc.crashsdk.p041a.C3305g.m2368a(r8)
            com.p040uc.crashsdk.p041a.C3305g.m2368a(r4)
            r7.disconnect()     // Catch: java.lang.Throwable -> L7d
        L7d:
            return r0
        L7e:
            r4 = r0
            goto L89
        L80:
            r8 = r0
            r4 = r8
            goto L89
        L83:
            r8 = r0
            goto L87
        L85:
            r7 = r0
            r8 = r7
        L87:
            r2 = r8
            r4 = r2
        L89:
            com.p040uc.crashsdk.p041a.C3305g.m2368a(r2)
            com.p040uc.crashsdk.p041a.C3305g.m2368a(r8)
            com.p040uc.crashsdk.p041a.C3305g.m2368a(r4)
            if (r7 == 0) goto L97
            r7.disconnect()     // Catch: java.lang.Throwable -> L97
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.p041a.C3301c.m2335a(java.lang.String, byte[]):byte[]");
    }

    /* renamed from: a */
    public static void m2330a(byte[] bArr, int i4, byte[] bArr2) {
        if (!f1338a && bArr2.length != 4) {
            throw new AssertionError();
        }
        for (int i5 = 0; i5 < 4; i5++) {
            bArr[i5 + i4] = bArr2[i5];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* renamed from: a */
    private static byte[] m2334a(File file) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArr;
        int length;
        BufferedInputStream bufferedInputStream;
        ?? r12 = 0;
        byte[] bArr2 = null;
        closeable = null;
        Closeable closeable = null;
        r12 = 0;
        try {
            if (!file.isFile()) {
                return null;
            }
            try {
                length = (int) file.length();
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                } catch (Exception e4) {
                    e = e4;
                    bArr = null;
                }
            } catch (Exception e5) {
                e = e5;
                bArr = null;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                bArr2 = new byte[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = bufferedInputStream.read(bArr2, i4, length - i4);
                    if (-1 == i5) {
                        break;
                    }
                    i4 += i5;
                }
                C3305g.m2368a(bufferedInputStream);
                C3305g.m2368a(fileInputStream);
                r12 = bArr2;
            } catch (Exception e6) {
                e = e6;
                byte[] bArr3 = bArr2;
                closeable = bufferedInputStream;
                bArr = bArr3;
                C3305g.m2379b(e);
                C3305g.m2368a(closeable);
                C3305g.m2368a(fileInputStream);
                r12 = bArr;
                return r12;
            } catch (Throwable th2) {
                th = th2;
                r12 = bufferedInputStream;
                C3305g.m2368a((Closeable) r12);
                C3305g.m2368a(fileInputStream);
                throw th;
            }
            return r12;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    public static boolean m2331a(File file, String str, String str2) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (m2340b(file, str, str2)) {
                return true;
            }
            C3299a.m2319a("crashsdk", "upload try again: " + str);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2332a(byte[] bArr, String str, String str2) {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        ByteArrayOutputStream byteArrayOutputStream;
        C3299a.m2318a("Uploading to " + str2);
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
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=----------izQ290kHh6g3Yn2IeyJCoc");
                httpURLConnection.setRequestProperty("Content-Disposition", "form-data; name=\"file\"; filename=" + str);
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(length));
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(sb.toString().getBytes());
                    outputStream2.write(bArr);
                    outputStream2.write("\r\n------------izQ290kHh6g3Yn2IeyJCoc--\r\n".getBytes());
                    int responseCode = httpURLConnection.getResponseCode();
                    C3299a.m2319a("crashsdk", "Response code: " + responseCode);
                    if (responseCode != 200) {
                        C3305g.m2368a(outputStream2);
                        C3305g.m2368a((Closeable) null);
                        C3305g.m2368a((Closeable) null);
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
                                int i4 = inputStream.read(bArr2);
                                if (i4 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i4);
                            } catch (Throwable th) {
                                th = th;
                                outputStream = outputStream2;
                                try {
                                    C3305g.m2379b(th);
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    return false;
                                } finally {
                                    C3305g.m2368a(outputStream);
                                    C3305g.m2368a(inputStream);
                                    C3305g.m2368a(byteArrayOutputStream);
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
                            C3299a.m2319a("crashsdk", "Log upload response: " + new String(byteArray));
                            C3305g.m2368a(outputStream2);
                            C3305g.m2368a(inputStream);
                            C3305g.m2368a(byteArrayOutputStream);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable unused4) {
                            }
                            return true;
                        }
                        C3305g.m2368a(outputStream2);
                        C3305g.m2368a(inputStream);
                        C3305g.m2368a(byteArrayOutputStream);
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

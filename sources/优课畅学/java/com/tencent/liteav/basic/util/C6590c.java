package com.tencent.liteav.basic.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* renamed from: com.tencent.liteav.basic.util.c */
/* loaded from: classes4.dex */
public class C6590c {
    /* renamed from: a */
    public static boolean m5030a(long j10) {
        return true;
    }

    /* renamed from: b */
    public static String m5035b(String str) throws Throwable {
        File file = new File(str);
        StringBuilder sb = new StringBuilder("");
        BufferedReader bufferedReader = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            bufferedReader2.close();
                            String string = sb.toString();
                            try {
                                bufferedReader2.close();
                                return string;
                            } catch (IOException e10) {
                                throw new RuntimeException("IOException occurred. ", e10);
                            }
                        }
                        sb.append(line);
                    } catch (IOException e11) {
                        e = e11;
                        bufferedReader = bufferedReader2;
                        throw new RuntimeException("IOException occurred. ", e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e12) {
                                throw new RuntimeException("IOException occurred. ", e12);
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e13) {
                e = e13;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static boolean m5031a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }

    /* renamed from: a */
    public static long m5024a(File file) {
        return m5025a(file, 5);
    }

    /* renamed from: a */
    public static long m5025a(File file, int i10) {
        long length;
        long j10 = 0;
        if (i10 <= 0) {
            return 0L;
        }
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    length = m5025a(file2, i10 - 1);
                } else {
                    length = file2.length();
                }
                j10 += length;
            }
            return j10;
        } catch (Exception e10) {
            TXCLog.m4994i("FileUtil", "getFolderSize exception " + e10.toString());
            return j10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5026a(android.content.Context r2, java.lang.String r3, java.lang.String r4) throws java.lang.Throwable {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()
            r0 = 0
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            m5028a(r2, r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            m5027a(r2)
            r3.flush()     // Catch: java.io.IOException -> L3e
            r3.close()     // Catch: java.io.IOException -> L3e
            return
        L1b:
            r4 = move-exception
        L1c:
            r0 = r2
            goto L40
        L1e:
            r4 = move-exception
        L1f:
            r0 = r2
            goto L2c
        L21:
            r4 = move-exception
            r3 = r0
            goto L1c
        L24:
            r4 = move-exception
            r3 = r0
            goto L1f
        L27:
            r4 = move-exception
            r3 = r0
            goto L40
        L2a:
            r4 = move-exception
            r3 = r0
        L2c:
            java.lang.String r2 = "FileUtil"
            java.lang.String r1 = "copy asset file failed."
            com.tencent.liteav.basic.log.TXCLog.m4992e(r2, r1, r4)     // Catch: java.lang.Throwable -> L3f
            m5027a(r0)
            if (r3 == 0) goto L3e
            r3.flush()     // Catch: java.io.IOException -> L3e
            r3.close()     // Catch: java.io.IOException -> L3e
        L3e:
            return
        L3f:
            r4 = move-exception
        L40:
            m5027a(r0)
            if (r3 == 0) goto L4b
            r3.flush()     // Catch: java.io.IOException -> L4b
            r3.close()     // Catch: java.io.IOException -> L4b
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.util.C6590c.m5026a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public static String m5034b(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = context.getAssets().open(str);
                byte[] bArr = new byte[inputStreamOpen.available()];
                if (inputStreamOpen.read(bArr) <= 0) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                    return "";
                }
                inputStreamOpen.close();
                String str2 = new String(bArr, "utf-8");
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
                return str2;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e10) {
            TXCLog.m4992e("FileUtil", "read asset file failed.", e10);
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused4) {
                }
            }
            return "";
        }
    }

    /* renamed from: a */
    public static void m5028a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    /* renamed from: a */
    public static boolean m5033a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* renamed from: a */
    public static void m5029a(String str, byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                try {
                    str = new FileOutputStream(new File((String) str));
                    try {
                        bufferedOutputStream = new BufferedOutputStream(str);
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.close();
                    str.close();
                } catch (Exception e11) {
                    e = e11;
                    bufferedOutputStream2 = bufferedOutputStream;
                    TXCLog.m4992e("FileUtil", "write file failed.", e);
                    if (bufferedOutputStream2 != null) {
                        bufferedOutputStream2.close();
                    }
                    if (str != 0) {
                        str.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 != null) {
                        try {
                            bufferedOutputStream2.close();
                        } catch (Exception unused) {
                            throw th;
                        }
                    }
                    if (str != 0) {
                        str.close();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                str = 0;
            } catch (Throwable th3) {
                th = th3;
                str = 0;
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public static boolean m5032a(Context context, String str) throws IOException {
        try {
            for (String str2 : context.getAssets().list("")) {
                if (str2.equals(str.trim())) {
                    TXCLog.m4994i("isAssetFileExists", str + " exist");
                    return true;
                }
            }
            TXCLog.m4994i("isAssetFileExists", str + " not exist");
            return false;
        } catch (IOException unused) {
            TXCLog.m4994i("isAssetFileExists", str + " not exist");
            return false;
        }
    }

    /* renamed from: a */
    public static void m5027a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}

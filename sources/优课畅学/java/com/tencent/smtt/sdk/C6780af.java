package com.tencent.smtt.sdk;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: com.tencent.smtt.sdk.af */
/* loaded from: classes4.dex */
class C6780af {

    /* renamed from: a */
    private static C6780af f6804a;

    /* renamed from: b */
    private static Context f6805b;

    private C6780af() {
    }

    /* renamed from: a */
    public static C6780af m6042a(Context context) {
        if (f6804a == null) {
            synchronized (C6780af.class) {
                try {
                    if (f6804a == null) {
                        f6804a = new C6780af();
                    }
                } finally {
                }
            }
        }
        f6805b = context.getApplicationContext();
        return f6804a;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Properties m6043e() throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.m6044a()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L34
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L34
            if (r1 == 0) goto L29
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            r2.load(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r0 = r1
            goto L29
        L1b:
            r0 = move-exception
            goto L46
        L1d:
            r0 = move-exception
            goto L38
        L1f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L46
        L24:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L38
        L29:
            if (r0 == 0) goto L33
            r0.close()     // Catch: java.io.IOException -> L2f
            return r2
        L2f:
            r0 = move-exception
            r0.printStackTrace()
        L33:
            return r2
        L34:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L38:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.io.IOException -> L41
            goto L45
        L41:
            r0 = move-exception
            r0.printStackTrace()
        L45:
            return r2
        L46:
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.io.IOException -> L4c
            goto L50
        L4c:
            r1 = move-exception
            r1.printStackTrace()
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6780af.m6043e():java.util.Properties");
    }

    /* renamed from: b */
    public int m6050b() {
        return m6055c("install_core_ver");
    }

    /* renamed from: c */
    public int m6054c() {
        return m6051b("install_status");
    }

    /* renamed from: d */
    public int m6057d() {
        return m6051b("incrupdate_status");
    }

    /* renamed from: a */
    public File m6044a() throws IOException {
        C6785ak.m6068a();
        File file = new File(C6785ak.m6087p(f6805b), "tbscoreinstall.txt");
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public int m6051b(String str) throws Throwable {
        Properties propertiesM6043e = m6043e();
        if (propertiesM6043e == null || propertiesM6043e.getProperty(str) == null) {
            return -1;
        }
        return Integer.parseInt(propertiesM6043e.getProperty(str));
    }

    /* renamed from: c */
    public int m6055c(String str) throws Throwable {
        Properties propertiesM6043e = m6043e();
        if (propertiesM6043e == null || propertiesM6043e.getProperty(str) == null) {
            return 0;
        }
        return Integer.parseInt(propertiesM6043e.getProperty(str));
    }

    /* renamed from: d */
    public String m6058d(String str) throws Throwable {
        Properties propertiesM6043e = m6043e();
        if (propertiesM6043e == null || propertiesM6043e.getProperty(str) == null) {
            return null;
        }
        return propertiesM6043e.getProperty(str);
    }

    /* renamed from: a */
    public void m6045a(int i10) {
        m6048a("dexopt_retry_num", i10);
    }

    /* renamed from: b */
    public void m6052b(int i10) {
        m6048a("unzip_retry_num", i10);
    }

    /* renamed from: c */
    public void m6056c(int i10) {
        m6048a("incrupdate_status", i10);
    }

    /* renamed from: d */
    public void m6059d(int i10) {
        m6048a("unlzma_status", i10);
    }

    /* renamed from: a */
    public void m6046a(int i10, int i11) {
        m6048a("copy_core_ver", i10);
        m6048a("copy_status", i11);
    }

    /* renamed from: b */
    public void m6053b(int i10, int i11) {
        m6048a("install_core_ver", i10);
        m6048a("install_status", i11);
    }

    /* renamed from: a */
    public void m6047a(String str) {
        m6049a("install_apk_path", str);
    }

    /* renamed from: a */
    public void m6048a(String str, int i10) {
        m6049a(str, String.valueOf(i10));
    }

    /* renamed from: a */
    public void m6049a(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    Properties propertiesM6043e = m6043e();
                    if (propertiesM6043e != null) {
                        propertiesM6043e.setProperty(str, str2);
                        File fileM6044a = m6044a();
                        if (fileM6044a != null) {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(fileM6044a);
                            try {
                                propertiesM6043e.store(fileOutputStream2, "update " + str + " and status!");
                                fileOutputStream = fileOutputStream2;
                            } catch (Exception e10) {
                                e = e10;
                                fileOutputStream = fileOutputStream2;
                                e.printStackTrace();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        }
    }
}

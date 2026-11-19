package com.p040uc.crashsdk.p041a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.p040uc.crashsdk.C3307b;
import com.p040uc.crashsdk.C3312g;
import com.p040uc.crashsdk.JNIBridge;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3376bw;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* renamed from: com.uc.crashsdk.a.g */
/* loaded from: classes2.dex */
public class C3305g {

    /* renamed from: a */
    static final /* synthetic */ boolean f1361a = true;

    /* renamed from: b */
    private static Context f1362b = null;

    /* renamed from: c */
    private static String f1363c = null;

    /* renamed from: d */
    private static String f1364d = null;

    /* renamed from: e */
    private static String f1365e = null;

    /* renamed from: f */
    private static String f1366f = null;

    /* renamed from: g */
    private static String f1367g = null;

    /* renamed from: h */
    private static boolean f1368h = false;

    /* renamed from: i */
    private static final Object f1369i = new Object();

    /* renamed from: j */
    private static final char[] f1370j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m2369a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[524288];
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file2.isDirectory()) {
            file2 = new File(file2, file.getName());
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    try {
                        int i4 = fileInputStream2.read(bArr);
                        if (i4 == -1) {
                            m2368a(fileInputStream2);
                            m2368a(fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i4);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        m2368a(fileInputStream);
                        m2368a(fileOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* renamed from: b */
    public static void m2378b(File file) {
        m2373a(file, "");
    }

    /* renamed from: c */
    public static String m2383c(File file) {
        String string = "";
        if (!file.exists()) {
            return "";
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[256];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i4 = fileInputStream2.read(bArr);
                    if (i4 <= 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, i4));
                }
                string = sb.toString();
                m2368a(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    m2371a(th, false);
                    return string;
                } finally {
                    m2368a(fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return string;
    }

    /* renamed from: d */
    public static String m2385d(File file) {
        return m2362a(file, 64, true);
    }

    /* renamed from: e */
    public static byte[] m2388e(File file) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr);
                return bArr;
            } catch (Throwable th) {
                th = th;
                try {
                    m2371a(th, false);
                    return null;
                } finally {
                    m2368a(fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    /* renamed from: f */
    public static boolean m2389f() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: g */
    public static boolean m2390g() {
        int iIndexOf;
        String strM2392i = m2392i();
        if (!m2375a(strM2392i) && (iIndexOf = strM2392i.indexOf(" root ")) > 0) {
            String strSubstring = strM2392i.substring(0, iIndexOf);
            if (strSubstring.contains("x") || strSubstring.contains(C3335ai.f1711az)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static String m2391h() {
        m2395l();
        return m2375a(f1366f) ? "" : f1366f;
    }

    /* renamed from: i */
    public static String m2392i() {
        m2395l();
        return m2375a(f1367g) ? "" : f1367g;
    }

    /* renamed from: j */
    public static void m2393j() {
        C3304f.m2357a(0, new RunnableC3303e(800), 15000L);
    }

    /* renamed from: k */
    public static void m2394k() {
        if (C3307b.f1428d && f1368h) {
            JNIBridge.set(123, f1366f);
            JNIBridge.set(124, f1367g);
        }
    }

    /* renamed from: l */
    private static void m2395l() {
        String strTrim;
        int iIndexOf;
        int iIndexOf2;
        if (f1368h) {
            return;
        }
        synchronized (f1369i) {
            if (f1368h) {
                return;
            }
            String strM2364a = m2364a(new String[]{"sh", "-c", "type su"});
            if (!m2375a(strM2364a) && (iIndexOf = (strTrim = strM2364a.trim()).indexOf(32)) > 0 && strTrim.contains("/su") && (iIndexOf2 = strTrim.indexOf(47, iIndexOf + 1)) > 0) {
                String strSubstring = strTrim.substring(iIndexOf2);
                f1366f = strSubstring;
                String strM2364a2 = m2364a(new String[]{"ls", "-l", strSubstring});
                if (!m2375a(strM2364a2)) {
                    f1367g = strM2364a2.trim();
                }
            }
            f1368h = true;
            m2394k();
        }
    }

    /* renamed from: a */
    public static boolean m2372a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!m2372a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: b */
    public static boolean m2380b(String str) {
        return !m2375a(str);
    }

    /* renamed from: d */
    public static String m2384d() {
        String str = f1365e;
        return str != null ? str : "";
    }

    /* renamed from: b */
    public static void m2379b(Throwable th) {
        m2371a(th, true);
    }

    /* renamed from: d */
    public static String m2386d(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("utf-8");
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            int length = bArrDigest.length;
            StringBuilder sb = new StringBuilder(length * 2);
            int i4 = length + 0;
            for (int i5 = 0; i5 < i4; i5++) {
                byte b4 = bArrDigest[i5];
                char[] cArr = f1370j;
                char c4 = cArr[(b4 & 240) >> 4];
                char c5 = cArr[b4 & C3376bw.f1946m];
                sb.append(c4);
                sb.append(c5);
            }
            return sb.toString();
        } catch (Exception e4) {
            C3299a.m2320a("crashsdk", "getMD5: ", e4);
            return null;
        }
    }

    /* renamed from: b */
    public static String m2377b() {
        return f1363c;
    }

    /* renamed from: a */
    public static String m2362a(File file, int i4, boolean z3) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[i4];
                int i5 = fileInputStream.read(bArr);
                if (i5 > 0) {
                    return new String(bArr, 0, i5);
                }
            } catch (Throwable th) {
                th = th;
                if (z3) {
                    try {
                        m2371a(th, false);
                    } finally {
                        m2368a(fileInputStream);
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m2387e() {
        if (m2390g()) {
            return true;
        }
        return m2389f();
    }

    /* renamed from: c */
    public static long m2381c(String str) throws NumberFormatException {
        if (m2375a(str)) {
            return 0L;
        }
        try {
            long j4 = Long.parseLong(str.trim());
            if (j4 < 0) {
                return 0L;
            }
            return j4;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* renamed from: c */
    public static String m2382c() {
        return f1364d;
    }

    /* renamed from: a */
    public static ArrayList<String> m2365a(File file, int i4) {
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2, 512);
                int i5 = 0;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(line);
                        i5++;
                        if (i4 > 0 && i5 >= i4) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileReader = fileReader2;
                        try {
                            m2371a(th, false);
                            m2368a(fileReader);
                            m2368a(bufferedReader);
                            return arrayList;
                        } catch (Throwable th2) {
                            m2368a(fileReader);
                            m2368a(bufferedReader);
                            throw th2;
                        }
                    }
                }
                m2368a(fileReader2);
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        m2368a(bufferedReader);
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m2374a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                m2368a(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    m2371a(th, false);
                    return false;
                } finally {
                    m2368a(fileOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static boolean m2373a(File file, String str) {
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str, 0, str.length());
                m2368a(fileWriter2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                try {
                    m2371a(th, false);
                    return false;
                } finally {
                    m2368a(fileWriter);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static void m2368a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                m2371a(th, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[PHI: r2
      0x0029: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String) binds: [B:7:0x0017, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2363a(java.lang.String r2, java.lang.String r3, boolean r4) throws java.lang.Throwable {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.String r2 = com.p040uc.crashsdk.p041a.C3300b.m2325a(r2)
            boolean r0 = m2375a(r2)
            if (r0 == 0) goto L17
            goto L2a
        L17:
            if (r4 == 0) goto L29
            java.lang.String r2 = r2.trim()
            java.lang.String r4 = r2.toLowerCase()
            java.lang.String r0 = "http"
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 != 0) goto L2d
            goto L2e
        L2d:
            r3 = r1
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.p041a.C3305g.m2363a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m2375a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: a */
    public static boolean m2376a(StringBuffer stringBuffer) {
        return stringBuffer == null || stringBuffer.length() == 0;
    }

    /* renamed from: a */
    public static void m2370a(Throwable th) {
        m2371a(th, false);
    }

    /* renamed from: a */
    private static void m2371a(Throwable th, boolean z3) {
        if (!z3) {
            try {
                if (!C3312g.m2705M()) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        th.printStackTrace();
    }

    /* renamed from: a */
    public static void m2367a(Context context) {
        if (f1362b != null) {
            C3299a.m2321b("mContext is existed");
        }
        f1362b = context;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        f1363c = applicationInfo.dataDir;
        f1364d = applicationInfo.sourceDir;
        try {
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(applicationInfo);
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            f1365e = (String) obj;
        } catch (Throwable th) {
            m2371a(th, false);
        }
    }

    /* renamed from: a */
    public static Context m2361a() {
        return f1362b;
    }

    /* renamed from: a */
    public static void m2366a(int i4) {
        if (i4 != 800) {
            if (!f1361a) {
                throw new AssertionError();
            }
        } else {
            m2395l();
        }
    }

    /* renamed from: a */
    private static String m2364a(String[] strArr) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader, 512);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            return sb.toString().trim();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        m2371a(th, false);
                        return null;
                    } finally {
                        m2368a(bufferedReader);
                        m2368a(inputStreamReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            inputStreamReader = null;
        }
    }
}

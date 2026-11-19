package com.p071uc.crashsdk.p072a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.p071uc.crashsdk.C6746b;
import com.p071uc.crashsdk.C6751g;
import com.p071uc.crashsdk.JNIBridge;
import com.taobao.sophix.PatchStatus;
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
/* loaded from: classes4.dex */
public class C6744g {

    /* renamed from: a */
    static final /* synthetic */ boolean f6359a = true;

    /* renamed from: b */
    private static Context f6360b = null;

    /* renamed from: c */
    private static String f6361c = null;

    /* renamed from: d */
    private static String f6362d = null;

    /* renamed from: e */
    private static String f6363e = null;

    /* renamed from: f */
    private static String f6364f = null;

    /* renamed from: g */
    private static String f6365g = null;

    /* renamed from: h */
    private static boolean f6366h = false;

    /* renamed from: i */
    private static final Object f6367i = new Object();

    /* renamed from: j */
    private static final char[] f6368j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m5613a(File file, File file2) throws Throwable {
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
                        int i9 = fileInputStream2.read(bArr);
                        if (i9 == -1) {
                            m5612a(fileInputStream2);
                            m5612a(fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i9);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        m5612a(fileInputStream);
                        m5612a(fileOutputStream);
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
    public static void m5622b(File file) {
        m5617a(file, "");
    }

    /* renamed from: c */
    public static String m5627c(File file) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            return "";
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[256];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i9 = fileInputStream.read(bArr);
                if (i9 <= 0) {
                    String string = sb.toString();
                    m5612a(fileInputStream);
                    return string;
                }
                sb.append(new String(bArr, 0, i9));
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            try {
                m5615a(th, false);
                return "";
            } finally {
                m5612a(fileInputStream2);
            }
        }
    }

    /* renamed from: d */
    public static String m5629d(File file) {
        return m5606a(file, 64, true);
    }

    /* renamed from: e */
    public static byte[] m5632e(File file) {
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
                    m5615a(th, false);
                    return null;
                } finally {
                    m5612a(fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    /* renamed from: f */
    public static boolean m5633f() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: g */
    public static boolean m5634g() {
        int iIndexOf;
        String strM5636i = m5636i();
        if (!m5619a(strM5636i) && (iIndexOf = strM5636i.indexOf(" root ")) > 0) {
            String strSubstring = strM5636i.substring(0, iIndexOf);
            if (strSubstring.contains("x") || strSubstring.contains("s")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static String m5635h() {
        m5639l();
        return m5619a(f6364f) ? "" : f6364f;
    }

    /* renamed from: i */
    public static String m5636i() {
        m5639l();
        return m5619a(f6365g) ? "" : f6365g;
    }

    /* renamed from: j */
    public static void m5637j() {
        C6743f.m5601a(0, new RunnableC6742e(800), 15000L);
    }

    /* renamed from: k */
    public static void m5638k() {
        if (C6746b.f6426d && f6366h) {
            JNIBridge.set(PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, f6364f);
            JNIBridge.set(124, f6365g);
        }
    }

    /* renamed from: l */
    private static void m5639l() {
        String strTrim;
        int iIndexOf;
        int iIndexOf2;
        if (f6366h) {
            return;
        }
        synchronized (f6367i) {
            try {
                if (f6366h) {
                    return;
                }
                String strM5608a = m5608a(new String[]{"sh", "-c", "type su"});
                if (!m5619a(strM5608a) && (iIndexOf = (strTrim = strM5608a.trim()).indexOf(32)) > 0 && strTrim.contains("/su") && (iIndexOf2 = strTrim.indexOf(47, iIndexOf + 1)) > 0) {
                    String strSubstring = strTrim.substring(iIndexOf2);
                    f6364f = strSubstring;
                    String strM5608a2 = m5608a(new String[]{"ls", "-l", strSubstring});
                    if (!m5619a(strM5608a2)) {
                        f6365g = strM5608a2.trim();
                    }
                }
                f6366h = true;
                m5638k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static boolean m5616a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!m5616a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: b */
    public static boolean m5624b(String str) {
        return !m5619a(str);
    }

    /* renamed from: d */
    public static String m5628d() {
        String str = f6363e;
        return str != null ? str : "";
    }

    /* renamed from: b */
    public static void m5623b(Throwable th) {
        m5615a(th, true);
    }

    /* renamed from: b */
    public static String m5621b() {
        return f6361c;
    }

    /* renamed from: d */
    public static String m5630d(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("utf-8");
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                char[] cArr = f6368j;
                char c10 = cArr[(b10 & 240) >> 4];
                char c11 = cArr[b10 & 15];
                sb.append(c10);
                sb.append(c11);
            }
            return sb.toString();
        } catch (Exception e10) {
            C6738a.m5564a("crashsdk", "getMD5: ", e10);
            return null;
        }
    }

    /* renamed from: a */
    public static String m5606a(File file, int i9, boolean z9) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[i9];
                int i10 = fileInputStream.read(bArr);
                if (i10 > 0) {
                    return new String(bArr, 0, i10);
                }
            } catch (Throwable th) {
                th = th;
                if (z9) {
                    try {
                        m5615a(th, false);
                    } finally {
                        m5612a(fileInputStream);
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
    public static boolean m5631e() {
        if (m5634g()) {
            return true;
        }
        return m5633f();
    }

    /* renamed from: c */
    public static long m5625c(String str) throws NumberFormatException {
        if (!m5619a(str)) {
            try {
                long j9 = Long.parseLong(str.trim());
                if (j9 < 0) {
                    return 0L;
                }
                return j9;
            } catch (NumberFormatException unused) {
            }
        }
        return 0L;
    }

    /* renamed from: c */
    public static String m5626c() {
        return f6362d;
    }

    /* renamed from: a */
    public static ArrayList<String> m5609a(File file, int i9) {
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2, 512);
                int i10 = 0;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(line);
                        i10++;
                        if (i9 > 0 && i10 >= i9) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileReader = fileReader2;
                        try {
                            m5615a(th, false);
                            m5612a(fileReader);
                            m5612a(bufferedReader);
                            return arrayList;
                        } catch (Throwable th2) {
                            m5612a(fileReader);
                            m5612a(bufferedReader);
                            throw th2;
                        }
                    }
                }
                m5612a(fileReader2);
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        m5612a(bufferedReader);
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m5618a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                m5612a(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    m5615a(th, false);
                    return false;
                } finally {
                    m5612a(fileOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static boolean m5617a(File file, String str) {
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str, 0, str.length());
                m5612a(fileWriter2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                try {
                    m5615a(th, false);
                    return false;
                } finally {
                    m5612a(fileWriter);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static void m5612a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                m5615a(th, true);
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
    public static java.lang.String m5607a(java.lang.String r2, java.lang.String r3, boolean r4) throws java.lang.Throwable {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.String r2 = com.p071uc.crashsdk.p072a.C6739b.m5569a(r2)
            boolean r0 = m5619a(r2)
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
            return r3
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.p072a.C6744g.m5607a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m5619a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: a */
    public static boolean m5620a(StringBuffer stringBuffer) {
        return stringBuffer == null || stringBuffer.length() == 0;
    }

    /* renamed from: a */
    public static void m5614a(Throwable th) {
        m5615a(th, false);
    }

    /* renamed from: a */
    private static void m5615a(Throwable th, boolean z9) {
        if (!z9) {
            try {
                if (!C6751g.m5949M()) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        th.printStackTrace();
    }

    /* renamed from: a */
    public static void m5611a(Context context) {
        if (f6360b != null) {
            C6738a.m5565b("mContext is existed");
        }
        f6360b = context;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        f6361c = applicationInfo.dataDir;
        f6362d = applicationInfo.sourceDir;
        try {
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(applicationInfo);
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            f6363e = (String) obj;
        } catch (Throwable th) {
            m5615a(th, false);
        }
    }

    /* renamed from: a */
    public static Context m5605a() {
        return f6360b;
    }

    /* renamed from: a */
    public static void m5610a(int i9) {
        if (i9 != 800) {
            if (!f6359a) {
                throw new AssertionError();
            }
        } else {
            m5639l();
        }
    }

    /* renamed from: a */
    private static String m5608a(String[] strArr) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        String strTrim = null;
        try {
            inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader, 512);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    strTrim = sb.toString().trim();
                } catch (Throwable th) {
                    th = th;
                    try {
                        m5615a(th, false);
                        return strTrim;
                    } finally {
                        m5612a(bufferedReader);
                        m5612a(inputStreamReader);
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
        return strTrim;
    }
}

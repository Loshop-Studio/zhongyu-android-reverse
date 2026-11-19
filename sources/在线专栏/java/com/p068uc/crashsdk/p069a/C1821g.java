package com.p068uc.crashsdk.p069a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import anet.channel.bytes.C0860a;
import anet.channel.entity.EventType;
import com.p068uc.crashsdk.C1823b;
import com.p068uc.crashsdk.C1828g;
import com.p068uc.crashsdk.JNIBridge;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.analytics.pro.C1892bw;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
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
/* loaded from: classes.dex */
public class C1821g {

    /* renamed from: a */
    static final /* synthetic */ boolean f7953a = true;

    /* renamed from: b */
    private static Context f7954b = null;

    /* renamed from: c */
    private static String f7955c = null;

    /* renamed from: d */
    private static String f7956d = null;

    /* renamed from: e */
    private static String f7957e = null;

    /* renamed from: f */
    private static String f7958f = null;

    /* renamed from: g */
    private static String f7959g = null;

    /* renamed from: h */
    private static boolean f7960h = false;

    /* renamed from: i */
    private static final Object f7961i = new Object();

    /* renamed from: j */
    private static final char[] f7962j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static void m6292a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[C0860a.MAX_POOL_SIZE];
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
                            m6291a(fileInputStream2);
                            m6291a(fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i4);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        m6291a(fileInputStream);
                        m6291a(fileOutputStream);
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
    public static void m6301b(File file) {
        m6296a(file, "");
    }

    /* renamed from: c */
    public static String m6306c(File file) {
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
                m6291a(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    m6294a(th, false);
                    return string;
                } finally {
                    m6291a(fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return string;
    }

    /* renamed from: d */
    public static String m6308d(File file) {
        return m6285a(file, 64, true);
    }

    /* renamed from: e */
    public static byte[] m6311e(File file) {
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
                    m6294a(th, false);
                    return null;
                } finally {
                    m6291a(fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    /* renamed from: f */
    public static boolean m6312f() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: g */
    public static boolean m6313g() {
        int iIndexOf;
        String strM6315i = m6315i();
        if (!m6298a(strM6315i) && (iIndexOf = strM6315i.indexOf(" root ")) > 0) {
            String strSubstring = strM6315i.substring(0, iIndexOf);
            if (strSubstring.contains("x") || strSubstring.contains(C1851ai.f8303az)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static String m6314h() {
        m6318l();
        return m6298a(f7958f) ? "" : f7958f;
    }

    /* renamed from: i */
    public static String m6315i() {
        m6318l();
        return m6298a(f7959g) ? "" : f7959g;
    }

    /* renamed from: j */
    public static void m6316j() {
        C1820f.m6280a(0, new RunnableC1819e(IGoodView.DEFAULT_DURATION), 15000L);
    }

    /* renamed from: k */
    public static void m6317k() {
        if (C1823b.f8020d && f7960h) {
            JNIBridge.set(123, f7958f);
            JNIBridge.set(124, f7959g);
        }
    }

    /* renamed from: l */
    private static void m6318l() {
        String strTrim;
        int iIndexOf;
        int iIndexOf2;
        if (f7960h) {
            return;
        }
        synchronized (f7961i) {
            if (f7960h) {
                return;
            }
            String strM6287a = m6287a(new String[]{"sh", "-c", "type su"});
            if (!m6298a(strM6287a) && (iIndexOf = (strTrim = strM6287a.trim()).indexOf(32)) > 0 && strTrim.contains("/su") && (iIndexOf2 = strTrim.indexOf(47, iIndexOf + 1)) > 0) {
                String strSubstring = strTrim.substring(iIndexOf2);
                f7958f = strSubstring;
                String strM6287a2 = m6287a(new String[]{"ls", "-l", strSubstring});
                if (!m6298a(strM6287a2)) {
                    f7959g = strM6287a2.trim();
                }
            }
            f7960h = true;
            m6317k();
        }
    }

    /* renamed from: a */
    public static boolean m6295a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!m6295a(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* renamed from: b */
    public static boolean m6303b(String str) {
        return !m6298a(str);
    }

    /* renamed from: d */
    public static String m6307d() {
        String str = f7957e;
        return str != null ? str : "";
    }

    /* renamed from: b */
    public static void m6302b(Throwable th) {
        m6294a(th, true);
    }

    /* renamed from: d */
    public static String m6309d(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
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
                char[] cArr = f7962j;
                char c4 = cArr[(b4 & 240) >> 4];
                char c5 = cArr[b4 & C1892bw.f8538m];
                sb.append(c4);
                sb.append(c5);
            }
            return sb.toString();
        } catch (Exception e4) {
            C1815a.m6243a("crashsdk", "getMD5: ", e4);
            return null;
        }
    }

    /* renamed from: b */
    public static String m6300b() {
        return f7955c;
    }

    /* renamed from: a */
    public static String m6285a(File file, int i4, boolean z3) {
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
                        m6294a(th, false);
                    } finally {
                        m6291a(fileInputStream);
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
    public static boolean m6310e() {
        if (m6313g()) {
            return true;
        }
        return m6312f();
    }

    /* renamed from: c */
    public static long m6304c(String str) throws NumberFormatException {
        if (m6298a(str)) {
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
    public static String m6305c() {
        return f7956d;
    }

    /* renamed from: a */
    public static ArrayList<String> m6288a(File file, int i4) {
        BufferedReader bufferedReader;
        ArrayList<String> arrayList = new ArrayList<>();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader2, EventType.AUTH_SUCC);
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
                            m6294a(th, false);
                            m6291a(fileReader);
                            m6291a(bufferedReader);
                            return arrayList;
                        } catch (Throwable th2) {
                            m6291a(fileReader);
                            m6291a(bufferedReader);
                            throw th2;
                        }
                    }
                }
                m6291a(fileReader2);
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        m6291a(bufferedReader);
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m6297a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                m6291a(fileOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    m6294a(th, false);
                    return false;
                } finally {
                    m6291a(fileOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static boolean m6296a(File file, String str) {
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str, 0, str.length());
                m6291a(fileWriter2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                try {
                    m6294a(th, false);
                    return false;
                } finally {
                    m6291a(fileWriter);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static void m6291a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                m6294a(th, true);
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
    public static java.lang.String m6286a(java.lang.String r2, java.lang.String r3, boolean r4) throws java.lang.Throwable {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.String r2 = com.p068uc.crashsdk.p069a.C1816b.m6248a(r2)
            boolean r0 = m6298a(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.p069a.C1821g.m6286a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m6298a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: a */
    public static boolean m6299a(StringBuffer stringBuffer) {
        return stringBuffer == null || stringBuffer.length() == 0;
    }

    /* renamed from: a */
    public static void m6293a(Throwable th) {
        m6294a(th, false);
    }

    /* renamed from: a */
    private static void m6294a(Throwable th, boolean z3) {
        if (!z3) {
            try {
                if (!C1828g.m6628M()) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        th.printStackTrace();
    }

    /* renamed from: a */
    public static void m6290a(Context context) {
        if (f7954b != null) {
            C1815a.m6244b("mContext is existed");
        }
        f7954b = context;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        f7955c = applicationInfo.dataDir;
        f7956d = applicationInfo.sourceDir;
        try {
            Field declaredField = ApplicationInfo.class.getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(applicationInfo);
            if (obj == null || !(obj instanceof String)) {
                return;
            }
            f7957e = (String) obj;
        } catch (Throwable th) {
            m6294a(th, false);
        }
    }

    /* renamed from: a */
    public static Context m6284a() {
        return f7954b;
    }

    /* renamed from: a */
    public static void m6289a(int i4) {
        if (i4 != 800) {
            if (!f7953a) {
                throw new AssertionError();
            }
        } else {
            m6318l();
        }
    }

    /* renamed from: a */
    private static String m6287a(String[] strArr) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec(strArr).getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader, EventType.AUTH_SUCC);
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
                        m6294a(th, false);
                        return null;
                    } finally {
                        m6291a(bufferedReader);
                        m6291a(inputStreamReader);
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

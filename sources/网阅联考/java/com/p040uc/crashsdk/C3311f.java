package com.p040uc.crashsdk;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.p040uc.crashsdk.p041a.C3299a;
import com.p040uc.crashsdk.p041a.C3304f;
import com.p040uc.crashsdk.p041a.C3305g;
import com.p040uc.crashsdk.p041a.C3306h;
import com.p040uc.crashsdk.p041a.RunnableC3303e;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.uc.crashsdk.f */
/* loaded from: classes2.dex */
public class C3311f {

    /* renamed from: a */
    static final /* synthetic */ boolean f1534a = true;

    /* renamed from: b */
    private static final Map<String, SparseIntArray> f1535b = new HashMap();

    /* renamed from: c */
    private static final Object f1536c = new Object();

    /* renamed from: d */
    private static final SparseArray<String> f1537d = new SparseArray<>();

    /* renamed from: e */
    private static final Object f1538e = new Object();

    /* renamed from: f */
    private static boolean f1539f = false;

    /* renamed from: a */
    public static void m2672a(int i4) {
        m2673a(i4, 1);
    }

    /* renamed from: b */
    private static boolean m2683b(int i4, int i5) {
        try {
            C3307b.m2507u();
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
        try {
            String strM2685c = m2685c(i4);
            if (strM2685c == null) {
                C3299a.m2320a("crashsdk", "Stat type not exists: " + i4, null);
                return false;
            }
            File file = new File(C3307b.m2486c());
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th2) {
                C3305g.m2370a(th2);
            }
            StringBuffer stringBufferM2671a = m2671a(file);
            if (C3305g.m2376a(stringBufferM2671a)) {
                if (stringBufferM2671a == null) {
                    stringBufferM2671a = new StringBuffer();
                }
                stringBufferM2671a.append("[");
                stringBufferM2671a.append(C3310e.m2624h());
                stringBufferM2671a.append("]\n");
            }
            m2674a(stringBufferM2671a, strM2685c, m2669a(stringBufferM2671a, strM2685c) + i5);
            return m2676a(file, stringBufferM2671a);
        } catch (Throwable th3) {
            C3305g.m2370a(th3);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m2688c(String str) {
        SparseIntArray sparseIntArray = f1535b.get(str);
        if (sparseIntArray == null) {
            return false;
        }
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            C3309d.m2518a(str, iKeyAt, sparseIntArray.get(iKeyAt));
        }
        return true;
    }

    /* renamed from: d */
    private static char[] m2690d() {
        char[] cArr = null;
        int i4 = 1024;
        while (cArr == null && i4 > 0) {
            try {
                cArr = new char[i4];
            } catch (Throwable unused) {
                i4 /= 2;
                if (i4 < 512) {
                    break;
                }
            }
        }
        return cArr;
    }

    /* renamed from: e */
    private static void m2691e() {
        SparseArray<String> sparseArray = f1537d;
        synchronized (sparseArray) {
            if (sparseArray.size() != 0) {
                return;
            }
            sparseArray.put(100, "start_pv");
            sparseArray.put(102, "start_hpv");
            sparseArray.put(1, "all_all");
            sparseArray.put(2, "all_fg");
            sparseArray.put(101, "all_bg");
            sparseArray.put(3, "java_fg");
            sparseArray.put(4, "java_bg");
            sparseArray.put(7, "native_fg");
            sparseArray.put(8, "native_bg");
            sparseArray.put(27, "native_anr_fg");
            sparseArray.put(28, "native_anr_bg");
            sparseArray.put(9, "native_ok");
            sparseArray.put(10, "unexp_anr");
            sparseArray.put(29, "unexp_lowmem");
            sparseArray.put(30, "unexp_killed");
            sparseArray.put(31, "unexp_exit");
            sparseArray.put(32, "unexp_restart");
            sparseArray.put(11, "unexp_fg");
            sparseArray.put(12, "unexp_bg");
            sparseArray.put(40, "anr_fg");
            sparseArray.put(41, "anr_bg");
            sparseArray.put(42, "anr_cr_fg");
            sparseArray.put(43, "anr_cr_bg");
            sparseArray.put(13, "log_up_succ");
            sparseArray.put(14, "log_up_fail");
            sparseArray.put(15, "log_empty");
            sparseArray.put(200, "log_tmp");
            sparseArray.put(16, "log_abd_all");
            sparseArray.put(22, "log_abd_builtin");
            sparseArray.put(23, "log_abd_custom");
            sparseArray.put(17, "log_large");
            sparseArray.put(18, "log_up_all");
            sparseArray.put(19, "log_up_bytes");
            sparseArray.put(20, "log_up_crash");
            sparseArray.put(21, "log_up_custom");
            sparseArray.put(24, "log_zipped");
            sparseArray.put(201, "log_enced");
            sparseArray.put(25, "log_renamed");
            sparseArray.put(26, "log_safe_skip");
        }
    }

    /* renamed from: f */
    private static File[] m2692f() {
        File[] fileArrListFiles = new File(C3312g.m2713U()).listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.getPath().endsWith(".st")) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    /* renamed from: a */
    public static void m2673a(int i4, int i5) {
        if (i5 != 0) {
            m2678a(C3307b.m2486c(), new RunnableC3303e(751, new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}));
            return;
        }
        C3299a.m2321b("Add stat for type " + i4 + " with count 0!");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0016, B:15:0x0018, B:17:0x001f, B:19:0x0029, B:28:0x004a, B:29:0x004d, B:30:0x0054, B:21:0x0030, B:23:0x0036, B:25:0x0041), top: B:35:0x0008 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2689d(boolean r2) {
        /*
            boolean r0 = com.p040uc.crashsdk.C3311f.f1539f
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = com.p040uc.crashsdk.C3311f.f1538e
            monitor-enter(r0)
            boolean r1 = com.p040uc.crashsdk.C3311f.f1539f     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        Le:
            java.lang.String r1 = "crash detail"
            boolean r2 = com.p040uc.crashsdk.p041a.C3306h.m2413a(r2, r1)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L18:
            boolean r2 = com.p040uc.crashsdk.C3307b.m2502p()     // Catch: java.lang.Throwable -> L56
            r1 = 1
            if (r2 == 0) goto L30
            r2 = 2
            m2673a(r2, r1)     // Catch: java.lang.Throwable -> L56
            boolean r2 = com.p040uc.crashsdk.C3307b.m2501o()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L2e
            r2 = 42
            m2673a(r2, r1)     // Catch: java.lang.Throwable -> L56
        L2e:
            r2 = r1
            goto L48
        L30:
            boolean r2 = com.p040uc.crashsdk.C3307b.m2503q()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L47
            r2 = 101(0x65, float:1.42E-43)
            m2673a(r2, r1)     // Catch: java.lang.Throwable -> L56
            boolean r2 = com.p040uc.crashsdk.C3307b.m2501o()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L2e
            r2 = 43
            m2673a(r2, r1)     // Catch: java.lang.Throwable -> L56
            goto L2e
        L47:
            r2 = 0
        L48:
            if (r2 == 0) goto L4d
            m2673a(r1, r1)     // Catch: java.lang.Throwable -> L56
        L4d:
            r2 = 100
            m2673a(r2, r1)     // Catch: java.lang.Throwable -> L56
            com.p040uc.crashsdk.C3311f.f1539f = r1     // Catch: java.lang.Throwable -> L56
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L56:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.C3311f.m2689d(boolean):void");
    }

    /* renamed from: c */
    private static String m2685c(int i4) {
        String str;
        m2691e();
        SparseArray<String> sparseArray = f1537d;
        synchronized (sparseArray) {
            str = sparseArray.get(i4);
        }
        return str;
    }

    /* renamed from: a */
    private static StringBuffer m2671a(File file) throws Throwable {
        FileReader fileReader;
        FileReader fileReader2 = null;
        if (!file.exists()) {
            return null;
        }
        char[] cArrM2690d = m2690d();
        if (cArrM2690d == null) {
            C3299a.m2320a("crashsdk", "readCrashStatData alloc buffer failed!", null);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                fileReader = new FileReader(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            int i4 = fileReader.read(cArrM2690d);
            if (i4 > 0) {
                fileReader2 = null;
                stringBuffer.append(cArrM2690d, 0, i4);
            }
            C3305g.m2368a(fileReader);
        } catch (Exception e5) {
            e = e5;
            fileReader2 = fileReader;
            C3305g.m2370a(e);
            C3305g.m2368a(fileReader2);
            return stringBuffer;
        } catch (Throwable th2) {
            th = th2;
            fileReader2 = fileReader;
            C3305g.m2368a(fileReader2);
            throw th;
        }
        return stringBuffer;
    }

    /* renamed from: c */
    public static void m2687c(boolean z3) {
        if (C3312g.m2707O() && !C3307b.m2453I()) {
            C3310e.m2630j();
            if (!C3306h.m2426e()) {
                C3306h.m2410a(z3);
            }
            if (C3307b.m2447C()) {
                m2689d(z3);
                m2679a(C3307b.m2486c(), z3);
                C3306h.m2418b(z3);
            }
        }
    }

    /* renamed from: a */
    private static int m2669a(StringBuffer stringBuffer, String str) throws NumberFormatException {
        int iIndexOf = stringBuffer.indexOf(str);
        if (iIndexOf < 0) {
            return 0;
        }
        int iIndexOf2 = stringBuffer.indexOf("=", iIndexOf + str.length());
        if (iIndexOf2 < 0) {
            C3299a.m2321b(str + " line not contain '='!");
            return 0;
        }
        int i4 = iIndexOf2 + 1;
        int iIndexOf3 = stringBuffer.indexOf("\n", i4);
        if (iIndexOf3 < 0) {
            iIndexOf3 = stringBuffer.length();
        }
        try {
            int i5 = Integer.parseInt(stringBuffer.substring(i4, iIndexOf3));
            if (i5 < 0) {
                return 0;
            }
            return i5;
        } catch (NumberFormatException e4) {
            C3305g.m2370a(e4);
            return 0;
        }
    }

    /* renamed from: b */
    private static boolean m2684b(String str) {
        m2691e();
        synchronized (f1537d) {
            File file = new File(str);
            StringBuffer stringBufferM2671a = m2671a(file);
            if (C3305g.m2376a(stringBufferM2671a)) {
                return false;
            }
            int iIndexOf = stringBufferM2671a.indexOf("[");
            if (iIndexOf < 0) {
                C3299a.m2320a("crashsdk", "Can not found process name start!", null);
                return false;
            }
            int i4 = iIndexOf + 1;
            int iIndexOf2 = stringBufferM2671a.indexOf("]", i4);
            if (iIndexOf2 < 0) {
                C3299a.m2320a("crashsdk", "Can not found process name end!", null);
                return false;
            }
            String strSubstring = stringBufferM2671a.substring(i4, iIndexOf2);
            int i5 = 0;
            boolean z3 = false;
            while (true) {
                try {
                    SparseArray<String> sparseArray = f1537d;
                    if (i5 >= sparseArray.size()) {
                        break;
                    }
                    int iKeyAt = sparseArray.keyAt(i5);
                    String str2 = sparseArray.get(iKeyAt);
                    int iM2669a = m2669a(stringBufferM2671a, str2);
                    if (iM2669a > 0) {
                        C3306h.m2406a(strSubstring, iKeyAt, iM2669a);
                        Map<String, SparseIntArray> map = f1535b;
                        synchronized (map) {
                            SparseIntArray sparseIntArray = map.get(strSubstring);
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                map.put(strSubstring, sparseIntArray);
                            }
                            sparseIntArray.put(iKeyAt, sparseIntArray.get(iKeyAt, 0) + iM2669a);
                        }
                        m2674a(stringBufferM2671a, str2, 0);
                        z3 = true;
                    }
                    i5++;
                } finally {
                    if (z3) {
                        m2676a(file, stringBufferM2671a);
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    public static void m2686c() {
        C3304f.m2357a(1, new RunnableC3303e(700), 3000L);
    }

    /* renamed from: a */
    private static void m2674a(StringBuffer stringBuffer, String str, int i4) {
        int iIndexOf = stringBuffer.indexOf(str);
        if (iIndexOf < 0) {
            if (i4 > 0) {
                stringBuffer.append(str);
                stringBuffer.append("=");
                stringBuffer.append(i4);
                stringBuffer.append("\n");
                return;
            }
            return;
        }
        int iIndexOf2 = stringBuffer.indexOf("\n", iIndexOf);
        if (iIndexOf2 < 0) {
            iIndexOf2 = stringBuffer.length();
        }
        stringBuffer.replace(iIndexOf, iIndexOf2, str + "=" + String.valueOf(i4));
    }

    /* renamed from: a */
    private static boolean m2676a(File file, StringBuffer stringBuffer) throws Throwable {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String string = stringBuffer.toString();
            fileWriter.write(string, 0, string.length());
            C3305g.m2368a(fileWriter);
            return true;
        } catch (Exception e5) {
            e = e5;
            fileWriter2 = fileWriter;
            C3305g.m2370a(e);
            C3305g.m2368a(fileWriter2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            C3305g.m2368a(fileWriter2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static int m2670a(boolean z3) {
        int i4;
        Map<String, SparseIntArray> map = f1535b;
        synchronized (map) {
            try {
                if (z3) {
                    String strM2624h = C3310e.m2624h();
                    boolean zM2688c = m2688c(strM2624h);
                    map.remove(strM2624h);
                    i4 = zM2688c;
                } else {
                    Iterator<String> it = map.keySet().iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        if (m2688c(it.next())) {
                            i5++;
                        }
                    }
                    f1535b.clear();
                    i4 = i5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    /* renamed from: a */
    private static boolean m2678a(String str, RunnableC3303e runnableC3303e) {
        return C3307b.m2478a(f1536c, str, runnableC3303e);
    }

    /* renamed from: a */
    public static boolean m2679a(String str, boolean z3) {
        if (C3306h.m2413a(z3, "crash detail report")) {
            return false;
        }
        return m2678a(str, new RunnableC3303e(752, new Object[]{str}));
    }

    /* renamed from: a */
    public static int m2668a() {
        File[] fileArrM2692f = m2692f();
        if (fileArrM2692f == null) {
            return 0;
        }
        int i4 = 0;
        for (File file : fileArrM2692f) {
            if (m2679a(file.getAbsolutePath(), false)) {
                i4++;
            }
        }
        return i4;
    }

    /* renamed from: b */
    public static int m2681b(boolean z3) {
        int size;
        Map<String, SparseIntArray> map = f1535b;
        synchronized (map) {
            try {
                if (z3) {
                    String strM2624h = C3310e.m2624h();
                    if (map.containsKey(strM2624h)) {
                        map.remove(strM2624h);
                        size = 1;
                    } else {
                        size = 0;
                    }
                } else {
                    size = map.size();
                    map.clear();
                }
            } finally {
            }
        }
        return size;
    }

    /* renamed from: a */
    public static boolean m2677a(String str) {
        return m2678a(str, new RunnableC3303e(753, new Object[]{str}));
    }

    /* renamed from: a */
    public static boolean m2675a(int i4, Object[] objArr) {
        switch (i4) {
            case 751:
                if (f1534a || objArr != null) {
                    return m2683b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                }
                throw new AssertionError();
            case 752:
                if (f1534a || objArr != null) {
                    return m2684b((String) objArr[0]);
                }
                throw new AssertionError();
            case 753:
                if (!f1534a && objArr == null) {
                    throw new AssertionError();
                }
                File file = new File((String) objArr[0]);
                if (!file.exists()) {
                    return false;
                }
                file.delete();
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static int m2680b() {
        File[] fileArrM2692f = m2692f();
        if (fileArrM2692f == null) {
            return 0;
        }
        int i4 = 0;
        for (File file : fileArrM2692f) {
            if (m2677a(file.getAbsolutePath())) {
                i4++;
            }
        }
        return i4;
    }

    /* renamed from: b */
    public static void m2682b(int i4) {
        if (i4 != 700) {
            return;
        }
        m2689d(false);
    }
}

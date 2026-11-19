package com.p068uc.crashsdk;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.p068uc.crashsdk.p069a.C1815a;
import com.p068uc.crashsdk.p069a.C1820f;
import com.p068uc.crashsdk.p069a.C1821g;
import com.p068uc.crashsdk.p069a.C1822h;
import com.p068uc.crashsdk.p069a.RunnableC1819e;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.uc.crashsdk.f */
/* loaded from: classes.dex */
public class C1827f {

    /* renamed from: a */
    static final /* synthetic */ boolean f8126a = true;

    /* renamed from: b */
    private static final Map<String, SparseIntArray> f8127b = new HashMap();

    /* renamed from: c */
    private static final Object f8128c = new Object();

    /* renamed from: d */
    private static final SparseArray<String> f8129d = new SparseArray<>();

    /* renamed from: e */
    private static final Object f8130e = new Object();

    /* renamed from: f */
    private static boolean f8131f = false;

    /* renamed from: a */
    static void m6595a(int i4) {
        m6596a(i4, 1);
    }

    /* renamed from: b */
    private static boolean m6606b(int i4, int i5) {
        try {
            C1823b.m6430u();
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
        try {
            String strM6608c = m6608c(i4);
            if (strM6608c == null) {
                C1815a.m6243a("crashsdk", "Stat type not exists: " + i4, null);
                return false;
            }
            File file = new File(C1823b.m6409c());
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th2) {
                C1821g.m6293a(th2);
            }
            StringBuffer stringBufferM6594a = m6594a(file);
            if (C1821g.m6299a(stringBufferM6594a)) {
                if (stringBufferM6594a == null) {
                    stringBufferM6594a = new StringBuffer();
                }
                stringBufferM6594a.append("[");
                stringBufferM6594a.append(C1826e.m6547h());
                stringBufferM6594a.append("]\n");
            }
            m6597a(stringBufferM6594a, strM6608c, m6592a(stringBufferM6594a, strM6608c) + i5);
            return m6599a(file, stringBufferM6594a);
        } catch (Throwable th3) {
            C1821g.m6293a(th3);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m6611c(String str) {
        SparseIntArray sparseIntArray = f8127b.get(str);
        if (sparseIntArray == null) {
            return false;
        }
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            C1825d.m6441a(str, iKeyAt, sparseIntArray.get(iKeyAt));
        }
        return true;
    }

    /* renamed from: d */
    private static char[] m6613d() {
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
    private static void m6614e() {
        SparseArray<String> sparseArray = f8129d;
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
    private static File[] m6615f() {
        File[] fileArrListFiles = new File(C1828g.m6636U()).listFiles();
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
    static void m6596a(int i4, int i5) {
        if (i5 != 0) {
            m6601a(C1823b.m6409c(), new RunnableC1819e(751, new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}));
            return;
        }
        C1815a.m6244b("Add stat for type " + i4 + " with count 0!");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0016, B:15:0x0018, B:17:0x0020, B:19:0x002a, B:27:0x004a, B:28:0x004d, B:29:0x0054, B:21:0x0031, B:23:0x0037, B:25:0x0042), top: B:34:0x0008 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m6612d(boolean r3) {
        /*
            boolean r0 = com.p068uc.crashsdk.C1827f.f8131f
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = com.p068uc.crashsdk.C1827f.f8130e
            monitor-enter(r0)
            boolean r1 = com.p068uc.crashsdk.C1827f.f8131f     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        Le:
            java.lang.String r1 = "crash detail"
            boolean r3 = com.p068uc.crashsdk.p069a.C1822h.m6336a(r3, r1)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L18:
            r3 = 0
            boolean r1 = com.p068uc.crashsdk.C1823b.m6425p()     // Catch: java.lang.Throwable -> L56
            r2 = 1
            if (r1 == 0) goto L31
            r3 = 2
            m6596a(r3, r2)     // Catch: java.lang.Throwable -> L56
            boolean r3 = com.p068uc.crashsdk.C1823b.m6424o()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L2f
            r3 = 42
            m6596a(r3, r2)     // Catch: java.lang.Throwable -> L56
        L2f:
            r3 = 1
            goto L48
        L31:
            boolean r1 = com.p068uc.crashsdk.C1823b.m6426q()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L48
            r3 = 101(0x65, float:1.42E-43)
            m6596a(r3, r2)     // Catch: java.lang.Throwable -> L56
            boolean r3 = com.p068uc.crashsdk.C1823b.m6424o()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L2f
            r3 = 43
            m6596a(r3, r2)     // Catch: java.lang.Throwable -> L56
            goto L2f
        L48:
            if (r3 == 0) goto L4d
            m6596a(r2, r2)     // Catch: java.lang.Throwable -> L56
        L4d:
            r3 = 100
            m6596a(r3, r2)     // Catch: java.lang.Throwable -> L56
            com.p068uc.crashsdk.C1827f.f8131f = r2     // Catch: java.lang.Throwable -> L56
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L56:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.C1827f.m6612d(boolean):void");
    }

    /* renamed from: c */
    private static String m6608c(int i4) {
        String str;
        m6614e();
        SparseArray<String> sparseArray = f8129d;
        synchronized (sparseArray) {
            str = sparseArray.get(i4);
        }
        return str;
    }

    /* renamed from: a */
    private static StringBuffer m6594a(File file) throws Throwable {
        FileReader fileReader;
        FileReader fileReader2 = null;
        if (!file.exists()) {
            return null;
        }
        char[] cArrM6613d = m6613d();
        if (cArrM6613d == null) {
            C1815a.m6243a("crashsdk", "readCrashStatData alloc buffer failed!", null);
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
            int i4 = fileReader.read(cArrM6613d);
            if (i4 > 0) {
                fileReader2 = null;
                stringBuffer.append(cArrM6613d, 0, i4);
            }
            C1821g.m6291a(fileReader);
        } catch (Exception e5) {
            e = e5;
            fileReader2 = fileReader;
            C1821g.m6293a(e);
            C1821g.m6291a(fileReader2);
            return stringBuffer;
        } catch (Throwable th2) {
            th = th2;
            fileReader2 = fileReader;
            C1821g.m6291a(fileReader2);
            throw th;
        }
        return stringBuffer;
    }

    /* renamed from: c */
    static void m6610c(boolean z3) {
        if (C1828g.m6630O() && !C1823b.m6376I()) {
            C1826e.m6553j();
            if (!C1822h.m6349e()) {
                C1822h.m6333a(z3);
            }
            if (C1823b.m6370C()) {
                m6612d(z3);
                m6602a(C1823b.m6409c(), z3);
                C1822h.m6341b(z3);
            }
        }
    }

    /* renamed from: a */
    private static int m6592a(StringBuffer stringBuffer, String str) throws NumberFormatException {
        int iIndexOf = stringBuffer.indexOf(str);
        if (iIndexOf < 0) {
            return 0;
        }
        int iIndexOf2 = stringBuffer.indexOf("=", iIndexOf + str.length());
        if (iIndexOf2 < 0) {
            C1815a.m6244b(str + " line not contain '='!");
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
            C1821g.m6293a(e4);
            return 0;
        }
    }

    /* renamed from: b */
    private static boolean m6607b(String str) {
        m6614e();
        synchronized (f8129d) {
            File file = new File(str);
            StringBuffer stringBufferM6594a = m6594a(file);
            if (C1821g.m6299a(stringBufferM6594a)) {
                return false;
            }
            int iIndexOf = stringBufferM6594a.indexOf("[");
            if (iIndexOf < 0) {
                C1815a.m6243a("crashsdk", "Can not found process name start!", null);
                return false;
            }
            int i4 = iIndexOf + 1;
            int iIndexOf2 = stringBufferM6594a.indexOf("]", i4);
            if (iIndexOf2 < 0) {
                C1815a.m6243a("crashsdk", "Can not found process name end!", null);
                return false;
            }
            String strSubstring = stringBufferM6594a.substring(i4, iIndexOf2);
            int i5 = 0;
            boolean z3 = false;
            while (true) {
                try {
                    SparseArray<String> sparseArray = f8129d;
                    if (i5 >= sparseArray.size()) {
                        break;
                    }
                    int iKeyAt = sparseArray.keyAt(i5);
                    String str2 = sparseArray.get(iKeyAt);
                    int iM6592a = m6592a(stringBufferM6594a, str2);
                    if (iM6592a > 0) {
                        C1822h.m6329a(strSubstring, iKeyAt, iM6592a);
                        Map<String, SparseIntArray> map = f8127b;
                        synchronized (map) {
                            SparseIntArray sparseIntArray = map.get(strSubstring);
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                map.put(strSubstring, sparseIntArray);
                            }
                            sparseIntArray.put(iKeyAt, sparseIntArray.get(iKeyAt, 0) + iM6592a);
                        }
                        m6597a(stringBufferM6594a, str2, 0);
                        z3 = true;
                    }
                    i5++;
                } finally {
                    if (z3) {
                        m6599a(file, stringBufferM6594a);
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    static void m6609c() {
        C1820f.m6280a(1, new RunnableC1819e(700), 3000L);
    }

    /* renamed from: a */
    private static void m6597a(StringBuffer stringBuffer, String str, int i4) {
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
    private static boolean m6599a(File file, StringBuffer stringBuffer) throws Throwable {
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
            C1821g.m6291a(fileWriter);
            return true;
        } catch (Exception e5) {
            e = e5;
            fileWriter2 = fileWriter;
            C1821g.m6293a(e);
            C1821g.m6291a(fileWriter2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            C1821g.m6291a(fileWriter2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static int m6593a(boolean z3) {
        int i4;
        Map<String, SparseIntArray> map = f8127b;
        synchronized (map) {
            try {
                if (z3) {
                    String strM6547h = C1826e.m6547h();
                    boolean zM6611c = m6611c(strM6547h);
                    map.remove(strM6547h);
                    i4 = zM6611c;
                } else {
                    Iterator<String> it = map.keySet().iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        if (m6611c(it.next())) {
                            i5++;
                        }
                    }
                    f8127b.clear();
                    i4 = i5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    /* renamed from: a */
    private static boolean m6601a(String str, RunnableC1819e runnableC1819e) {
        return C1823b.m6401a(f8128c, str, runnableC1819e);
    }

    /* renamed from: a */
    static boolean m6602a(String str, boolean z3) {
        if (C1822h.m6336a(z3, "crash detail report")) {
            return false;
        }
        return m6601a(str, new RunnableC1819e(752, new Object[]{str}));
    }

    /* renamed from: a */
    static int m6591a() {
        File[] fileArrM6615f = m6615f();
        if (fileArrM6615f == null) {
            return 0;
        }
        int i4 = 0;
        for (File file : fileArrM6615f) {
            if (m6602a(file.getAbsolutePath(), false)) {
                i4++;
            }
        }
        return i4;
    }

    /* renamed from: b */
    static int m6604b(boolean z3) {
        int size;
        Map<String, SparseIntArray> map = f8127b;
        synchronized (map) {
            try {
                if (z3) {
                    String strM6547h = C1826e.m6547h();
                    if (map.containsKey(strM6547h)) {
                        map.remove(strM6547h);
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
    static boolean m6600a(String str) {
        return m6601a(str, new RunnableC1819e(753, new Object[]{str}));
    }

    /* renamed from: a */
    public static boolean m6598a(int i4, Object[] objArr) {
        switch (i4) {
            case 751:
                if (f8126a || objArr != null) {
                    return m6606b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                }
                throw new AssertionError();
            case 752:
                if (f8126a || objArr != null) {
                    return m6607b((String) objArr[0]);
                }
                throw new AssertionError();
            case 753:
                if (!f8126a && objArr == null) {
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
    static int m6603b() {
        File[] fileArrM6615f = m6615f();
        if (fileArrM6615f == null) {
            return 0;
        }
        int i4 = 0;
        for (File file : fileArrM6615f) {
            if (m6600a(file.getAbsolutePath())) {
                i4++;
            }
        }
        return i4;
    }

    /* renamed from: b */
    public static void m6605b(int i4) {
        if (i4 != 700) {
            return;
        }
        m6612d(false);
    }
}

package com.p071uc.crashsdk;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.p071uc.crashsdk.p072a.C6738a;
import com.p071uc.crashsdk.p072a.C6743f;
import com.p071uc.crashsdk.p072a.C6744g;
import com.p071uc.crashsdk.p072a.C6745h;
import com.p071uc.crashsdk.p072a.RunnableC6742e;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.uc.crashsdk.f */
/* loaded from: classes4.dex */
public class C6750f {

    /* renamed from: a */
    static final /* synthetic */ boolean f6532a = true;

    /* renamed from: b */
    private static final Map<String, SparseIntArray> f6533b = new HashMap();

    /* renamed from: c */
    private static final Object f6534c = new Object();

    /* renamed from: d */
    private static final SparseArray<String> f6535d = new SparseArray<>();

    /* renamed from: e */
    private static final Object f6536e = new Object();

    /* renamed from: f */
    private static boolean f6537f = false;

    /* renamed from: a */
    public static void m5916a(int i9) {
        m5917a(i9, 1);
    }

    /* renamed from: b */
    private static boolean m5927b(int i9, int i10) {
        try {
            C6746b.m5751u();
        } catch (Throwable th) {
            C6744g.m5614a(th);
        }
        try {
            String strM5929c = m5929c(i9);
            if (strM5929c == null) {
                C6738a.m5564a("crashsdk", "Stat type not exists: " + i9, null);
                return false;
            }
            File file = new File(C6746b.m5730c());
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th2) {
                C6744g.m5614a(th2);
            }
            StringBuffer stringBufferM5915a = m5915a(file);
            if (C6744g.m5620a(stringBufferM5915a)) {
                if (stringBufferM5915a == null) {
                    stringBufferM5915a = new StringBuffer();
                }
                stringBufferM5915a.append("[");
                stringBufferM5915a.append(C6749e.m5868h());
                stringBufferM5915a.append("]\n");
            }
            m5918a(stringBufferM5915a, strM5929c, m5913a(stringBufferM5915a, strM5929c) + i10);
            return m5920a(file, stringBufferM5915a);
        } catch (Throwable th3) {
            C6744g.m5614a(th3);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m5932c(String str) {
        SparseIntArray sparseIntArray = f6533b.get(str);
        if (sparseIntArray == null) {
            return false;
        }
        for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
            int iKeyAt = sparseIntArray.keyAt(i9);
            C6748d.m5762a(str, iKeyAt, sparseIntArray.get(iKeyAt));
        }
        return true;
    }

    /* renamed from: d */
    private static char[] m5934d() {
        char[] cArr = null;
        int i9 = 1024;
        while (cArr == null && i9 > 0) {
            try {
                cArr = new char[i9];
            } catch (Throwable unused) {
                i9 /= 2;
                if (i9 < 512) {
                    break;
                }
            }
        }
        return cArr;
    }

    /* renamed from: e */
    private static void m5935e() {
        SparseArray<String> sparseArray = f6535d;
        synchronized (sparseArray) {
            try {
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    private static File[] m5936f() {
        File[] fileArrListFiles = new File(C6751g.m5957U()).listFiles();
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
    public static void m5917a(int i9, int i10) {
        if (i10 != 0) {
            m5922a(C6746b.m5730c(), new RunnableC6742e(751, new Object[]{Integer.valueOf(i9), Integer.valueOf(i10)}));
            return;
        }
        C6738a.m5565b("Add stat for type " + i9 + " with count 0!");
    }

    /* renamed from: d */
    public static void m5933d(boolean z9) {
        if (f6537f) {
            return;
        }
        synchronized (f6536e) {
            try {
                if (f6537f) {
                    return;
                }
                if (C6745h.m5657a(z9, "crash detail")) {
                    return;
                }
                if (C6746b.m5746p()) {
                    m5917a(2, 1);
                    if (C6746b.m5745o()) {
                        m5917a(42, 1);
                    }
                } else {
                    if (C6746b.m5747q()) {
                        m5917a(101, 1);
                        if (C6746b.m5745o()) {
                            m5917a(43, 1);
                        }
                    }
                    m5917a(100, 1);
                    f6537f = true;
                }
                m5917a(1, 1);
                m5917a(100, 1);
                f6537f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    private static String m5929c(int i9) {
        String str;
        m5935e();
        SparseArray<String> sparseArray = f6535d;
        synchronized (sparseArray) {
            str = sparseArray.get(i9);
        }
        return str;
    }

    /* renamed from: a */
    private static StringBuffer m5915a(File file) throws Throwable {
        FileReader fileReader;
        FileReader fileReader2 = null;
        if (!file.exists()) {
            return null;
        }
        char[] cArrM5934d = m5934d();
        if (cArrM5934d == null) {
            C6738a.m5564a("crashsdk", "readCrashStatData alloc buffer failed!", null);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                fileReader = new FileReader(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            int i9 = fileReader.read(cArrM5934d);
            if (i9 > 0) {
                stringBuffer.append(cArrM5934d, 0, i9);
            }
            C6744g.m5612a(fileReader);
            return stringBuffer;
        } catch (Exception e11) {
            e = e11;
            fileReader2 = fileReader;
            C6744g.m5614a(e);
            C6744g.m5612a(fileReader2);
            return stringBuffer;
        } catch (Throwable th2) {
            th = th2;
            fileReader2 = fileReader;
            C6744g.m5612a(fileReader2);
            throw th;
        }
    }

    /* renamed from: c */
    public static void m5931c(boolean z9) {
        if (C6751g.m5951O() && !C6746b.m5697I()) {
            C6749e.m5874j();
            if (!C6745h.m5670e()) {
                C6745h.m5654a(z9);
            }
            if (C6746b.m5691C()) {
                m5933d(z9);
                m5923a(C6746b.m5730c(), z9);
                C6745h.m5662b(z9);
            }
        }
    }

    /* renamed from: a */
    private static int m5913a(StringBuffer stringBuffer, String str) throws NumberFormatException {
        int iIndexOf = stringBuffer.indexOf(str);
        if (iIndexOf < 0) {
            return 0;
        }
        int iIndexOf2 = stringBuffer.indexOf("=", iIndexOf + str.length());
        if (iIndexOf2 < 0) {
            C6738a.m5565b(str + " line not contain '='!");
            return 0;
        }
        int i9 = iIndexOf2 + 1;
        int iIndexOf3 = stringBuffer.indexOf(AbsSection.SEP_ORIGIN_LINE_BREAK, i9);
        if (iIndexOf3 < 0) {
            iIndexOf3 = stringBuffer.length();
        }
        try {
            int i10 = Integer.parseInt(stringBuffer.substring(i9, iIndexOf3));
            if (i10 < 0) {
                return 0;
            }
            return i10;
        } catch (NumberFormatException e10) {
            C6744g.m5614a(e10);
            return 0;
        }
    }

    /* renamed from: b */
    private static boolean m5928b(String str) {
        m5935e();
        synchronized (f6535d) {
            try {
                File file = new File(str);
                StringBuffer stringBufferM5915a = m5915a(file);
                if (C6744g.m5620a(stringBufferM5915a)) {
                    return false;
                }
                int iIndexOf = stringBufferM5915a.indexOf("[");
                if (iIndexOf < 0) {
                    C6738a.m5564a("crashsdk", "Can not found process name start!", null);
                    return false;
                }
                int i9 = iIndexOf + 1;
                int iIndexOf2 = stringBufferM5915a.indexOf("]", i9);
                if (iIndexOf2 < 0) {
                    C6738a.m5564a("crashsdk", "Can not found process name end!", null);
                    return false;
                }
                String strSubstring = stringBufferM5915a.substring(i9, iIndexOf2);
                int i10 = 0;
                boolean z9 = false;
                while (true) {
                    try {
                        SparseArray<String> sparseArray = f6535d;
                        if (i10 >= sparseArray.size()) {
                            break;
                        }
                        int iKeyAt = sparseArray.keyAt(i10);
                        String str2 = sparseArray.get(iKeyAt);
                        int iM5913a = m5913a(stringBufferM5915a, str2);
                        if (iM5913a > 0) {
                            C6745h.m5650a(strSubstring, iKeyAt, iM5913a);
                            Map<String, SparseIntArray> map = f6533b;
                            synchronized (map) {
                                try {
                                    SparseIntArray sparseIntArray = map.get(strSubstring);
                                    if (sparseIntArray == null) {
                                        sparseIntArray = new SparseIntArray();
                                        map.put(strSubstring, sparseIntArray);
                                    }
                                    sparseIntArray.put(iKeyAt, sparseIntArray.get(iKeyAt, 0) + iM5913a);
                                } finally {
                                }
                            }
                            m5918a(stringBufferM5915a, str2, 0);
                            z9 = true;
                        }
                        i10++;
                    } finally {
                        if (z9) {
                            m5920a(file, stringBufferM5915a);
                        }
                    }
                }
                return true;
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static void m5930c() {
        C6743f.m5601a(1, new RunnableC6742e(TypedValues.TransitionType.TYPE_DURATION), 3000L);
    }

    /* renamed from: a */
    private static void m5918a(StringBuffer stringBuffer, String str, int i9) {
        int iIndexOf = stringBuffer.indexOf(str);
        if (iIndexOf < 0) {
            if (i9 > 0) {
                stringBuffer.append(str);
                stringBuffer.append("=");
                stringBuffer.append(i9);
                stringBuffer.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                return;
            }
            return;
        }
        int iIndexOf2 = stringBuffer.indexOf(AbsSection.SEP_ORIGIN_LINE_BREAK, iIndexOf);
        if (iIndexOf2 < 0) {
            iIndexOf2 = stringBuffer.length();
        }
        stringBuffer.replace(iIndexOf, iIndexOf2, str + "=" + String.valueOf(i9));
    }

    /* renamed from: a */
    private static boolean m5920a(File file, StringBuffer stringBuffer) throws Throwable {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String string = stringBuffer.toString();
            fileWriter.write(string, 0, string.length());
            C6744g.m5612a(fileWriter);
            return true;
        } catch (Exception e11) {
            e = e11;
            fileWriter2 = fileWriter;
            C6744g.m5614a(e);
            C6744g.m5612a(fileWriter2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            C6744g.m5612a(fileWriter2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static int m5914a(boolean z9) {
        int i9;
        Map<String, SparseIntArray> map = f6533b;
        synchronized (map) {
            try {
                if (z9) {
                    String strM5868h = C6749e.m5868h();
                    boolean zM5932c = m5932c(strM5868h);
                    map.remove(strM5868h);
                    i9 = zM5932c;
                } else {
                    Iterator<String> it = map.keySet().iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        if (m5932c(it.next())) {
                            i10++;
                        }
                    }
                    f6533b.clear();
                    i9 = i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i9;
    }

    /* renamed from: a */
    private static boolean m5922a(String str, RunnableC6742e runnableC6742e) {
        return C6746b.m5722a(f6534c, str, runnableC6742e);
    }

    /* renamed from: a */
    public static boolean m5923a(String str, boolean z9) {
        if (C6745h.m5657a(z9, "crash detail report")) {
            return false;
        }
        return m5922a(str, new RunnableC6742e(752, new Object[]{str}));
    }

    /* renamed from: b */
    public static int m5925b(boolean z9) {
        int size;
        Map<String, SparseIntArray> map = f6533b;
        synchronized (map) {
            try {
                if (z9) {
                    String strM5868h = C6749e.m5868h();
                    if (map.containsKey(strM5868h)) {
                        map.remove(strM5868h);
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
    public static int m5912a() {
        File[] fileArrM5936f = m5936f();
        if (fileArrM5936f == null) {
            return 0;
        }
        int i9 = 0;
        for (File file : fileArrM5936f) {
            if (m5923a(file.getAbsolutePath(), false)) {
                i9++;
            }
        }
        return i9;
    }

    /* renamed from: a */
    public static boolean m5921a(String str) {
        return m5922a(str, new RunnableC6742e(753, new Object[]{str}));
    }

    /* renamed from: a */
    public static boolean m5919a(int i9, Object[] objArr) {
        switch (i9) {
            case 751:
                if (f6532a || objArr != null) {
                    return m5927b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                }
                throw new AssertionError();
            case 752:
                if (f6532a || objArr != null) {
                    return m5928b((String) objArr[0]);
                }
                throw new AssertionError();
            case 753:
                if (!f6532a && objArr == null) {
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
    public static int m5924b() {
        File[] fileArrM5936f = m5936f();
        if (fileArrM5936f == null) {
            return 0;
        }
        int i9 = 0;
        for (File file : fileArrM5936f) {
            if (m5921a(file.getAbsolutePath())) {
                i9++;
            }
        }
        return i9;
    }

    /* renamed from: b */
    public static void m5926b(int i9) {
        if (i9 != 700) {
            return;
        }
        m5933d(false);
    }
}

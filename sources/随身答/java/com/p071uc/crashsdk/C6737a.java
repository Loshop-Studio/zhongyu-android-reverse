package com.p071uc.crashsdk;

import android.content.pm.PackageInfo;
import android.util.Log;
import android.util.SparseArray;
import androidx.compose.runtime.ComposerKt;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.p071uc.crashsdk.export.LogType;
import com.p071uc.crashsdk.p072a.C6738a;
import com.p071uc.crashsdk.p072a.C6739b;
import com.p071uc.crashsdk.p072a.C6743f;
import com.p071uc.crashsdk.p072a.C6744g;
import com.p071uc.crashsdk.p072a.RunnableC6742e;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.uc.crashsdk.a */
/* loaded from: classes4.dex */
public class C6737a {

    /* renamed from: a */
    public static String f6307a = "";

    /* renamed from: b */
    public static String f6308b = "";

    /* renamed from: d */
    static final /* synthetic */ boolean f6310d = true;

    /* renamed from: e */
    private static final Map<String, String> f6311e = new HashMap();

    /* renamed from: f */
    private static final List<String> f6312f = new ArrayList();

    /* renamed from: g */
    private static String f6313g = "";

    /* renamed from: h */
    private static String f6314h = null;

    /* renamed from: i */
    private static int f6315i = -1;

    /* renamed from: j */
    private static long f6316j = 0;

    /* renamed from: k */
    private static final HashMap<String, Object[]> f6317k = new HashMap<>();

    /* renamed from: l */
    private static final List<String> f6318l = new ArrayList();

    /* renamed from: m */
    private static int f6319m = 0;

    /* renamed from: n */
    private static int f6320n = 0;

    /* renamed from: o */
    private static int f6321o = 0;

    /* renamed from: p */
    private static int f6322p = 0;

    /* renamed from: q */
    private static final HashMap<String, Object[]> f6323q = new HashMap<>();

    /* renamed from: r */
    private static final List<String> f6324r = new ArrayList();

    /* renamed from: s */
    private static int f6325s = 0;

    /* renamed from: t */
    private static int f6326t = 0;

    /* renamed from: u */
    private static int f6327u = 0;

    /* renamed from: v */
    private static int f6328v = 0;

    /* renamed from: w */
    private static int f6329w = 0;

    /* renamed from: x */
    private static int f6330x = 0;

    /* renamed from: y */
    private static final SparseArray<Object[]> f6331y = new SparseArray<>();

    /* renamed from: z */
    private static final List<Integer> f6332z = new ArrayList();

    /* renamed from: A */
    private static final HashMap<String, Object[]> f6298A = new HashMap<>();

    /* renamed from: B */
    private static final List<String> f6299B = new ArrayList();

    /* renamed from: C */
    private static int f6300C = 0;

    /* renamed from: D */
    private static int f6301D = 0;

    /* renamed from: E */
    private static int f6302E = 0;

    /* renamed from: c */
    static boolean f6309c = false;

    /* renamed from: F */
    private static Runnable f6303F = new RunnableC6742e(201);

    /* renamed from: G */
    private static boolean f6304G = false;

    /* renamed from: H */
    private static boolean f6305H = false;

    /* renamed from: I */
    private static boolean f6306I = false;

    /* renamed from: a */
    public static String m5530a() {
        String str = f6314h;
        return str != null ? str : m5560o() ? f6314h : "";
    }

    /* renamed from: b */
    public static long m5543b() {
        return f6316j;
    }

    /* renamed from: c */
    public static int m5547c() {
        if (f6315i == -1) {
            m5560o();
        }
        return f6315i;
    }

    /* renamed from: d */
    public static void m5549d() {
        StringBuilder sb = new StringBuilder();
        synchronized (f6311e) {
            try {
                for (String str : f6312f) {
                    String str2 = f6311e.get(str);
                    sb.append(str);
                    sb.append(": ");
                    if (str2 != null) {
                        sb.append(str2);
                    }
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sb.append(String.format(Locale.US, "(saved at %s)\n", C6749e.m5879m()));
        C6739b.m5571a(C6746b.m5735e(), sb.toString());
    }

    /* renamed from: e */
    public static void m5550e() {
        if (!f6310d && !C6746b.f6426d) {
            throw new AssertionError();
        }
        synchronized (f6311e) {
            try {
                for (String str : f6312f) {
                    JNIBridge.nativeAddHeaderInfo(str, f6311e.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public static byte[] m5551f() {
        return new byte[]{24, 99, 121, 60};
    }

    /* renamed from: g */
    public static void m5552g() {
        if (!f6310d && !C6746b.f6426d) {
            throw new AssertionError();
        }
        synchronized (f6317k) {
            try {
                for (String str : f6318l) {
                    Object[] objArr = f6317k.get(str);
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    if ((1048833 & iIntValue) != 0) {
                        JNIBridge.nativeAddDumpFile(str, (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), iIntValue, ((Boolean) objArr[4]).booleanValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public static String m5553h() {
        StringBuilder sb = new StringBuilder();
        synchronized (f6317k) {
            try {
                boolean z9 = true;
                for (String str : f6318l) {
                    if (LogType.isForJava(((Integer) f6317k.get(str)[0]).intValue())) {
                        if (!z9) {
                            sb.append("`");
                        }
                        sb.append(str);
                        z9 = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    public static void m5554i() {
        if (!f6310d && !C6746b.f6426d) {
            throw new AssertionError();
        }
        synchronized (f6323q) {
            try {
                for (String str : f6324r) {
                    Object[] objArr = f6323q.get(str);
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    if ((1048833 & iIntValue) != 0) {
                        JNIBridge.nativeAddCallbackInfo(str, iIntValue, ((Long) objArr[2]).longValue(), ((Integer) objArr[3]).intValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public static String m5555j() {
        String string;
        synchronized (f6323q) {
            StringBuilder sb = new StringBuilder();
            List<String> list = f6324r;
            synchronized (list) {
                try {
                    boolean z9 = true;
                    for (String str : list) {
                        if (LogType.isForJava(((Integer) f6323q.get(str)[0]).intValue())) {
                            if (!z9) {
                                sb.append("`");
                            }
                            sb.append(str);
                            z9 = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            string = sb.toString();
        }
        return string;
    }

    /* renamed from: k */
    public static void m5556k() {
        if (!f6310d && !C6746b.f6426d) {
            throw new AssertionError();
        }
        synchronized (f6298A) {
            try {
                for (String str : f6299B) {
                    Object[] objArr = f6298A.get(str);
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    int iIntValue2 = ((Integer) objArr[1]).intValue();
                    List list = (List) objArr[2];
                    if ((1048577 & iIntValue2) != 0 && JNIBridge.nativeCreateCachedInfo(str, iIntValue, iIntValue2) != 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext() && JNIBridge.nativeAddCachedInfo(str, (String) it.next())) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public static String m5557l() {
        StringBuilder sb = new StringBuilder();
        synchronized (f6298A) {
            try {
                boolean z9 = true;
                for (String str : f6299B) {
                    if (LogType.isForJava(((Integer) f6298A.get(str)[1]).intValue())) {
                        if (!z9) {
                            sb.append("`");
                        }
                        sb.append(str);
                        z9 = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    /* renamed from: m */
    public static String m5558m() throws Throwable {
        if (!f6304G) {
            String strM5569a = C6739b.m5569a(C6746b.m5740j());
            f6313g = strM5569a;
            f6304G = true;
            if (strM5569a == null) {
                f6313g = "";
            }
        }
        return f6313g;
    }

    /* renamed from: n */
    public static void m5559n() {
        m5561p();
        if (!f6305H) {
            f6305H = true;
            C6743f.m5600a(0, new RunnableC6742e(ComposerKt.compositionLocalMapKey));
        } else if (C6746b.f6426d) {
            JNIBridge.set(128, f6313g);
        }
    }

    /* renamed from: o */
    private static boolean m5560o() {
        try {
            PackageInfo packageInfo = C6744g.m5605a().getPackageManager().getPackageInfo(f6307a, 0);
            f6314h = packageInfo.versionName;
            f6316j = packageInfo.lastUpdateTime;
            f6315i = packageInfo.versionCode;
            return true;
        } catch (Throwable th) {
            C6744g.m5623b(th);
            return false;
        }
    }

    /* renamed from: p */
    private static void m5561p() {
        if (!f6306I && C6749e.m5818a()) {
            if (C6746b.f6426d || !C6746b.f6429g) {
                String str = String.format(Locale.US, "%s/%s/%s", C6751g.m5954R(), C6751g.m5955S(), C6751g.m5956T());
                C6738a.m5566b("crashsdk", "UUID: " + C6749e.m5885p());
                C6738a.m5566b("crashsdk", "Version: " + str);
                C6738a.m5566b("crashsdk", "Process Name: " + C6749e.m5868h());
                f6306I = true;
            }
        }
    }

    /* renamed from: b */
    private static StringBuilder m5545b(String str, boolean z9) {
        String strM5760a;
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr = f6323q.get(str);
            try {
                if (objArr == null) {
                    strM5760a = "Unknown callback: " + str;
                } else {
                    Callable callable = (Callable) objArr[1];
                    strM5760a = callable != null ? (String) callable.call() : C6748d.m5760a(str, z9);
                }
                if (strM5760a != null) {
                    sb.append(strM5760a);
                }
            } catch (Throwable th) {
                sb.append("[DEBUG] Callback occurred new exception:\n");
                sb.append(Log.getStackTraceString(th));
            }
        } catch (Throwable th2) {
            C6744g.m5614a(th2);
        }
        try {
            if (sb.length() == 0) {
                sb.append("(data is null)\n");
            }
        } catch (Throwable th3) {
            C6744g.m5614a(th3);
        }
        return sb;
    }

    /* renamed from: c */
    public static ArrayList<String> m5548c(String str) {
        if (C6744g.m5619a(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";", 20);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : strArrSplit) {
            if (!C6744g.m5619a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m5538a(String str, String str2) {
        Map<String, String> map = f6311e;
        synchronized (map) {
            try {
                if (!map.containsKey(str)) {
                    f6312f.add(str);
                }
                map.put(str, str2);
                if (C6746b.f6426d) {
                    JNIBridge.nativeAddHeaderInfo(str, str2);
                }
                C6749e.m5896x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m5534a(OutputStream outputStream, String str) {
        synchronized (f6311e) {
            try {
                for (String str2 : f6312f) {
                    try {
                        StringBuilder sb = new StringBuilder(11);
                        sb.append(str2);
                        sb.append(": ");
                        String str3 = f6311e.get(str2);
                        if (str3 != null) {
                            sb.append(str3);
                        }
                        sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                        outputStream.write(sb.toString().getBytes(str));
                    } catch (Throwable th) {
                        C6749e.m5815a(th, outputStream);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static int m5542b(String str, String str2) {
        int iAddType;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str2.length() > 2048) {
            str2 = str2.substring(0, 2048);
        }
        HashMap<String, Object[]> map = f6298A;
        synchronized (map) {
            try {
                Object[] objArr = map.get(str);
                if (objArr != null) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    int iIntValue2 = ((Integer) objArr[1]).intValue();
                    List list = (List) objArr[2];
                    if (list.size() >= iIntValue) {
                        list.remove(0);
                    }
                    list.add(str2);
                    iAddType = LogType.isForJava(iIntValue2) ? LogType.addType(0, 16) : 0;
                    if (!C6746b.f6426d) {
                        if (LogType.isForNative(iIntValue2)) {
                            iAddType = LogType.addType(iAddType, 1);
                        }
                        if (LogType.isForANR(iIntValue2)) {
                            iAddType = LogType.addType(iAddType, 1048576);
                        }
                    }
                    iAddType = iAddType;
                    iAddType = iIntValue2;
                } else {
                    iAddType = 0;
                }
                if (C6746b.f6426d && JNIBridge.nativeAddCachedInfo(str, str2)) {
                    if (LogType.isForNative(iAddType)) {
                        iAddType = LogType.addType(iAddType, 1);
                    }
                    if (LogType.isForANR(iAddType)) {
                        iAddType = LogType.addType(iAddType, 1048576);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iAddType;
    }

    /* renamed from: a */
    public static int m5529a(String str, String str2, boolean z9, boolean z10, int i9, boolean z11) {
        int iRemoveType;
        int iIntValue = 0;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str.length() > 256) {
            C6738a.m5564a("crashsdk", "addDumpFile: description is too long!", null);
            return 0;
        }
        HashMap<String, Object[]> map = f6317k;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    iIntValue = ((Integer) map.get(str)[0]).intValue();
                    iRemoveType = LogType.addType(iIntValue, i9);
                } else {
                    iRemoveType = i9;
                }
                if (LogType.isForJava(iRemoveType) && !LogType.isForJava(iIntValue)) {
                    int i10 = f6319m;
                    if (i10 >= 10) {
                        iRemoveType = LogType.removeType(iRemoveType, 16);
                    } else {
                        f6319m = i10 + 1;
                    }
                }
                if (LogType.isForNative(iRemoveType) && !LogType.isForNative(iIntValue)) {
                    int i11 = f6320n;
                    if (i11 >= 10) {
                        iRemoveType = LogType.removeType(iRemoveType, 1);
                    } else {
                        f6320n = i11 + 1;
                    }
                }
                if (LogType.isForUnexp(iRemoveType) && !LogType.isForUnexp(iIntValue)) {
                    int i12 = f6321o;
                    if (i12 >= 10) {
                        iRemoveType = LogType.removeType(iRemoveType, 256);
                    } else {
                        f6321o = i12 + 1;
                    }
                }
                if (LogType.isForANR(iRemoveType) && !LogType.isForANR(iIntValue)) {
                    int i13 = f6322p;
                    if (i13 >= 10) {
                        iRemoveType = LogType.removeType(iRemoveType, 1048576);
                    } else {
                        f6322p = i13 + 1;
                    }
                }
                if ((1048849 & iRemoveType) == 0) {
                    return iRemoveType;
                }
                if (iIntValue == 0) {
                    f6318l.add(str);
                }
                if (C6746b.f6426d && (1048833 & i9) != 0) {
                    int iNativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z9, z10, i9, z11);
                    if (!LogType.isForNative(iNativeAddDumpFile)) {
                        iRemoveType = LogType.removeType(iRemoveType, 1);
                    }
                    if (!LogType.isForUnexp(iNativeAddDumpFile)) {
                        iRemoveType = LogType.removeType(iRemoveType, 256);
                    }
                    if (!LogType.isForANR(iNativeAddDumpFile)) {
                        iRemoveType = LogType.removeType(iRemoveType, 1048576);
                    }
                }
                map.put(str, new Object[]{Integer.valueOf(iRemoveType), str2, Boolean.valueOf(z9), Boolean.valueOf(z10), Boolean.valueOf(z11)});
                return iRemoveType;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5546b(java.io.OutputStream r8, java.lang.String r9, java.lang.String r10, java.util.ArrayList<java.lang.String> r11) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.p071uc.crashsdk.C6737a.f6298A
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.p071uc.crashsdk.C6737a.f6299B     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3c
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            if (r2 == 0) goto La2
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3c
            java.util.HashMap<java.lang.String, java.lang.Object[]> r4 = com.p071uc.crashsdk.C6737a.f6298A     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: java.lang.Throwable -> L3c
            r3 = r4[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L3c
            r3.intValue()     // Catch: java.lang.Throwable -> L3c
            r5 = 1
            r5 = r4[r5]     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L3c
            r6 = 2
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L3c
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L3c
            if (r11 != 0) goto L3f
            boolean r5 = com.p071uc.crashsdk.export.LogType.isForJava(r5)     // Catch: java.lang.Throwable -> L3c
            if (r5 != 0) goto L45
            goto L9
        L3c:
            r8 = move-exception
            goto Lc8
        L3f:
            boolean r5 = m5540a(r11, r2)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L9
        L45:
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = "%s (%d/%d)\n"
            int r7 = r4.size()     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L61
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r7, r3}     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = java.lang.String.format(r5, r6, r2)     // Catch: java.lang.Throwable -> L61
            byte[] r2 = r2.getBytes(r9)     // Catch: java.lang.Throwable -> L61
            r8.write(r2)     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            r2 = move-exception
            com.p071uc.crashsdk.C6749e.m5815a(r2, r8)     // Catch: java.lang.Throwable -> L3c
        L65:
            java.util.Iterator r2 = r4.iterator()     // Catch: java.lang.Throwable -> L86
        L69:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L86
            byte[] r3 = r3.getBytes(r9)     // Catch: java.lang.Throwable -> L86
            r8.write(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "\n"
            byte[] r3 = r3.getBytes(r9)     // Catch: java.lang.Throwable -> L86
            r8.write(r3)     // Catch: java.lang.Throwable -> L86
            goto L69
        L86:
            r2 = move-exception
            com.p071uc.crashsdk.C6749e.m5815a(r2, r8)     // Catch: java.lang.Throwable -> L3c
        L8a:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r9)     // Catch: java.lang.Throwable -> L9c
            r8.write(r2)     // Catch: java.lang.Throwable -> L9c
            byte[] r2 = r10.getBytes(r9)     // Catch: java.lang.Throwable -> L9c
            r8.write(r2)     // Catch: java.lang.Throwable -> L9c
            goto L9
        L9c:
            r2 = move-exception
            com.p071uc.crashsdk.C6749e.m5815a(r2, r8)     // Catch: java.lang.Throwable -> L3c
            goto L9
        La2:
            if (r11 == 0) goto Lc6
            boolean r9 = com.p071uc.crashsdk.C6749e.m5773E()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto Lc6
            int r9 = r11.size()     // Catch: java.lang.Throwable -> L3c
        Lae:
            if (r3 >= r9) goto Lc6
            java.lang.Object r10 = r11.get(r3)     // Catch: java.lang.Throwable -> L3c
            int r3 = r3 + 1
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L3c
            java.util.List<java.lang.String> r1 = com.p071uc.crashsdk.C6737a.f6299B     // Catch: java.lang.Throwable -> L3c
            boolean r1 = m5540a(r1, r10)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto Lae
            java.lang.String r1 = "CUSTOMCACHEDINFO"
            com.p071uc.crashsdk.C6749e.m5810a(r8, r1, r10)     // Catch: java.lang.Throwable -> L3c
            goto Lae
        Lc6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return
        Lc8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6737a.m5546b(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #3 {all -> 0x003e, blocks: (B:12:0x0025, B:14:0x002f, B:22:0x004a, B:24:0x0055, B:19:0x0043), top: B:77:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:36:0x0080, B:38:0x009c, B:40:0x00a4, B:46:0x00b2, B:47:0x00b6, B:48:0x00b8), top: B:75:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #2 {all -> 0x00ac, blocks: (B:36:0x0080, B:38:0x009c, B:40:0x00a4, B:46:0x00b2, B:47:0x00b6, B:48:0x00b8), top: B:75:0x0080 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5537a(java.io.OutputStream r16, java.lang.String r17, java.util.ArrayList<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6737a.m5537a(java.io.OutputStream, java.lang.String, java.util.ArrayList):void");
    }

    /* renamed from: b */
    public static String m5544b(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, Object[]> map = f6298A;
        synchronized (map) {
            try {
                Object[] objArr = map.get(str);
                Integer num = (Integer) objArr[0];
                num.intValue();
                List list = (List) objArr[2];
                sb.append(String.format(Locale.US, "%s (%d/%d)\n", str, Integer.valueOf(list.size()), num));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m5531a(String str) {
        HashMap<String, Object[]> map = f6317k;
        synchronized (map) {
            try {
                Object[] objArr = map.get(str);
                if (objArr == null) {
                    return null;
                }
                return String.format(Locale.US, "%s%s%d%d", (String) objArr[1], "`", Integer.valueOf(((Boolean) objArr[2]).booleanValue() ? 1 : 0), Integer.valueOf(((Boolean) objArr[3]).booleanValue() ? 1 : 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static boolean m5540a(List<String> list, String str) {
        if (C6744g.m5619a(str)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0099 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:7:0x000d, B:9:0x0013, B:11:0x0027, B:16:0x002e, B:18:0x0038, B:20:0x003e, B:31:0x0058, B:25:0x0049, B:28:0x004e, B:32:0x005f, B:29:0x0052, B:33:0x0062, B:35:0x0068, B:37:0x006e, B:51:0x0099, B:53:0x00a0, B:55:0x00a8, B:57:0x00ae, B:59:0x00b2, B:61:0x00b8, B:62:0x00bc, B:64:0x00c4, B:66:0x00ca, B:68:0x00ce, B:69:0x00d3, B:70:0x00d7, B:72:0x00dd, B:75:0x00e1, B:76:0x00e6, B:78:0x00ea, B:80:0x00f0, B:82:0x00fc, B:84:0x0102, B:86:0x0109, B:87:0x010e, B:89:0x0114, B:91:0x011a, B:92:0x011f, B:94:0x0125, B:96:0x012b, B:98:0x0133, B:99:0x0148, B:42:0x007b, B:45:0x0080, B:46:0x008a, B:49:0x0091), top: B:103:0x000d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5528a(java.lang.String r16, int r17, java.util.concurrent.Callable<java.lang.String> r18, long r19, int r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6737a.m5528a(java.lang.String, int, java.util.concurrent.Callable, long, int):int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:7|(2:51|8)|(3:59|10|(4:56|12|64|60)(4:55|18|(1:20)(1:21)|(1:26)(1:25)))(3:54|15|(4:57|17|61|60)(5:58|18|(0)(0)|(2:23|26)(0)|60))|47|29|62|60) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        com.p071uc.crashsdk.C6749e.m5815a(r2, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:8:0x0016, B:10:0x0028, B:18:0x0038, B:20:0x005f, B:23:0x0077, B:25:0x007d, B:26:0x0085, B:21:0x006d, B:15:0x0031), top: B:51:0x0016, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:8:0x0016, B:10:0x0028, B:18:0x0038, B:20:0x005f, B:23:0x0077, B:25:0x007d, B:26:0x0085, B:21:0x006d, B:15:0x0031), top: B:51:0x0016, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:8:0x0016, B:10:0x0028, B:18:0x0038, B:20:0x005f, B:23:0x0077, B:25:0x007d, B:26:0x0085, B:21:0x006d, B:15:0x0031), top: B:51:0x0016, outer: #1 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5536a(java.io.OutputStream r9, java.lang.String r10, java.lang.String r11, java.util.ArrayList<java.lang.String> r12) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.p071uc.crashsdk.C6737a.f6323q
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.p071uc.crashsdk.C6737a.f6324r     // Catch: java.lang.Throwable -> Laa
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Laa
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Laa
            r3 = 0
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Laa
            java.util.HashMap<java.lang.String, java.lang.Object[]> r4 = com.p071uc.crashsdk.C6737a.f6323q     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch: java.lang.Throwable -> L2f
            r5 = r4[r3]     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L2f
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L2f
            if (r12 != 0) goto L31
            boolean r5 = com.p071uc.crashsdk.export.LogType.isForJava(r5)     // Catch: java.lang.Throwable -> L2f
            if (r5 != 0) goto L38
            goto L9
        L2f:
            r2 = move-exception
            goto L8f
        L31:
            boolean r5 = m5540a(r12, r2)     // Catch: java.lang.Throwable -> L2f
            if (r5 != 0) goto L38
            goto L9
        L38:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r5.<init>()     // Catch: java.lang.Throwable -> L2f
            r5.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2f
            byte[] r5 = r5.getBytes(r10)     // Catch: java.lang.Throwable -> L2f
            r9.write(r5)     // Catch: java.lang.Throwable -> L2f
            r5 = 2
            r5 = r4[r5]     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L2f
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L2f
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L6d
            r7 = 3
            r4 = r4[r7]     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = com.p071uc.crashsdk.JNIBridge.nativeGetCallbackInfo(r2, r5, r4, r3)     // Catch: java.lang.Throwable -> L2f
            goto L75
        L6d:
            java.lang.StringBuilder r2 = m5545b(r2, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2f
        L75:
            if (r2 == 0) goto L85
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L2f
            if (r3 <= 0) goto L85
            byte[] r2 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> L2f
            r9.write(r2)     // Catch: java.lang.Throwable -> L2f
            goto L92
        L85:
            java.lang.String r2 = "(data is null)\n"
            byte[] r2 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> L2f
            r9.write(r2)     // Catch: java.lang.Throwable -> L2f
            goto L92
        L8f:
            com.p071uc.crashsdk.C6749e.m5815a(r2, r9)     // Catch: java.lang.Throwable -> Laa
        L92:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> La4
            r9.write(r2)     // Catch: java.lang.Throwable -> La4
            byte[] r2 = r11.getBytes(r10)     // Catch: java.lang.Throwable -> La4
            r9.write(r2)     // Catch: java.lang.Throwable -> La4
            goto L9
        La4:
            r2 = move-exception
            com.p071uc.crashsdk.C6749e.m5815a(r2, r9)     // Catch: java.lang.Throwable -> Laa
            goto L9
        Laa:
            r9 = move-exception
            goto Ld2
        Lac:
            if (r12 == 0) goto Ld0
            boolean r10 = com.p071uc.crashsdk.C6749e.m5773E()     // Catch: java.lang.Throwable -> Laa
            if (r10 == 0) goto Ld0
            int r10 = r12.size()     // Catch: java.lang.Throwable -> Laa
        Lb8:
            if (r3 >= r10) goto Ld0
            java.lang.Object r11 = r12.get(r3)     // Catch: java.lang.Throwable -> Laa
            int r3 = r3 + 1
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Laa
            java.util.List<java.lang.String> r1 = com.p071uc.crashsdk.C6737a.f6324r     // Catch: java.lang.Throwable -> Laa
            boolean r1 = m5540a(r1, r11)     // Catch: java.lang.Throwable -> Laa
            if (r1 != 0) goto Lb8
            java.lang.String r1 = "CUSTOMCALLBACKINFO"
            com.p071uc.crashsdk.C6749e.m5810a(r9, r1, r11)     // Catch: java.lang.Throwable -> Laa
            goto Lb8
        Ld0:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            return
        Ld2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6737a.m5536a(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* renamed from: a */
    public static String m5532a(String str, boolean z9) {
        String string;
        HashMap<String, Object[]> map = f6323q;
        synchronized (map) {
            try {
                Object[] objArr = map.get(str);
                long jLongValue = ((Long) objArr[2]).longValue();
                if (jLongValue != 0) {
                    string = JNIBridge.nativeGetCallbackInfo(str, jLongValue, ((Integer) objArr[3]).intValue(), z9);
                } else {
                    string = m5545b(str, z9).toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    /* renamed from: a */
    private static boolean m5539a(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        SparseArray<Object[]> sparseArray = f6331y;
        synchronized (sparseArray) {
            try {
                int id = (int) thread.getId();
                if (sparseArray.get(id) == null) {
                    f6332z.add(Integer.valueOf(id));
                }
                sparseArray.put(id, new Object[]{new WeakReference(thread), str});
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:36:0x00b1, B:38:0x00b8, B:41:0x00c4, B:43:0x00c8, B:45:0x00cc, B:46:0x00d5), top: B:61:0x00b1, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:36:0x00b1, B:38:0x00b8, B:41:0x00c4, B:43:0x00c8, B:45:0x00cc, B:46:0x00d5), top: B:61:0x00b1, outer: #6 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5535a(java.io.OutputStream r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p071uc.crashsdk.C6737a.m5535a(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static int m5527a(String str, int i9, int i10) {
        int iRemoveType;
        int iIntValue = 0;
        if (str == null || i9 <= 0) {
            return 0;
        }
        if (i9 > 1500) {
            C6738a.m5564a("crashsdk", "createCachedInfo: capacity is too large!", null);
            return 0;
        }
        HashMap<String, Object[]> map = f6298A;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    iIntValue = ((Integer) map.get(str)[1]).intValue();
                    iRemoveType = LogType.addType(iIntValue, i10);
                } else {
                    iRemoveType = i10;
                }
                if (LogType.isForJava(iRemoveType) && !LogType.isForJava(iIntValue)) {
                    int i11 = f6300C;
                    if (i11 >= 8) {
                        iRemoveType = LogType.removeType(iRemoveType, 16);
                    } else {
                        f6300C = i11 + 1;
                    }
                }
                if (LogType.isForNative(iRemoveType) && !LogType.isForNative(iIntValue)) {
                    int i12 = f6301D;
                    if (i12 >= 8) {
                        iRemoveType = LogType.removeType(iRemoveType, 1);
                    } else {
                        f6301D = i12 + 1;
                    }
                }
                if (LogType.isForANR(iRemoveType) && !LogType.isForANR(iIntValue)) {
                    int i13 = f6302E;
                    if (i13 >= 8) {
                        iRemoveType = LogType.removeType(iRemoveType, 1048576);
                    } else {
                        f6302E = i13 + 1;
                    }
                }
                if ((1048849 & iRemoveType) == 0) {
                    return iRemoveType;
                }
                if (iIntValue == 0) {
                    f6299B.add(str);
                }
                if (C6746b.f6426d && (i10 & 1048577) != 0) {
                    int iNativeCreateCachedInfo = JNIBridge.nativeCreateCachedInfo(str, i9, iRemoveType);
                    if (!LogType.isForNative(iNativeCreateCachedInfo)) {
                        iRemoveType = LogType.removeType(iRemoveType, 1);
                    }
                    if (!LogType.isForANR(iNativeCreateCachedInfo)) {
                        iRemoveType = LogType.removeType(iRemoveType, 1048576);
                    }
                }
                map.put(str, new Object[]{Integer.valueOf(i9), Integer.valueOf(iRemoveType), new ArrayList()});
                return iRemoveType;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* renamed from: a */
    public static int m5526a(int i9, String str) {
        ?? r02;
        if (C6744g.m5619a(str)) {
            str = Thread.currentThread().getName();
        }
        if (!LogType.isForNative(i9) && !LogType.isForANR(i9)) {
            r02 = 0;
        } else if (C6746b.f6426d) {
            synchronized (f6331y) {
                JNIBridge.nativeCmd(4, i9, str, null);
            }
            boolean zIsForNative = LogType.isForNative(i9);
            r02 = zIsForNative;
            if (LogType.isForANR(i9)) {
                r02 = (zIsForNative ? 1 : 0) | 1048576;
            }
        } else {
            C6738a.m5564a("crashsdk", "crashsdk so has not loaded!", null);
            r02 = 0;
        }
        if (!LogType.isForJava(i9)) {
            return r02;
        }
        m5539a(str, Thread.currentThread());
        return r02 | 16;
    }

    /* renamed from: a */
    public static boolean m5541a(boolean z9) {
        int iM5941E;
        if (!C6746b.f6425c) {
            C6738a.m5563a("crashsdk", "Unexp log not enabled, skip update unexp info!");
            return false;
        }
        if (C6749e.m5773E() || C6746b.m5697I()) {
            return false;
        }
        if (z9) {
            C6743f.m5599a(f6303F);
            iM5941E = 0;
        } else {
            if (!C6746b.m5755y()) {
                C6738a.m5563a("crashsdk", "Stop update unexp info in background!");
                return false;
            }
            if (C6751g.m5941E() <= 0) {
                return false;
            }
            if (C6743f.m5603b(f6303F)) {
                return true;
            }
            iM5941E = C6751g.m5941E() * 1000;
        }
        C6743f.m5601a(0, f6303F, iM5941E);
        return true;
    }

    /* renamed from: a */
    public static void m5533a(int i9) {
        if (i9 == 201) {
            C6738a.m5563a("crashsdk", "Begin update info ...");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (C6746b.f6426d && f6309c) {
                JNIBridge.nativeCmd(11, C6751g.m5941E(), String.valueOf(C6751g.m5942F()), null);
            }
            C6738a.m5563a("crashsdk", "Update info took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            m5541a(false);
            return;
        }
        if (i9 != 202) {
            if (!f6310d) {
                throw new AssertionError();
            }
            return;
        }
        m5561p();
        Locale locale = Locale.US;
        String str = String.format(locale, "%s/%s/%s", C6751g.m5954R(), C6751g.m5955S(), C6751g.m5956T());
        f6313g = m5558m();
        if (C6746b.f6426d) {
            JNIBridge.set(128, f6313g);
        }
        boolean zEquals = str.equals(f6313g);
        if (!zEquals) {
            C6739b.m5571a(C6746b.m5740j(), str);
        }
        if (zEquals || !C6751g.m5991u()) {
            return;
        }
        C6738a.m5563a("crashsdk", String.format(locale, "Is new version ('%s' -> '%s'), deleting old stats data!", f6313g, str));
        C6746b.m5749s();
    }
}

package com.p040uc.crashsdk.p041a;

import android.os.Build;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.os.EnvironmentCompat;
import com.p040uc.crashsdk.C3298a;
import com.p040uc.crashsdk.C3307b;
import com.p040uc.crashsdk.C3310e;
import com.p040uc.crashsdk.C3312g;
import com.p040uc.crashsdk.JNIBridge;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.uc.crashsdk.a.h */
/* loaded from: classes2.dex */
public class C3306h {

    /* renamed from: a */
    static final /* synthetic */ boolean f1371a = true;

    /* renamed from: b */
    private static final Object f1372b = new Object();

    /* renamed from: c */
    private static final Map<String, String> f1373c = new HashMap();

    /* renamed from: d */
    private static int f1374d = 0;

    /* renamed from: e */
    private static final Map<String, a> f1375e = new HashMap();

    /* renamed from: f */
    private static final Object f1376f = new Object();

    /* renamed from: g */
    private static final Object f1377g = new Object();

    /* renamed from: h */
    private static final SparseArray<String> f1378h = new SparseArray<>();

    /* renamed from: i */
    private static boolean f1379i = false;

    /* renamed from: j */
    private static boolean f1380j = false;

    /* renamed from: k */
    private static final Object f1381k = new Object();

    /* renamed from: l */
    private static String f1382l = null;

    /* renamed from: com.uc.crashsdk.a.h$a */
    public static class a {

        /* renamed from: a */
        long f1383a = 0;

        /* renamed from: b */
        int f1384b = 0;

        /* renamed from: c */
        Map<String, String> f1385c = new HashMap();

        /* renamed from: d */
        private String f1386d;

        /* renamed from: e */
        private boolean f1387e;

        /* renamed from: f */
        private boolean f1388f;

        public a(String str, boolean z3, boolean z4) {
            this.f1387e = false;
            this.f1388f = false;
            this.f1386d = str;
            this.f1387e = z3;
            this.f1388f = z4;
        }

        /* renamed from: d */
        private long m2437d(String str) {
            return C3305g.m2381c(m2438a(str));
        }

        /* renamed from: a */
        public final void m2441a(String str, String str2) {
            this.f1385c.put(str, str2);
        }

        /* renamed from: b */
        public final String m2443b(String str) {
            String strM2438a = m2438a(str);
            return strM2438a == null ? "" : strM2438a;
        }

        /* renamed from: c */
        public final boolean m2444c(String str) throws NumberFormatException {
            if (C3305g.m2375a(str)) {
                return false;
            }
            HashMap map = new HashMap();
            Map mapM2422c = C3306h.m2422c(str);
            String str2 = null;
            long jM2381c = 0;
            int iM2381c = 0;
            for (String str3 : mapM2422c.keySet()) {
                String str4 = (String) mapM2422c.get(str3);
                if (str3.equals("lt")) {
                    str2 = str4;
                } else if (this.f1387e && str3.equals("up")) {
                    jM2381c = C3305g.m2381c(str4);
                } else if (this.f1387e && str3.equals("pid")) {
                    iM2381c = (int) C3305g.m2381c(str4);
                } else {
                    map.put(str3, str4);
                }
            }
            String str5 = this.f1386d;
            if (str5 != null && !str5.equals(str2)) {
                return false;
            }
            this.f1383a = jM2381c;
            this.f1384b = iM2381c;
            this.f1386d = str2;
            this.f1385c = map;
            return true;
        }

        /* renamed from: a */
        public final void m2440a(String str, long j4) {
            long jM2437d = m2437d(str) + j4;
            if (jM2437d <= 100) {
                j4 = 0;
                if (jM2437d >= 0) {
                    j4 = jM2437d;
                }
            }
            m2441a(str, String.valueOf(j4));
        }

        /* renamed from: a */
        public final boolean m2442a(a aVar) {
            if (!this.f1388f) {
                C3299a.m2320a("crashsdk", String.format(Locale.US, "WaItem '%s' is not mergable!", this.f1386d), null);
                return false;
            }
            for (String str : aVar.f1385c.keySet()) {
                if (str.startsWith("c_")) {
                    m2441a(str, aVar.m2438a(str));
                } else {
                    long jM2437d = aVar.m2437d(str);
                    if (jM2437d == 0) {
                        m2441a(str, aVar.m2438a(str));
                    } else if (jM2437d < 100) {
                        m2440a(str, jM2437d);
                    }
                }
            }
            return true;
        }

        /* renamed from: a */
        public final String m2438a(String str) {
            return this.f1385c.get(str);
        }

        /* renamed from: a */
        public final String m2439a(boolean z3, boolean z4, boolean z5) {
            if (this.f1386d == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (z3) {
                C3306h.m2417b(sb, "lt", "uc");
                C3306h.m2417b(sb, "pre", C3312g.m2731e());
                C3306h.m2417b(sb, "pkg", C3298a.f1309a);
                C3306h.m2417b(sb, "rom", Build.VERSION.RELEASE);
                C3306h.m2417b(sb, "brd", Build.BRAND);
                C3306h.m2417b(sb, "model", Build.MODEL);
                C3306h.m2407a(sb, "sdk", Build.VERSION.SDK_INT);
                C3306h.m2417b(sb, C3335ai.f1743w, C3310e.m2612e());
                C3306h.m2417b(sb, "hdw", C3310e.m2616f());
                long jM2435n = C3306h.m2435n();
                C3306h.m2407a(sb, "ram", jM2435n);
                C3306h.m2417b(sb, "aram", C3306h.m2396a(jM2435n));
                C3306h.m2417b(sb, "cver", "3.2.0.4");
                C3306h.m2417b(sb, "cseq", "210105150455");
                C3306h.m2417b(sb, "ctag", "release");
                C3306h.m2417b(sb, "aver", C3298a.m2286a());
                C3306h.m2417b(sb, "ver", C3312g.m2710R());
                C3306h.m2417b(sb, "sver", C3312g.m2711S());
                C3306h.m2417b(sb, "seq", C3312g.m2712T());
                C3306h.m2417b(sb, "grd", C3307b.m2510x() ? "fg" : "bg");
                C3306h.m2417b(sb, C3335ai.f1744x, "android");
                sb.append("\n");
            }
            C3306h.m2417b(sb, "lt", this.f1386d);
            C3306h.m2409a(sb, this.f1385c);
            if (this.f1387e && !z4) {
                long j4 = this.f1383a;
                if (j4 != 0) {
                    C3306h.m2417b(sb, "up", String.valueOf(j4));
                }
                if (z5) {
                    C3306h.m2417b(sb, "pid", String.format(Locale.US, "%d", Integer.valueOf(Process.myPid())));
                } else {
                    int i4 = this.f1384b;
                    if (i4 != 0) {
                        C3306h.m2417b(sb, "pid", String.format(Locale.US, "%d", Integer.valueOf(i4)));
                    }
                }
            }
            sb.append("\n");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m2396a(long j4) {
        if (j4 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            return "512M";
        }
        return String.format(Locale.US, "%dG", Long.valueOf(((j4 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) + 512) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m2417b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: c */
    public static /* synthetic */ Map m2422c(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("`")) {
            if (str2.length() > 1) {
                String[] strArrSplit = str2.split("=", 3);
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    /* renamed from: d */
    public static void m2424d() {
        m2415b(2, 2000L);
        m2400a(1, 70000L);
    }

    /* renamed from: e */
    public static boolean m2426e() {
        return f1380j;
    }

    /* renamed from: f */
    public static void m2427f() {
        m2415b(1, 2000L);
    }

    /* renamed from: g */
    public static void m2428g() {
        m2415b(3, 0L);
    }

    /* renamed from: h */
    public static void m2429h() {
        m2415b(4, 0L);
    }

    /* renamed from: i */
    public static void m2430i() {
        if (C3312g.m2707O()) {
            C3304f.m2356a(1, new RunnableC3303e(303));
        }
    }

    /* renamed from: j */
    public static byte[] m2431j() {
        return new byte[]{ByteCompanionObject.MAX_VALUE, 100, 110, 31};
    }

    /* renamed from: l */
    private static String m2433l() {
        return C3312g.m2713U() + "pv.wa";
    }

    /* renamed from: m */
    private static String m2434m() {
        return C3312g.m2713U() + "cdt.wa";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static long m2435n() {
        Iterator<String> it = C3305g.m2365a(new File("/proc/meminfo"), 2).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.contains("MemTotal:")) {
                try {
                    return Long.parseLong(next.replaceAll("\\D+", ""));
                } catch (NumberFormatException e4) {
                    C3305g.m2370a(e4);
                    return 0L;
                }
            }
        }
    }

    /* renamed from: o */
    private static String m2436o() {
        if (C3305g.m2375a(f1382l)) {
            synchronized (f1381k) {
                f1382l = C3305g.m2363a(C3307b.m2494h(), C3312g.m2708P() ? "https://errlogos.umeng.com/api/crashsdk/logcollect" : "https://errlog.umeng.com/api/crashsdk/logcollect", true);
            }
        }
        return f1382l;
    }

    /* renamed from: a */
    public static /* synthetic */ void m2407a(StringBuilder sb, String str, long j4) {
        m2417b(sb, str, String.valueOf(j4));
    }

    /* renamed from: b */
    public static void m2414b() {
        m2400a(2, 0L);
    }

    /* renamed from: c */
    public static void m2423c() {
        m2400a(3, 0L);
    }

    /* renamed from: b */
    private static void m2415b(int i4, long j4) {
        if (C3312g.m2707O()) {
            C3304f.m2357a(1, new RunnableC3303e(301, new Object[]{Integer.valueOf(i4)}), j4);
        }
    }

    /* renamed from: d */
    private static boolean m2425d(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        File file = new File(str);
        Iterator<a> it = m2398a(file, "cst", 30).iterator();
        while (it.hasNext()) {
            a next = it.next();
            String strM2438a = next.m2438a("prc");
            if (!C3305g.m2375a(strM2438a)) {
                Map<String, a> map = f1375e;
                a aVar = map.get(strM2438a);
                if (aVar != null) {
                    aVar.m2442a(next);
                } else {
                    map.put(strM2438a, next);
                }
            }
        }
        Map<String, a> map2 = f1375e;
        boolean zM2420b = m2420b(C3310e.m2641p(), m2397a((Iterable<a>) map2.values(), true, false).toString());
        C3305g.m2378b(file);
        if (zM2420b || C3305g.m2373a(file, m2397a((Iterable<a>) map2.values(), false, true).toString())) {
            map2.clear();
        }
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ void m2409a(StringBuilder sb, Map map) {
        for (String str : map.keySet()) {
            m2417b(sb, str, (String) map.get(str));
        }
    }

    /* renamed from: a */
    public static void m2405a(String str) {
        synchronized (f1372b) {
            File file = new File(m2433l());
            a aVar = new a("pv", true, true);
            String strM2383c = C3305g.m2383c(file);
            if (!C3305g.m2375a(strM2383c)) {
                aVar.m2444c(strM2383c);
            }
            aVar.m2440a(str, 1L);
            aVar.m2440a("aujv", 1L);
            C3305g.m2373a(file, aVar.m2439a(false, false, false));
        }
    }

    /* renamed from: b */
    public static boolean m2419b(int i4, Object[] objArr) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        switch (i4) {
            case 351:
                if (!f1371a && objArr == null) {
                    throw new AssertionError();
                }
                String str = (String) objArr[0];
                int iIntValue = ((Integer) objArr[1]).intValue();
                if (iIntValue == 1) {
                    if (f1380j) {
                        return false;
                    }
                    f1380j = true;
                }
                File file = new File(str);
                ArrayList<a> arrayListM2398a = m2398a(file, "crp", 100);
                if (iIntValue != 4) {
                    a aVar = new a("crp", false, false);
                    String str2 = SdkVersion.MINI_VERSION;
                    if (iIntValue == 1) {
                        aVar.m2441a("et", String.valueOf(C3307b.m2450F()));
                        aVar.m2441a("ete", String.valueOf(C3307b.m2451G()));
                    } else if (iIntValue == 3) {
                        aVar.m2441a("et", SdkVersion.MINI_VERSION);
                        aVar.m2441a("ete", SdkVersion.MINI_VERSION);
                    } else if (iIntValue == 2) {
                        aVar.m2441a("hpv", SdkVersion.MINI_VERSION);
                    }
                    aVar.m2441a("prc", C3310e.m2624h());
                    if (!C3307b.m2447C()) {
                        str2 = "0";
                    }
                    aVar.m2441a("imp", str2);
                    m2404a(aVar);
                    arrayListM2398a.add(0, aVar);
                }
                if (!arrayListM2398a.isEmpty()) {
                    boolean zM2420b = m2420b(C3310e.m2641p(), m2397a((Iterable<a>) arrayListM2398a, true, false).toString());
                    C3305g.m2378b(file);
                    if (!zM2420b) {
                        C3305g.m2373a(file, m2397a((Iterable<a>) arrayListM2398a, false, true).toString());
                    }
                }
                return true;
            case 352:
                if (f1371a || objArr != null) {
                    return m2425d((String) objArr[0]);
                }
                throw new AssertionError();
            case 353:
                if (f1371a || objArr != null) {
                    return m2421b((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                }
                throw new AssertionError();
            case 354:
                if (!f1371a && objArr == null) {
                    throw new AssertionError();
                }
                File file2 = new File((String) objArr[0]);
                boolean zM2420b2 = m2420b(C3310e.m2641p(), m2397a((Iterable<a>) m2398a(file2, "cst", 30), true, false).toString());
                if (zM2420b2) {
                    C3305g.m2378b(file2);
                }
                return zM2420b2;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m2399a() {
        m2400a(0, C3307b.m2449E() ? 700000L : 70000L);
    }

    /* renamed from: a */
    private static void m2400a(int i4, long j4) {
        if (C3307b.m2447C()) {
            C3304f.m2357a(0, new RunnableC3303e(302, new Object[]{Integer.valueOf(i4)}), j4);
        }
    }

    /* renamed from: a */
    public static boolean m2411a(String str, String str2) {
        try {
            String str3 = "c_" + str.replaceAll("[^0-9a-zA-Z-_]", "-");
            String strReplaceAll = C3305g.m2375a(str2) ? "" : str2.replaceAll("[`=]", "-");
            Map<String, String> map = f1373c;
            synchronized (map) {
                if (map.get(str3) == null) {
                    int i4 = f1374d;
                    if (i4 >= 20) {
                        return false;
                    }
                    f1374d = i4 + 1;
                }
                map.put(str3, strReplaceAll);
                return true;
            }
        } catch (Throwable th) {
            C3305g.m2370a(th);
            return false;
        }
    }

    /* renamed from: b */
    public static void m2418b(boolean z3) {
        if (m2413a(z3, "crash detail upload")) {
            return;
        }
        String str = C3312g.m2713U() + "dt.wa";
        C3307b.m2478a(f1376f, str, new RunnableC3303e(352, new Object[]{str}));
        String strM2434m = m2434m();
        C3307b.m2478a(f1377g, strM2434m, new RunnableC3303e(354, new Object[]{strM2434m}));
    }

    /* renamed from: b */
    private static boolean m2421b(String str, String str2, boolean z3, boolean z4) {
        a aVar;
        File file = new File(m2434m());
        ArrayList<a> arrayListM2398a = m2398a(file, "cst", 30);
        String str3 = str + str2;
        Iterator<a> it = arrayListM2398a.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (str3.equals(aVar.m2443b("prc") + aVar.m2443b("typ"))) {
                break;
            }
        }
        if (aVar == null) {
            aVar = new a("cst", false, true);
            aVar.m2441a("prc", str);
            aVar.m2441a("typ", str2);
            m2404a(aVar);
            arrayListM2398a.add(aVar);
        }
        aVar.m2440a("cnt", 1L);
        if (z3) {
            aVar.m2440a("lim", 1L);
        }
        if (z4) {
            aVar.m2440a("syu", 1L);
        }
        return C3305g.m2373a(file, m2397a((Iterable<a>) arrayListM2398a, false, false).toString());
    }

    /* renamed from: a */
    private static void m2404a(a aVar) {
        Map<String, String> map = f1373c;
        synchronized (map) {
            for (String str : map.keySet()) {
                aVar.m2441a(str, f1373c.get(str));
            }
        }
    }

    /* renamed from: a */
    public static void m2410a(boolean z3) {
        m2402a(1, z3);
    }

    /* renamed from: a */
    public static boolean m2413a(boolean z3, String str) {
        if (!C3307b.f1428d || z3 || !JNIBridge.nativeIsCrashing()) {
            return false;
        }
        C3299a.m2322b("crashsdk", "Native is crashing, skip stat for " + str);
        return true;
    }

    /* renamed from: a */
    private static void m2402a(int i4, boolean z3) {
        if (m2413a(z3, "crash rate")) {
            return;
        }
        String str = C3312g.m2713U() + "cr.wa";
        C3307b.m2478a(f1372b, str, new RunnableC3303e(351, new Object[]{str, Integer.valueOf(i4)}));
    }

    /* renamed from: b */
    private static boolean m2420b(String str, String str2) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        boolean z3;
        String string;
        byte[] bArrM2335a;
        byte[] bArrM2337a;
        if (C3305g.m2375a(str2)) {
            return true;
        }
        byte[] bytes = str2.getBytes();
        try {
            byte[] bArr = new byte[16];
            C3301c.m2330a(bArr, 0, C3301c.m2333a());
            C3301c.m2330a(bArr, 4, m2431j());
            C3301c.m2330a(bArr, 8, C3298a.m2307f());
            C3301c.m2330a(bArr, 12, C3302d.m2347c());
            bArrM2337a = C3301c.m2337a(bytes, bArr);
        } catch (Throwable th) {
            C3305g.m2370a(th);
        }
        if (bArrM2337a != null) {
            bytes = bArrM2337a;
            z3 = true;
        } else {
            z3 = false;
        }
        if (str == null) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        String str3 = C3312g.m2708P() ? "4ea4e41a3993" : "28ef1713347d";
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strM2386d = C3305g.m2386d(str3 + str + strValueOf + "AppChk#2014");
        if (strM2386d == null) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(m2436o());
            sb.append("?chk=");
            sb.append(strM2386d.substring(strM2386d.length() - 8, strM2386d.length()));
            sb.append("&vno=");
            sb.append(strValueOf);
            sb.append("&uuid=");
            sb.append(str);
            sb.append("&app=");
            sb.append(str3);
            if (z3) {
                sb.append("&enc=aes");
            }
            string = sb.toString();
        }
        return (string == null || (bArrM2335a = C3301c.m2335a(string, bytes)) == null || !new String(bArrM2335a).contains("retcode=0")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[Catch: all -> 0x00cb, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00c9, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005a, B:30:0x005f, B:37:0x0070, B:38:0x0077, B:44:0x008b, B:46:0x0097, B:51:0x00af, B:52:0x00c2, B:49:0x00a5, B:43:0x0083), top: B:68:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a A[Catch: all -> 0x00cb, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00c9, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005a, B:30:0x005f, B:37:0x0070, B:38:0x0077, B:44:0x008b, B:46:0x0097, B:51:0x00af, B:52:0x00c2, B:49:0x00a5, B:43:0x0083), top: B:68:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[Catch: all -> 0x00cb, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00c9, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005a, B:30:0x005f, B:37:0x0070, B:38:0x0077, B:44:0x008b, B:46:0x0097, B:51:0x00af, B:52:0x00c2, B:49:0x00a5, B:43:0x0083), top: B:68:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5 A[Catch: all -> 0x00cb, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00c9, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005a, B:30:0x005f, B:37:0x0070, B:38:0x0077, B:44:0x008b, B:46:0x0097, B:51:0x00af, B:52:0x00c2, B:49:0x00a5, B:43:0x0083), top: B:68:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[Catch: all -> 0x00cb, TryCatch #0 {, blocks: (B:17:0x001d, B:19:0x0028, B:21:0x002c, B:53:0x00c9, B:22:0x002e, B:24:0x0038, B:26:0x0040, B:28:0x005a, B:30:0x005f, B:37:0x0070, B:38:0x0077, B:44:0x008b, B:46:0x0097, B:51:0x00af, B:52:0x00c2, B:49:0x00a5, B:43:0x0083), top: B:68:0x001d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2403a(int r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p040uc.crashsdk.p041a.C3306h.m2403a(int, java.lang.Object[]):void");
    }

    /* renamed from: b */
    public static void m2416b(String str) {
        synchronized (f1381k) {
            f1382l = str;
            C3300b.m2327a(C3307b.m2494h(), f1382l + "\n");
        }
    }

    /* renamed from: a */
    private static StringBuilder m2397a(Iterable<a> iterable, boolean z3, boolean z4) {
        StringBuilder sb = new StringBuilder();
        boolean z5 = true;
        for (a aVar : iterable) {
            if (z5) {
                sb.append(aVar.m2439a(z3, z3, z4));
                z5 = false;
            } else {
                sb.append(aVar.m2439a(false, z3, z4));
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static void m2406a(String str, int i4, int i5) {
        if (C3312g.m2707O()) {
            synchronized (f1376f) {
                Map<String, a> map = f1375e;
                a aVar = map.get(str);
                if (aVar == null) {
                    aVar = new a("cst", false, true);
                    map.put(str, aVar);
                    m2404a(aVar);
                }
                SparseArray<String> sparseArray = f1378h;
                synchronized (sparseArray) {
                    if (sparseArray.size() == 0) {
                        m2401a(100, "pv");
                        m2401a(102, "hpv");
                        m2401a(1, "all");
                        m2401a(2, "afg");
                        m2401a(101, "abg");
                        m2401a(3, "jfg");
                        m2401a(4, "jbg");
                        m2401a(7, "nfg");
                        m2401a(8, "nbg");
                        m2401a(27, "nafg");
                        m2401a(28, "nabg");
                        m2401a(9, "nho");
                        m2401a(10, "uar");
                        m2401a(29, "ulm");
                        m2401a(30, "ukt");
                        m2401a(31, "uet");
                        m2401a(32, "urs");
                        m2401a(11, "ufg");
                        m2401a(12, "ubg");
                        m2401a(40, "anf");
                        m2401a(41, "anb");
                        m2401a(42, "ancf");
                        m2401a(43, "ancb");
                        m2401a(13, "lup");
                        m2401a(14, "luf");
                        m2401a(15, "lef");
                        m2401a(200, "ltf");
                        m2401a(16, "laf");
                        m2401a(22, "lac");
                        m2401a(23, "lau");
                        m2401a(17, "llf");
                        m2401a(18, "lul");
                        m2401a(19, "lub");
                        m2401a(20, "luc");
                        m2401a(21, "luu");
                        m2401a(24, "lzc");
                        m2401a(201, "lec");
                        m2401a(25, "lrc");
                        m2401a(26, "lss");
                    }
                }
                String str2 = sparseArray.get(i4);
                if (str2 == null) {
                    C3299a.m2320a("crashsdk", "map key is not set with: " + i4, null);
                }
                aVar.m2441a("prc", str);
                if (str2 != null) {
                    aVar.m2441a(str2, String.valueOf(i5));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m2412a(String str, String str2, boolean z3, boolean z4) {
        if (!C3312g.m2707O()) {
            return false;
        }
        return C3307b.m2478a(f1377g, m2434m(), new RunnableC3303e(353, new Object[]{str, str2, Boolean.valueOf(z3), Boolean.valueOf(z4)}));
    }

    /* renamed from: a */
    private static void m2401a(int i4, String str) {
        f1378h.put(i4, str);
    }

    /* renamed from: a */
    private static ArrayList<a> m2398a(File file, String str, int i4) {
        ArrayList<String> arrayListM2365a = C3305g.m2365a(file, i4);
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator<String> it = arrayListM2365a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            a aVar = new a(str, false, false);
            if (aVar.m2444c(next)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}

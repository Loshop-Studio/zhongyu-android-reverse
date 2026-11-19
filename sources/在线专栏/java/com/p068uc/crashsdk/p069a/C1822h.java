package com.p068uc.crashsdk.p069a;

import android.os.Build;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import anet.channel.strategy.dispatch.DispatchConstants;
import anetwork.channel.util.RequestConstant;
import com.p068uc.crashsdk.C1814a;
import com.p068uc.crashsdk.C1823b;
import com.p068uc.crashsdk.C1826e;
import com.p068uc.crashsdk.C1828g;
import com.p068uc.crashsdk.JNIBridge;
import com.taobao.accs.AccsState;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C1851ai;
import com.xuexiang.xui.widget.popupwindow.bar.Cookie;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.android.agoo.message.MessageService;

/* renamed from: com.uc.crashsdk.a.h */
/* loaded from: classes.dex */
public class C1822h {

    /* renamed from: a */
    static final /* synthetic */ boolean f7963a = true;

    /* renamed from: b */
    private static final Object f7964b = new Object();

    /* renamed from: c */
    private static final Map<String, String> f7965c = new HashMap();

    /* renamed from: d */
    private static int f7966d = 0;

    /* renamed from: e */
    private static final Map<String, a> f7967e = new HashMap();

    /* renamed from: f */
    private static final Object f7968f = new Object();

    /* renamed from: g */
    private static final Object f7969g = new Object();

    /* renamed from: h */
    private static final SparseArray<String> f7970h = new SparseArray<>();

    /* renamed from: i */
    private static boolean f7971i = false;

    /* renamed from: j */
    private static boolean f7972j = false;

    /* renamed from: k */
    private static final Object f7973k = new Object();

    /* renamed from: l */
    private static String f7974l = null;

    /* renamed from: com.uc.crashsdk.a.h$a */
    private static class a {

        /* renamed from: a */
        long f7975a = 0;

        /* renamed from: b */
        int f7976b = 0;

        /* renamed from: c */
        Map<String, String> f7977c = new HashMap();

        /* renamed from: d */
        private String f7978d;

        /* renamed from: e */
        private boolean f7979e;

        /* renamed from: f */
        private boolean f7980f;

        a(String str, boolean z3, boolean z4) {
            this.f7979e = false;
            this.f7980f = false;
            this.f7978d = str;
            this.f7979e = z3;
            this.f7980f = z4;
        }

        /* renamed from: d */
        private long m6360d(String str) {
            return C1821g.m6304c(m6361a(str));
        }

        /* renamed from: a */
        final void m6364a(String str, String str2) {
            this.f7977c.put(str, str2);
        }

        /* renamed from: b */
        final String m6366b(String str) {
            String strM6361a = m6361a(str);
            return strM6361a == null ? "" : strM6361a;
        }

        /* renamed from: c */
        final boolean m6367c(String str) throws NumberFormatException {
            if (C1821g.m6298a(str)) {
                return false;
            }
            String str2 = null;
            long jM6304c = 0;
            HashMap map = new HashMap();
            Map mapM6345c = C1822h.m6345c(str);
            int iM6304c = 0;
            for (String str3 : mapM6345c.keySet()) {
                String str4 = (String) mapM6345c.get(str3);
                if (str3.equals("lt")) {
                    str2 = str4;
                } else if (this.f7979e && str3.equals("up")) {
                    jM6304c = C1821g.m6304c(str4);
                } else if (this.f7979e && str3.equals("pid")) {
                    iM6304c = (int) C1821g.m6304c(str4);
                } else {
                    map.put(str3, str4);
                }
            }
            String str5 = this.f7978d;
            if (str5 != null && !str5.equals(str2)) {
                return false;
            }
            this.f7975a = jM6304c;
            this.f7976b = iM6304c;
            this.f7978d = str2;
            this.f7977c = map;
            return true;
        }

        /* renamed from: a */
        final void m6363a(String str, long j4) {
            long jM6360d = m6360d(str) + j4;
            if (jM6360d <= 100) {
                j4 = jM6360d < 0 ? 0L : jM6360d;
            }
            m6364a(str, String.valueOf(j4));
        }

        /* renamed from: a */
        final boolean m6365a(a aVar) {
            if (!this.f7980f) {
                C1815a.m6243a("crashsdk", String.format(Locale.US, "WaItem '%s' is not mergable!", this.f7978d), null);
                return false;
            }
            for (String str : aVar.f7977c.keySet()) {
                if (str.startsWith("c_")) {
                    m6364a(str, aVar.m6361a(str));
                } else {
                    long jM6360d = aVar.m6360d(str);
                    if (jM6360d == 0) {
                        m6364a(str, aVar.m6361a(str));
                    } else if (jM6360d < 100) {
                        m6363a(str, jM6360d);
                    }
                }
            }
            return true;
        }

        /* renamed from: a */
        final String m6361a(String str) {
            return this.f7977c.get(str);
        }

        /* renamed from: a */
        final String m6362a(boolean z3, boolean z4, boolean z5) {
            if (this.f7978d == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (z3) {
                C1822h.m6340b(sb, "lt", "uc");
                C1822h.m6340b(sb, RequestConstant.ENV_PRE, C1828g.m6654e());
                C1822h.m6340b(sb, "pkg", C1814a.f7901a);
                C1822h.m6340b(sb, "rom", Build.VERSION.RELEASE);
                C1822h.m6340b(sb, "brd", Build.BRAND);
                C1822h.m6340b(sb, Constants.KEY_MODEL, Build.MODEL);
                C1822h.m6330a(sb, "sdk", Build.VERSION.SDK_INT);
                C1822h.m6340b(sb, C1851ai.f8335w, C1826e.m6535e());
                C1822h.m6340b(sb, "hdw", C1826e.m6539f());
                long jM6358n = C1822h.m6358n();
                C1822h.m6330a(sb, "ram", jM6358n);
                C1822h.m6340b(sb, "aram", C1822h.m6319a(jM6358n));
                C1822h.m6340b(sb, "cver", "3.2.0.4");
                C1822h.m6340b(sb, "cseq", "210105150455");
                C1822h.m6340b(sb, "ctag", "release");
                C1822h.m6340b(sb, "aver", C1814a.m6209a());
                C1822h.m6340b(sb, "ver", C1828g.m6633R());
                C1822h.m6340b(sb, "sver", C1828g.m6634S());
                C1822h.m6340b(sb, "seq", C1828g.m6635T());
                C1822h.m6340b(sb, "grd", C1823b.m6433x() ? "fg" : "bg");
                C1822h.m6340b(sb, "os", DispatchConstants.ANDROID);
                sb.append("\n");
            }
            C1822h.m6340b(sb, "lt", this.f7978d);
            C1822h.m6332a(sb, this.f7977c);
            if (this.f7979e && !z4) {
                long j4 = this.f7975a;
                if (j4 != 0) {
                    C1822h.m6340b(sb, "up", String.valueOf(j4));
                }
                if (z5) {
                    C1822h.m6340b(sb, "pid", String.format(Locale.US, "%d", Integer.valueOf(Process.myPid())));
                } else {
                    int i4 = this.f7976b;
                    if (i4 != 0) {
                        C1822h.m6340b(sb, "pid", String.format(Locale.US, "%d", Integer.valueOf(i4)));
                    }
                }
            }
            sb.append("\n");
            return sb.toString();
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m6319a(long j4) {
        return j4 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED ? "512M" : String.format(Locale.US, "%dG", Long.valueOf(((j4 / 1024) + 512) / 1024));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m6340b(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: c */
    static /* synthetic */ Map m6345c(String str) {
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
    public static void m6347d() {
        m6338b(2, Cookie.DEFAULT_COOKIE_DURATION);
        m6323a(1, 70000L);
    }

    /* renamed from: e */
    public static boolean m6349e() {
        return f7972j;
    }

    /* renamed from: f */
    public static void m6350f() {
        m6338b(1, Cookie.DEFAULT_COOKIE_DURATION);
    }

    /* renamed from: g */
    public static void m6351g() {
        m6338b(3, 0L);
    }

    /* renamed from: h */
    public static void m6352h() {
        m6338b(4, 0L);
    }

    /* renamed from: i */
    public static void m6353i() {
        if (C1828g.m6630O()) {
            C1820f.m6279a(1, new RunnableC1819e(ErrorCode.DM_APPKEY_INVALID));
        }
    }

    /* renamed from: j */
    static byte[] m6354j() {
        return new byte[]{127, 100, 110, 31};
    }

    /* renamed from: l */
    private static String m6356l() {
        return C1828g.m6636U() + "pv.wa";
    }

    /* renamed from: m */
    private static String m6357m() {
        return C1828g.m6636U() + "cdt.wa";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static long m6358n() {
        Iterator<String> it = C1821g.m6288a(new File("/proc/meminfo"), 2).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.contains("MemTotal:")) {
                try {
                    return Long.parseLong(next.replaceAll("\\D+", ""));
                } catch (NumberFormatException e4) {
                    C1821g.m6293a(e4);
                    return 0L;
                }
            }
        }
    }

    /* renamed from: o */
    private static String m6359o() {
        if (C1821g.m6298a(f7974l)) {
            synchronized (f7973k) {
                f7974l = C1821g.m6286a(C1823b.m6417h(), C1828g.m6631P() ? "https://errlogos.umeng.com/api/crashsdk/logcollect" : "https://errlog.umeng.com/api/crashsdk/logcollect", true);
            }
        }
        return f7974l;
    }

    /* renamed from: a */
    static /* synthetic */ void m6330a(StringBuilder sb, String str, long j4) {
        m6340b(sb, str, String.valueOf(j4));
    }

    /* renamed from: b */
    public static void m6337b() {
        m6323a(2, 0L);
    }

    /* renamed from: c */
    public static void m6346c() {
        m6323a(3, 0L);
    }

    /* renamed from: b */
    private static void m6338b(int i4, long j4) {
        if (C1828g.m6630O()) {
            C1820f.m6280a(1, new RunnableC1819e(301, new Object[]{Integer.valueOf(i4)}), j4);
        }
    }

    /* renamed from: d */
    private static boolean m6348d(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        File file = new File(str);
        Iterator<a> it = m6321a(file, "cst", 30).iterator();
        while (it.hasNext()) {
            a next = it.next();
            String strM6361a = next.m6361a("prc");
            if (!C1821g.m6298a(strM6361a)) {
                Map<String, a> map = f7967e;
                a aVar = map.get(strM6361a);
                if (aVar != null) {
                    aVar.m6365a(next);
                } else {
                    map.put(strM6361a, next);
                }
            }
        }
        Map<String, a> map2 = f7967e;
        boolean zM6343b = m6343b(C1826e.m6564p(), m6320a((Iterable<a>) map2.values(), true, false).toString());
        C1821g.m6301b(file);
        if (zM6343b || C1821g.m6296a(file, m6320a((Iterable<a>) map2.values(), false, true).toString())) {
            map2.clear();
        }
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ void m6332a(StringBuilder sb, Map map) {
        for (String str : map.keySet()) {
            m6340b(sb, str, (String) map.get(str));
        }
    }

    /* renamed from: a */
    static void m6328a(String str) {
        synchronized (f7964b) {
            File file = new File(m6356l());
            a aVar = new a("pv", true, true);
            String strM6306c = C1821g.m6306c(file);
            if (!C1821g.m6298a(strM6306c)) {
                aVar.m6367c(strM6306c);
            }
            aVar.m6363a(str, 1L);
            aVar.m6363a("aujv", 1L);
            C1821g.m6296a(file, aVar.m6362a(false, false, false));
        }
    }

    /* renamed from: b */
    static boolean m6342b(int i4, Object[] objArr) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        switch (i4) {
            case 351:
                if (!f7963a && objArr == null) {
                    throw new AssertionError();
                }
                String str = (String) objArr[0];
                int iIntValue = ((Integer) objArr[1]).intValue();
                if (iIntValue == 1) {
                    if (f7972j) {
                        return false;
                    }
                    f7972j = true;
                }
                File file = new File(str);
                ArrayList<a> arrayListM6321a = m6321a(file, "crp", 100);
                if (iIntValue != 4) {
                    a aVar = new a("crp", false, false);
                    if (iIntValue == 1) {
                        aVar.m6364a("et", String.valueOf(C1823b.m6373F()));
                        aVar.m6364a("ete", String.valueOf(C1823b.m6374G()));
                    } else if (iIntValue == 3) {
                        aVar.m6364a("et", "1");
                        aVar.m6364a("ete", "1");
                    } else if (iIntValue == 2) {
                        aVar.m6364a("hpv", "1");
                    }
                    aVar.m6364a("prc", C1826e.m6547h());
                    aVar.m6364a("imp", C1823b.m6370C() ? "1" : MessageService.MSG_DB_READY_REPORT);
                    m6327a(aVar);
                    arrayListM6321a.add(0, aVar);
                }
                if (!arrayListM6321a.isEmpty()) {
                    boolean zM6343b = m6343b(C1826e.m6564p(), m6320a((Iterable<a>) arrayListM6321a, true, false).toString());
                    C1821g.m6301b(file);
                    if (!zM6343b) {
                        C1821g.m6296a(file, m6320a((Iterable<a>) arrayListM6321a, false, true).toString());
                    }
                }
                return true;
            case 352:
                if (f7963a || objArr != null) {
                    return m6348d((String) objArr[0]);
                }
                throw new AssertionError();
            case 353:
                if (f7963a || objArr != null) {
                    return m6344b((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                }
                throw new AssertionError();
            case 354:
                if (!f7963a && objArr == null) {
                    throw new AssertionError();
                }
                File file2 = new File((String) objArr[0]);
                boolean zM6343b2 = m6343b(C1826e.m6564p(), m6320a((Iterable<a>) m6321a(file2, "cst", 30), true, false).toString());
                if (zM6343b2) {
                    C1821g.m6301b(file2);
                }
                return zM6343b2;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static void m6322a() {
        m6323a(0, C1823b.m6372E() ? 700000L : 70000L);
    }

    /* renamed from: a */
    private static void m6323a(int i4, long j4) {
        if (C1823b.m6370C()) {
            C1820f.m6280a(0, new RunnableC1819e(ErrorCode.DM_DEVICEID_INVALID, new Object[]{Integer.valueOf(i4)}), j4);
        }
    }

    /* renamed from: a */
    public static boolean m6334a(String str, String str2) {
        try {
            String str3 = "c_" + str.replaceAll("[^0-9a-zA-Z-_]", "-");
            String strReplaceAll = C1821g.m6298a(str2) ? "" : str2.replaceAll("[`=]", "-");
            Map<String, String> map = f7965c;
            synchronized (map) {
                if (map.get(str3) == null) {
                    int i4 = f7966d;
                    if (i4 >= 20) {
                        return false;
                    }
                    f7966d = i4 + 1;
                }
                map.put(str3, strReplaceAll);
                return true;
            }
        } catch (Throwable th) {
            C1821g.m6293a(th);
            return false;
        }
    }

    /* renamed from: b */
    public static void m6341b(boolean z3) {
        if (m6336a(z3, "crash detail upload")) {
            return;
        }
        String str = C1828g.m6636U() + "dt.wa";
        C1823b.m6401a(f7968f, str, new RunnableC1819e(352, new Object[]{str}));
        String strM6357m = m6357m();
        C1823b.m6401a(f7969g, strM6357m, new RunnableC1819e(354, new Object[]{strM6357m}));
    }

    /* renamed from: b */
    private static boolean m6344b(String str, String str2, boolean z3, boolean z4) {
        a aVar;
        File file = new File(m6357m());
        ArrayList<a> arrayListM6321a = m6321a(file, "cst", 30);
        String str3 = str + str2;
        Iterator<a> it = arrayListM6321a.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (str3.equals(aVar.m6366b("prc") + aVar.m6366b("typ"))) {
                break;
            }
        }
        if (aVar == null) {
            aVar = new a("cst", false, true);
            aVar.m6364a("prc", str);
            aVar.m6364a("typ", str2);
            m6327a(aVar);
            arrayListM6321a.add(aVar);
        }
        aVar.m6363a("cnt", 1L);
        if (z3) {
            aVar.m6363a("lim", 1L);
        }
        if (z4) {
            aVar.m6363a("syu", 1L);
        }
        return C1821g.m6296a(file, m6320a((Iterable<a>) arrayListM6321a, false, false).toString());
    }

    /* renamed from: a */
    private static void m6327a(a aVar) {
        Map<String, String> map = f7965c;
        synchronized (map) {
            for (String str : map.keySet()) {
                aVar.m6364a(str, f7965c.get(str));
            }
        }
    }

    /* renamed from: a */
    public static void m6333a(boolean z3) {
        m6325a(1, z3);
    }

    /* renamed from: a */
    public static boolean m6336a(boolean z3, String str) {
        if (!C1823b.f8020d || z3 || !JNIBridge.nativeIsCrashing()) {
            return false;
        }
        C1815a.m6245b("crashsdk", "Native is crashing, skip stat for " + str);
        return true;
    }

    /* renamed from: a */
    private static void m6325a(int i4, boolean z3) {
        if (m6336a(z3, "crash rate")) {
            return;
        }
        String str = C1828g.m6636U() + "cr.wa";
        C1823b.m6401a(f7964b, str, new RunnableC1819e(351, new Object[]{str, Integer.valueOf(i4)}));
    }

    /* renamed from: b */
    private static boolean m6343b(String str, String str2) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        boolean z3;
        String string;
        byte[] bArrM6258a;
        byte[] bArrM6260a;
        if (C1821g.m6298a(str2)) {
            return true;
        }
        byte[] bytes = str2.getBytes();
        try {
            byte[] bArr = new byte[16];
            C1817c.m6253a(bArr, 0, C1817c.m6256a());
            C1817c.m6253a(bArr, 4, m6354j());
            C1817c.m6253a(bArr, 8, C1814a.m6230f());
            C1817c.m6253a(bArr, 12, C1818d.m6270c());
            bArrM6260a = C1817c.m6260a(bytes, bArr);
        } catch (Throwable th) {
            C1821g.m6293a(th);
        }
        if (bArrM6260a != null) {
            bytes = bArrM6260a;
            z3 = true;
        } else {
            z3 = false;
        }
        if (str == null) {
            str = UtilityImpl.NET_TYPE_UNKNOWN;
        }
        String str3 = C1828g.m6631P() ? "4ea4e41a3993" : "28ef1713347d";
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strM6309d = C1821g.m6309d(str3 + str + strValueOf + "AppChk#2014");
        if (strM6309d == null) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(m6359o());
            sb.append("?chk=");
            sb.append(strM6309d.substring(strM6309d.length() - 8, strM6309d.length()));
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
        return (string == null || (bArrM6258a = C1817c.m6258a(string, bytes)) == null || !new String(bArrM6258a).contains("retcode=0")) ? false : true;
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
    static void m6326a(int r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p068uc.crashsdk.p069a.C1822h.m6326a(int, java.lang.Object[]):void");
    }

    /* renamed from: b */
    static void m6339b(String str) {
        synchronized (f7973k) {
            f7974l = str;
            C1816b.m6250a(C1823b.m6417h(), f7974l + "\n");
        }
    }

    /* renamed from: a */
    private static StringBuilder m6320a(Iterable<a> iterable, boolean z3, boolean z4) {
        StringBuilder sb = new StringBuilder();
        boolean z5 = true;
        for (a aVar : iterable) {
            if (z5) {
                sb.append(aVar.m6362a(z3, z3, z4));
                z5 = false;
            } else {
                sb.append(aVar.m6362a(false, z3, z4));
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static void m6329a(String str, int i4, int i5) {
        if (C1828g.m6630O()) {
            synchronized (f7968f) {
                Map<String, a> map = f7967e;
                a aVar = map.get(str);
                if (aVar == null) {
                    aVar = new a("cst", false, true);
                    map.put(str, aVar);
                    m6327a(aVar);
                }
                SparseArray<String> sparseArray = f7970h;
                synchronized (sparseArray) {
                    if (sparseArray.size() == 0) {
                        m6324a(100, "pv");
                        m6324a(102, "hpv");
                        m6324a(1, AccsState.ALL);
                        m6324a(2, "afg");
                        m6324a(101, "abg");
                        m6324a(3, "jfg");
                        m6324a(4, "jbg");
                        m6324a(7, "nfg");
                        m6324a(8, "nbg");
                        m6324a(27, "nafg");
                        m6324a(28, "nabg");
                        m6324a(9, "nho");
                        m6324a(10, "uar");
                        m6324a(29, "ulm");
                        m6324a(30, "ukt");
                        m6324a(31, "uet");
                        m6324a(32, "urs");
                        m6324a(11, "ufg");
                        m6324a(12, "ubg");
                        m6324a(40, "anf");
                        m6324a(41, "anb");
                        m6324a(42, "ancf");
                        m6324a(43, "ancb");
                        m6324a(13, "lup");
                        m6324a(14, "luf");
                        m6324a(15, "lef");
                        m6324a(200, "ltf");
                        m6324a(16, "laf");
                        m6324a(22, "lac");
                        m6324a(23, "lau");
                        m6324a(17, "llf");
                        m6324a(18, "lul");
                        m6324a(19, "lub");
                        m6324a(20, "luc");
                        m6324a(21, "luu");
                        m6324a(24, "lzc");
                        m6324a(201, "lec");
                        m6324a(25, "lrc");
                        m6324a(26, "lss");
                    }
                }
                String str2 = sparseArray.get(i4);
                if (str2 == null) {
                    C1815a.m6243a("crashsdk", "map key is not set with: " + i4, null);
                }
                aVar.m6364a("prc", str);
                if (str2 != null) {
                    aVar.m6364a(str2, String.valueOf(i5));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m6335a(String str, String str2, boolean z3, boolean z4) {
        if (!C1828g.m6630O()) {
            return false;
        }
        return C1823b.m6401a(f7969g, m6357m(), new RunnableC1819e(353, new Object[]{str, str2, Boolean.valueOf(z3), Boolean.valueOf(z4)}));
    }

    /* renamed from: a */
    private static void m6324a(int i4, String str) {
        f7970h.put(i4, str);
    }

    /* renamed from: a */
    private static ArrayList<a> m6321a(File file, String str, int i4) {
        ArrayList<String> arrayListM6288a = C1821g.m6288a(file, i4);
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator<String> it = arrayListM6288a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            a aVar = new a(str, false, false);
            if (aVar.m6367c(next)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}

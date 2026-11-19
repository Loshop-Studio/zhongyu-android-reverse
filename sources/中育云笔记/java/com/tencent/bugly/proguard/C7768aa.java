package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import anetwork.channel.util.RequestConstant;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.tencent.bugly.proguard.aa */
/* loaded from: classes5.dex */
public final class C7768aa {

    /* renamed from: W */
    private static final Map<String, String> f13583W = new HashMap();

    /* renamed from: aq */
    private static C7768aa f13584aq = null;

    /* renamed from: D */
    public boolean f13588D;

    /* renamed from: E */
    public String f13589E;

    /* renamed from: F */
    public String f13590F;

    /* renamed from: G */
    public String f13591G;

    /* renamed from: H */
    public String f13592H;

    /* renamed from: J */
    public boolean f13594J;

    /* renamed from: O */
    public final SharedPreferences f13599O;

    /* renamed from: P */
    public final SharedPreferences f13600P;

    /* renamed from: X */
    private final Context f13607X;

    /* renamed from: Y */
    private String f13608Y;

    /* renamed from: Z */
    private String f13609Z;

    /* renamed from: aa */
    private String f13611aa;

    /* renamed from: aj */
    private String f13620aj;

    /* renamed from: c */
    public String f13636c;

    /* renamed from: d */
    public final String f13637d;

    /* renamed from: e */
    public String f13638e;

    /* renamed from: k */
    public final String f13644k;

    /* renamed from: o */
    public String f13648o;

    /* renamed from: p */
    public int f13649p;

    /* renamed from: q */
    public String f13650q;

    /* renamed from: r */
    public String f13651r;

    /* renamed from: s */
    public String f13652s;

    /* renamed from: v */
    public List<String> f13655v;

    /* renamed from: f */
    public boolean f13639f = true;

    /* renamed from: g */
    public final String f13640g = "com.tencent.bugly";

    /* renamed from: h */
    public String f13641h = "4.1.9.3";

    /* renamed from: i */
    public final String f13642i = "";

    /* renamed from: j */
    @Deprecated
    public final String f13643j = "";

    /* renamed from: l */
    public String f13645l = "unknown";

    /* renamed from: ab */
    private String f13612ab = "unknown";

    /* renamed from: ac */
    private String f13613ac = "";

    /* renamed from: m */
    public long f13646m = 0;

    /* renamed from: ad */
    private String f13614ad = null;

    /* renamed from: ae */
    private long f13615ae = -1;

    /* renamed from: af */
    private long f13616af = -1;

    /* renamed from: ag */
    private long f13617ag = -1;

    /* renamed from: ah */
    private String f13618ah = null;

    /* renamed from: ai */
    private String f13619ai = null;

    /* renamed from: ak */
    private Map<String, PlugInBean> f13621ak = null;

    /* renamed from: n */
    public boolean f13647n = false;

    /* renamed from: al */
    private String f13622al = null;

    /* renamed from: am */
    private Boolean f13623am = null;

    /* renamed from: an */
    private String f13624an = null;

    /* renamed from: t */
    public String f13653t = null;

    /* renamed from: u */
    public String f13654u = null;

    /* renamed from: ao */
    private Map<String, PlugInBean> f13625ao = null;

    /* renamed from: ap */
    private Map<String, PlugInBean> f13626ap = null;

    /* renamed from: w */
    public int f13656w = -1;

    /* renamed from: x */
    public int f13657x = -1;

    /* renamed from: ar */
    private final Map<String, String> f13627ar = new HashMap();

    /* renamed from: as */
    private final Map<String, String> f13628as = new HashMap();

    /* renamed from: at */
    private final Map<String, String> f13629at = new HashMap();

    /* renamed from: y */
    public String f13658y = "unknown";

    /* renamed from: z */
    public long f13659z = 0;

    /* renamed from: A */
    public long f13585A = 0;

    /* renamed from: B */
    public long f13586B = 0;

    /* renamed from: C */
    public long f13587C = 0;

    /* renamed from: I */
    public boolean f13593I = false;

    /* renamed from: K */
    public HashMap<String, String> f13595K = new HashMap<>();

    /* renamed from: L */
    public List<String> f13596L = new ArrayList();

    /* renamed from: M */
    public boolean f13597M = false;

    /* renamed from: N */
    public InterfaceC7831q f13598N = null;

    /* renamed from: Q */
    public boolean f13601Q = true;

    /* renamed from: R */
    public boolean f13602R = true;

    /* renamed from: S */
    public boolean f13603S = false;

    /* renamed from: au */
    private final Object f13630au = new Object();

    /* renamed from: T */
    public final Object f13604T = new Object();

    /* renamed from: av */
    private final Object f13631av = new Object();

    /* renamed from: aw */
    private final Object f13632aw = new Object();

    /* renamed from: U */
    public final Object f13605U = new Object();

    /* renamed from: V */
    public final Object f13606V = new Object();

    /* renamed from: ax */
    private final Object f13633ax = new Object();

    /* renamed from: ay */
    private final List<Integer> f13634ay = new ArrayList();

    /* renamed from: a */
    public final long f13610a = System.currentTimeMillis();

    /* renamed from: b */
    public final byte f13635b = 1;

    private C7768aa(Context context) {
        this.f13620aj = null;
        this.f13648o = null;
        this.f13650q = null;
        this.f13651r = null;
        this.f13652s = null;
        this.f13655v = null;
        this.f13588D = false;
        this.f13589E = null;
        this.f13590F = null;
        this.f13591G = null;
        this.f13592H = "";
        this.f13594J = false;
        this.f13607X = C7783ap.m10643a(context);
        PackageInfo packageInfoM11016b = C7840z.m11016b(context);
        if (packageInfoM11016b != null) {
            try {
                String str = packageInfoM11016b.versionName;
                this.f13648o = str;
                this.f13589E = str;
                this.f13590F = Integer.toString(packageInfoM11016b.versionCode);
            } catch (Throwable th) {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
            }
        }
        this.f13636c = C7840z.m11012a(context);
        this.f13637d = C7840z.m11011a(Process.myPid());
        this.f13650q = C7840z.m11017c(context);
        this.f13644k = "Android " + C7769ab.m10520b() + ",level " + C7769ab.m10521c();
        Map<String, String> mapM11018d = C7840z.m11018d(context);
        if (mapM11018d != null) {
            try {
                this.f13655v = C7840z.m11013a(mapM11018d);
                String str2 = mapM11018d.get("BUGLY_APPID");
                if (str2 != null) {
                    this.f13651r = str2;
                    m10488b("APP_ID", str2);
                }
                String str3 = mapM11018d.get("BUGLY_APP_VERSION");
                if (str3 != null) {
                    this.f13648o = str3;
                }
                String str4 = mapM11018d.get("BUGLY_APP_CHANNEL");
                if (str4 != null) {
                    this.f13652s = str4;
                }
                String str5 = mapM11018d.get("BUGLY_ENABLE_DEBUG");
                if (str5 != null) {
                    this.f13588D = str5.equalsIgnoreCase(RequestConstant.TRUE);
                }
                String str6 = mapM11018d.get("com.tencent.rdm.uuid");
                if (str6 != null) {
                    this.f13591G = str6;
                }
                String str7 = mapM11018d.get("BUGLY_APP_BUILD_NO");
                if (!TextUtils.isEmpty(str7)) {
                    this.f13649p = Integer.parseInt(str7);
                }
                String str8 = mapM11018d.get("BUGLY_AREA");
                if (str8 != null) {
                    this.f13592H = str8;
                }
            } catch (Throwable th2) {
                if (!C7779al.m10614a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.f13594J = true;
                C7779al.m10617c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th3) {
            if (C7830p.f14078c) {
                th3.printStackTrace();
            }
        }
        this.f13599O = C7783ap.m10644a("BUGLY_COMMON_VALUES", context);
        this.f13600P = C7783ap.m10644a("BUGLY_RESERVED_VALUES", context);
        this.f13620aj = C7769ab.m10518a(context);
        m10475E();
        C7779al.m10617c("com info create end", new Object[0]);
    }

    /* renamed from: B */
    public static int m10472B() {
        return C7769ab.m10521c();
    }

    @Deprecated
    /* renamed from: C */
    public static boolean m10473C() {
        C7779al.m10613a("Detect if the emulator is unavailable", new Object[0]);
        return false;
    }

    @Deprecated
    /* renamed from: D */
    public static boolean m10474D() {
        C7779al.m10613a("Detect if the device hook is unavailable", new Object[0]);
        return false;
    }

    /* renamed from: E */
    private void m10475E() {
        try {
            for (Map.Entry<String, ?> entry : this.f13600P.getAll().entrySet()) {
                C7779al.m10617c("put reserved request data from sp, key:%s value:%s", entry.getKey(), entry.getValue());
                m10479a(entry.getKey(), entry.getValue().toString(), false);
            }
            for (Map.Entry<String, String> entry2 : f13583W.entrySet()) {
                C7779al.m10617c("put reserved request data from cache, key:%s value:%s", entry2.getKey(), entry2.getValue());
                m10479a(entry2.getKey(), entry2.getValue(), true);
            }
            f13583W.clear();
        } catch (Throwable th) {
            C7779al.m10616b(th);
        }
    }

    /* renamed from: F */
    private String m10476F() {
        if (TextUtils.isEmpty(this.f13614ad)) {
            this.f13614ad = C7783ap.m10683d("androidid", null);
        }
        return this.f13614ad;
    }

    /* renamed from: G */
    private static String m10477G() {
        String string = UUID.randomUUID().toString();
        return !C7783ap.m10676b(string) ? string.replaceAll("-", "") : string;
    }

    /* renamed from: b */
    public static synchronized C7768aa m10480b() {
        return f13584aq;
    }

    @Deprecated
    /* renamed from: n */
    public static String m10481n() {
        return "";
    }

    /* renamed from: A */
    public final synchronized Map<String, PlugInBean> m10482A() {
        Map<String, PlugInBean> map;
        map = this.f13625ao;
        Map<String, PlugInBean> map2 = this.f13626ap;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* renamed from: a */
    public final boolean m10486a() {
        boolean z10 = this.f13634ay.size() > 0;
        C7779al.m10617c("isAppForeground:%s", Boolean.valueOf(z10));
        return z10;
    }

    /* renamed from: c */
    public final void m10489c() {
        synchronized (this.f13630au) {
            this.f13608Y = UUID.randomUUID().toString();
        }
    }

    /* renamed from: d */
    public final String m10491d() {
        String str;
        synchronized (this.f13630au) {
            try {
                if (this.f13608Y == null) {
                    m10489c();
                }
                str = this.f13608Y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: e */
    public final String m10493e() {
        return !C7783ap.m10676b(this.f13638e) ? this.f13638e : this.f13651r;
    }

    /* renamed from: f */
    public final String m10495f() {
        String str;
        synchronized (this.f13606V) {
            str = this.f13645l;
        }
        return str;
    }

    /* renamed from: g */
    public final String m10497g() {
        String str = this.f13611aa;
        if (str != null) {
            return str;
        }
        String strM10683d = C7783ap.m10683d("deviceId", null);
        this.f13611aa = strM10683d;
        if (strM10683d != null) {
            return strM10683d;
        }
        String strM10476F = m10476F();
        this.f13611aa = strM10476F;
        if (TextUtils.isEmpty(strM10476F)) {
            this.f13611aa = m10477G();
        }
        String str2 = this.f13611aa;
        if (str2 == null) {
            return "";
        }
        C7783ap.m10680c("deviceId", str2);
        return this.f13611aa;
    }

    /* renamed from: h */
    public final synchronized String m10499h() {
        String str = this.f13609Z;
        if (str != null) {
            return str;
        }
        String strM10683d = C7783ap.m10683d("deviceModel", null);
        this.f13609Z = strM10683d;
        if (strM10683d != null) {
            C7779al.m10617c("collect device model from sp:%s", strM10683d);
            return this.f13609Z;
        }
        if (!this.f13647n) {
            C7779al.m10617c("not allow collect device model", new Object[0]);
            return "fail";
        }
        String strM10517a = C7769ab.m10517a();
        this.f13609Z = strM10517a;
        C7779al.m10617c("collect device model:%s", strM10517a);
        C7783ap.m10680c("deviceModel", this.f13609Z);
        return this.f13609Z;
    }

    /* renamed from: i */
    public final synchronized String m10500i() {
        return this.f13613ac;
    }

    /* renamed from: j */
    public final long m10501j() {
        if (this.f13615ae <= 0) {
            this.f13615ae = C7769ab.m10524e();
        }
        return this.f13615ae;
    }

    /* renamed from: k */
    public final long m10502k() {
        if (this.f13616af <= 0) {
            this.f13616af = C7769ab.m10528i();
        }
        return this.f13616af;
    }

    /* renamed from: l */
    public final long m10503l() {
        if (this.f13617ag <= 0) {
            this.f13617ag = C7769ab.m10530k();
        }
        return this.f13617ag;
    }

    /* renamed from: m */
    public final String m10504m() {
        if (!TextUtils.isEmpty(this.f13619ai)) {
            C7779al.m10617c("get cpu type from so:%s", this.f13619ai);
            return this.f13619ai;
        }
        if (TextUtils.isEmpty(this.f13620aj)) {
            return "unknown";
        }
        C7779al.m10617c("get cpu type from lib dir:%s", this.f13620aj);
        return this.f13620aj;
    }

    /* renamed from: o */
    public final String m10505o() {
        try {
            Map<String, ?> all = this.f13607X.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.f13604T) {
                    try {
                    } catch (Throwable th) {
                        C7779al.m10614a(th);
                    } finally {
                    }
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        this.f13595K.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        } catch (Throwable th2) {
            C7779al.m10614a(th2);
        }
        if (this.f13595K.isEmpty()) {
            C7779al.m10617c("SDK_INFO is empty", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.f13595K.entrySet()) {
            sb2.append("[");
            sb2.append(entry2.getKey());
            sb2.append(",");
            sb2.append(entry2.getValue());
            sb2.append("] ");
        }
        C7779al.m10617c("SDK_INFO = %s", sb2.toString());
        m10488b("SDK_INFO", sb2.toString());
        return sb2.toString();
    }

    /* renamed from: p */
    public final synchronized Map<String, PlugInBean> m10506p() {
        Map<String, PlugInBean> map = this.f13621ak;
        if (map != null && map.size() > 0) {
            HashMap map2 = new HashMap(this.f13621ak.size());
            map2.putAll(this.f13621ak);
            return map2;
        }
        return null;
    }

    /* renamed from: q */
    public final String m10507q() {
        if (this.f13622al == null) {
            this.f13622al = C7769ab.m10532m();
        }
        return this.f13622al;
    }

    /* renamed from: r */
    public final Boolean m10508r() {
        if (this.f13623am == null) {
            this.f13623am = Boolean.valueOf(C7769ab.m10536q());
        }
        return this.f13623am;
    }

    /* renamed from: s */
    public final String m10509s() {
        if (this.f13624an == null) {
            String str = C7769ab.m10533n();
            this.f13624an = str;
            C7779al.m10613a("ROM ID: %s", str);
        }
        return this.f13624an;
    }

    /* renamed from: t */
    public final Map<String, String> m10510t() {
        synchronized (this.f13631av) {
            try {
                if (this.f13627ar.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f13627ar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public final void m10511u() {
        synchronized (this.f13631av) {
            this.f13627ar.clear();
        }
    }

    /* renamed from: v */
    public final int m10512v() {
        int size;
        synchronized (this.f13631av) {
            size = this.f13627ar.size();
        }
        return size;
    }

    /* renamed from: w */
    public final Set<String> m10513w() {
        Set<String> setKeySet;
        synchronized (this.f13631av) {
            setKeySet = this.f13627ar.keySet();
        }
        return setKeySet;
    }

    /* renamed from: x */
    public final Map<String, String> m10514x() {
        synchronized (this.f13633ax) {
            try {
                if (this.f13628as.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f13628as);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final Map<String, String> m10515y() {
        synchronized (this.f13632aw) {
            try {
                if (this.f13629at.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f13629at);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final int m10516z() {
        int i10;
        synchronized (this.f13605U) {
            i10 = this.f13656w;
        }
        return i10;
    }

    /* renamed from: b */
    public final void m10487b(String str) {
        C7779al.m10613a("change deviceModel，old:%s new:%s", this.f13609Z, str);
        this.f13609Z = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C7783ap.m10680c("deviceModel", str);
    }

    /* renamed from: a */
    public final void m10483a(int i10, boolean z10) {
        C7779al.m10617c("setActivityForeState, hash:%s isFore:%s", Integer.valueOf(i10), Boolean.valueOf(z10));
        if (z10) {
            this.f13634ay.add(Integer.valueOf(i10));
        } else {
            this.f13634ay.remove(Integer.valueOf(i10));
            this.f13634ay.remove((Object) 0);
        }
        InterfaceC7831q interfaceC7831q = this.f13598N;
        if (interfaceC7831q != null) {
            interfaceC7831q.setNativeIsAppForeground(this.f13634ay.size() > 0);
        }
    }

    /* renamed from: c */
    public final synchronized void m10490c(String str) {
        this.f13612ab = String.valueOf(str);
    }

    /* renamed from: e */
    public final void m10494e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13619ai = str.trim();
    }

    /* renamed from: f */
    public final String m10496f(String str) {
        String strRemove;
        if (C7783ap.m10676b(str)) {
            C7779al.m10618d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f13631av) {
            strRemove = this.f13627ar.remove(str);
        }
        return strRemove;
    }

    /* renamed from: b */
    public final void m10488b(String str, String str2) {
        if (!C7783ap.m10676b(str) && !C7783ap.m10676b(str2)) {
            synchronized (this.f13632aw) {
                this.f13629at.put(str, str2);
            }
            return;
        }
        C7779al.m10618d("server key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: d */
    public final synchronized void m10492d(String str) {
        this.f13613ac = String.valueOf(str);
    }

    /* renamed from: a */
    public static synchronized C7768aa m10478a(Context context) {
        try {
            if (f13584aq == null) {
                f13584aq = new C7768aa(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13584aq;
    }

    /* renamed from: g */
    public final String m10498g(String str) {
        String str2;
        if (C7783ap.m10676b(str)) {
            C7779al.m10618d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f13631av) {
            str2 = this.f13627ar.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public final void m10484a(String str) {
        this.f13611aa = str;
        if (!TextUtils.isEmpty(str)) {
            C7783ap.m10680c("deviceId", str);
        }
        synchronized (this.f13633ax) {
            this.f13628as.put("E8", str);
        }
    }

    /* renamed from: a */
    public final void m10485a(String str, String str2) {
        if (!C7783ap.m10676b(str) && !C7783ap.m10676b(str2)) {
            synchronized (this.f13631av) {
                this.f13627ar.put(str, str2);
            }
            return;
        }
        C7779al.m10618d("key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: a */
    private void m10479a(String str, String str2, boolean z10) {
        if (C7783ap.m10676b(str)) {
            C7779al.m10618d("key should not be empty %s", str);
            return;
        }
        C7779al.m10617c("putExtraRequestData key:%s value:%s save:%s", str, str2, Boolean.valueOf(z10));
        synchronized (this.f13633ax) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.f13628as.remove(str);
                    this.f13600P.edit().remove(str).apply();
                } else {
                    this.f13628as.put(str, str2);
                    if (z10) {
                        this.f13600P.edit().putString(str, str2).apply();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

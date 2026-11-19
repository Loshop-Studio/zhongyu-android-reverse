package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.tencent.bugly.proguard.aa */
/* loaded from: classes4.dex */
public final class C6663aa {

    /* renamed from: W */
    private static final Map<String, String> f5718W = new HashMap();

    /* renamed from: aq */
    private static C6663aa f5719aq = null;

    /* renamed from: D */
    public boolean f5723D;

    /* renamed from: E */
    public String f5724E;

    /* renamed from: F */
    public String f5725F;

    /* renamed from: G */
    public String f5726G;

    /* renamed from: H */
    public String f5727H;

    /* renamed from: J */
    public boolean f5729J;

    /* renamed from: O */
    public final SharedPreferences f5734O;

    /* renamed from: P */
    public final SharedPreferences f5735P;

    /* renamed from: X */
    private final Context f5742X;

    /* renamed from: Y */
    private String f5743Y;

    /* renamed from: Z */
    private String f5744Z;

    /* renamed from: aa */
    private String f5746aa;

    /* renamed from: aj */
    private String f5755aj;

    /* renamed from: c */
    public String f5771c;

    /* renamed from: d */
    public final String f5772d;

    /* renamed from: e */
    public String f5773e;

    /* renamed from: k */
    public final String f5779k;

    /* renamed from: o */
    public String f5783o;

    /* renamed from: p */
    public int f5784p;

    /* renamed from: q */
    public String f5785q;

    /* renamed from: r */
    public String f5786r;

    /* renamed from: s */
    public String f5787s;

    /* renamed from: v */
    public List<String> f5790v;

    /* renamed from: f */
    public boolean f5774f = true;

    /* renamed from: g */
    public final String f5775g = "com.tencent.bugly";

    /* renamed from: h */
    public String f5776h = "4.1.9.3";

    /* renamed from: i */
    public final String f5777i = "";

    /* renamed from: j */
    @Deprecated
    public final String f5778j = "";

    /* renamed from: l */
    public String f5780l = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: ab */
    private String f5747ab = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: ac */
    private String f5748ac = "";

    /* renamed from: m */
    public long f5781m = 0;

    /* renamed from: ad */
    private String f5749ad = null;

    /* renamed from: ae */
    private long f5750ae = -1;

    /* renamed from: af */
    private long f5751af = -1;

    /* renamed from: ag */
    private long f5752ag = -1;

    /* renamed from: ah */
    private String f5753ah = null;

    /* renamed from: ai */
    private String f5754ai = null;

    /* renamed from: ak */
    private Map<String, PlugInBean> f5756ak = null;

    /* renamed from: n */
    public boolean f5782n = false;

    /* renamed from: al */
    private String f5757al = null;

    /* renamed from: am */
    private Boolean f5758am = null;

    /* renamed from: an */
    private String f5759an = null;

    /* renamed from: t */
    public String f5788t = null;

    /* renamed from: u */
    public String f5789u = null;

    /* renamed from: ao */
    private Map<String, PlugInBean> f5760ao = null;

    /* renamed from: ap */
    private Map<String, PlugInBean> f5761ap = null;

    /* renamed from: w */
    public int f5791w = -1;

    /* renamed from: x */
    public int f5792x = -1;

    /* renamed from: ar */
    private final Map<String, String> f5762ar = new HashMap();

    /* renamed from: as */
    private final Map<String, String> f5763as = new HashMap();

    /* renamed from: at */
    private final Map<String, String> f5764at = new HashMap();

    /* renamed from: y */
    public String f5793y = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: z */
    public long f5794z = 0;

    /* renamed from: A */
    public long f5720A = 0;

    /* renamed from: B */
    public long f5721B = 0;

    /* renamed from: C */
    public long f5722C = 0;

    /* renamed from: I */
    public boolean f5728I = false;

    /* renamed from: K */
    public HashMap<String, String> f5730K = new HashMap<>();

    /* renamed from: L */
    public List<String> f5731L = new ArrayList();

    /* renamed from: M */
    public boolean f5732M = false;

    /* renamed from: N */
    public InterfaceC6726q f5733N = null;

    /* renamed from: Q */
    public boolean f5736Q = true;

    /* renamed from: R */
    public boolean f5737R = true;

    /* renamed from: S */
    public boolean f5738S = false;

    /* renamed from: au */
    private final Object f5765au = new Object();

    /* renamed from: T */
    public final Object f5739T = new Object();

    /* renamed from: av */
    private final Object f5766av = new Object();

    /* renamed from: aw */
    private final Object f5767aw = new Object();

    /* renamed from: U */
    public final Object f5740U = new Object();

    /* renamed from: V */
    public final Object f5741V = new Object();

    /* renamed from: ax */
    private final Object f5768ax = new Object();

    /* renamed from: ay */
    private final List<Integer> f5769ay = new ArrayList();

    /* renamed from: a */
    public final long f5745a = System.currentTimeMillis();

    /* renamed from: b */
    public final byte f5770b = 1;

    private C6663aa(Context context) {
        this.f5755aj = null;
        this.f5783o = null;
        this.f5785q = null;
        this.f5786r = null;
        this.f5787s = null;
        this.f5790v = null;
        this.f5723D = false;
        this.f5724E = null;
        this.f5725F = null;
        this.f5726G = null;
        this.f5727H = "";
        this.f5729J = false;
        this.f5742X = C6678ap.m5132a(context);
        PackageInfo packageInfoM5505b = C6735z.m5505b(context);
        if (packageInfoM5505b != null) {
            try {
                String str = packageInfoM5505b.versionName;
                this.f5783o = str;
                this.f5724E = str;
                this.f5725F = Integer.toString(packageInfoM5505b.versionCode);
            } catch (Throwable th) {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
            }
        }
        this.f5771c = C6735z.m5501a(context);
        this.f5772d = C6735z.m5500a(Process.myPid());
        this.f5785q = C6735z.m5506c(context);
        this.f5779k = "Android " + C6664ab.m5009b() + ",level " + C6664ab.m5010c();
        Map<String, String> mapM5507d = C6735z.m5507d(context);
        if (mapM5507d != null) {
            try {
                this.f5790v = C6735z.m5502a(mapM5507d);
                String str2 = mapM5507d.get("BUGLY_APPID");
                if (str2 != null) {
                    this.f5786r = str2;
                    m4977b("APP_ID", str2);
                }
                String str3 = mapM5507d.get("BUGLY_APP_VERSION");
                if (str3 != null) {
                    this.f5783o = str3;
                }
                String str4 = mapM5507d.get("BUGLY_APP_CHANNEL");
                if (str4 != null) {
                    this.f5787s = str4;
                }
                String str5 = mapM5507d.get("BUGLY_ENABLE_DEBUG");
                if (str5 != null) {
                    this.f5723D = str5.equalsIgnoreCase("true");
                }
                String str6 = mapM5507d.get("com.tencent.rdm.uuid");
                if (str6 != null) {
                    this.f5726G = str6;
                }
                String str7 = mapM5507d.get("BUGLY_APP_BUILD_NO");
                if (!TextUtils.isEmpty(str7)) {
                    this.f5784p = Integer.parseInt(str7);
                }
                String str8 = mapM5507d.get("BUGLY_AREA");
                if (str8 != null) {
                    this.f5727H = str8;
                }
            } catch (Throwable th2) {
                if (!C6674al.m5103a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.f5729J = true;
                C6674al.m5106c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th3) {
            if (C6725p.f6213c) {
                th3.printStackTrace();
            }
        }
        this.f5734O = C6678ap.m5133a("BUGLY_COMMON_VALUES", context);
        this.f5735P = C6678ap.m5133a("BUGLY_RESERVED_VALUES", context);
        this.f5755aj = C6664ab.m5007a(context);
        m4964E();
        C6674al.m5106c("com info create end", new Object[0]);
    }

    /* renamed from: B */
    public static int m4961B() {
        return C6664ab.m5010c();
    }

    @Deprecated
    /* renamed from: C */
    public static boolean m4962C() {
        C6674al.m5102a("Detect if the emulator is unavailable", new Object[0]);
        return false;
    }

    @Deprecated
    /* renamed from: D */
    public static boolean m4963D() {
        C6674al.m5102a("Detect if the device hook is unavailable", new Object[0]);
        return false;
    }

    /* renamed from: E */
    private void m4964E() {
        try {
            for (Map.Entry<String, ?> entry : this.f5735P.getAll().entrySet()) {
                C6674al.m5106c("put reserved request data from sp, key:%s value:%s", entry.getKey(), entry.getValue());
                m4968a(entry.getKey(), entry.getValue().toString(), false);
            }
            for (Map.Entry<String, String> entry2 : f5718W.entrySet()) {
                C6674al.m5106c("put reserved request data from cache, key:%s value:%s", entry2.getKey(), entry2.getValue());
                m4968a(entry2.getKey(), entry2.getValue(), true);
            }
            f5718W.clear();
        } catch (Throwable th) {
            C6674al.m5105b(th);
        }
    }

    /* renamed from: F */
    private String m4965F() {
        if (TextUtils.isEmpty(this.f5749ad)) {
            this.f5749ad = C6678ap.m5172d("androidid", null);
        }
        return this.f5749ad;
    }

    /* renamed from: G */
    private static String m4966G() {
        String string = UUID.randomUUID().toString();
        return !C6678ap.m5165b(string) ? string.replaceAll("-", "") : string;
    }

    /* renamed from: b */
    public static synchronized C6663aa m4969b() {
        return f5719aq;
    }

    @Deprecated
    /* renamed from: n */
    public static String m4970n() {
        return "";
    }

    /* renamed from: A */
    public final synchronized Map<String, PlugInBean> m4971A() {
        Map<String, PlugInBean> map;
        map = this.f5760ao;
        Map<String, PlugInBean> map2 = this.f5761ap;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* renamed from: a */
    public final boolean m4975a() {
        boolean z9 = this.f5769ay.size() > 0;
        C6674al.m5106c("isAppForeground:%s", Boolean.valueOf(z9));
        return z9;
    }

    /* renamed from: c */
    public final void m4978c() {
        synchronized (this.f5765au) {
            this.f5743Y = UUID.randomUUID().toString();
        }
    }

    /* renamed from: d */
    public final String m4980d() {
        String str;
        synchronized (this.f5765au) {
            try {
                if (this.f5743Y == null) {
                    m4978c();
                }
                str = this.f5743Y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: e */
    public final String m4982e() {
        return !C6678ap.m5165b(this.f5773e) ? this.f5773e : this.f5786r;
    }

    /* renamed from: f */
    public final String m4984f() {
        String str;
        synchronized (this.f5741V) {
            str = this.f5780l;
        }
        return str;
    }

    /* renamed from: g */
    public final String m4986g() {
        String str = this.f5746aa;
        if (str != null) {
            return str;
        }
        String strM5172d = C6678ap.m5172d("deviceId", null);
        this.f5746aa = strM5172d;
        if (strM5172d != null) {
            return strM5172d;
        }
        String strM4965F = m4965F();
        this.f5746aa = strM4965F;
        if (TextUtils.isEmpty(strM4965F)) {
            this.f5746aa = m4966G();
        }
        String str2 = this.f5746aa;
        if (str2 == null) {
            return "";
        }
        C6678ap.m5169c("deviceId", str2);
        return this.f5746aa;
    }

    /* renamed from: h */
    public final synchronized String m4988h() {
        String str = this.f5744Z;
        if (str != null) {
            return str;
        }
        String strM5172d = C6678ap.m5172d("deviceModel", null);
        this.f5744Z = strM5172d;
        if (strM5172d != null) {
            C6674al.m5106c("collect device model from sp:%s", strM5172d);
            return this.f5744Z;
        }
        if (!this.f5782n) {
            C6674al.m5106c("not allow collect device model", new Object[0]);
            return "fail";
        }
        String strM5006a = C6664ab.m5006a();
        this.f5744Z = strM5006a;
        C6674al.m5106c("collect device model:%s", strM5006a);
        C6678ap.m5169c("deviceModel", this.f5744Z);
        return this.f5744Z;
    }

    /* renamed from: i */
    public final synchronized String m4989i() {
        return this.f5748ac;
    }

    /* renamed from: j */
    public final long m4990j() {
        if (this.f5750ae <= 0) {
            this.f5750ae = C6664ab.m5013e();
        }
        return this.f5750ae;
    }

    /* renamed from: k */
    public final long m4991k() {
        if (this.f5751af <= 0) {
            this.f5751af = C6664ab.m5017i();
        }
        return this.f5751af;
    }

    /* renamed from: l */
    public final long m4992l() {
        if (this.f5752ag <= 0) {
            this.f5752ag = C6664ab.m5019k();
        }
        return this.f5752ag;
    }

    /* renamed from: m */
    public final String m4993m() {
        if (!TextUtils.isEmpty(this.f5754ai)) {
            C6674al.m5106c("get cpu type from so:%s", this.f5754ai);
            return this.f5754ai;
        }
        if (TextUtils.isEmpty(this.f5755aj)) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        C6674al.m5106c("get cpu type from lib dir:%s", this.f5755aj);
        return this.f5755aj;
    }

    /* renamed from: o */
    public final String m4994o() {
        try {
            Map<String, ?> all = this.f5742X.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.f5739T) {
                    try {
                    } catch (Throwable th) {
                        C6674al.m5103a(th);
                    } finally {
                    }
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        this.f5730K.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        } catch (Throwable th2) {
            C6674al.m5103a(th2);
        }
        if (this.f5730K.isEmpty()) {
            C6674al.m5106c("SDK_INFO is empty", new Object[0]);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.f5730K.entrySet()) {
            sb.append("[");
            sb.append(entry2.getKey());
            sb.append(",");
            sb.append(entry2.getValue());
            sb.append("] ");
        }
        C6674al.m5106c("SDK_INFO = %s", sb.toString());
        m4977b("SDK_INFO", sb.toString());
        return sb.toString();
    }

    /* renamed from: p */
    public final synchronized Map<String, PlugInBean> m4995p() {
        Map<String, PlugInBean> map = this.f5756ak;
        if (map != null && map.size() > 0) {
            HashMap map2 = new HashMap(this.f5756ak.size());
            map2.putAll(this.f5756ak);
            return map2;
        }
        return null;
    }

    /* renamed from: q */
    public final String m4996q() {
        if (this.f5757al == null) {
            this.f5757al = C6664ab.m5021m();
        }
        return this.f5757al;
    }

    /* renamed from: r */
    public final Boolean m4997r() {
        if (this.f5758am == null) {
            this.f5758am = Boolean.valueOf(C6664ab.m5025q());
        }
        return this.f5758am;
    }

    /* renamed from: s */
    public final String m4998s() {
        if (this.f5759an == null) {
            String str = C6664ab.m5022n();
            this.f5759an = str;
            C6674al.m5102a("ROM ID: %s", str);
        }
        return this.f5759an;
    }

    /* renamed from: t */
    public final Map<String, String> m4999t() {
        synchronized (this.f5766av) {
            try {
                if (this.f5762ar.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f5762ar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public final void m5000u() {
        synchronized (this.f5766av) {
            this.f5762ar.clear();
        }
    }

    /* renamed from: v */
    public final int m5001v() {
        int size;
        synchronized (this.f5766av) {
            size = this.f5762ar.size();
        }
        return size;
    }

    /* renamed from: w */
    public final Set<String> m5002w() {
        Set<String> setKeySet;
        synchronized (this.f5766av) {
            setKeySet = this.f5762ar.keySet();
        }
        return setKeySet;
    }

    /* renamed from: x */
    public final Map<String, String> m5003x() {
        synchronized (this.f5768ax) {
            try {
                if (this.f5763as.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f5763as);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final Map<String, String> m5004y() {
        synchronized (this.f5767aw) {
            try {
                if (this.f5764at.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f5764at);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final int m5005z() {
        int i9;
        synchronized (this.f5740U) {
            i9 = this.f5791w;
        }
        return i9;
    }

    /* renamed from: b */
    public final void m4976b(String str) {
        C6674al.m5102a("change deviceModel，old:%s new:%s", this.f5744Z, str);
        this.f5744Z = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C6678ap.m5169c("deviceModel", str);
    }

    /* renamed from: a */
    public final void m4972a(int i9, boolean z9) {
        C6674al.m5106c("setActivityForeState, hash:%s isFore:%s", Integer.valueOf(i9), Boolean.valueOf(z9));
        if (z9) {
            this.f5769ay.add(Integer.valueOf(i9));
        } else {
            this.f5769ay.remove(Integer.valueOf(i9));
            this.f5769ay.remove((Object) 0);
        }
        InterfaceC6726q interfaceC6726q = this.f5733N;
        if (interfaceC6726q != null) {
            interfaceC6726q.setNativeIsAppForeground(this.f5769ay.size() > 0);
        }
    }

    /* renamed from: c */
    public final synchronized void m4979c(String str) {
        this.f5747ab = String.valueOf(str);
    }

    /* renamed from: e */
    public final void m4983e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5754ai = str.trim();
    }

    /* renamed from: f */
    public final String m4985f(String str) {
        String strRemove;
        if (C6678ap.m5165b(str)) {
            C6674al.m5107d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f5766av) {
            strRemove = this.f5762ar.remove(str);
        }
        return strRemove;
    }

    /* renamed from: b */
    public final void m4977b(String str, String str2) {
        if (!C6678ap.m5165b(str) && !C6678ap.m5165b(str2)) {
            synchronized (this.f5767aw) {
                this.f5764at.put(str, str2);
            }
            return;
        }
        C6674al.m5107d("server key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: d */
    public final synchronized void m4981d(String str) {
        this.f5748ac = String.valueOf(str);
    }

    /* renamed from: a */
    public static synchronized C6663aa m4967a(Context context) {
        try {
            if (f5719aq == null) {
                f5719aq = new C6663aa(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5719aq;
    }

    /* renamed from: g */
    public final String m4987g(String str) {
        String str2;
        if (C6678ap.m5165b(str)) {
            C6674al.m5107d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f5766av) {
            str2 = this.f5762ar.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public final void m4973a(String str) {
        this.f5746aa = str;
        if (!TextUtils.isEmpty(str)) {
            C6678ap.m5169c("deviceId", str);
        }
        synchronized (this.f5768ax) {
            this.f5763as.put("E8", str);
        }
    }

    /* renamed from: a */
    public final void m4974a(String str, String str2) {
        if (!C6678ap.m5165b(str) && !C6678ap.m5165b(str2)) {
            synchronized (this.f5766av) {
                this.f5762ar.put(str, str2);
            }
            return;
        }
        C6674al.m5107d("key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: a */
    private void m4968a(String str, String str2, boolean z9) {
        if (C6678ap.m5165b(str)) {
            C6674al.m5107d("key should not be empty %s", str);
            return;
        }
        C6674al.m5106c("putExtraRequestData key:%s value:%s save:%s", str, str2, Boolean.valueOf(z9));
        synchronized (this.f5768ax) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.f5763as.remove(str);
                    this.f5735P.edit().remove(str).apply();
                } else {
                    this.f5763as.put(str, str2);
                    if (z9) {
                        this.f5735P.edit().putString(str, str2).apply();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

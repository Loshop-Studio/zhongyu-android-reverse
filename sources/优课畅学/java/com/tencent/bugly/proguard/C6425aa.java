package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.tencent.bugly.proguard.aa */
/* loaded from: classes4.dex */
public final class C6425aa {

    /* renamed from: W */
    private static final Map<String, String> f4484W = new HashMap();

    /* renamed from: aq */
    private static C6425aa f4485aq = null;

    /* renamed from: D */
    public boolean f4489D;

    /* renamed from: E */
    public String f4490E;

    /* renamed from: F */
    public String f4491F;

    /* renamed from: G */
    public String f4492G;

    /* renamed from: H */
    public String f4493H;

    /* renamed from: J */
    public boolean f4495J;

    /* renamed from: O */
    public final SharedPreferences f4500O;

    /* renamed from: P */
    public final SharedPreferences f4501P;

    /* renamed from: X */
    private final Context f4508X;

    /* renamed from: Y */
    private String f4509Y;

    /* renamed from: Z */
    private String f4510Z;

    /* renamed from: aa */
    private String f4512aa;

    /* renamed from: aj */
    private String f4521aj;

    /* renamed from: c */
    public String f4537c;

    /* renamed from: d */
    public final String f4538d;

    /* renamed from: e */
    public String f4539e;

    /* renamed from: k */
    public final String f4545k;

    /* renamed from: o */
    public String f4549o;

    /* renamed from: p */
    public int f4550p;

    /* renamed from: q */
    public String f4551q;

    /* renamed from: r */
    public String f4552r;

    /* renamed from: s */
    public String f4553s;

    /* renamed from: v */
    public List<String> f4556v;

    /* renamed from: f */
    public boolean f4540f = true;

    /* renamed from: g */
    public final String f4541g = "com.tencent.bugly";

    /* renamed from: h */
    public String f4542h = "4.1.9.3";

    /* renamed from: i */
    public final String f4543i = "";

    /* renamed from: j */
    @Deprecated
    public final String f4544j = "";

    /* renamed from: l */
    public String f4546l = "unknown";

    /* renamed from: ab */
    private String f4513ab = "unknown";

    /* renamed from: ac */
    private String f4514ac = "";

    /* renamed from: m */
    public long f4547m = 0;

    /* renamed from: ad */
    private String f4515ad = null;

    /* renamed from: ae */
    private long f4516ae = -1;

    /* renamed from: af */
    private long f4517af = -1;

    /* renamed from: ag */
    private long f4518ag = -1;

    /* renamed from: ah */
    private String f4519ah = null;

    /* renamed from: ai */
    private String f4520ai = null;

    /* renamed from: ak */
    private Map<String, PlugInBean> f4522ak = null;

    /* renamed from: n */
    public boolean f4548n = false;

    /* renamed from: al */
    private String f4523al = null;

    /* renamed from: am */
    private Boolean f4524am = null;

    /* renamed from: an */
    private String f4525an = null;

    /* renamed from: t */
    public String f4554t = null;

    /* renamed from: u */
    public String f4555u = null;

    /* renamed from: ao */
    private Map<String, PlugInBean> f4526ao = null;

    /* renamed from: ap */
    private Map<String, PlugInBean> f4527ap = null;

    /* renamed from: w */
    public int f4557w = -1;

    /* renamed from: x */
    public int f4558x = -1;

    /* renamed from: ar */
    private final Map<String, String> f4528ar = new HashMap();

    /* renamed from: as */
    private final Map<String, String> f4529as = new HashMap();

    /* renamed from: at */
    private final Map<String, String> f4530at = new HashMap();

    /* renamed from: y */
    public String f4559y = "unknown";

    /* renamed from: z */
    public long f4560z = 0;

    /* renamed from: A */
    public long f4486A = 0;

    /* renamed from: B */
    public long f4487B = 0;

    /* renamed from: C */
    public long f4488C = 0;

    /* renamed from: I */
    public boolean f4494I = false;

    /* renamed from: K */
    public HashMap<String, String> f4496K = new HashMap<>();

    /* renamed from: L */
    public List<String> f4497L = new ArrayList();

    /* renamed from: M */
    public boolean f4498M = false;

    /* renamed from: N */
    public InterfaceC6488q f4499N = null;

    /* renamed from: Q */
    public boolean f4502Q = true;

    /* renamed from: R */
    public boolean f4503R = true;

    /* renamed from: S */
    public boolean f4504S = false;

    /* renamed from: au */
    private final Object f4531au = new Object();

    /* renamed from: T */
    public final Object f4505T = new Object();

    /* renamed from: av */
    private final Object f4532av = new Object();

    /* renamed from: aw */
    private final Object f4533aw = new Object();

    /* renamed from: U */
    public final Object f4506U = new Object();

    /* renamed from: V */
    public final Object f4507V = new Object();

    /* renamed from: ax */
    private final Object f4534ax = new Object();

    /* renamed from: ay */
    private final List<Integer> f4535ay = new ArrayList();

    /* renamed from: a */
    public final long f4511a = System.currentTimeMillis();

    /* renamed from: b */
    public final byte f4536b = 1;

    private C6425aa(Context context) {
        this.f4521aj = null;
        this.f4549o = null;
        this.f4551q = null;
        this.f4552r = null;
        this.f4553s = null;
        this.f4556v = null;
        this.f4489D = false;
        this.f4490E = null;
        this.f4491F = null;
        this.f4492G = null;
        this.f4493H = "";
        this.f4495J = false;
        this.f4508X = C6440ap.m4313a(context);
        PackageInfo packageInfoM4686b = C6497z.m4686b(context);
        if (packageInfoM4686b != null) {
            try {
                String str = packageInfoM4686b.versionName;
                this.f4549o = str;
                this.f4490E = str;
                this.f4491F = Integer.toString(packageInfoM4686b.versionCode);
            } catch (Throwable th) {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
            }
        }
        this.f4537c = C6497z.m4682a(context);
        this.f4538d = C6497z.m4681a(Process.myPid());
        this.f4551q = C6497z.m4687c(context);
        this.f4545k = "Android " + C6426ab.m4190b() + ",level " + C6426ab.m4191c();
        Map<String, String> mapM4688d = C6497z.m4688d(context);
        if (mapM4688d != null) {
            try {
                this.f4556v = C6497z.m4683a(mapM4688d);
                String str2 = mapM4688d.get("BUGLY_APPID");
                if (str2 != null) {
                    this.f4552r = str2;
                    m4158b("APP_ID", str2);
                }
                String str3 = mapM4688d.get("BUGLY_APP_VERSION");
                if (str3 != null) {
                    this.f4549o = str3;
                }
                String str4 = mapM4688d.get("BUGLY_APP_CHANNEL");
                if (str4 != null) {
                    this.f4553s = str4;
                }
                String str5 = mapM4688d.get("BUGLY_ENABLE_DEBUG");
                if (str5 != null) {
                    this.f4489D = str5.equalsIgnoreCase("true");
                }
                String str6 = mapM4688d.get("com.tencent.rdm.uuid");
                if (str6 != null) {
                    this.f4492G = str6;
                }
                String str7 = mapM4688d.get("BUGLY_APP_BUILD_NO");
                if (!TextUtils.isEmpty(str7)) {
                    this.f4550p = Integer.parseInt(str7);
                }
                String str8 = mapM4688d.get("BUGLY_AREA");
                if (str8 != null) {
                    this.f4493H = str8;
                }
            } catch (Throwable th2) {
                if (!C6436al.m4284a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.f4495J = true;
                C6436al.m4287c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th3) {
            if (C6487p.f4979c) {
                th3.printStackTrace();
            }
        }
        this.f4500O = C6440ap.m4314a("BUGLY_COMMON_VALUES", context);
        this.f4501P = C6440ap.m4314a("BUGLY_RESERVED_VALUES", context);
        this.f4521aj = C6426ab.m4188a(context);
        m4145E();
        C6436al.m4287c("com info create end", new Object[0]);
    }

    /* renamed from: B */
    public static int m4142B() {
        return C6426ab.m4191c();
    }

    @Deprecated
    /* renamed from: C */
    public static boolean m4143C() {
        C6436al.m4283a("Detect if the emulator is unavailable", new Object[0]);
        return false;
    }

    @Deprecated
    /* renamed from: D */
    public static boolean m4144D() {
        C6436al.m4283a("Detect if the device hook is unavailable", new Object[0]);
        return false;
    }

    /* renamed from: E */
    private void m4145E() {
        try {
            for (Map.Entry<String, ?> entry : this.f4501P.getAll().entrySet()) {
                C6436al.m4287c("put reserved request data from sp, key:%s value:%s", entry.getKey(), entry.getValue());
                m4149a(entry.getKey(), entry.getValue().toString(), false);
            }
            for (Map.Entry<String, String> entry2 : f4484W.entrySet()) {
                C6436al.m4287c("put reserved request data from cache, key:%s value:%s", entry2.getKey(), entry2.getValue());
                m4149a(entry2.getKey(), entry2.getValue(), true);
            }
            f4484W.clear();
        } catch (Throwable th) {
            C6436al.m4286b(th);
        }
    }

    /* renamed from: F */
    private String m4146F() {
        if (TextUtils.isEmpty(this.f4515ad)) {
            this.f4515ad = C6440ap.m4353d("androidid", null);
        }
        return this.f4515ad;
    }

    /* renamed from: G */
    private static String m4147G() {
        String string = UUID.randomUUID().toString();
        return !C6440ap.m4346b(string) ? string.replaceAll("-", "") : string;
    }

    /* renamed from: b */
    public static synchronized C6425aa m4150b() {
        return f4485aq;
    }

    @Deprecated
    /* renamed from: n */
    public static String m4151n() {
        return "";
    }

    /* renamed from: A */
    public final synchronized Map<String, PlugInBean> m4152A() {
        Map<String, PlugInBean> map;
        map = this.f4526ao;
        Map<String, PlugInBean> map2 = this.f4527ap;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* renamed from: a */
    public final boolean m4156a() {
        boolean z10 = this.f4535ay.size() > 0;
        C6436al.m4287c("isAppForeground:%s", Boolean.valueOf(z10));
        return z10;
    }

    /* renamed from: c */
    public final void m4159c() {
        synchronized (this.f4531au) {
            this.f4509Y = UUID.randomUUID().toString();
        }
    }

    /* renamed from: d */
    public final String m4161d() {
        String str;
        synchronized (this.f4531au) {
            try {
                if (this.f4509Y == null) {
                    m4159c();
                }
                str = this.f4509Y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: e */
    public final String m4163e() {
        return !C6440ap.m4346b(this.f4539e) ? this.f4539e : this.f4552r;
    }

    /* renamed from: f */
    public final String m4165f() {
        String str;
        synchronized (this.f4507V) {
            str = this.f4546l;
        }
        return str;
    }

    /* renamed from: g */
    public final String m4167g() {
        String str = this.f4512aa;
        if (str != null) {
            return str;
        }
        String strM4353d = C6440ap.m4353d("deviceId", null);
        this.f4512aa = strM4353d;
        if (strM4353d != null) {
            return strM4353d;
        }
        String strM4146F = m4146F();
        this.f4512aa = strM4146F;
        if (TextUtils.isEmpty(strM4146F)) {
            this.f4512aa = m4147G();
        }
        String str2 = this.f4512aa;
        if (str2 == null) {
            return "";
        }
        C6440ap.m4350c("deviceId", str2);
        return this.f4512aa;
    }

    /* renamed from: h */
    public final synchronized String m4169h() {
        String str = this.f4510Z;
        if (str != null) {
            return str;
        }
        String strM4353d = C6440ap.m4353d("deviceModel", null);
        this.f4510Z = strM4353d;
        if (strM4353d != null) {
            C6436al.m4287c("collect device model from sp:%s", strM4353d);
            return this.f4510Z;
        }
        if (!this.f4548n) {
            C6436al.m4287c("not allow collect device model", new Object[0]);
            return "fail";
        }
        String strM4187a = C6426ab.m4187a();
        this.f4510Z = strM4187a;
        C6436al.m4287c("collect device model:%s", strM4187a);
        C6440ap.m4350c("deviceModel", this.f4510Z);
        return this.f4510Z;
    }

    /* renamed from: i */
    public final synchronized String m4170i() {
        return this.f4514ac;
    }

    /* renamed from: j */
    public final long m4171j() {
        if (this.f4516ae <= 0) {
            this.f4516ae = C6426ab.m4194e();
        }
        return this.f4516ae;
    }

    /* renamed from: k */
    public final long m4172k() {
        if (this.f4517af <= 0) {
            this.f4517af = C6426ab.m4198i();
        }
        return this.f4517af;
    }

    /* renamed from: l */
    public final long m4173l() {
        if (this.f4518ag <= 0) {
            this.f4518ag = C6426ab.m4200k();
        }
        return this.f4518ag;
    }

    /* renamed from: m */
    public final String m4174m() {
        if (!TextUtils.isEmpty(this.f4520ai)) {
            C6436al.m4287c("get cpu type from so:%s", this.f4520ai);
            return this.f4520ai;
        }
        if (TextUtils.isEmpty(this.f4521aj)) {
            return "unknown";
        }
        C6436al.m4287c("get cpu type from lib dir:%s", this.f4521aj);
        return this.f4521aj;
    }

    /* renamed from: o */
    public final String m4175o() {
        try {
            Map<String, ?> all = this.f4508X.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.f4505T) {
                    try {
                    } catch (Throwable th) {
                        C6436al.m4284a(th);
                    } finally {
                    }
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        this.f4496K.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        } catch (Throwable th2) {
            C6436al.m4284a(th2);
        }
        if (this.f4496K.isEmpty()) {
            C6436al.m4287c("SDK_INFO is empty", new Object[0]);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.f4496K.entrySet()) {
            sb.append("[");
            sb.append(entry2.getKey());
            sb.append(",");
            sb.append(entry2.getValue());
            sb.append("] ");
        }
        C6436al.m4287c("SDK_INFO = %s", sb.toString());
        m4158b("SDK_INFO", sb.toString());
        return sb.toString();
    }

    /* renamed from: p */
    public final synchronized Map<String, PlugInBean> m4176p() {
        Map<String, PlugInBean> map = this.f4522ak;
        if (map != null && map.size() > 0) {
            HashMap map2 = new HashMap(this.f4522ak.size());
            map2.putAll(this.f4522ak);
            return map2;
        }
        return null;
    }

    /* renamed from: q */
    public final String m4177q() {
        if (this.f4523al == null) {
            this.f4523al = C6426ab.m4202m();
        }
        return this.f4523al;
    }

    /* renamed from: r */
    public final Boolean m4178r() {
        if (this.f4524am == null) {
            this.f4524am = Boolean.valueOf(C6426ab.m4206q());
        }
        return this.f4524am;
    }

    /* renamed from: s */
    public final String m4179s() {
        if (this.f4525an == null) {
            String str = C6426ab.m4203n();
            this.f4525an = str;
            C6436al.m4283a("ROM ID: %s", str);
        }
        return this.f4525an;
    }

    /* renamed from: t */
    public final Map<String, String> m4180t() {
        synchronized (this.f4532av) {
            try {
                if (this.f4528ar.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f4528ar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public final void m4181u() {
        synchronized (this.f4532av) {
            this.f4528ar.clear();
        }
    }

    /* renamed from: v */
    public final int m4182v() {
        int size;
        synchronized (this.f4532av) {
            size = this.f4528ar.size();
        }
        return size;
    }

    /* renamed from: w */
    public final Set<String> m4183w() {
        Set<String> setKeySet;
        synchronized (this.f4532av) {
            setKeySet = this.f4528ar.keySet();
        }
        return setKeySet;
    }

    /* renamed from: x */
    public final Map<String, String> m4184x() {
        synchronized (this.f4534ax) {
            try {
                if (this.f4529as.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f4529as);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final Map<String, String> m4185y() {
        synchronized (this.f4533aw) {
            try {
                if (this.f4530at.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f4530at);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final int m4186z() {
        int i10;
        synchronized (this.f4506U) {
            i10 = this.f4557w;
        }
        return i10;
    }

    /* renamed from: b */
    public final void m4157b(String str) {
        C6436al.m4283a("change deviceModel，old:%s new:%s", this.f4510Z, str);
        this.f4510Z = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C6440ap.m4350c("deviceModel", str);
    }

    /* renamed from: a */
    public final void m4153a(int i10, boolean z10) {
        C6436al.m4287c("setActivityForeState, hash:%s isFore:%s", Integer.valueOf(i10), Boolean.valueOf(z10));
        if (z10) {
            this.f4535ay.add(Integer.valueOf(i10));
        } else {
            this.f4535ay.remove(Integer.valueOf(i10));
            this.f4535ay.remove((Object) 0);
        }
        InterfaceC6488q interfaceC6488q = this.f4499N;
        if (interfaceC6488q != null) {
            interfaceC6488q.setNativeIsAppForeground(this.f4535ay.size() > 0);
        }
    }

    /* renamed from: c */
    public final synchronized void m4160c(String str) {
        this.f4513ab = String.valueOf(str);
    }

    /* renamed from: e */
    public final void m4164e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f4520ai = str.trim();
    }

    /* renamed from: f */
    public final String m4166f(String str) {
        String strRemove;
        if (C6440ap.m4346b(str)) {
            C6436al.m4288d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f4532av) {
            strRemove = this.f4528ar.remove(str);
        }
        return strRemove;
    }

    /* renamed from: b */
    public final void m4158b(String str, String str2) {
        if (!C6440ap.m4346b(str) && !C6440ap.m4346b(str2)) {
            synchronized (this.f4533aw) {
                this.f4530at.put(str, str2);
            }
            return;
        }
        C6436al.m4288d("server key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: d */
    public final synchronized void m4162d(String str) {
        this.f4514ac = String.valueOf(str);
    }

    /* renamed from: a */
    public static synchronized C6425aa m4148a(Context context) {
        try {
            if (f4485aq == null) {
                f4485aq = new C6425aa(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4485aq;
    }

    /* renamed from: g */
    public final String m4168g(String str) {
        String str2;
        if (C6440ap.m4346b(str)) {
            C6436al.m4288d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f4532av) {
            str2 = this.f4528ar.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public final void m4154a(String str) {
        this.f4512aa = str;
        if (!TextUtils.isEmpty(str)) {
            C6440ap.m4350c("deviceId", str);
        }
        synchronized (this.f4534ax) {
            this.f4529as.put("E8", str);
        }
    }

    /* renamed from: a */
    public final void m4155a(String str, String str2) {
        if (!C6440ap.m4346b(str) && !C6440ap.m4346b(str2)) {
            synchronized (this.f4532av) {
                this.f4528ar.put(str, str2);
            }
            return;
        }
        C6436al.m4288d("key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: a */
    private void m4149a(String str, String str2, boolean z10) {
        if (C6440ap.m4346b(str)) {
            C6436al.m4288d("key should not be empty %s", str);
            return;
        }
        C6436al.m4287c("putExtraRequestData key:%s value:%s save:%s", str, str2, Boolean.valueOf(z10));
        synchronized (this.f4534ax) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.f4529as.remove(str);
                    this.f4501P.edit().remove(str).apply();
                } else {
                    this.f4529as.put(str, str2);
                    if (z10) {
                        this.f4501P.edit().putString(str, str2).apply();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

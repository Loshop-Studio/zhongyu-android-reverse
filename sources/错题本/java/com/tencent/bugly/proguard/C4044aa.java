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
/* loaded from: classes3.dex */
public final class C4044aa {

    /* renamed from: W */
    private static final Map<String, String> f3380W = new HashMap();

    /* renamed from: aq */
    private static C4044aa f3381aq = null;

    /* renamed from: D */
    public boolean f3385D;

    /* renamed from: E */
    public String f3386E;

    /* renamed from: F */
    public String f3387F;

    /* renamed from: G */
    public String f3388G;

    /* renamed from: H */
    public String f3389H;

    /* renamed from: J */
    public boolean f3391J;

    /* renamed from: O */
    public final SharedPreferences f3396O;

    /* renamed from: P */
    public final SharedPreferences f3397P;

    /* renamed from: X */
    private final Context f3404X;

    /* renamed from: Y */
    private String f3405Y;

    /* renamed from: Z */
    private String f3406Z;

    /* renamed from: aa */
    private String f3408aa;

    /* renamed from: aj */
    private String f3417aj;

    /* renamed from: c */
    public String f3433c;

    /* renamed from: d */
    public final String f3434d;

    /* renamed from: e */
    public String f3435e;

    /* renamed from: k */
    public final String f3441k;

    /* renamed from: o */
    public String f3445o;

    /* renamed from: p */
    public int f3446p;

    /* renamed from: q */
    public String f3447q;

    /* renamed from: r */
    public String f3448r;

    /* renamed from: s */
    public String f3449s;

    /* renamed from: v */
    public List<String> f3452v;

    /* renamed from: f */
    public boolean f3436f = true;

    /* renamed from: g */
    public final String f3437g = "com.tencent.bugly";

    /* renamed from: h */
    public String f3438h = "4.1.9.3";

    /* renamed from: i */
    public final String f3439i = "";

    /* renamed from: j */
    @Deprecated
    public final String f3440j = "";

    /* renamed from: l */
    public String f3442l = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: ab */
    private String f3409ab = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: ac */
    private String f3410ac = "";

    /* renamed from: m */
    public long f3443m = 0;

    /* renamed from: ad */
    private String f3411ad = null;

    /* renamed from: ae */
    private long f3412ae = -1;

    /* renamed from: af */
    private long f3413af = -1;

    /* renamed from: ag */
    private long f3414ag = -1;

    /* renamed from: ah */
    private String f3415ah = null;

    /* renamed from: ai */
    private String f3416ai = null;

    /* renamed from: ak */
    private Map<String, PlugInBean> f3418ak = null;

    /* renamed from: n */
    public boolean f3444n = false;

    /* renamed from: al */
    private String f3419al = null;

    /* renamed from: am */
    private Boolean f3420am = null;

    /* renamed from: an */
    private String f3421an = null;

    /* renamed from: t */
    public String f3450t = null;

    /* renamed from: u */
    public String f3451u = null;

    /* renamed from: ao */
    private Map<String, PlugInBean> f3422ao = null;

    /* renamed from: ap */
    private Map<String, PlugInBean> f3423ap = null;

    /* renamed from: w */
    public int f3453w = -1;

    /* renamed from: x */
    public int f3454x = -1;

    /* renamed from: ar */
    private final Map<String, String> f3424ar = new HashMap();

    /* renamed from: as */
    private final Map<String, String> f3425as = new HashMap();

    /* renamed from: at */
    private final Map<String, String> f3426at = new HashMap();

    /* renamed from: y */
    public String f3455y = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: z */
    public long f3456z = 0;

    /* renamed from: A */
    public long f3382A = 0;

    /* renamed from: B */
    public long f3383B = 0;

    /* renamed from: C */
    public long f3384C = 0;

    /* renamed from: I */
    public boolean f3390I = false;

    /* renamed from: K */
    public HashMap<String, String> f3392K = new HashMap<>();

    /* renamed from: L */
    public List<String> f3393L = new ArrayList();

    /* renamed from: M */
    public boolean f3394M = false;

    /* renamed from: N */
    public InterfaceC4131q f3395N = null;

    /* renamed from: Q */
    public boolean f3398Q = true;

    /* renamed from: R */
    public boolean f3399R = true;

    /* renamed from: S */
    public boolean f3400S = false;

    /* renamed from: au */
    private final Object f3427au = new Object();

    /* renamed from: T */
    public final Object f3401T = new Object();

    /* renamed from: av */
    private final Object f3428av = new Object();

    /* renamed from: aw */
    private final Object f3429aw = new Object();

    /* renamed from: U */
    public final Object f3402U = new Object();

    /* renamed from: V */
    public final Object f3403V = new Object();

    /* renamed from: ax */
    private final Object f3430ax = new Object();

    /* renamed from: ay */
    private final List<Integer> f3431ay = new ArrayList();

    /* renamed from: a */
    public final long f3407a = System.currentTimeMillis();

    /* renamed from: b */
    public final byte f3432b = 1;

    private C4044aa(Context context) {
        this.f3417aj = null;
        this.f3445o = null;
        this.f3447q = null;
        this.f3448r = null;
        this.f3449s = null;
        this.f3452v = null;
        this.f3385D = false;
        this.f3386E = null;
        this.f3387F = null;
        this.f3388G = null;
        this.f3389H = "";
        this.f3391J = false;
        this.f3404X = C4059ap.m3051a(context);
        PackageInfo packageInfoM3422b = C4149z.m3422b(context);
        if (packageInfoM3422b != null) {
            try {
                String str = packageInfoM3422b.versionName;
                this.f3445o = str;
                this.f3386E = str;
                this.f3387F = Integer.toString(packageInfoM3422b.versionCode);
            } catch (Throwable th) {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
            }
        }
        this.f3433c = C4149z.m3418a(context);
        this.f3434d = C4149z.m3417a(Process.myPid());
        this.f3447q = C4149z.m3423c(context);
        this.f3441k = "Android " + C4045ab.m2930b() + ",level " + C4045ab.m2931c();
        Map<String, String> mapM3424d = C4149z.m3424d(context);
        if (mapM3424d != null) {
            try {
                this.f3452v = C4149z.m3419a(mapM3424d);
                String str2 = mapM3424d.get("BUGLY_APPID");
                if (str2 != null) {
                    this.f3448r = str2;
                    m2898b("APP_ID", str2);
                }
                String str3 = mapM3424d.get("BUGLY_APP_VERSION");
                if (str3 != null) {
                    this.f3445o = str3;
                }
                String str4 = mapM3424d.get("BUGLY_APP_CHANNEL");
                if (str4 != null) {
                    this.f3449s = str4;
                }
                String str5 = mapM3424d.get("BUGLY_ENABLE_DEBUG");
                if (str5 != null) {
                    this.f3385D = str5.equalsIgnoreCase("true");
                }
                String str6 = mapM3424d.get("com.tencent.rdm.uuid");
                if (str6 != null) {
                    this.f3388G = str6;
                }
                String str7 = mapM3424d.get("BUGLY_APP_BUILD_NO");
                if (!TextUtils.isEmpty(str7)) {
                    this.f3446p = Integer.parseInt(str7);
                }
                String str8 = mapM3424d.get("BUGLY_AREA");
                if (str8 != null) {
                    this.f3389H = str8;
                }
            } catch (Throwable th2) {
                if (!C4055al.m3022a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.f3391J = true;
                C4055al.m3025c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th3) {
            if (C4129p.f3864c) {
                th3.printStackTrace();
            }
        }
        this.f3396O = C4059ap.m3052a("BUGLY_COMMON_VALUES", context);
        this.f3397P = C4059ap.m3052a("BUGLY_RESERVED_VALUES", context);
        this.f3417aj = C4045ab.m2928a(context);
        m2885E();
        C4055al.m3025c("com info create end", new Object[0]);
    }

    /* renamed from: B */
    public static int m2882B() {
        return C4045ab.m2931c();
    }

    @Deprecated
    /* renamed from: C */
    public static boolean m2883C() {
        C4055al.m3021a("Detect if the emulator is unavailable", new Object[0]);
        return false;
    }

    @Deprecated
    /* renamed from: D */
    public static boolean m2884D() {
        C4055al.m3021a("Detect if the device hook is unavailable", new Object[0]);
        return false;
    }

    /* renamed from: E */
    private void m2885E() {
        try {
            for (Map.Entry<String, ?> entry : this.f3397P.getAll().entrySet()) {
                C4055al.m3025c("put reserved request data from sp, key:%s value:%s", entry.getKey(), entry.getValue());
                m2889a(entry.getKey(), entry.getValue().toString(), false);
            }
            for (Map.Entry<String, String> entry2 : f3380W.entrySet()) {
                C4055al.m3025c("put reserved request data from cache, key:%s value:%s", entry2.getKey(), entry2.getValue());
                m2889a(entry2.getKey(), entry2.getValue(), true);
            }
            f3380W.clear();
        } catch (Throwable th) {
            C4055al.m3024b(th);
        }
    }

    /* renamed from: F */
    private String m2886F() {
        if (TextUtils.isEmpty(this.f3411ad)) {
            this.f3411ad = C4059ap.m3091d("androidid", null);
        }
        return this.f3411ad;
    }

    /* renamed from: G */
    private static String m2887G() {
        String string = UUID.randomUUID().toString();
        return !C4059ap.m3084b(string) ? string.replaceAll("-", "") : string;
    }

    /* renamed from: b */
    public static synchronized C4044aa m2890b() {
        return f3381aq;
    }

    @Deprecated
    /* renamed from: n */
    public static String m2891n() {
        return "";
    }

    /* renamed from: A */
    public final synchronized Map<String, PlugInBean> m2892A() {
        Map<String, PlugInBean> map;
        map = this.f3422ao;
        Map<String, PlugInBean> map2 = this.f3423ap;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* renamed from: a */
    public final boolean m2896a() {
        boolean z8 = this.f3431ay.size() > 0;
        C4055al.m3025c("isAppForeground:%s", Boolean.valueOf(z8));
        return z8;
    }

    /* renamed from: c */
    public final void m2899c() {
        synchronized (this.f3427au) {
            this.f3405Y = UUID.randomUUID().toString();
        }
    }

    /* renamed from: d */
    public final String m2901d() {
        String str;
        synchronized (this.f3427au) {
            try {
                if (this.f3405Y == null) {
                    m2899c();
                }
                str = this.f3405Y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: e */
    public final String m2903e() {
        return !C4059ap.m3084b(this.f3435e) ? this.f3435e : this.f3448r;
    }

    /* renamed from: f */
    public final String m2905f() {
        String str;
        synchronized (this.f3403V) {
            str = this.f3442l;
        }
        return str;
    }

    /* renamed from: g */
    public final String m2907g() {
        String str = this.f3408aa;
        if (str != null) {
            return str;
        }
        String strM3091d = C4059ap.m3091d("deviceId", null);
        this.f3408aa = strM3091d;
        if (strM3091d != null) {
            return strM3091d;
        }
        String strM2886F = m2886F();
        this.f3408aa = strM2886F;
        if (TextUtils.isEmpty(strM2886F)) {
            this.f3408aa = m2887G();
        }
        String str2 = this.f3408aa;
        if (str2 == null) {
            return "";
        }
        C4059ap.m3088c("deviceId", str2);
        return this.f3408aa;
    }

    /* renamed from: h */
    public final synchronized String m2909h() {
        String str = this.f3406Z;
        if (str != null) {
            return str;
        }
        String strM3091d = C4059ap.m3091d("deviceModel", null);
        this.f3406Z = strM3091d;
        if (strM3091d != null) {
            C4055al.m3025c("collect device model from sp:%s", strM3091d);
            return this.f3406Z;
        }
        if (!this.f3444n) {
            C4055al.m3025c("not allow collect device model", new Object[0]);
            return "fail";
        }
        String strM2927a = C4045ab.m2927a();
        this.f3406Z = strM2927a;
        C4055al.m3025c("collect device model:%s", strM2927a);
        C4059ap.m3088c("deviceModel", this.f3406Z);
        return this.f3406Z;
    }

    /* renamed from: i */
    public final synchronized String m2910i() {
        return this.f3410ac;
    }

    /* renamed from: j */
    public final long m2911j() {
        if (this.f3412ae <= 0) {
            this.f3412ae = C4045ab.m2934e();
        }
        return this.f3412ae;
    }

    /* renamed from: k */
    public final long m2912k() {
        if (this.f3413af <= 0) {
            this.f3413af = C4045ab.m2938i();
        }
        return this.f3413af;
    }

    /* renamed from: l */
    public final long m2913l() {
        if (this.f3414ag <= 0) {
            this.f3414ag = C4045ab.m2940k();
        }
        return this.f3414ag;
    }

    /* renamed from: m */
    public final String m2914m() {
        if (!TextUtils.isEmpty(this.f3416ai)) {
            C4055al.m3025c("get cpu type from so:%s", this.f3416ai);
            return this.f3416ai;
        }
        if (TextUtils.isEmpty(this.f3417aj)) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        C4055al.m3025c("get cpu type from lib dir:%s", this.f3417aj);
        return this.f3417aj;
    }

    /* renamed from: o */
    public final String m2915o() {
        try {
            Map<String, ?> all = this.f3404X.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.f3401T) {
                    try {
                    } catch (Throwable th) {
                        C4055al.m3022a(th);
                    } finally {
                    }
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        this.f3392K.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        } catch (Throwable th2) {
            C4055al.m3022a(th2);
        }
        if (this.f3392K.isEmpty()) {
            C4055al.m3025c("SDK_INFO is empty", new Object[0]);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.f3392K.entrySet()) {
            sb.append("[");
            sb.append(entry2.getKey());
            sb.append(",");
            sb.append(entry2.getValue());
            sb.append("] ");
        }
        C4055al.m3025c("SDK_INFO = %s", sb.toString());
        m2898b("SDK_INFO", sb.toString());
        return sb.toString();
    }

    /* renamed from: p */
    public final synchronized Map<String, PlugInBean> m2916p() {
        Map<String, PlugInBean> map = this.f3418ak;
        if (map != null && map.size() > 0) {
            HashMap map2 = new HashMap(this.f3418ak.size());
            map2.putAll(this.f3418ak);
            return map2;
        }
        return null;
    }

    /* renamed from: q */
    public final String m2917q() {
        if (this.f3419al == null) {
            this.f3419al = C4045ab.m2942m();
        }
        return this.f3419al;
    }

    /* renamed from: r */
    public final Boolean m2918r() {
        if (this.f3420am == null) {
            this.f3420am = Boolean.valueOf(C4045ab.m2946q());
        }
        return this.f3420am;
    }

    /* renamed from: s */
    public final String m2919s() {
        if (this.f3421an == null) {
            String str = C4045ab.m2943n();
            this.f3421an = str;
            C4055al.m3021a("ROM ID: %s", str);
        }
        return this.f3421an;
    }

    /* renamed from: t */
    public final Map<String, String> m2920t() {
        synchronized (this.f3428av) {
            try {
                if (this.f3424ar.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f3424ar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public final void m2921u() {
        synchronized (this.f3428av) {
            this.f3424ar.clear();
        }
    }

    /* renamed from: v */
    public final int m2922v() {
        int size;
        synchronized (this.f3428av) {
            size = this.f3424ar.size();
        }
        return size;
    }

    /* renamed from: w */
    public final Set<String> m2923w() {
        Set<String> setKeySet;
        synchronized (this.f3428av) {
            setKeySet = this.f3424ar.keySet();
        }
        return setKeySet;
    }

    /* renamed from: x */
    public final Map<String, String> m2924x() {
        synchronized (this.f3430ax) {
            try {
                if (this.f3425as.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f3425as);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final Map<String, String> m2925y() {
        synchronized (this.f3429aw) {
            try {
                if (this.f3426at.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f3426at);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final int m2926z() {
        int i;
        synchronized (this.f3402U) {
            i = this.f3453w;
        }
        return i;
    }

    /* renamed from: b */
    public final void m2897b(String str) {
        C4055al.m3021a("change deviceModel，old:%s new:%s", this.f3406Z, str);
        this.f3406Z = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C4059ap.m3088c("deviceModel", str);
    }

    /* renamed from: a */
    public final void m2893a(int i, boolean z8) {
        C4055al.m3025c("setActivityForeState, hash:%s isFore:%s", Integer.valueOf(i), Boolean.valueOf(z8));
        if (z8) {
            this.f3431ay.add(Integer.valueOf(i));
        } else {
            this.f3431ay.remove(Integer.valueOf(i));
            this.f3431ay.remove((Object) 0);
        }
        InterfaceC4131q interfaceC4131q = this.f3395N;
        if (interfaceC4131q != null) {
            interfaceC4131q.setNativeIsAppForeground(this.f3431ay.size() > 0);
        }
    }

    /* renamed from: c */
    public final synchronized void m2900c(String str) {
        this.f3409ab = String.valueOf(str);
    }

    /* renamed from: e */
    public final void m2904e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3416ai = str.trim();
    }

    /* renamed from: f */
    public final String m2906f(String str) {
        String strRemove;
        if (C4059ap.m3084b(str)) {
            C4055al.m3026d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f3428av) {
            strRemove = this.f3424ar.remove(str);
        }
        return strRemove;
    }

    /* renamed from: b */
    public final void m2898b(String str, String str2) {
        if (!C4059ap.m3084b(str) && !C4059ap.m3084b(str2)) {
            synchronized (this.f3429aw) {
                this.f3426at.put(str, str2);
            }
            return;
        }
        C4055al.m3026d("server key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: d */
    public final synchronized void m2902d(String str) {
        this.f3410ac = String.valueOf(str);
    }

    /* renamed from: a */
    public static synchronized C4044aa m2888a(Context context) {
        try {
            if (f3381aq == null) {
                f3381aq = new C4044aa(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3381aq;
    }

    /* renamed from: g */
    public final String m2908g(String str) {
        String str2;
        if (C4059ap.m3084b(str)) {
            C4055al.m3026d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f3428av) {
            str2 = this.f3424ar.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public final void m2894a(String str) {
        this.f3408aa = str;
        if (!TextUtils.isEmpty(str)) {
            C4059ap.m3088c("deviceId", str);
        }
        synchronized (this.f3430ax) {
            this.f3425as.put("E8", str);
        }
    }

    /* renamed from: a */
    public final void m2895a(String str, String str2) {
        if (!C4059ap.m3084b(str) && !C4059ap.m3084b(str2)) {
            synchronized (this.f3428av) {
                this.f3424ar.put(str, str2);
            }
            return;
        }
        C4055al.m3026d("key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: a */
    private void m2889a(String str, String str2, boolean z8) {
        if (C4059ap.m3084b(str)) {
            C4055al.m3026d("key should not be empty %s", str);
            return;
        }
        C4055al.m3025c("putExtraRequestData key:%s value:%s save:%s", str, str2, Boolean.valueOf(z8));
        synchronized (this.f3430ax) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.f3425as.remove(str);
                    this.f3397P.edit().remove(str).apply();
                } else {
                    this.f3425as.put(str, str2);
                    if (z8) {
                        this.f3397P.edit().putString(str, str2).apply();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

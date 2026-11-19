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
public final class C5780aa {

    /* renamed from: W */
    private static final Map<String, String> f3862W = new HashMap();

    /* renamed from: aq */
    private static C5780aa f3863aq = null;

    /* renamed from: D */
    public boolean f3867D;

    /* renamed from: E */
    public String f3868E;

    /* renamed from: F */
    public String f3869F;

    /* renamed from: G */
    public String f3870G;

    /* renamed from: H */
    public String f3871H;

    /* renamed from: J */
    public boolean f3873J;

    /* renamed from: O */
    public final SharedPreferences f3878O;

    /* renamed from: P */
    public final SharedPreferences f3879P;

    /* renamed from: X */
    private final Context f3886X;

    /* renamed from: Y */
    private String f3887Y;

    /* renamed from: Z */
    private String f3888Z;

    /* renamed from: aa */
    private String f3890aa;

    /* renamed from: aj */
    private String f3899aj;

    /* renamed from: c */
    public String f3915c;

    /* renamed from: d */
    public final String f3916d;

    /* renamed from: e */
    public String f3917e;

    /* renamed from: k */
    public final String f3923k;

    /* renamed from: o */
    public String f3927o;

    /* renamed from: p */
    public int f3928p;

    /* renamed from: q */
    public String f3929q;

    /* renamed from: r */
    public String f3930r;

    /* renamed from: s */
    public String f3931s;

    /* renamed from: v */
    public List<String> f3934v;

    /* renamed from: f */
    public boolean f3918f = true;

    /* renamed from: g */
    public final String f3919g = "com.tencent.bugly";

    /* renamed from: h */
    public String f3920h = "4.1.9.3";

    /* renamed from: i */
    public final String f3921i = "";

    /* renamed from: j */
    @Deprecated
    public final String f3922j = "";

    /* renamed from: l */
    public String f3924l = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: ab */
    private String f3891ab = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: ac */
    private String f3892ac = "";

    /* renamed from: m */
    public long f3925m = 0;

    /* renamed from: ad */
    private String f3893ad = null;

    /* renamed from: ae */
    private long f3894ae = -1;

    /* renamed from: af */
    private long f3895af = -1;

    /* renamed from: ag */
    private long f3896ag = -1;

    /* renamed from: ah */
    private String f3897ah = null;

    /* renamed from: ai */
    private String f3898ai = null;

    /* renamed from: ak */
    private Map<String, PlugInBean> f3900ak = null;

    /* renamed from: n */
    public boolean f3926n = false;

    /* renamed from: al */
    private String f3901al = null;

    /* renamed from: am */
    private Boolean f3902am = null;

    /* renamed from: an */
    private String f3903an = null;

    /* renamed from: t */
    public String f3932t = null;

    /* renamed from: u */
    public String f3933u = null;

    /* renamed from: ao */
    private Map<String, PlugInBean> f3904ao = null;

    /* renamed from: ap */
    private Map<String, PlugInBean> f3905ap = null;

    /* renamed from: w */
    public int f3935w = -1;

    /* renamed from: x */
    public int f3936x = -1;

    /* renamed from: ar */
    private final Map<String, String> f3906ar = new HashMap();

    /* renamed from: as */
    private final Map<String, String> f3907as = new HashMap();

    /* renamed from: at */
    private final Map<String, String> f3908at = new HashMap();

    /* renamed from: y */
    public String f3937y = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: z */
    public long f3938z = 0;

    /* renamed from: A */
    public long f3864A = 0;

    /* renamed from: B */
    public long f3865B = 0;

    /* renamed from: C */
    public long f3866C = 0;

    /* renamed from: I */
    public boolean f3872I = false;

    /* renamed from: K */
    public HashMap<String, String> f3874K = new HashMap<>();

    /* renamed from: L */
    public List<String> f3875L = new ArrayList();

    /* renamed from: M */
    public boolean f3876M = false;

    /* renamed from: N */
    public InterfaceC5843q f3877N = null;

    /* renamed from: Q */
    public boolean f3880Q = true;

    /* renamed from: R */
    public boolean f3881R = true;

    /* renamed from: S */
    public boolean f3882S = false;

    /* renamed from: au */
    private final Object f3909au = new Object();

    /* renamed from: T */
    public final Object f3883T = new Object();

    /* renamed from: av */
    private final Object f3910av = new Object();

    /* renamed from: aw */
    private final Object f3911aw = new Object();

    /* renamed from: U */
    public final Object f3884U = new Object();

    /* renamed from: V */
    public final Object f3885V = new Object();

    /* renamed from: ax */
    private final Object f3912ax = new Object();

    /* renamed from: ay */
    private final List<Integer> f3913ay = new ArrayList();

    /* renamed from: a */
    public final long f3889a = System.currentTimeMillis();

    /* renamed from: b */
    public final byte f3914b = 1;

    private C5780aa(Context context) {
        this.f3899aj = null;
        this.f3927o = null;
        this.f3929q = null;
        this.f3930r = null;
        this.f3931s = null;
        this.f3934v = null;
        this.f3867D = false;
        this.f3868E = null;
        this.f3869F = null;
        this.f3870G = null;
        this.f3871H = "";
        this.f3873J = false;
        this.f3886X = C5795ap.m3958a(context);
        PackageInfo packageInfoM4331b = C5852z.m4331b(context);
        if (packageInfoM4331b != null) {
            try {
                String str = packageInfoM4331b.versionName;
                this.f3927o = str;
                this.f3868E = str;
                this.f3869F = Integer.toString(packageInfoM4331b.versionCode);
            } catch (Throwable th) {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
            }
        }
        this.f3915c = C5852z.m4327a(context);
        this.f3916d = C5852z.m4326a(Process.myPid());
        this.f3929q = C5852z.m4332c(context);
        this.f3923k = "Android " + C5781ab.m3835b() + ",level " + C5781ab.m3836c();
        Map<String, String> mapM4333d = C5852z.m4333d(context);
        if (mapM4333d != null) {
            try {
                this.f3934v = C5852z.m4328a(mapM4333d);
                String str2 = mapM4333d.get("BUGLY_APPID");
                if (str2 != null) {
                    this.f3930r = str2;
                    m3803b("APP_ID", str2);
                }
                String str3 = mapM4333d.get("BUGLY_APP_VERSION");
                if (str3 != null) {
                    this.f3927o = str3;
                }
                String str4 = mapM4333d.get("BUGLY_APP_CHANNEL");
                if (str4 != null) {
                    this.f3931s = str4;
                }
                String str5 = mapM4333d.get("BUGLY_ENABLE_DEBUG");
                if (str5 != null) {
                    this.f3867D = str5.equalsIgnoreCase("true");
                }
                String str6 = mapM4333d.get("com.tencent.rdm.uuid");
                if (str6 != null) {
                    this.f3870G = str6;
                }
                String str7 = mapM4333d.get("BUGLY_APP_BUILD_NO");
                if (!TextUtils.isEmpty(str7)) {
                    this.f3928p = Integer.parseInt(str7);
                }
                String str8 = mapM4333d.get("BUGLY_AREA");
                if (str8 != null) {
                    this.f3871H = str8;
                }
            } catch (Throwable th2) {
                if (!C5791al.m3929a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.f3873J = true;
                C5791al.m3932c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th3) {
            if (C5842p.f4357c) {
                th3.printStackTrace();
            }
        }
        this.f3878O = C5795ap.m3959a("BUGLY_COMMON_VALUES", context);
        this.f3879P = C5795ap.m3959a("BUGLY_RESERVED_VALUES", context);
        this.f3899aj = C5781ab.m3833a(context);
        m3790E();
        C5791al.m3932c("com info create end", new Object[0]);
    }

    /* renamed from: B */
    public static int m3787B() {
        return C5781ab.m3836c();
    }

    @Deprecated
    /* renamed from: C */
    public static boolean m3788C() {
        C5791al.m3928a("Detect if the emulator is unavailable", new Object[0]);
        return false;
    }

    @Deprecated
    /* renamed from: D */
    public static boolean m3789D() {
        C5791al.m3928a("Detect if the device hook is unavailable", new Object[0]);
        return false;
    }

    /* renamed from: E */
    private void m3790E() {
        try {
            for (Map.Entry<String, ?> entry : this.f3879P.getAll().entrySet()) {
                C5791al.m3932c("put reserved request data from sp, key:%s value:%s", entry.getKey(), entry.getValue());
                m3794a(entry.getKey(), entry.getValue().toString(), false);
            }
            for (Map.Entry<String, String> entry2 : f3862W.entrySet()) {
                C5791al.m3932c("put reserved request data from cache, key:%s value:%s", entry2.getKey(), entry2.getValue());
                m3794a(entry2.getKey(), entry2.getValue(), true);
            }
            f3862W.clear();
        } catch (Throwable th) {
            C5791al.m3931b(th);
        }
    }

    /* renamed from: F */
    private String m3791F() {
        if (TextUtils.isEmpty(this.f3893ad)) {
            this.f3893ad = C5795ap.m3998d("androidid", null);
        }
        return this.f3893ad;
    }

    /* renamed from: G */
    private static String m3792G() {
        String string = UUID.randomUUID().toString();
        return !C5795ap.m3991b(string) ? string.replaceAll("-", "") : string;
    }

    /* renamed from: b */
    public static synchronized C5780aa m3795b() {
        return f3863aq;
    }

    @Deprecated
    /* renamed from: n */
    public static String m3796n() {
        return "";
    }

    /* renamed from: A */
    public final synchronized Map<String, PlugInBean> m3797A() {
        Map<String, PlugInBean> map;
        map = this.f3904ao;
        Map<String, PlugInBean> map2 = this.f3905ap;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* renamed from: a */
    public final boolean m3801a() {
        boolean z6 = this.f3913ay.size() > 0;
        C5791al.m3932c("isAppForeground:%s", Boolean.valueOf(z6));
        return z6;
    }

    /* renamed from: c */
    public final void m3804c() {
        synchronized (this.f3909au) {
            this.f3887Y = UUID.randomUUID().toString();
        }
    }

    /* renamed from: d */
    public final String m3806d() {
        String str;
        synchronized (this.f3909au) {
            try {
                if (this.f3887Y == null) {
                    m3804c();
                }
                str = this.f3887Y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: e */
    public final String m3808e() {
        return !C5795ap.m3991b(this.f3917e) ? this.f3917e : this.f3930r;
    }

    /* renamed from: f */
    public final String m3810f() {
        String str;
        synchronized (this.f3885V) {
            str = this.f3924l;
        }
        return str;
    }

    /* renamed from: g */
    public final String m3812g() {
        String str = this.f3890aa;
        if (str != null) {
            return str;
        }
        String strM3998d = C5795ap.m3998d("deviceId", null);
        this.f3890aa = strM3998d;
        if (strM3998d != null) {
            return strM3998d;
        }
        String strM3791F = m3791F();
        this.f3890aa = strM3791F;
        if (TextUtils.isEmpty(strM3791F)) {
            this.f3890aa = m3792G();
        }
        String str2 = this.f3890aa;
        if (str2 == null) {
            return "";
        }
        C5795ap.m3995c("deviceId", str2);
        return this.f3890aa;
    }

    /* renamed from: h */
    public final synchronized String m3814h() {
        String str = this.f3888Z;
        if (str != null) {
            return str;
        }
        String strM3998d = C5795ap.m3998d("deviceModel", null);
        this.f3888Z = strM3998d;
        if (strM3998d != null) {
            C5791al.m3932c("collect device model from sp:%s", strM3998d);
            return this.f3888Z;
        }
        if (!this.f3926n) {
            C5791al.m3932c("not allow collect device model", new Object[0]);
            return "fail";
        }
        String strM3832a = C5781ab.m3832a();
        this.f3888Z = strM3832a;
        C5791al.m3932c("collect device model:%s", strM3832a);
        C5795ap.m3995c("deviceModel", this.f3888Z);
        return this.f3888Z;
    }

    /* renamed from: i */
    public final synchronized String m3815i() {
        return this.f3892ac;
    }

    /* renamed from: j */
    public final long m3816j() {
        if (this.f3894ae <= 0) {
            this.f3894ae = C5781ab.m3839e();
        }
        return this.f3894ae;
    }

    /* renamed from: k */
    public final long m3817k() {
        if (this.f3895af <= 0) {
            this.f3895af = C5781ab.m3843i();
        }
        return this.f3895af;
    }

    /* renamed from: l */
    public final long m3818l() {
        if (this.f3896ag <= 0) {
            this.f3896ag = C5781ab.m3845k();
        }
        return this.f3896ag;
    }

    /* renamed from: m */
    public final String m3819m() {
        if (!TextUtils.isEmpty(this.f3898ai)) {
            C5791al.m3932c("get cpu type from so:%s", this.f3898ai);
            return this.f3898ai;
        }
        if (TextUtils.isEmpty(this.f3899aj)) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        C5791al.m3932c("get cpu type from lib dir:%s", this.f3899aj);
        return this.f3899aj;
    }

    /* renamed from: o */
    public final String m3820o() {
        try {
            Map<String, ?> all = this.f3886X.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.f3883T) {
                    try {
                    } catch (Throwable th) {
                        C5791al.m3929a(th);
                    } finally {
                    }
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        this.f3874K.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        } catch (Throwable th2) {
            C5791al.m3929a(th2);
        }
        if (this.f3874K.isEmpty()) {
            C5791al.m3932c("SDK_INFO is empty", new Object[0]);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.f3874K.entrySet()) {
            sb.append("[");
            sb.append(entry2.getKey());
            sb.append(",");
            sb.append(entry2.getValue());
            sb.append("] ");
        }
        C5791al.m3932c("SDK_INFO = %s", sb.toString());
        m3803b("SDK_INFO", sb.toString());
        return sb.toString();
    }

    /* renamed from: p */
    public final synchronized Map<String, PlugInBean> m3821p() {
        Map<String, PlugInBean> map = this.f3900ak;
        if (map != null && map.size() > 0) {
            HashMap map2 = new HashMap(this.f3900ak.size());
            map2.putAll(this.f3900ak);
            return map2;
        }
        return null;
    }

    /* renamed from: q */
    public final String m3822q() {
        if (this.f3901al == null) {
            this.f3901al = C5781ab.m3847m();
        }
        return this.f3901al;
    }

    /* renamed from: r */
    public final Boolean m3823r() {
        if (this.f3902am == null) {
            this.f3902am = Boolean.valueOf(C5781ab.m3851q());
        }
        return this.f3902am;
    }

    /* renamed from: s */
    public final String m3824s() {
        if (this.f3903an == null) {
            String str = C5781ab.m3848n();
            this.f3903an = str;
            C5791al.m3928a("ROM ID: %s", str);
        }
        return this.f3903an;
    }

    /* renamed from: t */
    public final Map<String, String> m3825t() {
        synchronized (this.f3910av) {
            try {
                if (this.f3906ar.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f3906ar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public final void m3826u() {
        synchronized (this.f3910av) {
            this.f3906ar.clear();
        }
    }

    /* renamed from: v */
    public final int m3827v() {
        int size;
        synchronized (this.f3910av) {
            size = this.f3906ar.size();
        }
        return size;
    }

    /* renamed from: w */
    public final Set<String> m3828w() {
        Set<String> setKeySet;
        synchronized (this.f3910av) {
            setKeySet = this.f3906ar.keySet();
        }
        return setKeySet;
    }

    /* renamed from: x */
    public final Map<String, String> m3829x() {
        synchronized (this.f3912ax) {
            try {
                if (this.f3907as.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f3907as);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final Map<String, String> m3830y() {
        synchronized (this.f3911aw) {
            try {
                if (this.f3908at.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f3908at);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final int m3831z() {
        int i6;
        synchronized (this.f3884U) {
            i6 = this.f3935w;
        }
        return i6;
    }

    /* renamed from: b */
    public final void m3802b(String str) {
        C5791al.m3928a("change deviceModel，old:%s new:%s", this.f3888Z, str);
        this.f3888Z = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C5795ap.m3995c("deviceModel", str);
    }

    /* renamed from: a */
    public final void m3798a(int i6, boolean z6) {
        C5791al.m3932c("setActivityForeState, hash:%s isFore:%s", Integer.valueOf(i6), Boolean.valueOf(z6));
        if (z6) {
            this.f3913ay.add(Integer.valueOf(i6));
        } else {
            this.f3913ay.remove(Integer.valueOf(i6));
            this.f3913ay.remove((Object) 0);
        }
        InterfaceC5843q interfaceC5843q = this.f3877N;
        if (interfaceC5843q != null) {
            interfaceC5843q.setNativeIsAppForeground(this.f3913ay.size() > 0);
        }
    }

    /* renamed from: c */
    public final synchronized void m3805c(String str) {
        this.f3891ab = String.valueOf(str);
    }

    /* renamed from: e */
    public final void m3809e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3898ai = str.trim();
    }

    /* renamed from: f */
    public final String m3811f(String str) {
        String strRemove;
        if (C5795ap.m3991b(str)) {
            C5791al.m3933d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f3910av) {
            strRemove = this.f3906ar.remove(str);
        }
        return strRemove;
    }

    /* renamed from: b */
    public final void m3803b(String str, String str2) {
        if (!C5795ap.m3991b(str) && !C5795ap.m3991b(str2)) {
            synchronized (this.f3911aw) {
                this.f3908at.put(str, str2);
            }
            return;
        }
        C5791al.m3933d("server key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: d */
    public final synchronized void m3807d(String str) {
        this.f3892ac = String.valueOf(str);
    }

    /* renamed from: a */
    public static synchronized C5780aa m3793a(Context context) {
        try {
            if (f3863aq == null) {
                f3863aq = new C5780aa(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3863aq;
    }

    /* renamed from: g */
    public final String m3813g(String str) {
        String str2;
        if (C5795ap.m3991b(str)) {
            C5791al.m3933d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f3910av) {
            str2 = this.f3906ar.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public final void m3799a(String str) {
        this.f3890aa = str;
        if (!TextUtils.isEmpty(str)) {
            C5795ap.m3995c("deviceId", str);
        }
        synchronized (this.f3912ax) {
            this.f3907as.put("E8", str);
        }
    }

    /* renamed from: a */
    public final void m3800a(String str, String str2) {
        if (!C5795ap.m3991b(str) && !C5795ap.m3991b(str2)) {
            synchronized (this.f3910av) {
                this.f3906ar.put(str, str2);
            }
            return;
        }
        C5791al.m3933d("key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: a */
    private void m3794a(String str, String str2, boolean z6) {
        if (C5795ap.m3991b(str)) {
            C5791al.m3933d("key should not be empty %s", str);
            return;
        }
        C5791al.m3932c("putExtraRequestData key:%s value:%s save:%s", str, str2, Boolean.valueOf(z6));
        synchronized (this.f3912ax) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.f3907as.remove(str);
                    this.f3879P.edit().remove(str).apply();
                } else {
                    this.f3907as.put(str, str2);
                    if (z6) {
                        this.f3879P.edit().putString(str, str2).apply();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

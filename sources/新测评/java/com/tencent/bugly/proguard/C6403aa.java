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
public final class C6403aa {

    /* renamed from: W */
    private static final Map<String, String> f5141W = new HashMap();

    /* renamed from: aq */
    private static C6403aa f5142aq = null;

    /* renamed from: D */
    public boolean f5146D;

    /* renamed from: E */
    public String f5147E;

    /* renamed from: F */
    public String f5148F;

    /* renamed from: G */
    public String f5149G;

    /* renamed from: H */
    public String f5150H;

    /* renamed from: J */
    public boolean f5152J;

    /* renamed from: O */
    public final SharedPreferences f5157O;

    /* renamed from: P */
    public final SharedPreferences f5158P;

    /* renamed from: X */
    private final Context f5165X;

    /* renamed from: Y */
    private String f5166Y;

    /* renamed from: Z */
    private String f5167Z;

    /* renamed from: aa */
    private String f5169aa;

    /* renamed from: aj */
    private String f5178aj;

    /* renamed from: c */
    public String f5194c;

    /* renamed from: d */
    public final String f5195d;

    /* renamed from: e */
    public String f5196e;

    /* renamed from: k */
    public final String f5202k;

    /* renamed from: o */
    public String f5206o;

    /* renamed from: p */
    public int f5207p;

    /* renamed from: q */
    public String f5208q;

    /* renamed from: r */
    public String f5209r;

    /* renamed from: s */
    public String f5210s;

    /* renamed from: v */
    public List<String> f5213v;

    /* renamed from: f */
    public boolean f5197f = true;

    /* renamed from: g */
    public final String f5198g = "com.tencent.bugly";

    /* renamed from: h */
    public String f5199h = "4.1.9.3";

    /* renamed from: i */
    public final String f5200i = "";

    /* renamed from: j */
    @Deprecated
    public final String f5201j = "";

    /* renamed from: l */
    public String f5203l = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: ab */
    private String f5170ab = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: ac */
    private String f5171ac = "";

    /* renamed from: m */
    public long f5204m = 0;

    /* renamed from: ad */
    private String f5172ad = null;

    /* renamed from: ae */
    private long f5173ae = -1;

    /* renamed from: af */
    private long f5174af = -1;

    /* renamed from: ag */
    private long f5175ag = -1;

    /* renamed from: ah */
    private String f5176ah = null;

    /* renamed from: ai */
    private String f5177ai = null;

    /* renamed from: ak */
    private Map<String, PlugInBean> f5179ak = null;

    /* renamed from: n */
    public boolean f5205n = false;

    /* renamed from: al */
    private String f5180al = null;

    /* renamed from: am */
    private Boolean f5181am = null;

    /* renamed from: an */
    private String f5182an = null;

    /* renamed from: t */
    public String f5211t = null;

    /* renamed from: u */
    public String f5212u = null;

    /* renamed from: ao */
    private Map<String, PlugInBean> f5183ao = null;

    /* renamed from: ap */
    private Map<String, PlugInBean> f5184ap = null;

    /* renamed from: w */
    public int f5214w = -1;

    /* renamed from: x */
    public int f5215x = -1;

    /* renamed from: ar */
    private final Map<String, String> f5185ar = new HashMap();

    /* renamed from: as */
    private final Map<String, String> f5186as = new HashMap();

    /* renamed from: at */
    private final Map<String, String> f5187at = new HashMap();

    /* renamed from: y */
    public String f5216y = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: z */
    public long f5217z = 0;

    /* renamed from: A */
    public long f5143A = 0;

    /* renamed from: B */
    public long f5144B = 0;

    /* renamed from: C */
    public long f5145C = 0;

    /* renamed from: I */
    public boolean f5151I = false;

    /* renamed from: K */
    public HashMap<String, String> f5153K = new HashMap<>();

    /* renamed from: L */
    public List<String> f5154L = new ArrayList();

    /* renamed from: M */
    public boolean f5155M = false;

    /* renamed from: N */
    public InterfaceC6466q f5156N = null;

    /* renamed from: Q */
    public boolean f5159Q = true;

    /* renamed from: R */
    public boolean f5160R = true;

    /* renamed from: S */
    public boolean f5161S = false;

    /* renamed from: au */
    private final Object f5188au = new Object();

    /* renamed from: T */
    public final Object f5162T = new Object();

    /* renamed from: av */
    private final Object f5189av = new Object();

    /* renamed from: aw */
    private final Object f5190aw = new Object();

    /* renamed from: U */
    public final Object f5163U = new Object();

    /* renamed from: V */
    public final Object f5164V = new Object();

    /* renamed from: ax */
    private final Object f5191ax = new Object();

    /* renamed from: ay */
    private final List<Integer> f5192ay = new ArrayList();

    /* renamed from: a */
    public final long f5168a = System.currentTimeMillis();

    /* renamed from: b */
    public final byte f5193b = 1;

    private C6403aa(Context context) {
        this.f5178aj = null;
        this.f5206o = null;
        this.f5208q = null;
        this.f5209r = null;
        this.f5210s = null;
        this.f5213v = null;
        this.f5146D = false;
        this.f5147E = null;
        this.f5148F = null;
        this.f5149G = null;
        this.f5150H = "";
        this.f5152J = false;
        this.f5165X = C6418ap.m4953a(context);
        PackageInfo packageInfoM5326b = C6475z.m5326b(context);
        if (packageInfoM5326b != null) {
            try {
                String str = packageInfoM5326b.versionName;
                this.f5206o = str;
                this.f5147E = str;
                this.f5148F = Integer.toString(packageInfoM5326b.versionCode);
            } catch (Throwable th) {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
            }
        }
        this.f5194c = C6475z.m5322a(context);
        this.f5195d = C6475z.m5321a(Process.myPid());
        this.f5208q = C6475z.m5327c(context);
        this.f5202k = "Android " + C6404ab.m4830b() + ",level " + C6404ab.m4831c();
        Map<String, String> mapM5328d = C6475z.m5328d(context);
        if (mapM5328d != null) {
            try {
                this.f5213v = C6475z.m5323a(mapM5328d);
                String str2 = mapM5328d.get("BUGLY_APPID");
                if (str2 != null) {
                    this.f5209r = str2;
                    m4798b("APP_ID", str2);
                }
                String str3 = mapM5328d.get("BUGLY_APP_VERSION");
                if (str3 != null) {
                    this.f5206o = str3;
                }
                String str4 = mapM5328d.get("BUGLY_APP_CHANNEL");
                if (str4 != null) {
                    this.f5210s = str4;
                }
                String str5 = mapM5328d.get("BUGLY_ENABLE_DEBUG");
                if (str5 != null) {
                    this.f5146D = str5.equalsIgnoreCase("true");
                }
                String str6 = mapM5328d.get("com.tencent.rdm.uuid");
                if (str6 != null) {
                    this.f5149G = str6;
                }
                String str7 = mapM5328d.get("BUGLY_APP_BUILD_NO");
                if (!TextUtils.isEmpty(str7)) {
                    this.f5207p = Integer.parseInt(str7);
                }
                String str8 = mapM5328d.get("BUGLY_AREA");
                if (str8 != null) {
                    this.f5150H = str8;
                }
            } catch (Throwable th2) {
                if (!C6414al.m4924a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.f5152J = true;
                C6414al.m4927c("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th3) {
            if (C6465p.f5636c) {
                th3.printStackTrace();
            }
        }
        this.f5157O = C6418ap.m4954a("BUGLY_COMMON_VALUES", context);
        this.f5158P = C6418ap.m4954a("BUGLY_RESERVED_VALUES", context);
        this.f5178aj = C6404ab.m4828a(context);
        m4785E();
        C6414al.m4927c("com info create end", new Object[0]);
    }

    /* renamed from: B */
    public static int m4782B() {
        return C6404ab.m4831c();
    }

    @Deprecated
    /* renamed from: C */
    public static boolean m4783C() {
        C6414al.m4923a("Detect if the emulator is unavailable", new Object[0]);
        return false;
    }

    @Deprecated
    /* renamed from: D */
    public static boolean m4784D() {
        C6414al.m4923a("Detect if the device hook is unavailable", new Object[0]);
        return false;
    }

    /* renamed from: E */
    private void m4785E() {
        try {
            for (Map.Entry<String, ?> entry : this.f5158P.getAll().entrySet()) {
                C6414al.m4927c("put reserved request data from sp, key:%s value:%s", entry.getKey(), entry.getValue());
                m4789a(entry.getKey(), entry.getValue().toString(), false);
            }
            for (Map.Entry<String, String> entry2 : f5141W.entrySet()) {
                C6414al.m4927c("put reserved request data from cache, key:%s value:%s", entry2.getKey(), entry2.getValue());
                m4789a(entry2.getKey(), entry2.getValue(), true);
            }
            f5141W.clear();
        } catch (Throwable th) {
            C6414al.m4926b(th);
        }
    }

    /* renamed from: F */
    private String m4786F() {
        if (TextUtils.isEmpty(this.f5172ad)) {
            this.f5172ad = C6418ap.m4993d("androidid", null);
        }
        return this.f5172ad;
    }

    /* renamed from: G */
    private static String m4787G() {
        String string = UUID.randomUUID().toString();
        return !C6418ap.m4986b(string) ? string.replaceAll("-", "") : string;
    }

    /* renamed from: b */
    public static synchronized C6403aa m4790b() {
        return f5142aq;
    }

    @Deprecated
    /* renamed from: n */
    public static String m4791n() {
        return "";
    }

    /* renamed from: A */
    public final synchronized Map<String, PlugInBean> m4792A() {
        Map<String, PlugInBean> map;
        map = this.f5183ao;
        Map<String, PlugInBean> map2 = this.f5184ap;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* renamed from: a */
    public final boolean m4796a() {
        boolean z9 = this.f5192ay.size() > 0;
        C6414al.m4927c("isAppForeground:%s", Boolean.valueOf(z9));
        return z9;
    }

    /* renamed from: c */
    public final void m4799c() {
        synchronized (this.f5188au) {
            this.f5166Y = UUID.randomUUID().toString();
        }
    }

    /* renamed from: d */
    public final String m4801d() {
        String str;
        synchronized (this.f5188au) {
            try {
                if (this.f5166Y == null) {
                    m4799c();
                }
                str = this.f5166Y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: e */
    public final String m4803e() {
        return !C6418ap.m4986b(this.f5196e) ? this.f5196e : this.f5209r;
    }

    /* renamed from: f */
    public final String m4805f() {
        String str;
        synchronized (this.f5164V) {
            str = this.f5203l;
        }
        return str;
    }

    /* renamed from: g */
    public final String m4807g() {
        String str = this.f5169aa;
        if (str != null) {
            return str;
        }
        String strM4993d = C6418ap.m4993d("deviceId", null);
        this.f5169aa = strM4993d;
        if (strM4993d != null) {
            return strM4993d;
        }
        String strM4786F = m4786F();
        this.f5169aa = strM4786F;
        if (TextUtils.isEmpty(strM4786F)) {
            this.f5169aa = m4787G();
        }
        String str2 = this.f5169aa;
        if (str2 == null) {
            return "";
        }
        C6418ap.m4990c("deviceId", str2);
        return this.f5169aa;
    }

    /* renamed from: h */
    public final synchronized String m4809h() {
        String str = this.f5167Z;
        if (str != null) {
            return str;
        }
        String strM4993d = C6418ap.m4993d("deviceModel", null);
        this.f5167Z = strM4993d;
        if (strM4993d != null) {
            C6414al.m4927c("collect device model from sp:%s", strM4993d);
            return this.f5167Z;
        }
        if (!this.f5205n) {
            C6414al.m4927c("not allow collect device model", new Object[0]);
            return "fail";
        }
        String strM4827a = C6404ab.m4827a();
        this.f5167Z = strM4827a;
        C6414al.m4927c("collect device model:%s", strM4827a);
        C6418ap.m4990c("deviceModel", this.f5167Z);
        return this.f5167Z;
    }

    /* renamed from: i */
    public final synchronized String m4810i() {
        return this.f5171ac;
    }

    /* renamed from: j */
    public final long m4811j() {
        if (this.f5173ae <= 0) {
            this.f5173ae = C6404ab.m4834e();
        }
        return this.f5173ae;
    }

    /* renamed from: k */
    public final long m4812k() {
        if (this.f5174af <= 0) {
            this.f5174af = C6404ab.m4838i();
        }
        return this.f5174af;
    }

    /* renamed from: l */
    public final long m4813l() {
        if (this.f5175ag <= 0) {
            this.f5175ag = C6404ab.m4840k();
        }
        return this.f5175ag;
    }

    /* renamed from: m */
    public final String m4814m() {
        if (!TextUtils.isEmpty(this.f5177ai)) {
            C6414al.m4927c("get cpu type from so:%s", this.f5177ai);
            return this.f5177ai;
        }
        if (TextUtils.isEmpty(this.f5178aj)) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        C6414al.m4927c("get cpu type from lib dir:%s", this.f5178aj);
        return this.f5178aj;
    }

    /* renamed from: o */
    public final String m4815o() {
        try {
            Map<String, ?> all = this.f5165X.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.f5162T) {
                    try {
                    } catch (Throwable th) {
                        C6414al.m4924a(th);
                    } finally {
                    }
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        this.f5153K.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        } catch (Throwable th2) {
            C6414al.m4924a(th2);
        }
        if (this.f5153K.isEmpty()) {
            C6414al.m4927c("SDK_INFO is empty", new Object[0]);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.f5153K.entrySet()) {
            sb.append("[");
            sb.append(entry2.getKey());
            sb.append(",");
            sb.append(entry2.getValue());
            sb.append("] ");
        }
        C6414al.m4927c("SDK_INFO = %s", sb.toString());
        m4798b("SDK_INFO", sb.toString());
        return sb.toString();
    }

    /* renamed from: p */
    public final synchronized Map<String, PlugInBean> m4816p() {
        Map<String, PlugInBean> map = this.f5179ak;
        if (map != null && map.size() > 0) {
            HashMap map2 = new HashMap(this.f5179ak.size());
            map2.putAll(this.f5179ak);
            return map2;
        }
        return null;
    }

    /* renamed from: q */
    public final String m4817q() {
        if (this.f5180al == null) {
            this.f5180al = C6404ab.m4842m();
        }
        return this.f5180al;
    }

    /* renamed from: r */
    public final Boolean m4818r() {
        if (this.f5181am == null) {
            this.f5181am = Boolean.valueOf(C6404ab.m4846q());
        }
        return this.f5181am;
    }

    /* renamed from: s */
    public final String m4819s() {
        if (this.f5182an == null) {
            String str = C6404ab.m4843n();
            this.f5182an = str;
            C6414al.m4923a("ROM ID: %s", str);
        }
        return this.f5182an;
    }

    /* renamed from: t */
    public final Map<String, String> m4820t() {
        synchronized (this.f5189av) {
            try {
                if (this.f5185ar.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f5185ar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: u */
    public final void m4821u() {
        synchronized (this.f5189av) {
            this.f5185ar.clear();
        }
    }

    /* renamed from: v */
    public final int m4822v() {
        int size;
        synchronized (this.f5189av) {
            size = this.f5185ar.size();
        }
        return size;
    }

    /* renamed from: w */
    public final Set<String> m4823w() {
        Set<String> setKeySet;
        synchronized (this.f5189av) {
            setKeySet = this.f5185ar.keySet();
        }
        return setKeySet;
    }

    /* renamed from: x */
    public final Map<String, String> m4824x() {
        synchronized (this.f5191ax) {
            try {
                if (this.f5186as.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f5186as);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final Map<String, String> m4825y() {
        synchronized (this.f5190aw) {
            try {
                if (this.f5187at.size() <= 0) {
                    return null;
                }
                return new HashMap(this.f5187at);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: z */
    public final int m4826z() {
        int i10;
        synchronized (this.f5163U) {
            i10 = this.f5214w;
        }
        return i10;
    }

    /* renamed from: b */
    public final void m4797b(String str) {
        C6414al.m4923a("change deviceModel，old:%s new:%s", this.f5167Z, str);
        this.f5167Z = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C6418ap.m4990c("deviceModel", str);
    }

    /* renamed from: a */
    public final void m4793a(int i10, boolean z9) {
        C6414al.m4927c("setActivityForeState, hash:%s isFore:%s", Integer.valueOf(i10), Boolean.valueOf(z9));
        if (z9) {
            this.f5192ay.add(Integer.valueOf(i10));
        } else {
            this.f5192ay.remove(Integer.valueOf(i10));
            this.f5192ay.remove((Object) 0);
        }
        InterfaceC6466q interfaceC6466q = this.f5156N;
        if (interfaceC6466q != null) {
            interfaceC6466q.setNativeIsAppForeground(this.f5192ay.size() > 0);
        }
    }

    /* renamed from: c */
    public final synchronized void m4800c(String str) {
        this.f5170ab = String.valueOf(str);
    }

    /* renamed from: e */
    public final void m4804e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5177ai = str.trim();
    }

    /* renamed from: f */
    public final String m4806f(String str) {
        String strRemove;
        if (C6418ap.m4986b(str)) {
            C6414al.m4928d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f5189av) {
            strRemove = this.f5185ar.remove(str);
        }
        return strRemove;
    }

    /* renamed from: b */
    public final void m4798b(String str, String str2) {
        if (!C6418ap.m4986b(str) && !C6418ap.m4986b(str2)) {
            synchronized (this.f5190aw) {
                this.f5187at.put(str, str2);
            }
            return;
        }
        C6414al.m4928d("server key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: d */
    public final synchronized void m4802d(String str) {
        this.f5171ac = String.valueOf(str);
    }

    /* renamed from: a */
    public static synchronized C6403aa m4788a(Context context) {
        try {
            if (f5142aq == null) {
                f5142aq = new C6403aa(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5142aq;
    }

    /* renamed from: g */
    public final String m4808g(String str) {
        String str2;
        if (C6418ap.m4986b(str)) {
            C6414al.m4928d("key should not be empty %s", String.valueOf(str));
            return null;
        }
        synchronized (this.f5189av) {
            str2 = this.f5185ar.get(str);
        }
        return str2;
    }

    /* renamed from: a */
    public final void m4794a(String str) {
        this.f5169aa = str;
        if (!TextUtils.isEmpty(str)) {
            C6418ap.m4990c("deviceId", str);
        }
        synchronized (this.f5191ax) {
            this.f5186as.put("E8", str);
        }
    }

    /* renamed from: a */
    public final void m4795a(String str, String str2) {
        if (!C6418ap.m4986b(str) && !C6418ap.m4986b(str2)) {
            synchronized (this.f5189av) {
                this.f5185ar.put(str, str2);
            }
            return;
        }
        C6414al.m4928d("key&value should not be empty %s %s", String.valueOf(str), String.valueOf(str2));
    }

    /* renamed from: a */
    private void m4789a(String str, String str2, boolean z9) {
        if (C6418ap.m4986b(str)) {
            C6414al.m4928d("key should not be empty %s", str);
            return;
        }
        C6414al.m4927c("putExtraRequestData key:%s value:%s save:%s", str, str2, Boolean.valueOf(z9));
        synchronized (this.f5191ax) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    this.f5186as.remove(str);
                    this.f5158P.edit().remove(str).apply();
                } else {
                    this.f5186as.put(str, str2);
                    if (z9) {
                        this.f5158P.edit().putString(str, str2).apply();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

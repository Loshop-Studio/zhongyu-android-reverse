package com.tendcloud.tenddata;

import androidx.autofill.HintConstants;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.taobao.accs.AccsClientConfig;
import com.taobao.agoo.p087a.p088a.C7707c;
import com.tendcloud.tenddata.C7960ek;
import com.tendcloud.tenddata.C8022zz;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.dr */
/* loaded from: classes5.dex */
public class C7940dr {

    /* renamed from: a */
    private static volatile C7940dr f14742a;

    /* renamed from: b */
    private static String f14743b;

    /* renamed from: c */
    private static String f14744c;

    /* renamed from: d */
    private static String f14745d;

    /* renamed from: e */
    private static String f14746e;

    /* renamed from: f */
    private static String f14747f;

    /* renamed from: g */
    private static String f14748g;

    /* renamed from: h */
    private static String f14749h;

    /* renamed from: i */
    private static String f14750i;

    /* renamed from: j */
    private static String f14751j;

    /* renamed from: k */
    private static String f14752k;

    /* renamed from: l */
    private static String f14753l;

    /* renamed from: m */
    private static String f14754m;

    /* renamed from: n */
    private static String f14755n;

    /* renamed from: o */
    private static String f14756o;

    /* renamed from: p */
    private static String f14757p;

    /* renamed from: q */
    private static String f14758q;

    /* renamed from: r */
    private static String f14759r;

    /* renamed from: t */
    private static String f14760t;

    /* renamed from: z */
    private static JSONObject f14761z;

    /* renamed from: s */
    private String f14763s;

    /* renamed from: v */
    private String f14765v;

    /* renamed from: w */
    private int f14766w;

    /* renamed from: x */
    private String f14767x;

    /* renamed from: y */
    private JSONObject f14768y;

    /* renamed from: u */
    private a f14764u = a.UNKNOWN;

    /* renamed from: A */
    private Map<String, Object> f14762A = new TreeMap();

    /* renamed from: com.tendcloud.tenddata.dr$a */
    public enum a {
        MALE,
        FEMALE,
        UNKNOWN
    }

    static {
        try {
            C7913cr.m11625a().register(m11756a());
        } catch (Throwable unused) {
        }
        f14743b = "account";
        f14744c = "accountId";
        f14745d = HintConstants.AUTOFILL_HINT_NAME;
        f14746e = HintConstants.AUTOFILL_HINT_GENDER;
        f14747f = "age";
        f14748g = "type";
        f14749h = "accountCus";
        f14750i = "property1";
        f14751j = "property2";
        f14752k = "property3";
        f14753l = "property4";
        f14754m = "property5";
        f14755n = "property6";
        f14756o = "property7";
        f14757p = "property8";
        f14758q = "property9";
        f14759r = "property10";
        f14760t = AccsClientConfig.DEFAULT_CONFIG_TAG;
    }

    private C7940dr() {
    }

    /* renamed from: a */
    private boolean m11764a(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private void m11767b(Object obj, Object obj2, Object obj3, AbstractC7841a abstractC7841a) {
        try {
            m11768c();
            Map<String, Object> mapM11765b = m11765b();
            mapM11765b.putAll((Map) obj);
            JSONObject jSONObject = new JSONObject(mapM11765b);
            C7897cb.setUniversalProfileInfo(jSONObject.toString());
            C7982ff.m11972a().setProfile(jSONObject);
            m11758a(obj3, obj2, obj, abstractC7841a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m11768c() {
        try {
            String strM11402m = C7897cb.m11402m();
            if (strM11402m != null) {
                JSONObject jSONObject = new JSONObject(strM11402m);
                if (jSONObject.has(f14744c)) {
                    String string = jSONObject.getString(f14744c);
                    this.f14763s = string;
                    this.f14762A.put(f14744c, string);
                }
                if (jSONObject.has(f14745d)) {
                    Map<String, Object> map = this.f14762A;
                    String str = f14745d;
                    map.put(str, jSONObject.getString(str));
                }
                if (jSONObject.has(f14748g)) {
                    Map<String, Object> map2 = this.f14762A;
                    String str2 = f14748g;
                    map2.put(str2, Integer.valueOf(jSONObject.getInt(str2)));
                }
                if (jSONObject.has(f14746e)) {
                    Map<String, Object> map3 = this.f14762A;
                    String str3 = f14746e;
                    map3.put(str3, Integer.valueOf(jSONObject.getInt(str3)));
                }
                if (jSONObject.has(f14747f)) {
                    Map<String, Object> map4 = this.f14762A;
                    String str4 = f14747f;
                    map4.put(str4, Integer.valueOf(jSONObject.getInt(str4)));
                }
                if (jSONObject.has(f14750i)) {
                    Map<String, Object> map5 = this.f14762A;
                    String str5 = f14750i;
                    map5.put(str5, jSONObject.get(str5));
                }
                if (jSONObject.has(f14751j)) {
                    Map<String, Object> map6 = this.f14762A;
                    String str6 = f14751j;
                    map6.put(str6, jSONObject.get(str6));
                }
                if (jSONObject.has(f14752k)) {
                    Map<String, Object> map7 = this.f14762A;
                    String str7 = f14752k;
                    map7.put(str7, jSONObject.get(str7));
                }
                if (jSONObject.has(f14753l)) {
                    Map<String, Object> map8 = this.f14762A;
                    String str8 = f14753l;
                    map8.put(str8, jSONObject.get(str8));
                }
                if (jSONObject.has(f14754m)) {
                    Map<String, Object> map9 = this.f14762A;
                    String str9 = f14754m;
                    map9.put(str9, jSONObject.get(str9));
                }
                if (jSONObject.has(f14755n)) {
                    Map<String, Object> map10 = this.f14762A;
                    String str10 = f14755n;
                    map10.put(str10, jSONObject.get(str10));
                }
                if (jSONObject.has(f14756o)) {
                    Map<String, Object> map11 = this.f14762A;
                    String str11 = f14756o;
                    map11.put(str11, jSONObject.get(str11));
                }
                if (jSONObject.has(f14757p)) {
                    Map<String, Object> map12 = this.f14762A;
                    String str12 = f14757p;
                    map12.put(str12, jSONObject.get(str12));
                }
                if (jSONObject.has(f14758q)) {
                    Map<String, Object> map13 = this.f14762A;
                    String str13 = f14758q;
                    map13.put(str13, jSONObject.get(str13));
                }
                if (jSONObject.has(f14759r)) {
                    Map<String, Object> map14 = this.f14762A;
                    String str14 = f14759r;
                    map14.put(str14, jSONObject.get(str14));
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m11769d() {
        try {
            Map<String, Object> mapM11771f = m11771f();
            C8022zz.a aVar = new C8022zz.a();
            aVar.paraMap.put("apiType", 9);
            aVar.paraMap.put(DispatchConstants.DOMAIN, f14743b);
            aVar.paraMap.put("action", "update");
            aVar.paraMap.put("data", mapM11771f);
            C8022zz.m12134c().obtainMessage(102, aVar).sendToTarget();
            C7982ff.m11972a().setProfile(new JSONObject(mapM11771f));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private static void m11770e() {
        C7897cb.setLastRoleName(f14760t);
        C7897cb.m11384b(f14760t, f14761z.toString());
    }

    /* renamed from: f */
    private Map<String, Object> m11771f() {
        TreeMap treeMap = new TreeMap();
        try {
            treeMap.put(f14744c, this.f14763s);
            int i10 = this.f14766w;
            if (i10 != 0) {
                treeMap.put(f14747f, Integer.valueOf(i10));
            }
            if (!GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(this.f14764u.name())) {
                treeMap.put(f14746e, this.f14764u.name());
            }
            String str = this.f14765v;
            if (str != null) {
                treeMap.put(f14745d, str);
            }
            String str2 = this.f14767x;
            if (str2 != null) {
                treeMap.put(f14748g, str2);
            }
            JSONObject jSONObject = this.f14768y;
            if (jSONObject != null && jSONObject.length() > 0) {
                treeMap.put("custom", this.f14768y);
            }
        } catch (Throwable unused) {
        }
        return treeMap;
    }

    /* renamed from: g */
    private static Map<String, Object> m11772g() {
        TreeMap treeMap = new TreeMap();
        try {
            treeMap.put(HintConstants.AUTOFILL_HINT_NAME, f14760t);
            JSONObject jSONObject = f14761z;
            if (jSONObject != null && jSONObject.length() > 0) {
                treeMap.put("custom", f14761z);
            }
        } catch (Throwable unused) {
        }
        return treeMap;
    }

    /* renamed from: h */
    private static void m11773h() {
        try {
            C7982ff.m11972a().setSubprofile(new JSONObject(m11772g()));
            m11766b(null);
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventAccount(C8022zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 9) {
                    aVar.paraMap.get("account");
                    AbstractC7841a abstractC7841a = (AbstractC7841a) aVar.paraMap.get("service");
                    Object obj = aVar.paraMap.get("data");
                    Object obj2 = aVar.paraMap.get(DispatchConstants.DOMAIN);
                    Object obj3 = aVar.paraMap.get("action");
                    Object obj4 = aVar.paraMap.get("immediate");
                    try {
                        if (obj3 != null) {
                            if (!obj3.equals("login") && !obj3.equals(C7707c.JSON_CMD_REGISTER)) {
                                if (obj3.equals("roleCreate")) {
                                    m11761a(String.valueOf(aVar.paraMap.get("parameter")), abstractC7841a);
                                    return;
                                } else if (obj3.equals("update")) {
                                    m11767b(obj, obj3, obj2, abstractC7841a);
                                    return;
                                }
                            }
                            m11763a(String.valueOf(aVar.paraMap.get("accountId")), obj, obj3, obj2, aVar.paraMap.get("invitationCode"), aVar.paraMap.get("eventValue"), abstractC7841a);
                            return;
                        }
                        if (obj3 != null) {
                            m11758a(obj2, obj3, obj, abstractC7841a);
                            if (m11764a(obj4)) {
                                m11757a(abstractC7841a);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public void setAccountType(String str) {
        try {
            String str2 = this.f14767x;
            if (str2 == null || !str2.equalsIgnoreCase(str)) {
                this.f14767x = str;
                m11769d();
            }
        } catch (Throwable unused) {
        }
    }

    public void setAge(int i10) {
        try {
            if (this.f14766w != i10) {
                this.f14766w = i10;
                m11769d();
            }
        } catch (Throwable unused) {
        }
    }

    public void setGender(a aVar) {
        try {
            if (this.f14764u != aVar) {
                this.f14764u = aVar;
                m11769d();
            }
        } catch (Throwable unused) {
        }
    }

    public void setName(String str) {
        try {
            String str2 = this.f14765v;
            if (str2 == null || !str2.equalsIgnoreCase(str)) {
                this.f14765v = str;
                m11769d();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m11757a(AbstractC7841a abstractC7841a) {
        try {
            C7960ek c7960ek = new C7960ek();
            c7960ek.f14867b = C7960ek.a.IMMEDIATELY;
            c7960ek.f14866a = abstractC7841a;
            C7913cr.m11625a().post(c7960ek);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m11758a(Object obj, Object obj2, Object obj3, AbstractC7841a abstractC7841a) {
        m11759a(obj, obj2, obj3, null, abstractC7841a);
    }

    /* renamed from: a */
    public static void m11759a(Object obj, Object obj2, Object obj3, Object obj4, AbstractC7841a abstractC7841a) {
        if (abstractC7841a == null || obj == null || obj2 == null || !(obj instanceof String) || !(obj2 instanceof String)) {
            return;
        }
        C7961el c7961el = new C7961el();
        c7961el.f14869b = String.valueOf(obj);
        c7961el.f14870c = String.valueOf(obj2);
        if (obj3 != null && (obj3 instanceof Map)) {
            Map<String, Object> map = (Map) obj3;
            if (obj4 != null) {
                map.put("eventValue", obj4);
            }
            c7961el.f14871d = map;
        }
        c7961el.f14868a = abstractC7841a;
        C7913cr.m11625a().post(c7961el);
    }

    /* renamed from: b */
    private Map<String, Object> m11765b() {
        try {
            String str = this.f14763s;
            if (str != null) {
                this.f14762A.put(f14744c, str);
            }
        } catch (Throwable unused) {
        }
        return this.f14762A;
    }

    /* renamed from: b */
    public synchronized void m11777b(String str, String str2) {
        if (this.f14768y == null) {
            this.f14768y = new JSONObject();
        }
        try {
            this.f14768y.put(str, str2);
            m11769d();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public synchronized void m11776b(String str, int i10) {
        if (this.f14768y == null) {
            this.f14768y = new JSONObject();
        }
        try {
            this.f14768y.put(str, i10);
            m11769d();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m11762a(String str, Object obj, Object obj2, Object obj3, Object obj4, AbstractC7841a abstractC7841a) {
        m11763a(str, obj, obj2, obj3, obj4, null, abstractC7841a);
    }

    /* renamed from: a */
    private void m11763a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, AbstractC7841a abstractC7841a) {
        try {
            m11768c();
            String str2 = this.f14763s;
            if (str2 != null && !str2.equals(str)) {
                this.f14762A.clear();
            }
            this.f14763s = str;
            TreeMap treeMap = new TreeMap();
            treeMap.put(f14744c, this.f14763s);
            treeMap.putAll((Map) obj);
            if (obj4 != null) {
                treeMap.put("invitationCode", String.valueOf(obj4));
            }
            this.f14762A.putAll(treeMap);
            JSONObject jSONObject = new JSONObject(this.f14762A);
            C7897cb.setUniversalProfileInfo(jSONObject.toString());
            C7982ff.m11972a().setProfile(jSONObject);
            m11759a(obj3, obj2, treeMap, obj5, abstractC7841a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m11766b(AbstractC7841a abstractC7841a) {
        try {
            Map<String, Object> mapM11772g = m11772g();
            C7982ff.m11972a().setSubprofile(new JSONObject(mapM11772g));
            m11758a(f14743b, "roleUpdate", mapM11772g, abstractC7841a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m11760a(String str) {
        try {
            this.f14763s = str;
            String strM11374a = C7897cb.m11374a(str);
            if (strM11374a != null) {
                JSONObject jSONObject = new JSONObject(strM11374a);
                if (jSONObject.has(f14745d)) {
                    this.f14765v = jSONObject.getString(f14745d);
                }
                if (jSONObject.has(f14746e)) {
                    this.f14764u = a.valueOf(jSONObject.getString(f14746e));
                }
                if (jSONObject.has(f14747f)) {
                    this.f14766w = jSONObject.getInt(f14747f);
                }
                if (jSONObject.has(f14748g)) {
                    this.f14767x = jSONObject.getString(f14748g);
                }
                if (jSONObject.has(f14749h)) {
                    this.f14768y = jSONObject.getJSONObject(f14749h);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static synchronized void m11761a(String str, AbstractC7841a abstractC7841a) {
        try {
            f14761z = new JSONObject();
            f14760t = str;
            Map<String, Object> mapM11772g = m11772g();
            m11758a(f14743b, "roleCreate", mapM11772g, abstractC7841a);
            C7982ff.m11972a().setSubprofile(new JSONObject(mapM11772g));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void m11775a(String str, String str2) {
        if (f14761z == null) {
            f14761z = new JSONObject();
        }
        try {
            f14761z.put(str, str2);
            m11770e();
            m11773h();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void m11774a(String str, int i10) {
        if (f14761z == null) {
            f14761z = new JSONObject();
        }
        try {
            f14761z.put(str, i10);
            m11770e();
            m11773h();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C7940dr m11756a() {
        if (f14742a == null) {
            synchronized (C7940dr.class) {
                try {
                    if (f14742a == null) {
                        f14742a = new C7940dr();
                    }
                } finally {
                }
            }
        }
        return f14742a;
    }
}

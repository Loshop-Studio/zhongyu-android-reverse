package com.tendcloud.tenddata;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fi */
/* loaded from: classes5.dex */
public class C7985fi extends AbstractC7987fk {

    /* renamed from: a */
    private static HashMap<String, Object> f14941a = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, Object> f14942c = new HashMap<>();

    /* renamed from: f */
    private static volatile C7985fi f14943f = null;

    /* renamed from: d */
    private final String[] f14944d = {"PUSH", "EAuth"};

    /* renamed from: e */
    private final String[] f14945e = {GrsBaseInfo.CountryCodeSource.APP, "TRACKING", "GAME", "BG", "SDK"};

    private C7985fi() {
        m11979a("displayName", C7894bz.m11353a().m11362h(C7843ab.f14307g));
        m11979a("globalId", C7894bz.m11353a().m11355a(C7843ab.f14307g));
        m11979a("versionName", C7897cb.m11400k());
        m11979a("versionCode", Integer.valueOf(C7897cb.m11399j()));
        m11979a("installTime", Long.valueOf(C7894bz.m11353a().m11358d(C7843ab.f14307g)));
        m11979a("updateTime", Long.valueOf(C7894bz.m11353a().m11359e(C7843ab.f14307g)));
    }

    /* renamed from: c */
    private ArrayList<AbstractC7841a> m11976c() {
        ArrayList<AbstractC7841a> arrayList = new ArrayList<>();
        try {
            Iterator<Map.Entry<String, Object>> it = f14941a.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC7841a.valueOf(it.next().getKey().toString()));
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m11977a(Object obj, AbstractC7841a abstractC7841a) {
        f14941a.put(abstractC7841a.name(), obj);
    }

    /* renamed from: b */
    public void m11978b(Object obj, AbstractC7841a abstractC7841a) {
        f14942c.put(abstractC7841a.name(), obj);
    }

    public void setAppChannel(String str) {
        m11979a("channel", str);
    }

    public void setSubmitAppId(AbstractC7841a abstractC7841a) {
        if (abstractC7841a != null) {
            try {
                Object objM11975a = f14941a.get(abstractC7841a.name());
                if (objM11975a == null && f14941a.size() > 0) {
                    objM11975a = m11975a(abstractC7841a);
                }
                m11979a(Constants.KEY_APP_KEY, objM11975a);
            } catch (Throwable unused) {
            }
        }
    }

    public void setSubmitChannelId(AbstractC7841a abstractC7841a) {
        if (abstractC7841a == null) {
            setAppChannel("Default");
            return;
        }
        try {
            Object obj = f14942c.get(abstractC7841a.name());
            if (obj == null && f14942c.size() > 0) {
                obj = f14942c.get(m11976c().get(0).name());
            }
            m11979a("channel", obj);
        } catch (Throwable unused) {
        }
    }

    public void setUniqueId(String str) {
        m11979a("uniqueId", str);
    }

    /* renamed from: a */
    private Object m11975a(AbstractC7841a abstractC7841a) {
        if (abstractC7841a == null) {
            return null;
        }
        try {
            if (!Arrays.asList(this.f14944d).contains(abstractC7841a.name())) {
                if (!Arrays.asList(this.f14945e).contains(abstractC7841a.name())) {
                    return f14941a.get(m11976c().get(0).name());
                }
                String strM11027a = C7843ab.m11027a(C7843ab.f14307g, abstractC7841a);
                if (!C7912cq.m11608b(strM11027a)) {
                    m11977a((Object) strM11027a, abstractC7841a);
                }
                return strM11027a;
            }
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.KEY_APP_KEY, (Object) null);
            jSONObject.put("service", (Object) null);
            jSONArray.put(jSONObject);
            try {
                if (C7912cq.m11608b((String) null)) {
                    return jSONArray;
                }
                m11977a(jSONArray, abstractC7841a);
                return jSONArray;
            } catch (Throwable unused) {
                return jSONArray;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static C7985fi m11974a() {
        if (f14943f == null) {
            synchronized (C7978fb.class) {
                try {
                    if (f14943f == null) {
                        f14943f = new C7985fi();
                    }
                } finally {
                }
            }
        }
        return f14943f;
    }
}

package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.q */
/* loaded from: classes2.dex */
public class C3400q {

    /* renamed from: a */
    private static final int f2306a = 0;

    /* renamed from: b */
    private static final int f2307b = 1;

    /* renamed from: c */
    private static final int f2308c = 2;

    /* renamed from: d */
    private static final int f2309d = 3;

    /* renamed from: e */
    private final long f2310e;

    /* renamed from: com.umeng.analytics.pro.q$a */
    public static class a {

        /* renamed from: a */
        public static final C3400q f2311a = new C3400q();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3400q m3290a() {
        return a.f2311a;
    }

    /* renamed from: c */
    private JSONArray m3293c() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C3407x.m3344a().m3359d(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C3380c.f2023p, jCurrentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    /* renamed from: b */
    public void m3296b(JSONObject jSONObject, Context context) throws JSONException {
        int iM3294a = m3294a(context);
        if (iM3294a == 1) {
            if (jSONObject.has(C3380c.f1959L)) {
                jSONObject.remove(C3380c.f1959L);
            }
            if (jSONObject.has(C3380c.f2021n)) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(C3380c.f2021n);
                    int length = jSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        if (jSONObject2.has(C3380c.f2003au)) {
                            jSONObject2.remove(C3380c.f2003au);
                        }
                        if (jSONObject2.has(C3380c.f2004av)) {
                            jSONObject2.remove(C3380c.f2004av);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            C3391h.m3158a(context).m3175a(false, true);
            return;
        }
        if (iM3294a == 2) {
            if (jSONObject.has(C3380c.f1959L)) {
                jSONObject.remove(C3380c.f1959L);
            }
            if (jSONObject.has(C3380c.f2021n)) {
                jSONObject.remove(C3380c.f2021n);
            }
            try {
                jSONObject.put(C3380c.f2021n, m3293c());
            } catch (Exception unused2) {
            }
            C3391h.m3158a(context).m3175a(false, true);
            return;
        }
        if (iM3294a == 3) {
            if (jSONObject.has(C3380c.f1959L)) {
                jSONObject.remove(C3380c.f1959L);
            }
            jSONObject.remove(C3380c.f2021n);
            C3391h.m3158a(context).m3175a(false, true);
        }
    }

    private C3400q() {
        this.f2310e = 60000L;
    }

    /* renamed from: a */
    public int m3294a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    /* renamed from: a */
    private void m3291a(JSONObject jSONObject, boolean z3) {
        if (!z3 && jSONObject.has(C3380c.f2021n)) {
            jSONObject.remove(C3380c.f2021n);
        }
        if (jSONObject.has(C3380c.f1959L)) {
            jSONObject.remove(C3380c.f1959L);
        }
        if (jSONObject.has(C3380c.f1962O)) {
            jSONObject.remove(C3380c.f1962O);
        }
        if (jSONObject.has("ekv")) {
            jSONObject.remove("ekv");
        }
        if (jSONObject.has(C3380c.f1967T)) {
            jSONObject.remove(C3380c.f1967T);
        }
        if (jSONObject.has(C3380c.f1959L)) {
            jSONObject.remove(C3380c.f1959L);
        }
        if (jSONObject.has("userlevel")) {
            jSONObject.remove("userlevel");
        }
    }

    /* renamed from: a */
    public void m3295a(JSONObject jSONObject, Context context) throws JSONException {
        int iM3294a = m3294a(context);
        if (iM3294a == 1) {
            m3291a(jSONObject, true);
            C3391h.m3158a(context).m3181b(false, true);
        } else {
            if (iM3294a == 2) {
                jSONObject.remove(C3380c.f2021n);
                try {
                    jSONObject.put(C3380c.f2021n, m3292b());
                } catch (Exception unused) {
                }
                m3291a(jSONObject, true);
                C3391h.m3158a(context).m3181b(false, true);
                return;
            }
            if (iM3294a == 3) {
                m3291a(jSONObject, false);
                C3391h.m3158a(context).m3181b(false, true);
            }
        }
    }

    /* renamed from: b */
    private JSONArray m3292b() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C3407x.m3344a().m3351a(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C3380c.f2023p, jCurrentTimeMillis);
            jSONObject.put(C3380c.f2024q, jCurrentTimeMillis + 60000);
            jSONObject.put("duration", 60000L);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}

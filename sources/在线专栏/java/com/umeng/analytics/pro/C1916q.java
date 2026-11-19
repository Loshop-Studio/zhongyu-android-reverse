package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.q */
/* loaded from: classes.dex */
public class C1916q {

    /* renamed from: a */
    private static final int f8898a = 0;

    /* renamed from: b */
    private static final int f8899b = 1;

    /* renamed from: c */
    private static final int f8900c = 2;

    /* renamed from: d */
    private static final int f8901d = 3;

    /* renamed from: e */
    private final long f8902e;

    /* renamed from: com.umeng.analytics.pro.q$a */
    private static class a {

        /* renamed from: a */
        public static final C1916q f8903a = new C1916q();

        private a() {
        }
    }

    /* renamed from: a */
    public static C1916q m7213a() {
        return a.f8903a;
    }

    /* renamed from: c */
    private JSONArray m7216c() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C1923x.m7267a().m7282d(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C1896c.f8615p, jCurrentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    /* renamed from: b */
    public void m7219b(JSONObject jSONObject, Context context) throws JSONException {
        int iM7217a = m7217a(context);
        if (iM7217a == 1) {
            if (jSONObject.has(C1896c.f8551L)) {
                jSONObject.remove(C1896c.f8551L);
            }
            if (jSONObject.has(C1896c.f8613n)) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(C1896c.f8613n);
                    int length = jSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        if (jSONObject2.has(C1896c.f8595au)) {
                            jSONObject2.remove(C1896c.f8595au);
                        }
                        if (jSONObject2.has(C1896c.f8596av)) {
                            jSONObject2.remove(C1896c.f8596av);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            C1907h.m7081a(context).m7098a(false, true);
            return;
        }
        if (iM7217a == 2) {
            if (jSONObject.has(C1896c.f8551L)) {
                jSONObject.remove(C1896c.f8551L);
            }
            if (jSONObject.has(C1896c.f8613n)) {
                jSONObject.remove(C1896c.f8613n);
            }
            try {
                jSONObject.put(C1896c.f8613n, m7216c());
            } catch (Exception unused2) {
            }
            C1907h.m7081a(context).m7098a(false, true);
            return;
        }
        if (iM7217a == 3) {
            if (jSONObject.has(C1896c.f8551L)) {
                jSONObject.remove(C1896c.f8551L);
            }
            jSONObject.remove(C1896c.f8613n);
            C1907h.m7081a(context).m7098a(false, true);
        }
    }

    private C1916q() {
        this.f8902e = 60000L;
    }

    /* renamed from: a */
    public int m7217a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    /* renamed from: a */
    private void m7214a(JSONObject jSONObject, boolean z3) {
        if (!z3 && jSONObject.has(C1896c.f8613n)) {
            jSONObject.remove(C1896c.f8613n);
        }
        if (jSONObject.has(C1896c.f8551L)) {
            jSONObject.remove(C1896c.f8551L);
        }
        if (jSONObject.has("error")) {
            jSONObject.remove("error");
        }
        if (jSONObject.has("ekv")) {
            jSONObject.remove("ekv");
        }
        if (jSONObject.has(C1896c.f8559T)) {
            jSONObject.remove(C1896c.f8559T);
        }
        if (jSONObject.has(C1896c.f8551L)) {
            jSONObject.remove(C1896c.f8551L);
        }
        if (jSONObject.has("userlevel")) {
            jSONObject.remove("userlevel");
        }
    }

    /* renamed from: a */
    public void m7218a(JSONObject jSONObject, Context context) throws JSONException {
        int iM7217a = m7217a(context);
        if (iM7217a == 1) {
            m7214a(jSONObject, true);
            C1907h.m7081a(context).m7104b(false, true);
        } else {
            if (iM7217a == 2) {
                jSONObject.remove(C1896c.f8613n);
                try {
                    jSONObject.put(C1896c.f8613n, m7215b());
                } catch (Exception unused) {
                }
                m7214a(jSONObject, true);
                C1907h.m7081a(context).m7104b(false, true);
                return;
            }
            if (iM7217a == 3) {
                m7214a(jSONObject, false);
                C1907h.m7081a(context).m7104b(false, true);
            }
        }
    }

    /* renamed from: b */
    private JSONArray m7215b() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C1923x.m7267a().m7274a(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C1896c.f8615p, jCurrentTimeMillis);
            jSONObject.put(C1896c.f8616q, jCurrentTimeMillis + 60000);
            jSONObject.put("duration", 60000L);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}

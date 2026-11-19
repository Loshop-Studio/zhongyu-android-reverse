package p114g2;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.C6772g;
import com.umeng.analytics.pro.C6773h;
import com.umeng.commonsdk.framework.AbstractC6782a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p240s2.C9468a;

/* renamed from: g2.n0 */
/* loaded from: classes4.dex */
public class C8030n0 {

    /* renamed from: a */
    public final long f13611a;

    /* renamed from: g2.n0$b */
    public static class b {

        /* renamed from: a */
        public static final C8030n0 f13612a = new C8030n0();
    }

    /* renamed from: b */
    public static C8030n0 m12698b() {
        return b.f13612a;
    }

    /* renamed from: a */
    public int m12699a(Context context) {
        return Integer.valueOf(AbstractC6782a.m6274h(context, "defcon", String.valueOf(0))).intValue();
    }

    /* renamed from: c */
    public void m12700c(JSONObject jSONObject, Context context) throws JSONException {
        int iM12699a = m12699a(context);
        if (iM12699a == 1) {
            m12701d(jSONObject, true);
            C6773h.m6194b(context).m6219t(false, true);
        } else {
            if (iM12699a == 2) {
                jSONObject.remove("sessions");
                try {
                    jSONObject.put("sessions", m12702e());
                } catch (Exception unused) {
                }
                m12701d(jSONObject, true);
                C6773h.m6194b(context).m6219t(false, true);
                return;
            }
            if (iM12699a == 3) {
                m12701d(jSONObject, false);
                C6773h.m6194b(context).m6219t(false, true);
            }
        }
    }

    /* renamed from: d */
    public final void m12701d(JSONObject jSONObject, boolean z9) {
        if (!z9 && jSONObject.has("sessions")) {
            jSONObject.remove("sessions");
        }
        if (jSONObject.has("active_user")) {
            jSONObject.remove("active_user");
        }
        if (jSONObject.has("error")) {
            jSONObject.remove("error");
        }
        if (jSONObject.has("ekv")) {
            jSONObject.remove("ekv");
        }
        if (jSONObject.has("gkv")) {
            jSONObject.remove("gkv");
        }
        if (jSONObject.has("active_user")) {
            jSONObject.remove("active_user");
        }
        if (jSONObject.has("userlevel")) {
            jSONObject.remove("userlevel");
        }
    }

    /* renamed from: e */
    public final JSONArray m12702e() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C6772g.m6179b().m6181c(C9468a.m15647b(null)));
            jSONObject.put("start_time", jCurrentTimeMillis);
            jSONObject.put("end_time", jCurrentTimeMillis + 60000);
            jSONObject.put(TypedValues.TransitionType.S_DURATION, 60000L);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    /* renamed from: f */
    public void m12703f(JSONObject jSONObject, Context context) {
        int iM12699a = m12699a(context);
        if (iM12699a == 1) {
            if (jSONObject.has("active_user")) {
                jSONObject.remove("active_user");
            }
            if (jSONObject.has("sessions")) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("sessions");
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                        if (jSONObject2.has("_$sp")) {
                            jSONObject2.remove("_$sp");
                        }
                        if (jSONObject2.has("_$pp")) {
                            jSONObject2.remove("_$pp");
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            C6773h.m6194b(context).m6209j(false, true);
            return;
        }
        if (iM12699a == 2) {
            if (jSONObject.has("active_user")) {
                jSONObject.remove("active_user");
            }
            if (jSONObject.has("sessions")) {
                jSONObject.remove("sessions");
            }
            try {
                jSONObject.put("sessions", m12704g());
            } catch (Exception unused2) {
            }
            C6773h.m6194b(context).m6209j(false, true);
            return;
        }
        if (iM12699a == 3) {
            if (jSONObject.has("active_user")) {
                jSONObject.remove("active_user");
            }
            jSONObject.remove("sessions");
            C6773h.m6194b(context).m6209j(false, true);
        }
    }

    /* renamed from: g */
    public final JSONArray m12704g() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C6772g.m6179b().m6187i(C9468a.m15647b(null)));
            jSONObject.put("start_time", jCurrentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    public C8030n0() {
        this.f13611a = 60000L;
    }
}

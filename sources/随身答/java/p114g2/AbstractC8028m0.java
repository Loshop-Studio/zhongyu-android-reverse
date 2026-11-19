package p114g2;

import android.content.Context;
import com.umeng.analytics.pro.C6773h;
import org.json.JSONArray;
import org.json.JSONObject;
import p176m2.AbstractC8959h;

/* renamed from: g2.m0 */
/* loaded from: classes4.dex */
public abstract class AbstractC8028m0 {
    /* renamed from: a */
    public static long m12686a(JSONArray jSONArray) {
        return jSONArray.toString().getBytes().length;
    }

    /* renamed from: b */
    public static long m12687b(JSONObject jSONObject) {
        return jSONObject.toString().getBytes().length;
    }

    /* renamed from: c */
    public static JSONObject m12688c(Context context, long j9, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!jSONObject.has("content")) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("content");
            if (jSONObject3.has("analytics")) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject("analytics");
                if (jSONObject4.has("ekv")) {
                    jSONObject4.remove("ekv");
                }
                if (jSONObject4.has("gkv")) {
                    jSONObject4.remove("gkv");
                }
                if (jSONObject4.has("error")) {
                    jSONObject4.remove("error");
                }
                jSONObject3.put("analytics", jSONObject4);
            }
            jSONObject2.put("content", jSONObject3);
            if (jSONObject.has("header")) {
                jSONObject2.put("header", jSONObject.getJSONObject("header"));
            }
            if (m12687b(jSONObject2) <= j9) {
                return jSONObject2;
            }
            jSONObject2 = null;
            C6773h.m6194b(context).m6198D();
            C6773h.m6194b(context).m6197C();
            C6773h.m6194b(context).m6219t(true, false);
            C6773h.m6194b(context).m6204e();
            AbstractC8959h.m14293c("MobclickRT", "--->>> u-app packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }
}

package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMRTLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.p */
/* loaded from: classes2.dex */
public class C3399p {
    /* renamed from: a */
    public static JSONObject m3289a(Context context, long j4, JSONObject jSONObject) {
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
                if (jSONObject4.has(C3380c.f1967T)) {
                    jSONObject4.remove(C3380c.f1967T);
                }
                if (jSONObject4.has(C3380c.f1962O)) {
                    jSONObject4.remove(C3380c.f1962O);
                }
                jSONObject3.put("analytics", jSONObject4);
            }
            jSONObject2.put("content", jSONObject3);
            if (jSONObject.has("header")) {
                jSONObject2.put("header", jSONObject.getJSONObject("header"));
            }
            if (m3288a(jSONObject2) <= j4) {
                return jSONObject2;
            }
            jSONObject2 = null;
            C3391h.m3158a(context).m3190i();
            C3391h.m3158a(context).m3189h();
            C3391h.m3158a(context).m3181b(true, false);
            C3391h.m3158a(context).m3172a();
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> u-app packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }

    /* renamed from: a */
    public static long m3288a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes().length;
    }

    /* renamed from: a */
    public static long m3287a(JSONArray jSONArray) {
        return jSONArray.toString().getBytes().length;
    }
}

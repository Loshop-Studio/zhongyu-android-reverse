package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMRTLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.p */
/* loaded from: classes.dex */
public class C1915p {
    /* renamed from: a */
    public static JSONObject m7212a(Context context, long j4, JSONObject jSONObject) {
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
                if (jSONObject4.has(C1896c.f8559T)) {
                    jSONObject4.remove(C1896c.f8559T);
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
            if (m7211a(jSONObject2) <= j4) {
                return jSONObject2;
            }
            jSONObject2 = null;
            C1907h.m7081a(context).m7113i();
            C1907h.m7081a(context).m7112h();
            C1907h.m7081a(context).m7104b(true, false);
            C1907h.m7081a(context).m7095a();
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> u-app packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }

    /* renamed from: a */
    public static long m7211a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes().length;
    }

    /* renamed from: a */
    public static long m7210a(JSONArray jSONArray) {
        return jSONArray.toString().getBytes().length;
    }
}

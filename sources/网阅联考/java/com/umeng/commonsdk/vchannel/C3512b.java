package com.umeng.commonsdk.vchannel;

import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.vchannel.b */
/* loaded from: classes2.dex */
public class C3512b {

    /* renamed from: b */
    private String f3042b;

    /* renamed from: a */
    private String f3041a = "_$unknown";

    /* renamed from: c */
    private long f3043c = 0;

    /* renamed from: d */
    private long f3044d = 0;

    /* renamed from: e */
    private String f3045e = C3511a.f3040j;

    /* renamed from: f */
    private Map<String, Object> f3046f = null;

    public C3512b(Context context) {
        this.f3042b = UMGlobalContext.getInstance(context).getProcessName(context);
    }

    /* renamed from: a */
    public String m4009a() {
        return this.f3041a;
    }

    /* renamed from: b */
    public long m4013b() {
        return this.f3043c;
    }

    /* renamed from: c */
    public Map<String, Object> m4014c() {
        return this.f3046f;
    }

    /* renamed from: d */
    public JSONObject m4015d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f3041a);
            jSONObject.put("pn", this.f3042b);
            jSONObject.put("ds", this.f3044d);
            jSONObject.put("ts", this.f3043c);
            Map<String, Object> map = this.f3046f;
            if (map != null && map.size() > 0) {
                for (String str : this.f3046f.keySet()) {
                    jSONObject.put(str, this.f3046f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f3045e, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ekv", jSONArray2);
            return jSONObject3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append("id:" + this.f3041a + ",");
        sb.append("pn:" + this.f3042b + ",");
        sb.append("ts:" + this.f3043c + ",");
        Map<String, Object> map = this.f3046f;
        if (map != null && map.size() > 0) {
            for (String str : this.f3046f.keySet()) {
                Object obj = this.f3046f.get(str);
                sb.append(obj == null ? str + ": null," : str + ": " + obj.toString() + ",");
            }
        }
        sb.append("ds:" + this.f3044d + "]");
        return sb.toString();
    }

    /* renamed from: a */
    public void m4011a(String str) {
        this.f3041a = str;
    }

    /* renamed from: a */
    public void m4010a(long j4) {
        this.f3043c = j4;
    }

    /* renamed from: a */
    public void m4012a(Map<String, Object> map) {
        this.f3046f = map;
    }
}

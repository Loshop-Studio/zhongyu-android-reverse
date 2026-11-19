package com.umeng.commonsdk.vchannel;

import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.vchannel.b */
/* loaded from: classes.dex */
public class C2028b {

    /* renamed from: b */
    private String f9634b;

    /* renamed from: a */
    private String f9633a = "_$unknown";

    /* renamed from: c */
    private long f9635c = 0;

    /* renamed from: d */
    private long f9636d = 0;

    /* renamed from: e */
    private String f9637e = C2027a.f9632j;

    /* renamed from: f */
    private Map<String, Object> f9638f = null;

    public C2028b(Context context) {
        this.f9634b = UMGlobalContext.getInstance(context).getProcessName(context);
    }

    /* renamed from: a */
    public String m7932a() {
        return this.f9633a;
    }

    /* renamed from: b */
    public long m7936b() {
        return this.f9635c;
    }

    /* renamed from: c */
    public Map<String, Object> m7937c() {
        return this.f9638f;
    }

    /* renamed from: d */
    public JSONObject m7938d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f9633a);
            jSONObject.put("pn", this.f9634b);
            jSONObject.put("ds", this.f9636d);
            jSONObject.put("ts", this.f9635c);
            Map<String, Object> map = this.f9638f;
            if (map != null && map.size() > 0) {
                for (String str : this.f9638f.keySet()) {
                    jSONObject.put(str, this.f9638f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f9637e, jSONArray);
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
        sb.append("id:" + this.f9633a + ",");
        sb.append("pn:" + this.f9634b + ",");
        sb.append("ts:" + this.f9635c + ",");
        Map<String, Object> map = this.f9638f;
        if (map != null && map.size() > 0) {
            for (String str : this.f9638f.keySet()) {
                Object obj = this.f9638f.get(str);
                sb.append(obj == null ? str + ": null," : str + ": " + obj.toString() + ",");
            }
        }
        sb.append("ds:" + this.f9636d + "]");
        return sb.toString();
    }

    /* renamed from: a */
    public void m7934a(String str) {
        this.f9633a = str;
    }

    /* renamed from: a */
    public void m7933a(long j4) {
        this.f9635c = j4;
    }

    /* renamed from: a */
    public void m7935a(Map<String, Object> map) {
        this.f9638f = map;
    }
}

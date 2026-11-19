package p303q5;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q5.d */
/* loaded from: classes5.dex */
public class C10740d {

    /* renamed from: a */
    public String f25863a;

    /* renamed from: b */
    public Map f25864b;

    /* renamed from: a */
    public Map m22819a() {
        return this.f25864b;
    }

    /* renamed from: b */
    public void m22820b(String str) {
        this.f25863a = str;
    }

    /* renamed from: c */
    public void m22821c(Map map) {
        this.f25864b = map;
    }

    /* renamed from: d */
    public String m22822d() {
        return this.f25863a;
    }

    /* renamed from: e */
    public JSONObject m22823e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("countryGroup", this.f25863a);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f25864b.keySet()) {
            jSONObject2.put(str, (String) this.f25864b.get(str));
        }
        jSONObject.put("addresses", jSONObject2);
        return jSONObject;
    }
}

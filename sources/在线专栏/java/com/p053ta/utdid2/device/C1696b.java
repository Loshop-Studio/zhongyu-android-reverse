package com.p053ta.utdid2.device;

import com.p053ta.p054a.p056b.C1679e;
import com.p053ta.p054a.p057c.C1688f;
import com.taobao.accs.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ta.utdid2.device.b */
/* loaded from: classes.dex */
class C1696b {

    /* renamed from: d */
    int f7471d = -1;

    C1696b() {
    }

    /* renamed from: a */
    static C1696b m5793a(String str) throws JSONException {
        JSONObject jSONObject;
        C1696b c1696b = new C1696b();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has(Constants.KEY_HTTP_CODE)) {
                c1696b.f7471d = jSONObject2.getInt(Constants.KEY_HTTP_CODE);
            }
            if (jSONObject2.has(Constants.KEY_DATA) && (jSONObject = jSONObject2.getJSONObject(Constants.KEY_DATA)) != null && jSONObject.has("utdid")) {
                String string = jSONObject.getString("utdid");
                if (C1698d.m5806c(string)) {
                    C1679e.m5742a(string);
                }
            }
            C1688f.m5770a("BizResponse", "content", str);
        } catch (JSONException e4) {
            C1688f.m5770a("", e4.toString());
        }
        return c1696b;
    }

    /* renamed from: a */
    static boolean m5794a(int i4) {
        return i4 >= 0 && i4 != 10012;
    }
}

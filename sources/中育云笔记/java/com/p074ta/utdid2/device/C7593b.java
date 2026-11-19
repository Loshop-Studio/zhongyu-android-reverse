package com.p074ta.utdid2.device;

import com.p074ta.p075a.p077b.C7576e;
import com.p074ta.p075a.p078c.C7585f;
import com.taobao.accs.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ta.utdid2.device.b */
/* loaded from: classes5.dex */
class C7593b {

    /* renamed from: d */
    int f12869d = -1;

    /* renamed from: a */
    public static boolean m9820a(int i10) {
        return i10 >= 0 && i10 != 10012;
    }

    /* renamed from: a */
    public static C7593b m9819a(String str) throws JSONException {
        JSONObject jSONObject;
        C7593b c7593b = new C7593b();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has(Constants.KEY_HTTP_CODE)) {
                c7593b.f12869d = jSONObject2.getInt(Constants.KEY_HTTP_CODE);
            }
            if (jSONObject2.has("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && jSONObject.has("utdid")) {
                String string = jSONObject.getString("utdid");
                if (C7595d.m9832c(string)) {
                    C7576e.m9768a(string);
                }
            }
            C7585f.m9796a("BizResponse", "content", str);
            return c7593b;
        } catch (JSONException e10) {
            C7585f.m9796a("", e10.toString());
            return c7593b;
        }
    }
}

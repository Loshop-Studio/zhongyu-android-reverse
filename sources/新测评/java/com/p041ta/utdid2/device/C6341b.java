package com.p041ta.utdid2.device;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p074e2.C7329a;
import p118i2.AbstractC7657e;
import p129j2.AbstractC7788h;

/* renamed from: com.ta.utdid2.device.b */
/* loaded from: classes4.dex */
class C6341b {

    /* renamed from: e */
    int f4826e = -1;

    /* renamed from: a */
    public static C6341b m4502a(String str) throws JSONException {
        JSONObject jSONObject;
        C6341b c6341b = new C6341b();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("code")) {
                c6341b.f4826e = jSONObject2.getInt("code");
            }
            if (jSONObject2.has("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && jSONObject.has("utdid")) {
                String string = jSONObject.getString("utdid");
                if (C6342c.m4509c(string)) {
                    Context contextM11713f = C7329a.m11708b().m11713f();
                    AbstractC7657e.m12713c(string);
                    AbstractC7657e.m12712b(contextM11713f, string);
                    AbstractC7657e.m12716f(string);
                }
            }
            AbstractC7788h.m13179e("BizResponse", "content", str);
            return c6341b;
        } catch (JSONException e10) {
            AbstractC7788h.m13179e("", e10.toString());
            return c6341b;
        }
    }

    /* renamed from: b */
    public static boolean m4503b(int i10) {
        return i10 >= 0 && i10 != 10012;
    }
}

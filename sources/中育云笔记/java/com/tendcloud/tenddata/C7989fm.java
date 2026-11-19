package com.tendcloud.tenddata;

import com.taobao.accs.common.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fm */
/* loaded from: classes5.dex */
public class C7989fm extends AbstractC7987fk {

    /* renamed from: a */
    public static final String f14961a = "accounts";

    /* renamed from: a */
    public void m11984a() {
        m11979a(f14961a, C7911cp.m11582d(C7843ab.f14307g));
    }

    /* renamed from: c */
    public void m11985c() {
        try {
            JSONObject jSONObject = (JSONObject) mo11973b();
            if (jSONObject.has(f14961a)) {
                JSONArray jSONArray = jSONObject.getJSONArray(f14961a);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if ("sim".equals(jSONArray.getJSONObject(i10).getString("type"))) {
                        JSONArray jSONArrayM11806a = C7943du.m11787a().m11806a("IMEI", C7999fw.m12011b().f14992a, C7999fw.m12011b().f14993b);
                        if (jSONArrayM11806a != null) {
                            jSONArray.getJSONObject(i10).put("extra", C7903ch.m11503A(C7843ab.f14307g));
                            if (jSONArrayM11806a.length() > 0) {
                                C7999fw.m12011b().m12016a("IMEI", jSONArrayM11806a);
                            }
                        } else {
                            JSONArray jSONArray2 = jSONArray.getJSONObject(i10).getJSONArray("extra");
                            if (jSONArray2 != null) {
                                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                                    m11980a(Constants.KEY_IMEI, jSONArray2.getJSONObject(i11));
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public void m11986d() {
        try {
            if (((JSONObject) mo11973b()).has(f14961a)) {
                return;
            }
            m11979a(f14961a, C7911cp.m11582d(C7843ab.f14307g));
        } catch (Throwable unused) {
        }
    }

    public void setUserAccount(C7983fg c7983fg) {
        if (c7983fg == null || c7983fg.mo11973b() == null) {
            return;
        }
        if (this.f14946b.isNull(f14961a)) {
            new JSONArray().put(c7983fg.mo11973b());
            m11979a(f14961a, c7983fg.mo11973b());
        } else {
            try {
                this.f14946b.getJSONArray(f14961a).put(c7983fg.mo11973b());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }
}

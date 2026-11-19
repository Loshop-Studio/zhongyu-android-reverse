package com.tendcloud.tenddata;

import com.taobao.accs.common.Constants;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fo */
/* loaded from: classes5.dex */
public class C7991fo extends AbstractC7987fk {
    public C7991fo() {
        m11979a(AgooConstants.MESSAGE_BODY_GROUP, C7898cc.m11411a(C7843ab.f14307g));
    }

    /* renamed from: a */
    public void m11988a() throws JSONException {
        m11979a("serialNo", C7900ce.m11481a("serialNo"));
        JSONArray jSONArrayM11805a = C7943du.m11787a().m11805a("AdID");
        if (jSONArrayM11805a != null) {
            m11979a("adId", C7900ce.m11486b(C7843ab.f14307g));
            if (jSONArrayM11805a.length() > 0) {
                C7999fw.m12011b().m12016a("AdID", jSONArrayM11805a);
            }
        } else {
            m11980a("adId", this.f14946b);
        }
        JSONArray jSONArrayM11806a = C7943du.m11787a().m11806a("IMEI", C7999fw.m12011b().f14992a, C7999fw.m12011b().f14993b);
        if (jSONArrayM11806a != null) {
            try {
                JSONArray jSONArrayM11503A = C7903ch.m11503A(C7843ab.f14307g);
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                JSONArray jSONArray4 = new JSONArray();
                if (jSONArrayM11503A != null && jSONArrayM11503A.length() > 0) {
                    JSONObject jSONObject = jSONArrayM11503A.getJSONObject(0);
                    if (jSONObject.has(Constants.KEY_IMEI)) {
                        jSONArray.put(jSONObject.get(Constants.KEY_IMEI));
                    }
                    if (jSONObject.has("imei5")) {
                        jSONArray2.put(jSONObject.get("imei5"));
                    }
                    if (jSONObject.has("meid")) {
                        jSONArray3.put(jSONObject.get("meid"));
                    }
                    if (jSONObject.has("meid5")) {
                        jSONArray4.put(jSONObject.get("meid5"));
                    }
                    if (jSONArrayM11503A.length() == 2) {
                        JSONObject jSONObject2 = jSONArrayM11503A.getJSONObject(1);
                        if (jSONObject2.has(Constants.KEY_IMEI)) {
                            jSONArray.put(jSONObject2.get(Constants.KEY_IMEI));
                        }
                        if (jSONObject2.has("imei5")) {
                            jSONArray2.put(jSONObject2.get("imei5"));
                        }
                        if (jSONObject2.has("meid")) {
                            jSONArray3.put(jSONObject2.get("meid"));
                        }
                        if (jSONObject2.has("meid5")) {
                            jSONArray4.put(jSONObject2.get("meid5"));
                        }
                    }
                }
                m11979a("imeis", jSONArray);
                m11979a("imeis5", jSONArray2);
                m11979a("meids", jSONArray3);
                m11979a("meids5", jSONArray4);
            } catch (Exception unused) {
            }
            if (jSONArrayM11806a.length() > 0) {
                C7999fw.m12011b().m12016a("IMEI", jSONArrayM11806a);
            }
        } else {
            m11980a("imeis", this.f14946b);
        }
        JSONArray jSONArrayM11805a2 = C7943du.m11787a().m11805a("MacAddress");
        if (jSONArrayM11805a2 != null) {
            JSONArray jSONArray5 = new JSONArray();
            jSONArray5.put(C7900ce.m11481a("mac"));
            m11979a("wifiMacs", jSONArray5);
            JSONArray jSONArray6 = new JSONArray();
            jSONArray6.put(C7900ce.m11481a("ethMac"));
            m11979a("ethMacs", jSONArray6);
            if (jSONArrayM11805a2.length() > 0) {
                C7999fw.m12011b().m12016a("MacAddress", jSONArrayM11805a2);
            }
        } else {
            m11980a("wifiMacs", this.f14946b);
        }
        JSONArray jSONArrayM11805a3 = C7943du.m11787a().m11805a("AndroidId");
        if (jSONArrayM11805a3 != null) {
            m11979a("androidId", C7900ce.m11481a("androidId"));
            if (jSONArrayM11805a3.length() > 0) {
                C7999fw.m12011b().m12016a("AndroidId", jSONArrayM11805a3);
            }
        } else {
            m11980a("androidId", this.f14946b);
        }
        m11979a("msaIds", C7994fr.m11998a().mo11973b());
    }
}

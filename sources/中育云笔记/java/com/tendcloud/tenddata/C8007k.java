package com.tendcloud.tenddata;

import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.k */
/* loaded from: classes5.dex */
final class C8007k {

    /* renamed from: a */
    private String f15030a;

    /* renamed from: b */
    private String f15031b;

    /* renamed from: a */
    public String m12039a() {
        return this.f15030a;
    }

    /* renamed from: b */
    public String m12040b() {
        return this.f15031b;
    }

    /* renamed from: c */
    public boolean m12041c() {
        try {
            if (m12039a().isEmpty()) {
                if (m12040b().isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public void setKey(String str) {
        this.f15030a = str;
    }

    public void setXpath(String str) {
        this.f15031b = str;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("xpath", m12040b());
            jSONObject.put("key", m12039a());
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}

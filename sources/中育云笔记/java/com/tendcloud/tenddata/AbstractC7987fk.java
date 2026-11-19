package com.tendcloud.tenddata;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fk */
/* loaded from: classes5.dex */
public abstract class AbstractC7987fk {

    /* renamed from: b */
    protected JSONObject f14946b = new JSONObject();

    /* renamed from: a */
    public void m11979a(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (m11981a(obj)) {
                return;
            }
            this.f14946b.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public Object mo11973b() {
        return this.f14946b;
    }

    /* renamed from: a */
    public void m11980a(String str, JSONObject jSONObject) {
        if (str == null) {
            return;
        }
        try {
            if (jSONObject.has(str)) {
                jSONObject.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public boolean m11981a(Object obj) {
        return obj instanceof JSONObject ? ((JSONObject) obj).length() <= 0 : (obj instanceof JSONArray) && ((JSONArray) obj).length() <= 0;
    }
}

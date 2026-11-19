package com.tendcloud.tenddata;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fy */
/* loaded from: classes5.dex */
public class C8001fy extends JSONArray {

    /* renamed from: a */
    private static final String f15005a = "id";

    /* renamed from: b */
    private static final String f15006b = "category";

    /* renamed from: c */
    private static final String f15007c = "name";

    /* renamed from: d */
    private static final String f15008d = "unitPrice";

    /* renamed from: e */
    private static final String f15009e = "count";

    private C8001fy() {
    }

    /* renamed from: a */
    public static C8001fy m12020a() {
        return new C8001fy();
    }

    /* renamed from: a */
    public synchronized C8001fy m12021a(String str, String str2, String str3, int i10, int i11) {
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("id", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(f15006b, str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("name", str3);
                }
                jSONObject.put(f15008d, i10);
                jSONObject.put(f15009e, i11);
                put(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}

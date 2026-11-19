package com.tendcloud.tenddata;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fx */
/* loaded from: classes5.dex */
public class C8000fx extends JSONObject {

    /* renamed from: a */
    public static final String f14995a = "keyOrderId";

    /* renamed from: b */
    public static final String f14996b = "keyTotalPrice";

    /* renamed from: c */
    public static final String f14997c = "keyCurrencyType";

    /* renamed from: d */
    public static final String f14998d = "keyOrderDetail";

    /* renamed from: e */
    private static final String f14999e = "id";

    /* renamed from: f */
    private static final String f15000f = "category";

    /* renamed from: g */
    private static final String f15001g = "name";

    /* renamed from: h */
    private static final String f15002h = "unitPrice";

    /* renamed from: i */
    private static final String f15003i = "count";

    /* renamed from: j */
    private JSONArray f15004j = null;

    private C8000fx(String str, int i10, String str2) throws JSONException {
        try {
            put("keyOrderId", str);
            put("keyTotalPrice", i10);
            put("keyCurrencyType", str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static C8000fx m12017a(String str, int i10, String str2) {
        try {
            C7896ca.iForDeveloper("createOrder called --> orderId: " + str + " ,totalPrice: " + i10 + " ,currencyType: " + str2);
            if (TextUtils.isEmpty(str)) {
                C7896ca.eForDeveloper("createOrder: orderId could not be null or empty");
            }
            if (TextUtils.isEmpty(str2) || str2.trim().length() != 3) {
                C7896ca.eForDeveloper("createOrder: currencyType length must be 3 ,likes CNY");
            }
        } catch (Throwable unused) {
        }
        return new C8000fx(str, i10, str2);
    }

    private C8000fx() {
    }

    /* renamed from: a */
    public synchronized C8000fx m12018a(String str, String str2, int i10, int i11) {
        try {
            if (this.f15004j == null) {
                JSONArray jSONArray = new JSONArray();
                this.f15004j = jSONArray;
                put("keyOrderDetail", jSONArray);
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(f15000f, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("name", str2);
            }
            jSONObject.put(f15002h, i10);
            jSONObject.put(f15003i, i11);
            this.f15004j.put(jSONObject);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    /* renamed from: a */
    public synchronized C8000fx m12019a(String str, String str2, String str3, int i10, int i11) {
        try {
            if (this.f15004j == null) {
                JSONArray jSONArray = new JSONArray();
                this.f15004j = jSONArray;
                put("keyOrderDetail", jSONArray);
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(f15000f, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("name", str3);
            }
            jSONObject.put(f15002h, i10);
            jSONObject.put(f15003i, i11);
            this.f15004j.put(jSONObject);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}

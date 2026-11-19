package com.tendcloud.tenddata;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class TalkingDataOrder extends JSONObject {

    /* renamed from: a */
    private static final String f14186a = "id";

    /* renamed from: b */
    private static final String f14187b = "category";

    /* renamed from: c */
    private static final String f14188c = "name";

    /* renamed from: d */
    private static final String f14189d = "unitPrice";

    /* renamed from: e */
    private static final String f14190e = "count";
    public static final String keyCurrencyType = "keyCurrencyType";
    public static final String keyOrderDetail = "keyOrderDetail";
    public static final String keyOrderId = "keyOrderId";
    public static final String keyTotalPrice = "keyTotalPrice";

    /* renamed from: f */
    private JSONArray f14191f = null;

    private TalkingDataOrder(String str, int i10, String str2) throws JSONException {
        try {
            put("keyOrderId", str);
            put("keyTotalPrice", i10);
            put("keyCurrencyType", str2);
        } catch (JSONException unused) {
        }
    }

    public static TalkingDataOrder createOrder(String str, int i10, String str2) {
        try {
            C7896ca.iForDeveloper("createOrder called --> orderId: " + str + " ,totalPrice: " + i10 + " ,currencyType: " + str2);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str)) {
            C7896ca.eForDeveloper("createOrder: orderId could not be null or empty");
            return null;
        }
        if (TextUtils.isEmpty(str2) || str2.trim().length() != 3) {
            C7896ca.eForDeveloper("createOrder: currencyType length must be 3 ,likes CNY");
            return null;
        }
        return new TalkingDataOrder(str, i10, str2);
    }

    public synchronized TalkingDataOrder addItem(String str, String str2, int i10, int i11) {
        try {
            if (this.f14191f == null) {
                JSONArray jSONArray = new JSONArray();
                this.f14191f = jSONArray;
                put("keyOrderDetail", jSONArray);
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(f14187b, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("name", str2);
            }
            jSONObject.put(f14189d, i10);
            jSONObject.put(f14190e, i11);
            this.f14191f.put(jSONObject);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private TalkingDataOrder() {
    }

    public synchronized TalkingDataOrder addItem(String str, String str2, String str3, int i10, int i11) {
        try {
            if (this.f14191f == null) {
                JSONArray jSONArray = new JSONArray();
                this.f14191f = jSONArray;
                put("keyOrderDetail", jSONArray);
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(f14187b, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("name", str3);
            }
            jSONObject.put(f14189d, i10);
            jSONObject.put(f14190e, i11);
            this.f14191f.put(jSONObject);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }
}

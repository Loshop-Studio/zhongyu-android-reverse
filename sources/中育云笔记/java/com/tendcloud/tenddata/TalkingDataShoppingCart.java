package com.tendcloud.tenddata;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class TalkingDataShoppingCart extends JSONArray {

    /* renamed from: a */
    private static final String f14212a = "id";

    /* renamed from: b */
    private static final String f14213b = "category";

    /* renamed from: c */
    private static final String f14214c = "name";

    /* renamed from: d */
    private static final String f14215d = "unitPrice";

    /* renamed from: e */
    private static final String f14216e = "count";

    private TalkingDataShoppingCart() {
    }

    public static TalkingDataShoppingCart createShoppingCart() {
        return new TalkingDataShoppingCart();
    }

    public synchronized TalkingDataShoppingCart addItem(String str, String str2, String str3, int i10, int i11) {
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("id", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(f14213b, str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("name", str3);
                }
                jSONObject.put(f14215d, i10);
                jSONObject.put(f14216e, i11);
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

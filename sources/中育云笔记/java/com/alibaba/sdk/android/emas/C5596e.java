package com.alibaba.sdk.android.emas;

import android.text.TextUtils;
import anet.channel.request.Request;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.emas.e */
/* loaded from: classes3.dex */
public class C5596e {

    /* renamed from: d */
    String f4054d;

    /* renamed from: e */
    String f4055e;
    long timestamp;

    public C5596e(String str, String str2, long j10) {
        this.f4055e = str;
        this.f4054d = str2;
        this.timestamp = j10;
    }

    /* renamed from: a */
    public JSONObject m3503a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventId", this.f4055e);
            jSONObject.put("rawLog", this.f4054d);
            jSONObject.put("timestamp", this.timestamp);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int length() {
        return this.f4054d.getBytes(Charset.forName(Request.DEFAULT_CHARSET)).length;
    }

    /* renamed from: a */
    public static C5596e m3502a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("eventId");
        String strOptString2 = jSONObject.optString("rawLog");
        long jOptLong = jSONObject.optLong("timestamp");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || jOptLong == 0) {
            return null;
        }
        return new C5596e(strOptString, strOptString2, jOptLong);
    }
}

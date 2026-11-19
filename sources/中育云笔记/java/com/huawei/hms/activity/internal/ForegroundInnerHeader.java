package com.huawei.hms.activity.internal;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ForegroundInnerHeader {

    /* renamed from: a */
    public int f11282a;

    /* renamed from: b */
    public String f11283b;

    /* renamed from: c */
    public String f11284c;

    public void fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f11282a = JsonUtil.getIntValue(jSONObject, "apkVersion");
            this.f11283b = JsonUtil.getStringValue(jSONObject, "action");
            this.f11284c = JsonUtil.getStringValue(jSONObject, "responseCallbackKey");
        } catch (JSONException e10) {
            HMSLog.m8725e("ForegroundInnerHeader", "fromJson failed: " + e10.getMessage());
        }
    }

    public String getAction() {
        return this.f11283b;
    }

    public int getApkVersion() {
        return this.f11282a;
    }

    public String getResponseCallbackKey() {
        return this.f11284c;
    }

    public void setAction(String str) {
        this.f11283b = str;
    }

    public void setApkVersion(int i10) {
        this.f11282a = i10;
    }

    public void setResponseCallbackKey(String str) {
        this.f11284c = str;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apkVersion", this.f11282a);
            jSONObject.put("action", this.f11283b);
            jSONObject.put("responseCallbackKey", this.f11284c);
        } catch (JSONException e10) {
            HMSLog.m8725e("ForegroundInnerHeader", "ForegroundInnerHeader toJson failed: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "apkVersion:" + this.f11282a + ", action:" + this.f11283b + ", responseCallbackKey:" + this.f11284c;
    }
}

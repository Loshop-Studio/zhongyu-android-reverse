package com.huawei.hms.common.internal;

import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class RequestHeader implements InterfaceC7278e {

    /* renamed from: d */
    public String f11553d;

    /* renamed from: e */
    public String f11554e;

    /* renamed from: g */
    public String f11556g;

    /* renamed from: i */
    public String f11558i;

    /* renamed from: j */
    public String f11559j;

    /* renamed from: k */
    public int f11560k;

    /* renamed from: l */
    public int f11561l;

    /* renamed from: m */
    public Parcelable f11562m;

    /* renamed from: f */
    public String f11555f = "";

    /* renamed from: c */
    public String f11552c = "4.0";

    /* renamed from: h */
    public int f11557h = 61300301;

    public boolean fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f11552c = JsonUtil.getStringValue(jSONObject, "version");
            this.f11553d = JsonUtil.getStringValue(jSONObject, "srv_name");
            this.f11554e = JsonUtil.getStringValue(jSONObject, "api_name");
            this.f11555f = JsonUtil.getStringValue(jSONObject, HiAnalyticsConstant.BI_KEY_APP_ID);
            this.f11556g = JsonUtil.getStringValue(jSONObject, "pkg_name");
            this.f11557h = JsonUtil.getIntValue(jSONObject, "sdk_version");
            this.f11560k = JsonUtil.getIntValue(jSONObject, "kitSdkVersion");
            this.f11561l = JsonUtil.getIntValue(jSONObject, "apiLevel");
            this.f11558i = JsonUtil.getStringValue(jSONObject, "session_id");
            this.f11559j = JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.TRANSACTION_ID);
            return true;
        } catch (JSONException e10) {
            HMSLog.m8725e("RequestHeader", "fromJson failed: " + e10.getMessage());
            return false;
        }
    }

    public String getActualAppID() {
        if (TextUtils.isEmpty(this.f11555f)) {
            return "";
        }
        String[] strArrSplit = this.f11555f.split("\\|");
        return strArrSplit.length == 0 ? "" : strArrSplit.length == 1 ? strArrSplit[0] : strArrSplit[1];
    }

    public int getApiLevel() {
        return this.f11561l;
    }

    public String getApiName() {
        return this.f11554e;
    }

    public String getAppID() {
        return this.f11555f;
    }

    public int getKitSdkVersion() {
        return this.f11560k;
    }

    public Parcelable getParcelable() {
        return this.f11562m;
    }

    public String getPkgName() {
        return this.f11556g;
    }

    public int getSdkVersion() {
        return this.f11557h;
    }

    public String getSessionId() {
        return this.f11558i;
    }

    public String getSrvName() {
        return this.f11553d;
    }

    public String getTransactionId() {
        return this.f11559j;
    }

    public String getVersion() {
        return this.f11552c;
    }

    public void setApiLevel(int i10) {
        this.f11561l = i10;
    }

    public void setApiName(String str) {
        this.f11554e = str;
    }

    public void setAppID(String str) {
        this.f11555f = str;
    }

    public void setKitSdkVersion(int i10) {
        this.f11560k = i10;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f11562m = parcelable;
    }

    public void setPkgName(String str) {
        this.f11556g = str;
    }

    public void setSdkVersion(int i10) {
        this.f11557h = i10;
    }

    public void setSessionId(String str) {
        this.f11558i = str;
    }

    public void setSrvName(String str) {
        this.f11553d = str;
    }

    public void setTransactionId(String str) {
        this.f11559j = str;
    }

    public void setVersion(String str) {
        this.f11552c = str;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.f11552c);
            jSONObject.put("srv_name", this.f11553d);
            jSONObject.put("api_name", this.f11554e);
            jSONObject.put(HiAnalyticsConstant.BI_KEY_APP_ID, this.f11555f);
            jSONObject.put("pkg_name", this.f11556g);
            jSONObject.put("sdk_version", this.f11557h);
            jSONObject.put("kitSdkVersion", this.f11560k);
            jSONObject.put("apiLevel", this.f11561l);
            if (!TextUtils.isEmpty(this.f11558i)) {
                jSONObject.put("session_id", this.f11558i);
            }
            jSONObject.put(CommonCode.MapKey.TRANSACTION_ID, this.f11559j);
        } catch (JSONException e10) {
            HMSLog.m8725e("RequestHeader", "toJson failed: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "api_name:" + this.f11554e + ", app_id:" + this.f11555f + ", pkg_name:" + this.f11556g + ", sdk_version:" + this.f11557h + ", session_id:*, transaction_id:" + this.f11559j + ", kitSdkVersion:" + this.f11560k + ", apiLevel:" + this.f11561l;
    }
}

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
public class ResponseHeader implements InterfaceC7278e, ResponseErrorCode {

    /* renamed from: c */
    public int f11574c;

    /* renamed from: d */
    public int f11575d;

    /* renamed from: e */
    public String f11576e;

    /* renamed from: f */
    public String f11577f;

    /* renamed from: g */
    public String f11578g;

    /* renamed from: h */
    public String f11579h = "";

    /* renamed from: i */
    public String f11580i;

    /* renamed from: j */
    public String f11581j;

    /* renamed from: k */
    public String f11582k;

    /* renamed from: l */
    public String f11583l;

    /* renamed from: m */
    public Parcelable f11584m;

    public ResponseHeader() {
    }

    public boolean fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f11574c = JsonUtil.getIntValue(jSONObject, "status_code");
            this.f11575d = JsonUtil.getIntValue(jSONObject, "error_code");
            this.f11576e = JsonUtil.getStringValue(jSONObject, "error_reason");
            this.f11577f = JsonUtil.getStringValue(jSONObject, "srv_name");
            this.f11578g = JsonUtil.getStringValue(jSONObject, "api_name");
            this.f11579h = JsonUtil.getStringValue(jSONObject, HiAnalyticsConstant.BI_KEY_APP_ID);
            this.f11580i = JsonUtil.getStringValue(jSONObject, "pkg_name");
            this.f11581j = JsonUtil.getStringValue(jSONObject, "session_id");
            this.f11582k = JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.TRANSACTION_ID);
            this.f11583l = JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.HAS_RESOLUTION);
            return true;
        } catch (JSONException e10) {
            HMSLog.m8725e("ResponseHeader", "fromJson failed: " + e10.getMessage());
            return false;
        }
    }

    public String getActualAppID() {
        if (TextUtils.isEmpty(this.f11579h)) {
            return "";
        }
        String[] strArrSplit = this.f11579h.split("\\|");
        return strArrSplit.length == 0 ? "" : strArrSplit.length == 1 ? strArrSplit[0] : strArrSplit[1];
    }

    public String getApiName() {
        return this.f11578g;
    }

    public String getAppID() {
        return this.f11579h;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public int getErrorCode() {
        return this.f11575d;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public String getErrorReason() {
        return this.f11576e;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public Parcelable getParcelable() {
        return this.f11584m;
    }

    public String getPkgName() {
        return this.f11580i;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public String getResolution() {
        return this.f11583l;
    }

    public String getSessionId() {
        return this.f11581j;
    }

    public String getSrvName() {
        return this.f11577f;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public int getStatusCode() {
        return this.f11574c;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public String getTransactionId() {
        return this.f11582k;
    }

    @Override // com.huawei.hms.common.internal.ResponseErrorCode
    public boolean hasResolution() {
        return this.f11584m != null;
    }

    public boolean isSuccess() {
        return this.f11574c == 0;
    }

    public void setApiName(String str) {
        this.f11578g = str;
    }

    public void setAppID(String str) {
        this.f11579h = str;
    }

    public void setErrorCode(int i10) {
        this.f11575d = i10;
    }

    public void setErrorReason(String str) {
        this.f11576e = str;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f11584m = parcelable;
    }

    public void setPkgName(String str) {
        this.f11580i = str;
    }

    public void setResolution(String str) {
        this.f11583l = str;
    }

    public void setSessionId(String str) {
        this.f11581j = str;
    }

    public void setSrvName(String str) {
        this.f11577f = str;
    }

    public void setStatusCode(int i10) {
        this.f11574c = i10;
    }

    public void setTransactionId(String str) {
        this.f11582k = str;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", this.f11574c);
            jSONObject.put("error_code", this.f11575d);
            jSONObject.put("error_reason", this.f11576e);
            jSONObject.put("srv_name", this.f11577f);
            jSONObject.put("api_name", this.f11578g);
            jSONObject.put(HiAnalyticsConstant.BI_KEY_APP_ID, this.f11579h);
            jSONObject.put("pkg_name", this.f11580i);
            if (!TextUtils.isEmpty(this.f11581j)) {
                jSONObject.put("session_id", this.f11581j);
            }
            jSONObject.put(CommonCode.MapKey.TRANSACTION_ID, this.f11582k);
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, this.f11583l);
        } catch (JSONException e10) {
            HMSLog.m8725e("ResponseHeader", "toJson failed: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "status_code:" + this.f11574c + ", error_code:" + this.f11575d + ", api_name:" + this.f11578g + ", app_id:" + this.f11579h + ", pkg_name:" + this.f11580i + ", session_id:*, transaction_id:" + this.f11582k + ", resolution:" + this.f11583l;
    }

    public ResponseHeader(int i10, int i11, String str) {
        this.f11574c = i10;
        this.f11575d = i11;
        this.f11576e = str;
    }
}

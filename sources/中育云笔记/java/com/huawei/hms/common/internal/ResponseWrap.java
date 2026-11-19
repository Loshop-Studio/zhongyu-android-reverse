package com.huawei.hms.common.internal;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ResponseWrap {

    /* renamed from: a */
    public String f11585a;

    /* renamed from: b */
    public ResponseHeader f11586b;

    public ResponseWrap(ResponseHeader responseHeader) {
        this.f11586b = responseHeader;
    }

    public boolean fromJson(String str) {
        if (this.f11586b == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f11586b.setStatusCode(JsonUtil.getIntValue(jSONObject, "status_code"));
            this.f11586b.setErrorCode(JsonUtil.getIntValue(jSONObject, "error_code"));
            this.f11586b.setErrorReason(JsonUtil.getStringValue(jSONObject, "error_reason"));
            this.f11586b.setSrvName(JsonUtil.getStringValue(jSONObject, "srv_name"));
            this.f11586b.setApiName(JsonUtil.getStringValue(jSONObject, "api_name"));
            this.f11586b.setAppID(JsonUtil.getStringValue(jSONObject, HiAnalyticsConstant.BI_KEY_APP_ID));
            this.f11586b.setPkgName(JsonUtil.getStringValue(jSONObject, "pkg_name"));
            this.f11586b.setSessionId(JsonUtil.getStringValue(jSONObject, "session_id"));
            this.f11586b.setTransactionId(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.TRANSACTION_ID));
            this.f11586b.setResolution(JsonUtil.getStringValue(jSONObject, CommonCode.MapKey.HAS_RESOLUTION));
            this.f11585a = JsonUtil.getStringValue(jSONObject, AgooConstants.MESSAGE_BODY);
            return true;
        } catch (JSONException e10) {
            HMSLog.m8725e("ResponseWrap", "fromJson failed: " + e10.getMessage());
            return false;
        }
    }

    public String getBody() {
        if (TextUtils.isEmpty(this.f11585a)) {
            this.f11585a = new JSONObject().toString();
        }
        return this.f11585a;
    }

    public ResponseHeader getResponseHeader() {
        return this.f11586b;
    }

    public void setBody(String str) {
        this.f11585a = str;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.f11586b = responseHeader;
    }

    public String toJson() throws JSONException {
        if (this.f11586b == null) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status_code", this.f11586b.getStatusCode());
            jSONObject.put("error_code", this.f11586b.getErrorCode());
            jSONObject.put("error_reason", this.f11586b.getErrorReason());
            jSONObject.put("srv_name", this.f11586b.getSrvName());
            jSONObject.put("api_name", this.f11586b.getApiName());
            jSONObject.put(HiAnalyticsConstant.BI_KEY_APP_ID, this.f11586b.getAppID());
            jSONObject.put("pkg_name", this.f11586b.getPkgName());
            jSONObject.put(CommonCode.MapKey.TRANSACTION_ID, this.f11586b.getTransactionId());
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, this.f11586b.getResolution());
            String sessionId = this.f11586b.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                jSONObject.put("session_id", sessionId);
            }
            if (!TextUtils.isEmpty(this.f11585a)) {
                jSONObject.put(AgooConstants.MESSAGE_BODY, this.f11585a);
            }
        } catch (JSONException e10) {
            HMSLog.m8725e("ResponseWrap", "toJson failed: " + e10.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "ResponseWrap{body='" + this.f11585a + "', responseHeader=" + this.f11586b + '}';
    }
}

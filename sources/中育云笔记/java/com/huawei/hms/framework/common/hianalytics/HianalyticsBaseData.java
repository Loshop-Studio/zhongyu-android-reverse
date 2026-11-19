package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class HianalyticsBaseData {
    public static final String EVENT_ID = "url_request";
    public static final int FALSE = 0;
    public static final String SDK_NAME = "sdk_name";
    public static final String SDK_TYPE = "sdk_type";
    public static final String SDK_VERSION = "sdk_version";
    public static final int TRUE = 1;

    /* renamed from: a */
    public LinkedHashMap f11655a;

    public HianalyticsBaseData() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f11655a = linkedHashMap;
        linkedHashMap.put(SDK_TYPE, "UxPP");
        this.f11655a.put(SDK_NAME, "networkkit");
    }

    public LinkedHashMap<String, String> get() {
        return this.f11655a;
    }

    public HianalyticsBaseData put(String str, String str2) {
        if (str != null && str2 != null) {
            this.f11655a.put(str, str2);
            return this;
        }
        Logger.m8586v("HianalyticsBaseData", "key = " + str + " : value = " + str2);
        return this;
    }

    public HianalyticsBaseData putIfNotDefault(String str, long j10, long j11) {
        return j10 == j11 ? this : put(str, j10);
    }

    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : get().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e10) {
            Logger.m8589w("HianalyticsBaseData", "catch JSONException", e10);
        }
        return jSONObject.toString();
    }

    public HianalyticsBaseData put(String str, long j10) {
        if (str == null) {
            Logger.m8586v("HianalyticsBaseData", "key = null : value = " + j10);
            return this;
        }
        this.f11655a.put(str, "" + j10);
        return this;
    }

    public HianalyticsBaseData put(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            this.f11655a.putAll(linkedHashMap);
            return this;
        }
        Logger.m8586v("HianalyticsBaseData", "data is null");
        return this;
    }
}

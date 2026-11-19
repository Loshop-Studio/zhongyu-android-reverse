package com.lzy.okgo.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import je.C9740t;

/* loaded from: classes5.dex */
public class HttpParams implements Serializable {

    /* renamed from: e */
    public static final C9740t f12692e = C9740t.m19483g("text/plain;charset=utf-8");

    /* renamed from: f */
    public static final C9740t f12693f = C9740t.m19483g("application/json;charset=utf-8");

    /* renamed from: g */
    public static final C9740t f12694g = C9740t.m19483g(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE);

    /* renamed from: c */
    public LinkedHashMap f12695c;

    /* renamed from: d */
    public LinkedHashMap f12696d;

    public HttpParams() {
        m9667a();
    }

    /* renamed from: a */
    public final void m9667a() {
        this.f12695c = new LinkedHashMap();
        this.f12696d = new LinkedHashMap();
    }

    /* renamed from: c */
    public void m9668c(HttpParams httpParams) {
        if (httpParams != null) {
            LinkedHashMap linkedHashMap = httpParams.f12695c;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                this.f12695c.putAll(httpParams.f12695c);
            }
            LinkedHashMap linkedHashMap2 = httpParams.f12696d;
            if (linkedHashMap2 == null || linkedHashMap2.isEmpty()) {
                return;
            }
            this.f12696d.putAll(httpParams.f12696d);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : this.f12695c.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append((String) entry.getKey());
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(entry.getValue());
        }
        for (Map.Entry entry2 : this.f12696d.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append((String) entry2.getKey());
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(entry2.getValue());
        }
        return sb2.toString();
    }
}

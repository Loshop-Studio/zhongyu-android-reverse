package com.tendcloud.tenddata;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tendcloud.tenddata.dc */
/* loaded from: classes5.dex */
public final class C7925dc {

    /* renamed from: a */
    private Map<String, String> f14680a = new HashMap();

    /* renamed from: a */
    public C7925dc m11677a(String str, String str2) {
        this.f14680a.put(str, str2);
        return this;
    }

    public String toString() {
        return this.f14680a.toString();
    }

    /* renamed from: a */
    public void m11678a(HttpURLConnection httpURLConnection) {
        try {
            if (C7912cq.m11595a(14) && C7912cq.m11605b(19)) {
                this.f14680a.put("Connection", "close");
            }
            for (String str : this.f14680a.keySet()) {
                httpURLConnection.setRequestProperty(str, this.f14680a.get(str));
            }
        } catch (Throwable unused) {
        }
    }
}

package com.efs.sdk.base.p039a.p042c.p043a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.p039a.p044d.C5661a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.c.a.b */
/* loaded from: classes3.dex */
public final class C5655b {

    /* renamed from: a */
    public int f4660a = -1;

    /* renamed from: b */
    String f4661b = "https://";

    /* renamed from: c */
    String f4662c = "errlog.umeng.com";

    /* renamed from: f */
    private Boolean f4665f = null;

    /* renamed from: d */
    public Map<String, Double> f4663d = new HashMap();

    /* renamed from: e */
    public Map<String, String> f4664e = new HashMap();

    private C5655b() {
    }

    /* renamed from: a */
    public static C5655b m4064a() {
        C5655b c5655b = new C5655b();
        if (C5661a.m4097a().f4650i) {
            c5655b.f4662c = "errlogos.umeng.com";
            return c5655b;
        }
        c5655b.f4662c = "errlog.umeng.com";
        return c5655b;
    }

    /* renamed from: a */
    public final void m4065a(@NonNull Map<String, String> map) {
        double d10;
        if (map.containsKey("gate_way")) {
            String str = map.get("gate_way");
            if (!TextUtils.isEmpty(str)) {
                this.f4662c = str;
            }
        }
        if (map.containsKey("gate_way_https")) {
            String str2 = map.get("gate_way_https");
            if (!TextUtils.isEmpty(str2)) {
                this.f4661b = Boolean.parseBoolean(str2) ? "https://" : "http://";
            }
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("data_sampling_rate_") || key.startsWith("file_sampling_rate_")) {
                String strReplace = key.replace("data_sampling_rate_", "").replace("file_sampling_rate_", "");
                try {
                    d10 = Double.parseDouble(entry.getValue());
                } catch (Throwable unused) {
                    d10 = 100.0d;
                }
                map2.put(strReplace, Double.valueOf(d10));
            }
        }
        this.f4663d = map2;
        this.f4664e = map;
    }
}

package com.efs.sdk.base.p035a.p038c.p039a;

import android.text.TextUtils;
import com.efs.sdk.base.p035a.p040d.C1293a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.c.a.b */
/* loaded from: classes.dex */
public final class C1287b {

    /* renamed from: a */
    public int f7026a = -1;

    /* renamed from: b */
    String f7027b = "https://";

    /* renamed from: c */
    String f7028c = "errlog.umeng.com";

    /* renamed from: f */
    private Boolean f7031f = null;

    /* renamed from: d */
    public Map<String, Double> f7029d = new HashMap();

    /* renamed from: e */
    public Map<String, String> f7030e = new HashMap();

    private C1287b() {
    }

    /* renamed from: a */
    static C1287b m5454a() {
        C1287b c1287b = new C1287b();
        if (C1293a.m5487a().f7016i) {
            c1287b.f7028c = "errlogos.umeng.com";
        } else {
            c1287b.f7028c = "errlog.umeng.com";
        }
        return c1287b;
    }

    /* renamed from: a */
    final void m5455a(Map<String, String> map) {
        if (map.containsKey("gate_way")) {
            String str = map.get("gate_way");
            if (!TextUtils.isEmpty(str)) {
                this.f7028c = str;
            }
        }
        if (map.containsKey("gate_way_https")) {
            String str2 = map.get("gate_way_https");
            if (!TextUtils.isEmpty(str2)) {
                this.f7027b = Boolean.parseBoolean(str2) ? "https://" : "http://";
            }
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("data_sampling_rate_") || key.startsWith("file_sampling_rate_")) {
                String strReplace = key.replace("data_sampling_rate_", "").replace("file_sampling_rate_", "");
                double d4 = 100.0d;
                try {
                    d4 = Double.parseDouble(entry.getValue());
                } catch (Throwable unused) {
                }
                map2.put(strReplace, Double.valueOf(d4));
            }
        }
        this.f7029d = map2;
        this.f7030e = map;
    }
}

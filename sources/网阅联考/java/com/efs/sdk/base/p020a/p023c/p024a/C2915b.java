package com.efs.sdk.base.p020a.p023c.p024a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.efs.sdk.base.p020a.p025d.C2921a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.c.a.b */
/* loaded from: classes2.dex */
public final class C2915b {

    /* renamed from: a */
    public int f1056a = -1;

    /* renamed from: b */
    String f1057b = "https://";

    /* renamed from: c */
    String f1058c = "errlog.umeng.com";

    /* renamed from: f */
    private Boolean f1061f = null;

    /* renamed from: d */
    public Map<String, Double> f1059d = new HashMap();

    /* renamed from: e */
    public Map<String, String> f1060e = new HashMap();

    private C2915b() {
    }

    /* renamed from: a */
    public static C2915b m2095a() {
        C2915b c2915b = new C2915b();
        if (C2921a.m2128a().f1046i) {
            c2915b.f1058c = "errlogos.umeng.com";
        } else {
            c2915b.f1058c = "errlog.umeng.com";
        }
        return c2915b;
    }

    /* renamed from: a */
    public final void m2096a(@NonNull Map<String, String> map) {
        double d4;
        if (map.containsKey("gate_way")) {
            String str = map.get("gate_way");
            if (!TextUtils.isEmpty(str)) {
                this.f1058c = str;
            }
        }
        if (map.containsKey("gate_way_https")) {
            String str2 = map.get("gate_way_https");
            if (!TextUtils.isEmpty(str2)) {
                this.f1057b = Boolean.parseBoolean(str2) ? "https://" : "http://";
            }
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("data_sampling_rate_") || key.startsWith("file_sampling_rate_")) {
                String strReplace = key.replace("data_sampling_rate_", "").replace("file_sampling_rate_", "");
                try {
                    d4 = Double.parseDouble(entry.getValue());
                } catch (Throwable unused) {
                    d4 = 100.0d;
                }
                map2.put(strReplace, Double.valueOf(d4));
            }
        }
        this.f1059d = map2;
        this.f1060e = map;
    }
}

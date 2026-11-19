package com.efs.sdk.base.p020a.p021a;

import android.text.TextUtils;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.C2959f;
import com.efs.sdk.base.p020a.p031h.p034c.C2955a;
import com.efs.sdk.base.p020a.p031h.p034c.C2956b;
import com.umeng.analytics.pro.C3335ai;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: com.efs.sdk.base.a.a.c */
/* loaded from: classes2.dex */
public final class C2903c {

    /* renamed from: a */
    String f1012a;

    /* renamed from: b */
    String f1013b;

    /* renamed from: c */
    String f1014c;

    /* renamed from: d */
    public String f1015d;

    /* renamed from: e */
    public int f1016e;

    /* renamed from: f */
    public String f1017f;

    /* renamed from: g */
    public byte f1018g;

    /* renamed from: h */
    public String f1019h;

    /* renamed from: i */
    String f1020i;

    /* renamed from: j */
    String f1021j;

    /* renamed from: k */
    String f1022k;

    /* renamed from: l */
    public long f1023l = 0;

    /* renamed from: a */
    public static C2903c m2065a() {
        C2903c c2903c = new C2903c();
        c2903c.f1012a = C2921a.m2128a().f1038a;
        c2903c.f1013b = C2921a.m2128a().f1039b;
        c2903c.f1022k = C2921a.m2128a().f1045h;
        c2903c.f1021j = BuildConfig.VERSION_NAME;
        c2903c.f1014c = C2959f.m2219a(C2921a.m2128a().f1040c);
        c2903c.f1020i = String.valueOf(C2916c.m2097a().f1065d.f1056a);
        return c2903c;
    }

    /* renamed from: b */
    public final String m2066b() {
        C2901a.m2055a();
        String strValueOf = String.valueOf(C2901a.m2058b() / 1000);
        String strM2209a = C2956b.m2209a(C2955a.m2205a(this.f1022k + strValueOf, this.f1013b));
        TreeMap treeMap = new TreeMap();
        treeMap.put("app", this.f1012a);
        treeMap.put("sd", strM2209a);
        if (!TextUtils.isEmpty(this.f1015d)) {
            treeMap.put("cp", this.f1015d);
        }
        if (this.f1018g != 0) {
            treeMap.put("de", String.valueOf(this.f1016e));
            treeMap.put("type", this.f1019h);
            String str = this.f1017f;
            if (TextUtils.isEmpty(str)) {
                C2901a.m2055a();
                long jM2058b = C2901a.m2058b();
                str = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", Long.valueOf(jM2058b), Integer.valueOf(new Random(jM2058b).nextInt(10000)));
            }
            treeMap.put("seq", str);
        }
        treeMap.put("cver", this.f1020i);
        treeMap.put(C3335ai.f1744x, "android");
        treeMap.put("sver", this.f1020i);
        treeMap.put("tm", strValueOf);
        treeMap.put("ver", this.f1014c);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
            sb2.append(str2);
            sb.append(str2);
            sb.append("&");
        }
        String strM2208a = C2956b.m2208a(sb2.toString() + this.f1013b);
        sb.append("sign=");
        sb.append(strM2208a);
        return C2956b.m2210b(sb.toString());
    }
}

package com.efs.sdk.base.p039a.p040a;

import android.text.TextUtils;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.C5699f;
import com.efs.sdk.base.p039a.p050h.p053c.C5695a;
import com.efs.sdk.base.p039a.p050h.p053c.C5696b;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: com.efs.sdk.base.a.a.c */
/* loaded from: classes3.dex */
public final class C5643c {

    /* renamed from: a */
    String f4616a;

    /* renamed from: b */
    String f4617b;

    /* renamed from: c */
    String f4618c;

    /* renamed from: d */
    public String f4619d;

    /* renamed from: e */
    public int f4620e;

    /* renamed from: f */
    public String f4621f;

    /* renamed from: g */
    public byte f4622g;

    /* renamed from: h */
    public String f4623h;

    /* renamed from: i */
    String f4624i;

    /* renamed from: j */
    String f4625j;

    /* renamed from: k */
    String f4626k;

    /* renamed from: l */
    public long f4627l = 0;

    /* renamed from: a */
    public static C5643c m4034a() {
        C5643c c5643c = new C5643c();
        c5643c.f4616a = C5661a.m4097a().f4642a;
        c5643c.f4617b = C5661a.m4097a().f4643b;
        c5643c.f4626k = C5661a.m4097a().f4649h;
        c5643c.f4625j = BuildConfig.VERSION_NAME;
        c5643c.f4618c = C5699f.m4188a(C5661a.m4097a().f4644c);
        c5643c.f4624i = String.valueOf(C5656c.m4066a().f4669d.f4660a);
        return c5643c;
    }

    /* renamed from: b */
    public final String m4035b() {
        C5641a.m4024a();
        String strValueOf = String.valueOf(C5641a.m4027b() / 1000);
        String strM4178a = C5696b.m4178a(C5695a.m4174a(this.f4626k + strValueOf, this.f4617b));
        TreeMap treeMap = new TreeMap();
        treeMap.put("app", this.f4616a);
        treeMap.put("sd", strM4178a);
        if (!TextUtils.isEmpty(this.f4619d)) {
            treeMap.put("cp", this.f4619d);
        }
        if (this.f4622g != 0) {
            treeMap.put("de", String.valueOf(this.f4620e));
            treeMap.put("type", this.f4623h);
            String str = this.f4621f;
            if (TextUtils.isEmpty(str)) {
                C5641a.m4024a();
                long jM4027b = C5641a.m4027b();
                str = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", Long.valueOf(jM4027b), Integer.valueOf(new Random(jM4027b).nextInt(10000)));
            }
            treeMap.put("seq", str);
        }
        treeMap.put("cver", this.f4624i);
        treeMap.put("os", "android");
        treeMap.put("sver", this.f4624i);
        treeMap.put("tm", strValueOf);
        treeMap.put("ver", this.f4618c);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
            sb2.append(str2);
            sb.append(str2);
            sb.append("&");
        }
        String strM4177a = C5696b.m4177a(sb2.toString() + this.f4617b);
        sb.append("sign=");
        sb.append(strM4177a);
        return C5696b.m4179b(sb.toString());
    }
}

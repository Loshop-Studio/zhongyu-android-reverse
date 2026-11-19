package com.efs.sdk.base.p035a.p036a;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.C1331f;
import com.efs.sdk.base.p035a.p046h.p049c.C1327a;
import com.efs.sdk.base.p035a.p046h.p049c.C1328b;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: com.efs.sdk.base.a.a.c */
/* loaded from: classes.dex */
public final class C1275c {

    /* renamed from: a */
    String f6982a;

    /* renamed from: b */
    String f6983b;

    /* renamed from: c */
    String f6984c;

    /* renamed from: d */
    public String f6985d;

    /* renamed from: e */
    public int f6986e;

    /* renamed from: f */
    public String f6987f;

    /* renamed from: g */
    public byte f6988g;

    /* renamed from: h */
    public String f6989h;

    /* renamed from: i */
    String f6990i;

    /* renamed from: j */
    String f6991j;

    /* renamed from: k */
    String f6992k;

    /* renamed from: l */
    public long f6993l = 0;

    /* renamed from: a */
    public static C1275c m5424a() {
        C1275c c1275c = new C1275c();
        c1275c.f6982a = C1293a.m5487a().f7008a;
        c1275c.f6983b = C1293a.m5487a().f7009b;
        c1275c.f6992k = C1293a.m5487a().f7015h;
        c1275c.f6991j = BuildConfig.VERSION_NAME;
        c1275c.f6984c = C1331f.m5578a(C1293a.m5487a().f7010c);
        c1275c.f6990i = String.valueOf(C1288c.m5456a().f7035d.f7026a);
        return c1275c;
    }

    /* renamed from: b */
    public final String m5425b() {
        C1273a.m5414a();
        String strValueOf = String.valueOf(C1273a.m5417b() / 1000);
        String strM5568a = C1328b.m5568a(C1327a.m5564a(this.f6992k + strValueOf, this.f6983b));
        TreeMap treeMap = new TreeMap();
        treeMap.put("app", this.f6982a);
        treeMap.put("sd", strM5568a);
        if (!TextUtils.isEmpty(this.f6985d)) {
            treeMap.put("cp", this.f6985d);
        }
        if (this.f6988g != 0) {
            treeMap.put("de", String.valueOf(this.f6986e));
            treeMap.put("type", this.f6989h);
            String str = this.f6987f;
            if (TextUtils.isEmpty(str)) {
                C1273a.m5414a();
                long jM5417b = C1273a.m5417b();
                str = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", Long.valueOf(jM5417b), Integer.valueOf(new Random(jM5417b).nextInt(10000)));
            }
            treeMap.put("seq", str);
        }
        treeMap.put("cver", this.f6990i);
        treeMap.put("os", DispatchConstants.ANDROID);
        treeMap.put("sver", this.f6990i);
        treeMap.put("tm", strValueOf);
        treeMap.put("ver", this.f6984c);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = ((String) entry.getKey()) + "=" + ((String) entry.getValue());
            sb2.append(str2);
            sb.append(str2);
            sb.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        }
        String strM5567a = C1328b.m5567a(sb2.toString() + this.f6983b);
        sb.append("sign=");
        sb.append(strM5567a);
        return C1328b.m5569b(sb.toString());
    }
}

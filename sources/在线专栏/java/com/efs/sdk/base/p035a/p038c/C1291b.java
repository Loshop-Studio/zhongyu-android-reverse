package com.efs.sdk.base.p035a.p038c;

import com.efs.sdk.base.p035a.p036a.C1273a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.c.b */
/* loaded from: classes.dex */
public final class C1291b {

    /* renamed from: a */
    public Map<String, Object> f7044a = new ConcurrentHashMap();

    /* renamed from: a */
    public final void m5483a(String str, Object obj) {
        this.f7044a.put(str, obj);
    }

    /* renamed from: b */
    public final Object m5484b(String str, Object obj) {
        Object obj2 = this.f7044a.get(str);
        return (obj2 != null || this.f7044a.containsKey(str)) ? obj2 : obj;
    }

    /* renamed from: a */
    public final Map<String, Object> m5482a() {
        HashMap map = new HashMap(this.f7044a);
        C1273a.m5414a();
        map.put("ctime", Long.valueOf(C1273a.m5417b() / 1000));
        C1273a.m5414a();
        map.put("w_tm", Long.valueOf(C1273a.m5417b() / 1000));
        return map;
    }
}

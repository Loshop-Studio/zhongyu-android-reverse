package com.efs.sdk.base.p039a.p042c;

import com.efs.sdk.base.p039a.p040a.C5641a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.c.b */
/* loaded from: classes3.dex */
public final class C5659b {

    /* renamed from: a */
    public Map<String, Object> f4678a = new ConcurrentHashMap();

    /* renamed from: a */
    public final void m4093a(String str, Object obj) {
        this.f4678a.put(str, obj);
    }

    /* renamed from: b */
    public final Object m4094b(String str, Object obj) {
        Object obj2 = this.f4678a.get(str);
        return (obj2 != null || this.f4678a.containsKey(str)) ? obj2 : obj;
    }

    /* renamed from: a */
    public final Map<String, Object> m4092a() {
        HashMap map = new HashMap(this.f4678a);
        C5641a.m4024a();
        map.put("ctime", Long.valueOf(C5641a.m4027b() / 1000));
        C5641a.m4024a();
        map.put("w_tm", Long.valueOf(C5641a.m4027b() / 1000));
        return map;
    }
}

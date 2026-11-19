package com.efs.sdk.base.p020a.p023c;

import com.efs.sdk.base.p020a.p021a.C2901a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.c.b */
/* loaded from: classes2.dex */
public final class C2919b {

    /* renamed from: a */
    public Map<String, Object> f1074a = new ConcurrentHashMap();

    /* renamed from: a */
    public final void m2124a(String str, Object obj) {
        this.f1074a.put(str, obj);
    }

    /* renamed from: b */
    public final Object m2125b(String str, Object obj) {
        Object obj2 = this.f1074a.get(str);
        return (obj2 != null || this.f1074a.containsKey(str)) ? obj2 : obj;
    }

    /* renamed from: a */
    public final Map<String, Object> m2123a() {
        HashMap map = new HashMap(this.f1074a);
        C2901a.m2055a();
        map.put("ctime", Long.valueOf(C2901a.m2058b() / 1000));
        C2901a.m2055a();
        map.put("w_tm", Long.valueOf(C2901a.m2058b() / 1000));
        return map;
    }
}

package com.blankj.utilcode.util;

import java.text.SimpleDateFormat;
import java.util.Map;

/* renamed from: com.blankj.utilcode.util.s */
/* loaded from: classes2.dex */
public abstract class AbstractC3399s {

    /* renamed from: a */
    public static final C3398r f2177a = new C3398r(0);

    /* renamed from: a */
    public static SimpleDateFormat m2350a() {
        Map map = (Map) f2177a.get();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get("yyyyMMdd");
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd");
        map.put("yyyyMMdd", simpleDateFormat2);
        return simpleDateFormat2;
    }
}

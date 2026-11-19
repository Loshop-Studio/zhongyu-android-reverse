package com.alibaba.sdk.android.ams.common.util;

import com.alibaba.sdk.android.ams.common.p021b.C1100c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.ams.common.util.c */
/* loaded from: classes.dex */
public class C1109c {
    /* renamed from: a */
    public static Map<String, String> m5057a(Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.put("sign", C1100c.m5010a().mo4999a(map2, "TMP_SEED_KEY"));
        return map2;
    }
}

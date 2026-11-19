package com.alibaba.sdk.android.ams.common.util;

import com.alibaba.sdk.android.ams.common.p051b.C5575c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.ams.common.util.c */
/* loaded from: classes3.dex */
public class C5584c {
    /* renamed from: a */
    public static Map<String, String> m3458a(Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.put("sign", C5575c.m3411a().mo3400a(map2, "TMP_SEED_KEY"));
        return map2;
    }
}

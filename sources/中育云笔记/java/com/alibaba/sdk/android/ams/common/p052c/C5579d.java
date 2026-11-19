package com.alibaba.sdk.android.ams.common.p052c;

import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.push.p062d.p063a.C5665c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.ams.common.c.d */
/* loaded from: classes3.dex */
public class C5579d {

    /* renamed from: a */
    private static final AmsLogger f3999a = AmsLogger.getLogger("ServiceLoader");

    /* renamed from: b */
    private static final String f4000b = C5665c.class.getName();

    /* renamed from: a */
    public static <T> List<T> m3416a(Class<T> cls, ClassLoader classLoader) {
        String name = cls.getName();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(cls.cast(classLoader.loadClass(f4000b).newInstance()));
            return arrayList;
        } catch (Exception e10) {
            throw new IllegalStateException("Fail to load ams-spi-services for " + name, e10);
        }
    }
}

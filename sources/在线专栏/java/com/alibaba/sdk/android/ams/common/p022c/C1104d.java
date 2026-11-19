package com.alibaba.sdk.android.ams.common.p022c;

import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import com.alibaba.sdk.android.push.p032d.p033a.C1174c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.ams.common.c.d */
/* loaded from: classes.dex */
public class C1104d {

    /* renamed from: a */
    private static final AmsLogger f6514a = AmsLogger.getLogger("ServiceLoader");

    /* renamed from: b */
    private static final String f6515b = C1174c.class.getName();

    /* renamed from: a */
    public static <T> List<T> m5015a(Class<T> cls, ClassLoader classLoader) {
        String name = cls.getName();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(cls.cast(classLoader.loadClass(f6515b).newInstance()));
            return arrayList;
        } catch (Exception e4) {
            throw new IllegalStateException("Fail to load ams-spi-services for " + name, e4);
        }
    }
}

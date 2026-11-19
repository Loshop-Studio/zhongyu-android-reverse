package com.xuexiang.xui.utils;

import java.util.Collection;
import java.util.List;

/* renamed from: com.xuexiang.xui.utils.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8035a {
    /* renamed from: a */
    public static Object m12183a(List list, int i10) {
        if (m12185c(list, i10)) {
            return list.get(i10);
        }
        return null;
    }

    /* renamed from: b */
    public static int m12184b(Collection collection) {
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m12185c(Collection collection, int i10) {
        return collection != null && i10 >= 0 && i10 < collection.size();
    }
}

package com.xuexiang.xui.utils;

import java.util.Collection;
import java.util.List;

/* renamed from: com.xuexiang.xui.utils.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3526a {
    /* renamed from: a */
    public static Object m4044a(List list, int i4) {
        if (m4046c(list, i4)) {
            return list.get(i4);
        }
        return null;
    }

    /* renamed from: b */
    public static int m4045b(Collection collection) {
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m4046c(Collection collection, int i4) {
        return collection != null && i4 >= 0 && i4 < collection.size();
    }
}

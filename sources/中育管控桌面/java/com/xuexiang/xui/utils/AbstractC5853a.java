package com.xuexiang.xui.utils;

import java.util.Collection;
import java.util.List;

/* renamed from: com.xuexiang.xui.utils.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5853a {
    /* renamed from: a */
    public static Object m4343a(List list, int i6) {
        if (m4345c(list, i6)) {
            return list.get(i6);
        }
        return null;
    }

    /* renamed from: b */
    public static int m4344b(Collection collection) {
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m4345c(Collection collection, int i6) {
        return collection != null && i6 >= 0 && i6 < collection.size();
    }
}

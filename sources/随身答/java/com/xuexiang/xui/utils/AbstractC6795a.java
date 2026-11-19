package com.xuexiang.xui.utils;

import java.util.Collection;
import java.util.List;

/* renamed from: com.xuexiang.xui.utils.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6795a {
    /* renamed from: a */
    public static Object m6438a(List list, int i9) {
        if (m6440c(list, i9)) {
            return list.get(i9);
        }
        return null;
    }

    /* renamed from: b */
    public static int m6439b(Collection collection) {
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m6440c(Collection collection, int i9) {
        return collection != null && i9 >= 0 && i9 < collection.size();
    }
}

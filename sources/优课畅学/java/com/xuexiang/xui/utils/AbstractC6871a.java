package com.xuexiang.xui.utils;

import java.util.Collection;
import java.util.List;

/* renamed from: com.xuexiang.xui.utils.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6871a {
    /* renamed from: a */
    public static Object m6422a(List list, int i10) {
        if (m6424c(list, i10)) {
            return list.get(i10);
        }
        return null;
    }

    /* renamed from: b */
    public static int m6423b(Collection collection) {
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m6424c(Collection collection, int i10) {
        return collection != null && i10 >= 0 && i10 < collection.size();
    }
}

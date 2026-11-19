package com.xuexiang.xui.utils;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static <E> void clear(Collection<E> collection) {
        if (isEmpty(collection)) {
            return;
        }
        collection.clear();
    }

    public static <E> E getListItem(List<E> list, int i4) {
        if (isIndexValid(list, i4)) {
            return list.get(i4);
        }
        return null;
    }

    public static <E> int getSize(Collection<E> collection) {
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    public static <E> boolean isEmpty(Collection<E> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <E> boolean isIndexValid(Collection<E> collection, int i4) {
        return collection != null && i4 >= 0 && i4 < collection.size();
    }
}

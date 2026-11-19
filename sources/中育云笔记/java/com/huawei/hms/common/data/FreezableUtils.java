package com.huawei.hms.common.data;

import com.tencent.bugly.proguard.C7786as;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        return freezeIterable(arrayList);
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        C7786as.AnonymousClass2 anonymousClass2 = (ArrayList<T>) new ArrayList();
        if (iterable != null) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                anonymousClass2.add(it.next().freeze());
            }
        }
        return anonymousClass2;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        return freezeIterable(Arrays.asList(eArr));
    }
}

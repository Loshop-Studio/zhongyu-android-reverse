package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class RelationUtil__RelationUtilKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> map, boolean z10, InterfaceC10570l fetchBlock) {
        AbstractC9133u.m16133g(map, "map");
        AbstractC9133u.m16133g(fetchBlock, "fetchBlock");
        LongSparseArray<? extends V> longSparseArray = new LongSparseArray<>(999);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                longSparseArray.put(map.keyAt(i10), map.valueAt(i10));
            } else {
                longSparseArray.put(map.keyAt(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(longSparseArray);
                if (!z10) {
                    map.putAll(longSparseArray);
                }
                longSparseArray.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(longSparseArray);
            if (z10) {
                return;
            }
            map.putAll(longSparseArray);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchMap(Map<K, V> map, boolean z10, InterfaceC10570l fetchBlock) {
        int i10;
        AbstractC9133u.m16133g(map, "map");
        AbstractC9133u.m16133g(fetchBlock, "fetchBlock");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        loop0: while (true) {
            i10 = 0;
            for (K k10 : map.keySet()) {
                if (z10) {
                    linkedHashMap.put(k10, map.get(k10));
                } else {
                    linkedHashMap.put(k10, null);
                }
                i10++;
                if (i10 == 999) {
                    fetchBlock.invoke(linkedHashMap);
                    if (!z10) {
                        map.putAll(linkedHashMap);
                    }
                    linkedHashMap.clear();
                }
            }
            break loop0;
        }
        if (i10 > 0) {
            fetchBlock.invoke(linkedHashMap);
            if (z10) {
                return;
            }
            map.putAll(linkedHashMap);
        }
    }
}

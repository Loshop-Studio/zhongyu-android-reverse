package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class RelationUtil__RelationUtil_androidKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> map, boolean z10, InterfaceC10570l fetchBlock) {
        AbstractC9133u.m16133g(map, "map");
        AbstractC9133u.m16133g(fetchBlock, "fetchBlock");
        ArrayMap arrayMap = new ArrayMap(999);
        int size = map.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                arrayMap.put(map.keyAt(i10), map.valueAt(i10));
            } else {
                arrayMap.put(map.keyAt(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(arrayMap);
                if (!z10) {
                    map.putAll((Map) arrayMap);
                }
                arrayMap.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(arrayMap);
            if (z10) {
                return;
            }
            map.putAll((Map) arrayMap);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> map, boolean z10, InterfaceC10570l fetchBlock) {
        int i10;
        AbstractC9133u.m16133g(map, "map");
        AbstractC9133u.m16133g(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i10 = 0;
            for (K k10 : map.keySet()) {
                AbstractC9133u.m16132f(k10, "next(...)");
                if (z10) {
                    map2.put(k10, map.get(k10));
                } else {
                    map2.put(k10, null);
                }
                i10++;
                if (i10 == 999) {
                    fetchBlock.invoke(map2);
                    if (!z10) {
                        map.putAll(map2);
                    }
                    map2.clear();
                }
            }
            break loop0;
        }
        if (i10 > 0) {
            fetchBlock.invoke(map2);
            if (z10) {
                return;
            }
            map.putAll(map2);
        }
    }
}

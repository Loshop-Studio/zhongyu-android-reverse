package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.util.HashMap;
import java.util.Map;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class RelationUtil {
    public static final int MAX_BIND_PARAMETER_CNT = 999;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> arrayMap, boolean z10, InterfaceC10570l interfaceC10570l) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchArrayMap(arrayMap, z10, interfaceC10570l);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> map, boolean z10, InterfaceC10570l interfaceC10570l) {
        RelationUtil__RelationUtil_androidKt.recursiveFetchHashMap(map, z10, interfaceC10570l);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> longSparseArray, boolean z10, InterfaceC10570l interfaceC10570l) {
        RelationUtil__RelationUtilKt.recursiveFetchLongSparseArray(longSparseArray, z10, interfaceC10570l);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchMap(Map<K, V> map, boolean z10, InterfaceC10570l interfaceC10570l) {
        RelationUtil__RelationUtilKt.recursiveFetchMap(map, z10, interfaceC10570l);
    }
}

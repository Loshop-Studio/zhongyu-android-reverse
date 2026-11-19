package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class IntObjectMapKt {
    private static final MutableIntObjectMap EmptyIntObjectMap = new MutableIntObjectMap(0);

    public static final <V> IntObjectMap<V> buildIntObjectMap(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        builderAction.invoke(mutableIntObjectMap);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> emptyIntObjectMap() {
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        AbstractC9979u.m20292e(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf() {
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        AbstractC9979u.m20292e(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf() {
        return new MutableIntObjectMap<>(0, 1, null);
    }

    public static final <V> IntObjectMap<V> buildIntObjectMap(int i10, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(i10);
        builderAction.invoke(mutableIntObjectMap);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10, int i11, V v11) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10, int i11, V v11) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        mutableIntObjectMap.set(i14, v14);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v10, int i11, V v11, int i12, V v12, int i13, V v13, int i14, V v14) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        mutableIntObjectMap.set(i13, v13);
        mutableIntObjectMap.set(i14, v14);
        return mutableIntObjectMap;
    }
}

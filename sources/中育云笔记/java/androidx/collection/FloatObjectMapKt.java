package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class FloatObjectMapKt {
    private static final MutableFloatObjectMap EmptyFloatObjectMap = new MutableFloatObjectMap(0);

    public static final <V> FloatObjectMap<V> buildFloatObjectMap(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        builderAction.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        AbstractC9979u.m20292e(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        AbstractC9979u.m20292e(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap<>(0, 1, null);
    }

    public static final <V> FloatObjectMap<V> buildFloatObjectMap(int i10, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(i10);
        builderAction.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10, float f11, V v11) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10, float f11, V v11) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        mutableFloatObjectMap.set(f14, v14);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v10, float f11, V v11, float f12, V v12, float f13, V v13, float f14, V v14) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        mutableFloatObjectMap.set(f13, v13);
        mutableFloatObjectMap.set(f14, v14);
        return mutableFloatObjectMap;
    }
}

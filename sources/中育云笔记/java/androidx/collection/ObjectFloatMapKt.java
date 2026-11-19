package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class ObjectFloatMapKt {
    private static final MutableObjectFloatMap<Object> EmptyObjectFloatMap = new MutableObjectFloatMap<>(0);

    public static final <K> ObjectFloatMap<K> buildObjectFloatMap(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        builderAction.invoke(mutableObjectFloatMap);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> emptyObjectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        AbstractC9979u.m20292e(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
        return new MutableObjectFloatMap<>(0, 1, null);
    }

    public static final <K> ObjectFloatMap<K> objectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        AbstractC9979u.m20292e(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> buildObjectFloatMap(int i10, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(i10);
        builderAction.invoke(mutableObjectFloatMap);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10, K k11, float f11) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10, K k11, float f11) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        mutableObjectFloatMap.set(k14, f14);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f10, K k11, float f11, K k12, float f12, K k13, float f13, K k14, float f14) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f10);
        mutableObjectFloatMap.set(k11, f11);
        mutableObjectFloatMap.set(k12, f12);
        mutableObjectFloatMap.set(k13, f13);
        mutableObjectFloatMap.set(k14, f14);
        return mutableObjectFloatMap;
    }
}

package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class FloatIntMapKt {
    private static final MutableFloatIntMap EmptyFloatIntMap = new MutableFloatIntMap(0);

    public static final FloatIntMap buildFloatIntMap(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        builderAction.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap emptyFloatIntMap() {
        return EmptyFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf() {
        return EmptyFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf() {
        return new MutableFloatIntMap(0, 1, null);
    }

    public static final FloatIntMap buildFloatIntMap(int i10, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(i10);
        builderAction.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10, float f11, int i11) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10, float f11, int i11) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        mutableFloatIntMap.set(f14, i14);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        mutableFloatIntMap.set(f14, i14);
        return mutableFloatIntMap;
    }
}

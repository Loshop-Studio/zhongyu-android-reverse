package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class FloatFloatMapKt {
    private static final MutableFloatFloatMap EmptyFloatFloatMap = new MutableFloatFloatMap(0);

    public static final FloatFloatMap buildFloatFloatMap(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        builderAction.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap emptyFloatFloatMap() {
        return EmptyFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf() {
        return EmptyFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
        return new MutableFloatFloatMap(0, 1, null);
    }

    public static final FloatFloatMap buildFloatFloatMap(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(i10);
        builderAction.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f10, float f11) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f10, float f11, float f12, float f13) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11, float f12, float f13) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        mutableFloatFloatMap.set(f16, f17);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        mutableFloatFloatMap.set(f16, f17);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        mutableFloatFloatMap.set(f16, f17);
        mutableFloatFloatMap.set(f18, f19);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f10, f11);
        mutableFloatFloatMap.set(f12, f13);
        mutableFloatFloatMap.set(f14, f15);
        mutableFloatFloatMap.set(f16, f17);
        mutableFloatFloatMap.set(f18, f19);
        return mutableFloatFloatMap;
    }
}

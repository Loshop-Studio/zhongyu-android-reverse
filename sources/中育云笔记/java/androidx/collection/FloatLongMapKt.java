package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class FloatLongMapKt {
    private static final MutableFloatLongMap EmptyFloatLongMap = new MutableFloatLongMap(0);

    public static final FloatLongMap buildFloatLongMap(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        builderAction.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap emptyFloatLongMap() {
        return EmptyFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf() {
        return EmptyFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf() {
        return new MutableFloatLongMap(0, 1, null);
    }

    public static final FloatLongMap buildFloatLongMap(int i10, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(i10);
        builderAction.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f10, long j10) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f10, long j10, float f11, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10, float f11, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        mutableFloatLongMap.set(f14, j14);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f10, long j10, float f11, long j11, float f12, long j12, float f13, long j13, float f14, long j14) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f10, j10);
        mutableFloatLongMap.set(f11, j11);
        mutableFloatLongMap.set(f12, j12);
        mutableFloatLongMap.set(f13, j13);
        mutableFloatLongMap.set(f14, j14);
        return mutableFloatLongMap;
    }
}

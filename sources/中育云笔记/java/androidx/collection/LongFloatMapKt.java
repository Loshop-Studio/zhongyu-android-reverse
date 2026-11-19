package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class LongFloatMapKt {
    private static final MutableLongFloatMap EmptyLongFloatMap = new MutableLongFloatMap(0);

    public static final LongFloatMap buildLongFloatMap(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        builderAction.invoke(mutableLongFloatMap);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap emptyLongFloatMap() {
        return EmptyLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf() {
        return EmptyLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf() {
        return new MutableLongFloatMap(0, 1, null);
    }

    public static final LongFloatMap buildLongFloatMap(int i10, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(i10);
        builderAction.invoke(mutableLongFloatMap);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j10, float f10) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j10, float f10, long j11, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10, long j11, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13, long j14, float f14) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f10);
        mutableLongFloatMap.set(j11, f11);
        mutableLongFloatMap.set(j12, f12);
        mutableLongFloatMap.set(j13, f13);
        mutableLongFloatMap.set(j14, f14);
        return mutableLongFloatMap;
    }
}

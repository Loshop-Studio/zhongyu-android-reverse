package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class LongIntMapKt {
    private static final MutableLongIntMap EmptyLongIntMap = new MutableLongIntMap(0);

    public static final LongIntMap buildLongIntMap(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        builderAction.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    public static final LongIntMap emptyLongIntMap() {
        return EmptyLongIntMap;
    }

    public static final LongIntMap longIntMapOf() {
        return EmptyLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf() {
        return new MutableLongIntMap(0, 1, null);
    }

    public static final LongIntMap buildLongIntMap(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(i10);
        builderAction.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        return mutableLongIntMap;
    }
}

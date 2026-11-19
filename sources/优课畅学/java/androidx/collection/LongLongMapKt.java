package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class LongLongMapKt {
    private static final MutableLongLongMap EmptyLongLongMap = new MutableLongLongMap(0);

    public static final LongLongMap buildLongLongMap(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        builderAction.invoke(mutableLongLongMap);
        return mutableLongLongMap;
    }

    public static final LongLongMap emptyLongLongMap() {
        return EmptyLongLongMap;
    }

    public static final LongLongMap longLongMapOf() {
        return EmptyLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf() {
        return new MutableLongLongMap(0, 1, null);
    }

    public static final LongLongMap buildLongLongMap(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(i10);
        builderAction.invoke(mutableLongLongMap);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long j10, long j11) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long j10, long j11, long j12, long j13) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11, long j12, long j13) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        mutableLongLongMap.set(j16, j17);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        mutableLongLongMap.set(j16, j17);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        mutableLongLongMap.set(j16, j17);
        mutableLongLongMap.set(j18, j19);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        mutableLongLongMap.set(j16, j17);
        mutableLongLongMap.set(j18, j19);
        return mutableLongLongMap;
    }
}

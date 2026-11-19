package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class LongSetKt {
    private static final MutableLongSet EmptyLongSet = new MutableLongSet(0);
    private static final long[] EmptyLongArray = new long[0];

    public static final LongSet buildLongSet(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableLongSet mutableLongSet = new MutableLongSet(0, 1, null);
        builderAction.invoke(mutableLongSet);
        return mutableLongSet;
    }

    public static final LongSet emptyLongSet() {
        return EmptyLongSet;
    }

    public static final long[] getEmptyLongArray() {
        return EmptyLongArray;
    }

    public static final int hash(long j10) {
        int iHashCode = Long.hashCode(j10) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final LongSet longSetOf() {
        return EmptyLongSet;
    }

    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, null);
    }

    public static final LongSet buildLongSet(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableLongSet mutableLongSet = new MutableLongSet(i10);
        builderAction.invoke(mutableLongSet);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j10) {
        return mutableLongSetOf(j10);
    }

    public static final MutableLongSet mutableLongSetOf(long j10) {
        MutableLongSet mutableLongSet = new MutableLongSet(1);
        mutableLongSet.plusAssign(j10);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j10, long j11) {
        return mutableLongSetOf(j10, j11);
    }

    public static final MutableLongSet mutableLongSetOf(long j10, long j11) {
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        mutableLongSet.plusAssign(j10);
        mutableLongSet.plusAssign(j11);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j10, long j11, long j12) {
        return mutableLongSetOf(j10, j11, j12);
    }

    public static final LongSet longSetOf(long... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j10, long j11, long j12) {
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        mutableLongSet.plusAssign(j10);
        mutableLongSet.plusAssign(j11);
        mutableLongSet.plusAssign(j12);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }
}

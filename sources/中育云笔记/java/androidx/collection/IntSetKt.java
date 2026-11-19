package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class IntSetKt {
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);
    private static final int[] EmptyIntArray = new int[0];

    public static final IntSet buildIntSet(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        builderAction.invoke(mutableIntSet);
        return mutableIntSet;
    }

    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final int hash(int i10) {
        int iHashCode = Integer.hashCode(i10) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    public static final IntSet buildIntSet(int i10, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableIntSet mutableIntSet = new MutableIntSet(i10);
        builderAction.invoke(mutableIntSet);
        return mutableIntSet;
    }

    public static final IntSet intSetOf(int i10) {
        return mutableIntSetOf(i10);
    }

    public static final MutableIntSet mutableIntSetOf(int i10) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i10);
        return mutableIntSet;
    }

    public static final IntSet intSetOf(int i10, int i11) {
        return mutableIntSetOf(i10, i11);
    }

    public static final MutableIntSet mutableIntSetOf(int i10, int i11) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i10);
        mutableIntSet.plusAssign(i11);
        return mutableIntSet;
    }

    public static final IntSet intSetOf(int i10, int i11, int i12) {
        return mutableIntSetOf(i10, i11, i12);
    }

    public static final IntSet intSetOf(int... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int i10, int i11, int i12) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i10);
        mutableIntSet.plusAssign(i11);
        mutableIntSet.plusAssign(i12);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }
}

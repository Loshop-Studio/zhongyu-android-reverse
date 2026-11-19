package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class IntListKt {
    private static final IntList EmptyIntList = new MutableIntList(0);

    public static final IntList buildIntList(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        builderAction.invoke(mutableIntList);
        return mutableIntList;
    }

    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    public static final IntList intListOf() {
        return EmptyIntList;
    }

    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }

    public static final IntList buildIntList(int i10, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        MutableIntList mutableIntList = new MutableIntList(i10);
        builderAction.invoke(mutableIntList);
        return mutableIntList;
    }

    public static final IntList intListOf(int i10) {
        return mutableIntListOf(i10);
    }

    public static final MutableIntList mutableIntListOf(int i10) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i10);
        return mutableIntList;
    }

    public static final IntList intListOf(int i10, int i11) {
        return mutableIntListOf(i10, i11);
    }

    public static final IntList intListOf(int i10, int i11, int i12) {
        return mutableIntListOf(i10, i11, i12);
    }

    public static final MutableIntList mutableIntListOf(int i10, int i11) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i10);
        mutableIntList.add(i11);
        return mutableIntList;
    }

    public static final IntList intListOf(int... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.addAll(mutableIntList._size, elements);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int i10, int i11, int i12) {
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i10);
        mutableIntList.add(i11);
        mutableIntList.add(i12);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.addAll(mutableIntList._size, elements);
        return mutableIntList;
    }
}

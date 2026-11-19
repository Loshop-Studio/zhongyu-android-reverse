package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class LongListKt {
    private static final LongList EmptyLongList = new MutableLongList(0);

    public static final LongList buildLongList(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableLongList mutableLongList = new MutableLongList(0, 1, null);
        builderAction.invoke(mutableLongList);
        return mutableLongList;
    }

    public static final LongList emptyLongList() {
        return EmptyLongList;
    }

    public static final LongList longListOf() {
        return EmptyLongList;
    }

    public static final MutableLongList mutableLongListOf() {
        return new MutableLongList(0, 1, null);
    }

    public static final LongList buildLongList(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableLongList mutableLongList = new MutableLongList(i10);
        builderAction.invoke(mutableLongList);
        return mutableLongList;
    }

    public static final LongList longListOf(long j10) {
        return mutableLongListOf(j10);
    }

    public static final MutableLongList mutableLongListOf(long j10) {
        MutableLongList mutableLongList = new MutableLongList(1);
        mutableLongList.add(j10);
        return mutableLongList;
    }

    public static final LongList longListOf(long j10, long j11) {
        return mutableLongListOf(j10, j11);
    }

    public static final LongList longListOf(long j10, long j11, long j12) {
        return mutableLongListOf(j10, j11, j12);
    }

    public static final MutableLongList mutableLongListOf(long j10, long j11) {
        MutableLongList mutableLongList = new MutableLongList(2);
        mutableLongList.add(j10);
        mutableLongList.add(j11);
        return mutableLongList;
    }

    public static final LongList longListOf(long... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.addAll(mutableLongList._size, elements);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long j10, long j11, long j12) {
        MutableLongList mutableLongList = new MutableLongList(3);
        mutableLongList.add(j10);
        mutableLongList.add(j11);
        mutableLongList.add(j12);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.addAll(mutableLongList._size, elements);
        return mutableLongList;
    }
}

package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class OrderedScatterSetKt {
    private static final MutableOrderedScatterSet<Object> EmptyOrderedScatterSet = new MutableOrderedScatterSet<>(0);

    public static final <E> OrderedScatterSet<E> emptyOrderedScatterSet() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        AbstractC9133u.m16131e(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.emptyOrderedScatterSet>");
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf() {
        return new MutableOrderedScatterSet<>(0, 1, null);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        AbstractC9133u.m16131e(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.orderedScatterSetOf>");
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e10) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(1);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e10);
        return mutableOrderedScatterSet;
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e10) {
        return mutableOrderedScatterSetOf(e10);
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e10, E e11) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(2);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e10);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e11);
        return mutableOrderedScatterSet;
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e10, E e11) {
        return mutableOrderedScatterSetOf(e10, e11);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e10, E e11, E e12) {
        return mutableOrderedScatterSetOf(e10, e11, e12);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableOrderedScatterSet mutableOrderedScatterSet = new MutableOrderedScatterSet(elements.length);
        mutableOrderedScatterSet.plusAssign((Object[]) elements);
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e10, E e11, E e12) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(3);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e10);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e11);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e12);
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(elements.length);
        mutableOrderedScatterSet.plusAssign((Object[]) elements);
        return mutableOrderedScatterSet;
    }
}

package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class ScatterSetKt {
    private static final MutableScatterSet<Object> EmptyScatterSet = new MutableScatterSet<>(0);

    public static final <E> ScatterSet<E> emptyScatterSet() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        AbstractC9133u.m16131e(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf() {
        return new MutableScatterSet<>(0, 1, null);
    }

    public static final <E> ScatterSet<E> scatterSetOf() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        AbstractC9133u.m16131e(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e10) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e10);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e10) {
        return mutableScatterSetOf(e10);
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e10, E e11) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e10);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e11);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e10, E e11) {
        return mutableScatterSetOf(e10, e11);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e10, E e11, E e12) {
        return mutableScatterSetOf(e10, e11, e12);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableScatterSet mutableScatterSet = new MutableScatterSet(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e10, E e11, E e12) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e10);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e11);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e12);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }
}

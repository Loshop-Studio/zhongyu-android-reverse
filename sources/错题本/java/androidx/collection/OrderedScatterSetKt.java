package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\b\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n\u001a/\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\f\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0011\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0012\u001a/\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0013\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u0014\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m5110d2 = {"EmptyOrderedScatterSet", "Landroidx/collection/MutableOrderedScatterSet;", "", "emptyOrderedScatterSet", "Landroidx/collection/OrderedScatterSet;", ExifInterface.LONGITUDE_EAST, "mutableOrderedScatterSetOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "elements", "", "([Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "orderedScatterSetOf", "(Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "([Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1511:1\n1#2:1512\n*E\n"})
/* loaded from: classes.dex */
public final class OrderedScatterSetKt {

    @NotNull
    private static final MutableOrderedScatterSet<Object> EmptyOrderedScatterSet = new MutableOrderedScatterSet<>(0);

    @NotNull
    public static final <E> OrderedScatterSet<E> emptyOrderedScatterSet() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        AbstractC5830k.m5328e(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.emptyOrderedScatterSet>");
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf() {
        return new MutableOrderedScatterSet<>(0, 1, null);
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        AbstractC5830k.m5328e(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.orderedScatterSetOf>");
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(1);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e);
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e) {
        return mutableOrderedScatterSetOf(e);
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e, E e4) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(2);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e4);
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e, E e4) {
        return mutableOrderedScatterSetOf(e, e4);
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e, E e4, E e8) {
        return mutableOrderedScatterSetOf(e, e4, e8);
    }

    @NotNull
    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(@NotNull E... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableOrderedScatterSet mutableOrderedScatterSet = new MutableOrderedScatterSet(elements.length);
        mutableOrderedScatterSet.plusAssign((Object[]) elements);
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e, E e4, E e8) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(3);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e4);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e8);
        return mutableOrderedScatterSet;
    }

    @NotNull
    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(@NotNull E... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(elements.length);
        mutableOrderedScatterSet.plusAssign((Object[]) elements);
        return mutableOrderedScatterSet;
    }
}

package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012\u001a%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0014\u001a9\u0010\u0019\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aA\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0019\u0010\u001c\u001a\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u001a\u0010\"\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, m5110d2 = {"Landroidx/collection/IntSet;", "emptyIntSet", "()Landroidx/collection/IntSet;", "intSetOf", "", "element1", "(I)Landroidx/collection/IntSet;", "element2", "(II)Landroidx/collection/IntSet;", "element3", "(III)Landroidx/collection/IntSet;", "", "elements", "([I)Landroidx/collection/IntSet;", "Landroidx/collection/MutableIntSet;", "mutableIntSetOf", "()Landroidx/collection/MutableIntSet;", "(I)Landroidx/collection/MutableIntSet;", "(II)Landroidx/collection/MutableIntSet;", "(III)Landroidx/collection/MutableIntSet;", "([I)Landroidx/collection/MutableIntSet;", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildIntSet", "(Lr6/c;)Landroidx/collection/IntSet;", "initialCapacity", "(ILr6/c;)Landroidx/collection/IntSet;", "k", "hash", "(I)I", "EmptyIntSet", "Landroidx/collection/MutableIntSet;", "EmptyIntArray", "[I", "getEmptyIntArray", "()[I", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,884:1\n1#2:885\n*E\n"})
/* loaded from: classes.dex */
public final class IntSetKt {

    @NotNull
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);

    @NotNull
    private static final int[] EmptyIntArray = new int[0];

    @NotNull
    public static final IntSet buildIntSet(@NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        builderAction.invoke(mutableIntSet);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    @NotNull
    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final int hash(int i) {
        int iHashCode = Integer.hashCode(i) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    @NotNull
    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    @NotNull
    public static final IntSet buildIntSet(int i, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableIntSet mutableIntSet = new MutableIntSet(i);
        builderAction.invoke(mutableIntSet);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(int i) {
        return mutableIntSetOf(i);
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(int i, int i8) {
        return mutableIntSetOf(i, i8);
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i, int i8) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i8);
        return mutableIntSet;
    }

    @NotNull
    public static final IntSet intSetOf(int i, int i8, int i9) {
        return mutableIntSetOf(i, i8, i9);
    }

    @NotNull
    public static final IntSet intSetOf(@NotNull int... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(int i, int i8, int i9) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i8);
        mutableIntSet.plusAssign(i9);
        return mutableIntSet;
    }

    @NotNull
    public static final MutableIntSet mutableIntSetOf(@NotNull int... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }
}

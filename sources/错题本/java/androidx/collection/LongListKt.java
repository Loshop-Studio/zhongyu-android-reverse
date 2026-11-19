package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001a\u0010\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012\u001a%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u001c\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0014\u001a9\u0010\u0019\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aA\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0019\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m5110d2 = {"Landroidx/collection/LongList;", "emptyLongList", "()Landroidx/collection/LongList;", "longListOf", "", "element1", "(J)Landroidx/collection/LongList;", "element2", "(JJ)Landroidx/collection/LongList;", "element3", "(JJJ)Landroidx/collection/LongList;", "", "elements", "([J)Landroidx/collection/LongList;", "Landroidx/collection/MutableLongList;", "mutableLongListOf", "()Landroidx/collection/MutableLongList;", "(J)Landroidx/collection/MutableLongList;", "(JJ)Landroidx/collection/MutableLongList;", "(JJJ)Landroidx/collection/MutableLongList;", "([J)Landroidx/collection/MutableLongList;", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildLongList", "(Lr6/c;)Landroidx/collection/LongList;", "", "initialCapacity", "(ILr6/c;)Landroidx/collection/LongList;", "EmptyLongList", "Landroidx/collection/LongList;", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,972:1\n1#2:973\n673#3,2:974\n713#3,2:976\n713#3,2:978\n713#3,2:980\n713#3,2:982\n713#3,2:984\n713#3,2:986\n673#3,2:988\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n905#1:974,2\n913#1:976,2\n920#1:978,2\n921#1:980,2\n931#1:982,2\n932#1:984,2\n933#1:986,2\n939#1:988,2\n*E\n"})
/* loaded from: classes.dex */
public final class LongListKt {

    @NotNull
    private static final LongList EmptyLongList = new MutableLongList(0);

    @NotNull
    public static final LongList buildLongList(@NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableLongList mutableLongList = new MutableLongList(0, 1, null);
        builderAction.invoke(mutableLongList);
        return mutableLongList;
    }

    @NotNull
    public static final LongList emptyLongList() {
        return EmptyLongList;
    }

    @NotNull
    public static final LongList longListOf() {
        return EmptyLongList;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf() {
        return new MutableLongList(0, 1, null);
    }

    @NotNull
    public static final LongList buildLongList(int i, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableLongList mutableLongList = new MutableLongList(i);
        builderAction.invoke(mutableLongList);
        return mutableLongList;
    }

    @NotNull
    public static final LongList longListOf(long j7) {
        return mutableLongListOf(j7);
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(long j7) {
        MutableLongList mutableLongList = new MutableLongList(1);
        mutableLongList.add(j7);
        return mutableLongList;
    }

    @NotNull
    public static final LongList longListOf(long j7, long j8) {
        return mutableLongListOf(j7, j8);
    }

    @NotNull
    public static final LongList longListOf(long j7, long j8, long j9) {
        return mutableLongListOf(j7, j8, j9);
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(long j7, long j8) {
        MutableLongList mutableLongList = new MutableLongList(2);
        mutableLongList.add(j7);
        mutableLongList.add(j8);
        return mutableLongList;
    }

    @NotNull
    public static final LongList longListOf(@NotNull long... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.addAll(mutableLongList._size, elements);
        return mutableLongList;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(long j7, long j8, long j9) {
        MutableLongList mutableLongList = new MutableLongList(3);
        mutableLongList.add(j7);
        mutableLongList.add(j8);
        mutableLongList.add(j9);
        return mutableLongList;
    }

    @NotNull
    public static final MutableLongList mutableLongListOf(@NotNull long... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.addAll(mutableLongList._size, elements);
        return mutableLongList;
    }
}

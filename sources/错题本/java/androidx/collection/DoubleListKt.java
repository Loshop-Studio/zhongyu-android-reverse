package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001a\u0010\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012\u001a%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u001c\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0014\u001a9\u0010\u0019\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aA\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0019\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m5110d2 = {"Landroidx/collection/DoubleList;", "emptyDoubleList", "()Landroidx/collection/DoubleList;", "doubleListOf", "", "element1", "(D)Landroidx/collection/DoubleList;", "element2", "(DD)Landroidx/collection/DoubleList;", "element3", "(DDD)Landroidx/collection/DoubleList;", "", "elements", "([D)Landroidx/collection/DoubleList;", "Landroidx/collection/MutableDoubleList;", "mutableDoubleListOf", "()Landroidx/collection/MutableDoubleList;", "(D)Landroidx/collection/MutableDoubleList;", "(DD)Landroidx/collection/MutableDoubleList;", "(DDD)Landroidx/collection/MutableDoubleList;", "([D)Landroidx/collection/MutableDoubleList;", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildDoubleList", "(Lr6/c;)Landroidx/collection/DoubleList;", "", "initialCapacity", "(ILr6/c;)Landroidx/collection/DoubleList;", "EmptyDoubleList", "Landroidx/collection/DoubleList;", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DoubleList.kt\nandroidx/collection/MutableDoubleList\n*L\n1#1,983:1\n1#2:984\n678#3,2:985\n718#3,2:987\n718#3,2:989\n718#3,2:991\n718#3,2:993\n718#3,2:995\n718#3,2:997\n678#3,2:999\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/DoubleListKt\n*L\n912#1:985,2\n920#1:987,2\n927#1:989,2\n928#1:991,2\n942#1:993,2\n943#1:995,2\n944#1:997,2\n950#1:999,2\n*E\n"})
/* loaded from: classes.dex */
public final class DoubleListKt {

    @NotNull
    private static final DoubleList EmptyDoubleList = new MutableDoubleList(0);

    @NotNull
    public static final DoubleList buildDoubleList(@NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(0, 1, null);
        builderAction.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    @NotNull
    public static final DoubleList doubleListOf() {
        return EmptyDoubleList;
    }

    @NotNull
    public static final DoubleList emptyDoubleList() {
        return EmptyDoubleList;
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf() {
        return new MutableDoubleList(0, 1, null);
    }

    @NotNull
    public static final DoubleList buildDoubleList(int i, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(i);
        builderAction.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    @NotNull
    public static final DoubleList doubleListOf(double d9) {
        return mutableDoubleListOf(d9);
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf(double d9) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(1);
        mutableDoubleList.add(d9);
        return mutableDoubleList;
    }

    @NotNull
    public static final DoubleList doubleListOf(double d9, double d10) {
        return mutableDoubleListOf(d9, d10);
    }

    @NotNull
    public static final DoubleList doubleListOf(double d9, double d10, double d11) {
        return mutableDoubleListOf(d9, d10, d11);
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf(double d9, double d10) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(2);
        mutableDoubleList.add(d9);
        mutableDoubleList.add(d10);
        return mutableDoubleList;
    }

    @NotNull
    public static final DoubleList doubleListOf(@NotNull double... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(elements.length);
        mutableDoubleList.addAll(mutableDoubleList._size, elements);
        return mutableDoubleList;
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf(double d9, double d10, double d11) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(3);
        mutableDoubleList.add(d9);
        mutableDoubleList.add(d10);
        mutableDoubleList.add(d11);
        return mutableDoubleList;
    }

    @NotNull
    public static final MutableDoubleList mutableDoubleListOf(@NotNull double... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(elements.length);
        mutableDoubleList.addAll(mutableDoubleList._size, elements);
        return mutableDoubleList;
    }
}

package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012\u001a%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0014\u001a9\u0010\u0019\u001a\u00020\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aA\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0019\u0010\u001d\u001a\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u001a\u0010#\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, m5110d2 = {"Landroidx/collection/FloatSet;", "emptyFloatSet", "()Landroidx/collection/FloatSet;", "floatSetOf", "", "element1", "(F)Landroidx/collection/FloatSet;", "element2", "(FF)Landroidx/collection/FloatSet;", "element3", "(FFF)Landroidx/collection/FloatSet;", "", "elements", "([F)Landroidx/collection/FloatSet;", "Landroidx/collection/MutableFloatSet;", "mutableFloatSetOf", "()Landroidx/collection/MutableFloatSet;", "(F)Landroidx/collection/MutableFloatSet;", "(FF)Landroidx/collection/MutableFloatSet;", "(FFF)Landroidx/collection/MutableFloatSet;", "([F)Landroidx/collection/MutableFloatSet;", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildFloatSet", "(Lr6/c;)Landroidx/collection/FloatSet;", "", "initialCapacity", "(ILr6/c;)Landroidx/collection/FloatSet;", "k", "hash", "(F)I", "EmptyFloatSet", "Landroidx/collection/MutableFloatSet;", "EmptyFloatArray", "[F", "getEmptyFloatArray", "()[F", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,886:1\n1#2:887\n*E\n"})
/* loaded from: classes.dex */
public final class FloatSetKt {

    @NotNull
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);

    @NotNull
    private static final float[] EmptyFloatArray = new float[0];

    @NotNull
    public static final FloatSet buildFloatSet(@NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(0, 1, null);
        builderAction.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet emptyFloatSet() {
        return EmptyFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf() {
        return EmptyFloatSet;
    }

    @NotNull
    public static final float[] getEmptyFloatArray() {
        return EmptyFloatArray;
    }

    public static final int hash(float f) {
        int iHashCode = Float.hashCode(f) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    @NotNull
    public static final FloatSet buildFloatSet(int i, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(i);
        builderAction.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf(float f) {
        return mutableFloatSetOf(f);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf(float f, float f7) {
        return mutableFloatSetOf(f, f7);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f, float f7) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f);
        mutableFloatSet.plusAssign(f7);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf(float f, float f7, float f8) {
        return mutableFloatSetOf(f, f7, f8);
    }

    @NotNull
    public static final FloatSet floatSetOf(@NotNull float... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f, float f7, float f8) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f);
        mutableFloatSet.plusAssign(f7);
        mutableFloatSet.plusAssign(f8);
        return mutableFloatSet;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(@NotNull float... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }
}

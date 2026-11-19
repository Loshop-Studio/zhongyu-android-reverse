package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000b\u001a=\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000e\u001aM\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0011\u001a]\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0018\u001a-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0019\u001a=\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001a\u001aM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001b\u001a]\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001c\u001a9\u0010!\u001a\u00020\u00002\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\b\u001fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b!\u0010\"\u001aA\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\b\u001fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b!\u0010$\"\u0014\u0010%\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, m5110d2 = {"Landroidx/collection/IntFloatMap;", "emptyIntFloatMap", "()Landroidx/collection/IntFloatMap;", "intFloatMapOf", "", "key1", "", "value1", "(IF)Landroidx/collection/IntFloatMap;", "key2", "value2", "(IFIF)Landroidx/collection/IntFloatMap;", "key3", "value3", "(IFIFIF)Landroidx/collection/IntFloatMap;", "key4", "value4", "(IFIFIFIF)Landroidx/collection/IntFloatMap;", "key5", "value5", "(IFIFIFIFIF)Landroidx/collection/IntFloatMap;", "Landroidx/collection/MutableIntFloatMap;", "mutableIntFloatMapOf", "()Landroidx/collection/MutableIntFloatMap;", "(IF)Landroidx/collection/MutableIntFloatMap;", "(IFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildIntFloatMap", "(Lr6/c;)Landroidx/collection/IntFloatMap;", "initialCapacity", "(ILr6/c;)Landroidx/collection/IntFloatMap;", "EmptyIntFloatMap", "Landroidx/collection/MutableIntFloatMap;", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIntFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntFloatMap.kt\nandroidx/collection/IntFloatMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class IntFloatMapKt {

    @NotNull
    private static final MutableIntFloatMap EmptyIntFloatMap = new MutableIntFloatMap(0);

    @NotNull
    public static final IntFloatMap buildIntFloatMap(@NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        builderAction.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap emptyIntFloatMap() {
        return EmptyIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf() {
        return EmptyIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf() {
        return new MutableIntFloatMap(0, 1, null);
    }

    @NotNull
    public static final IntFloatMap buildIntFloatMap(int i, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(i);
        builderAction.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i, float f) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i, float f, int i8, float f7) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i8, f7);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i8, float f7) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i8, f7);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i, float f, int i8, float f7, int i9, float f8) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i8, f7);
        mutableIntFloatMap.set(i9, f8);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i8, float f7, int i9, float f8) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i8, f7);
        mutableIntFloatMap.set(i9, f8);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i, float f, int i8, float f7, int i9, float f8, int i10, float f9) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i8, f7);
        mutableIntFloatMap.set(i9, f8);
        mutableIntFloatMap.set(i10, f9);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i8, float f7, int i9, float f8, int i10, float f9) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i8, f7);
        mutableIntFloatMap.set(i9, f8);
        mutableIntFloatMap.set(i10, f9);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i, float f, int i8, float f7, int i9, float f8, int i10, float f9, int i11, float f10) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i8, f7);
        mutableIntFloatMap.set(i9, f8);
        mutableIntFloatMap.set(i10, f9);
        mutableIntFloatMap.set(i11, f10);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i8, float f7, int i9, float f8, int i10, float f9, int i11, float f10) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i8, f7);
        mutableIntFloatMap.set(i9, f8);
        mutableIntFloatMap.set(i10, f9);
        mutableIntFloatMap.set(i11, f10);
        return mutableIntFloatMap;
    }
}

package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000b\u001a=\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000e\u001aM\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0011\u001a]\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0018\u001a-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0019\u001a=\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001a\u001aM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001b\u001a]\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001c\u001a9\u0010!\u001a\u00020\u00002\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\b\u001fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b!\u0010\"\u001aA\u0010!\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\b\u001fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b!\u0010%\"\u0014\u0010&\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, m5110d2 = {"Landroidx/collection/FloatLongMap;", "emptyFloatLongMap", "()Landroidx/collection/FloatLongMap;", "floatLongMapOf", "", "key1", "", "value1", "(FJ)Landroidx/collection/FloatLongMap;", "key2", "value2", "(FJFJ)Landroidx/collection/FloatLongMap;", "key3", "value3", "(FJFJFJ)Landroidx/collection/FloatLongMap;", "key4", "value4", "(FJFJFJFJ)Landroidx/collection/FloatLongMap;", "key5", "value5", "(FJFJFJFJFJ)Landroidx/collection/FloatLongMap;", "Landroidx/collection/MutableFloatLongMap;", "mutableFloatLongMapOf", "()Landroidx/collection/MutableFloatLongMap;", "(FJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildFloatLongMap", "(Lr6/c;)Landroidx/collection/FloatLongMap;", "", "initialCapacity", "(ILr6/c;)Landroidx/collection/FloatLongMap;", "EmptyFloatLongMap", "Landroidx/collection/MutableFloatLongMap;", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatLongMap.kt\nandroidx/collection/FloatLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1036:1\n1#2:1037\n*E\n"})
/* loaded from: classes.dex */
public final class FloatLongMapKt {

    @NotNull
    private static final MutableFloatLongMap EmptyFloatLongMap = new MutableFloatLongMap(0);

    @NotNull
    public static final FloatLongMap buildFloatLongMap(@NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        builderAction.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap emptyFloatLongMap() {
        return EmptyFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf() {
        return EmptyFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf() {
        return new MutableFloatLongMap(0, 1, null);
    }

    @NotNull
    public static final FloatLongMap buildFloatLongMap(int i, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(i);
        builderAction.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long j7) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j7) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long j7, float f7, long j8) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        mutableFloatLongMap.set(f7, j8);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j7, float f7, long j8) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        mutableFloatLongMap.set(f7, j8);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long j7, float f7, long j8, float f8, long j9) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        mutableFloatLongMap.set(f7, j8);
        mutableFloatLongMap.set(f8, j9);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j7, float f7, long j8, float f8, long j9) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        mutableFloatLongMap.set(f7, j8);
        mutableFloatLongMap.set(f8, j9);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long j7, float f7, long j8, float f8, long j9, float f9, long j10) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        mutableFloatLongMap.set(f7, j8);
        mutableFloatLongMap.set(f8, j9);
        mutableFloatLongMap.set(f9, j10);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j7, float f7, long j8, float f8, long j9, float f9, long j10) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        mutableFloatLongMap.set(f7, j8);
        mutableFloatLongMap.set(f8, j9);
        mutableFloatLongMap.set(f9, j10);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f, long j7, float f7, long j8, float f8, long j9, float f9, long j10, float f10, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        mutableFloatLongMap.set(f7, j8);
        mutableFloatLongMap.set(f8, j9);
        mutableFloatLongMap.set(f9, j10);
        mutableFloatLongMap.set(f10, j11);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j7, float f7, long j8, float f8, long j9, float f9, long j10, float f10, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j7);
        mutableFloatLongMap.set(f7, j8);
        mutableFloatLongMap.set(f8, j9);
        mutableFloatLongMap.set(f9, j10);
        mutableFloatLongMap.set(f10, j11);
        return mutableFloatLongMap;
    }
}

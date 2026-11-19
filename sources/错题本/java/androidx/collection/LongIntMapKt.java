package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000b\u001a=\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000e\u001aM\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0011\u001a]\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0018\u001a-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0019\u001a=\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001a\u001aM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001b\u001a]\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001c\u001a9\u0010!\u001a\u00020\u00002\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\b\u001fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b!\u0010\"\u001aA\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00062\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0002\b\u001fH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b!\u0010$\"\u0014\u0010%\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, m5110d2 = {"Landroidx/collection/LongIntMap;", "emptyLongIntMap", "()Landroidx/collection/LongIntMap;", "longIntMapOf", "", "key1", "", "value1", "(JI)Landroidx/collection/LongIntMap;", "key2", "value2", "(JIJI)Landroidx/collection/LongIntMap;", "key3", "value3", "(JIJIJI)Landroidx/collection/LongIntMap;", "key4", "value4", "(JIJIJIJI)Landroidx/collection/LongIntMap;", "key5", "value5", "(JIJIJIJIJI)Landroidx/collection/LongIntMap;", "Landroidx/collection/MutableLongIntMap;", "mutableLongIntMapOf", "()Landroidx/collection/MutableLongIntMap;", "(JI)Landroidx/collection/MutableLongIntMap;", "(JIJI)Landroidx/collection/MutableLongIntMap;", "(JIJIJI)Landroidx/collection/MutableLongIntMap;", "(JIJIJIJI)Landroidx/collection/MutableLongIntMap;", "(JIJIJIJIJI)Landroidx/collection/MutableLongIntMap;", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildLongIntMap", "(Lr6/c;)Landroidx/collection/LongIntMap;", "initialCapacity", "(ILr6/c;)Landroidx/collection/LongIntMap;", "EmptyLongIntMap", "Landroidx/collection/MutableLongIntMap;", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLongIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/LongIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class LongIntMapKt {

    @NotNull
    private static final MutableLongIntMap EmptyLongIntMap = new MutableLongIntMap(0);

    @NotNull
    public static final LongIntMap buildLongIntMap(@NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        builderAction.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap emptyLongIntMap() {
        return EmptyLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf() {
        return EmptyLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf() {
        return new MutableLongIntMap(0, 1, null);
    }

    @NotNull
    public static final LongIntMap buildLongIntMap(int i, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(i);
        builderAction.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j7, int i) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j7, int i) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j7, int i, long j8, int i8) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        mutableLongIntMap.set(j8, i8);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j7, int i, long j8, int i8) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        mutableLongIntMap.set(j8, i8);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j7, int i, long j8, int i8, long j9, int i9) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        mutableLongIntMap.set(j8, i8);
        mutableLongIntMap.set(j9, i9);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j7, int i, long j8, int i8, long j9, int i9) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        mutableLongIntMap.set(j8, i8);
        mutableLongIntMap.set(j9, i9);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j7, int i, long j8, int i8, long j9, int i9, long j10, int i10) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        mutableLongIntMap.set(j8, i8);
        mutableLongIntMap.set(j9, i9);
        mutableLongIntMap.set(j10, i10);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j7, int i, long j8, int i8, long j9, int i9, long j10, int i10) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        mutableLongIntMap.set(j8, i8);
        mutableLongIntMap.set(j9, i9);
        mutableLongIntMap.set(j10, i10);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j7, int i, long j8, int i8, long j9, int i9, long j10, int i10, long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        mutableLongIntMap.set(j8, i8);
        mutableLongIntMap.set(j9, i9);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j7, int i, long j8, int i8, long j9, int i9, long j10, int i10, long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j7, i);
        mutableLongIntMap.set(j8, i8);
        mutableLongIntMap.set(j9, i9);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }
}

package androidx.collection;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0007\u001a-\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a=\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001aM\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0010\u001a]\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0017\u001a-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0018\u001a=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0019\u001aM\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u001a\u001a]\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u001b\u001a9\u0010 \u001a\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001eH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b \u0010!\u001aA\u0010 \u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0002\b\u001eH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b \u0010$\"\u0014\u0010%\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, m5110d2 = {"Landroidx/collection/LongLongMap;", "emptyLongLongMap", "()Landroidx/collection/LongLongMap;", "longLongMapOf", "", "key1", "value1", "(JJ)Landroidx/collection/LongLongMap;", "key2", "value2", "(JJJJ)Landroidx/collection/LongLongMap;", "key3", "value3", "(JJJJJJ)Landroidx/collection/LongLongMap;", "key4", "value4", "(JJJJJJJJ)Landroidx/collection/LongLongMap;", "key5", "value5", "(JJJJJJJJJJ)Landroidx/collection/LongLongMap;", "Landroidx/collection/MutableLongLongMap;", "mutableLongLongMapOf", "()Landroidx/collection/MutableLongLongMap;", "(JJ)Landroidx/collection/MutableLongLongMap;", "(JJJJ)Landroidx/collection/MutableLongLongMap;", "(JJJJJJ)Landroidx/collection/MutableLongLongMap;", "(JJJJJJJJ)Landroidx/collection/MutableLongLongMap;", "(JJJJJJJJJJ)Landroidx/collection/MutableLongLongMap;", "Lkotlin/Function1;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "buildLongLongMap", "(Lr6/c;)Landroidx/collection/LongLongMap;", "", "initialCapacity", "(ILr6/c;)Landroidx/collection/LongLongMap;", "EmptyLongLongMap", "Landroidx/collection/MutableLongLongMap;", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLongLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongLongMap.kt\nandroidx/collection/LongLongMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class LongLongMapKt {

    @NotNull
    private static final MutableLongLongMap EmptyLongLongMap = new MutableLongLongMap(0);

    @NotNull
    public static final LongLongMap buildLongLongMap(@NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        builderAction.invoke(mutableLongLongMap);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap emptyLongLongMap() {
        return EmptyLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf() {
        return EmptyLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf() {
        return new MutableLongLongMap(0, 1, null);
    }

    @NotNull
    public static final LongLongMap buildLongLongMap(int i, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(i);
        builderAction.invoke(mutableLongLongMap);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j7, long j8) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j7, long j8) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j7, long j8, long j9, long j10) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j7, long j8, long j9, long j10) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j7, long j8, long j9, long j10, long j11, long j12) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        mutableLongLongMap.set(j11, j12);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j7, long j8, long j9, long j10, long j11, long j12) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        mutableLongLongMap.set(j11, j12);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        mutableLongLongMap.set(j15, j16);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        mutableLongLongMap.set(j11, j12);
        mutableLongLongMap.set(j13, j14);
        mutableLongLongMap.set(j15, j16);
        return mutableLongLongMap;
    }
}

package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00004\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u001a2\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\u000e\u001a\u00020\u0007\u001a\u0011\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0080\b\u001a\u0006\u0010\u0012\u001a\u00020\u0007\u001a\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011\u001a\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u00072\n\u0010\u0016\u001a\u00020\u0001\"\u00020\u0011\u001a\u0006\u0010\u0017\u001a\u00020\u0005\u001a\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0011\u001a\u0016\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011\u001a\u001e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011\u001a\u0012\u0010\u0017\u001a\u00020\u00052\n\u0010\u0016\u001a\u00020\u0001\"\u00020\u0011\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, m13558d2 = {"EmptyLongArray", "", "getEmptyLongArray", "()[J", "EmptyLongSet", "Landroidx/collection/MutableLongSet;", "buildLongSet", "Landroidx/collection/LongSet;", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyLongSet", "hash", "k", "", "longSetOf", "element1", "element2", "element3", "elements", "mutableLongSetOf", "collection"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,885:1\n1#2:886\n*E\n"})
/* loaded from: classes.dex */
public final class LongSetKt {
    private static final MutableLongSet EmptyLongSet = new MutableLongSet(0);
    private static final long[] EmptyLongArray = new long[0];

    public static final LongSet buildLongSet(Function1<? super MutableLongSet, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableLongSet mutableLongSet = new MutableLongSet(0, 1, null);
        builderAction.invoke(mutableLongSet);
        return mutableLongSet;
    }

    public static final LongSet emptyLongSet() {
        return EmptyLongSet;
    }

    public static final long[] getEmptyLongArray() {
        return EmptyLongArray;
    }

    public static final int hash(long j10) {
        int iHashCode = Long.hashCode(j10) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final LongSet longSetOf() {
        return EmptyLongSet;
    }

    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, null);
    }

    public static final LongSet buildLongSet(int i10, Function1<? super MutableLongSet, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableLongSet mutableLongSet = new MutableLongSet(i10);
        builderAction.invoke(mutableLongSet);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j10) {
        return mutableLongSetOf(j10);
    }

    public static final MutableLongSet mutableLongSetOf(long j10) {
        MutableLongSet mutableLongSet = new MutableLongSet(1);
        mutableLongSet.plusAssign(j10);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j10, long j11) {
        return mutableLongSetOf(j10, j11);
    }

    public static final MutableLongSet mutableLongSetOf(long j10, long j11) {
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        mutableLongSet.plusAssign(j10);
        mutableLongSet.plusAssign(j11);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j10, long j11, long j12) {
        return mutableLongSetOf(j10, j11, j12);
    }

    public static final LongSet longSetOf(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j10, long j11, long j12) {
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        mutableLongSet.plusAssign(j10);
        mutableLongSet.plusAssign(j11);
        mutableLongSet.plusAssign(j12);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }
}

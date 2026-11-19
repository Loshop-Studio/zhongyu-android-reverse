package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\u001a2\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\n\u001a\u00020\u0003\u001a\u0006\u0010\u000b\u001a\u00020\u0003\u001a\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t\u001a&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t\u001a6\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t\u001aF\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t\u001aV\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t\u001a\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0016\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t\u001a&\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t\u001a6\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t\u001aF\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t\u001aV\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, m13558d2 = {"EmptyLongIntMap", "Landroidx/collection/MutableLongIntMap;", "buildLongIntMap", "Landroidx/collection/LongIntMap;", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyLongIntMap", "longIntMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongIntMapOf", "collection"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLongIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongIntMap.kt\nandroidx/collection/LongIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class LongIntMapKt {
    private static final MutableLongIntMap EmptyLongIntMap = new MutableLongIntMap(0);

    public static final LongIntMap buildLongIntMap(Function1<? super MutableLongIntMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        builderAction.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    public static final LongIntMap emptyLongIntMap() {
        return EmptyLongIntMap;
    }

    public static final LongIntMap longIntMapOf() {
        return EmptyLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf() {
        return new MutableLongIntMap(0, 1, null);
    }

    public static final LongIntMap buildLongIntMap(int i10, Function1<? super MutableLongIntMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(i10);
        builderAction.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        return mutableLongIntMap;
    }
}

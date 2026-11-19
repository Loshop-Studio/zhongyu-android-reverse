package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u001a2\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\n\u001a\u00020\u0003\u001a\u0006\u0010\u000b\u001a\u00020\u0003\u001a\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t\u001a6\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u001aF\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t\u001aV\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t\u001a\u0006\u0010\u0016\u001a\u00020\u0001\u001a\u0016\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a&\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t\u001a6\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u001aF\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t\u001aV\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, m13558d2 = {"EmptyIntIntMap", "Landroidx/collection/MutableIntIntMap;", "buildIntIntMap", "Landroidx/collection/IntIntMap;", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyIntIntMap", "intIntMapOf", "key1", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableIntIntMapOf", "collection"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nIntIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntMap.kt\nandroidx/collection/IntIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class IntIntMapKt {
    private static final MutableIntIntMap EmptyIntIntMap = new MutableIntIntMap(0);

    public static final IntIntMap buildIntIntMap(Function1<? super MutableIntIntMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        builderAction.invoke(mutableIntIntMap);
        return mutableIntIntMap;
    }

    public static final IntIntMap emptyIntIntMap() {
        return EmptyIntIntMap;
    }

    public static final IntIntMap intIntMapOf() {
        return EmptyIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf() {
        return new MutableIntIntMap(0, 1, null);
    }

    public static final IntIntMap buildIntIntMap(int i10, Function1<? super MutableIntIntMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(i10);
        builderAction.invoke(mutableIntIntMap);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i10, int i11) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i10, int i11, int i12, int i13) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11, int i12, int i13) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        mutableIntIntMap.set(i16, i17);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        mutableIntIntMap.set(i16, i17);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        mutableIntIntMap.set(i16, i17);
        mutableIntIntMap.set(i18, i19);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        mutableIntIntMap.set(i16, i17);
        mutableIntIntMap.set(i18, i19);
        return mutableIntIntMap;
    }
}

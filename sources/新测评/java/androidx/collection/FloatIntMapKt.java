package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a2\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0006\u0010\n\u001a\u00020\u0003\u001a\u0006\u0010\u000b\u001a\u00020\u0003\u001a\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t\u001a&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t\u001a6\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t\u001aF\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t\u001aV\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t\u001a\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0016\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t\u001a&\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t\u001a6\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t\u001aF\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t\u001aV\u0010\u0017\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, m13558d2 = {"EmptyFloatIntMap", "Landroidx/collection/MutableFloatIntMap;", "buildFloatIntMap", "Landroidx/collection/FloatIntMap;", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyFloatIntMap", "floatIntMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableFloatIntMapOf", "collection"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1034:1\n1#2:1035\n*E\n"})
/* loaded from: classes.dex */
public final class FloatIntMapKt {
    private static final MutableFloatIntMap EmptyFloatIntMap = new MutableFloatIntMap(0);

    public static final FloatIntMap buildFloatIntMap(Function1<? super MutableFloatIntMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        builderAction.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap emptyFloatIntMap() {
        return EmptyFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf() {
        return EmptyFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf() {
        return new MutableFloatIntMap(0, 1, null);
    }

    public static final FloatIntMap buildFloatIntMap(int i10, Function1<? super MutableFloatIntMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(i10);
        builderAction.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10, float f11, int i11) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10, float f11, int i11) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        mutableFloatIntMap.set(f14, i14);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f10, int i10, float f11, int i11, float f12, int i12, float f13, int i13, float f14, int i14) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f10, i10);
        mutableFloatIntMap.set(f11, i11);
        mutableFloatIntMap.set(f12, i12);
        mutableFloatIntMap.set(f13, i13);
        mutableFloatIntMap.set(f14, i14);
        return mutableFloatIntMap;
    }
}

package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0015\u001aD\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aL\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0011\u001a7\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0014\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0017\u001aW\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001a\u001ag\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002H\u00052\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001d\u001a\u0012\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001f\u001a7\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u0005¢\u0006\u0002\u0010 \u001aG\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u0005¢\u0006\u0002\u0010!\u001aW\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002H\u0005¢\u0006\u0002\u0010\"\u001ag\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u0002H\u00052\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002H\u00052\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u0002H\u0005¢\u0006\u0002\u0010#\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, m13558d2 = {"EmptyFloatObjectMap", "Landroidx/collection/MutableFloatObjectMap;", "", "buildFloatObjectMap", "Landroidx/collection/FloatObjectMap;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "initialCapacity", "", "emptyFloatObjectMap", "floatObjectMapOf", "key1", "", "value1", "(FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key2", "value2", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key3", "value3", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key4", "value4", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key5", "value5", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "mutableFloatObjectMapOf", "(FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "collection"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMapKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1017:1\n1#2:1018\n*E\n"})
/* loaded from: classes.dex */
public final class FloatObjectMapKt {
    private static final MutableFloatObjectMap EmptyFloatObjectMap = new MutableFloatObjectMap(0);

    public static final <V> FloatObjectMap<V> buildFloatObjectMap(Function1<? super MutableFloatObjectMap<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        builderAction.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        Intrinsics.checkNotNull(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        Intrinsics.checkNotNull(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap<>(0, 1, null);
    }

    public static final <V> FloatObjectMap<V> buildFloatObjectMap(int i10, Function1<? super MutableFloatObjectMap<V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(i10);
        builderAction.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v9) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v9) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v9, float f11, V v10) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v9, float f11, V v10) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v9, float f11, V v10, float f12, V v11) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v9, float f11, V v10, float f12, V v11) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v9, float f11, V v10, float f12, V v11, float f13, V v12) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        mutableFloatObjectMap.set(f13, v12);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v9, float f11, V v10, float f12, V v11, float f13, V v12) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        mutableFloatObjectMap.set(f13, v12);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f10, V v9, float f11, V v10, float f12, V v11, float f13, V v12, float f14, V v13) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        mutableFloatObjectMap.set(f13, v12);
        mutableFloatObjectMap.set(f14, v13);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f10, V v9, float f11, V v10, float f12, V v11, float f13, V v12, float f14, V v13) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f10, v9);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        mutableFloatObjectMap.set(f13, v12);
        mutableFloatObjectMap.set(f14, v13);
        return mutableFloatObjectMap;
    }
}

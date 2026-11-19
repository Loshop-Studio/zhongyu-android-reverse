package androidx.collection;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class IntIntMapKt {
    private static final MutableIntIntMap EmptyIntIntMap = new MutableIntIntMap(0);

    public static final IntIntMap buildIntIntMap(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
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

    public static final IntIntMap buildIntIntMap(int i10, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
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

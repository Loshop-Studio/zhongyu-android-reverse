package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class IntFloatMapKt {
    private static final MutableIntFloatMap EmptyIntFloatMap = new MutableIntFloatMap(0);

    public static final IntFloatMap buildIntFloatMap(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        builderAction.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap emptyIntFloatMap() {
        return EmptyIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf() {
        return EmptyIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf() {
        return new MutableIntFloatMap(0, 1, null);
    }

    public static final IntFloatMap buildIntFloatMap(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(i10);
        builderAction.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i10, float f10) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i10, float f10, int i11, float f11) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10, int i11, float f11) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        mutableIntFloatMap.set(i14, f14);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        mutableIntFloatMap.set(i14, f14);
        return mutableIntFloatMap;
    }
}

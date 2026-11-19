package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class FloatListKt {
    private static final FloatList EmptyFloatList = new MutableFloatList(0);

    public static final FloatList buildFloatList(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableFloatList mutableFloatList = new MutableFloatList(0, 1, null);
        builderAction.invoke(mutableFloatList);
        return mutableFloatList;
    }

    public static final FloatList emptyFloatList() {
        return EmptyFloatList;
    }

    public static final FloatList floatListOf() {
        return EmptyFloatList;
    }

    public static final MutableFloatList mutableFloatListOf() {
        return new MutableFloatList(0, 1, null);
    }

    public static final FloatList buildFloatList(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableFloatList mutableFloatList = new MutableFloatList(i10);
        builderAction.invoke(mutableFloatList);
        return mutableFloatList;
    }

    public static final FloatList floatListOf(float f10) {
        return mutableFloatListOf(f10);
    }

    public static final MutableFloatList mutableFloatListOf(float f10) {
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.add(f10);
        return mutableFloatList;
    }

    public static final FloatList floatListOf(float f10, float f11) {
        return mutableFloatListOf(f10, f11);
    }

    public static final FloatList floatListOf(float f10, float f11, float f12) {
        return mutableFloatListOf(f10, f11, f12);
    }

    public static final MutableFloatList mutableFloatListOf(float f10, float f11) {
        MutableFloatList mutableFloatList = new MutableFloatList(2);
        mutableFloatList.add(f10);
        mutableFloatList.add(f11);
        return mutableFloatList;
    }

    public static final FloatList floatListOf(float... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.addAll(mutableFloatList._size, elements);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float f10, float f11, float f12) {
        MutableFloatList mutableFloatList = new MutableFloatList(3);
        mutableFloatList.add(f10);
        mutableFloatList.add(f11);
        mutableFloatList.add(f12);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.addAll(mutableFloatList._size, elements);
        return mutableFloatList;
    }
}

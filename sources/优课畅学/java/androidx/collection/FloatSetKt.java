package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class FloatSetKt {
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);
    private static final float[] EmptyFloatArray = new float[0];

    public static final FloatSet buildFloatSet(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(0, 1, null);
        builderAction.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    public static final FloatSet emptyFloatSet() {
        return EmptyFloatSet;
    }

    public static final FloatSet floatSetOf() {
        return EmptyFloatSet;
    }

    public static final float[] getEmptyFloatArray() {
        return EmptyFloatArray;
    }

    public static final int hash(float f10) {
        int iHashCode = Float.hashCode(f10) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    public static final FloatSet buildFloatSet(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(i10);
        builderAction.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float f10) {
        return mutableFloatSetOf(f10);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f10) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f10);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float f10, float f11) {
        return mutableFloatSetOf(f10, f11);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f10, float f11) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f10);
        mutableFloatSet.plusAssign(f11);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float f10, float f11, float f12) {
        return mutableFloatSetOf(f10, f11, f12);
    }

    public static final FloatSet floatSetOf(float... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float f10, float f11, float f12) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f10);
        mutableFloatSet.plusAssign(f11);
        mutableFloatSet.plusAssign(f12);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }
}

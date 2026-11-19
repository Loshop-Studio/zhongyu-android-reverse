package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class DoubleListKt {
    private static final DoubleList EmptyDoubleList = new MutableDoubleList(0);

    public static final DoubleList buildDoubleList(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(0, 1, null);
        builderAction.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    public static final DoubleList doubleListOf() {
        return EmptyDoubleList;
    }

    public static final DoubleList emptyDoubleList() {
        return EmptyDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf() {
        return new MutableDoubleList(0, 1, null);
    }

    public static final DoubleList buildDoubleList(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(i10);
        builderAction.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    public static final DoubleList doubleListOf(double d10) {
        return mutableDoubleListOf(d10);
    }

    public static final MutableDoubleList mutableDoubleListOf(double d10) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(1);
        mutableDoubleList.add(d10);
        return mutableDoubleList;
    }

    public static final DoubleList doubleListOf(double d10, double d11) {
        return mutableDoubleListOf(d10, d11);
    }

    public static final DoubleList doubleListOf(double d10, double d11, double d12) {
        return mutableDoubleListOf(d10, d11, d12);
    }

    public static final MutableDoubleList mutableDoubleListOf(double d10, double d11) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(2);
        mutableDoubleList.add(d10);
        mutableDoubleList.add(d11);
        return mutableDoubleList;
    }

    public static final DoubleList doubleListOf(double... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(elements.length);
        mutableDoubleList.addAll(mutableDoubleList._size, elements);
        return mutableDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf(double d10, double d11, double d12) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(3);
        mutableDoubleList.add(d10);
        mutableDoubleList.add(d11);
        mutableDoubleList.add(d12);
        return mutableDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf(double... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(elements.length);
        mutableDoubleList.addAll(mutableDoubleList._size, elements);
        return mutableDoubleList;
    }
}

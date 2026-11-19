package androidx.collection;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class IntLongMapKt {
    private static final MutableIntLongMap EmptyIntLongMap = new MutableIntLongMap(0);

    public static final IntLongMap buildIntLongMap(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        builderAction.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }

    public static final IntLongMap emptyIntLongMap() {
        return EmptyIntLongMap;
    }

    public static final IntLongMap intLongMapOf() {
        return EmptyIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf() {
        return new MutableIntLongMap(0, 1, null);
    }

    public static final IntLongMap buildIntLongMap(int i10, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(i10);
        builderAction.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i10, long j10) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        return mutableIntLongMap;
    }
}

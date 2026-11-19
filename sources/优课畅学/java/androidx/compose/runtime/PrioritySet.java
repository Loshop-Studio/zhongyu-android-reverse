package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class PrioritySet {
    private final MutableIntList list;

    private /* synthetic */ PrioritySet(MutableIntList mutableIntList) {
        this.list = mutableIntList;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m23656addimpl(MutableIntList mutableIntList, int i10) {
        if (mutableIntList._size == 0 || !(mutableIntList.get(0) == i10 || mutableIntList.get(mutableIntList._size - 1) == i10)) {
            int i11 = mutableIntList._size;
            mutableIntList.add(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int i13 = mutableIntList.get(i12);
                if (i10 <= i13) {
                    break;
                }
                mutableIntList.set(i11, i13);
                i11 = i12;
            }
            mutableIntList.set(i11, i10);
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PrioritySet m23657boximpl(MutableIntList mutableIntList) {
        return new PrioritySet(mutableIntList);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableIntList m23658constructorimpl(MutableIntList mutableIntList) {
        return mutableIntList;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableIntList m23659constructorimpl$default(MutableIntList mutableIntList, int i10, AbstractC9126n abstractC9126n) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            mutableIntList = new MutableIntList(0, i11, null);
        }
        return m23658constructorimpl(mutableIntList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23660equalsimpl(MutableIntList mutableIntList, Object obj) {
        return (obj instanceof PrioritySet) && AbstractC9133u.m16128b(mutableIntList, ((PrioritySet) obj).m23669unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23661equalsimpl0(MutableIntList mutableIntList, MutableIntList mutableIntList2) {
        return AbstractC9133u.m16128b(mutableIntList, mutableIntList2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23662hashCodeimpl(MutableIntList mutableIntList) {
        return mutableIntList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m23663isEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size == 0;
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m23664isNotEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size != 0;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m23665peekimpl(MutableIntList mutableIntList) {
        return mutableIntList.first();
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m23666takeMaximpl(MutableIntList mutableIntList) {
        int i10;
        int i11 = mutableIntList._size;
        int i12 = mutableIntList.get(0);
        while (mutableIntList._size != 0 && mutableIntList.get(0) == i12) {
            mutableIntList.set(0, mutableIntList.last());
            mutableIntList.removeAt(mutableIntList._size - 1);
            int i13 = mutableIntList._size;
            int i14 = i13 >>> 1;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = mutableIntList.get(i15);
                int i17 = (i15 + 1) * 2;
                int i18 = i17 - 1;
                int i19 = mutableIntList.get(i18);
                if (i17 >= i13 || (i10 = mutableIntList.get(i17)) <= i19) {
                    if (i19 > i16) {
                        mutableIntList.set(i15, i19);
                        mutableIntList.set(i18, i16);
                        i15 = i18;
                    }
                } else if (i10 > i16) {
                    mutableIntList.set(i15, i10);
                    mutableIntList.set(i17, i16);
                    i15 = i17;
                }
            }
        }
        return i12;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23667toStringimpl(MutableIntList mutableIntList) {
        return "PrioritySet(list=" + mutableIntList + ')';
    }

    /* renamed from: validateHeap-impl, reason: not valid java name */
    public static final void m23668validateHeapimpl(MutableIntList mutableIntList) {
        int i10 = mutableIntList._size;
        int i11 = i10 / 2;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            int i14 = i13 * 2;
            boolean z10 = true;
            if (!(mutableIntList.get(i12) >= mutableIntList.get(i14 + (-1)))) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if (i14 < i10 && mutableIntList.get(i12) < mutableIntList.get(i14)) {
                z10 = false;
            }
            if (!z10) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            i12 = i13;
        }
    }

    public boolean equals(Object obj) {
        return m23660equalsimpl(this.list, obj);
    }

    public int hashCode() {
        return m23662hashCodeimpl(this.list);
    }

    public String toString() {
        return m23667toStringimpl(this.list);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableIntList m23669unboximpl() {
        return this.list;
    }
}

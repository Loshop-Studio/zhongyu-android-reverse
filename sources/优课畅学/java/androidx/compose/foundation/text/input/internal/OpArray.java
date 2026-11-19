package androidx.compose.foundation.text.input.internal;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
final class OpArray {
    private final int[] values;

    private /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m21422boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int[] m21424constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m21425copyOfpSmdads(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10 * 3);
        AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
        return m21424constructorimpl(iArrCopyOf);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21426equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && AbstractC9133u.m16128b(iArr, ((OpArray) obj).m21434unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21427equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC9133u.m16128b(iArr, iArr2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m21428forEachimpl(int[] iArr, int i10, boolean z10, InterfaceC10575q interfaceC10575q) {
        if (i10 < 0) {
            return;
        }
        if (!z10) {
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 3;
                interfaceC10575q.invoke(Integer.valueOf(iArr[i12]), Integer.valueOf(iArr[i12 + 1]), Integer.valueOf(iArr[i12 + 2]));
            }
            return;
        }
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            int i13 = i10 * 3;
            interfaceC10575q.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr[i13 + 1]), Integer.valueOf(iArr[i13 + 2]));
        }
    }

    /* renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m21429forEachimpl$default(int[] iArr, int i10, boolean z10, InterfaceC10575q interfaceC10575q, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (i10 < 0) {
            return;
        }
        if (!z10) {
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 * 3;
                interfaceC10575q.invoke(Integer.valueOf(iArr[i13]), Integer.valueOf(iArr[i13 + 1]), Integer.valueOf(iArr[i13 + 2]));
            }
            return;
        }
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            int i14 = i10 * 3;
            interfaceC10575q.invoke(Integer.valueOf(iArr[i14]), Integer.valueOf(iArr[i14 + 1]), Integer.valueOf(iArr[i14 + 2]));
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m21430getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21431hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m21432setimpl(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = i10 * 3;
        iArr[i14] = i11;
        iArr[i14 + 1] = i12;
        iArr[i14 + 2] = i13;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21433toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m21426equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m21431hashCodeimpl(this.values);
    }

    public String toString() {
        return m21433toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m21434unboximpl() {
        return this.values;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m21423constructorimpl(int i10) {
        return m21424constructorimpl(new int[i10 * 3]);
    }
}

package androidx.compose.p013ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
final class CenteredArray {
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m25740boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m25741constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25742equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && AbstractC9133u.m16128b(iArr, ((CenteredArray) obj).m25749unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25743equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC9133u.m16128b(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m25744getimpl(int[] iArr, int i10) {
        return iArr[i10 + m25745getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m25745getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25746hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m25747setimpl(int[] iArr, int i10, int i11) {
        iArr[i10 + m25745getMidimpl(iArr)] = i11;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25748toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m25742equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m25746hashCodeimpl(this.data);
    }

    public String toString() {
        return m25748toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m25749unboximpl() {
        return this.data;
    }
}

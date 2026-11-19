package androidx.compose.p014ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class Snake {
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m32573addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        int iMin;
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (m32581getHasAdditionOrRemovalimpl(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i10 += ((iArr[4] != 0 ? 1 : 0) | (m32586isAdditionimpl(iArr) ? 1 : 0)) ^ 1;
            i11 += ((!m32586isAdditionimpl(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        intStack.pushDiagonal(i10, i11, iMin);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m32574boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m32575constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32576equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && AbstractC9979u.m20289b(iArr, ((Snake) obj).m32588unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32577equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC9979u.m20289b(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m32578getDiagonalSizeimpl(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m32579getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m32580getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m32581getHasAdditionOrRemovalimpl(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m32582getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m32583getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m32584getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32585hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m32586isAdditionimpl(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32587toStringimpl(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snake(");
        sb2.append(iArr[0]);
        sb2.append(',');
        sb2.append(iArr[1]);
        sb2.append(',');
        sb2.append(iArr[2]);
        sb2.append(',');
        sb2.append(iArr[3]);
        sb2.append(',');
        sb2.append(iArr[4] != 0);
        sb2.append(')');
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return m32576equalsimpl(this.data, obj);
    }

    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m32585hashCodeimpl(this.data);
    }

    public String toString() {
        return m32587toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m32588unboximpl() {
        return this.data;
    }
}

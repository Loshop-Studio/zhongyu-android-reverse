package androidx.compose.p014ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class CenteredArray {
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m32342boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m32343constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32344equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && AbstractC9979u.m20289b(iArr, ((CenteredArray) obj).m32351unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32345equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC9979u.m20289b(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m32346getimpl(int[] iArr, int i10) {
        return iArr[i10 + m32347getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m32347getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32348hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m32349setimpl(int[] iArr, int i10, int i11) {
        iArr[i10 + m32347getMidimpl(iArr)] = i11;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32350toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m32344equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m32348hashCodeimpl(this.data);
    }

    public String toString() {
        return m32350toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m32351unboximpl() {
        return this.data;
    }
}

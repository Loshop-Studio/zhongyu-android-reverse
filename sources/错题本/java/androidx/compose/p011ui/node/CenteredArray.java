package androidx.compose.p011ui.node;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/ui/node/CenteredArray;", "", "", "data", "constructor-impl", "([I)[I", "", "index", "get-impl", "([II)I", "get", "value", "Ld6/s;", "set-impl", "([III)V", "set", "", "toString-impl", "([I)Ljava/lang/String;", "toString", "hashCode-impl", "([I)I", "hashCode", "other", "", "equals-impl", "([ILjava/lang/Object;)Z", "equals", "[I", "getMid-impl", "mid", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes2.dex */
final class CenteredArray {

    @NotNull
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m12146boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m12147constructorimpl(@NotNull int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12148equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && AbstractC5830k.m5325b(iArr, ((CenteredArray) obj).getData());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12149equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC5830k.m5325b(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m12150getimpl(int[] iArr, int i) {
        return iArr[i + m12151getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m12151getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m12152hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m12153setimpl(int[] iArr, int i, int i8) {
        iArr[i + m12151getMidimpl(iArr)] = i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m12154toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m12148equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m12152hashCodeimpl(this.data);
    }

    public String toString() {
        return m12154toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int[] getData() {
        return this.data;
    }
}

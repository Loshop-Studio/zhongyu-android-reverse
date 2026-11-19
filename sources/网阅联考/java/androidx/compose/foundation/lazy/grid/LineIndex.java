package androidx.compose.foundation.lazy.grid;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m5174d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0019\u0010\u0014\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0005J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000bJ!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m5175d2 = {"Landroidx/compose/foundation/lazy/grid/LineIndex;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "compareTo", "other", "compareTo-bKFJvoY", "(II)I", "dec", "dec-hA7yfN8", "equals", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "inc", "inc-hA7yfN8", "minus", C3335ai.f1660aA, "minus-fVkYB0M", "minus--_Ze7BM", "plus", "plus--_Ze7BM", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class LineIndex {
    private final int value;

    private /* synthetic */ LineIndex(int i4) {
        this.value = i4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineIndex m7496boximpl(int i4) {
        return new LineIndex(i4);
    }

    /* renamed from: compareTo-bKFJvoY, reason: not valid java name */
    public static final int m7497compareTobKFJvoY(int i4, int i5) {
        return i4 - i5;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7498constructorimpl(int i4) {
        return i4;
    }

    /* renamed from: dec-hA7yfN8, reason: not valid java name */
    public static final int m7499dechA7yfN8(int i4) {
        return m7498constructorimpl(i4 - 1);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7500equalsimpl(int i4, Object obj) {
        return (obj instanceof LineIndex) && i4 == ((LineIndex) obj).m7508unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7501equalsimpl0(int i4, int i5) {
        return i4 == i5;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7502hashCodeimpl(int i4) {
        return i4;
    }

    /* renamed from: inc-hA7yfN8, reason: not valid java name */
    public static final int m7503inchA7yfN8(int i4) {
        return m7498constructorimpl(i4 + 1);
    }

    /* renamed from: minus--_Ze7BM, reason: not valid java name */
    public static final int m7504minus_Ze7BM(int i4, int i5) {
        return m7498constructorimpl(i4 - i5);
    }

    /* renamed from: minus-fVkYB0M, reason: not valid java name */
    public static final int m7505minusfVkYB0M(int i4, int i5) {
        return m7498constructorimpl(i4 - i5);
    }

    /* renamed from: plus--_Ze7BM, reason: not valid java name */
    public static final int m7506plus_Ze7BM(int i4, int i5) {
        return m7498constructorimpl(i4 + i5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7507toStringimpl(int i4) {
        return "LineIndex(value=" + i4 + ')';
    }

    public boolean equals(Object obj) {
        return m7500equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7502hashCodeimpl(this.value);
    }

    public String toString() {
        return m7507toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7508unboximpl() {
        return this.value;
    }
}

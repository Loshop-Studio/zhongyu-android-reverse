package androidx.compose.foundation.lazy.grid;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(m5174d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0019\u0010\u0014\u001a\u00020\u0000H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0005J\u001e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000bJ!\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m5175d2 = {"Landroidx/compose/foundation/lazy/grid/ItemIndex;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "compareTo", "other", "compareTo-YGsSkvE", "(II)I", "dec", "dec-VZbfaAc", "equals", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "inc", "inc-VZbfaAc", "minus", C3335ai.f1660aA, "minus-41DfMLM", "minus-AoD1bsw", "plus", "plus-AoD1bsw", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class ItemIndex {
    private final int value;

    private /* synthetic */ ItemIndex(int i4) {
        this.value = i4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ItemIndex m7448boximpl(int i4) {
        return new ItemIndex(i4);
    }

    /* renamed from: compareTo-YGsSkvE, reason: not valid java name */
    public static final int m7449compareToYGsSkvE(int i4, int i5) {
        return i4 - i5;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7450constructorimpl(int i4) {
        return i4;
    }

    /* renamed from: dec-VZbfaAc, reason: not valid java name */
    public static final int m7451decVZbfaAc(int i4) {
        return m7450constructorimpl(i4 - 1);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7452equalsimpl(int i4, Object obj) {
        return (obj instanceof ItemIndex) && i4 == ((ItemIndex) obj).m7460unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7453equalsimpl0(int i4, int i5) {
        return i4 == i5;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7454hashCodeimpl(int i4) {
        return i4;
    }

    /* renamed from: inc-VZbfaAc, reason: not valid java name */
    public static final int m7455incVZbfaAc(int i4) {
        return m7450constructorimpl(i4 + 1);
    }

    /* renamed from: minus-41DfMLM, reason: not valid java name */
    public static final int m7456minus41DfMLM(int i4, int i5) {
        return m7450constructorimpl(i4 - i5);
    }

    /* renamed from: minus-AoD1bsw, reason: not valid java name */
    public static final int m7457minusAoD1bsw(int i4, int i5) {
        return m7450constructorimpl(i4 - i5);
    }

    /* renamed from: plus-AoD1bsw, reason: not valid java name */
    public static final int m7458plusAoD1bsw(int i4, int i5) {
        return m7450constructorimpl(i4 + i5);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7459toStringimpl(int i4) {
        return "ItemIndex(value=" + i4 + ')';
    }

    public boolean equals(Object obj) {
        return m7452equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7454hashCodeimpl(this.value);
    }

    public String toString() {
        return m7459toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7460unboximpl() {
        return this.value;
    }
}

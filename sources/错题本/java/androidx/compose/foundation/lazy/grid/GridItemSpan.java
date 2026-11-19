package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Immutable
@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0015"}, m5110d2 = {"Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "", "packedValue", "", "constructor-impl", "(J)J", "currentLineSpan", "", "getCurrentLineSpan-impl", "(J)I", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class GridItemSpan {
    private final long packedValue;

    private /* synthetic */ GridItemSpan(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m7383boximpl(long j7) {
        return new GridItemSpan(j7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7384constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7385equalsimpl(long j7, Object obj) {
        return (obj instanceof GridItemSpan) && j7 == ((GridItemSpan) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7386equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m7387getCurrentLineSpanimpl(long j7) {
        return (int) j7;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7388hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7389toStringimpl(long j7) {
        return "GridItemSpan(packedValue=" + j7 + ')';
    }

    public boolean equals(Object obj) {
        return m7385equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m7388hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7389toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}

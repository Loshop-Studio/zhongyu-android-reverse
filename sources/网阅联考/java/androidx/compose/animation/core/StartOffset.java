package androidx.compose.animation.core;

import androidx.compose.animation.AbstractC0321a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m5174d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u001e\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B\u0014\b\u0002\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\b\u0092\u0001\u00020\tø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m5175d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "offsetMillis", "", "offsetType", "Landroidx/compose/animation/core/StartOffsetType;", "constructor-impl", "(II)J", "value", "", "(J)J", "getOffsetMillis-impl", "(J)I", "getOffsetType-Eo1U57Q", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j4) {
        this.value = j4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m7025boximpl(long j4) {
        return new StartOffset(j4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m7027constructorimpl(long j4) {
        return j4;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m7028constructorimpl$default(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i6 & 2) != 0) {
            i5 = StartOffsetType.INSTANCE.m7043getDelayEo1U57Q();
        }
        return m7026constructorimpl(i4, i5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7029equalsimpl(long j4, Object obj) {
        return (obj instanceof StartOffset) && j4 == ((StartOffset) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7030equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m7031getOffsetMillisimpl(long j4) {
        return Math.abs((int) j4);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m7032getOffsetTypeEo1U57Q(long j4) {
        boolean z3 = j4 > 0;
        if (z3) {
            return StartOffsetType.INSTANCE.m7044getFastForwardEo1U57Q();
        }
        if (z3) {
            throw new NoWhenBranchMatchedException();
        }
        return StartOffsetType.INSTANCE.m7043getDelayEo1U57Q();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7033hashCodeimpl(long j4) {
        return AbstractC0321a.m137a(j4);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7034toStringimpl(long j4) {
        return "StartOffset(value=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return m7029equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7033hashCodeimpl(this.value);
    }

    public String toString() {
        return m7034toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7026constructorimpl(int i4, int i5) {
        return m7027constructorimpl(i4 * i5);
    }
}

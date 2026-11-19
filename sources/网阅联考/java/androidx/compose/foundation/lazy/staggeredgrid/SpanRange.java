package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.AbstractC0321a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u001c\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0012\u0010\n\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0012\u0010\u0011\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\u0088\u0001\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m5175d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "", "lane", "", "span", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "end", "getEnd-impl", "(J)I", "getPackedValue", "()J", "size", "getSize-impl", "start", "getStart-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n879#1:1101\n878#1:1103\n48#2:1098\n55#2:1099\n62#2:1100\n62#2:1102\n55#2:1104\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n880#1:1101\n880#1:1103\n876#1:1098\n878#1:1099\n879#1:1100\n880#1:1102\n880#1:1104\n*E\n"})
/* loaded from: classes.dex */
final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j4) {
        this.packedValue = j4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m7542boximpl(long j4) {
        return new SpanRange(j4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m7544constructorimpl(long j4) {
        return j4;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7545equalsimpl(long j4, Object obj) {
        return (obj instanceof SpanRange) && j4 == ((SpanRange) obj).m7552unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7546equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m7547getEndimpl(long j4) {
        return (int) (j4 & 4294967295L);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m7548getSizeimpl(long j4) {
        return ((int) (4294967295L & j4)) - ((int) (j4 >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m7549getStartimpl(long j4) {
        return (int) (j4 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7550hashCodeimpl(long j4) {
        return AbstractC0321a.m137a(j4);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7551toStringimpl(long j4) {
        return "SpanRange(packedValue=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return m7545equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m7550hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7551toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7552unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7543constructorimpl(int i4, int i5) {
        return m7544constructorimpl(((i5 + i4) & 4294967295L) | (i4 << 32));
    }
}

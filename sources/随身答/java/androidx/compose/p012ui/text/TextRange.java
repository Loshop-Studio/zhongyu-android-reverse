package androidx.compose.p012ui.text;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010\rJ\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m13413d2 = {"Landroidx/compose/ui/text/TextRange;", "", "packedValue", "", "constructor-impl", "(J)J", "collapsed", "", "getCollapsed-impl", "(J)Z", "end", "", "getEnd-impl", "(J)I", "length", "getLength-impl", "max", "getMax-impl", "min", "getMin-impl", "reversed", "getReversed-impl", "start", "getStart-impl", "contains", "other", "contains-5zc-tL8", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "contains-impl", "(JI)Z", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "intersects", "intersects-5zc-tL8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-text_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n85#2:124\n90#2:125\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n53#1:124\n56#1:125\n*E\n"})
/* loaded from: classes2.dex */
public final class TextRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m13413d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/text/TextRange;", "getZero-d9O1mEE", "()J", "J", "ui-text_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m23465getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextRange(long j9) {
        this.packedValue = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m23448boximpl(long j9) {
        return new TextRange(j9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m23449constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m23450contains5zctL8(long j9, long j10) {
        return (m23458getMinimpl(j9) <= m23458getMinimpl(j10)) & (m23457getMaximpl(j10) <= m23457getMaximpl(j9));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m23451containsimpl(long j9, int i9) {
        return i9 < m23457getMaximpl(j9) && m23458getMinimpl(j9) <= i9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23452equalsimpl(long j9, Object obj) {
        return (obj instanceof TextRange) && j9 == ((TextRange) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23453equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m23454getCollapsedimpl(long j9) {
        return m23460getStartimpl(j9) == m23455getEndimpl(j9);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m23455getEndimpl(long j9) {
        return (int) (j9 & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m23456getLengthimpl(long j9) {
        return m23457getMaximpl(j9) - m23458getMinimpl(j9);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m23457getMaximpl(long j9) {
        return Math.max(m23460getStartimpl(j9), m23455getEndimpl(j9));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m23458getMinimpl(long j9) {
        return Math.min(m23460getStartimpl(j9), m23455getEndimpl(j9));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m23459getReversedimpl(long j9) {
        return m23460getStartimpl(j9) > m23455getEndimpl(j9);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m23460getStartimpl(long j9) {
        return (int) (j9 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23461hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m23462intersects5zctL8(long j9, long j10) {
        return (m23458getMinimpl(j9) < m23457getMaximpl(j10)) & (m23458getMinimpl(j10) < m23457getMaximpl(j9));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23463toStringimpl(long j9) {
        return "TextRange(" + m23460getStartimpl(j9) + ", " + m23455getEndimpl(j9) + ')';
    }

    public boolean equals(Object obj) {
        return m23452equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m23461hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m23463toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}

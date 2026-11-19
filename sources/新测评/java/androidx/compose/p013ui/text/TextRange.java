package androidx.compose.p013ui.text;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010\rJ\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m13558d2 = {"Landroidx/compose/ui/text/TextRange;", "", "packedValue", "", "constructor-impl", "(J)J", "collapsed", "", "getCollapsed-impl", "(J)Z", "end", "", "getEnd-impl", "(J)I", "length", "getLength-impl", "max", "getMax-impl", "min", "getMin-impl", "reversed", "getReversed-impl", "start", "getStart-impl", "contains", "other", "contains-5zc-tL8", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "contains-impl", "(JI)Z", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "intersects", "intersects-5zc-tL8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n85#2:124\n90#2:125\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n53#1:124\n56#1:125\n*E\n"})
/* loaded from: classes2.dex */
public final class TextRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m13558d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/text/TextRange;", "getZero-d9O1mEE", "()J", "J", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m23032getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextRange(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m23015boximpl(long j10) {
        return new TextRange(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m23016constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m23017contains5zctL8(long j10, long j11) {
        return (m23025getMinimpl(j10) <= m23025getMinimpl(j11)) & (m23024getMaximpl(j11) <= m23024getMaximpl(j10));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m23018containsimpl(long j10, int i10) {
        return i10 < m23024getMaximpl(j10) && m23025getMinimpl(j10) <= i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23019equalsimpl(long j10, Object obj) {
        return (obj instanceof TextRange) && j10 == ((TextRange) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23020equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m23021getCollapsedimpl(long j10) {
        return m23027getStartimpl(j10) == m23022getEndimpl(j10);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m23022getEndimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m23023getLengthimpl(long j10) {
        return m23024getMaximpl(j10) - m23025getMinimpl(j10);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m23024getMaximpl(long j10) {
        return Math.max(m23027getStartimpl(j10), m23022getEndimpl(j10));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m23025getMinimpl(long j10) {
        return Math.min(m23027getStartimpl(j10), m23022getEndimpl(j10));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m23026getReversedimpl(long j10) {
        return m23027getStartimpl(j10) > m23022getEndimpl(j10);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m23027getStartimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23028hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m23029intersects5zctL8(long j10, long j11) {
        return (m23025getMinimpl(j10) < m23024getMaximpl(j11)) & (m23025getMinimpl(j11) < m23024getMaximpl(j10));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23030toStringimpl(long j10) {
        return "TextRange(" + m23027getStartimpl(j10) + ", " + m23022getEndimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m23019equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m23028hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m23030toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}

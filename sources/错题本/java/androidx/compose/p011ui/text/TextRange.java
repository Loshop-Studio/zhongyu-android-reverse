package androidx.compose.p011ui.text;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010\rJ\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m5110d2 = {"Landroidx/compose/ui/text/TextRange;", "", "packedValue", "", "constructor-impl", "(J)J", "collapsed", "", "getCollapsed-impl", "(J)Z", "end", "", "getEnd-impl", "(J)I", "length", "getLength-impl", "max", "getMax-impl", "min", "getMin-impl", "reversed", "getReversed-impl", "start", "getStart-impl", "contains", "other", "contains-5zc-tL8", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "contains-impl", "(JI)Z", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "intersects", "intersects-5zc-tL8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,123:1\n85#2:124\n90#2:125\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n53#1:124\n56#1:125\n*E\n"})
/* loaded from: classes2.dex */
public final class TextRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m5110d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/text/TextRange;", "getZero-d9O1mEE", "()J", "J", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m12775getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextRange(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m12758boximpl(long j7) {
        return new TextRange(j7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m12759constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m12760contains5zctL8(long j7, long j8) {
        return (m12768getMinimpl(j7) <= m12768getMinimpl(j8)) & (m12767getMaximpl(j8) <= m12767getMaximpl(j7));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m12761containsimpl(long j7, int i) {
        return i < m12767getMaximpl(j7) && m12768getMinimpl(j7) <= i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12762equalsimpl(long j7, Object obj) {
        return (obj instanceof TextRange) && j7 == ((TextRange) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12763equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m12764getCollapsedimpl(long j7) {
        return m12770getStartimpl(j7) == m12765getEndimpl(j7);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m12765getEndimpl(long j7) {
        return (int) (j7 & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m12766getLengthimpl(long j7) {
        return m12767getMaximpl(j7) - m12768getMinimpl(j7);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m12767getMaximpl(long j7) {
        return Math.max(m12770getStartimpl(j7), m12765getEndimpl(j7));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m12768getMinimpl(long j7) {
        return Math.min(m12770getStartimpl(j7), m12765getEndimpl(j7));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m12769getReversedimpl(long j7) {
        return m12770getStartimpl(j7) > m12765getEndimpl(j7);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m12770getStartimpl(long j7) {
        return (int) (j7 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m12771hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m12772intersects5zctL8(long j7, long j8) {
        return (m12768getMinimpl(j7) < m12767getMaximpl(j8)) & (m12768getMinimpl(j8) < m12767getMaximpl(j7));
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m12773toStringimpl(long j7) {
        return "TextRange(" + m12770getStartimpl(j7) + ", " + m12765getEndimpl(j7) + ')';
    }

    public boolean equals(Object obj) {
        return m12762equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m12771hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m12773toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}

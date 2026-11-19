package androidx.compose.p006ui.unit;

import androidx.compose.animation.AbstractC0321a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u0013\u0010\fJ*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010\fJ\u001e\u0010#\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010%J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001bJ\u000f\u0010-\u001a\u00020.H\u0017¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, m5175d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "", "getX$annotations", "getX-impl", "(J)I", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-iSbpLlY", "(JII)J", "div", "operand", "", "div-Bjo55l4", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "minus", "minus-qkQi6aY", "(JJ)J", "plus", "plus-qkQi6aY", "rem", "rem-Bjo55l4", "(JI)J", "times", "times-Bjo55l4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-nOcc-ac", "Companion", "ui-unit_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n55#2:180\n62#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n53#1:180\n60#1:181\n*E\n"})
/* loaded from: classes.dex */
public final class IntOffset {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = IntOffsetKt.IntOffset(0, 0);
    private final long packedValue;

    @Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m5175d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", "J", "ui-unit_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m11653getZeronOccac() {
            return IntOffset.Zero;
        }
    }

    private /* synthetic */ IntOffset(long j4) {
        this.packedValue = j4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m11634boximpl(long j4) {
        return new IntOffset(j4);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m11635component1impl(long j4) {
        return m11643getXimpl(j4);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m11636component2impl(long j4) {
        return m11644getYimpl(j4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11637constructorimpl(long j4) {
        return j4;
    }

    /* renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m11638copyiSbpLlY(long j4, int i4, int i5) {
        return IntOffsetKt.IntOffset(i4, i5);
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m11639copyiSbpLlY$default(long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = m11643getXimpl(j4);
        }
        if ((i6 & 2) != 0) {
            i5 = m11644getYimpl(j4);
        }
        return m11638copyiSbpLlY(j4, i4, i5);
    }

    @Stable
    /* renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m11640divBjo55l4(long j4, float f4) {
        return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(m11643getXimpl(j4) / f4), MathKt__MathJVMKt.roundToInt(m11644getYimpl(j4) / f4));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11641equalsimpl(long j4, Object obj) {
        return (obj instanceof IntOffset) && j4 == ((IntOffset) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11642equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final int m11643getXimpl(long j4) {
        return (int) (j4 >> 32);
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final int m11644getYimpl(long j4) {
        return (int) (j4 & 4294967295L);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11645hashCodeimpl(long j4) {
        return AbstractC0321a.m137a(j4);
    }

    @Stable
    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m11646minusqkQi6aY(long j4, long j5) {
        return IntOffsetKt.IntOffset(m11643getXimpl(j4) - m11643getXimpl(j5), m11644getYimpl(j4) - m11644getYimpl(j5));
    }

    @Stable
    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m11647plusqkQi6aY(long j4, long j5) {
        return IntOffsetKt.IntOffset(m11643getXimpl(j4) + m11643getXimpl(j5), m11644getYimpl(j4) + m11644getYimpl(j5));
    }

    @Stable
    /* renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m11648remBjo55l4(long j4, int i4) {
        return IntOffsetKt.IntOffset(m11643getXimpl(j4) % i4, m11644getYimpl(j4) % i4);
    }

    @Stable
    /* renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m11649timesBjo55l4(long j4, float f4) {
        return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(m11643getXimpl(j4) * f4), MathKt__MathJVMKt.roundToInt(m11644getYimpl(j4) * f4));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11650toStringimpl(long j4) {
        return '(' + m11643getXimpl(j4) + ", " + m11644getYimpl(j4) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m11651unaryMinusnOccac(long j4) {
        return IntOffsetKt.IntOffset(-m11643getXimpl(j4), -m11644getYimpl(j4));
    }

    public boolean equals(Object obj) {
        return m11641equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m11645hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m11650toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}

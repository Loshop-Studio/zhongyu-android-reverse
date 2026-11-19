package androidx.compose.p006ui.geometry;

import androidx.compose.animation.AbstractC0321a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 12\u00020\u0001:\u00011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\tH\u0087\n¢\u0006\u0004\b\u0013\u0010\fJ*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010&J!\u0010)\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010\u001aJ\u000f\u0010+\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, m5175d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "", "getX$annotations", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-OHQCggk", "(JFF)J", "div", "operand", "div-Bz7bX_o", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-vF7b-mM", "(JJ)J", "plus", "plus-vF7b-mM", "times", "times-Bz7bX_o", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-kKHJgLs", "Companion", "ui-geometry_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n34#2:165\n41#2:166\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:166\n*E\n"})
/* loaded from: classes.dex */
public final class CornerRadius {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = CornerRadiusKt.CornerRadius$default(0.0f, 0.0f, 2, null);
    private final long packedValue;

    @Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, m5175d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/CornerRadius;", "getZero-kKHJgLs$annotations", "getZero-kKHJgLs", "()J", "J", "ui-geometry_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getZero-kKHJgLs$annotations, reason: not valid java name */
        public static /* synthetic */ void m8929getZerokKHJgLs$annotations() {
        }

        /* renamed from: getZero-kKHJgLs, reason: not valid java name */
        public final long m8930getZerokKHJgLs() {
            return CornerRadius.Zero;
        }
    }

    private /* synthetic */ CornerRadius(long j4) {
        this.packedValue = j4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CornerRadius m8911boximpl(long j4) {
        return new CornerRadius(j4);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m8912component1impl(long j4) {
        return m8920getXimpl(j4);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m8913component2impl(long j4) {
        return m8921getYimpl(j4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8914constructorimpl(long j4) {
        return j4;
    }

    /* renamed from: copy-OHQCggk, reason: not valid java name */
    public static final long m8915copyOHQCggk(long j4, float f4, float f5) {
        return CornerRadiusKt.CornerRadius(f4, f5);
    }

    /* renamed from: copy-OHQCggk$default, reason: not valid java name */
    public static /* synthetic */ long m8916copyOHQCggk$default(long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = m8920getXimpl(j4);
        }
        if ((i4 & 2) != 0) {
            f5 = m8921getYimpl(j4);
        }
        return m8915copyOHQCggk(j4, f4, f5);
    }

    @Stable
    /* renamed from: div-Bz7bX_o, reason: not valid java name */
    public static final long m8917divBz7bX_o(long j4, float f4) {
        return CornerRadiusKt.CornerRadius(m8920getXimpl(j4) / f4, m8921getYimpl(j4) / f4);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8918equalsimpl(long j4, Object obj) {
        return (obj instanceof CornerRadius) && j4 == ((CornerRadius) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8919equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m8920getXimpl(long j4) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m8921getYimpl(long j4) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8922hashCodeimpl(long j4) {
        return AbstractC0321a.m137a(j4);
    }

    @Stable
    /* renamed from: minus-vF7b-mM, reason: not valid java name */
    public static final long m8923minusvF7bmM(long j4, long j5) {
        return CornerRadiusKt.CornerRadius(m8920getXimpl(j4) - m8920getXimpl(j5), m8921getYimpl(j4) - m8921getYimpl(j5));
    }

    @Stable
    /* renamed from: plus-vF7b-mM, reason: not valid java name */
    public static final long m8924plusvF7bmM(long j4, long j5) {
        return CornerRadiusKt.CornerRadius(m8920getXimpl(j4) + m8920getXimpl(j5), m8921getYimpl(j4) + m8921getYimpl(j5));
    }

    @Stable
    /* renamed from: times-Bz7bX_o, reason: not valid java name */
    public static final long m8925timesBz7bX_o(long j4, float f4) {
        return CornerRadiusKt.CornerRadius(m8920getXimpl(j4) * f4, m8921getYimpl(j4) * f4);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8926toStringimpl(long j4) {
        if (m8920getXimpl(j4) == m8921getYimpl(j4)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(m8920getXimpl(j4), 1) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(m8920getXimpl(j4), 1) + ", " + GeometryUtilsKt.toStringAsFixed(m8921getYimpl(j4), 1) + ')';
    }

    @Stable
    /* renamed from: unaryMinus-kKHJgLs, reason: not valid java name */
    public static final long m8927unaryMinuskKHJgLs(long j4) {
        return CornerRadiusKt.CornerRadius(-m8920getXimpl(j4), -m8921getYimpl(j4));
    }

    public boolean equals(Object obj) {
        return m8918equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m8922hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8926toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}

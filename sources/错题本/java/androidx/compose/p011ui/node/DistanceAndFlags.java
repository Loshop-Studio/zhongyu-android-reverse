package androidx.compose.p011ui.node;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, m5110d2 = {"Landroidx/compose/ui/node/DistanceAndFlags;", "", "packedValue", "", "constructor-impl", "(J)J", "distance", "", "getDistance-impl", "(J)F", "isInExpandedBounds", "", "isInExpandedBounds-impl", "(J)Z", "isInLayer", "isInLayer-impl", "getPackedValue", "()J", "compareTo", "", "other", "compareTo-9YPOF3E", "(JJ)I", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,410:1\n60#2:411\n22#3:412\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n*L\n373#1:411\n373#1:412\n*E\n"})
/* loaded from: classes2.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    private /* synthetic */ DistanceAndFlags(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m12175boximpl(long j7) {
        return new DistanceAndFlags(j7);
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m12176compareTo9YPOF3E(long j7, long j8) {
        boolean zM12183isInLayerimpl = m12183isInLayerimpl(j7);
        if (zM12183isInLayerimpl != m12183isInLayerimpl(j8)) {
            return zM12183isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m12180getDistanceimpl(j7), m12180getDistanceimpl(j8)) >= 0.0f && m12182isInExpandedBoundsimpl(j7) != m12182isInExpandedBoundsimpl(j8)) ? m12182isInExpandedBoundsimpl(j7) ? -1 : 1 : (int) Math.signum(m12180getDistanceimpl(j7) - m12180getDistanceimpl(j8));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m12177constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12178equalsimpl(long j7, Object obj) {
        return (obj instanceof DistanceAndFlags) && j7 == ((DistanceAndFlags) obj).m12185unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12179equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m12180getDistanceimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m12181hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m12182isInExpandedBoundsimpl(long j7) {
        return (j7 & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m12183isInLayerimpl(long j7) {
        return (j7 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m12184toStringimpl(long j7) {
        return "DistanceAndFlags(packedValue=" + j7 + ')';
    }

    public boolean equals(Object obj) {
        return m12178equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m12181hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m12184toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m12185unboximpl() {
        return this.packedValue;
    }
}

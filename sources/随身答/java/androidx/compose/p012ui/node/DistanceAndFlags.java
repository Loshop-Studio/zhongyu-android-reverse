package androidx.compose.p012ui.node;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, m13413d2 = {"Landroidx/compose/ui/node/DistanceAndFlags;", "", "packedValue", "", "constructor-impl", "(J)J", "distance", "", "getDistance-impl", "(J)F", "isInExpandedBounds", "", "isInExpandedBounds-impl", "(J)Z", "isInLayer", "isInLayer-impl", "getPackedValue", "()J", "compareTo", "", "other", "compareTo-9YPOF3E", "(JJ)I", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,410:1\n60#2:411\n22#3:412\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndFlags\n*L\n373#1:411\n373#1:412\n*E\n"})
/* loaded from: classes2.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    private /* synthetic */ DistanceAndFlags(long j9) {
        this.packedValue = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m22894boximpl(long j9) {
        return new DistanceAndFlags(j9);
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m22895compareTo9YPOF3E(long j9, long j10) {
        boolean zM22902isInLayerimpl = m22902isInLayerimpl(j9);
        if (zM22902isInLayerimpl != m22902isInLayerimpl(j10)) {
            return zM22902isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m22899getDistanceimpl(j9), m22899getDistanceimpl(j10)) >= 0.0f && m22901isInExpandedBoundsimpl(j9) != m22901isInExpandedBoundsimpl(j10)) ? m22901isInExpandedBoundsimpl(j9) ? -1 : 1 : (int) Math.signum(m22899getDistanceimpl(j9) - m22899getDistanceimpl(j10));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m22896constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22897equalsimpl(long j9, Object obj) {
        return (obj instanceof DistanceAndFlags) && j9 == ((DistanceAndFlags) obj).m22904unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22898equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m22899getDistanceimpl(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22900hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m22901isInExpandedBoundsimpl(long j9) {
        return (j9 & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m22902isInLayerimpl(long j9) {
        return (j9 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22903toStringimpl(long j9) {
        return "DistanceAndFlags(packedValue=" + j9 + ')';
    }

    public boolean equals(Object obj) {
        return m22897equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m22900hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m22903toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m22904unboximpl() {
        return this.packedValue;
    }
}

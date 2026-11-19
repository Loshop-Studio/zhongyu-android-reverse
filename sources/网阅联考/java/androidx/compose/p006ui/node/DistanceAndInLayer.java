package androidx.compose.p006ui.node;

import androidx.compose.animation.AbstractC0321a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m5175d2 = {"Landroidx/compose/ui/node/DistanceAndInLayer;", "", "packedValue", "", "constructor-impl", "(J)J", "distance", "", "getDistance-impl", "(J)F", "isInLayer", "", "isInLayer-impl", "(J)Z", "getPackedValue", "()J", "compareTo", "", "other", "compareTo-S_HNhKs", "(JJ)I", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,340:1\n34#2:341\n62#2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n*L\n319#1:341\n322#1:342\n*E\n"})
/* loaded from: classes.dex */
final class DistanceAndInLayer {
    private final long packedValue;

    private /* synthetic */ DistanceAndInLayer(long j4) {
        this.packedValue = j4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndInLayer m10684boximpl(long j4) {
        return new DistanceAndInLayer(j4);
    }

    /* renamed from: compareTo-S_HNhKs, reason: not valid java name */
    public static final int m10685compareToS_HNhKs(long j4, long j5) {
        boolean zM10691isInLayerimpl = m10691isInLayerimpl(j4);
        return zM10691isInLayerimpl != m10691isInLayerimpl(j5) ? zM10691isInLayerimpl ? -1 : 1 : (int) Math.signum(m10689getDistanceimpl(j4) - m10689getDistanceimpl(j5));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10686constructorimpl(long j4) {
        return j4;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10687equalsimpl(long j4, Object obj) {
        return (obj instanceof DistanceAndInLayer) && j4 == ((DistanceAndInLayer) obj).m10693unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10688equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m10689getDistanceimpl(long j4) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10690hashCodeimpl(long j4) {
        return AbstractC0321a.m137a(j4);
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m10691isInLayerimpl(long j4) {
        return ((int) (j4 & 4294967295L)) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10692toStringimpl(long j4) {
        return "DistanceAndInLayer(packedValue=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return m10687equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m10690hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m10692toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10693unboximpl() {
        return this.packedValue;
    }
}

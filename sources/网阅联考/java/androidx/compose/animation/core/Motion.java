package androidx.compose.animation.core;

import androidx.compose.animation.AbstractC0321a;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m5175d2 = {"Landroidx/compose/animation/core/Motion;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "value", "", "getValue-impl", "(J)F", "velocity", "getVelocity-impl", "copy", "copy-XB9eQnU", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,244:1\n34#2:245\n41#2:246\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n48#1:245\n50#1:246\n*E\n"})
/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j4) {
        this.packedValue = j4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m7012boximpl(long j4) {
        return new Motion(j4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7013constructorimpl(long j4) {
        return j4;
    }

    /* renamed from: copy-XB9eQnU, reason: not valid java name */
    public static final long m7014copyXB9eQnU(long j4, float f4, float f5) {
        return SpringSimulationKt.Motion(f4, f5);
    }

    /* renamed from: copy-XB9eQnU$default, reason: not valid java name */
    public static /* synthetic */ long m7015copyXB9eQnU$default(long j4, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = m7018getValueimpl(j4);
        }
        if ((i4 & 2) != 0) {
            f5 = m7019getVelocityimpl(j4);
        }
        return m7014copyXB9eQnU(j4, f4, f5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7016equalsimpl(long j4, Object obj) {
        return (obj instanceof Motion) && j4 == ((Motion) obj).m7022unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7017equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m7018getValueimpl(long j4) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m7019getVelocityimpl(long j4) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7020hashCodeimpl(long j4) {
        return AbstractC0321a.m137a(j4);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7021toStringimpl(long j4) {
        return "Motion(packedValue=" + j4 + ')';
    }

    public boolean equals(Object obj) {
        return m7016equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m7020hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7021toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7022unboximpl() {
        return this.packedValue;
    }
}

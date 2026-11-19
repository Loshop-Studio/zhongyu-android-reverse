package androidx.compose.animation.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0088\u0001\u0002¨\u0006\u001b"}, m5110d2 = {"Landroidx/compose/animation/core/Motion;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "value", "", "getValue-impl", "(J)F", "velocity", "getVelocity-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,152:1\n60#2:153\n70#2:155\n22#3:154\n22#3:156\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n32#1:153\n35#1:155\n32#1:154\n35#1:156\n*E\n"})
/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j7) {
        this.packedValue = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m6670boximpl(long j7) {
        return new Motion(j7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6671constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6672equalsimpl(long j7, Object obj) {
        return (obj instanceof Motion) && j7 == ((Motion) obj).m6678unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6673equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m6674getValueimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m6675getVelocityimpl(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6676hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6677toStringimpl(long j7) {
        return "Motion(packedValue=" + j7 + ')';
    }

    public boolean equals(Object obj) {
        return m6672equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m6676hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6677toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6678unboximpl() {
        return this.packedValue;
    }
}

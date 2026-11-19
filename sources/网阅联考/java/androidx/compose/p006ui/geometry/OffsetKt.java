package androidx.compose.p006ui.geometry;

import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a-\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"!\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m5175d2 = {"isFinite", "", "Landroidx/compose/ui/geometry/Offset;", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite-k-4lQ0M", "(J)Z", "isSpecified", "isSpecified-k-4lQ0M$annotations", "isSpecified-k-4lQ0M", "isUnspecified", "isUnspecified-k-4lQ0M$annotations", "isUnspecified-k-4lQ0M", "Offset", "x", "", "y", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-Wko1d7g", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-3MmeM6k", "(JLkotlin/jvm/functions/Function0;)J", "ui-geometry_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,266:1\n25#2,3:267\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:267,3\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f4, float f5) {
        return Offset.m8937constructorimpl((Float.floatToIntBits(f5) & 4294967295L) | (Float.floatToIntBits(f4) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m8962isFinitek4lQ0M(long j4) {
        float fM8945getXimpl = Offset.m8945getXimpl(j4);
        if ((Float.isInfinite(fM8945getXimpl) || Float.isNaN(fM8945getXimpl)) ? false : true) {
            float fM8946getYimpl = Offset.m8946getYimpl(j4);
            if ((Float.isInfinite(fM8946getYimpl) || Float.isNaN(fM8946getYimpl)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m8963isFinitek4lQ0M$annotations(long j4) {
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m8964isSpecifiedk4lQ0M(long j4) {
        return j4 != Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m8965isSpecifiedk4lQ0M$annotations(long j4) {
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m8966isUnspecifiedk4lQ0M(long j4) {
        return j4 == Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m8967isUnspecifiedk4lQ0M$annotations(long j4) {
    }

    @Stable
    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m8968lerpWko1d7g(long j4, long j5, float f4) {
        return Offset(MathHelpersKt.lerp(Offset.m8945getXimpl(j4), Offset.m8945getXimpl(j5), f4), MathHelpersKt.lerp(Offset.m8946getYimpl(j4), Offset.m8946getYimpl(j5), f4));
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m8969takeOrElse3MmeM6k(long j4, Function0<Offset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return m8964isSpecifiedk4lQ0M(j4) ? j4 : block.invoke().getPackedValue();
    }
}

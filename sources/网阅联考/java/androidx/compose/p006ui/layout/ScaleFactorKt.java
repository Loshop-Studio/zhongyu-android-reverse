package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\fH\u0002\u001a+\u0010\u001b\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0019\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006$"}, m5175d2 = {"isSpecified", "", "Landroidx/compose/ui/layout/ScaleFactor;", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified-FK8aYYs", "(J)Z", "isUnspecified", "isUnspecified-FK8aYYs$annotations", "isUnspecified-FK8aYYs", "ScaleFactor", "scaleX", "", "scaleY", "(FF)J", "lerp", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "div", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "div-UQTWf7w", "(JJ)J", "roundToTenths", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "times", "times-UQTWf7w", "size", "times-m-w2e94", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n130#1:201\n25#2,3:198\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:201\n31#1:198,3\n*E\n"})
/* loaded from: classes.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f4, float f5) {
        return ScaleFactor.m10633constructorimpl((Float.floatToIntBits(f5) & 4294967295L) | (Float.floatToIntBits(f4) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m10647divUQTWf7w(long j4, long j5) {
        return SizeKt.Size(Size.m9014getWidthimpl(j4) / ScaleFactor.m10639getScaleXimpl(j5), Size.m9011getHeightimpl(j4) / ScaleFactor.m10640getScaleYimpl(j5));
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m10648isSpecifiedFK8aYYs(long j4) {
        return j4 != ScaleFactor.Companion.m10646getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m10649isSpecifiedFK8aYYs$annotations(long j4) {
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m10650isUnspecifiedFK8aYYs(long j4) {
        return j4 == ScaleFactor.Companion.m10646getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m10651isUnspecifiedFK8aYYs$annotations(long j4) {
    }

    @Stable
    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m10652lerpbDIf60(long j4, long j5, float f4) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m10639getScaleXimpl(j4), ScaleFactor.m10639getScaleXimpl(j5), f4), MathHelpersKt.lerp(ScaleFactor.m10640getScaleYimpl(j4), ScaleFactor.m10640getScaleYimpl(j5), f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f4) {
        float f5 = 10;
        float f6 = f4 * f5;
        int i4 = (int) f6;
        if (f6 - i4 >= 0.5f) {
            i4++;
        }
        return i4 / f5;
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m10653takeOrElseoyDd2qo(long j4, Function0<ScaleFactor> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j4 > ScaleFactor.Companion.m10646getUnspecified_hLwfpc() ? 1 : (j4 == ScaleFactor.Companion.m10646getUnspecified_hLwfpc() ? 0 : -1)) != 0 ? j4 : block.invoke().m10644unboximpl();
    }

    @Stable
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m10654timesUQTWf7w(long j4, long j5) {
        return SizeKt.Size(Size.m9014getWidthimpl(j4) * ScaleFactor.m10639getScaleXimpl(j5), Size.m9011getHeightimpl(j4) * ScaleFactor.m10640getScaleYimpl(j5));
    }

    @Stable
    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m10655timesmw2e94(long j4, long j5) {
        return m10654timesUQTWf7w(j5, j4);
    }
}

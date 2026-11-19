package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a#\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a\"\u0010:\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00109\u001a*\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a*\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a*\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010C\u001a#\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a#\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bK\u0010I\u001a\u001f\u0010L\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bN\u0010I\u001a\u001f\u0010O\u001a\u00020\b*\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010I\u001a'\u0010R\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010A\u001a%\u0010T\u001a\u00020\b*\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0VH\u0086\bø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a%\u0010T\u001a\u00020\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010VH\u0086\bø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a%\u0010T\u001a\u00020\u0002*\u00020\u00022\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020VH\u0086\bø\u0001\u0000¢\u0006\u0004\b[\u0010Z\u001a\u001f\u0010\\\u001a\u00020\b*\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\u001f\u0010\\\u001a\u00020\b*\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000¢\u0006\u0004\b^\u0010I\u001a\u001f\u0010\\\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\u001f\u0010\\\u001a\u00020\b*\u00020\u00112\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000¢\u0006\u0004\b^\u0010b\u001a\u001f\u0010\\\u001a\u00020\u0002*\u00020\u00112\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b`\u0010c\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00118Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\u001f\u0010\u0014\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010$\"\u001f\u0010'\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u001e\"\u001f\u0010'\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010$\"\u001f\u0010'\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010$\"\u001f\u0010.\u001a\u00020\u0002*\u00020\u00158Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101\"\u001f\u00102\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006d"}, m13558d2 = {"center", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", "dp", "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", "start", "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", "max", "a", "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", "times", "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n97#1:435\n254#1:440\n363#1:447\n423#1:457\n428#1:459\n139#2:436\n53#3,3:437\n53#3,3:441\n53#3,3:444\n53#3,3:449\n53#3,3:452\n58#4:448\n52#4:455\n52#4:456\n52#4:458\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n108#1:435\n265#1:440\n374#1:447\n433#1:457\n433#1:459\n166#1:436\n188#1:437,3\n280#1:441,3\n287#1:444,3\n379#1:449,3\n397#1:452,3\n379#1:448\n423#1:455\n428#1:456\n433#1:458\n*E\n"})
/* loaded from: classes2.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m23582DpOffsetYgX7TsA(float f10, float f11) {
        return DpOffset.m23617constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m23583DpSizeYgX7TsA(float f10, float f11) {
        return DpSize.m23650constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m23584coerceAtLeastYgX7TsA(float f10, float f11) {
        return C3127Dp.m23561constructorimpl(RangesKt.coerceAtLeast(f10, f11));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m23585coerceAtMostYgX7TsA(float f10, float f11) {
        return C3127Dp.m23561constructorimpl(RangesKt.coerceAtMost(f10, f11));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m23586coerceIn2z7ARbQ(float f10, float f11, float f12) {
        return C3127Dp.m23561constructorimpl(RangesKt.coerceIn(f10, f11, f12));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m23587getCenterEaSLcWc(long j10) {
        float fM23561constructorimpl = C3127Dp.m23561constructorimpl(DpSize.m23659getWidthD9Ej5fM(j10) / 2.0f);
        float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(DpSize.m23657getHeightD9Ej5fM(j10) / 2.0f);
        return DpOffset.m23617constructorimpl((Float.floatToRawIntBits(fM23561constructorimpl2) & 4294967295L) | (Float.floatToRawIntBits(fM23561constructorimpl) << 32));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m23588getCenterEaSLcWc$annotations(long j10) {
    }

    public static final float getDp(int i10) {
        return C3127Dp.m23561constructorimpl(i10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d10) {
    }

    public static final float getHeight(DpRect dpRect) {
        return C3127Dp.m23561constructorimpl(dpRect.m23643getBottomD9Ej5fM() - dpRect.m23646getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(DpRect dpRect) {
        return m23583DpSizeYgX7TsA(C3127Dp.m23561constructorimpl(dpRect.m23645getRightD9Ej5fM() - dpRect.m23644getLeftD9Ej5fM()), C3127Dp.m23561constructorimpl(dpRect.m23643getBottomD9Ej5fM() - dpRect.m23646getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(DpRect dpRect) {
        return C3127Dp.m23561constructorimpl(dpRect.m23645getRightD9Ej5fM() - dpRect.m23644getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m23589isFinite0680j_4(float f10) {
        return (Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) < 2139095040;
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m23590isFinite0680j_4$annotations(float f10) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m23591isSpecified0680j_4(float f10) {
        return !Float.isNaN(f10);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m23592isSpecified0680j_4$annotations(float f10) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m23593isSpecifiedEaSLcWc(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m23594isSpecifiedEaSLcWc$annotations(long j10) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m23595isSpecifiedjoFl9I(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m23596isSpecifiedjoFl9I$annotations(long j10) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m23597isUnspecified0680j_4(float f10) {
        return Float.isNaN(f10);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m23598isUnspecified0680j_4$annotations(float f10) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m23599isUnspecifiedEaSLcWc(long j10) {
        return j10 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m23600isUnspecifiedEaSLcWc$annotations(long j10) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m23601isUnspecifiedjoFl9I(long j10) {
        return j10 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m23602isUnspecifiedjoFl9I$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m23603lerpIDex15A(long j10, long j11, float f10) {
        float fM23604lerpMdfbLM = m23604lerpMdfbLM(DpSize.m23659getWidthD9Ej5fM(j10), DpSize.m23659getWidthD9Ej5fM(j11), f10);
        float fM23604lerpMdfbLM2 = m23604lerpMdfbLM(DpSize.m23657getHeightD9Ej5fM(j10), DpSize.m23657getHeightD9Ej5fM(j11), f10);
        return DpSize.m23650constructorimpl((Float.floatToRawIntBits(fM23604lerpMdfbLM) << 32) | (Float.floatToRawIntBits(fM23604lerpMdfbLM2) & 4294967295L));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m23604lerpMdfbLM(float f10, float f11, float f12) {
        return C3127Dp.m23561constructorimpl(MathHelpersKt.lerp(f10, f11, f12));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m23605lerpxhh869w(long j10, long j11, float f10) {
        float fLerp = MathHelpersKt.lerp(DpOffset.m23622getXD9Ej5fM(j10), DpOffset.m23622getXD9Ej5fM(j11), f10);
        float fLerp2 = MathHelpersKt.lerp(DpOffset.m23624getYD9Ej5fM(j10), DpOffset.m23624getYD9Ej5fM(j11), f10);
        return DpOffset.m23617constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m23606maxYgX7TsA(float f10, float f11) {
        return C3127Dp.m23561constructorimpl(Math.max(f10, f11));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m23607minYgX7TsA(float f10, float f11) {
        return C3127Dp.m23561constructorimpl(Math.min(f10, f11));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m23608takeOrElseD5KLDUw(float f10, Function0<C3127Dp> function0) {
        return !Float.isNaN(f10) ? f10 : function0.invoke().m23575unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m23609takeOrElsegVKV90s(long j10, Function0<DpOffset> function0) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : function0.invoke().m23630unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m23610takeOrElseitqla9I(long j10, Function0<DpSize> function0) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : function0.invoke().getPackedValue();
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m23612times3ABfNKs(float f10, float f11) {
        return C3127Dp.m23561constructorimpl(f10 * f11);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m23615times6HolHcs(int i10, long j10) {
        return DpSize.m23665timesGh9hcWk(j10, i10);
    }

    public static final float getDp(double d10) {
        return C3127Dp.m23561constructorimpl((float) d10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f10) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m23611times3ABfNKs(double d10, float f10) {
        return C3127Dp.m23561constructorimpl(((float) d10) * f10);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m23614times6HolHcs(float f10, long j10) {
        return DpSize.m23664timesGh9hcWk(j10, f10);
    }

    public static final float getDp(float f10) {
        return C3127Dp.m23561constructorimpl(f10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i10) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m23613times3ABfNKs(int i10, float f10) {
        return C3127Dp.m23561constructorimpl(i10 * f10);
    }
}

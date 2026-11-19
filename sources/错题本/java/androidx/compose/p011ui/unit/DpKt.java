package androidx.compose.p011ui.unit;

import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\n\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001f\u0010\n\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a#\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u001a#\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\t\u001a'\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\t\u001a\u001f\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\t\u001a*\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018\u001a#\u0010(\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a%\u0010\u0005\u001a\u00020%*\u00020%2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a*\u0010\"\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020%2\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\"\u00101\u001a\u00020/2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010'\u001a%\u0010\u0005\u001a\u00020/*\u00020/2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020/0\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u0010*\u001a\u001f\u0010\n\u001a\u00020/*\u00020\r2\u0006\u00103\u001a\u00020/H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u0010\n\u001a\u00020/*\u00020\u00062\u0006\u00103\u001a\u00020/H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u00106\u001a*\u0010\"\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020/2\u0006\u0010 \u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010,\"\u001f\u0010=\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:\"\u001f\u0010@\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010:\"\u001f\u0010E\u001a\u00020\u0000*\u00020\r8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bA\u0010B\"\u001f\u0010E\u001a\u00020\u0000*\u00020\u000b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010G\u001a\u0004\bA\u0010F\"\u001f\u0010E\u001a\u00020\u0000*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010<\u001a\u0004\bA\u0010H\"\u001f\u0010K\u001a\u000208*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010:\"\u001f\u0010=\u001a\u000208*\u00020%8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010M\"\u001f\u0010@\u001a\u000208*\u00020%8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010O\u001a\u0004\bP\u0010M\"\u001f\u0010=\u001a\u000208*\u00020/8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bS\u0010O\u001a\u0004\bR\u0010M\"\u001f\u0010@\u001a\u000208*\u00020/8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010O\u001a\u0004\bT\u0010M\"\u001e\u0010Y\u001a\u00020%*\u00020/8FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010O\u001a\u0004\bV\u0010W\"\u001f\u0010-\u001a\u00020\u0000*\u00020Z8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b]\u0010^\u001a\u0004\b[\u0010\\\"\u001f\u0010.\u001a\u00020\u0000*\u00020Z8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010^\u001a\u0004\b_\u0010\\\"\u001f\u00103\u001a\u00020/*\u00020Z8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bc\u0010^\u001a\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006d"}, m5110d2 = {"Landroidx/compose/ui/unit/Dp;", "Lkotlin/Function0;", "block", "takeOrElse-D5KLDUw", "(FLr6/a;)F", "takeOrElse", "", "other", "times-3ABfNKs", "(FF)F", "times", "", "(DF)F", "", "(IF)F", "a", "b", "min-YgX7TsA", "min", "max-YgX7TsA", "max", "minimumValue", "maximumValue", "coerceIn-2z7ARbQ", "(FFF)F", "coerceIn", "coerceAtLeast-YgX7TsA", "coerceAtLeast", "coerceAtMost-YgX7TsA", "coerceAtMost", "start", "stop", "fraction", "lerp-Md-fbLM", "lerp", "x", "y", "Landroidx/compose/ui/unit/DpOffset;", "DpOffset-YgX7TsA", "(FF)J", "DpOffset", "takeOrElse-gVKV90s", "(JLr6/a;)J", "lerp-xhh869w", "(JJF)J", "width", "height", "Landroidx/compose/ui/unit/DpSize;", "DpSize-YgX7TsA", "DpSize", "takeOrElse-itqla9I", "size", "times-6HolHcs", "(IJ)J", "(FJ)J", "lerp-IDex15A", "", "isSpecified-0680j_4", "(F)Z", "isSpecified-0680j_4$annotations", "(F)V", "isSpecified", "isUnspecified-0680j_4", "isUnspecified-0680j_4$annotations", "isUnspecified", "getDp", "(I)F", "getDp$annotations", "(I)V", "dp", "(D)F", "(D)V", "(F)F", "isFinite-0680j_4", "isFinite-0680j_4$annotations", "isFinite", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-jo-Fl9I$annotations", "(J)V", "isUnspecified-jo-Fl9I", "isUnspecified-jo-Fl9I$annotations", "isSpecified-EaSLcWc", "isSpecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "isUnspecified-EaSLcWc$annotations", "getCenter-EaSLcWc", "(J)J", "getCenter-EaSLcWc$annotations", "center", "Landroidx/compose/ui/unit/DpRect;", "getWidth", "(Landroidx/compose/ui/unit/DpRect;)F", "getWidth$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "getHeight$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "getSize$annotations", "ui-unit_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n97#1:435\n254#1:440\n363#1:447\n423#1:457\n428#1:459\n139#2:436\n53#3,3:437\n53#3,3:441\n53#3,3:444\n53#3,3:449\n53#3,3:452\n58#4:448\n52#4:455\n52#4:456\n52#4:458\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n108#1:435\n265#1:440\n374#1:447\n433#1:457\n433#1:459\n166#1:436\n188#1:437,3\n280#1:441,3\n287#1:444,3\n379#1:449,3\n397#1:452,3\n379#1:448\n423#1:455\n428#1:456\n433#1:458\n*E\n"})
/* loaded from: classes2.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m13326DpOffsetYgX7TsA(float f, float f7) {
        return DpOffset.m13361constructorimpl((Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m13327DpSizeYgX7TsA(float f, float f7) {
        return DpSize.m13394constructorimpl((Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m13328coerceAtLeastYgX7TsA(float f, float f7) {
        if (f < f7) {
            f = f7;
        }
        return C2331Dp.m13305constructorimpl(f);
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m13329coerceAtMostYgX7TsA(float f, float f7) {
        if (f > f7) {
            f = f7;
        }
        return C2331Dp.m13305constructorimpl(f);
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m13330coerceIn2z7ARbQ(float f, float f7, float f8) {
        return C2331Dp.m13305constructorimpl(AbstractC5806u.m5273l(f, f7, f8));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m13331getCenterEaSLcWc(long j7) {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(DpSize.m13403getWidthD9Ej5fM(j7) / 2.0f);
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(DpSize.m13401getHeightD9Ej5fM(j7) / 2.0f);
        return DpOffset.m13361constructorimpl((Float.floatToRawIntBits(fM13305constructorimpl2) & 4294967295L) | (Float.floatToRawIntBits(fM13305constructorimpl) << 32));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m13332getCenterEaSLcWc$annotations(long j7) {
    }

    public static final float getDp(int i) {
        return C2331Dp.m13305constructorimpl(i);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d9) {
    }

    public static final float getHeight(@NotNull DpRect dpRect) {
        return C2331Dp.m13305constructorimpl(dpRect.m13387getBottomD9Ej5fM() - dpRect.m13390getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(@NotNull DpRect dpRect) {
        return m13327DpSizeYgX7TsA(C2331Dp.m13305constructorimpl(dpRect.m13389getRightD9Ej5fM() - dpRect.m13388getLeftD9Ej5fM()), C2331Dp.m13305constructorimpl(dpRect.m13387getBottomD9Ej5fM() - dpRect.m13390getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(@NotNull DpRect dpRect) {
        return C2331Dp.m13305constructorimpl(dpRect.m13389getRightD9Ej5fM() - dpRect.m13388getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m13333isFinite0680j_4(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040;
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m13334isFinite0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m13335isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m13336isSpecified0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m13337isSpecifiedEaSLcWc(long j7) {
        return j7 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m13338isSpecifiedEaSLcWc$annotations(long j7) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m13339isSpecifiedjoFl9I(long j7) {
        return j7 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m13340isSpecifiedjoFl9I$annotations(long j7) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m13341isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m13342isUnspecified0680j_4$annotations(float f) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m13343isUnspecifiedEaSLcWc(long j7) {
        return j7 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m13344isUnspecifiedEaSLcWc$annotations(long j7) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m13345isUnspecifiedjoFl9I(long j7) {
        return j7 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m13346isUnspecifiedjoFl9I$annotations(long j7) {
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m13347lerpIDex15A(long j7, long j8, float f) {
        float fM13348lerpMdfbLM = m13348lerpMdfbLM(DpSize.m13403getWidthD9Ej5fM(j7), DpSize.m13403getWidthD9Ej5fM(j8), f);
        float fM13348lerpMdfbLM2 = m13348lerpMdfbLM(DpSize.m13401getHeightD9Ej5fM(j7), DpSize.m13401getHeightD9Ej5fM(j8), f);
        return DpSize.m13394constructorimpl((Float.floatToRawIntBits(fM13348lerpMdfbLM) << 32) | (Float.floatToRawIntBits(fM13348lerpMdfbLM2) & 4294967295L));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m13348lerpMdfbLM(float f, float f7, float f8) {
        return C2331Dp.m13305constructorimpl(MathHelpersKt.lerp(f, f7, f8));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m13349lerpxhh869w(long j7, long j8, float f) {
        float fLerp = MathHelpersKt.lerp(DpOffset.m13366getXD9Ej5fM(j7), DpOffset.m13366getXD9Ej5fM(j8), f);
        float fLerp2 = MathHelpersKt.lerp(DpOffset.m13368getYD9Ej5fM(j7), DpOffset.m13368getYD9Ej5fM(j8), f);
        return DpOffset.m13361constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m13350maxYgX7TsA(float f, float f7) {
        return C2331Dp.m13305constructorimpl(Math.max(f, f7));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m13351minYgX7TsA(float f, float f7) {
        return C2331Dp.m13305constructorimpl(Math.min(f, f7));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m13352takeOrElseD5KLDUw(float f, @NotNull InterfaceC6469a interfaceC6469a) {
        return !Float.isNaN(f) ? f : ((C2331Dp) interfaceC6469a.invoke()).m13319unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m13353takeOrElsegVKV90s(long j7, @NotNull InterfaceC6469a interfaceC6469a) {
        return j7 != InlineClassHelperKt.UnspecifiedPackedFloats ? j7 : ((DpOffset) interfaceC6469a.invoke()).m13374unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m13354takeOrElseitqla9I(long j7, @NotNull InterfaceC6469a interfaceC6469a) {
        return j7 != InlineClassHelperKt.UnspecifiedPackedFloats ? j7 : ((DpSize) interfaceC6469a.invoke()).getPackedValue();
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m13356times3ABfNKs(float f, float f7) {
        return C2331Dp.m13305constructorimpl(f * f7);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m13359times6HolHcs(int i, long j7) {
        return DpSize.m13409timesGh9hcWk(j7, i);
    }

    public static final float getDp(double d9) {
        return C2331Dp.m13305constructorimpl((float) d9);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m13355times3ABfNKs(double d9, float f) {
        return C2331Dp.m13305constructorimpl(((float) d9) * f);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m13358times6HolHcs(float f, long j7) {
        return DpSize.m13408timesGh9hcWk(j7, f);
    }

    public static final float getDp(float f) {
        return C2331Dp.m13305constructorimpl(f);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m13357times3ABfNKs(int i, float f) {
        return C2331Dp.m13305constructorimpl(i * f);
    }
}

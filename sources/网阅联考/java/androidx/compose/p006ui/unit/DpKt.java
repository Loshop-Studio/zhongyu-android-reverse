package androidx.compose.p006ui.unit;

import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a%\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a%\u0010:\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u00109\u001a-\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a-\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a-\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010C\u001a&\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a&\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010I\u001a\"\u0010L\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010I\u001a\"\u0010O\u001a\u00020\b*\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010I\u001a*\u0010R\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010A\u001a+\u0010T\u001a\u00020\b*\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a+\u0010T\u001a\u00020\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a+\u0010T\u001a\u00020\u0002*\u00020\u00022\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010Z\u001a\"\u0010\\\u001a\u00020\b*\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\"\u0010\\\u001a\u00020\b*\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010I\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\"\u0010\\\u001a\u00020\b*\u00020\u00112\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00112\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010c\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u00020\t8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\"\u0010\u0007\u001a\u00020\b*\u00020\u000e8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\"\u0010\u0007\u001a\u00020\b*\u00020\u00118Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\"\u0010\u0014\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\"\u0010\u001a\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u001e\"\"\u0010'\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010$\"\"\u0010.\u001a\u00020\u0002*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101\"\"\u00102\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006d"}, m5175d2 = {"center", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", "dp", "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", "start", "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", "max", C3335ai.f1705at, "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", "times", "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n130#1:558\n337#1:562\n473#1:566\n544#1:570\n550#1:572\n25#2,3:559\n25#2,3:563\n71#3:567\n58#3:568\n58#3:569\n58#3:571\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n144#1:558\n351#1:562\n487#1:566\n556#1:570\n556#1:572\n254#1:559,3\n372#1:563,3\n495#1:567\n544#1:568\n550#1:569\n556#1:571\n*E\n"})
/* loaded from: classes.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m11546DpOffsetYgX7TsA(float f4, float f5) {
        return DpOffset.m11581constructorimpl((Float.floatToIntBits(f5) & 4294967295L) | (Float.floatToIntBits(f4) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m11547DpSizeYgX7TsA(float f4, float f5) {
        return DpSize.m11614constructorimpl((Float.floatToIntBits(f5) & 4294967295L) | (Float.floatToIntBits(f4) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m11548coerceAtLeastYgX7TsA(float f4, float f5) {
        return C1700Dp.m11525constructorimpl(RangesKt___RangesKt.coerceAtLeast(f4, f5));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m11549coerceAtMostYgX7TsA(float f4, float f5) {
        return C1700Dp.m11525constructorimpl(RangesKt___RangesKt.coerceAtMost(f4, f5));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m11550coerceIn2z7ARbQ(float f4, float f5, float f6) {
        return C1700Dp.m11525constructorimpl(RangesKt___RangesKt.coerceIn(f4, f5, f6));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m11551getCenterEaSLcWc(long j4) {
        return m11546DpOffsetYgX7TsA(C1700Dp.m11525constructorimpl(DpSize.m11623getWidthD9Ej5fM(j4) / 2.0f), C1700Dp.m11525constructorimpl(DpSize.m11621getHeightD9Ej5fM(j4) / 2.0f));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m11552getCenterEaSLcWc$annotations(long j4) {
    }

    public static final float getDp(int i4) {
        return C1700Dp.m11525constructorimpl(i4);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d4) {
    }

    public static final float getHeight(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return C1700Dp.m11525constructorimpl(dpRect.m11607getBottomD9Ej5fM() - dpRect.m11610getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return m11547DpSizeYgX7TsA(C1700Dp.m11525constructorimpl(dpRect.m11609getRightD9Ej5fM() - dpRect.m11608getLeftD9Ej5fM()), C1700Dp.m11525constructorimpl(dpRect.m11607getBottomD9Ej5fM() - dpRect.m11610getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return C1700Dp.m11525constructorimpl(dpRect.m11609getRightD9Ej5fM() - dpRect.m11608getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m11553isFinite0680j_4(float f4) {
        return !(f4 == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m11554isFinite0680j_4$annotations(float f4) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m11555isSpecified0680j_4(float f4) {
        return !Float.isNaN(f4);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m11556isSpecified0680j_4$annotations(float f4) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m11557isSpecifiedEaSLcWc(long j4) {
        return j4 != DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m11558isSpecifiedEaSLcWc$annotations(long j4) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m11559isSpecifiedjoFl9I(long j4) {
        return j4 != DpOffset.INSTANCE.m11595getUnspecifiedRKDOV3M();
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m11560isSpecifiedjoFl9I$annotations(long j4) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m11561isUnspecified0680j_4(float f4) {
        return Float.isNaN(f4);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m11562isUnspecified0680j_4$annotations(float f4) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m11563isUnspecifiedEaSLcWc(long j4) {
        return j4 == DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m11564isUnspecifiedEaSLcWc$annotations(long j4) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m11565isUnspecifiedjoFl9I(long j4) {
        return j4 == DpOffset.INSTANCE.m11595getUnspecifiedRKDOV3M();
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m11566isUnspecifiedjoFl9I$annotations(long j4) {
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m11567lerpIDex15A(long j4, long j5, float f4) {
        return m11547DpSizeYgX7TsA(m11568lerpMdfbLM(DpSize.m11623getWidthD9Ej5fM(j4), DpSize.m11623getWidthD9Ej5fM(j5), f4), m11568lerpMdfbLM(DpSize.m11621getHeightD9Ej5fM(j4), DpSize.m11621getHeightD9Ej5fM(j5), f4));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m11568lerpMdfbLM(float f4, float f5, float f6) {
        return C1700Dp.m11525constructorimpl(MathHelpersKt.lerp(f4, f5, f6));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m11569lerpxhh869w(long j4, long j5, float f4) {
        return m11546DpOffsetYgX7TsA(m11568lerpMdfbLM(DpOffset.m11586getXD9Ej5fM(j4), DpOffset.m11586getXD9Ej5fM(j5), f4), m11568lerpMdfbLM(DpOffset.m11588getYD9Ej5fM(j4), DpOffset.m11588getYD9Ej5fM(j5), f4));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m11570maxYgX7TsA(float f4, float f5) {
        return C1700Dp.m11525constructorimpl(Math.max(f4, f5));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m11571minYgX7TsA(float f4, float f5) {
        return C1700Dp.m11525constructorimpl(Math.min(f4, f5));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m11572takeOrElseD5KLDUw(float f4, Function0<C1700Dp> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return Float.isNaN(f4) ^ true ? f4 : block.invoke().m11539unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m11573takeOrElsegVKV90s(long j4, Function0<DpOffset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j4 > DpOffset.INSTANCE.m11595getUnspecifiedRKDOV3M() ? 1 : (j4 == DpOffset.INSTANCE.m11595getUnspecifiedRKDOV3M() ? 0 : -1)) != 0 ? j4 : block.invoke().getPackedValue();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m11574takeOrElseitqla9I(long j4, Function0<DpSize> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j4 > DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ() ? 1 : (j4 == DpSize.INSTANCE.m11632getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? j4 : block.invoke().getPackedValue();
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m11576times3ABfNKs(float f4, float f5) {
        return C1700Dp.m11525constructorimpl(f4 * f5);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m11579times6HolHcs(int i4, long j4) {
        return DpSize.m11629timesGh9hcWk(j4, i4);
    }

    public static final float getDp(double d4) {
        return C1700Dp.m11525constructorimpl((float) d4);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f4) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m11575times3ABfNKs(double d4, float f4) {
        return C1700Dp.m11525constructorimpl(((float) d4) * f4);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m11578times6HolHcs(float f4, long j4) {
        return DpSize.m11628timesGh9hcWk(j4, f4);
    }

    public static final float getDp(float f4) {
        return C1700Dp.m11525constructorimpl(f4);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i4) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m11577times3ABfNKs(int i4, float f4) {
        return C1700Dp.m11525constructorimpl(i4 * f4);
    }
}

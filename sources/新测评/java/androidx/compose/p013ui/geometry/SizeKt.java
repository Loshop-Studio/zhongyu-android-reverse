package androidx.compose.p013ui.geometry;

import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b¢\u0006\u0002\u0010\u0013\u001a*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010$\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020%2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010&\u001a\u0016\u0010'\u001a\u00020(*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m13558d2 = {"center", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "getCenter-uvyYCjk$annotations", "(J)V", "getCenter-uvyYCjk", "(J)J", "isSpecified", "", "isSpecified-uvyYCjk$annotations", "isSpecified-uvyYCjk", "(J)Z", "isUnspecified", "isUnspecified-uvyYCjk$annotations", "isUnspecified-uvyYCjk", "Size", "width", "", "height", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "times", "", "size", "times-d16Qtg0", "(DJ)J", "(FJ)J", "", "(IJ)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,199:1\n148#1:203\n53#2,3:200\n60#2:204\n70#2:206\n53#2,3:208\n60#2:211\n70#2:213\n53#2,3:215\n22#3:205\n22#3:207\n22#3:212\n30#4:214\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n159#1:203\n33#1:200,3\n178#1:204\n179#1:206\n177#1:208,3\n198#1:211\n198#1:213\n198#1:215,3\n178#1:205\n179#1:207\n198#1:212\n198#1:214\n*E\n"})
/* loaded from: classes2.dex */
public final class SizeKt {
    @Stable
    public static final long Size(float f10, float f11) {
        return Size.m20795constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m20814getCenteruvyYCjk(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f;
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m20815getCenteruvyYCjk$annotations(long j10) {
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m20816isSpecifieduvyYCjk(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m20817isSpecifieduvyYCjk$annotations(long j10) {
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m20818isUnspecifieduvyYCjk(long j10) {
        return j10 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m20819isUnspecifieduvyYCjk$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m20820lerpVgWVRYQ(long j10, long j11, float f10) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return Size.m20795constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m20821takeOrElseTmRCtEA(long j10, Function0<Size> function0) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : function0.invoke().m20809unboximpl();
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m20824timesd16Qtg0(int i10, long j10) {
        return Size.m20807times7Ah8Wj8(j10, i10);
    }

    @Stable
    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m20825toRectuvyYCjk(long j10) {
        return RectKt.m20775Recttz77jQw(Offset.INSTANCE.m20751getZeroF1C5BW0(), j10);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m20822timesd16Qtg0(double d10, long j10) {
        return Size.m20807times7Ah8Wj8(j10, (float) d10);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m20823timesd16Qtg0(float f10, long j10) {
        return Size.m20807times7Ah8Wj8(j10, f10);
    }
}

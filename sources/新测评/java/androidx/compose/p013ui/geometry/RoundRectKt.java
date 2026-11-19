package androidx.compose.p013ui.geometry;

import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a@\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a8\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001c\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m13558d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", TypedValues.CycleType.S_WAVE_OFFSET, "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRoundRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRectKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,422:1\n33#2:423\n53#3,3:424\n60#3:428\n70#3:431\n60#3:433\n70#3:436\n60#3:438\n70#3:441\n60#3:444\n70#3:447\n60#3:450\n70#3:453\n60#3:456\n70#3:459\n60#3:471\n70#3:474\n53#3,3:477\n48#4:427\n53#4:430\n48#4:432\n53#4:435\n48#4:449\n53#4:452\n48#4:455\n53#4:458\n79#4,2:462\n79#4,2:464\n79#4,2:466\n79#4,2:468\n48#4:470\n53#4:473\n86#4:480\n22#5:429\n22#5:434\n22#5:439\n22#5:442\n22#5:445\n22#5:448\n22#5:451\n22#5:454\n22#5:457\n22#5:460\n22#5:472\n22#5:475\n65#6:437\n69#6:440\n65#6:443\n69#6:446\n139#7:461\n30#8:476\n*S KotlinDebug\n*F\n+ 1 RoundRect.kt\nandroidx/compose/ui/geometry/RoundRectKt\n*L\n234#1:423\n234#1:424,3\n252#1:428\n252#1:431\n272#1:433\n272#1:436\n301#1:438\n302#1:441\n303#1:444\n304#1:447\n324#1:450\n325#1:453\n326#1:456\n327#1:459\n360#1:471\n361#1:474\n382#1:477,3\n252#1:427\n252#1:430\n272#1:432\n272#1:435\n324#1:449\n325#1:452\n326#1:455\n327#1:458\n349#1:462,2\n350#1:464,2\n351#1:466,2\n352#1:468,2\n360#1:470\n361#1:473\n390#1:480\n252#1:429\n272#1:434\n301#1:439\n302#1:442\n303#1:445\n304#1:448\n324#1:451\n325#1:454\n326#1:457\n327#1:460\n360#1:472\n361#1:475\n301#1:437\n302#1:440\n303#1:443\n304#1:446\n344#1:461\n382#1:476\n*E\n"})
/* loaded from: classes2.dex */
public final class RoundRectKt {
    public static final RoundRect RoundRect(Rect rect, float f10, float f11) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f10, f11);
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m20787RoundRectZAM2FJo(Rect rect, long j10, long j11, long j12, long j13) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j10, j11, j12, j13, null);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m20789RoundRectgG7oq9Y(float f10, float f11, float f12, float f13, long j10) {
        return RoundRect(f10, f11, f12, f13, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m20790RoundRectsniSvfs(Rect rect, long j10) {
        return RoundRect(rect, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(RoundRect roundRect) {
        float left = roundRect.getLeft() + (roundRect.getWidth() / 2.0f);
        float top2 = roundRect.getTop() + (roundRect.getHeight() / 2.0f);
        return Offset.m20727constructorimpl((Float.floatToRawIntBits(top2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft() + (Math.max(Float.intBitsToFloat((int) (roundRect.m20783getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m20785getTopLeftCornerRadiuskKHJgLs() >> 32))) * 0.29289323f), roundRect.getTop() + (Math.max(Float.intBitsToFloat((int) (roundRect.m20785getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m20786getTopRightCornerRadiuskKHJgLs() & 4294967295L))) * 0.29289323f), roundRect.getRight() - (Math.max(Float.intBitsToFloat((int) (roundRect.m20786getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m20784getBottomRightCornerRadiuskKHJgLs() >> 32))) * 0.29289323f), roundRect.getBottom() - (Math.max(Float.intBitsToFloat((int) (roundRect.m20784getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m20783getBottomLeftCornerRadiuskKHJgLs() & 4294967295L))) * 0.29289323f));
    }

    public static final boolean isCircle(RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        return roundRect.m20785getTopLeftCornerRadiuskKHJgLs() == roundRect.m20786getTopRightCornerRadiuskKHJgLs() && roundRect.m20786getTopRightCornerRadiuskKHJgLs() == roundRect.m20784getBottomRightCornerRadiuskKHJgLs() && roundRect.m20784getBottomRightCornerRadiuskKHJgLs() == roundRect.m20783getBottomLeftCornerRadiuskKHJgLs() && ((double) roundRect.getWidth()) <= ((double) Float.intBitsToFloat((int) (roundRect.m20785getTopLeftCornerRadiuskKHJgLs() >> 32))) * 2.0d && ((double) roundRect.getHeight()) <= ((double) Float.intBitsToFloat((int) (roundRect.m20785getTopLeftCornerRadiuskKHJgLs() & 4294967295L))) * 2.0d;
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect) {
        return (Float.floatToRawIntBits(roundRect.getLeft()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getTop()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getRight()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getBottom()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean isRect(RoundRect roundRect) {
        long jM20785getTopLeftCornerRadiuskKHJgLs = roundRect.m20785getTopLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~jM20785getTopLeftCornerRadiuskKHJgLs) & (jM20785getTopLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM20786getTopRightCornerRadiuskKHJgLs = roundRect.m20786getTopRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~jM20786getTopRightCornerRadiuskKHJgLs) & (jM20786getTopRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM20783getBottomLeftCornerRadiuskKHJgLs = roundRect.m20783getBottomLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~jM20783getBottomLeftCornerRadiuskKHJgLs) & (jM20783getBottomLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM20784getBottomRightCornerRadiuskKHJgLs = roundRect.m20784getBottomRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        return (((~jM20784getBottomRightCornerRadiuskKHJgLs) & (jM20784getBottomRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    public static final boolean isSimple(RoundRect roundRect) {
        long jM20785getTopLeftCornerRadiuskKHJgLs = roundRect.m20785getTopLeftCornerRadiuskKHJgLs();
        return (jM20785getTopLeftCornerRadiuskKHJgLs >>> 32) == (jM20785getTopLeftCornerRadiuskKHJgLs & 4294967295L) && roundRect.m20785getTopLeftCornerRadiuskKHJgLs() == roundRect.m20786getTopRightCornerRadiuskKHJgLs() && roundRect.m20785getTopLeftCornerRadiuskKHJgLs() == roundRect.m20784getBottomRightCornerRadiuskKHJgLs() && roundRect.m20785getTopLeftCornerRadiuskKHJgLs() == roundRect.m20783getBottomLeftCornerRadiuskKHJgLs();
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f10) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f10), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f10), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f10), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f10), CornerRadiusKt.m20708lerp3Ry4LBc(roundRect.m20785getTopLeftCornerRadiuskKHJgLs(), roundRect2.m20785getTopLeftCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m20708lerp3Ry4LBc(roundRect.m20786getTopRightCornerRadiuskKHJgLs(), roundRect2.m20786getTopRightCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m20708lerp3Ry4LBc(roundRect.m20784getBottomRightCornerRadiuskKHJgLs(), roundRect2.m20784getBottomRightCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m20708lerp3Ry4LBc(roundRect.m20783getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m20783getBottomLeftCornerRadiuskKHJgLs(), f10), null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m20791translateUv8p0NA(RoundRect roundRect, long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (4294967295L & j10);
        return new RoundRect(roundRect.getLeft() + Float.intBitsToFloat(i10), roundRect.getTop() + Float.intBitsToFloat(i11), roundRect.getRight() + Float.intBitsToFloat(i10), Float.intBitsToFloat(i11) + roundRect.getBottom(), roundRect.m20785getTopLeftCornerRadiuskKHJgLs(), roundRect.m20786getTopRightCornerRadiuskKHJgLs(), roundRect.m20784getBottomRightCornerRadiuskKHJgLs(), roundRect.m20783getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final RoundRect RoundRect(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jM20689constructorimpl = CornerRadius.m20689constructorimpl((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L));
        return new RoundRect(f10, f11, f12, f13, jM20689constructorimpl, jM20689constructorimpl, jM20689constructorimpl, jM20689constructorimpl, null);
    }
}

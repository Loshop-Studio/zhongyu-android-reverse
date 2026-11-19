package androidx.compose.p011ui.graphics;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.collection.FloatFloatPair;
import androidx.compose.p011ui.graphics.PathSegment;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b'\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\n\u001a\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0005\u001a \u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\n\u001a/\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u000f\u001a2\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0082\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a/\u0010#\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b&\u0010'\u001a)\u0010(\u001a\u00020%2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b(\u0010'\u001aA\u0010+\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010/\u001a\u00020!*\u00020-2\u0006\u0010.\u001a\u00020-H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u001c\u0010/\u001a\u00020!*\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b/\u00101\u001a\u0018\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\u0082\b¢\u0006\u0004\b3\u00104\u001a'\u00105\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b5\u00106\u001a'\u0010:\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0002H\u0000¢\u0006\u0004\b:\u0010;\u001a'\u0010?\u001a\u00020!2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0002H\u0002¢\u0006\u0004\b?\u0010@\u001a7\u0010C\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019H\u0000¢\u0006\u0004\bC\u0010D\u001a7\u0010F\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0019H\u0002¢\u0006\u0004\bF\u0010G\u001a\u001f\u0010J\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u0019H\u0002¢\u0006\u0004\bJ\u0010K\u001a'\u0010N\u001a\u00020M2\u0006\u0010L\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\bN\u0010O\u001a\u001f\u0010P\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0002H\u0002¢\u0006\u0004\bP\u0010\u0016\u001a7\u0010R\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019H\u0000¢\u0006\u0004\bR\u0010D\u001a/\u0010S\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0002H\u0002¢\u0006\u0004\bS\u0010T\u001a'\u0010W\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u00192\u0006\u0010V\u001a\u00020\u0019H\u0002¢\u0006\u0004\bW\u0010X\u001a\u001f\u0010Z\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\u0019H\u0002¢\u0006\u0004\bZ\u0010K\u001a7\u0010]\u001a\u00020M2\u0006\u0010L\u001a\u00020\u00192\u0006\u0010[\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b]\u0010^\u001aO\u0010d\u001a\u00020\u00022\u0006\u0010_\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u0010`\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010a\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010b\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u0002H\u0000¢\u0006\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010g\"\u0014\u0010h\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010g\"\u0014\u0010i\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010j\"\u0019\u0010m\u001a\u00020\u0002*\u00020\u00008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l\"\u0018\u0010o\u001a\u00020\u0002*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010l\"\u0019\u0010q\u001a\u00020\u0002*\u00020\u00008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010l\"\u0018\u0010s\u001a\u00020\u0002*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010l¨\u0006t"}, m5110d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "segment", "", "t", "evaluateX", "(Landroidx/compose/ui/graphics/PathSegment;F)F", "evaluateY", "p0y", "p1y", "evaluateLine", "(FFF)F", "p0", "p1", "p2", "evaluateQuadratic", "(FFFF)F", "p3", "evaluateCubic", "(FFFFF)F", "fraction", "findFirstRoot", "findFirstLineRoot", "(FF)F", "findFirstQuadraticRoot", "findFirstCubicRoot", "", "roots", "", "index", "findLineRoot", "(FF[FI)I", "findQuadraticRoots", "(FFF[FI)I", "", "horizontal", "findDerivativeRoots", "(Landroidx/compose/ui/graphics/PathSegment;Z[FI)I", "Landroidx/collection/FloatFloatPair;", "computeHorizontalBounds", "(Landroidx/compose/ui/graphics/PathSegment;[FI)J", "computeVerticalBounds", "p2y", "p3y", "computeCubicVerticalBounds", "(FFFF[FI)J", "", "b", "closeTo", "(DD)Z", "(FF)Z", "r", "clampValidRootInUnitRange", "(F)F", "writeValidRootInUnitRange", "(F[FI)I", "points", "x", "y", "lineWinding", "([FFF)I", "y0", "y1", "y2", "isQuadraticMonotonic", "(FFF)Z", "tmpQuadratics", "tmpRoots", "quadraticWinding", "([FFF[F[F)I", TypedValues.CycleType.S_WAVE_OFFSET, "monotonicQuadraticWinding", "([FIFF[F)I", "quadratic", "dst", "quadraticToMonotonicQuadratics", "([F[F)I", "src", "Ld6/s;", "splitQuadraticAt", "([F[FF)V", "unitDivide", "tmpCubics", "cubicWinding", "monotonicCubicWinding", "([FIFF)I", "cubic", "tmpRoot", "cubicToMonotonicCubics", "([F[F[F)I", "dstRoots", "findCubicExtremaY", "srcOffset", "dstOffset", "splitCubicAt", "([FI[FIF)V", "x0", "x1", "x2", "x3", "y3", "cubicArea", "(FFFFFFFF)F", "Tau", "D", "Epsilon", "FloatEpsilon", "F", "getStartX", "(Landroidx/compose/ui/graphics/PathSegment;)F", "startX", "getEndX", "endX", "getStartY", "startY", "getEndY", "endY", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1010:1\n154#1:1011\n472#1:1012\n473#1:1023\n472#1:1024\n473#1:1035\n472#1:1036\n473#1:1047\n472#1:1048\n473#1:1059\n472#1:1060\n473#1:1071\n454#1:1072\n454#1:1073\n454#1:1074\n472#1:1075\n473#1:1086\n472#1:1087\n473#1:1098\n472#1:1099\n473#1:1110\n472#1:1121\n473#1:1132\n472#1:1133\n473#1:1144\n472#1:1145\n473#1:1156\n472#1:1157\n473#1:1168\n472#1:1169\n473#1:1180\n472#1:1181\n473#1:1192\n273#1:1193\n273#1:1194\n984#1:1195\n984#1:1196\n998#1:1197\n998#1:1198\n273#1:1199\n472#1:1210\n473#1:1221\n456#1:1222\n456#1:1225\n65#2,10:1013\n65#2,10:1025\n65#2,10:1037\n65#2,10:1049\n65#2,10:1061\n65#2,10:1076\n65#2,10:1088\n65#2,10:1100\n83#2,10:1111\n65#2,10:1122\n65#2,10:1134\n65#2,10:1146\n65#2,10:1158\n65#2,10:1170\n65#2,10:1182\n65#2,10:1200\n65#2,10:1211\n46#2:1223\n56#2:1224\n65#2,10:1226\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n131#1:1011\n131#1:1012\n131#1:1023\n154#1:1024\n154#1:1035\n174#1:1036\n174#1:1047\n177#1:1048\n177#1:1059\n179#1:1060\n179#1:1071\n208#1:1072\n210#1:1073\n212#1:1074\n215#1:1075\n215#1:1086\n220#1:1087\n220#1:1098\n223#1:1099\n223#1:1110\n244#1:1121\n244#1:1132\n247#1:1133\n247#1:1144\n250#1:1145\n250#1:1156\n254#1:1157\n254#1:1168\n257#1:1169\n257#1:1180\n264#1:1181\n264#1:1192\n347#1:1193\n362#1:1194\n381#1:1195\n382#1:1196\n406#1:1197\n407#1:1198\n439#1:1199\n483#1:1210\n483#1:1221\n618#1:1222\n805#1:1225\n131#1:1013,10\n154#1:1025,10\n174#1:1037,10\n177#1:1049,10\n179#1:1061,10\n215#1:1076,10\n220#1:1088,10\n223#1:1100,10\n240#1:1111,10\n244#1:1122,10\n247#1:1134,10\n250#1:1146,10\n254#1:1158,10\n257#1:1170,10\n264#1:1182,10\n472#1:1200,10\n483#1:1211,10\n783#1:1223\n786#1:1224\n845#1:1226,10\n*E\n"})
/* loaded from: classes.dex */
public final class BezierKt {
    private static final double Epsilon = 1.0E-7d;
    private static final float FloatEpsilon = 1.05E-6f;
    private static final double Tau = 6.283185307179586d;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final float clampValidRootInUnitRange(float f) {
        float f7 = f >= 0.0f ? f : 0.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (Math.abs(f7 - f) > FloatEpsilon) {
            return Float.NaN;
        }
        return f7;
    }

    public static final boolean closeTo(double d9, double d10) {
        return Math.abs(d9 - d10) < Epsilon;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeCubicVerticalBounds(float f, float f7, float f8, float f9, @NotNull float[] fArr, int i) {
        float f10 = (f7 - f) * 3.0f;
        float f11 = (f8 - f7) * 3.0f;
        float f12 = (f9 - f8) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f10, f11, f12, fArr, i);
        float f13 = (f11 - f10) * 2.0f;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((-f13) / (((f12 - f11) * 2.0f) - f13), fArr, i + iFindQuadraticRoots) + iFindQuadraticRoots;
        float fMin = Math.min(f, f9);
        float fMax = Math.max(f, f9);
        for (int i8 = 0; i8 < iWriteValidRootInUnitRange; i8++) {
            float fEvaluateCubic = evaluateCubic(f, f7, f8, f9, fArr[i8]);
            fMin = Math.min(fMin, fEvaluateCubic);
            fMax = Math.max(fMax, fEvaluateCubic);
        }
        return FloatFloatPair.m6517constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float f, float f7, float f8, float f9, float[] fArr, int i, int i8, Object obj) {
        if ((i8 & 32) != 0) {
            i = 0;
        }
        return computeCubicVerticalBounds(f, f7, f8, f9, fArr, i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeHorizontalBounds(@NotNull PathSegment pathSegment, @NotNull float[] fArr, int i) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, true, fArr, i);
        float fMin = Math.min(pathSegment.getPoints()[0], getEndX(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[0], getEndX(pathSegment));
        for (int i8 = 0; i8 < iFindDerivativeRoots; i8++) {
            float fEvaluateX = evaluateX(pathSegment, fArr[i8]);
            fMin = Math.min(fMin, fEvaluateX);
            fMax = Math.max(fMax, fEvaluateX);
        }
        return FloatFloatPair.m6517constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeHorizontalBounds$default(PathSegment pathSegment, float[] fArr, int i, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i = 0;
        }
        return computeHorizontalBounds(pathSegment, fArr, i);
    }

    public static final long computeVerticalBounds(@NotNull PathSegment pathSegment, @NotNull float[] fArr, int i) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, false, fArr, i);
        float fMin = Math.min(pathSegment.getPoints()[1], getEndY(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[1], getEndY(pathSegment));
        for (int i8 = 0; i8 < iFindDerivativeRoots; i8++) {
            float fEvaluateY = evaluateY(pathSegment, fArr[i8]);
            fMin = Math.min(fMin, fEvaluateY);
            fMax = Math.max(fMax, fEvaluateY);
        }
        return FloatFloatPair.m6517constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeVerticalBounds$default(PathSegment pathSegment, float[] fArr, int i, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i = 0;
        }
        return computeVerticalBounds(pathSegment, fArr, i);
    }

    public static final float cubicArea(float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        return ((((((f / 3.0f) + f10) * f13) + (AbstractC0037f.m77b(f, f10, f9, ((f8 + f10) * (f13 - f7)) - ((f9 + f11) * (f12 - f))) - ((f7 - f11) * f8))) - (((f7 / 3.0f) + f11) * f12)) * 3.0f) / 20.0f;
    }

    private static final int cubicToMonotonicCubics(float[] fArr, float[] fArr2, float[] fArr3) {
        int iFindCubicExtremaY = findCubicExtremaY(fArr, fArr3);
        int i = 0;
        if (iFindCubicExtremaY == 0) {
            if (fArr2.length < 8) {
                return 0;
            }
            AbstractC5802q.m5176C(fArr, 0, fArr2, 0, 8);
            return iFindCubicExtremaY;
        }
        int i8 = 0;
        float f = 0.0f;
        while (i < iFindCubicExtremaY) {
            float f7 = (fArr3[i] - f) / (1.0f - f);
            if (f7 < 0.0f) {
                f7 = 0.0f;
            }
            f = f7 > 1.0f ? 1.0f : f7;
            splitCubicAt(fArr, i8, fArr2, i8, f);
            i8 += 6;
            i++;
            fArr = fArr2;
        }
        return iFindCubicExtremaY;
    }

    public static final int cubicWinding(@NotNull float[] fArr, float f, float f7, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        int iCubicToMonotonicCubics = cubicToMonotonicCubics(fArr, fArr2, fArr3);
        int iMonotonicCubicWinding = 0;
        if (iCubicToMonotonicCubics >= 0) {
            int i = 0;
            while (true) {
                iMonotonicCubicWinding += monotonicCubicWinding(fArr2, i * 6, f, f7);
                if (i == iCubicToMonotonicCubics) {
                    break;
                }
                i++;
            }
        }
        return iMonotonicCubicWinding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateCubic(float f, float f7, float f8) {
        return ((((((f - f7) + 0.33333334f) * f8) + (f7 - (2.0f * f))) * f8) + f) * 3.0f * f8;
    }

    private static final float evaluateLine(float f, float f7, float f8) {
        return AbstractC0037f.m77b(f7, f, f8, f);
    }

    private static final float evaluateQuadratic(float f, float f7, float f8, float f9) {
        return (((((f8 - (f7 * 2.0f)) + f) * f9) + ((f7 - f) * 2.0f)) * f9) + f;
    }

    private static final float evaluateX(PathSegment pathSegment, float f) {
        float[] points = pathSegment.getPoints();
        int i = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i == 1) {
            return points[0];
        }
        if (i == 2) {
            return evaluateLine(points[0], points[2], f);
        }
        if (i == 3) {
            return evaluateQuadratic(points[0], points[2], points[4], f);
        }
        if (i != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[0], points[2], points[4], points[6], f);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateY(@NotNull PathSegment pathSegment, float f) {
        float[] points = pathSegment.getPoints();
        int i = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i == 1) {
            return points[1];
        }
        if (i == 2) {
            return evaluateLine(points[1], points[3], f);
        }
        if (i == 3) {
            return evaluateQuadratic(points[1], points[3], points[5], f);
        }
        if (i != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[1], points[3], points[5], points[7], f);
    }

    private static final int findCubicExtremaY(float[] fArr, float[] fArr2) {
        float f = fArr[1];
        float f7 = fArr[3];
        float f8 = fArr[5];
        return findQuadraticRoots(AbstractC0037f.m77b(f7, f8, 3.0f, fArr[7] - f), (((f - f7) - f7) - f8) * 2.0f, f7 - f, fArr2, 0);
    }

    private static final int findDerivativeRoots(PathSegment pathSegment, boolean z8, float[] fArr, int i) {
        int i8 = !z8 ? 1 : 0;
        float[] points = pathSegment.getPoints();
        int i9 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i9 == 3) {
            float f = 2;
            float f7 = points[i8 + 2];
            float f8 = (f7 - points[i8]) * f;
            return writeValidRootInUnitRange((-f8) / (((points[i8 + 4] - f7) * f) - f8), fArr, i);
        }
        if (i9 != 4) {
            return 0;
        }
        float f9 = points[i8 + 2];
        float f10 = (f9 - points[i8]) * 3.0f;
        float f11 = points[i8 + 4];
        float f12 = (f11 - f9) * 3.0f;
        float f13 = (points[i8 + 6] - f11) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f10, f12, f13, fArr, i);
        float f14 = (f12 - f10) * 2.0f;
        return writeValidRootInUnitRange((-f14) / (((f13 - f12) * 2.0f) - f14), fArr, i + iFindQuadraticRoots) + iFindQuadraticRoots;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstCubicRoot(float f, float f7, float f8, float f9) {
        float f10;
        float f11;
        double d9 = f;
        double d10 = ((d9 - (f7 * 2.0d)) + f8) * 3.0d;
        double d11 = (f7 - f) * 3.0d;
        double d12 = ((f7 - f8) * 3.0d) + (-f) + f9;
        if (Math.abs(d12 - AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
            if (Math.abs(d10 - AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
                if (Math.abs(d11 - AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
                    return Float.NaN;
                }
                float f12 = (float) ((-d9) / d11);
                f10 = f12 >= 0.0f ? f12 : 0.0f;
                f11 = f10 <= 1.0f ? f10 : 1.0f;
                if (Math.abs(f11 - f12) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f11;
            }
            double dSqrt = Math.sqrt((d11 * d11) - ((4.0d * d10) * d9));
            double d13 = d10 * 2.0d;
            float f13 = (float) ((dSqrt - d11) / d13);
            float f14 = f13 < 0.0f ? 0.0f : f13;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            if (Math.abs(f14 - f13) > FloatEpsilon) {
                f14 = Float.NaN;
            }
            if (!Float.isNaN(f14)) {
                return f14;
            }
            float f15 = (float) (((-d11) - dSqrt) / d13);
            f10 = f15 >= 0.0f ? f15 : 0.0f;
            f11 = f10 <= 1.0f ? f10 : 1.0f;
            if (Math.abs(f11 - f15) > FloatEpsilon) {
                return Float.NaN;
            }
            return f11;
        }
        double d14 = d10 / d12;
        double d15 = d11 / d12;
        double d16 = d9 / d12;
        double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
        double d18 = ((d16 * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
        double d19 = d17 * d17 * d17;
        double d20 = (d18 * d18) + d19;
        double d21 = d14 / 3.0d;
        if (d20 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d20 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                double dSqrt2 = Math.sqrt(d20);
                float fFastCbrt = (float) ((MathHelpersKt.fastCbrt((float) ((-d18) + dSqrt2)) - MathHelpersKt.fastCbrt((float) (d18 + dSqrt2))) - d21);
                f10 = fFastCbrt >= 0.0f ? fFastCbrt : 0.0f;
                f11 = f10 <= 1.0f ? f10 : 1.0f;
                if (Math.abs(f11 - fFastCbrt) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f11;
            }
            float f16 = -MathHelpersKt.fastCbrt((float) d18);
            float f17 = (float) d21;
            float f18 = (2.0f * f16) - f17;
            float f19 = f18 < 0.0f ? 0.0f : f18;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            if (Math.abs(f19 - f18) > FloatEpsilon) {
                f19 = Float.NaN;
            }
            if (!Float.isNaN(f19)) {
                return f19;
            }
            float f20 = (-f16) - f17;
            f10 = f20 >= 0.0f ? f20 : 0.0f;
            f11 = f10 <= 1.0f ? f10 : 1.0f;
            if (Math.abs(f11 - f20) > FloatEpsilon) {
                return Float.NaN;
            }
            return f11;
        }
        double dSqrt3 = Math.sqrt(-d19);
        double d22 = (-d18) / dSqrt3;
        if (d22 < -1.0d) {
            d22 = -1.0d;
        }
        if (d22 > 1.0d) {
            d22 = 1.0d;
        }
        double dAcos = Math.acos(d22);
        double dFastCbrt = MathHelpersKt.fastCbrt((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dFastCbrt) - d21);
        float f21 = fCos < 0.0f ? 0.0f : fCos;
        if (f21 > 1.0f) {
            f21 = 1.0f;
        }
        if (Math.abs(f21 - fCos) > FloatEpsilon) {
            f21 = Float.NaN;
        }
        if (!Float.isNaN(f21)) {
            return f21;
        }
        float fCos2 = (float) ((Math.cos((Tau + dAcos) / 3.0d) * dFastCbrt) - d21);
        float f22 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f22 > 1.0f) {
            f22 = 1.0f;
        }
        if (Math.abs(f22 - fCos2) > FloatEpsilon) {
            f22 = Float.NaN;
        }
        if (!Float.isNaN(f22)) {
            return f22;
        }
        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dFastCbrt) - d21);
        f10 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f11 = f10 <= 1.0f ? f10 : 1.0f;
        if (Math.abs(f11 - fCos3) > FloatEpsilon) {
            return Float.NaN;
        }
        return f11;
    }

    private static final float findFirstLineRoot(float f, float f7) {
        float f8 = (-f) / (f7 - f);
        float f9 = f8 >= 0.0f ? f8 : 0.0f;
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (Math.abs(f9 - f8) > FloatEpsilon) {
            return Float.NaN;
        }
        return f9;
    }

    private static final float findFirstQuadraticRoot(float f, float f7, float f8) {
        float f9;
        float f10;
        double d9 = f;
        double d10 = f7;
        double d11 = f8;
        double d12 = d10 * 2.0d;
        double d13 = (d9 - d12) + d11;
        if (d13 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d10 == d11) {
                return Float.NaN;
            }
            float f11 = (float) ((d12 - d11) / (d12 - (d11 * 2.0d)));
            f9 = f11 >= 0.0f ? f11 : 0.0f;
            f10 = f9 <= 1.0f ? f9 : 1.0f;
            if (Math.abs(f10 - f11) > FloatEpsilon) {
                return Float.NaN;
            }
            return f10;
        }
        double d14 = -Math.sqrt((d10 * d10) - (d11 * d9));
        double d15 = (-d9) + d10;
        float f12 = (float) ((-(d14 + d15)) / d13);
        float f13 = f12 < 0.0f ? 0.0f : f12;
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (Math.abs(f13 - f12) > FloatEpsilon) {
            f13 = Float.NaN;
        }
        if (!Float.isNaN(f13)) {
            return f13;
        }
        float f14 = (float) ((d14 - d15) / d13);
        f9 = f14 >= 0.0f ? f14 : 0.0f;
        f10 = f9 <= 1.0f ? f9 : 1.0f;
        if (Math.abs(f10 - f14) > FloatEpsilon) {
            return Float.NaN;
        }
        return f10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstRoot(@NotNull PathSegment pathSegment, float f) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return Float.NaN;
            case 2:
                float f7 = points[0] - f;
                float f8 = (-f7) / ((points[2] - f) - f7);
                float f9 = f8 >= 0.0f ? f8 : 0.0f;
                if (f9 > 1.0f) {
                    f9 = 1.0f;
                }
                if (Math.abs(f9 - f8) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f9;
            case 3:
                return findFirstQuadraticRoot(points[0] - f, points[2] - f, points[4] - f);
            case 4:
                return findFirstCubicRoot(points[0] - f, points[2] - f, points[4] - f, points[6] - f);
            case 5:
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final int findLineRoot(float f, float f7, float[] fArr, int i) {
        return writeValidRootInUnitRange((-f) / (f7 - f), fArr, i);
    }

    public static /* synthetic */ int findLineRoot$default(float f, float f7, float[] fArr, int i, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            i = 0;
        }
        return writeValidRootInUnitRange((-f) / (f7 - f), fArr, i);
    }

    private static final int findQuadraticRoots(float f, float f7, float f8, float[] fArr, int i) {
        double d9 = f;
        double d10 = f7;
        double d11 = f8;
        double d12 = d10 * 2.0d;
        double d13 = (d9 - d12) + d11;
        if (d13 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d10 == d11) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d12 - d11) / (d12 - (d11 * 2.0d))), fArr, i);
        }
        double d14 = -Math.sqrt((d10 * d10) - (d11 * d9));
        double d15 = (-d9) + d10;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d14 + d15)) / d13), fArr, i);
        int iWriteValidRootInUnitRange2 = iWriteValidRootInUnitRange + writeValidRootInUnitRange((float) ((d14 - d15) / d13), fArr, i + iWriteValidRootInUnitRange);
        if (iWriteValidRootInUnitRange2 <= 1) {
            return iWriteValidRootInUnitRange2;
        }
        float f9 = fArr[i];
        int i8 = i + 1;
        float f10 = fArr[i8];
        if (f9 <= f10) {
            return f9 == f10 ? iWriteValidRootInUnitRange2 - 1 : iWriteValidRootInUnitRange2;
        }
        fArr[i] = f10;
        fArr[i8] = f9;
        return iWriteValidRootInUnitRange2;
    }

    public static /* synthetic */ int findQuadraticRoots$default(float f, float f7, float f8, float[] fArr, int i, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            i = 0;
        }
        return findQuadraticRoots(f, f7, f8, fArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float getEndX(androidx.compose.p011ui.graphics.PathSegment r3) {
        /*
            float[] r0 = r3.getPoints()
            androidx.compose.ui.graphics.PathSegment$Type r3 = r3.getType()
            int[] r1 = androidx.compose.ui.graphics.BezierKt.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r1[r3]
            r1 = 2
            if (r3 == r1) goto L21
            r1 = 3
            r2 = 4
            if (r3 == r1) goto L1e
            if (r3 == r2) goto L20
            r1 = 5
            if (r3 == r1) goto L1e
            r1 = 0
            goto L21
        L1e:
            r1 = r2
            goto L21
        L20:
            r1 = 6
        L21:
            r3 = r0[r1]
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.BezierKt.getEndX(androidx.compose.ui.graphics.PathSegment):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float getEndY(androidx.compose.p011ui.graphics.PathSegment r3) {
        /*
            float[] r0 = r3.getPoints()
            androidx.compose.ui.graphics.PathSegment$Type r3 = r3.getType()
            int[] r1 = androidx.compose.ui.graphics.BezierKt.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r1[r3]
            r1 = 2
            r2 = 3
            if (r3 == r1) goto L21
            r1 = 5
            if (r3 == r2) goto L1e
            r2 = 4
            if (r3 == r2) goto L20
            if (r3 == r1) goto L1e
            r2 = 0
            goto L21
        L1e:
            r2 = r1
            goto L21
        L20:
            r2 = 7
        L21:
            r3 = r0[r2]
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.BezierKt.getEndY(androidx.compose.ui.graphics.PathSegment):float");
    }

    private static final float getStartX(PathSegment pathSegment) {
        return pathSegment.getPoints()[0];
    }

    private static final float getStartY(PathSegment pathSegment) {
        return pathSegment.getPoints()[1];
    }

    private static final boolean isQuadraticMonotonic(float f, float f7, float f8) {
        return !(Math.signum(f7 - f8) + Math.signum(f - f7) == 0.0f);
    }

    public static final int lineWinding(@NotNull float[] fArr, float f, float f7) {
        int i;
        float f8;
        if (fArr.length < 4) {
            return 0;
        }
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = f12 - f10;
        if (f10 > f12) {
            i = -1;
            f8 = f10;
        } else {
            i = 1;
            f8 = f12;
            f12 = f10;
        }
        if (f7 < f12 || f7 >= f8) {
            return 0;
        }
        float f14 = ((f7 - f10) * (f11 - f9)) - ((f - f9) * f13);
        if (f14 == 0.0f || ((int) Math.signum(f14)) == i) {
            return 0;
        }
        return i;
    }

    private static final int monotonicCubicWinding(float[] fArr, int i, float f, float f7) {
        int i8;
        int i9 = i + 1;
        float f8 = fArr[i9];
        int i10 = i + 7;
        float f9 = fArr[i10];
        if (f8 > f9) {
            i8 = -1;
            f9 = f8;
            f8 = f9;
        } else {
            i8 = 1;
        }
        if (f7 >= f8 && f7 < f9) {
            float f10 = fArr[i];
            float f11 = fArr[i + 2];
            float f12 = fArr[i + 4];
            float f13 = fArr[i + 6];
            if (f < Math.min(f10, Math.min(f11, Math.min(f12, f13)))) {
                return 0;
            }
            if (f <= Math.max(f10, Math.max(f11, Math.max(f12, f13)))) {
                float f14 = fArr[i9];
                float f15 = fArr[i + 3];
                float f16 = fArr[i + 5];
                float f17 = fArr[i10];
                float fFindFirstCubicRoot = findFirstCubicRoot(f14 - f7, f15 - f7, f16 - f7, f17 - f7);
                if (Float.isNaN(fFindFirstCubicRoot)) {
                    return 0;
                }
                float fEvaluateCubic = evaluateCubic(f10, f11, f12, f13, fFindFirstCubicRoot);
                if ((Math.abs(fEvaluateCubic - f) >= FloatEpsilon || (f == f13 && f7 == f17)) && fEvaluateCubic < f) {
                }
            }
            return i8;
        }
        return 0;
    }

    private static final int monotonicQuadraticWinding(float[] fArr, int i, float f, float f7, float[] fArr2) {
        int i8;
        float f8;
        float f9;
        float f10 = fArr[i + 1];
        float f11 = fArr[i + 5];
        if (f10 > f11) {
            i8 = -1;
            f9 = f10;
            f8 = f11;
        } else {
            i8 = 1;
            f8 = f10;
            f9 = f11;
        }
        if (f7 >= f8 && f7 < f9) {
            float f12 = fArr[i + 3];
            float fEvaluateQuadratic = findQuadraticRoots$default((f10 - (f12 * 2.0f)) + f11, (f12 - f10) * 2.0f, f10 - f7, fArr2, 0, 16, null) == 0 ? fArr[(1 - i8) * 2] : evaluateQuadratic(fArr[0], fArr[2], fArr[4], fArr2[0]);
            if ((Math.abs(fEvaluateQuadratic - f) >= FloatEpsilon || (f == fArr[4] && f7 == f11)) && fEvaluateQuadratic < f) {
                return i8;
            }
        }
        return 0;
    }

    private static final int quadraticToMonotonicQuadratics(float[] fArr, float[] fArr2) {
        if (fArr.length < 6 || fArr2.length < 6) {
            return 0;
        }
        float f = fArr[1];
        float f7 = fArr[3];
        float f8 = fArr[5];
        if (!isQuadraticMonotonic(f, f7, f8)) {
            float f9 = f - f7;
            float fUnitDivide = unitDivide(f9, (f9 - f7) + f8);
            if (!Float.isNaN(fUnitDivide)) {
                splitQuadraticAt(fArr, fArr2, fUnitDivide);
                return 1;
            }
            if (Math.abs(f9) >= Math.abs(f7 - f8)) {
                f = f8;
            }
            f7 = f;
        }
        AbstractC5802q.m5176C(fArr, 0, fArr2, 0, 6);
        fArr2[3] = f7;
        return 0;
    }

    public static final int quadraticWinding(@NotNull float[] fArr, float f, float f7, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        if (isQuadraticMonotonic(fArr[1], fArr[3], fArr[5])) {
            return monotonicQuadraticWinding(fArr, 0, f, f7, fArr3);
        }
        int iQuadraticToMonotonicQuadratics = quadraticToMonotonicQuadratics(fArr, fArr2);
        int iMonotonicQuadraticWinding = monotonicQuadraticWinding(fArr2, 0, f, f7, fArr3);
        return iQuadraticToMonotonicQuadratics > 0 ? iMonotonicQuadraticWinding + monotonicQuadraticWinding(fArr2, 4, f, f7, fArr3) : iMonotonicQuadraticWinding;
    }

    private static final void splitCubicAt(float[] fArr, int i, float[] fArr2, int i8, float f) {
        if (fArr.length >= i + 8 && fArr2.length >= i8 + 14) {
            if (f >= 1.0f) {
                AbstractC5802q.m5176C(fArr, i8, fArr2, i, 8);
                float f7 = fArr[i + 6];
                float f8 = fArr[i + 7];
                fArr2[i8 + 8] = f7;
                fArr2[i8 + 9] = f8;
                fArr2[i8 + 10] = f7;
                fArr2[i8 + 11] = f8;
                fArr2[i8 + 12] = f7;
                fArr2[i8 + 13] = f8;
                return;
            }
            float f9 = fArr[i];
            float f10 = fArr[i + 1];
            fArr2[i8] = f9;
            fArr2[i8 + 1] = f10;
            float f11 = fArr[i + 2];
            float f12 = fArr[i + 3];
            float fLerp = MathHelpersKt.lerp(f9, f11, f);
            float fLerp2 = MathHelpersKt.lerp(f10, f12, f);
            fArr2[i8 + 2] = fLerp;
            fArr2[i8 + 3] = fLerp2;
            float f13 = fArr[i + 4];
            float f14 = fArr[i + 5];
            float fLerp3 = MathHelpersKt.lerp(f11, f13, f);
            float fLerp4 = MathHelpersKt.lerp(f12, f14, f);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f);
            fArr2[i8 + 4] = fLerp5;
            fArr2[i8 + 5] = fLerp6;
            float f15 = fArr[i + 6];
            float f16 = fArr[i + 7];
            float fLerp7 = MathHelpersKt.lerp(f13, f15, f);
            float fLerp8 = MathHelpersKt.lerp(f14, f16, f);
            float fLerp9 = MathHelpersKt.lerp(fLerp3, fLerp7, f);
            float fLerp10 = MathHelpersKt.lerp(fLerp4, fLerp8, f);
            float fLerp11 = MathHelpersKt.lerp(fLerp5, fLerp9, f);
            float fLerp12 = MathHelpersKt.lerp(fLerp6, fLerp10, f);
            fArr2[i8 + 6] = fLerp11;
            fArr2[i8 + 7] = fLerp12;
            fArr2[i8 + 8] = fLerp9;
            fArr2[i8 + 9] = fLerp10;
            fArr2[i8 + 10] = fLerp7;
            fArr2[i8 + 11] = fLerp8;
            fArr2[i8 + 12] = f15;
            fArr2[i8 + 13] = f16;
        }
    }

    private static final void splitQuadraticAt(float[] fArr, float[] fArr2, float f) {
        if (fArr.length >= 6 && fArr2.length >= 10) {
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[2];
            float f10 = fArr[3];
            float f11 = fArr[4];
            float f12 = fArr[5];
            float fLerp = MathHelpersKt.lerp(f7, f9, f);
            float fLerp2 = MathHelpersKt.lerp(f8, f10, f);
            fArr2[0] = f7;
            fArr2[1] = f8;
            fArr2[2] = fLerp;
            fArr2[3] = fLerp2;
            float fLerp3 = MathHelpersKt.lerp(f9, f11, f);
            float fLerp4 = MathHelpersKt.lerp(f10, f12, f);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f);
            fArr2[4] = fLerp5;
            fArr2[5] = fLerp6;
            fArr2[6] = fLerp3;
            fArr2[7] = fLerp4;
            fArr2[8] = f11;
            fArr2[9] = f12;
        }
    }

    private static final float unitDivide(float f, float f7) {
        if (f < 0.0f) {
            f = -f;
            f7 = -f7;
        }
        if (f7 == 0.0f || f == 0.0f || f >= f7) {
            return Float.NaN;
        }
        float f8 = f / f7;
        if (f8 == 0.0f) {
            return Float.NaN;
        }
        return f8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int writeValidRootInUnitRange(float f, float[] fArr, int i) {
        float f7 = f >= 0.0f ? f : 0.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (Math.abs(f7 - f) > FloatEpsilon) {
            f7 = Float.NaN;
        }
        fArr[i] = f7;
        return !Float.isNaN(f7) ? 1 : 0;
    }

    public static final boolean closeTo(float f, float f7) {
        return Math.abs(f - f7) < FloatEpsilon;
    }

    private static final float evaluateCubic(float f, float f7, float f8, float f9, float f10) {
        float f11 = (((f7 - f8) * 3.0f) + f9) - f;
        return (((((f11 * f10) + (((f8 - (2.0f * f7)) + f) * 3.0f)) * f10) + ((f7 - f) * 3.0f)) * f10) + f;
    }
}

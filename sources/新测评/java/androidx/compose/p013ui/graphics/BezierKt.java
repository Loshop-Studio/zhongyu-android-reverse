package androidx.compose.p013ui.graphics;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.collection.FloatFloatPair;
import androidx.compose.p013ui.graphics.PathSegment;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0082\b\u001a?\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001e\u001a'\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\u0010\u001e\u001aH\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0000\u001a \u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0018H\u0002\u001a0\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0018H\u0000\u001a \u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0007\u001a0\u00103\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u001a \u00109\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u001a(\u0010:\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u001a\u0018\u0010;\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0003H\u0002\u001a\u0018\u0010<\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0003H\u0007\u001a\u0018\u0010=\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u0018H\u0002\u001a(\u0010?\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u001a(\u0010B\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H\u0007\u001a\u0019\u0010C\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003H\u0082\b\u001a \u0010D\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003H\u0002\u001a\u0018\u0010E\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0003H\u0007\u001a+\u0010G\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0082\b\u001a2\u0010H\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002\u001a \u0010I\u001a\u00020A2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002\u001a \u0010J\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0000\u001a(\u0010K\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0002\u001a0\u0010M\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0018H\u0002\u001a\u0018\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0002\u001a0\u0010P\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0018H\u0000\u001a0\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010U\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010V\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u0003H\u0002\u001a \u0010W\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0003H\u0002\u001a\u0018\u0010X\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0002\u001a \u0010Y\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u001a\u0015\u0010Z\u001a\u00020A*\u00020\u00012\u0006\u0010[\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010Z\u001a\u00020A*\u00020\u00032\u0006\u0010[\u001a\u00020\u0003H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0005\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\"\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b\"\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\\"}, m13558d2 = {"Epsilon", "", "FloatEpsilon", "", "Tau", "endX", "Landroidx/compose/ui/graphics/PathSegment;", "getEndX", "(Landroidx/compose/ui/graphics/PathSegment;)F", "endY", "getEndY", "startX", "getStartX", "startY", "getStartY", "clampValidRootInUnitRange", "r", "computeCubicVerticalBounds", "Landroidx/collection/FloatFloatPair;", "p0y", "p1y", "p2y", "p3y", "roots", "", "index", "", "(FFFF[FI)J", "computeHorizontalBounds", "segment", "(Landroidx/compose/ui/graphics/PathSegment;[FI)J", "computeVerticalBounds", "cubicArea", "x0", "y0", "x1", "y1", "x2", "y2", "x3", "y3", "cubicToMonotonicCubics", "cubic", "dst", "tmpRoot", "cubicWinding", "points", "x", "y", "tmpCubics", "tmpRoots", "evaluateCubic", "p1", "p2", "t", "p0", "p3", "evaluateLine", "evaluateQuadratic", "evaluateX", "evaluateY", "findCubicExtremaY", "dstRoots", "findDerivativeRoots", "horizontal", "", "findFirstCubicRoot", "findFirstLineRoot", "findFirstQuadraticRoot", "findFirstRoot", "fraction", "findLineRoot", "findQuadraticRoots", "isQuadraticMonotonic", "lineWinding", "monotonicCubicWinding", TypedValues.CycleType.S_WAVE_OFFSET, "monotonicQuadraticWinding", "quadraticToMonotonicQuadratics", "quadratic", "quadraticWinding", "tmpQuadratics", "splitCubicAt", "", "src", "srcOffset", "dstOffset", "splitQuadraticAt", "unitDivide", "writeValidRootInUnitRange", "closeTo", "b", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1010:1\n154#1:1011\n472#1:1012\n473#1:1023\n472#1:1024\n473#1:1035\n472#1:1036\n473#1:1047\n472#1:1048\n473#1:1059\n472#1:1060\n473#1:1071\n454#1:1072\n454#1:1073\n454#1:1074\n472#1:1075\n473#1:1086\n472#1:1087\n473#1:1098\n472#1:1099\n473#1:1110\n472#1:1121\n473#1:1132\n472#1:1133\n473#1:1144\n472#1:1145\n473#1:1156\n472#1:1157\n473#1:1168\n472#1:1169\n473#1:1180\n472#1:1181\n473#1:1192\n273#1:1193\n273#1:1194\n984#1:1195\n984#1:1196\n998#1:1197\n998#1:1198\n273#1:1199\n472#1:1210\n473#1:1221\n456#1:1222\n456#1:1225\n65#2,10:1013\n65#2,10:1025\n65#2,10:1037\n65#2,10:1049\n65#2,10:1061\n65#2,10:1076\n65#2,10:1088\n65#2,10:1100\n83#2,10:1111\n65#2,10:1122\n65#2,10:1134\n65#2,10:1146\n65#2,10:1158\n65#2,10:1170\n65#2,10:1182\n65#2,10:1200\n65#2,10:1211\n46#2:1223\n56#2:1224\n65#2,10:1226\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n131#1:1011\n131#1:1012\n131#1:1023\n154#1:1024\n154#1:1035\n174#1:1036\n174#1:1047\n177#1:1048\n177#1:1059\n179#1:1060\n179#1:1071\n208#1:1072\n210#1:1073\n212#1:1074\n215#1:1075\n215#1:1086\n220#1:1087\n220#1:1098\n223#1:1099\n223#1:1110\n244#1:1121\n244#1:1132\n247#1:1133\n247#1:1144\n250#1:1145\n250#1:1156\n254#1:1157\n254#1:1168\n257#1:1169\n257#1:1180\n264#1:1181\n264#1:1192\n347#1:1193\n362#1:1194\n381#1:1195\n382#1:1196\n406#1:1197\n407#1:1198\n439#1:1199\n483#1:1210\n483#1:1221\n618#1:1222\n805#1:1225\n131#1:1013,10\n154#1:1025,10\n174#1:1037,10\n177#1:1049,10\n179#1:1061,10\n215#1:1076,10\n220#1:1088,10\n223#1:1100,10\n240#1:1111,10\n244#1:1122,10\n247#1:1134,10\n250#1:1146,10\n254#1:1158,10\n257#1:1170,10\n264#1:1182,10\n472#1:1200,10\n483#1:1211,10\n783#1:1223\n786#1:1224\n845#1:1226,10\n*E\n"})
/* loaded from: classes2.dex */
public final class BezierKt {
    private static final double Epsilon = 1.0E-7d;
    private static final float FloatEpsilon = 1.05E-6f;
    private static final double Tau = 6.283185307179586d;

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
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

    private static final float clampValidRootInUnitRange(float f10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > FloatEpsilon) {
            return Float.NaN;
        }
        return f11;
    }

    public static final boolean closeTo(double d10, double d11) {
        return Math.abs(d10 - d11) < Epsilon;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeCubicVerticalBounds(float f10, float f11, float f12, float f13, float[] fArr, int i10) {
        float f14 = (f11 - f10) * 3.0f;
        float f15 = (f12 - f11) * 3.0f;
        float f16 = (f13 - f12) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f14, f15, f16, fArr, i10);
        float f17 = (f15 - f14) * 2.0f;
        int iWriteValidRootInUnitRange = iFindQuadraticRoots + writeValidRootInUnitRange((-f17) / (((f16 - f15) * 2.0f) - f17), fArr, i10 + iFindQuadraticRoots);
        float fMin = Math.min(f10, f13);
        float fMax = Math.max(f10, f13);
        for (int i11 = 0; i11 < iWriteValidRootInUnitRange; i11++) {
            float fEvaluateCubic = evaluateCubic(f10, f11, f12, f13, fArr[i11]);
            fMin = Math.min(fMin, fEvaluateCubic);
            fMax = Math.max(fMax, fEvaluateCubic);
        }
        return FloatFloatPair.m16960constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float f10, float f11, float f12, float f13, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        return computeCubicVerticalBounds(f10, f11, f12, f13, fArr, i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeHorizontalBounds(PathSegment pathSegment, float[] fArr, int i10) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, true, fArr, i10);
        float fMin = Math.min(pathSegment.getPoints()[0], getEndX(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[0], getEndX(pathSegment));
        for (int i11 = 0; i11 < iFindDerivativeRoots; i11++) {
            float fEvaluateX = evaluateX(pathSegment, fArr[i11]);
            fMin = Math.min(fMin, fEvaluateX);
            fMax = Math.max(fMax, fEvaluateX);
        }
        return FloatFloatPair.m16960constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeHorizontalBounds$default(PathSegment pathSegment, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return computeHorizontalBounds(pathSegment, fArr, i10);
    }

    public static final long computeVerticalBounds(PathSegment pathSegment, float[] fArr, int i10) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, false, fArr, i10);
        float fMin = Math.min(pathSegment.getPoints()[1], getEndY(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[1], getEndY(pathSegment));
        for (int i11 = 0; i11 < iFindDerivativeRoots; i11++) {
            float fEvaluateY = evaluateY(pathSegment, fArr[i11]);
            fMin = Math.min(fMin, fEvaluateY);
            fMax = Math.max(fMax, fEvaluateY);
        }
        return FloatFloatPair.m16960constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeVerticalBounds$default(PathSegment pathSegment, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return computeVerticalBounds(pathSegment, fArr, i10);
    }

    public static final float cubicArea(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((((((((f17 - f11) * (f12 + f14)) - ((f16 - f10) * (f13 + f15))) + (f13 * (f10 - f14))) - (f12 * (f11 - f15))) + (f17 * (f14 + (f10 / 3.0f)))) - (f16 * (f15 + (f11 / 3.0f)))) * 3.0f) / 20.0f;
    }

    private static final int cubicToMonotonicCubics(float[] fArr, float[] fArr2, float[] fArr3) {
        int iFindCubicExtremaY = findCubicExtremaY(fArr, fArr3);
        int i10 = 0;
        if (iFindCubicExtremaY == 0) {
            if (fArr2.length < 8) {
                return 0;
            }
            ArraysKt.copyInto(fArr, fArr2, 0, 0, 8);
            return iFindCubicExtremaY;
        }
        int i11 = 0;
        float f10 = 0.0f;
        while (i10 < iFindCubicExtremaY) {
            float f11 = (fArr3[i10] - f10) / (1.0f - f10);
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            f10 = f11 > 1.0f ? 1.0f : f11;
            splitCubicAt(fArr, i11, fArr2, i11, f10);
            i11 += 6;
            i10++;
            fArr = fArr2;
        }
        return iFindCubicExtremaY;
    }

    public static final int cubicWinding(float[] fArr, float f10, float f11, float[] fArr2, float[] fArr3) {
        int iCubicToMonotonicCubics = cubicToMonotonicCubics(fArr, fArr2, fArr3);
        int iMonotonicCubicWinding = 0;
        if (iCubicToMonotonicCubics >= 0) {
            int i10 = 0;
            while (true) {
                iMonotonicCubicWinding += monotonicCubicWinding(fArr2, i10 * 6, f10, f11);
                if (i10 == iCubicToMonotonicCubics) {
                    break;
                }
                i10++;
            }
        }
        return iMonotonicCubicWinding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateCubic(float f10, float f11, float f12) {
        return ((((((f10 - f11) + 0.33333334f) * f12) + (f11 - (2.0f * f10))) * f12) + f10) * 3.0f * f12;
    }

    private static final float evaluateLine(float f10, float f11, float f12) {
        return ((f11 - f10) * f12) + f10;
    }

    private static final float evaluateQuadratic(float f10, float f11, float f12, float f13) {
        return (((((f12 - (f11 * 2.0f)) + f10) * f13) + ((f11 - f10) * 2.0f)) * f13) + f10;
    }

    private static final float evaluateX(PathSegment pathSegment, float f10) {
        float[] points = pathSegment.getPoints();
        int i10 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i10 == 1) {
            return points[0];
        }
        if (i10 == 2) {
            return evaluateLine(points[0], points[2], f10);
        }
        if (i10 == 3) {
            return evaluateQuadratic(points[0], points[2], points[4], f10);
        }
        if (i10 != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[0], points[2], points[4], points[6], f10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateY(PathSegment pathSegment, float f10) {
        float[] points = pathSegment.getPoints();
        int i10 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i10 == 1) {
            return points[1];
        }
        if (i10 == 2) {
            return evaluateLine(points[1], points[3], f10);
        }
        if (i10 == 3) {
            return evaluateQuadratic(points[1], points[3], points[5], f10);
        }
        if (i10 != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[1], points[3], points[5], points[7], f10);
    }

    private static final int findCubicExtremaY(float[] fArr, float[] fArr2) {
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[5];
        return findQuadraticRoots((fArr[7] - f10) + ((f11 - f12) * 3.0f), (((f10 - f11) - f11) - f12) * 2.0f, f11 - f10, fArr2, 0);
    }

    private static final int findDerivativeRoots(PathSegment pathSegment, boolean z9, float[] fArr, int i10) {
        int i11 = !z9 ? 1 : 0;
        float[] points = pathSegment.getPoints();
        int i12 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i12 == 3) {
            float f10 = 2;
            float f11 = points[i11 + 2];
            float f12 = (f11 - points[i11]) * f10;
            return writeValidRootInUnitRange((-f12) / ((f10 * (points[i11 + 4] - f11)) - f12), fArr, i10);
        }
        if (i12 != 4) {
            return 0;
        }
        float f13 = points[i11 + 2];
        float f14 = (f13 - points[i11]) * 3.0f;
        float f15 = points[i11 + 4];
        float f16 = (f15 - f13) * 3.0f;
        float f17 = (points[i11 + 6] - f15) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f14, f16, f17, fArr, i10);
        float f18 = (f16 - f14) * 2.0f;
        return iFindQuadraticRoots + writeValidRootInUnitRange((-f18) / (((f17 - f16) * 2.0f) - f18), fArr, i10 + iFindQuadraticRoots);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstCubicRoot(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        double d10 = f10;
        double d11 = ((d10 - (f11 * 2.0d)) + f12) * 3.0d;
        double d12 = (f11 - f10) * 3.0d;
        double d13 = (-f10) + ((f11 - f12) * 3.0d) + f13;
        if (Math.abs(d13 - AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
            if (Math.abs(d11 - AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
                if (Math.abs(d12 - AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
                    return Float.NaN;
                }
                float f16 = (float) ((-d10) / d12);
                f14 = f16 >= 0.0f ? f16 : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - f16) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f15;
            }
            double dSqrt = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d14 = d11 * 2.0d;
            float f17 = (float) ((dSqrt - d12) / d14);
            float f18 = f17 < 0.0f ? 0.0f : f17;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (Math.abs(f18 - f17) > FloatEpsilon) {
                f18 = Float.NaN;
            }
            if (!Float.isNaN(f18)) {
                return f18;
            }
            float f19 = (float) (((-d12) - dSqrt) / d14);
            f14 = f19 >= 0.0f ? f19 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f19) > FloatEpsilon) {
                return Float.NaN;
            }
            return f15;
        }
        double d15 = d11 / d13;
        double d16 = d12 / d13;
        double d17 = d10 / d13;
        double d18 = ((d16 * 3.0d) - (d15 * d15)) / 9.0d;
        double d19 = (((((2.0d * d15) * d15) * d15) - ((9.0d * d15) * d16)) + (d17 * 27.0d)) / 54.0d;
        double d20 = d18 * d18 * d18;
        double d21 = (d19 * d19) + d20;
        double d22 = d15 / 3.0d;
        if (d21 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d21 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                double dSqrt2 = Math.sqrt(d21);
                float fFastCbrt = (float) ((MathHelpersKt.fastCbrt((float) ((-d19) + dSqrt2)) - MathHelpersKt.fastCbrt((float) (d19 + dSqrt2))) - d22);
                f14 = fFastCbrt >= 0.0f ? fFastCbrt : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - fFastCbrt) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f15;
            }
            float f20 = -MathHelpersKt.fastCbrt((float) d19);
            float f21 = (float) d22;
            float f22 = (2.0f * f20) - f21;
            float f23 = f22 < 0.0f ? 0.0f : f22;
            if (f23 > 1.0f) {
                f23 = 1.0f;
            }
            if (Math.abs(f23 - f22) > FloatEpsilon) {
                f23 = Float.NaN;
            }
            if (!Float.isNaN(f23)) {
                return f23;
            }
            float f24 = (-f20) - f21;
            f14 = f24 >= 0.0f ? f24 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f24) > FloatEpsilon) {
                return Float.NaN;
            }
            return f15;
        }
        double dSqrt3 = Math.sqrt(-d20);
        double d23 = (-d19) / dSqrt3;
        if (d23 < -1.0d) {
            d23 = -1.0d;
        }
        if (d23 > 1.0d) {
            d23 = 1.0d;
        }
        double dAcos = Math.acos(d23);
        double dFastCbrt = MathHelpersKt.fastCbrt((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dFastCbrt) - d22);
        float f25 = fCos < 0.0f ? 0.0f : fCos;
        if (f25 > 1.0f) {
            f25 = 1.0f;
        }
        if (Math.abs(f25 - fCos) > FloatEpsilon) {
            f25 = Float.NaN;
        }
        if (!Float.isNaN(f25)) {
            return f25;
        }
        float fCos2 = (float) ((Math.cos((Tau + dAcos) / 3.0d) * dFastCbrt) - d22);
        float f26 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f26 > 1.0f) {
            f26 = 1.0f;
        }
        if (Math.abs(f26 - fCos2) > FloatEpsilon) {
            f26 = Float.NaN;
        }
        if (!Float.isNaN(f26)) {
            return f26;
        }
        float fCos3 = (float) ((dFastCbrt * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d22);
        f14 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f15 = f14 <= 1.0f ? f14 : 1.0f;
        if (Math.abs(f15 - fCos3) > FloatEpsilon) {
            return Float.NaN;
        }
        return f15;
    }

    private static final float findFirstLineRoot(float f10, float f11) {
        float f12 = (-f10) / (f11 - f10);
        float f13 = f12 >= 0.0f ? f12 : 0.0f;
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (Math.abs(f13 - f12) > FloatEpsilon) {
            return Float.NaN;
        }
        return f13;
    }

    private static final float findFirstQuadraticRoot(float f10, float f11, float f12) {
        float f13;
        float f14;
        double d10 = f10;
        double d11 = f11;
        double d12 = f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d11 == d12) {
                return Float.NaN;
            }
            float f15 = (float) ((d13 - d12) / (d13 - (d12 * 2.0d)));
            f13 = f15 >= 0.0f ? f15 : 0.0f;
            f14 = f13 <= 1.0f ? f13 : 1.0f;
            if (Math.abs(f14 - f15) > FloatEpsilon) {
                return Float.NaN;
            }
            return f14;
        }
        double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
        double d16 = (-d10) + d11;
        float f16 = (float) ((-(d15 + d16)) / d14);
        float f17 = f16 < 0.0f ? 0.0f : f16;
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (Math.abs(f17 - f16) > FloatEpsilon) {
            f17 = Float.NaN;
        }
        if (!Float.isNaN(f17)) {
            return f17;
        }
        float f18 = (float) ((d15 - d16) / d14);
        f13 = f18 >= 0.0f ? f18 : 0.0f;
        f14 = f13 <= 1.0f ? f13 : 1.0f;
        if (Math.abs(f14 - f18) > FloatEpsilon) {
            return Float.NaN;
        }
        return f14;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstRoot(PathSegment pathSegment, float f10) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return Float.NaN;
            case 2:
                float f11 = points[0] - f10;
                float f12 = (-f11) / ((points[2] - f10) - f11);
                float f13 = f12 >= 0.0f ? f12 : 0.0f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (Math.abs(f13 - f12) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f13;
            case 3:
                return findFirstQuadraticRoot(points[0] - f10, points[2] - f10, points[4] - f10);
            case 4:
                return findFirstCubicRoot(points[0] - f10, points[2] - f10, points[4] - f10, points[6] - f10);
            case 5:
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final int findLineRoot(float f10, float f11, float[] fArr, int i10) {
        return writeValidRootInUnitRange((-f10) / (f11 - f10), fArr, i10);
    }

    public static /* synthetic */ int findLineRoot$default(float f10, float f11, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return writeValidRootInUnitRange((-f10) / (f11 - f10), fArr, i10);
    }

    private static final int findQuadraticRoots(float f10, float f11, float f12, float[] fArr, int i10) {
        double d10 = f10;
        double d11 = f11;
        double d12 = f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d11 == d12) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, i10);
        }
        double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
        double d16 = (-d10) + d11;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d15 + d16)) / d14), fArr, i10);
        int iWriteValidRootInUnitRange2 = iWriteValidRootInUnitRange + writeValidRootInUnitRange((float) ((d15 - d16) / d14), fArr, i10 + iWriteValidRootInUnitRange);
        if (iWriteValidRootInUnitRange2 <= 1) {
            return iWriteValidRootInUnitRange2;
        }
        float f13 = fArr[i10];
        int i11 = i10 + 1;
        float f14 = fArr[i11];
        if (f13 <= f14) {
            return f13 == f14 ? iWriteValidRootInUnitRange2 - 1 : iWriteValidRootInUnitRange2;
        }
        fArr[i10] = f14;
        fArr[i11] = f13;
        return iWriteValidRootInUnitRange2;
    }

    public static /* synthetic */ int findQuadraticRoots$default(float f10, float f11, float f12, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = 0;
        }
        return findQuadraticRoots(f10, f11, f12, fArr, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float getEndX(androidx.compose.p013ui.graphics.PathSegment r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.graphics.BezierKt.getEndX(androidx.compose.ui.graphics.PathSegment):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float getEndY(androidx.compose.p013ui.graphics.PathSegment r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.graphics.BezierKt.getEndY(androidx.compose.ui.graphics.PathSegment):float");
    }

    private static final float getStartX(PathSegment pathSegment) {
        return pathSegment.getPoints()[0];
    }

    private static final float getStartY(PathSegment pathSegment) {
        return pathSegment.getPoints()[1];
    }

    private static final boolean isQuadraticMonotonic(float f10, float f11, float f12) {
        return !(Math.signum(f10 - f11) + Math.signum(f11 - f12) == 0.0f);
    }

    public static final int lineWinding(float[] fArr, float f10, float f11) {
        int i10;
        float f12;
        if (fArr.length < 4) {
            return 0;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = f16 - f14;
        if (f14 > f16) {
            i10 = -1;
            f12 = f14;
        } else {
            i10 = 1;
            f12 = f16;
            f16 = f14;
        }
        if (f11 < f16 || f11 >= f12) {
            return 0;
        }
        float f18 = ((f15 - f13) * (f11 - f14)) - (f17 * (f10 - f13));
        if (f18 == 0.0f || ((int) Math.signum(f18)) == i10) {
            return 0;
        }
        return i10;
    }

    private static final int monotonicCubicWinding(float[] fArr, int i10, float f10, float f11) {
        int i11;
        int i12 = i10 + 1;
        float f12 = fArr[i12];
        int i13 = i10 + 7;
        float f13 = fArr[i13];
        if (f12 > f13) {
            i11 = -1;
            f13 = f12;
            f12 = f13;
        } else {
            i11 = 1;
        }
        if (f11 >= f12 && f11 < f13) {
            float f14 = fArr[i10];
            float f15 = fArr[i10 + 2];
            float f16 = fArr[i10 + 4];
            float f17 = fArr[i10 + 6];
            if (f10 < Math.min(f14, Math.min(f15, Math.min(f16, f17)))) {
                return 0;
            }
            if (f10 <= Math.max(f14, Math.max(f15, Math.max(f16, f17)))) {
                float f18 = fArr[i12];
                float f19 = fArr[i10 + 3];
                float f20 = fArr[i10 + 5];
                float f21 = fArr[i13];
                float fFindFirstCubicRoot = findFirstCubicRoot(f18 - f11, f19 - f11, f20 - f11, f21 - f11);
                if (Float.isNaN(fFindFirstCubicRoot)) {
                    return 0;
                }
                float fEvaluateCubic = evaluateCubic(f14, f15, f16, f17, fFindFirstCubicRoot);
                if ((Math.abs(fEvaluateCubic - f10) >= FloatEpsilon || (f10 == f17 && f11 == f21)) && fEvaluateCubic < f10) {
                }
            }
            return i11;
        }
        return 0;
    }

    private static final int monotonicQuadraticWinding(float[] fArr, int i10, float f10, float f11, float[] fArr2) {
        int i11;
        float f12;
        float f13;
        float f14 = fArr[i10 + 1];
        float f15 = fArr[i10 + 5];
        if (f14 > f15) {
            i11 = -1;
            f13 = f14;
            f12 = f15;
        } else {
            i11 = 1;
            f12 = f14;
            f13 = f15;
        }
        if (f11 >= f12 && f11 < f13) {
            float f16 = fArr[i10 + 3];
            float fEvaluateQuadratic = findQuadraticRoots$default((f14 - (f16 * 2.0f)) + f15, (f16 - f14) * 2.0f, f14 - f11, fArr2, 0, 16, null) == 0 ? fArr[(1 - i11) * 2] : evaluateQuadratic(fArr[0], fArr[2], fArr[4], fArr2[0]);
            if ((Math.abs(fEvaluateQuadratic - f10) >= FloatEpsilon || (f10 == fArr[4] && f11 == f15)) && fEvaluateQuadratic < f10) {
                return i11;
            }
        }
        return 0;
    }

    private static final int quadraticToMonotonicQuadratics(float[] fArr, float[] fArr2) {
        if (fArr.length < 6 || fArr2.length < 6) {
            return 0;
        }
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[5];
        if (!isQuadraticMonotonic(f10, f11, f12)) {
            float f13 = f10 - f11;
            float fUnitDivide = unitDivide(f13, (f13 - f11) + f12);
            if (!Float.isNaN(fUnitDivide)) {
                splitQuadraticAt(fArr, fArr2, fUnitDivide);
                return 1;
            }
            if (Math.abs(f13) >= Math.abs(f11 - f12)) {
                f10 = f12;
            }
            f11 = f10;
        }
        ArraysKt.copyInto(fArr, fArr2, 0, 0, 6);
        fArr2[3] = f11;
        return 0;
    }

    public static final int quadraticWinding(float[] fArr, float f10, float f11, float[] fArr2, float[] fArr3) {
        if (isQuadraticMonotonic(fArr[1], fArr[3], fArr[5])) {
            return monotonicQuadraticWinding(fArr, 0, f10, f11, fArr3);
        }
        int iQuadraticToMonotonicQuadratics = quadraticToMonotonicQuadratics(fArr, fArr2);
        int iMonotonicQuadraticWinding = monotonicQuadraticWinding(fArr2, 0, f10, f11, fArr3);
        return iQuadraticToMonotonicQuadratics > 0 ? iMonotonicQuadraticWinding + monotonicQuadraticWinding(fArr2, 4, f10, f11, fArr3) : iMonotonicQuadraticWinding;
    }

    private static final void splitCubicAt(float[] fArr, int i10, float[] fArr2, int i11, float f10) {
        if (fArr.length >= i10 + 8 && fArr2.length >= i11 + 14) {
            if (f10 >= 1.0f) {
                ArraysKt.copyInto(fArr, fArr2, i11, i10, 8);
                float f11 = fArr[i10 + 6];
                float f12 = fArr[i10 + 7];
                fArr2[i11 + 8] = f11;
                fArr2[i11 + 9] = f12;
                fArr2[i11 + 10] = f11;
                fArr2[i11 + 11] = f12;
                fArr2[i11 + 12] = f11;
                fArr2[i11 + 13] = f12;
                return;
            }
            float f13 = fArr[i10];
            float f14 = fArr[i10 + 1];
            fArr2[i11] = f13;
            fArr2[i11 + 1] = f14;
            float f15 = fArr[i10 + 2];
            float f16 = fArr[i10 + 3];
            float fLerp = MathHelpersKt.lerp(f13, f15, f10);
            float fLerp2 = MathHelpersKt.lerp(f14, f16, f10);
            fArr2[i11 + 2] = fLerp;
            fArr2[i11 + 3] = fLerp2;
            float f17 = fArr[i10 + 4];
            float f18 = fArr[i10 + 5];
            float fLerp3 = MathHelpersKt.lerp(f15, f17, f10);
            float fLerp4 = MathHelpersKt.lerp(f16, f18, f10);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f10);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f10);
            fArr2[i11 + 4] = fLerp5;
            fArr2[i11 + 5] = fLerp6;
            float f19 = fArr[i10 + 6];
            float f20 = fArr[i10 + 7];
            float fLerp7 = MathHelpersKt.lerp(f17, f19, f10);
            float fLerp8 = MathHelpersKt.lerp(f18, f20, f10);
            float fLerp9 = MathHelpersKt.lerp(fLerp3, fLerp7, f10);
            float fLerp10 = MathHelpersKt.lerp(fLerp4, fLerp8, f10);
            float fLerp11 = MathHelpersKt.lerp(fLerp5, fLerp9, f10);
            float fLerp12 = MathHelpersKt.lerp(fLerp6, fLerp10, f10);
            fArr2[i11 + 6] = fLerp11;
            fArr2[i11 + 7] = fLerp12;
            fArr2[i11 + 8] = fLerp9;
            fArr2[i11 + 9] = fLerp10;
            fArr2[i11 + 10] = fLerp7;
            fArr2[i11 + 11] = fLerp8;
            fArr2[i11 + 12] = f19;
            fArr2[i11 + 13] = f20;
        }
    }

    private static final void splitQuadraticAt(float[] fArr, float[] fArr2, float f10) {
        if (fArr.length >= 6 && fArr2.length >= 10) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            float fLerp = MathHelpersKt.lerp(f11, f13, f10);
            float fLerp2 = MathHelpersKt.lerp(f12, f14, f10);
            fArr2[0] = f11;
            fArr2[1] = f12;
            fArr2[2] = fLerp;
            fArr2[3] = fLerp2;
            float fLerp3 = MathHelpersKt.lerp(f13, f15, f10);
            float fLerp4 = MathHelpersKt.lerp(f14, f16, f10);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f10);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f10);
            fArr2[4] = fLerp5;
            fArr2[5] = fLerp6;
            fArr2[6] = fLerp3;
            fArr2[7] = fLerp4;
            fArr2[8] = f15;
            fArr2[9] = f16;
        }
    }

    private static final float unitDivide(float f10, float f11) {
        if (f10 < 0.0f) {
            f10 = -f10;
            f11 = -f11;
        }
        if (f11 == 0.0f || f10 == 0.0f || f10 >= f11) {
            return Float.NaN;
        }
        float f12 = f10 / f11;
        if (f12 == 0.0f) {
            return Float.NaN;
        }
        return f12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int writeValidRootInUnitRange(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > FloatEpsilon) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public static final boolean closeTo(float f10, float f11) {
        return Math.abs(f10 - f11) < FloatEpsilon;
    }

    private static final float evaluateCubic(float f10, float f11, float f12, float f13, float f14) {
        float f15 = (f13 + ((f11 - f12) * 3.0f)) - f10;
        return (((((f15 * f14) + (((f12 - (2.0f * f11)) + f10) * 3.0f)) * f14) + ((f11 - f10) * 3.0f)) * f14) + f10;
    }
}

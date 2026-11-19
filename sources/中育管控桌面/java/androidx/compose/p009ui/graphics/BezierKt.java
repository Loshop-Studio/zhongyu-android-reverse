package androidx.compose.p009ui.graphics;

import androidx.annotation.RestrictTo;
import androidx.collection.FloatFloatPair;
import androidx.compose.p009ui.graphics.PathSegment;
import androidx.compose.p009ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0082\b\u001a?\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001e\u001a'\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\u0010\u001e\u001aH\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0000\u001a \u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0018H\u0002\u001a0\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0018H\u0000\u001a \u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0007\u001a0\u00103\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u001a \u00109\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u001a(\u0010:\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0003H\u0002\u001a\u0018\u0010;\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0003H\u0002\u001a\u0018\u0010<\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0003H\u0007\u001a\u0018\u0010=\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u0018H\u0002\u001a(\u0010?\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u001a(\u0010B\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H\u0007\u001a\u0019\u0010C\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003H\u0082\b\u001a \u0010D\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003H\u0002\u001a\u0018\u0010E\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0003H\u0007\u001a+\u0010G\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0082\b\u001a2\u0010H\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002\u001a \u0010I\u001a\u00020A2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002\u001a \u0010J\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0000\u001a(\u0010K\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0002\u001a0\u0010M\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0018H\u0002\u001a\u0018\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0002\u001a0\u0010P\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0018H\u0000\u001a0\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010U\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010V\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u0003H\u0002\u001a \u0010W\u001a\u00020S2\u0006\u0010T\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0003H\u0002\u001a\u0018\u0010X\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0002\u001a \u0010Y\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u001a\u0015\u0010Z\u001a\u00020A*\u00020\u00012\u0006\u0010[\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010Z\u001a\u00020A*\u00020\u00032\u0006\u0010[\u001a\u00020\u0003H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0005\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0003*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\"\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b\"\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\\"}, m7880d2 = {"Epsilon", "", "FloatEpsilon", "", "Tau", "endX", "Landroidx/compose/ui/graphics/PathSegment;", "getEndX", "(Landroidx/compose/ui/graphics/PathSegment;)F", "endY", "getEndY", "startX", "getStartX", "startY", "getStartY", "clampValidRootInUnitRange", "r", "computeCubicVerticalBounds", "Landroidx/collection/FloatFloatPair;", "p0y", "p1y", "p2y", "p3y", "roots", "", "index", "", "(FFFF[FI)J", "computeHorizontalBounds", "segment", "(Landroidx/compose/ui/graphics/PathSegment;[FI)J", "computeVerticalBounds", "cubicArea", "x0", "y0", "x1", "y1", "x2", "y2", "x3", "y3", "cubicToMonotonicCubics", "cubic", "dst", "tmpRoot", "cubicWinding", "points", "x", "y", "tmpCubics", "tmpRoots", "evaluateCubic", "p1", "p2", "t", "p0", "p3", "evaluateLine", "evaluateQuadratic", "evaluateX", "evaluateY", "findCubicExtremaY", "dstRoots", "findDerivativeRoots", "horizontal", "", "findFirstCubicRoot", "findFirstLineRoot", "findFirstQuadraticRoot", "findFirstRoot", "fraction", "findLineRoot", "findQuadraticRoots", "isQuadraticMonotonic", "lineWinding", "monotonicCubicWinding", TypedValues.CycleType.S_WAVE_OFFSET, "monotonicQuadraticWinding", "quadraticToMonotonicQuadratics", "quadratic", "quadraticWinding", "tmpQuadratics", "splitCubicAt", "", "src", "srcOffset", "dstOffset", "splitQuadraticAt", "unitDivide", "writeValidRootInUnitRange", "closeTo", "b", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1010:1\n154#1:1011\n472#1:1012\n473#1:1023\n472#1:1024\n473#1:1035\n472#1:1036\n473#1:1047\n472#1:1048\n473#1:1059\n472#1:1060\n473#1:1071\n454#1:1072\n454#1:1073\n454#1:1074\n472#1:1075\n473#1:1086\n472#1:1087\n473#1:1098\n472#1:1099\n473#1:1110\n472#1:1121\n473#1:1132\n472#1:1133\n473#1:1144\n472#1:1145\n473#1:1156\n472#1:1157\n473#1:1168\n472#1:1169\n473#1:1180\n472#1:1181\n473#1:1192\n273#1:1193\n273#1:1194\n984#1:1195\n984#1:1196\n998#1:1197\n998#1:1198\n273#1:1199\n472#1:1210\n473#1:1221\n456#1:1222\n456#1:1225\n65#2,10:1013\n65#2,10:1025\n65#2,10:1037\n65#2,10:1049\n65#2,10:1061\n65#2,10:1076\n65#2,10:1088\n65#2,10:1100\n83#2,10:1111\n65#2,10:1122\n65#2,10:1134\n65#2,10:1146\n65#2,10:1158\n65#2,10:1170\n65#2,10:1182\n65#2,10:1200\n65#2,10:1211\n46#2:1223\n56#2:1224\n65#2,10:1226\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n131#1:1011\n131#1:1012\n131#1:1023\n154#1:1024\n154#1:1035\n174#1:1036\n174#1:1047\n177#1:1048\n177#1:1059\n179#1:1060\n179#1:1071\n208#1:1072\n210#1:1073\n212#1:1074\n215#1:1075\n215#1:1086\n220#1:1087\n220#1:1098\n223#1:1099\n223#1:1110\n244#1:1121\n244#1:1132\n247#1:1133\n247#1:1144\n250#1:1145\n250#1:1156\n254#1:1157\n254#1:1168\n257#1:1169\n257#1:1180\n264#1:1181\n264#1:1192\n347#1:1193\n362#1:1194\n381#1:1195\n382#1:1196\n406#1:1197\n407#1:1198\n439#1:1199\n483#1:1210\n483#1:1221\n618#1:1222\n805#1:1225\n131#1:1013,10\n154#1:1025,10\n174#1:1037,10\n177#1:1049,10\n179#1:1061,10\n215#1:1076,10\n220#1:1088,10\n223#1:1100,10\n240#1:1111,10\n244#1:1122,10\n247#1:1134,10\n250#1:1146,10\n254#1:1158,10\n257#1:1170,10\n264#1:1182,10\n472#1:1200,10\n483#1:1211,10\n783#1:1223\n786#1:1224\n845#1:1226,10\n*E\n"})
/* loaded from: classes2.dex */
public final class BezierKt {
    private static final double Epsilon = 1.0E-7d;
    private static final float FloatEpsilon = 1.05E-6f;
    private static final double Tau = 6.283185307179586d;

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
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

    private static final float clampValidRootInUnitRange(float f6) {
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (Math.abs(f7 - f6) > FloatEpsilon) {
            return Float.NaN;
        }
        return f7;
    }

    public static final boolean closeTo(double d6, double d7) {
        return Math.abs(d6 - d7) < Epsilon;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeCubicVerticalBounds(float f6, float f7, float f8, float f9, float[] fArr, int i6) {
        float f10 = (f7 - f6) * 3.0f;
        float f11 = (f8 - f7) * 3.0f;
        float f12 = (f9 - f8) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f10, f11, f12, fArr, i6);
        float f13 = (f11 - f10) * 2.0f;
        int iWriteValidRootInUnitRange = iFindQuadraticRoots + writeValidRootInUnitRange((-f13) / (((f12 - f11) * 2.0f) - f13), fArr, i6 + iFindQuadraticRoots);
        float fMin = Math.min(f6, f9);
        float fMax = Math.max(f6, f9);
        for (int i7 = 0; i7 < iWriteValidRootInUnitRange; i7++) {
            float fEvaluateCubic = evaluateCubic(f6, f7, f8, f9, fArr[i7]);
            fMin = Math.min(fMin, fEvaluateCubic);
            fMax = Math.max(fMax, fEvaluateCubic);
        }
        return FloatFloatPair.m9883constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float f6, float f7, float f8, float f9, float[] fArr, int i6, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        return computeCubicVerticalBounds(f6, f7, f8, f9, fArr, i6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeHorizontalBounds(PathSegment pathSegment, float[] fArr, int i6) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, true, fArr, i6);
        float fMin = Math.min(pathSegment.getPoints()[0], getEndX(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[0], getEndX(pathSegment));
        for (int i7 = 0; i7 < iFindDerivativeRoots; i7++) {
            float fEvaluateX = evaluateX(pathSegment, fArr[i7]);
            fMin = Math.min(fMin, fEvaluateX);
            fMax = Math.max(fMax, fEvaluateX);
        }
        return FloatFloatPair.m9883constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeHorizontalBounds$default(PathSegment pathSegment, float[] fArr, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i6 = 0;
        }
        return computeHorizontalBounds(pathSegment, fArr, i6);
    }

    public static final long computeVerticalBounds(PathSegment pathSegment, float[] fArr, int i6) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, false, fArr, i6);
        float fMin = Math.min(pathSegment.getPoints()[1], getEndY(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[1], getEndY(pathSegment));
        for (int i7 = 0; i7 < iFindDerivativeRoots; i7++) {
            float fEvaluateY = evaluateY(pathSegment, fArr[i7]);
            fMin = Math.min(fMin, fEvaluateY);
            fMax = Math.max(fMax, fEvaluateY);
        }
        return FloatFloatPair.m9883constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeVerticalBounds$default(PathSegment pathSegment, float[] fArr, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i6 = 0;
        }
        return computeVerticalBounds(pathSegment, fArr, i6);
    }

    public static final float cubicArea(float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        return ((((((((f13 - f7) * (f8 + f10)) - ((f12 - f6) * (f9 + f11))) + (f9 * (f6 - f10))) - (f8 * (f7 - f11))) + (f13 * (f10 + (f6 / 3.0f)))) - (f12 * (f11 + (f7 / 3.0f)))) * 3.0f) / 20.0f;
    }

    private static final int cubicToMonotonicCubics(float[] fArr, float[] fArr2, float[] fArr3) {
        int iFindCubicExtremaY = findCubicExtremaY(fArr, fArr3);
        int i6 = 0;
        if (iFindCubicExtremaY == 0) {
            if (fArr2.length < 8) {
                return 0;
            }
            ArraysKt.copyInto(fArr, fArr2, 0, 0, 8);
            return iFindCubicExtremaY;
        }
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < iFindCubicExtremaY) {
            float f7 = (fArr3[i6] - f6) / (1.0f - f6);
            if (f7 < 0.0f) {
                f7 = 0.0f;
            }
            f6 = f7 > 1.0f ? 1.0f : f7;
            splitCubicAt(fArr, i7, fArr2, i7, f6);
            i7 += 6;
            i6++;
            fArr = fArr2;
        }
        return iFindCubicExtremaY;
    }

    public static final int cubicWinding(float[] fArr, float f6, float f7, float[] fArr2, float[] fArr3) {
        int iCubicToMonotonicCubics = cubicToMonotonicCubics(fArr, fArr2, fArr3);
        int iMonotonicCubicWinding = 0;
        if (iCubicToMonotonicCubics >= 0) {
            int i6 = 0;
            while (true) {
                iMonotonicCubicWinding += monotonicCubicWinding(fArr2, i6 * 6, f6, f7);
                if (i6 == iCubicToMonotonicCubics) {
                    break;
                }
                i6++;
            }
        }
        return iMonotonicCubicWinding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateCubic(float f6, float f7, float f8) {
        return ((((((f6 - f7) + 0.33333334f) * f8) + (f7 - (2.0f * f6))) * f8) + f6) * 3.0f * f8;
    }

    private static final float evaluateLine(float f6, float f7, float f8) {
        return ((f7 - f6) * f8) + f6;
    }

    private static final float evaluateQuadratic(float f6, float f7, float f8, float f9) {
        return (((((f8 - (f7 * 2.0f)) + f6) * f9) + ((f7 - f6) * 2.0f)) * f9) + f6;
    }

    private static final float evaluateX(PathSegment pathSegment, float f6) {
        float[] points = pathSegment.getPoints();
        int i6 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i6 == 1) {
            return points[0];
        }
        if (i6 == 2) {
            return evaluateLine(points[0], points[2], f6);
        }
        if (i6 == 3) {
            return evaluateQuadratic(points[0], points[2], points[4], f6);
        }
        if (i6 != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[0], points[2], points[4], points[6], f6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateY(PathSegment pathSegment, float f6) {
        float[] points = pathSegment.getPoints();
        int i6 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i6 == 1) {
            return points[1];
        }
        if (i6 == 2) {
            return evaluateLine(points[1], points[3], f6);
        }
        if (i6 == 3) {
            return evaluateQuadratic(points[1], points[3], points[5], f6);
        }
        if (i6 != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[1], points[3], points[5], points[7], f6);
    }

    private static final int findCubicExtremaY(float[] fArr, float[] fArr2) {
        float f6 = fArr[1];
        float f7 = fArr[3];
        float f8 = fArr[5];
        return findQuadraticRoots((fArr[7] - f6) + ((f7 - f8) * 3.0f), (((f6 - f7) - f7) - f8) * 2.0f, f7 - f6, fArr2, 0);
    }

    private static final int findDerivativeRoots(PathSegment pathSegment, boolean z6, float[] fArr, int i6) {
        int i7 = !z6 ? 1 : 0;
        float[] points = pathSegment.getPoints();
        int i8 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i8 == 3) {
            float f6 = 2;
            float f7 = points[i7 + 2];
            float f8 = (f7 - points[i7]) * f6;
            return writeValidRootInUnitRange((-f8) / ((f6 * (points[i7 + 4] - f7)) - f8), fArr, i6);
        }
        if (i8 != 4) {
            return 0;
        }
        float f9 = points[i7 + 2];
        float f10 = (f9 - points[i7]) * 3.0f;
        float f11 = points[i7 + 4];
        float f12 = (f11 - f9) * 3.0f;
        float f13 = (points[i7 + 6] - f11) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f10, f12, f13, fArr, i6);
        float f14 = (f12 - f10) * 2.0f;
        return iFindQuadraticRoots + writeValidRootInUnitRange((-f14) / (((f13 - f12) * 2.0f) - f14), fArr, i6 + iFindQuadraticRoots);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstCubicRoot(float f6, float f7, float f8, float f9) {
        float f10;
        float f11;
        double d6 = f6;
        double d7 = ((d6 - (f7 * 2.0d)) + f8) * 3.0d;
        double d8 = (f7 - f6) * 3.0d;
        double d9 = (-f6) + ((f7 - f8) * 3.0d) + f9;
        if (Math.abs(d9 - 0.0d) < Epsilon) {
            if (Math.abs(d7 - 0.0d) < Epsilon) {
                if (Math.abs(d8 - 0.0d) < Epsilon) {
                    return Float.NaN;
                }
                float f12 = (float) ((-d6) / d8);
                f10 = f12 >= 0.0f ? f12 : 0.0f;
                f11 = f10 <= 1.0f ? f10 : 1.0f;
                if (Math.abs(f11 - f12) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f11;
            }
            double dSqrt = Math.sqrt((d8 * d8) - ((4.0d * d7) * d6));
            double d10 = d7 * 2.0d;
            float f13 = (float) ((dSqrt - d8) / d10);
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
            float f15 = (float) (((-d8) - dSqrt) / d10);
            f10 = f15 >= 0.0f ? f15 : 0.0f;
            f11 = f10 <= 1.0f ? f10 : 1.0f;
            if (Math.abs(f11 - f15) > FloatEpsilon) {
                return Float.NaN;
            }
            return f11;
        }
        double d11 = d7 / d9;
        double d12 = d8 / d9;
        double d13 = d6 / d9;
        double d14 = ((d12 * 3.0d) - (d11 * d11)) / 9.0d;
        double d15 = (((((2.0d * d11) * d11) * d11) - ((9.0d * d11) * d12)) + (d13 * 27.0d)) / 54.0d;
        double d16 = d14 * d14 * d14;
        double d17 = (d15 * d15) + d16;
        double d18 = d11 / 3.0d;
        if (d17 >= 0.0d) {
            if (d17 != 0.0d) {
                double dSqrt2 = Math.sqrt(d17);
                float fFastCbrt = (float) ((MathHelpersKt.fastCbrt((float) ((-d15) + dSqrt2)) - MathHelpersKt.fastCbrt((float) (d15 + dSqrt2))) - d18);
                f10 = fFastCbrt >= 0.0f ? fFastCbrt : 0.0f;
                f11 = f10 <= 1.0f ? f10 : 1.0f;
                if (Math.abs(f11 - fFastCbrt) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f11;
            }
            float f16 = -MathHelpersKt.fastCbrt((float) d15);
            float f17 = (float) d18;
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
        double dSqrt3 = Math.sqrt(-d16);
        double d19 = (-d15) / dSqrt3;
        if (d19 < -1.0d) {
            d19 = -1.0d;
        }
        if (d19 > 1.0d) {
            d19 = 1.0d;
        }
        double dAcos = Math.acos(d19);
        double dFastCbrt = MathHelpersKt.fastCbrt((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dFastCbrt) - d18);
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
        float fCos2 = (float) ((Math.cos((Tau + dAcos) / 3.0d) * dFastCbrt) - d18);
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
        float fCos3 = (float) ((dFastCbrt * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d18);
        f10 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f11 = f10 <= 1.0f ? f10 : 1.0f;
        if (Math.abs(f11 - fCos3) > FloatEpsilon) {
            return Float.NaN;
        }
        return f11;
    }

    private static final float findFirstLineRoot(float f6, float f7) {
        float f8 = (-f6) / (f7 - f6);
        float f9 = f8 >= 0.0f ? f8 : 0.0f;
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (Math.abs(f9 - f8) > FloatEpsilon) {
            return Float.NaN;
        }
        return f9;
    }

    private static final float findFirstQuadraticRoot(float f6, float f7, float f8) {
        float f9;
        float f10;
        double d6 = f6;
        double d7 = f7;
        double d8 = f8;
        double d9 = d7 * 2.0d;
        double d10 = (d6 - d9) + d8;
        if (d10 == 0.0d) {
            if (d7 == d8) {
                return Float.NaN;
            }
            float f11 = (float) ((d9 - d8) / (d9 - (d8 * 2.0d)));
            f9 = f11 >= 0.0f ? f11 : 0.0f;
            f10 = f9 <= 1.0f ? f9 : 1.0f;
            if (Math.abs(f10 - f11) > FloatEpsilon) {
                return Float.NaN;
            }
            return f10;
        }
        double d11 = -Math.sqrt((d7 * d7) - (d8 * d6));
        double d12 = (-d6) + d7;
        float f12 = (float) ((-(d11 + d12)) / d10);
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
        float f14 = (float) ((d11 - d12) / d10);
        f9 = f14 >= 0.0f ? f14 : 0.0f;
        f10 = f9 <= 1.0f ? f9 : 1.0f;
        if (Math.abs(f10 - f14) > FloatEpsilon) {
            return Float.NaN;
        }
        return f10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstRoot(PathSegment pathSegment, float f6) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return Float.NaN;
            case 2:
                float f7 = points[0] - f6;
                float f8 = (-f7) / ((points[2] - f6) - f7);
                float f9 = f8 >= 0.0f ? f8 : 0.0f;
                if (f9 > 1.0f) {
                    f9 = 1.0f;
                }
                if (Math.abs(f9 - f8) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f9;
            case 3:
                return findFirstQuadraticRoot(points[0] - f6, points[2] - f6, points[4] - f6);
            case 4:
                return findFirstCubicRoot(points[0] - f6, points[2] - f6, points[4] - f6, points[6] - f6);
            case 5:
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final int findLineRoot(float f6, float f7, float[] fArr, int i6) {
        return writeValidRootInUnitRange((-f6) / (f7 - f6), fArr, i6);
    }

    public static /* synthetic */ int findLineRoot$default(float f6, float f7, float[] fArr, int i6, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            i6 = 0;
        }
        return writeValidRootInUnitRange((-f6) / (f7 - f6), fArr, i6);
    }

    private static final int findQuadraticRoots(float f6, float f7, float f8, float[] fArr, int i6) {
        double d6 = f6;
        double d7 = f7;
        double d8 = f8;
        double d9 = d7 * 2.0d;
        double d10 = (d6 - d9) + d8;
        if (d10 == 0.0d) {
            if (d7 == d8) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d9 - d8) / (d9 - (d8 * 2.0d))), fArr, i6);
        }
        double d11 = -Math.sqrt((d7 * d7) - (d8 * d6));
        double d12 = (-d6) + d7;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d11 + d12)) / d10), fArr, i6);
        int iWriteValidRootInUnitRange2 = iWriteValidRootInUnitRange + writeValidRootInUnitRange((float) ((d11 - d12) / d10), fArr, i6 + iWriteValidRootInUnitRange);
        if (iWriteValidRootInUnitRange2 <= 1) {
            return iWriteValidRootInUnitRange2;
        }
        float f9 = fArr[i6];
        int i7 = i6 + 1;
        float f10 = fArr[i7];
        if (f9 <= f10) {
            return f9 == f10 ? iWriteValidRootInUnitRange2 - 1 : iWriteValidRootInUnitRange2;
        }
        fArr[i6] = f10;
        fArr[i7] = f9;
        return iWriteValidRootInUnitRange2;
    }

    public static /* synthetic */ int findQuadraticRoots$default(float f6, float f7, float f8, float[] fArr, int i6, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            i6 = 0;
        }
        return findQuadraticRoots(f6, f7, f8, fArr, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float getEndX(androidx.compose.p009ui.graphics.PathSegment r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p009ui.graphics.BezierKt.getEndX(androidx.compose.ui.graphics.PathSegment):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float getEndY(androidx.compose.p009ui.graphics.PathSegment r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p009ui.graphics.BezierKt.getEndY(androidx.compose.ui.graphics.PathSegment):float");
    }

    private static final float getStartX(PathSegment pathSegment) {
        return pathSegment.getPoints()[0];
    }

    private static final float getStartY(PathSegment pathSegment) {
        return pathSegment.getPoints()[1];
    }

    private static final boolean isQuadraticMonotonic(float f6, float f7, float f8) {
        return !(Math.signum(f6 - f7) + Math.signum(f7 - f8) == 0.0f);
    }

    public static final int lineWinding(float[] fArr, float f6, float f7) {
        int i6;
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
            i6 = -1;
            f8 = f10;
        } else {
            i6 = 1;
            f8 = f12;
            f12 = f10;
        }
        if (f7 < f12 || f7 >= f8) {
            return 0;
        }
        float f14 = ((f11 - f9) * (f7 - f10)) - (f13 * (f6 - f9));
        if (f14 == 0.0f || ((int) Math.signum(f14)) == i6) {
            return 0;
        }
        return i6;
    }

    private static final int monotonicCubicWinding(float[] fArr, int i6, float f6, float f7) {
        int i7;
        int i8 = i6 + 1;
        float f8 = fArr[i8];
        int i9 = i6 + 7;
        float f9 = fArr[i9];
        if (f8 > f9) {
            i7 = -1;
            f9 = f8;
            f8 = f9;
        } else {
            i7 = 1;
        }
        if (f7 >= f8 && f7 < f9) {
            float f10 = fArr[i6];
            float f11 = fArr[i6 + 2];
            float f12 = fArr[i6 + 4];
            float f13 = fArr[i6 + 6];
            if (f6 < Math.min(f10, Math.min(f11, Math.min(f12, f13)))) {
                return 0;
            }
            if (f6 <= Math.max(f10, Math.max(f11, Math.max(f12, f13)))) {
                float f14 = fArr[i8];
                float f15 = fArr[i6 + 3];
                float f16 = fArr[i6 + 5];
                float f17 = fArr[i9];
                float fFindFirstCubicRoot = findFirstCubicRoot(f14 - f7, f15 - f7, f16 - f7, f17 - f7);
                if (Float.isNaN(fFindFirstCubicRoot)) {
                    return 0;
                }
                float fEvaluateCubic = evaluateCubic(f10, f11, f12, f13, fFindFirstCubicRoot);
                if ((Math.abs(fEvaluateCubic - f6) >= FloatEpsilon || (f6 == f13 && f7 == f17)) && fEvaluateCubic < f6) {
                }
            }
            return i7;
        }
        return 0;
    }

    private static final int monotonicQuadraticWinding(float[] fArr, int i6, float f6, float f7, float[] fArr2) {
        int i7;
        float f8;
        float f9;
        float f10 = fArr[i6 + 1];
        float f11 = fArr[i6 + 5];
        if (f10 > f11) {
            i7 = -1;
            f9 = f10;
            f8 = f11;
        } else {
            i7 = 1;
            f8 = f10;
            f9 = f11;
        }
        if (f7 >= f8 && f7 < f9) {
            float f12 = fArr[i6 + 3];
            float fEvaluateQuadratic = findQuadraticRoots$default((f10 - (f12 * 2.0f)) + f11, (f12 - f10) * 2.0f, f10 - f7, fArr2, 0, 16, null) == 0 ? fArr[(1 - i7) * 2] : evaluateQuadratic(fArr[0], fArr[2], fArr[4], fArr2[0]);
            if ((Math.abs(fEvaluateQuadratic - f6) >= FloatEpsilon || (f6 == fArr[4] && f7 == f11)) && fEvaluateQuadratic < f6) {
                return i7;
            }
        }
        return 0;
    }

    private static final int quadraticToMonotonicQuadratics(float[] fArr, float[] fArr2) {
        if (fArr.length < 6 || fArr2.length < 6) {
            return 0;
        }
        float f6 = fArr[1];
        float f7 = fArr[3];
        float f8 = fArr[5];
        if (!isQuadraticMonotonic(f6, f7, f8)) {
            float f9 = f6 - f7;
            float fUnitDivide = unitDivide(f9, (f9 - f7) + f8);
            if (!Float.isNaN(fUnitDivide)) {
                splitQuadraticAt(fArr, fArr2, fUnitDivide);
                return 1;
            }
            if (Math.abs(f9) >= Math.abs(f7 - f8)) {
                f6 = f8;
            }
            f7 = f6;
        }
        ArraysKt.copyInto(fArr, fArr2, 0, 0, 6);
        fArr2[3] = f7;
        return 0;
    }

    public static final int quadraticWinding(float[] fArr, float f6, float f7, float[] fArr2, float[] fArr3) {
        if (isQuadraticMonotonic(fArr[1], fArr[3], fArr[5])) {
            return monotonicQuadraticWinding(fArr, 0, f6, f7, fArr3);
        }
        int iQuadraticToMonotonicQuadratics = quadraticToMonotonicQuadratics(fArr, fArr2);
        int iMonotonicQuadraticWinding = monotonicQuadraticWinding(fArr2, 0, f6, f7, fArr3);
        return iQuadraticToMonotonicQuadratics > 0 ? iMonotonicQuadraticWinding + monotonicQuadraticWinding(fArr2, 4, f6, f7, fArr3) : iMonotonicQuadraticWinding;
    }

    private static final void splitCubicAt(float[] fArr, int i6, float[] fArr2, int i7, float f6) {
        if (fArr.length >= i6 + 8 && fArr2.length >= i7 + 14) {
            if (f6 >= 1.0f) {
                ArraysKt.copyInto(fArr, fArr2, i7, i6, 8);
                float f7 = fArr[i6 + 6];
                float f8 = fArr[i6 + 7];
                fArr2[i7 + 8] = f7;
                fArr2[i7 + 9] = f8;
                fArr2[i7 + 10] = f7;
                fArr2[i7 + 11] = f8;
                fArr2[i7 + 12] = f7;
                fArr2[i7 + 13] = f8;
                return;
            }
            float f9 = fArr[i6];
            float f10 = fArr[i6 + 1];
            fArr2[i7] = f9;
            fArr2[i7 + 1] = f10;
            float f11 = fArr[i6 + 2];
            float f12 = fArr[i6 + 3];
            float fLerp = MathHelpersKt.lerp(f9, f11, f6);
            float fLerp2 = MathHelpersKt.lerp(f10, f12, f6);
            fArr2[i7 + 2] = fLerp;
            fArr2[i7 + 3] = fLerp2;
            float f13 = fArr[i6 + 4];
            float f14 = fArr[i6 + 5];
            float fLerp3 = MathHelpersKt.lerp(f11, f13, f6);
            float fLerp4 = MathHelpersKt.lerp(f12, f14, f6);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f6);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f6);
            fArr2[i7 + 4] = fLerp5;
            fArr2[i7 + 5] = fLerp6;
            float f15 = fArr[i6 + 6];
            float f16 = fArr[i6 + 7];
            float fLerp7 = MathHelpersKt.lerp(f13, f15, f6);
            float fLerp8 = MathHelpersKt.lerp(f14, f16, f6);
            float fLerp9 = MathHelpersKt.lerp(fLerp3, fLerp7, f6);
            float fLerp10 = MathHelpersKt.lerp(fLerp4, fLerp8, f6);
            float fLerp11 = MathHelpersKt.lerp(fLerp5, fLerp9, f6);
            float fLerp12 = MathHelpersKt.lerp(fLerp6, fLerp10, f6);
            fArr2[i7 + 6] = fLerp11;
            fArr2[i7 + 7] = fLerp12;
            fArr2[i7 + 8] = fLerp9;
            fArr2[i7 + 9] = fLerp10;
            fArr2[i7 + 10] = fLerp7;
            fArr2[i7 + 11] = fLerp8;
            fArr2[i7 + 12] = f15;
            fArr2[i7 + 13] = f16;
        }
    }

    private static final void splitQuadraticAt(float[] fArr, float[] fArr2, float f6) {
        if (fArr.length >= 6 && fArr2.length >= 10) {
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[2];
            float f10 = fArr[3];
            float f11 = fArr[4];
            float f12 = fArr[5];
            float fLerp = MathHelpersKt.lerp(f7, f9, f6);
            float fLerp2 = MathHelpersKt.lerp(f8, f10, f6);
            fArr2[0] = f7;
            fArr2[1] = f8;
            fArr2[2] = fLerp;
            fArr2[3] = fLerp2;
            float fLerp3 = MathHelpersKt.lerp(f9, f11, f6);
            float fLerp4 = MathHelpersKt.lerp(f10, f12, f6);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f6);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f6);
            fArr2[4] = fLerp5;
            fArr2[5] = fLerp6;
            fArr2[6] = fLerp3;
            fArr2[7] = fLerp4;
            fArr2[8] = f11;
            fArr2[9] = f12;
        }
    }

    private static final float unitDivide(float f6, float f7) {
        if (f6 < 0.0f) {
            f6 = -f6;
            f7 = -f7;
        }
        if (f7 == 0.0f || f6 == 0.0f || f6 >= f7) {
            return Float.NaN;
        }
        float f8 = f6 / f7;
        if (f8 == 0.0f) {
            return Float.NaN;
        }
        return f8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int writeValidRootInUnitRange(float f6, float[] fArr, int i6) {
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (Math.abs(f7 - f6) > FloatEpsilon) {
            f7 = Float.NaN;
        }
        fArr[i6] = f7;
        return !Float.isNaN(f7) ? 1 : 0;
    }

    public static final boolean closeTo(float f6, float f7) {
        return Math.abs(f6 - f7) < FloatEpsilon;
    }

    private static final float evaluateCubic(float f6, float f7, float f8, float f9, float f10) {
        float f11 = (f9 + ((f7 - f8) * 3.0f)) - f6;
        return (((((f11 * f10) + (((f8 - (2.0f * f7)) + f6) * 3.0f)) * f10) + ((f7 - f6) * 3.0f)) * f10) + f6;
    }
}

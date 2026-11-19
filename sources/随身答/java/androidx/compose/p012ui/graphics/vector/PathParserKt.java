package androidx.compose.p012ui.graphics.vector;

import androidx.camera.video.AudioStats;
import androidx.compose.p012ui.graphics.AndroidPath_androidKt;
import androidx.compose.p012ui.graphics.Path;
import androidx.compose.p012ui.graphics.vector.PathNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001aX\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u001a\u001a\u0010\u001a\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u001a\r\u0010\u001e\u001a\u00020\t*\u00020\tH\u0082\b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001f"}, m13413d2 = {"EmptyArray", "", "getEmptyArray", "()[F", "arcToBezier", "", "p", "Landroidx/compose/ui/graphics/Path;", "cx", "", "cy", "a", "b", "e1x", "e1y", "theta", "start", "sweep", "drawArc", "x0", "y0", "x1", "y1", "isMoreThanHalf", "", "isPositiveArc", "toPath", "", "Landroidx/compose/ui/graphics/vector/PathNode;", TypedValues.AttributesType.S_TARGET, "toRadians", "ui-graphics_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,546:1\n545#1:553\n34#2,6:547\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n405#1:553\n207#1:547,6\n*E\n"})
/* loaded from: classes2.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d19) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d20 = -d12;
        double d21 = d20 * dCos;
        double d22 = d13 * dSin;
        double d23 = (d21 * dSin2) - (d22 * dCos2);
        double d24 = d20 * dSin;
        double d25 = d13 * dCos;
        double d26 = (dSin2 * d24) + (dCos2 * d25);
        double d27 = d18 / iCeil;
        double d28 = d26;
        double d29 = d23;
        int i9 = 0;
        double d30 = d14;
        double d31 = d15;
        double d32 = d17;
        while (i9 < iCeil) {
            double d33 = d32 + d27;
            double dSin3 = Math.sin(d33);
            double dCos3 = Math.cos(d33);
            int i10 = i9;
            double d34 = (d10 + ((d12 * dCos) * dCos3)) - (d22 * dSin3);
            double d35 = d19;
            double d36 = d11 + (d12 * dSin * dCos3) + (d25 * dSin3);
            double d37 = (d21 * dSin3) - (d22 * dCos3);
            double d38 = (dSin3 * d24) + (dCos3 * d25);
            double d39 = d33 - d32;
            int i11 = iCeil;
            double dTan = Math.tan(d39 / 2);
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d35 + ((3.0d * dTan) * dTan)) - 1)) / 3;
            path.cubicTo((float) (d30 + (d29 * dSin4)), (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d34, (float) d36);
            dSin = dSin;
            d27 = d27;
            d30 = d34;
            d31 = d36;
            i9 = i10 + 1;
            d32 = d33;
            d28 = d38;
            iCeil = i11;
            d29 = d37;
            dCos = dCos;
            d19 = d35;
        }
    }

    private static final void drawArc(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z9, boolean z10) {
        double d17;
        double d18;
        double d19 = (d16 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d21 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d22 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d23 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d24 * d24) + (d25 * d25);
        if (d29 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            drawArc(path, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z9, z10);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z9 == z10) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan22 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z10 != (dAtan22 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
            dAtan22 = dAtan22 > AudioStats.AUDIO_AMPLITUDE_NONE ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        arcToBezier(path, (d33 * dCos) - (d34 * dSin), (d33 * dSin) + (d34 * dCos), d14, d15, d10, d11, d19, dAtan2, dAtan22);
    }

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        int i9;
        float f10;
        int i10;
        PathNode pathNode;
        float f11;
        float f12;
        float x12;
        float x22;
        float y22;
        float dy2;
        float f13;
        float f14;
        float dx1;
        float dy1;
        float dy22;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int iMo21300getFillTypeRgk1Os = path2.mo21300getFillTypeRgk1Os();
        path2.rewind();
        path2.mo21302setFillTypeoQ8Xj4U(iMo21300getFillTypeRgk1Os);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f15 = 0.0f;
        int i11 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x9 = 0.0f;
        float y9 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i11 < size) {
            PathNode pathNode3 = list2.get(i11);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i9 = size;
                f10 = f15;
                i10 = i11;
                pathNode = pathNode3;
                arcStartX = f16;
                x9 = arcStartX;
                arcStartY = f17;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x9 += relativeMoveTo.getDx();
                    y9 += relativeMoveTo.getDy();
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    i9 = size;
                    f10 = f15;
                    i10 = i11;
                    f16 = x9;
                    f17 = y9;
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        float x10 = moveTo.getX();
                        float y10 = moveTo.getY();
                        path2.moveTo(moveTo.getX(), moveTo.getY());
                        x9 = x10;
                        f16 = x9;
                        y9 = y10;
                        f17 = y9;
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x9 += relativeLineTo.getDx();
                            dy2 = relativeLineTo.getDy();
                        } else {
                            if (pathNode3 instanceof PathNode.LineTo) {
                                PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                                path2.lineTo(lineTo.getX(), lineTo.getY());
                                x22 = lineTo.getX();
                                y22 = lineTo.getY();
                            } else if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.relativeLineTo(relativeHorizontalTo.getDx(), f15);
                                x9 += relativeHorizontalTo.getDx();
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), y9);
                                x9 = horizontalTo.getX();
                            } else if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                path2.relativeLineTo(f15, relativeVerticalTo.getDy());
                                dy2 = relativeVerticalTo.getDy();
                            } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                path2.lineTo(x9, verticalTo.getY());
                                y9 = verticalTo.getY();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                    PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                    path2.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                    dx1 = relativeCurveTo.getDx2() + x9;
                                    dy1 = relativeCurveTo.getDy2() + y9;
                                    x9 += relativeCurveTo.getDx3();
                                    dy22 = relativeCurveTo.getDy3();
                                } else {
                                    if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        float x23 = curveTo.getX2();
                                        float y23 = curveTo.getY2();
                                        float x32 = curveTo.getX3();
                                        float y32 = curveTo.getY3();
                                        x9 = x32;
                                        y9 = y32;
                                        i9 = size;
                                        f10 = f15;
                                        i10 = i11;
                                        pathNode = pathNode3;
                                        arcStartX = x23;
                                        arcStartY = y23;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.getIsCurve()) {
                                            float f18 = x9 - arcStartX;
                                            f14 = y9 - arcStartY;
                                            f13 = f18;
                                        } else {
                                            f13 = f15;
                                            f14 = f13;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f13, f14, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + x9;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y9;
                                        x9 += relativeReflectiveCurveTo.getDx2();
                                        dy22 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                float f19 = 2;
                                                x9 = (x9 * f19) - arcStartX;
                                                y9 = (f19 * y9) - arcStartY;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.cubicTo(x9, y9, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x12 = reflectiveCurveTo.getX1();
                                            float y12 = reflectiveCurveTo.getY1();
                                            float x24 = reflectiveCurveTo.getX2();
                                            float y24 = reflectiveCurveTo.getY2();
                                            x9 = x24;
                                            y9 = y24;
                                            i9 = size;
                                            f10 = f15;
                                            i10 = i11;
                                            pathNode = pathNode3;
                                            arcStartY = y12;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            arcStartX = relativeQuadTo.getDx1() + x9;
                                            arcStartY = relativeQuadTo.getDy1() + y9;
                                            x9 += relativeQuadTo.getDx2();
                                            dy2 = relativeQuadTo.getDy2();
                                        } else if (pathNode3 instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                            path.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            arcStartX = quadTo.getX1();
                                            arcStartY = quadTo.getY1();
                                            x22 = quadTo.getX2();
                                            y22 = quadTo.getY2();
                                        } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                f11 = x9 - arcStartX;
                                                f12 = y9 - arcStartY;
                                            } else {
                                                f11 = f15;
                                                f12 = f11;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.relativeQuadraticTo(f11, f12, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x12 = f11 + x9;
                                            float f20 = f12 + y9;
                                            x9 += relativeReflectiveQuadTo.getDx();
                                            y9 += relativeReflectiveQuadTo.getDy();
                                            arcStartY = f20;
                                            i9 = size;
                                            f10 = f15;
                                            i10 = i11;
                                            pathNode = pathNode3;
                                        } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                float f21 = 2;
                                                x9 = (x9 * f21) - arcStartX;
                                                y9 = (f21 * y9) - arcStartY;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                            path.quadraticTo(x9, y9, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float f22 = x9;
                                            x9 = reflectiveQuadTo.getX();
                                            arcStartX = f22;
                                            i9 = size;
                                            f10 = f15;
                                            i10 = i11;
                                            arcStartY = y9;
                                            pathNode = pathNode3;
                                            y9 = reflectiveQuadTo.getY();
                                        } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + x9;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + y9;
                                            f10 = f15;
                                            pathNode = pathNode3;
                                            i9 = size;
                                            i10 = i11;
                                            drawArc(path, x9, y9, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                            arcStartX = arcStartDx;
                                            x9 = arcStartX;
                                            arcStartY = arcStartDy;
                                        } else {
                                            i9 = size;
                                            f10 = f15;
                                            i10 = i11;
                                            pathNode = pathNode3;
                                            if (pathNode instanceof PathNode.ArcTo) {
                                                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                drawArc(path, x9, y9, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                                arcStartX = arcTo.getArcStartX();
                                                x9 = arcStartX;
                                                arcStartY = arcTo.getArcStartY();
                                            }
                                        }
                                        arcStartX = x12;
                                    }
                                    i11 = i10 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    size = i9;
                                    f15 = f10;
                                    list2 = list;
                                }
                                y9 += dy22;
                                arcStartX = dx1;
                                arcStartY = dy1;
                            }
                            y9 = y22;
                            x9 = x22;
                        }
                        y9 += dy2;
                    }
                    i9 = size;
                    f10 = f15;
                    i10 = i11;
                }
                pathNode = pathNode3;
                i11 = i10 + 1;
                path2 = path;
                pathNode2 = pathNode;
                size = i9;
                f15 = f10;
                list2 = list;
            }
            y9 = arcStartY;
            i11 = i10 + 1;
            path2 = path;
            pathNode2 = pathNode;
            size = i9;
            f15 = f10;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d10) {
        return (d10 / 180) * 3.141592653589793d;
    }
}

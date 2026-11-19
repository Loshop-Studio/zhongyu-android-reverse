package androidx.compose.p009ui.graphics.vector;

import androidx.compose.p009ui.graphics.AndroidPath_androidKt;
import androidx.compose.p009ui.graphics.Path;
import androidx.compose.p009ui.graphics.vector.PathNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u00002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002\u001aX\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u001a\u001a\u0010\u001a\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u001a\r\u0010\u001e\u001a\u00020\t*\u00020\tH\u0082\b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001f"}, m7880d2 = {"EmptyArray", "", "getEmptyArray", "()[F", "arcToBezier", "", "p", "Landroidx/compose/ui/graphics/Path;", "cx", "", "cy", "a", "b", "e1x", "e1y", "theta", "start", "sweep", "drawArc", "x0", "y0", "x1", "y1", "isMoreThanHalf", "", "isPositiveArc", "toPath", "", "Landroidx/compose/ui/graphics/vector/PathNode;", TypedValues.AttributesType.S_TARGET, "toRadians", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,546:1\n545#1:553\n34#2,6:547\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n405#1:553\n207#1:547,6\n*E\n"})
/* loaded from: classes2.dex */
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        double d15 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d14 * d15) / 3.141592653589793d));
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double dCos2 = Math.cos(d13);
        double dSin2 = Math.sin(d13);
        double d16 = -d8;
        double d17 = d16 * dCos;
        double d18 = d9 * dSin;
        double d19 = (d17 * dSin2) - (d18 * dCos2);
        double d20 = d16 * dSin;
        double d21 = d9 * dCos;
        double d22 = (dSin2 * d20) + (dCos2 * d21);
        double d23 = d14 / iCeil;
        double d24 = d22;
        double d25 = d19;
        int i6 = 0;
        double d26 = d10;
        double d27 = d11;
        double d28 = d13;
        while (i6 < iCeil) {
            double d29 = d28 + d23;
            double dSin3 = Math.sin(d29);
            double dCos3 = Math.cos(d29);
            int i7 = i6;
            double d30 = (d6 + ((d8 * dCos) * dCos3)) - (d18 * dSin3);
            double d31 = d15;
            double d32 = d7 + (d8 * dSin * dCos3) + (d21 * dSin3);
            double d33 = (d17 * dSin3) - (d18 * dCos3);
            double d34 = (dSin3 * d20) + (dCos3 * d21);
            double d35 = d29 - d28;
            int i8 = iCeil;
            double dTan = Math.tan(d35 / 2);
            double dSin4 = (Math.sin(d35) * (Math.sqrt(d31 + ((3.0d * dTan) * dTan)) - 1)) / 3;
            path.cubicTo((float) (d26 + (d25 * dSin4)), (float) (d27 + (d24 * dSin4)), (float) (d30 - (dSin4 * d33)), (float) (d32 - (dSin4 * d34)), (float) d30, (float) d32);
            dSin = dSin;
            d23 = d23;
            d26 = d30;
            d27 = d32;
            i6 = i7 + 1;
            d28 = d29;
            d24 = d34;
            iCeil = i8;
            d25 = d33;
            dCos = dCos;
            d15 = d31;
        }
    }

    private static final void drawArc(Path path, double d6, double d7, double d8, double d9, double d10, double d11, double d12, boolean z6, boolean z7) {
        double d13;
        double d14;
        double d15 = (d12 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d15);
        double dSin = Math.sin(d15);
        double d16 = ((d6 * dCos) + (d7 * dSin)) / d10;
        double d17 = (((-d6) * dSin) + (d7 * dCos)) / d11;
        double d18 = ((d8 * dCos) + (d9 * dSin)) / d10;
        double d19 = (((-d8) * dSin) + (d9 * dCos)) / d11;
        double d20 = d16 - d18;
        double d21 = d17 - d19;
        double d22 = 2;
        double d23 = (d16 + d18) / d22;
        double d24 = (d17 + d19) / d22;
        double d25 = (d20 * d20) + (d21 * d21);
        if (d25 == 0.0d) {
            return;
        }
        double d26 = (1.0d / d25) - 0.25d;
        if (d26 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d25) / 1.99999d);
            drawArc(path, d6, d7, d8, d9, d10 * dSqrt, d11 * dSqrt, d12, z6, z7);
            return;
        }
        double dSqrt2 = Math.sqrt(d26);
        double d27 = d20 * dSqrt2;
        double d28 = dSqrt2 * d21;
        if (z6 == z7) {
            d13 = d23 - d28;
            d14 = d24 + d27;
        } else {
            d13 = d23 + d28;
            d14 = d24 - d27;
        }
        double dAtan2 = Math.atan2(d17 - d14, d16 - d13);
        double dAtan22 = Math.atan2(d19 - d14, d18 - d13) - dAtan2;
        if (z7 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d29 = d13 * d10;
        double d30 = d14 * d11;
        arcToBezier(path, (d29 * dCos) - (d30 * dSin), (d29 * dSin) + (d30 * dCos), d10, d11, d6, d7, d15, dAtan2, dAtan22);
    }

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        int i6;
        float f6;
        int i7;
        PathNode pathNode;
        float f7;
        float f8;
        float x12;
        float x22;
        float y22;
        float dy2;
        float f9;
        float f10;
        float dx1;
        float dy1;
        float dy22;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int iMo13790getFillTypeRgk1Os = path2.mo13790getFillTypeRgk1Os();
        path2.rewind();
        path2.mo13792setFillTypeoQ8Xj4U(iMo13790getFillTypeRgk1Os);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i8 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x6 = 0.0f;
        float y6 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (i8 < size) {
            PathNode pathNode3 = list2.get(i8);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i6 = size;
                f6 = f11;
                i7 = i8;
                pathNode = pathNode3;
                arcStartX = f12;
                x6 = arcStartX;
                arcStartY = f13;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x6 += relativeMoveTo.getDx();
                    y6 += relativeMoveTo.getDy();
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    i6 = size;
                    f6 = f11;
                    i7 = i8;
                    f12 = x6;
                    f13 = y6;
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        float x7 = moveTo.getX();
                        float y7 = moveTo.getY();
                        path2.moveTo(moveTo.getX(), moveTo.getY());
                        x6 = x7;
                        f12 = x6;
                        y6 = y7;
                        f13 = y6;
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x6 += relativeLineTo.getDx();
                            dy2 = relativeLineTo.getDy();
                        } else {
                            if (pathNode3 instanceof PathNode.LineTo) {
                                PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                                path2.lineTo(lineTo.getX(), lineTo.getY());
                                x22 = lineTo.getX();
                                y22 = lineTo.getY();
                            } else if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.relativeLineTo(relativeHorizontalTo.getDx(), f11);
                                x6 += relativeHorizontalTo.getDx();
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), y6);
                                x6 = horizontalTo.getX();
                            } else if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                path2.relativeLineTo(f11, relativeVerticalTo.getDy());
                                dy2 = relativeVerticalTo.getDy();
                            } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                path2.lineTo(x6, verticalTo.getY());
                                y6 = verticalTo.getY();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                    PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                    path2.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                    dx1 = relativeCurveTo.getDx2() + x6;
                                    dy1 = relativeCurveTo.getDy2() + y6;
                                    x6 += relativeCurveTo.getDx3();
                                    dy22 = relativeCurveTo.getDy3();
                                } else {
                                    if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        float x23 = curveTo.getX2();
                                        float y23 = curveTo.getY2();
                                        float x32 = curveTo.getX3();
                                        float y32 = curveTo.getY3();
                                        x6 = x32;
                                        y6 = y32;
                                        i6 = size;
                                        f6 = f11;
                                        i7 = i8;
                                        pathNode = pathNode3;
                                        arcStartX = x23;
                                        arcStartY = y23;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.getIsCurve()) {
                                            float f14 = x6 - arcStartX;
                                            f10 = y6 - arcStartY;
                                            f9 = f14;
                                        } else {
                                            f9 = f11;
                                            f10 = f9;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f9, f10, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + x6;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y6;
                                        x6 += relativeReflectiveCurveTo.getDx2();
                                        dy22 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                float f15 = 2;
                                                x6 = (x6 * f15) - arcStartX;
                                                y6 = (f15 * y6) - arcStartY;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.cubicTo(x6, y6, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x12 = reflectiveCurveTo.getX1();
                                            float y12 = reflectiveCurveTo.getY1();
                                            float x24 = reflectiveCurveTo.getX2();
                                            float y24 = reflectiveCurveTo.getY2();
                                            x6 = x24;
                                            y6 = y24;
                                            i6 = size;
                                            f6 = f11;
                                            i7 = i8;
                                            pathNode = pathNode3;
                                            arcStartY = y12;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            arcStartX = relativeQuadTo.getDx1() + x6;
                                            arcStartY = relativeQuadTo.getDy1() + y6;
                                            x6 += relativeQuadTo.getDx2();
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
                                                f7 = x6 - arcStartX;
                                                f8 = y6 - arcStartY;
                                            } else {
                                                f7 = f11;
                                                f8 = f7;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.relativeQuadraticTo(f7, f8, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x12 = f7 + x6;
                                            float f16 = f8 + y6;
                                            x6 += relativeReflectiveQuadTo.getDx();
                                            y6 += relativeReflectiveQuadTo.getDy();
                                            arcStartY = f16;
                                            i6 = size;
                                            f6 = f11;
                                            i7 = i8;
                                            pathNode = pathNode3;
                                        } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                float f17 = 2;
                                                x6 = (x6 * f17) - arcStartX;
                                                y6 = (f17 * y6) - arcStartY;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                            path.quadraticTo(x6, y6, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float f18 = x6;
                                            x6 = reflectiveQuadTo.getX();
                                            arcStartX = f18;
                                            i6 = size;
                                            f6 = f11;
                                            i7 = i8;
                                            arcStartY = y6;
                                            pathNode = pathNode3;
                                            y6 = reflectiveQuadTo.getY();
                                        } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + x6;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + y6;
                                            f6 = f11;
                                            pathNode = pathNode3;
                                            i6 = size;
                                            i7 = i8;
                                            drawArc(path, x6, y6, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                            arcStartX = arcStartDx;
                                            x6 = arcStartX;
                                            arcStartY = arcStartDy;
                                        } else {
                                            i6 = size;
                                            f6 = f11;
                                            i7 = i8;
                                            pathNode = pathNode3;
                                            if (pathNode instanceof PathNode.ArcTo) {
                                                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                drawArc(path, x6, y6, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                                arcStartX = arcTo.getArcStartX();
                                                x6 = arcStartX;
                                                arcStartY = arcTo.getArcStartY();
                                            }
                                        }
                                        arcStartX = x12;
                                    }
                                    i8 = i7 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    size = i6;
                                    f11 = f6;
                                    list2 = list;
                                }
                                y6 += dy22;
                                arcStartX = dx1;
                                arcStartY = dy1;
                            }
                            y6 = y22;
                            x6 = x22;
                        }
                        y6 += dy2;
                    }
                    i6 = size;
                    f6 = f11;
                    i7 = i8;
                }
                pathNode = pathNode3;
                i8 = i7 + 1;
                path2 = path;
                pathNode2 = pathNode;
                size = i6;
                f11 = f6;
                list2 = list;
            }
            y6 = arcStartY;
            i8 = i7 + 1;
            path2 = path;
            pathNode2 = pathNode;
            size = i6;
            f11 = f6;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d6) {
        return (d6 / 180) * 3.141592653589793d;
    }
}

package androidx.compose.p013ui.graphics.vector;

import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.vector.PathNode;
import com.tencent.rtmp.TXLiveConstants;
import java.util.List;

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
        int i10 = 0;
        double d30 = d14;
        double d31 = d15;
        double d32 = d17;
        while (i10 < iCeil) {
            double d33 = d32 + d27;
            double dSin3 = Math.sin(d33);
            double dCos3 = Math.cos(d33);
            int i11 = i10;
            double d34 = (d10 + ((d12 * dCos) * dCos3)) - (d22 * dSin3);
            double d35 = d19;
            double d36 = d11 + (d12 * dSin * dCos3) + (d25 * dSin3);
            double d37 = (d21 * dSin3) - (d22 * dCos3);
            double d38 = (dSin3 * d24) + (dCos3 * d25);
            double d39 = d33 - d32;
            int i12 = iCeil;
            double dTan = Math.tan(d39 / 2);
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d35 + ((3.0d * dTan) * dTan)) - 1)) / 3;
            path.cubicTo((float) (d30 + (d29 * dSin4)), (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d34, (float) d36);
            dSin = dSin;
            d27 = d27;
            d30 = d34;
            d31 = d36;
            i10 = i11 + 1;
            d32 = d33;
            d28 = d38;
            iCeil = i12;
            d29 = d37;
            dCos = dCos;
            d19 = d35;
        }
    }

    private static final void drawArc(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / TXLiveConstants.RENDER_ROTATION_180) * 3.141592653589793d;
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
            drawArc(path, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan22 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan22 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
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
        int i10;
        float f10;
        int i11;
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
        int iMo24167getFillTypeRgk1Os = path2.mo24167getFillTypeRgk1Os();
        path2.rewind();
        path2.mo24169setFillTypeoQ8Xj4U(iMo24167getFillTypeRgk1Os);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f15 = 0.0f;
        int i12 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x10 = 0.0f;
        float y10 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i12 < size) {
            PathNode pathNode3 = list2.get(i12);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i10 = size;
                f10 = f15;
                i11 = i12;
                pathNode = pathNode3;
                arcStartX = f16;
                x10 = arcStartX;
                arcStartY = f17;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x10 += relativeMoveTo.getDx();
                    y10 += relativeMoveTo.getDy();
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    i10 = size;
                    f10 = f15;
                    i11 = i12;
                    f16 = x10;
                    f17 = y10;
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        float x11 = moveTo.getX();
                        float y11 = moveTo.getY();
                        path2.moveTo(moveTo.getX(), moveTo.getY());
                        x10 = x11;
                        f16 = x10;
                        y10 = y11;
                        f17 = y10;
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x10 += relativeLineTo.getDx();
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
                                x10 += relativeHorizontalTo.getDx();
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), y10);
                                x10 = horizontalTo.getX();
                            } else if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                path2.relativeLineTo(f15, relativeVerticalTo.getDy());
                                dy2 = relativeVerticalTo.getDy();
                            } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                path2.lineTo(x10, verticalTo.getY());
                                y10 = verticalTo.getY();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                    PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                    path2.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                    dx1 = relativeCurveTo.getDx2() + x10;
                                    dy1 = relativeCurveTo.getDy2() + y10;
                                    x10 += relativeCurveTo.getDx3();
                                    dy22 = relativeCurveTo.getDy3();
                                } else {
                                    if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        float x23 = curveTo.getX2();
                                        float y23 = curveTo.getY2();
                                        float x32 = curveTo.getX3();
                                        float y32 = curveTo.getY3();
                                        x10 = x32;
                                        y10 = y32;
                                        i10 = size;
                                        f10 = f15;
                                        i11 = i12;
                                        pathNode = pathNode3;
                                        arcStartX = x23;
                                        arcStartY = y23;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.isCurve()) {
                                            float f18 = x10 - arcStartX;
                                            f14 = y10 - arcStartY;
                                            f13 = f18;
                                        } else {
                                            f13 = f15;
                                            f14 = f13;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f13, f14, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + x10;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y10;
                                        x10 += relativeReflectiveCurveTo.getDx2();
                                        dy22 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.isCurve()) {
                                                float f19 = 2;
                                                x10 = (x10 * f19) - arcStartX;
                                                y10 = (f19 * y10) - arcStartY;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.cubicTo(x10, y10, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x12 = reflectiveCurveTo.getX1();
                                            float y12 = reflectiveCurveTo.getY1();
                                            float x24 = reflectiveCurveTo.getX2();
                                            float y24 = reflectiveCurveTo.getY2();
                                            x10 = x24;
                                            y10 = y24;
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            pathNode = pathNode3;
                                            arcStartY = y12;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            arcStartX = relativeQuadTo.getDx1() + x10;
                                            arcStartY = relativeQuadTo.getDy1() + y10;
                                            x10 += relativeQuadTo.getDx2();
                                            dy2 = relativeQuadTo.getDy2();
                                        } else if (pathNode3 instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                            path.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            arcStartX = quadTo.getX1();
                                            arcStartY = quadTo.getY1();
                                            x22 = quadTo.getX2();
                                            y22 = quadTo.getY2();
                                        } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.isQuad()) {
                                                f11 = x10 - arcStartX;
                                                f12 = y10 - arcStartY;
                                            } else {
                                                f11 = f15;
                                                f12 = f11;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.relativeQuadraticTo(f11, f12, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x12 = f11 + x10;
                                            float f20 = f12 + y10;
                                            x10 += relativeReflectiveQuadTo.getDx();
                                            y10 += relativeReflectiveQuadTo.getDy();
                                            arcStartY = f20;
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            pathNode = pathNode3;
                                        } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.isQuad()) {
                                                float f21 = 2;
                                                x10 = (x10 * f21) - arcStartX;
                                                y10 = (f21 * y10) - arcStartY;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                            path.quadraticTo(x10, y10, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float f22 = x10;
                                            x10 = reflectiveQuadTo.getX();
                                            arcStartX = f22;
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            arcStartY = y10;
                                            pathNode = pathNode3;
                                            y10 = reflectiveQuadTo.getY();
                                        } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + x10;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + y10;
                                            f10 = f15;
                                            pathNode = pathNode3;
                                            i10 = size;
                                            i11 = i12;
                                            drawArc(path, x10, y10, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                            arcStartX = arcStartDx;
                                            x10 = arcStartX;
                                            arcStartY = arcStartDy;
                                        } else {
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            pathNode = pathNode3;
                                            if (pathNode instanceof PathNode.ArcTo) {
                                                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                drawArc(path, x10, y10, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                                arcStartX = arcTo.getArcStartX();
                                                x10 = arcStartX;
                                                arcStartY = arcTo.getArcStartY();
                                            }
                                        }
                                        arcStartX = x12;
                                    }
                                    i12 = i11 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    size = i10;
                                    f15 = f10;
                                    list2 = list;
                                }
                                y10 += dy22;
                                arcStartX = dx1;
                                arcStartY = dy1;
                            }
                            y10 = y22;
                            x10 = x22;
                        }
                        y10 += dy2;
                    }
                    i10 = size;
                    f10 = f15;
                    i11 = i12;
                }
                pathNode = pathNode3;
                i12 = i11 + 1;
                path2 = path;
                pathNode2 = pathNode;
                size = i10;
                f15 = f10;
                list2 = list;
            }
            y10 = arcStartY;
            i12 = i11 + 1;
            path2 = path;
            pathNode2 = pathNode;
            size = i10;
            f15 = f10;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d10) {
        return (d10 / TXLiveConstants.RENDER_ROTATION_180) * 3.141592653589793d;
    }
}

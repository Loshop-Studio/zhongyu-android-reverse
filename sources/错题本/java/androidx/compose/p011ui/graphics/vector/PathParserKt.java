package androidx.compose.p011ui.graphics.vector;

import androidx.camera.video.AudioStats;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.vector.PathNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a_\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u0007*\u00020\u0007H\u0082\b¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010 \u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, m5110d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "Landroidx/compose/ui/graphics/Path;", TypedValues.AttributesType.S_TARGET, "toPath", "(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "Ld6/s;", "drawArc", "(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "arcToBezier", "(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V", "toRadians", "(D)D", "", "EmptyArray", "[F", "getEmptyArray", "()[F", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,546:1\n545#1:553\n34#2,6:547\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n405#1:553\n207#1:547,6\n*E\n"})
/* loaded from: classes.dex */
public final class PathParserKt {

    @NotNull
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        double d18 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d17 * d18) / 3.141592653589793d));
        double dCos = Math.cos(d15);
        double dSin = Math.sin(d15);
        double dCos2 = Math.cos(d16);
        double dSin2 = Math.sin(d16);
        double d19 = -d11;
        double d20 = d19 * dCos;
        double d21 = d12 * dSin;
        double d22 = (d20 * dSin2) - (d21 * dCos2);
        double d23 = d19 * dSin;
        double d24 = d12 * dCos;
        double d25 = (dCos2 * d24) + (dSin2 * d23);
        double d26 = d17 / iCeil;
        double d27 = d25;
        double d28 = d22;
        int i = 0;
        double d29 = d13;
        double d30 = d14;
        double d31 = d16;
        while (i < iCeil) {
            double d32 = d31 + d26;
            double dSin3 = Math.sin(d32);
            double dCos3 = Math.cos(d32);
            int i8 = i;
            double d33 = (((d11 * dCos) * dCos3) + d9) - (d21 * dSin3);
            double d34 = d18;
            double d35 = (d24 * dSin3) + (d11 * dSin * dCos3) + d10;
            double d36 = (d20 * dSin3) - (d21 * dCos3);
            double d37 = (dCos3 * d24) + (dSin3 * d23);
            double d38 = d32 - d31;
            int i9 = iCeil;
            double dTan = Math.tan(d38 / 2);
            double dSqrt = ((Math.sqrt(((3.0d * dTan) * dTan) + d34) - 1) * Math.sin(d38)) / 3;
            path.cubicTo((float) ((d28 * dSqrt) + d29), (float) ((d27 * dSqrt) + d30), (float) (d33 - (dSqrt * d36)), (float) (d35 - (dSqrt * d37)), (float) d33, (float) d35);
            dSin = dSin;
            d26 = d26;
            d29 = d33;
            d30 = d35;
            i = i8 + 1;
            d31 = d32;
            d27 = d37;
            iCeil = i9;
            d28 = d36;
            dCos = dCos;
            d18 = d34;
        }
    }

    private static final void drawArc(Path path, double d9, double d10, double d11, double d12, double d13, double d14, double d15, boolean z8, boolean z9) {
        double d16;
        double d17;
        double d18 = (d15 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d18);
        double dSin = Math.sin(d18);
        double d19 = ((d10 * dSin) + (d9 * dCos)) / d13;
        double d20 = ((d10 * dCos) + ((-d9) * dSin)) / d14;
        double d21 = ((d12 * dSin) + (d11 * dCos)) / d13;
        double d22 = ((d12 * dCos) + ((-d11) * dSin)) / d14;
        double d23 = d19 - d21;
        double d24 = d20 - d22;
        double d25 = 2;
        double d26 = (d19 + d21) / d25;
        double d27 = (d20 + d22) / d25;
        double d28 = (d24 * d24) + (d23 * d23);
        if (d28 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            double dSqrt = (float) (Math.sqrt(d28) / 1.99999d);
            drawArc(path, d9, d10, d11, d12, d13 * dSqrt, d14 * dSqrt, d15, z8, z9);
            return;
        }
        double dSqrt2 = Math.sqrt(d29);
        double d30 = d23 * dSqrt2;
        double d31 = dSqrt2 * d24;
        if (z8 == z9) {
            d16 = d26 - d31;
            d17 = d27 + d30;
        } else {
            d16 = d26 + d31;
            d17 = d27 - d30;
        }
        double dAtan2 = Math.atan2(d20 - d17, d19 - d16);
        double dAtan22 = Math.atan2(d22 - d17, d21 - d16) - dAtan2;
        if (z9 != (dAtan22 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
            dAtan22 = dAtan22 > AudioStats.AUDIO_AMPLITUDE_NONE ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d32 = d16 * d13;
        double d33 = d17 * d14;
        arcToBezier(path, (d32 * dCos) - (d33 * dSin), (d33 * dCos) + (d32 * dSin), d13, d14, d9, d10, d18, dAtan2, dAtan22);
    }

    @NotNull
    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    @NotNull
    public static final Path toPath(@NotNull List<? extends PathNode> list, @NotNull Path path) {
        int i;
        float f;
        int i8;
        PathNode pathNode;
        float f7;
        float f8;
        float x12;
        float y12;
        float x22;
        float y2;
        float dy2;
        float f9;
        float f10;
        float dx1;
        float dy1;
        float dx2;
        float dy22;
        float y3;
        float y7;
        float x3;
        float x8;
        float y8;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int iMo10573getFillTypeRgk1Os = path2.mo10573getFillTypeRgk1Os();
        path2.rewind();
        path2.mo10575setFillTypeoQ8Xj4U(iMo10573getFillTypeRgk1Os);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i9 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x9 = 0.0f;
        float y9 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (i9 < size) {
            PathNode pathNode3 = list2.get(i9);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i = size;
                f = f11;
                i8 = i9;
                pathNode = pathNode3;
                arcStartX = f12;
                x9 = arcStartX;
                arcStartY = f13;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x8 = relativeMoveTo.getDx() + x9;
                    y8 = relativeMoveTo.getDy() + y9;
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                } else if (pathNode3 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                    x8 = moveTo.getX();
                    y8 = moveTo.getY();
                    path2.moveTo(moveTo.getX(), moveTo.getY());
                } else {
                    if (pathNode3 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                        path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        x22 = relativeLineTo.getDx() + x9;
                        dy2 = relativeLineTo.getDy();
                    } else {
                        if (pathNode3 instanceof PathNode.LineTo) {
                            PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                            path2.lineTo(lineTo.getX(), lineTo.getY());
                            x22 = lineTo.getX();
                            y2 = lineTo.getY();
                        } else {
                            if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.relativeLineTo(relativeHorizontalTo.getDx(), f11);
                                x3 = relativeHorizontalTo.getDx() + x9;
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), y9);
                                x3 = horizontalTo.getX();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                    PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                    path2.relativeLineTo(f11, relativeVerticalTo.getDy());
                                    y7 = relativeVerticalTo.getDy() + y9;
                                } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                    PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                    path2.lineTo(x9, verticalTo.getY());
                                    y7 = verticalTo.getY();
                                } else {
                                    if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                        PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                        path2.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                        dx1 = relativeCurveTo.getDx2() + x9;
                                        dy1 = relativeCurveTo.getDy2() + y9;
                                        dx2 = relativeCurveTo.getDx3() + x9;
                                        dy22 = relativeCurveTo.getDy3();
                                    } else if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        dx1 = curveTo.getX2();
                                        dy1 = curveTo.getY2();
                                        dx2 = curveTo.getX3();
                                        y3 = curveTo.getY3();
                                        x9 = dx2;
                                        y9 = y3;
                                        i = size;
                                        f = f11;
                                        i8 = i9;
                                        pathNode = pathNode3;
                                        arcStartX = dx1;
                                        arcStartY = dy1;
                                        i9 = i8 + 1;
                                        path2 = path;
                                        pathNode2 = pathNode;
                                        size = i;
                                        f11 = f;
                                        list2 = list;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.getIsCurve()) {
                                            float f14 = x9 - arcStartX;
                                            f10 = y9 - arcStartY;
                                            f9 = f14;
                                        } else {
                                            f9 = f11;
                                            f10 = f9;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f9, f10, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + x9;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y9;
                                        dx2 = relativeReflectiveCurveTo.getDx2() + x9;
                                        dy22 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                float f15 = 2;
                                                x9 = (x9 * f15) - arcStartX;
                                                y9 = (f15 * y9) - arcStartY;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.cubicTo(x9, y9, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x12 = reflectiveCurveTo.getX1();
                                            y12 = reflectiveCurveTo.getY1();
                                            float x23 = reflectiveCurveTo.getX2();
                                            float y22 = reflectiveCurveTo.getY2();
                                            x9 = x23;
                                            y9 = y22;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            arcStartX = relativeQuadTo.getDx1() + x9;
                                            arcStartY = relativeQuadTo.getDy1() + y9;
                                            x22 = relativeQuadTo.getDx2() + x9;
                                            dy2 = relativeQuadTo.getDy2();
                                        } else if (pathNode3 instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                            path.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            arcStartX = quadTo.getX1();
                                            arcStartY = quadTo.getY1();
                                            x22 = quadTo.getX2();
                                            y2 = quadTo.getY2();
                                        } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                f7 = x9 - arcStartX;
                                                f8 = y9 - arcStartY;
                                            } else {
                                                f7 = f11;
                                                f8 = f7;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.relativeQuadraticTo(f7, f8, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x12 = f7 + x9;
                                            y12 = f8 + y9;
                                            float dx = relativeReflectiveQuadTo.getDx() + x9;
                                            y9 = relativeReflectiveQuadTo.getDy() + y9;
                                            x9 = dx;
                                        } else {
                                            if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                                if (pathNode2.getIsQuad()) {
                                                    float f16 = 2;
                                                    x9 = (x9 * f16) - arcStartX;
                                                    y9 = (f16 * y9) - arcStartY;
                                                }
                                                PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                                path.quadraticTo(x9, y9, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                                float f17 = x9;
                                                x9 = reflectiveQuadTo.getX();
                                                arcStartX = f17;
                                                i = size;
                                                f = f11;
                                                i8 = i9;
                                                arcStartY = y9;
                                                pathNode = pathNode3;
                                                y9 = reflectiveQuadTo.getY();
                                            } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                                PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                                float arcStartDx = relativeArcTo.getArcStartDx() + x9;
                                                float arcStartDy = relativeArcTo.getArcStartDy() + y9;
                                                f = f11;
                                                pathNode = pathNode3;
                                                i = size;
                                                i8 = i9;
                                                drawArc(path, x9, y9, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                                arcStartX = arcStartDx;
                                                x9 = arcStartX;
                                                arcStartY = arcStartDy;
                                            } else {
                                                i = size;
                                                f = f11;
                                                i8 = i9;
                                                pathNode = pathNode3;
                                                if (pathNode instanceof PathNode.ArcTo) {
                                                    PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                    drawArc(path, x9, y9, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                                    arcStartX = arcTo.getArcStartX();
                                                    x9 = arcStartX;
                                                    arcStartY = arcTo.getArcStartY();
                                                }
                                            }
                                            i9 = i8 + 1;
                                            path2 = path;
                                            pathNode2 = pathNode;
                                            size = i;
                                            f11 = f;
                                            list2 = list;
                                        }
                                        i = size;
                                        f = f11;
                                        i8 = i9;
                                        pathNode = pathNode3;
                                        arcStartY = y12;
                                        arcStartX = x12;
                                        i9 = i8 + 1;
                                        path2 = path;
                                        pathNode2 = pathNode;
                                        size = i;
                                        f11 = f;
                                        list2 = list;
                                    }
                                    y3 = dy22 + y9;
                                    x9 = dx2;
                                    y9 = y3;
                                    i = size;
                                    f = f11;
                                    i8 = i9;
                                    pathNode = pathNode3;
                                    arcStartX = dx1;
                                    arcStartY = dy1;
                                    i9 = i8 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    size = i;
                                    f11 = f;
                                    list2 = list;
                                }
                                y9 = y7;
                                i = size;
                                f = f11;
                                i8 = i9;
                                pathNode = pathNode3;
                                i9 = i8 + 1;
                                path2 = path;
                                pathNode2 = pathNode;
                                size = i;
                                f11 = f;
                                list2 = list;
                            }
                            x9 = x3;
                            i = size;
                            f = f11;
                            i8 = i9;
                            pathNode = pathNode3;
                            i9 = i8 + 1;
                            path2 = path;
                            pathNode2 = pathNode;
                            size = i;
                            f11 = f;
                            list2 = list;
                        }
                        y9 = y2;
                        x9 = x22;
                        i = size;
                        f = f11;
                        i8 = i9;
                        pathNode = pathNode3;
                        i9 = i8 + 1;
                        path2 = path;
                        pathNode2 = pathNode;
                        size = i;
                        f11 = f;
                        list2 = list;
                    }
                    y2 = dy2 + y9;
                    y9 = y2;
                    x9 = x22;
                    i = size;
                    f = f11;
                    i8 = i9;
                    pathNode = pathNode3;
                    i9 = i8 + 1;
                    path2 = path;
                    pathNode2 = pathNode;
                    size = i;
                    f11 = f;
                    list2 = list;
                }
                x9 = x8;
                f12 = x9;
                y9 = y8;
                f13 = y9;
                i = size;
                f = f11;
                i8 = i9;
                pathNode = pathNode3;
                i9 = i8 + 1;
                path2 = path;
                pathNode2 = pathNode;
                size = i;
                f11 = f;
                list2 = list;
            }
            y9 = arcStartY;
            i9 = i8 + 1;
            path2 = path;
            pathNode2 = pathNode;
            size = i;
            f11 = f;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d9) {
        return (d9 / 180) * 3.141592653589793d;
    }
}

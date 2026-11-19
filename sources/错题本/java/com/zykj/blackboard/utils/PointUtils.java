package com.zykj.blackboard.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ.\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\tJ.\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m5110d2 = {"Lcom/zykj/blackboard/utils/PointUtils;", "", "()V", "tempDstFloatArray", "", "tempSrcFloatArray", "getCross", "", "p1", "Landroid/graphics/PointF;", "p2", "p", "isPointInRect", "", "leftTop", "rightTop", "rightBottom", "leftBottom", "rectF", "Landroid/graphics/RectF;", "matrix", "Landroid/graphics/Matrix;", "isRectFinRectF", "mapPoint", "pointF", "x", "y", "rectConvertPath", "Landroid/graphics/Path;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PointUtils {

    @NotNull
    public static final PointUtils INSTANCE = new PointUtils();

    @NotNull
    private static final float[] tempDstFloatArray = new float[2];

    @NotNull
    private static final float[] tempSrcFloatArray = new float[2];

    private PointUtils() {
    }

    public final float getCross(@NotNull PointF p1, @NotNull PointF p22, @NotNull PointF p6) {
        AbstractC5830k.m5330g(p1, "p1");
        AbstractC5830k.m5330g(p22, "p2");
        AbstractC5830k.m5330g(p6, "p");
        float f = p22.x;
        float f7 = p1.x;
        float f8 = p6.y;
        float f9 = p1.y;
        return ((f8 - f9) * (f - f7)) - ((p22.y - f9) * (p6.x - f7));
    }

    public final boolean isPointInRect(@NotNull RectF rectF, @NotNull Matrix matrix, @NotNull PointF p6) {
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(p6, "p");
        return isPointInRect(mapPoint(rectF.left, rectF.top, matrix), mapPoint(rectF.right, rectF.top, matrix), mapPoint(rectF.right, rectF.bottom, matrix), mapPoint(rectF.left, rectF.bottom, matrix), p6);
    }

    public final boolean isRectFinRectF(@NotNull PointF leftTop, @NotNull PointF rightTop, @NotNull PointF rightBottom, @NotNull PointF leftBottom, @NotNull RectF rectF) {
        AbstractC5830k.m5330g(leftTop, "leftTop");
        AbstractC5830k.m5330g(rightTop, "rightTop");
        AbstractC5830k.m5330g(rightBottom, "rightBottom");
        AbstractC5830k.m5330g(leftBottom, "leftBottom");
        AbstractC5830k.m5330g(rectF, "rectF");
        PointF pointF = new PointF();
        pointF.set(rectF.left, rectF.top);
        if (!isPointInRect(leftTop, rightTop, rightBottom, leftBottom, pointF)) {
            return false;
        }
        pointF.set(rectF.right, rectF.top);
        if (!isPointInRect(leftTop, rightTop, rightBottom, leftBottom, pointF)) {
            return false;
        }
        pointF.set(rectF.right, rectF.bottom);
        if (!isPointInRect(leftTop, rightTop, rightBottom, leftBottom, pointF)) {
            return false;
        }
        pointF.set(rectF.left, rectF.bottom);
        return isPointInRect(leftTop, rightTop, rightBottom, leftBottom, pointF);
    }

    @NotNull
    public final PointF mapPoint(float x3, float y2, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        return mapPoint(new PointF(x3, y2), matrix);
    }

    @NotNull
    public final Path rectConvertPath(@NotNull RectF rectF, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        Path path = new Path();
        PointF pointFMapPoint = mapPoint(rectF.left, rectF.top, matrix);
        path.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        path.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        PointF pointFMapPoint2 = mapPoint(rectF.right, rectF.top, matrix);
        path.lineTo(pointFMapPoint2.x, pointFMapPoint2.y);
        PointF pointFMapPoint3 = mapPoint(rectF.right, rectF.bottom, matrix);
        path.lineTo(pointFMapPoint3.x, pointFMapPoint3.y);
        PointF pointFMapPoint4 = mapPoint(rectF.left, rectF.bottom, matrix);
        path.lineTo(pointFMapPoint4.x, pointFMapPoint4.y);
        path.close();
        return path;
    }

    @NotNull
    public final PointF mapPoint(@NotNull PointF pointF, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(pointF, "pointF");
        AbstractC5830k.m5330g(matrix, "matrix");
        float[] fArr = tempDstFloatArray;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float[] fArr2 = tempSrcFloatArray;
        float f = pointF.x;
        fArr2[0] = f;
        float f7 = pointF.y;
        fArr2[1] = f7;
        matrix.mapPoints(fArr, new float[]{f, f7});
        return new PointF(fArr[0], fArr[1]);
    }

    public final boolean isPointInRect(@NotNull PointF leftTop, @NotNull PointF rightTop, @NotNull PointF rightBottom, @NotNull PointF leftBottom, @NotNull PointF p6) {
        AbstractC5830k.m5330g(leftTop, "leftTop");
        AbstractC5830k.m5330g(rightTop, "rightTop");
        AbstractC5830k.m5330g(rightBottom, "rightBottom");
        AbstractC5830k.m5330g(leftBottom, "leftBottom");
        AbstractC5830k.m5330g(p6, "p");
        if (getCross(rightBottom, rightTop, p6) * getCross(leftTop, leftBottom, p6) >= 0.0f) {
            return getCross(rightTop, leftTop, p6) * getCross(leftBottom, rightBottom, p6) >= 0.0f;
        }
        return false;
    }
}

package com.zykj.blackboard.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;

/* loaded from: classes4.dex */
public final class PointUtils {
    public static final PointUtils INSTANCE = new PointUtils();
    private static final float[] tempDstFloatArray = new float[2];
    private static final float[] tempSrcFloatArray = new float[2];

    private PointUtils() {
    }

    public final float getCross(PointF p12, PointF p22, PointF p10) {
        AbstractC9133u.m16133g(p12, "p1");
        AbstractC9133u.m16133g(p22, "p2");
        AbstractC9133u.m16133g(p10, "p");
        float f10 = p22.x;
        float f11 = p12.x;
        float f12 = p10.y;
        float f13 = p12.y;
        return ((f10 - f11) * (f12 - f13)) - ((p10.x - f11) * (p22.y - f13));
    }

    public final boolean isPointInRect(RectF rectF, Matrix matrix, PointF p10) {
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(p10, "p");
        return isPointInRect(mapPoint(rectF.left, rectF.top, matrix), mapPoint(rectF.right, rectF.top, matrix), mapPoint(rectF.right, rectF.bottom, matrix), mapPoint(rectF.left, rectF.bottom, matrix), p10);
    }

    public final boolean isRectFinRectF(PointF leftTop, PointF rightTop, PointF rightBottom, PointF leftBottom, RectF rectF) {
        AbstractC9133u.m16133g(leftTop, "leftTop");
        AbstractC9133u.m16133g(rightTop, "rightTop");
        AbstractC9133u.m16133g(rightBottom, "rightBottom");
        AbstractC9133u.m16133g(leftBottom, "leftBottom");
        AbstractC9133u.m16133g(rectF, "rectF");
        PointF pointF = new PointF();
        pointF.set(rectF.left, rectF.top);
        C8736p c8736p = C8736p.f16368a;
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

    public final PointF mapPoint(float f10, float f11, Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        return mapPoint(new PointF(f10, f11), matrix);
    }

    public final Path rectConvertPath(RectF rectF, Matrix matrix) {
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(matrix, "matrix");
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

    public final PointF mapPoint(PointF pointF, Matrix matrix) {
        AbstractC9133u.m16133g(pointF, "pointF");
        AbstractC9133u.m16133g(matrix, "matrix");
        float[] fArr = tempDstFloatArray;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float[] fArr2 = tempSrcFloatArray;
        float f10 = pointF.x;
        fArr2[0] = f10;
        float f11 = pointF.y;
        fArr2[1] = f11;
        matrix.mapPoints(fArr, new float[]{f10, f11});
        return new PointF(fArr[0], fArr[1]);
    }

    public final boolean isPointInRect(PointF leftTop, PointF rightTop, PointF rightBottom, PointF leftBottom, PointF p10) {
        AbstractC9133u.m16133g(leftTop, "leftTop");
        AbstractC9133u.m16133g(rightTop, "rightTop");
        AbstractC9133u.m16133g(rightBottom, "rightBottom");
        AbstractC9133u.m16133g(leftBottom, "leftBottom");
        AbstractC9133u.m16133g(p10, "p");
        return getCross(leftTop, leftBottom, p10) * getCross(rightBottom, rightTop, p10) >= 0.0f && getCross(leftBottom, rightBottom, p10) * getCross(rightTop, leftTop, p10) >= 0.0f;
    }
}

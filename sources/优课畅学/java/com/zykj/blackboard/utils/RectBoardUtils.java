package com.zykj.blackboard.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class RectBoardUtils {
    public static final RectBoardUtils INSTANCE = new RectBoardUtils();

    private RectBoardUtils() {
    }

    public final Path getSelectActionRectBoardPath(RectF rectF, Matrix matrix, float f10) {
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        Path path = new Path();
        float fMapRadius = (f10 / 2) / matrix.mapRadius(1.0f);
        path.moveTo(rectF.left + fMapRadius, rectF.top);
        path.lineTo(rectF.right - fMapRadius, rectF.top);
        path.moveTo(rectF.right, rectF.top + fMapRadius);
        path.lineTo(rectF.right, rectF.bottom - fMapRadius);
        path.moveTo(rectF.right - fMapRadius, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.moveTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left, rectF.top + fMapRadius);
        ShapeUtils shapeUtils = ShapeUtils.INSTANCE;
        shapeUtils.drawRotateIconToPath(path, rectF.left, rectF.top, fMapRadius);
        shapeUtils.drawDeleteIconToPath(path, rectF.right, rectF.top, fMapRadius);
        shapeUtils.drawScaleIconToPath(path, rectF.right, rectF.bottom, fMapRadius);
        path.transform(matrix);
        return path;
    }

    public final Path getTextActionRectBoardPath(RectF rectF, Matrix matrix, float f10) {
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        Path path = new Path();
        float f11 = 2;
        float fMapRadius = (f10 / f11) / matrix.mapRadius(1.0f);
        path.moveTo(rectF.left, rectF.top);
        path.lineTo(rectF.right - fMapRadius, rectF.top);
        path.moveTo(rectF.right, rectF.top + fMapRadius);
        path.lineTo(rectF.right, rectF.bottom);
        path.moveTo(rectF.right, rectF.bottom);
        path.lineTo(rectF.left, rectF.bottom);
        path.moveTo(rectF.left, rectF.bottom);
        path.lineTo(rectF.left, rectF.top);
        ShapeUtils.INSTANCE.drawDeleteIconToPath(path, rectF.right, rectF.top, fMapRadius);
        float f12 = fMapRadius / f11;
        path.moveTo(rectF.right, rectF.bottom - f12);
        path.lineTo(rectF.right - f12, rectF.bottom);
        path.moveTo(rectF.right, rectF.bottom - fMapRadius);
        path.lineTo(rectF.right - fMapRadius, rectF.bottom);
        path.transform(matrix);
        return path;
    }
}

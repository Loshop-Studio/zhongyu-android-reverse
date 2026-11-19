package com.zykj.paint.extensions;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.zykj.paint.graphic.Graph;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class GraphExtKt {
    public static final Matrix inverts(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        return matrix2;
    }

    public static final PointF mapPoint(Graph graph, float f10, float f11, Matrix matrix) {
        AbstractC9979u.m20294g(graph, "<this>");
        AbstractC9979u.m20294g(matrix, "matrix");
        return mapPoint(graph, new PointF(f10, f11), matrix);
    }

    public static final PointF mapPoint(Graph graph, PointF pointF, Matrix matrix) {
        AbstractC9979u.m20294g(graph, "<this>");
        AbstractC9979u.m20294g(pointF, "pointF");
        AbstractC9979u.m20294g(matrix, "matrix");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        return new PointF(fArr[0], fArr[1]);
    }

    public static final PointF mapPoint(Matrix matrix, PointF pointF) {
        AbstractC9979u.m20294g(matrix, "<this>");
        AbstractC9979u.m20294g(pointF, "pointF");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        return new PointF(fArr[0], fArr[1]);
    }
}

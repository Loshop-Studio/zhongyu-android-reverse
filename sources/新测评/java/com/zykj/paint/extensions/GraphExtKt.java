package com.zykj.paint.extensions;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.zykj.paint.graphic.Graph;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001\u001a\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\n"}, m13558d2 = {"inverts", "Landroid/graphics/Matrix;", "mapPoint", "Landroid/graphics/PointF;", "pointF", "Lcom/zykj/paint/graphic/Graph;", "matrix", "x", "", "y", "paint_release"}, m13559k = 2, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class GraphExtKt {
    public static final Matrix inverts(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        return matrix2;
    }

    public static final PointF mapPoint(Graph graph, float f10, float f11, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return mapPoint(graph, new PointF(f10, f11), matrix);
    }

    public static final PointF mapPoint(Graph graph, PointF pointF, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Intrinsics.checkNotNullParameter(pointF, "pointF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        return new PointF(fArr[0], fArr[1]);
    }

    public static final PointF mapPoint(Matrix matrix, PointF pointF) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(pointF, "pointF");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        return new PointF(fArr[0], fArr[1]);
    }
}

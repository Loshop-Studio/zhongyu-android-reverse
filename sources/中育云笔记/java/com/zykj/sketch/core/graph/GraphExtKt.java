package com.zykj.sketch.core.graph;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;

/* loaded from: classes6.dex */
public final class GraphExtKt {
    public static final void convert2FM(Graph graph, Graph graph2, Matrix matrix) {
        AbstractC9979u.m20294g(graph, "<this>");
        AbstractC9979u.m20294g(graph2, "graph");
        AbstractC9979u.m20294g(matrix, "matrix");
        Graph mFatherGraph = graph2.getMFatherGraph();
        if (mFatherGraph != null) {
            matrix.preConcat(inverts(mFatherGraph.getChildExtendMatrix()));
            matrix.preConcat(inverts(mFatherGraph.getMatrix()));
            convert2FM(graph, mFatherGraph, matrix);
        }
    }

    public static final void convert2WM(Graph graph, Graph graph2, Matrix matrix) {
        AbstractC9979u.m20294g(graph, "<this>");
        AbstractC9979u.m20294g(graph2, "graph");
        AbstractC9979u.m20294g(matrix, "matrix");
        matrix.postConcat(graph2.getMatrix());
        Graph mFatherGraph = graph2.getMFatherGraph();
        if (mFatherGraph != null) {
            matrix.postConcat(mFatherGraph.getChildExtendMatrix());
            convert2WM(graph, mFatherGraph, matrix);
        }
    }

    public static final Matrix getFP2WPMatrix(Graph graph) {
        AbstractC9979u.m20294g(graph, "<this>");
        Matrix matrix = new Matrix();
        convert2WM(graph, graph, matrix);
        return matrix;
    }

    public static final Matrix getFP2WPRendMatrix(Graph graph) {
        AbstractC9979u.m20294g(graph, "<this>");
        Matrix matrix = new Matrix();
        convert2WM(graph, graph, matrix);
        matrix.postConcat(graph.getControl().getCameraMatrix());
        return matrix;
    }

    public static final Matrix getWP2FPMatrix(Graph graph) {
        AbstractC9979u.m20294g(graph, "<this>");
        Matrix matrix = new Matrix();
        convert2FM(graph, graph, matrix);
        return matrix;
    }

    public static final Matrix getWP2LPMatrix(Graph graph) {
        AbstractC9979u.m20294g(graph, "<this>");
        Matrix wP2FPMatrix = getWP2FPMatrix(graph);
        wP2FPMatrix.preConcat(inverts(graph.getMatrix()));
        return wP2FPMatrix;
    }

    public static final void initPaint(Graph graph, int i10, float f10) {
        AbstractC9979u.m20294g(graph, "<this>");
        graph.getMPaint().setColor(i10);
        graph.getMPaint().setStrokeWidth(f10);
        graph.getMPaint().setStyle(Paint.Style.STROKE);
        graph.getMPaint().setDither(true);
        graph.getMPaint().setAntiAlias(true);
    }

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

    public static final RectF maxWritingRenderOutRectF(Graph graph) {
        AbstractC9979u.m20294g(graph, "<this>");
        RectF rectF = new RectF();
        if (graph instanceof WritingGroupGraph) {
            graph.onMeasure();
            getFP2WPMatrix(graph).mapRect(rectF, graph.getOutRect());
        }
        Iterator<T> it = graph.getChild().iterator();
        while (it.hasNext()) {
            rectF.union(maxWritingRenderOutRectF((Graph) it.next()));
        }
        return rectF;
    }

    public static final Path pointConvertPath(Graph graph, List<PointF> pointList, Matrix matrix) { // The first and last samples are detected by PointF value; revisiting the first starts another subpath.
        AbstractC9979u.m20294g(graph, "<this>");
        AbstractC9979u.m20294g(pointList, "pointList");
        AbstractC9979u.m20294g(matrix, "matrix");
        Path path = new Path();
        List<PointF> listPointsConvertPoints = pointsConvertPoints(graph, pointList, matrix);
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : listPointsConvertPoints) {
            if (AbstractC9979u.m20289b(pointF, AbstractC10947g0.m23944m0(listPointsConvertPoints))) {
                path.moveTo(pointF.x, pointF.y);
                path.lineTo(pointF.x, pointF.y);
            } else if (AbstractC9979u.m20289b(pointF, AbstractC10947g0.m23956y0(listPointsConvertPoints))) {
                float f12 = 2;
                path.quadTo(f10, f11, (pointF.x + f10) / f12, (pointF.y + f11) / f12);
                path.lineTo(pointF.x, pointF.y);
            } else {
                float f13 = 2;
                path.quadTo(f10, f11, (pointF.x + f10) / f13, (pointF.y + f11) / f13);
            }
            f10 = pointF.x;
            f11 = pointF.y;
        }
        listPointsConvertPoints.clear();
        return path;
    }

    public static /* synthetic */ Path pointConvertPath$default(Graph graph, List list, Matrix matrix, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            matrix = new Matrix();
        }
        return pointConvertPath(graph, list, matrix);
    }

    public static final List<PointF> pointsConvertPoints(Graph graph, List<PointF> pointList, Matrix matrix) {
        AbstractC9979u.m20294g(graph, "<this>");
        AbstractC9979u.m20294g(pointList, "pointList");
        AbstractC9979u.m20294g(matrix, "matrix");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = pointList.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPoint(graph, (PointF) it.next(), matrix));
        }
        return arrayList;
    }

    public static final Path rectConvertPath(Graph graph, RectF rectF, Matrix matrix) {
        AbstractC9979u.m20294g(graph, "<this>");
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        Path path = new Path();
        PointF pointFMapPoint = mapPoint(graph, rectF.left, rectF.top, matrix);
        path.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        path.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        PointF pointFMapPoint2 = mapPoint(graph, rectF.right, rectF.top, matrix);
        path.lineTo(pointFMapPoint2.x, pointFMapPoint2.y);
        PointF pointFMapPoint3 = mapPoint(graph, rectF.right, rectF.bottom, matrix);
        path.lineTo(pointFMapPoint3.x, pointFMapPoint3.y);
        PointF pointFMapPoint4 = mapPoint(graph, rectF.left, rectF.bottom, matrix);
        path.lineTo(pointFMapPoint4.x, pointFMapPoint4.y);
        path.close();
        return path;
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

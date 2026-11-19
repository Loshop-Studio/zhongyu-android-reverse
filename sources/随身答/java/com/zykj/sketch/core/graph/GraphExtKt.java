package com.zykj.sketch.core.graph;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0005*\u00020\u0002\u001a\u001a\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\n\u0010\u0010\u001a\u00020\u0005*\u00020\u0005\u001a\u0012\u0010\u0011\u001a\u00020\u0012*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012\u001a\u001a\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005\u001a\"\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0002\u001a\"\u0010\u0018\u001a\u00020\u0019*\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b*\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u001d\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u001f"}, m13413d2 = {"convert2FM", "", "Lcom/zykj/sketch/core/graph/Graph;", "graph", "matrix", "Landroid/graphics/Matrix;", "convert2WM", "getFP2WPMatrix", "getFP2WPRendMatrix", "getWP2FPMatrix", "getWP2LPMatrix", "initPaint", TypedValues.Custom.S_COLOR, "", "width", "", "inverts", "mapPoint", "Landroid/graphics/PointF;", "pointF", "x", "y", "maxWritingRenderOutRectF", "Landroid/graphics/RectF;", "pointConvertPath", "Landroid/graphics/Path;", "pointList", "", "pointsConvertPoints", "rectConvertPath", "rectF", "sketch_release"}, m13414k = 2, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class GraphExtKt {
    public static final void convert2FM(Graph graph, Graph graph2, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Intrinsics.checkNotNullParameter(graph2, "graph");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Graph mFatherGraph = graph2.getMFatherGraph();
        if (mFatherGraph != null) {
            matrix.preConcat(inverts(mFatherGraph.getMChildExtendMatrix()));
            matrix.preConcat(inverts(mFatherGraph.getMMatrix()));
            convert2FM(graph, mFatherGraph, matrix);
        }
    }

    public static final void convert2WM(Graph graph, Graph graph2, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Intrinsics.checkNotNullParameter(graph2, "graph");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.postConcat(graph2.getMMatrix());
        Graph mFatherGraph = graph2.getMFatherGraph();
        if (mFatherGraph != null) {
            matrix.postConcat(mFatherGraph.getMChildExtendMatrix());
            convert2WM(graph, mFatherGraph, matrix);
        }
    }

    public static final Matrix getFP2WPMatrix(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Matrix matrix = new Matrix();
        convert2WM(graph, graph, matrix);
        return matrix;
    }

    public static final Matrix getFP2WPRendMatrix(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Matrix matrix = new Matrix();
        convert2WM(graph, graph, matrix);
        matrix.postConcat(graph.getControl().getCameraMatrix());
        return matrix;
    }

    public static final Matrix getWP2FPMatrix(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Matrix matrix = new Matrix();
        convert2FM(graph, graph, matrix);
        return matrix;
    }

    public static final Matrix getWP2LPMatrix(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Matrix wP2FPMatrix = getWP2FPMatrix(graph);
        wP2FPMatrix.preConcat(inverts(graph.getMMatrix()));
        return wP2FPMatrix;
    }

    public static final void initPaint(Graph graph, int i9, float f10) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        graph.getMPaint().setColor(i9);
        graph.getMPaint().setStrokeWidth(f10);
        graph.getMPaint().setStyle(Paint.Style.STROKE);
        graph.getMPaint().setDither(true);
        graph.getMPaint().setAntiAlias(true);
    }

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

    public static final RectF maxWritingRenderOutRectF(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
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
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Path path = new Path();
        List<PointF> listPointsConvertPoints = pointsConvertPoints(graph, pointList, matrix);
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : listPointsConvertPoints) {
            if (Intrinsics.areEqual(pointF, CollectionsKt.first((List) listPointsConvertPoints))) {
                path.moveTo(pointF.x, pointF.y);
                path.lineTo(pointF.x, pointF.y);
            } else if (Intrinsics.areEqual(pointF, CollectionsKt.last((List) listPointsConvertPoints))) {
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

    public static /* synthetic */ Path pointConvertPath$default(Graph graph, List list, Matrix matrix, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            matrix = new Matrix();
        }
        return pointConvertPath(graph, list, matrix);
    }

    public static final List<PointF> pointsConvertPoints(Graph graph, List<PointF> pointList, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = pointList.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPoint(graph, (PointF) it.next(), matrix));
        }
        return arrayList;
    }

    public static final Path rectConvertPath(Graph graph, RectF rectF, Matrix matrix) {
        Intrinsics.checkNotNullParameter(graph, "<this>");
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
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

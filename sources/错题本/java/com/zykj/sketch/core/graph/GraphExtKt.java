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
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\n\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0010\u001a\u0011\u0010\u0017\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0010\u001a!\u0010\u0018\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u001c\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b \u0010!\u001a)\u0010$\u001a\u00020\u001f*\u00020\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%\u001a-\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\"*\u00020\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010(\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b(\u0010)¨\u0006*"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/Graph;", "", "x", "y", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/PointF;", "mapPoint", "(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;", "pointF", "(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;", "(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "Landroid/graphics/RectF;", "maxWritingRenderOutRectF", "(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/RectF;", "getWP2FPMatrix", "(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;", "getWP2LPMatrix", "graph", "Ld6/s;", "convert2FM", "(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/Matrix;)V", "getFP2WPMatrix", "getFP2WPRendMatrix", "convert2WM", "", TypedValues.Custom.S_COLOR, "width", "initPaint", "(Lcom/zykj/sketch/core/graph/Graph;IF)V", "rectF", "Landroid/graphics/Path;", "rectConvertPath", "(Lcom/zykj/sketch/core/graph/Graph;Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/Path;", "", "pointList", "pointConvertPath", "(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Landroid/graphics/Path;", "pointsConvertPoints", "(Lcom/zykj/sketch/core/graph/Graph;Ljava/util/List;Landroid/graphics/Matrix;)Ljava/util/List;", "inverts", "(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;", "sketch_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphExtKt {
    public static final void convert2FM(@NotNull Graph graph, @NotNull Graph graph2, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graph, "<this>");
        AbstractC5830k.m5330g(graph2, "graph");
        AbstractC5830k.m5330g(matrix, "matrix");
        Graph mFatherGraph = graph2.getMFatherGraph();
        if (mFatherGraph != null) {
            matrix.preConcat(inverts(mFatherGraph.getMChildExtendMatrix()));
            matrix.preConcat(inverts(mFatherGraph.getMMatrix()));
            convert2FM(graph, mFatherGraph, matrix);
        }
    }

    public static final void convert2WM(@NotNull Graph graph, @NotNull Graph graph2, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graph, "<this>");
        AbstractC5830k.m5330g(graph2, "graph");
        AbstractC5830k.m5330g(matrix, "matrix");
        matrix.postConcat(graph2.getMMatrix());
        Graph mFatherGraph = graph2.getMFatherGraph();
        if (mFatherGraph != null) {
            matrix.postConcat(mFatherGraph.getMChildExtendMatrix());
            convert2WM(graph, mFatherGraph, matrix);
        }
    }

    @NotNull
    public static final Matrix getFP2WPMatrix(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "<this>");
        Matrix matrix = new Matrix();
        convert2WM(graph, graph, matrix);
        return matrix;
    }

    @NotNull
    public static final Matrix getFP2WPRendMatrix(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "<this>");
        Matrix matrix = new Matrix();
        convert2WM(graph, graph, matrix);
        matrix.postConcat(graph.getControl().getCameraMatrix());
        return matrix;
    }

    @NotNull
    public static final Matrix getWP2FPMatrix(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "<this>");
        Matrix matrix = new Matrix();
        convert2FM(graph, graph, matrix);
        return matrix;
    }

    @NotNull
    public static final Matrix getWP2LPMatrix(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "<this>");
        Matrix wP2FPMatrix = getWP2FPMatrix(graph);
        wP2FPMatrix.preConcat(inverts(graph.getMMatrix()));
        return wP2FPMatrix;
    }

    public static final void initPaint(@NotNull Graph graph, int i, float f) {
        AbstractC5830k.m5330g(graph, "<this>");
        graph.getMPaint().setColor(i);
        graph.getMPaint().setStrokeWidth(f);
        graph.getMPaint().setStyle(Paint.Style.STROKE);
        graph.getMPaint().setDither(true);
        graph.getMPaint().setAntiAlias(true);
    }

    @NotNull
    public static final Matrix inverts(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "<this>");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        return matrix2;
    }

    @NotNull
    public static final PointF mapPoint(@NotNull Graph graph, float f, float f7, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graph, "<this>");
        AbstractC5830k.m5330g(matrix, "matrix");
        return mapPoint(graph, new PointF(f, f7), matrix);
    }

    @NotNull
    public static final RectF maxWritingRenderOutRectF(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "<this>");
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

    @NotNull
    public static final Path pointConvertPath(@NotNull Graph graph, @NotNull List<PointF> pointList, @NotNull Matrix matrix) { // The first and last samples are detected by PointF value; revisiting the first starts another subpath.
        AbstractC5830k.m5330g(graph, "<this>");
        AbstractC5830k.m5330g(pointList, "pointList");
        AbstractC5830k.m5330g(matrix, "matrix");
        Path path = new Path();
        List<PointF> listPointsConvertPoints = pointsConvertPoints(graph, pointList, matrix);
        float f = 0.0f;
        float f7 = 0.0f;
        for (PointF pointF : listPointsConvertPoints) {
            if (AbstractC5830k.m5325b(pointF, AbstractC5805t.m5228h0(listPointsConvertPoints))) {
                path.moveTo(pointF.x, pointF.y);
                path.lineTo(pointF.x, pointF.y);
            } else if (AbstractC5830k.m5325b(pointF, AbstractC5805t.m5235o0(listPointsConvertPoints))) {
                float f8 = 2;
                path.quadTo(f, f7, (pointF.x + f) / f8, (pointF.y + f7) / f8);
                path.lineTo(pointF.x, pointF.y);
            } else {
                float f9 = 2;
                path.quadTo(f, f7, (pointF.x + f) / f9, (pointF.y + f7) / f9);
            }
            f = pointF.x;
            f7 = pointF.y;
        }
        listPointsConvertPoints.clear();
        return path;
    }

    public static /* synthetic */ Path pointConvertPath$default(Graph graph, List list, Matrix matrix, int i, Object obj) {
        if ((i & 2) != 0) {
            matrix = new Matrix();
        }
        return pointConvertPath(graph, list, matrix);
    }

    @NotNull
    public static final List<PointF> pointsConvertPoints(@NotNull Graph graph, @NotNull List<PointF> pointList, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graph, "<this>");
        AbstractC5830k.m5330g(pointList, "pointList");
        AbstractC5830k.m5330g(matrix, "matrix");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = pointList.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPoint(graph, (PointF) it.next(), matrix));
        }
        return arrayList;
    }

    @NotNull
    public static final Path rectConvertPath(@NotNull Graph graph, @NotNull RectF rectF, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graph, "<this>");
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(matrix, "matrix");
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

    @NotNull
    public static final PointF mapPoint(@NotNull Graph graph, @NotNull PointF pointF, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(graph, "<this>");
        AbstractC5830k.m5330g(pointF, "pointF");
        AbstractC5830k.m5330g(matrix, "matrix");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        return new PointF(fArr[0], fArr[1]);
    }

    @NotNull
    public static final PointF mapPoint(@NotNull Matrix matrix, @NotNull PointF pointF) {
        AbstractC5830k.m5330g(matrix, "<this>");
        AbstractC5830k.m5330g(pointF, "pointF");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{pointF.x, pointF.y});
        return new PointF(fArr[0], fArr[1]);
    }
}

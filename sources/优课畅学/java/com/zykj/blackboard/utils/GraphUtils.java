package com.zykj.blackboard.utils;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.core.graph.root.BoundedContainerGraph;
import com.zykj.blackboard.core.graph.stroke.BeelineStrokeGraph;
import com.zykj.blackboard.core.graph.stroke.StrokeGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import com.zykj.board.EzyTouchEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;

/* loaded from: classes4.dex */
public final class GraphUtils {
    public static final GraphUtils INSTANCE = new GraphUtils();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyGraphEnum.GraphEnum.values().length];
            iArr[EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.ordinal()] = 1;
            iArr[EzyGraphEnum.GraphEnum.IMAGE_GRAPH.ordinal()] = 2;
            iArr[EzyGraphEnum.GraphEnum.STROKE_GRAPH.ordinal()] = 3;
            iArr[EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH.ordinal()] = 4;
            iArr[EzyGraphEnum.GraphEnum.GROUP_GRAPH.ordinal()] = 5;
            iArr[EzyGraphEnum.GraphEnum.TEXT_GRAPH.ordinal()] = 6;
            iArr[EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GraphUtils() {
    }

    private final Matrix convertMatrix(EzyMatrix.Matrix matrix) {
        float[] fArr = {matrix.getScaleX(), matrix.m8231q(), matrix.m8233s(), matrix.m8232r(), matrix.getScaleY(), matrix.m8234t(), matrix.m8228n(), matrix.m8229o(), matrix.m8230p()};
        Matrix matrix2 = new Matrix();
        matrix2.setValues(fArr);
        return matrix2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0027. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.stroke.StrokeGraph, com.zykj.blackboard.core.graph.stroke.WritingGraph] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.stroke.BeelineStrokeGraph, com.zykj.blackboard.core.graph.stroke.WritingGraph] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.group.TextGraph] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.group.GeometryGraph] */
    public final Graph buildGraph(SourceLoader sourceLoader, EzyPageSnapshot.PageSnapshot.GraphSnapshot pageSnapshot) {
        Graph boundedContainerGraph;
        String strPath;
        ImageGraph imageGraph;
        ImageGraph imageGraph2;
        SourceLoader sourceLoad = sourceLoader;
        AbstractC9133u.m16133g(sourceLoad, "sourceLoad");
        AbstractC9133u.m16133g(pageSnapshot, "pageSnapshot");
        EzyGraphEnum.GraphEnum graphEnumM8378A = pageSnapshot.m8378A();
        Graph graph = null;
        absolutePath = null;
        absolutePath = null;
        String absolutePath = null;
        switch (graphEnumM8378A == null ? -1 : WhenMappings.$EnumSwitchMapping$0[graphEnumM8378A.ordinal()]) {
            case 1:
                String id = pageSnapshot.getId();
                AbstractC9133u.m16132f(id, "pageSnapshot.id");
                EzyRectF.RectF rectFM8381D = pageSnapshot.m8381D();
                AbstractC9133u.m16132f(rectFM8381D, "pageSnapshot.outRect");
                boundedContainerGraph = new BoundedContainerGraph(id, GraphUtilsKt.covertRectF(rectFM8381D), null, null, 12, null);
                GraphUtils graphUtils = INSTANCE;
                EzyMatrix.Matrix matrixM8380C = pageSnapshot.m8380C();
                AbstractC9133u.m16132f(matrixM8380C, "pageSnapshot.matrix");
                boundedContainerGraph.initMatrix(graphUtils.convertMatrix(matrixM8380C));
                graph = boundedContainerGraph;
                break;
            case 2:
                String id2 = pageSnapshot.getId();
                AbstractC9133u.m16132f(id2, "pageSnapshot.id");
                EzyRectF.RectF rectFM8381D2 = pageSnapshot.m8381D();
                AbstractC9133u.m16132f(rectFM8381D2, "pageSnapshot.outRect");
                RectF rectFCovertRectF = GraphUtilsKt.covertRectF(rectFM8381D2);
                String strM8385H = pageSnapshot.m8385H();
                AbstractC9133u.m16132f(strM8385H, "pageSnapshot.sourceFileName");
                sourceLoad = sourceLoader;
                ImageGraph imageGraph3 = new ImageGraph(id2, rectFCovertRectF, sourceLoad, strM8385H, pageSnapshot.m8386I());
                GraphUtils graphUtils2 = INSTANCE;
                EzyMatrix.Matrix matrixM8380C2 = pageSnapshot.m8380C();
                AbstractC9133u.m16132f(matrixM8380C2, "pageSnapshot.matrix");
                imageGraph3.initMatrix(graphUtils2.convertMatrix(matrixM8380C2));
                String filePath = pageSnapshot.m8393z();
                if (filePath != null) {
                    AbstractC9133u.m16132f(filePath, "filePath");
                    if (filePath.length() != 0 && (strPath = sourceLoad.path()) != null) {
                        absolutePath = new File(SourceRouterRecord.Companion.getResPath(strPath, DocumentType.IMAGE), filePath).getAbsolutePath();
                    }
                }
                imageGraph3.setFilePath(absolutePath);
                imageGraph = imageGraph3;
                graph = imageGraph;
                break;
            case 3:
                String id3 = pageSnapshot.getId();
                AbstractC9133u.m16132f(id3, "pageSnapshot.id");
                EzyRectF.RectF rectFM8381D3 = pageSnapshot.m8381D();
                AbstractC9133u.m16132f(rectFM8381D3, "pageSnapshot.outRect");
                ?? strokeGraph = new StrokeGraph(id3, GraphUtilsKt.covertRectF(rectFM8381D3), sourceLoader, pageSnapshot.m8385H(), Integer.valueOf(pageSnapshot.m8386I()));
                GraphUtils graphUtils3 = INSTANCE;
                EzyMatrix.Matrix matrixM8380C3 = pageSnapshot.m8380C();
                AbstractC9133u.m16132f(matrixM8380C3, "pageSnapshot.matrix");
                strokeGraph.initMatrix(graphUtils3.convertMatrix(matrixM8380C3));
                imageGraph2 = strokeGraph;
                if (pageSnapshot.m8388K()) {
                    EzyPaint.Paint paintM8382E = pageSnapshot.m8382E();
                    AbstractC9133u.m16132f(paintM8382E, "pageSnapshot.paint");
                    strokeGraph.setPaint(GraphUtilsKt.covertPaint(paintM8382E), pageSnapshot.m8382E().m8476j(), pageSnapshot.m8382E().m8477k());
                    imageGraph2 = strokeGraph;
                }
                sourceLoad = sourceLoader;
                imageGraph = imageGraph2;
                graph = imageGraph;
                break;
            case 4:
                String id4 = pageSnapshot.getId();
                AbstractC9133u.m16132f(id4, "pageSnapshot.id");
                EzyRectF.RectF rectFM8381D4 = pageSnapshot.m8381D();
                AbstractC9133u.m16132f(rectFM8381D4, "pageSnapshot.outRect");
                ?? beelineStrokeGraph = new BeelineStrokeGraph(id4, GraphUtilsKt.covertRectF(rectFM8381D4), sourceLoader, pageSnapshot.m8385H(), Integer.valueOf(pageSnapshot.m8386I()));
                GraphUtils graphUtils4 = INSTANCE;
                EzyMatrix.Matrix matrixM8380C4 = pageSnapshot.m8380C();
                AbstractC9133u.m16132f(matrixM8380C4, "pageSnapshot.matrix");
                beelineStrokeGraph.initMatrix(graphUtils4.convertMatrix(matrixM8380C4));
                imageGraph2 = beelineStrokeGraph;
                if (pageSnapshot.m8388K()) {
                    EzyPaint.Paint paintM8382E2 = pageSnapshot.m8382E();
                    AbstractC9133u.m16132f(paintM8382E2, "pageSnapshot.paint");
                    beelineStrokeGraph.setPaint(GraphUtilsKt.covertPaint(paintM8382E2), pageSnapshot.m8382E().m8476j(), pageSnapshot.m8382E().m8477k());
                    imageGraph2 = beelineStrokeGraph;
                }
                sourceLoad = sourceLoader;
                imageGraph = imageGraph2;
                graph = imageGraph;
                break;
            case 5:
                String id5 = pageSnapshot.getId();
                AbstractC9133u.m16132f(id5, "pageSnapshot.id");
                EzyRectF.RectF rectFM8381D5 = pageSnapshot.m8381D();
                AbstractC9133u.m16132f(rectFM8381D5, "pageSnapshot.outRect");
                boundedContainerGraph = new GroupGraph(id5, GraphUtilsKt.covertRectF(rectFM8381D5), null, null, 12, null);
                GraphUtils graphUtils5 = INSTANCE;
                EzyMatrix.Matrix matrixM8380C5 = pageSnapshot.m8380C();
                AbstractC9133u.m16132f(matrixM8380C5, "pageSnapshot.matrix");
                boundedContainerGraph.initMatrix(graphUtils5.convertMatrix(matrixM8380C5));
                sourceLoad = sourceLoader;
                graph = boundedContainerGraph;
                break;
            case 6:
                String id6 = pageSnapshot.getId();
                AbstractC9133u.m16132f(id6, "pageSnapshot.id");
                EzyRectF.RectF rectFM8381D6 = pageSnapshot.m8381D();
                AbstractC9133u.m16132f(rectFM8381D6, "pageSnapshot.outRect");
                sourceLoad = sourceLoader;
                ?? textGraph = new TextGraph(id6, GraphUtilsKt.covertRectF(rectFM8381D6), sourceLoad, pageSnapshot.m8385H(), Integer.valueOf(pageSnapshot.m8386I()));
                GraphUtils graphUtils6 = INSTANCE;
                EzyMatrix.Matrix matrixM8380C6 = pageSnapshot.m8380C();
                AbstractC9133u.m16132f(matrixM8380C6, "pageSnapshot.matrix");
                textGraph.initMatrix(graphUtils6.convertMatrix(matrixM8380C6));
                EzyPaint.Paint paintM8382E3 = pageSnapshot.m8382E();
                AbstractC9133u.m16132f(paintM8382E3, "pageSnapshot.paint");
                textGraph.setPaint(GraphUtilsKt.covertPaint(paintM8382E3));
                textGraph.setContent(pageSnapshot.getContent());
                imageGraph = textGraph;
                graph = imageGraph;
                break;
            case 7:
                String id7 = pageSnapshot.getId();
                AbstractC9133u.m16132f(id7, "pageSnapshot.id");
                EzyRectF.RectF rectFM8381D7 = pageSnapshot.m8381D();
                AbstractC9133u.m16132f(rectFM8381D7, "pageSnapshot.outRect");
                ?? geometryGraph = new GeometryGraph(id7, GraphUtilsKt.covertRectF(rectFM8381D7), sourceLoad, pageSnapshot.m8385H(), Integer.valueOf(pageSnapshot.m8386I()));
                GraphUtils graphUtils7 = INSTANCE;
                EzyMatrix.Matrix matrixM8380C7 = pageSnapshot.m8380C();
                AbstractC9133u.m16132f(matrixM8380C7, "pageSnapshot.matrix");
                geometryGraph.initMatrix(graphUtils7.convertMatrix(matrixM8380C7));
                EzyPaint.Paint paintM8382E4 = pageSnapshot.m8382E();
                AbstractC9133u.m16132f(paintM8382E4, "pageSnapshot.paint");
                geometryGraph.setPaint(GraphUtilsKt.covertPaint(paintM8382E4));
                List<EzyPointF.PointF> listM8384G = pageSnapshot.m8384G();
                AbstractC9133u.m16132f(listM8384G, "pageSnapshot.pointListList");
                ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM8384G, 10));
                for (EzyPointF.PointF it : listM8384G) {
                    AbstractC9133u.m16132f(it, "it");
                    arrayList.add(GraphUtilsKt.covertPointF(it));
                }
                geometryGraph.setPointList(arrayList);
                imageGraph2 = geometryGraph;
                sourceLoad = sourceLoader;
                imageGraph = imageGraph2;
                graph = imageGraph;
                break;
        }
        for (EzyPageSnapshot.PageSnapshot.GraphSnapshot childPageSnapshot : pageSnapshot.getChildGraphList()) {
            AbstractC9133u.m16132f(childPageSnapshot, "childPageSnapshot");
            Graph graphBuildGraph = buildGraph(sourceLoad, childPageSnapshot);
            if (graphBuildGraph != null && graph != null) {
                graph.addGraph(graphBuildGraph);
            }
        }
        return graph;
    }

    public final Path eventConvertPath(List<EzyTouchEvent.TouchEvent> pointList) {
        AbstractC9133u.m16133g(pointList, "pointList");
        Path path = new Path();
        float x10 = 0.0f;
        float y10 = 0.0f;
        for (EzyTouchEvent.TouchEvent touchEvent : pointList) {
            if (AbstractC9133u.m16128b(touchEvent, AbstractC8778f0.m14566l0(pointList))) {
                path.moveTo(touchEvent.getX(), touchEvent.getY());
                path.lineTo(touchEvent.getX(), touchEvent.getY());
            } else if (AbstractC9133u.m16128b(touchEvent, AbstractC8778f0.m14578x0(pointList))) {
                float f10 = 2;
                path.quadTo(x10, y10, (touchEvent.getX() + x10) / f10, (touchEvent.getY() + y10) / f10);
                path.lineTo(touchEvent.getX(), touchEvent.getY());
            } else {
                float f11 = 2;
                path.quadTo(x10, y10, (touchEvent.getX() + x10) / f11, (touchEvent.getY() + y10) / f11);
            }
            x10 = touchEvent.getX();
            y10 = touchEvent.getY();
        }
        return path;
    }

    public final RectF findPointListRectF(List<EzyTouchEvent.TouchEvent> pointList) {
        AbstractC9133u.m16133g(pointList, "pointList");
        RectF rectF = new RectF();
        if (pointList.isEmpty()) {
            return rectF;
        }
        PointF pointF = new PointF(((EzyTouchEvent.TouchEvent) AbstractC8778f0.m14566l0(pointList)).getX(), ((EzyTouchEvent.TouchEvent) AbstractC8778f0.m14566l0(pointList)).getY());
        boolean z10 = true;
        for (EzyTouchEvent.TouchEvent touchEvent : pointList) {
            if (pointF.x != touchEvent.getX() || pointF.y != touchEvent.getY()) {
                z10 = false;
            }
        }
        if (!z10) {
            eventConvertPath(pointList).computeBounds(rectF, true);
            return rectF;
        }
        float f10 = pointF.x;
        float f11 = 1;
        float f12 = pointF.y;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        return rectF;
    }

    public final double line(Point pointA, Point pointB, Point pointP) {
        AbstractC9133u.m16133g(pointA, "pointA");
        AbstractC9133u.m16133g(pointB, "pointB");
        AbstractC9133u.m16133g(pointP, "pointP");
        int i10 = pointA.y - pointB.y;
        int i11 = pointB.x - pointA.x;
        return Math.abs(((pointP.x * i10) + (pointP.y * i11)) + ((r5 * r1) - (r0 * r6))) / Math.sqrt((i10 * i10) + (i11 * i11));
    }

    public final EzyPageSnapshot.PageSnapshot snapshotGraphToGraph(String filePath) throws IOException {
        AbstractC9133u.m16133g(filePath, "filePath");
        if (!new File(filePath).exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        EzyPageSnapshot.PageSnapshot pageSnapshotM8346n = EzyPageSnapshot.PageSnapshot.m8346n(fileInputStream);
        fileInputStream.close();
        return pageSnapshotM8346n;
    }
}

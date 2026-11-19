package com.zykj.blackboard.utils;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyPointF$PointF;
import com.zykj.board.EzyRectF$RectF;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/blackboard/utils/GraphUtils;", "", "()V", "buildGraph", "Lcom/zykj/blackboard/core/graph/Graph;", "sourceLoad", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "pageSnapshot", "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;", "convertMatrix", "Landroid/graphics/Matrix;", "matrix", "Lcom/zykj/board/EzyMatrix$Matrix;", "eventConvertPath", "Landroid/graphics/Path;", "pointList", "", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", "findPointListRectF", "Landroid/graphics/RectF;", "line", "", "pointA", "Landroid/graphics/Point;", "pointB", "pointP", "snapshotGraphToGraph", "Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;", "filePath", "", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphUtils {

    @NotNull
    public static final GraphUtils INSTANCE = new GraphUtils();

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyGraphEnum$GraphEnum.values().length];
            iArr[EzyGraphEnum$GraphEnum.BOUNDED_CONTAINER_GRAPH.ordinal()] = 1;
            iArr[EzyGraphEnum$GraphEnum.IMAGE_GRAPH.ordinal()] = 2;
            iArr[EzyGraphEnum$GraphEnum.STROKE_GRAPH.ordinal()] = 3;
            iArr[EzyGraphEnum$GraphEnum.BEELINE_STROKE_GRAPH.ordinal()] = 4;
            iArr[EzyGraphEnum$GraphEnum.GROUP_GRAPH.ordinal()] = 5;
            iArr[EzyGraphEnum$GraphEnum.TEXT_GRAPH.ordinal()] = 6;
            iArr[EzyGraphEnum$GraphEnum.GEOMETRY_GRAPH.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GraphUtils() {
    }

    private final Matrix convertMatrix(EzyMatrix$Matrix matrix) {
        float[] fArr = {matrix.getScaleX(), matrix.getSkewX(), matrix.getTransX(), matrix.getSkewY(), matrix.getScaleY(), matrix.getTransY(), matrix.getPerSp0(), matrix.getPerSp1(), matrix.getPerSp2()};
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
    @Nullable
    public final Graph buildGraph(@NotNull SourceLoader sourceLoad, @NotNull EzyPageSnapshot$PageSnapshot.GraphSnapshot pageSnapshot) {
        Graph boundedContainerGraph;
        String strPath;
        ImageGraph imageGraph;
        ImageGraph imageGraph2;
        SourceLoader sourceLoad2 = sourceLoad;
        AbstractC5830k.m5330g(sourceLoad2, "sourceLoad");
        AbstractC5830k.m5330g(pageSnapshot, "pageSnapshot");
        EzyGraphEnum$GraphEnum graphEnum = pageSnapshot.getGraphEnum();
        Graph graph = null;
        absolutePath = null;
        absolutePath = null;
        String absolutePath = null;
        switch (graphEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[graphEnum.ordinal()]) {
            case 1:
                String id = pageSnapshot.getId();
                AbstractC5830k.m5329f(id, "pageSnapshot.id");
                EzyRectF$RectF outRect = pageSnapshot.getOutRect();
                AbstractC5830k.m5329f(outRect, "pageSnapshot.outRect");
                boundedContainerGraph = new BoundedContainerGraph(id, GraphUtilsKt.covertRectF(outRect), null, null, 12, null);
                GraphUtils graphUtils = INSTANCE;
                EzyMatrix$Matrix matrix = pageSnapshot.getMatrix();
                AbstractC5830k.m5329f(matrix, "pageSnapshot.matrix");
                boundedContainerGraph.initMatrix(graphUtils.convertMatrix(matrix));
                graph = boundedContainerGraph;
                break;
            case 2:
                String id2 = pageSnapshot.getId();
                AbstractC5830k.m5329f(id2, "pageSnapshot.id");
                EzyRectF$RectF outRect2 = pageSnapshot.getOutRect();
                AbstractC5830k.m5329f(outRect2, "pageSnapshot.outRect");
                RectF rectFCovertRectF = GraphUtilsKt.covertRectF(outRect2);
                String sourceFileName = pageSnapshot.getSourceFileName();
                AbstractC5830k.m5329f(sourceFileName, "pageSnapshot.sourceFileName");
                sourceLoad2 = sourceLoad;
                ImageGraph imageGraph3 = new ImageGraph(id2, rectFCovertRectF, sourceLoad2, sourceFileName, pageSnapshot.getSourceId());
                GraphUtils graphUtils2 = INSTANCE;
                EzyMatrix$Matrix matrix2 = pageSnapshot.getMatrix();
                AbstractC5830k.m5329f(matrix2, "pageSnapshot.matrix");
                imageGraph3.initMatrix(graphUtils2.convertMatrix(matrix2));
                String filePath = pageSnapshot.getFilePath();
                if (filePath != null && filePath.length() != 0 && (strPath = sourceLoad2.path()) != null) {
                    absolutePath = new File(SourceRouterRecord.INSTANCE.getResPath(strPath, DocumentType.IMAGE), filePath).getAbsolutePath();
                }
                imageGraph3.setFilePath(absolutePath);
                imageGraph = imageGraph3;
                graph = imageGraph;
                break;
            case 3:
                String id3 = pageSnapshot.getId();
                AbstractC5830k.m5329f(id3, "pageSnapshot.id");
                EzyRectF$RectF outRect3 = pageSnapshot.getOutRect();
                AbstractC5830k.m5329f(outRect3, "pageSnapshot.outRect");
                ?? strokeGraph = new StrokeGraph(id3, GraphUtilsKt.covertRectF(outRect3), sourceLoad, pageSnapshot.getSourceFileName(), Integer.valueOf(pageSnapshot.getSourceId()));
                GraphUtils graphUtils3 = INSTANCE;
                EzyMatrix$Matrix matrix3 = pageSnapshot.getMatrix();
                AbstractC5830k.m5329f(matrix3, "pageSnapshot.matrix");
                strokeGraph.initMatrix(graphUtils3.convertMatrix(matrix3));
                imageGraph2 = strokeGraph;
                if (pageSnapshot.hasPaint()) {
                    EzyPaint$Paint paint = pageSnapshot.getPaint();
                    AbstractC5830k.m5329f(paint, "pageSnapshot.paint");
                    strokeGraph.setPaint(GraphUtilsKt.covertPaint(paint), pageSnapshot.getPaint().getItemLength(), pageSnapshot.getPaint().getSpacing());
                    imageGraph2 = strokeGraph;
                }
                sourceLoad2 = sourceLoad;
                imageGraph = imageGraph2;
                graph = imageGraph;
                break;
            case 4:
                String id4 = pageSnapshot.getId();
                AbstractC5830k.m5329f(id4, "pageSnapshot.id");
                EzyRectF$RectF outRect4 = pageSnapshot.getOutRect();
                AbstractC5830k.m5329f(outRect4, "pageSnapshot.outRect");
                ?? beelineStrokeGraph = new BeelineStrokeGraph(id4, GraphUtilsKt.covertRectF(outRect4), sourceLoad, pageSnapshot.getSourceFileName(), Integer.valueOf(pageSnapshot.getSourceId()));
                GraphUtils graphUtils4 = INSTANCE;
                EzyMatrix$Matrix matrix4 = pageSnapshot.getMatrix();
                AbstractC5830k.m5329f(matrix4, "pageSnapshot.matrix");
                beelineStrokeGraph.initMatrix(graphUtils4.convertMatrix(matrix4));
                imageGraph2 = beelineStrokeGraph;
                if (pageSnapshot.hasPaint()) {
                    EzyPaint$Paint paint2 = pageSnapshot.getPaint();
                    AbstractC5830k.m5329f(paint2, "pageSnapshot.paint");
                    beelineStrokeGraph.setPaint(GraphUtilsKt.covertPaint(paint2), pageSnapshot.getPaint().getItemLength(), pageSnapshot.getPaint().getSpacing());
                    imageGraph2 = beelineStrokeGraph;
                }
                sourceLoad2 = sourceLoad;
                imageGraph = imageGraph2;
                graph = imageGraph;
                break;
            case 5:
                String id5 = pageSnapshot.getId();
                AbstractC5830k.m5329f(id5, "pageSnapshot.id");
                EzyRectF$RectF outRect5 = pageSnapshot.getOutRect();
                AbstractC5830k.m5329f(outRect5, "pageSnapshot.outRect");
                boundedContainerGraph = new GroupGraph(id5, GraphUtilsKt.covertRectF(outRect5), null, null, 12, null);
                GraphUtils graphUtils5 = INSTANCE;
                EzyMatrix$Matrix matrix5 = pageSnapshot.getMatrix();
                AbstractC5830k.m5329f(matrix5, "pageSnapshot.matrix");
                boundedContainerGraph.initMatrix(graphUtils5.convertMatrix(matrix5));
                sourceLoad2 = sourceLoad;
                graph = boundedContainerGraph;
                break;
            case 6:
                String id6 = pageSnapshot.getId();
                AbstractC5830k.m5329f(id6, "pageSnapshot.id");
                EzyRectF$RectF outRect6 = pageSnapshot.getOutRect();
                AbstractC5830k.m5329f(outRect6, "pageSnapshot.outRect");
                sourceLoad2 = sourceLoad;
                ?? textGraph = new TextGraph(id6, GraphUtilsKt.covertRectF(outRect6), sourceLoad2, pageSnapshot.getSourceFileName(), Integer.valueOf(pageSnapshot.getSourceId()));
                GraphUtils graphUtils6 = INSTANCE;
                EzyMatrix$Matrix matrix6 = pageSnapshot.getMatrix();
                AbstractC5830k.m5329f(matrix6, "pageSnapshot.matrix");
                textGraph.initMatrix(graphUtils6.convertMatrix(matrix6));
                EzyPaint$Paint paint3 = pageSnapshot.getPaint();
                AbstractC5830k.m5329f(paint3, "pageSnapshot.paint");
                textGraph.setPaint(GraphUtilsKt.covertPaint(paint3));
                textGraph.setContent(pageSnapshot.getContent());
                imageGraph = textGraph;
                graph = imageGraph;
                break;
            case 7:
                String id7 = pageSnapshot.getId();
                AbstractC5830k.m5329f(id7, "pageSnapshot.id");
                EzyRectF$RectF outRect7 = pageSnapshot.getOutRect();
                AbstractC5830k.m5329f(outRect7, "pageSnapshot.outRect");
                ?? geometryGraph = new GeometryGraph(id7, GraphUtilsKt.covertRectF(outRect7), sourceLoad2, pageSnapshot.getSourceFileName(), Integer.valueOf(pageSnapshot.getSourceId()));
                GraphUtils graphUtils7 = INSTANCE;
                EzyMatrix$Matrix matrix7 = pageSnapshot.getMatrix();
                AbstractC5830k.m5329f(matrix7, "pageSnapshot.matrix");
                geometryGraph.initMatrix(graphUtils7.convertMatrix(matrix7));
                EzyPaint$Paint paint4 = pageSnapshot.getPaint();
                AbstractC5830k.m5329f(paint4, "pageSnapshot.paint");
                geometryGraph.setPaint(GraphUtilsKt.covertPaint(paint4));
                List<EzyPointF$PointF> pointListList = pageSnapshot.getPointListList();
                AbstractC5830k.m5329f(pointListList, "pageSnapshot.pointListList");
                ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(pointListList, 10));
                for (EzyPointF$PointF it : pointListList) {
                    AbstractC5830k.m5329f(it, "it");
                    arrayList.add(GraphUtilsKt.covertPointF(it));
                }
                geometryGraph.setPointList(arrayList);
                imageGraph2 = geometryGraph;
                sourceLoad2 = sourceLoad;
                imageGraph = imageGraph2;
                graph = imageGraph;
                break;
        }
        for (EzyPageSnapshot$PageSnapshot.GraphSnapshot childPageSnapshot : pageSnapshot.getChildGraphList()) {
            AbstractC5830k.m5329f(childPageSnapshot, "childPageSnapshot");
            Graph graphBuildGraph = buildGraph(sourceLoad2, childPageSnapshot);
            if (graphBuildGraph != null && graph != null) {
                graph.addGraph(graphBuildGraph);
            }
        }
        return graph;
    }

    @NotNull
    public final Path eventConvertPath(@NotNull List<EzyTouchEvent$TouchEvent> pointList) {
        AbstractC5830k.m5330g(pointList, "pointList");
        Path path = new Path();
        float x3 = 0.0f;
        float y2 = 0.0f;
        for (EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent : pointList) {
            if (AbstractC5830k.m5325b(ezyTouchEvent$TouchEvent, AbstractC5805t.m5228h0(pointList))) {
                path.moveTo(ezyTouchEvent$TouchEvent.getX(), ezyTouchEvent$TouchEvent.getY());
                path.lineTo(ezyTouchEvent$TouchEvent.getX(), ezyTouchEvent$TouchEvent.getY());
            } else if (AbstractC5830k.m5325b(ezyTouchEvent$TouchEvent, AbstractC5805t.m5235o0(pointList))) {
                float f = 2;
                path.quadTo(x3, y2, (ezyTouchEvent$TouchEvent.getX() + x3) / f, (ezyTouchEvent$TouchEvent.getY() + y2) / f);
                path.lineTo(ezyTouchEvent$TouchEvent.getX(), ezyTouchEvent$TouchEvent.getY());
            } else {
                float f7 = 2;
                path.quadTo(x3, y2, (ezyTouchEvent$TouchEvent.getX() + x3) / f7, (ezyTouchEvent$TouchEvent.getY() + y2) / f7);
            }
            x3 = ezyTouchEvent$TouchEvent.getX();
            y2 = ezyTouchEvent$TouchEvent.getY();
        }
        return path;
    }

    @NotNull
    public final RectF findPointListRectF(@NotNull List<EzyTouchEvent$TouchEvent> pointList) {
        AbstractC5830k.m5330g(pointList, "pointList");
        RectF rectF = new RectF();
        if (pointList.isEmpty()) {
            return rectF;
        }
        PointF pointF = new PointF(((EzyTouchEvent$TouchEvent) AbstractC5805t.m5228h0(pointList)).getX(), ((EzyTouchEvent$TouchEvent) AbstractC5805t.m5228h0(pointList)).getY());
        boolean z8 = true;
        for (EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent : pointList) {
            if (pointF.x != ezyTouchEvent$TouchEvent.getX() || pointF.y != ezyTouchEvent$TouchEvent.getY()) {
                z8 = false;
            }
        }
        if (!z8) {
            eventConvertPath(pointList).computeBounds(rectF, true);
            return rectF;
        }
        float f = pointF.x;
        float f7 = 1;
        float f8 = pointF.y;
        rectF.set(f - f7, f8 - f7, f + f7, f8 + f7);
        return rectF;
    }

    public final double line(@NotNull Point pointA, @NotNull Point pointB, @NotNull Point pointP) {
        AbstractC5830k.m5330g(pointA, "pointA");
        AbstractC5830k.m5330g(pointB, "pointB");
        AbstractC5830k.m5330g(pointP, "pointP");
        int i = pointA.y - pointB.y;
        int i8 = pointB.x - pointA.x;
        return Math.abs(((pointP.y * i8) + (pointP.x * i)) + ((r5 * r1) - (r0 * r6))) / Math.sqrt((i8 * i8) + (i * i));
    }

    @Nullable
    public final EzyPageSnapshot$PageSnapshot snapshotGraphToGraph(@NotNull String filePath) {
        AbstractC5830k.m5330g(filePath, "filePath");
        if (!new File(filePath).exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        EzyPageSnapshot$PageSnapshot from = EzyPageSnapshot$PageSnapshot.parseFrom(fileInputStream);
        fileInputStream.close();
        return from;
    }
}

package com.zykj.sketch.core.graph;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Any;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.extensions.ExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u0018\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0015J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010 J%\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\r\u0010\"J-\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u0005R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0016028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, m5110d2 = {"Lcom/zykj/sketch/core/graph/StrokeGraph;", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;)V", "Landroid/graphics/RectF;", "touchRect", "Landroid/graphics/Path;", "touchPath", "graphRect", "graphPath", "", "isIntersect", "(Landroid/graphics/RectF;Landroid/graphics/Path;Landroid/graphics/RectF;Landroid/graphics/Path;)Z", "Landroid/graphics/Canvas;", "canvas", "Ld6/s;", "render", "(Landroid/graphics/Canvas;)V", "onMeasure", "()V", "Landroid/graphics/PointF;", "point", "addPoint", "(Landroid/graphics/PointF;)V", "addFPPoint", "", "x", "y", "(FF)V", "onDestroy", "(Landroid/graphics/Path;)Z", "radius", "(FFF)Z", TypedValues.CycleType.S_WAVE_OFFSET, "", "Lcom/zykj/sketch/core/graph/Graph;", "findGraph", "(FFF)Ljava/util/List;", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "getSnapshot", "()Lcom/zykj/sketch/GraphSnapshot$GraphData;", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "graphType", "()Lcom/zykj/sketch/GraphSnapshot$GraphType;", "Lcom/zykj/sketch/core/listener/IControl;", "getActionControl", "()Lcom/zykj/sketch/core/listener/IControl;", "setActionControl", "Ljava/util/concurrent/CopyOnWriteArrayList;", "fPointList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/graphics/Matrix;", "tempMatrix", "Landroid/graphics/Matrix;", "tempPath", "Landroid/graphics/Path;", "", "tempSize", "I", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class StrokeGraph extends WritingGroupGraph {

    @NotNull
    private IControl actionControl;

    @NotNull
    private final CopyOnWriteArrayList<PointF> fPointList;

    @Nullable
    private Matrix tempMatrix;

    @NotNull
    private Path tempPath;
    private int tempSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeGraph(@NotNull IControl actionControl) {
        super(actionControl);
        AbstractC5830k.m5330g(actionControl, "actionControl");
        this.actionControl = actionControl;
        this.fPointList = new CopyOnWriteArrayList<>();
        this.tempPath = new Path();
    }

    public final void addFPPoint(@NotNull PointF point) {
        AbstractC5830k.m5330g(point, "point");
        this.fPointList.add(point);
    }

    public final void addPoint(@NotNull PointF point) {
        AbstractC5830k.m5330g(point, "point");
        this.fPointList.add(GraphExtKt.mapPoint(this, point, GraphExtKt.getWP2FPMatrix(this)));
    }

    @Override // com.zykj.sketch.core.graph.Graph
    @NotNull
    public List<Graph> findGraph(float x3, float y2, float offset) {
        return new ArrayList();
    }

    @NotNull
    public final IControl getActionControl() {
        return this.actionControl;
    }

    @Override // com.zykj.sketch.core.graph.WritingGroupGraph, com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData.Builder snapshotBuild = getSnapshotBuild();
        GraphSnapshot.Touch.Builder builderNewBuilder = GraphSnapshot.Touch.newBuilder();
        for (PointF pointF : this.fPointList) {
            builderNewBuilder.addPointF(GraphSnapshot.PointF.newBuilder().setX(pointF.x).setY(pointF.y).build());
        }
        snapshotBuild.setExtra(Any.pack(builderNewBuilder.build()));
        GraphSnapshot.GraphData graphDataBuild = snapshotBuild.build();
        AbstractC5830k.m5329f(graphDataBuild, "builder.build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.WritingGroupGraph, com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.STROKE_GRAPH;
    }

    public final boolean isIntersect(@NotNull Path touchPath) {
        AbstractC5830k.m5330g(touchPath, "touchPath");
        RectF rectF = new RectF();
        touchPath.computeBounds(rectF, true);
        if (this.fPointList.isEmpty() || this.fPointList.size() >= 4) {
            Path pathCreatePath = createPath(GraphExtKt.pointsConvertPoints(this, this.fPointList, GraphExtKt.getFP2WPMatrix(this)));
            RectF rectF2 = new RectF();
            pathCreatePath.computeBounds(rectF2, true);
            return isIntersect(rectF, touchPath, rectF2, pathCreatePath);
        }
        PointF pointF = (PointF) AbstractC5805t.m5235o0(this.fPointList);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.fPointList);
        float f = 2;
        arrayList.add(new PointF(pointF.x - f, pointF.y - f));
        arrayList.add(new PointF(pointF.x + f, pointF.y - f));
        arrayList.add(new PointF(pointF.x + f, pointF.y + f));
        arrayList.add(new PointF(pointF.x - f, pointF.y + f));
        arrayList.add(new PointF(pointF.x, pointF.y));
        Path pathCreatePath2 = createPath(GraphExtKt.pointsConvertPoints(this, arrayList, GraphExtKt.getFP2WPMatrix(this)));
        RectF rectF3 = new RectF();
        pathCreatePath2.computeBounds(rectF3, true);
        return isIntersect(rectF, touchPath, rectF3, pathCreatePath2);
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void onDestroy() {
        super.onDestroy();
        this.fPointList.clear();
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public void onMeasure() {
        getMOutRect().setEmpty();
        for (PointF pointF : this.fPointList) {
            if (getMOutRect().isEmpty()) {
                getMOutRect().left = pointF.x;
                getMOutRect().top = pointF.y;
                float f = 1;
                getMOutRect().right = pointF.x + f;
                getMOutRect().bottom = pointF.y + f;
            }
            if (getMOutRect().left > pointF.x) {
                getMOutRect().left = pointF.x;
            } else if (getMOutRect().right < pointF.x) {
                getMOutRect().right = pointF.x;
            }
            if (getMOutRect().top > pointF.y) {
                getMOutRect().top = pointF.y;
            } else if (getMOutRect().bottom < pointF.y) {
                getMOutRect().bottom = pointF.y;
            }
        }
        setChildExtendMatrix(new PointF(getMOutRect().left, getMOutRect().top));
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IDraw
    public void render(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        Matrix fP2WPRendMatrix = GraphExtKt.getFP2WPRendMatrix(this);
        if (!this.fPointList.isEmpty() && this.fPointList.size() < 2) {
            PointF pointF = this.fPointList.get(0);
            AbstractC5830k.m5329f(pointF, "fPointList[0]");
            PointF pointFMapPoint = GraphExtKt.mapPoint(fP2WPRendMatrix, pointF);
            canvas.drawPoint(pointFMapPoint.x, pointFMapPoint.y, getMPaint());
            return;
        }
        if (AbstractC5830k.m5325b(fP2WPRendMatrix, this.tempMatrix) && this.tempSize == this.fPointList.size()) {
            canvas.drawPath(this.tempPath, getMPaint());
            return;
        }
        this.tempPath = GraphExtKt.pointConvertPath(this, this.fPointList, fP2WPRendMatrix);
        this.tempMatrix = fP2WPRendMatrix;
        this.tempSize = this.fPointList.size();
        canvas.drawPath(this.tempPath, getMPaint());
    }

    public final void setActionControl(@NotNull IControl iControl) {
        AbstractC5830k.m5330g(iControl, "<set-?>");
        this.actionControl = iControl;
    }

    public final void addPoint(float x3, float y2) {
        addPoint(new PointF(x3, y2));
    }

    private final boolean isIntersect(RectF touchRect, Path touchPath, RectF graphRect, Path graphPath) {
        if (!crossLine(touchRect, graphRect)) {
            return false;
        }
        Region region = new Region();
        region.setPath(touchPath, new Region(new Rect((int) Math.floor(touchRect.left), (int) Math.floor(touchRect.top), (int) Math.ceil(touchRect.right), (int) Math.ceil(touchRect.bottom))));
        Region region2 = new Region();
        region2.setPath(graphPath, new Region(new Rect((int) Math.floor(graphRect.left), (int) Math.floor(graphRect.top), (int) Math.ceil(graphRect.right), (int) Math.ceil(graphRect.bottom))));
        return region2.op(region, Region.Op.INTERSECT);
    }

    public final boolean isIntersect(float x3, float y2, float radius) {
        if (isInRect(x3, y2, radius)) {
            List<PointF> listPointsConvertPoints = GraphExtKt.pointsConvertPoints(this, this.fPointList, GraphExtKt.getFP2WPMatrix(this));
            int i = 0;
            for (Object obj : listPointsConvertPoints) {
                int i8 = i + 1;
                if (i < 0) {
                    AbstractC5806u.m5258L();
                    throw null;
                }
                PointF pointF = (PointF) obj;
                if (i == 0) {
                    if (ExtensionsKt.getDistance$default(x3, y2, pointF.x, pointF.y, null, 16, null) <= radius) {
                        return true;
                    }
                } else if (1 <= i && i <= listPointsConvertPoints.size() && i8 < listPointsConvertPoints.size()) {
                    PointF pointF2 = listPointsConvertPoints.get(i8);
                    if (ExtensionsKt.pointToLine(pointF.x, pointF.y, pointF2.x, pointF2.y, x3, y2) <= radius) {
                        return true;
                    }
                }
                i = i8;
            }
        }
        return false;
    }
}

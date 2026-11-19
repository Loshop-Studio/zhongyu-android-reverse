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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eJ(\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000eH\u0002J\u001e\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016J\b\u0010(\u001a\u00020\u0012H\u0016J\b\u0010)\u001a\u00020\u0012H\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m13413d2 = {"Lcom/zykj/sketch/core/graph/StrokeGraph;", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "actionControl", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "getActionControl", "()Lcom/zykj/sketch/core/listener/IControl;", "setActionControl", "fPointList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/graphics/PointF;", "tempMatrix", "Landroid/graphics/Matrix;", "tempPath", "Landroid/graphics/Path;", "tempSize", "", "addFPPoint", "", "point", "addPoint", "x", "", "y", "findGraph", "", "Lcom/zykj/sketch/core/graph/Graph;", TypedValues.CycleType.S_WAVE_OFFSET, "getSnapshot", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "graphType", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "isIntersect", "", "touchPath", "touchRect", "Landroid/graphics/RectF;", "graphRect", "graphPath", "radius", "onDestroy", "onMeasure", "render", "canvas", "Landroid/graphics/Canvas;", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class StrokeGraph extends WritingGroupGraph {
    private IControl actionControl;
    private final CopyOnWriteArrayList<PointF> fPointList;
    private Matrix tempMatrix;
    private Path tempPath;
    private int tempSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeGraph(IControl actionControl) {
        super(actionControl);
        Intrinsics.checkNotNullParameter(actionControl, "actionControl");
        this.actionControl = actionControl;
        this.fPointList = new CopyOnWriteArrayList<>();
        this.tempPath = new Path();
    }

    public final void addFPPoint(PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.fPointList.add(point);
    }

    public final void addPoint(PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.fPointList.add(GraphExtKt.mapPoint(this, point, GraphExtKt.getWP2FPMatrix(this)));
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public List<Graph> findGraph(float x9, float y9, float offset) {
        return new ArrayList();
    }

    public final IControl getActionControl() {
        return this.actionControl;
    }

    @Override // com.zykj.sketch.core.graph.WritingGroupGraph, com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData.Builder snapshotBuild = getSnapshotBuild();
        GraphSnapshot.Touch.Builder builderNewBuilder = GraphSnapshot.Touch.newBuilder();
        for (PointF pointF : this.fPointList) {
            builderNewBuilder.addPointF(GraphSnapshot.PointF.newBuilder().setX(pointF.x).setY(pointF.y).build());
        }
        snapshotBuild.setExtra(Any.pack(builderNewBuilder.build()));
        GraphSnapshot.GraphData graphDataBuild = snapshotBuild.build();
        Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.WritingGroupGraph, com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.STROKE_GRAPH;
    }

    public final boolean isIntersect(Path touchPath) {
        Intrinsics.checkNotNullParameter(touchPath, "touchPath");
        RectF rectF = new RectF();
        touchPath.computeBounds(rectF, true);
        if (this.fPointList.isEmpty() || this.fPointList.size() >= 4) {
            Path pathCreatePath = createPath(GraphExtKt.pointsConvertPoints(this, this.fPointList, GraphExtKt.getFP2WPMatrix(this)));
            RectF rectF2 = new RectF();
            pathCreatePath.computeBounds(rectF2, true);
            return isIntersect(rectF, touchPath, rectF2, pathCreatePath);
        }
        PointF pointF = (PointF) CollectionsKt.last((List) this.fPointList);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.fPointList);
        float f10 = 2;
        arrayList.add(new PointF(pointF.x - f10, pointF.y - f10));
        arrayList.add(new PointF(pointF.x + f10, pointF.y - f10));
        arrayList.add(new PointF(pointF.x + f10, pointF.y + f10));
        arrayList.add(new PointF(pointF.x - f10, pointF.y + f10));
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
                float f10 = 1;
                getMOutRect().right = pointF.x + f10;
                getMOutRect().bottom = pointF.y + f10;
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
    public void render(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Matrix fP2WPRendMatrix = GraphExtKt.getFP2WPRendMatrix(this);
        if (!this.fPointList.isEmpty() && this.fPointList.size() < 2) {
            PointF pointF = this.fPointList.get(0);
            Intrinsics.checkNotNullExpressionValue(pointF, "fPointList[0]");
            PointF pointFMapPoint = GraphExtKt.mapPoint(fP2WPRendMatrix, pointF);
            canvas.drawPoint(pointFMapPoint.x, pointFMapPoint.y, getMPaint());
            return;
        }
        if (Intrinsics.areEqual(fP2WPRendMatrix, this.tempMatrix) && this.tempSize == this.fPointList.size()) {
            canvas.drawPath(this.tempPath, getMPaint());
            return;
        }
        this.tempPath = GraphExtKt.pointConvertPath(this, this.fPointList, fP2WPRendMatrix);
        this.tempMatrix = fP2WPRendMatrix;
        this.tempSize = this.fPointList.size();
        canvas.drawPath(this.tempPath, getMPaint());
    }

    public final void setActionControl(IControl iControl) {
        Intrinsics.checkNotNullParameter(iControl, "<set-?>");
        this.actionControl = iControl;
    }

    public final void addPoint(float x9, float y9) {
        addPoint(new PointF(x9, y9));
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

    public final boolean isIntersect(float x9, float y9, float radius) {
        if (isInRect(x9, y9, radius)) {
            List<PointF> listPointsConvertPoints = GraphExtKt.pointsConvertPoints(this, this.fPointList, GraphExtKt.getFP2WPMatrix(this));
            int i9 = 0;
            for (Object obj : listPointsConvertPoints) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                PointF pointF = (PointF) obj;
                if (i9 == 0) {
                    if (ExtensionsKt.getDistance$default(x9, y9, pointF.x, pointF.y, null, 16, null) <= radius) {
                        return true;
                    }
                } else if (1 <= i9 && i9 <= listPointsConvertPoints.size() && i10 < listPointsConvertPoints.size()) {
                    PointF pointF2 = listPointsConvertPoints.get(i10);
                    if (ExtensionsKt.pointToLine(pointF.x, pointF.y, pointF2.x, pointF2.y, x9, y9) <= radius) {
                        return true;
                    }
                }
                i9 = i10;
            }
        }
        return false;
    }
}

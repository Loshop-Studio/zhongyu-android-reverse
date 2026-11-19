package com.zykj.sketch.core.graph;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.google.protobuf.Any;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.extensions.ExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;

/* loaded from: classes3.dex */
public final class StrokeGraph extends WritingGroupGraph {
    private IControl actionControl;
    private final CopyOnWriteArrayList<PointF> fPointList;
    private Matrix tempMatrix;
    private Path tempPath;
    private int tempSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeGraph(IControl actionControl) {
        super(actionControl);
        AbstractC9133u.m16133g(actionControl, "actionControl");
        this.actionControl = actionControl;
        this.fPointList = new CopyOnWriteArrayList<>();
        this.tempPath = new Path();
    }

    public final void addFPPoint(PointF point) {
        AbstractC9133u.m16133g(point, "point");
        this.fPointList.add(point);
    }

    public final void addPoint(PointF point) {
        AbstractC9133u.m16133g(point, "point");
        this.fPointList.add(GraphExtKt.mapPoint(this, point, GraphExtKt.getWP2FPMatrix(this)));
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public List<Graph> findGraph(float f10, float f11, float f12) {
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
        AbstractC9133u.m16132f(graphDataBuild, "builder.build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.WritingGroupGraph, com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.STROKE_GRAPH;
    }

    public final boolean isIntersect(Path touchPath) {
        AbstractC9133u.m16133g(touchPath, "touchPath");
        RectF rectF = new RectF();
        touchPath.computeBounds(rectF, true);
        if (this.fPointList.isEmpty() || this.fPointList.size() >= 4) {
            Path pathCreatePath = createPath(GraphExtKt.pointsConvertPoints(this, this.fPointList, GraphExtKt.getFP2WPMatrix(this)));
            RectF rectF2 = new RectF();
            pathCreatePath.computeBounds(rectF2, true);
            return isIntersect(rectF, touchPath, rectF2, pathCreatePath);
        }
        PointF pointF = (PointF) AbstractC8778f0.m14578x0(this.fPointList);
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
        AbstractC9133u.m16133g(canvas, "canvas");
        Matrix fP2WPRendMatrix = GraphExtKt.getFP2WPRendMatrix(this);
        if (!this.fPointList.isEmpty() && this.fPointList.size() < 2) {
            PointF pointF = this.fPointList.get(0);
            AbstractC9133u.m16132f(pointF, "fPointList[0]");
            PointF pointFMapPoint = GraphExtKt.mapPoint(fP2WPRendMatrix, pointF);
            canvas.drawPoint(pointFMapPoint.x, pointFMapPoint.y, getMPaint());
            return;
        }
        if (AbstractC9133u.m16128b(fP2WPRendMatrix, this.tempMatrix) && this.tempSize == this.fPointList.size()) {
            canvas.drawPath(this.tempPath, getMPaint());
            return;
        }
        this.tempPath = GraphExtKt.pointConvertPath(this, this.fPointList, fP2WPRendMatrix);
        this.tempMatrix = fP2WPRendMatrix;
        this.tempSize = this.fPointList.size();
        canvas.drawPath(this.tempPath, getMPaint());
    }

    public final void setActionControl(IControl iControl) {
        AbstractC9133u.m16133g(iControl, "<set-?>");
        this.actionControl = iControl;
    }

    public final void addPoint(float f10, float f11) {
        addPoint(new PointF(f10, f11));
    }

    private final boolean isIntersect(RectF rectF, Path path, RectF rectF2, Path path2) {
        if (!crossLine(rectF, rectF2)) {
            return false;
        }
        Region region = new Region();
        region.setPath(path, new Region(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom))));
        Region region2 = new Region();
        region2.setPath(path2, new Region(new Rect((int) Math.floor(rectF2.left), (int) Math.floor(rectF2.top), (int) Math.ceil(rectF2.right), (int) Math.ceil(rectF2.bottom))));
        return region2.op(region, Region.Op.INTERSECT);
    }

    public final boolean isIntersect(float f10, float f11, float f12) {
        if (isInRect(f10, f11, f12)) {
            List<PointF> listPointsConvertPoints = GraphExtKt.pointsConvertPoints(this, this.fPointList, GraphExtKt.getFP2WPMatrix(this));
            int i10 = 0;
            for (Object obj : listPointsConvertPoints) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC8809v.m14780w();
                }
                PointF pointF = (PointF) obj;
                if (i10 == 0) {
                    if (ExtensionsKt.getDistance$default(f10, f11, pointF.x, pointF.y, null, 16, null) <= f12) {
                        return true;
                    }
                } else if (1 <= i10 && i10 <= listPointsConvertPoints.size() && i11 < listPointsConvertPoints.size()) {
                    PointF pointF2 = listPointsConvertPoints.get(i11);
                    if (ExtensionsKt.pointToLine(pointF.x, pointF.y, pointF2.x, pointF2.y, f10, f11) <= f12) {
                        return true;
                    }
                }
                i10 = i11;
            }
        }
        return false;
    }
}

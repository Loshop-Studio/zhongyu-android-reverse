package com.zykj.blackboard.core.graph.group;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzySource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;

/* loaded from: classes4.dex */
public final class GeometryGraph extends GroupGraph {
    private Integer geometryType;
    private Paint paint;
    private List<? extends PointF> pointList;
    private String sourceFileName;
    private Integer sourceId;
    private final SourceLoader sourceLoader;
    private final Path tempPath;

    public /* synthetic */ GeometryGraph(String str, RectF rectF, SourceLoader sourceLoader, String str2, Integer num, int i10, AbstractC9126n abstractC9126n) {
        this(str, rectF, (i10 & 4) != 0 ? null : sourceLoader, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
    }

    private final void initData() {
        SourceLoader sourceLoader = this.sourceLoader;
        if (sourceLoader != null) {
            String sourceFileName = getSourceFileName();
            AbstractC9133u.m16130d(sourceFileName);
            Integer sourceId = getSourceId();
            AbstractC9133u.m16130d(sourceId);
            EzySource.GeometrySource.GeometryInfo geometryCache = sourceLoader.getGeometryCache(sourceFileName, sourceId.intValue());
            if (geometryCache != null) {
                if (this.geometryType == null) {
                    this.geometryType = Integer.valueOf(geometryCache.m8802l());
                }
                if (this.pointList == null) {
                    List<EzyPointF.PointF> listM8805o = geometryCache.m8805o();
                    AbstractC9133u.m16132f(listM8805o, "it.pointsList");
                    ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM8805o, 10));
                    for (EzyPointF.PointF it : listM8805o) {
                        AbstractC9133u.m16132f(it, "it");
                        arrayList.add(GraphUtilsKt.covertPointF(it));
                    }
                    setPointList(arrayList);
                }
                if (this.paint == null) {
                    EzyPaint.Paint paintM8803m = geometryCache.m8803m();
                    AbstractC9133u.m16132f(paintM8803m, "it.paint");
                    Paint paintCovertPaint = GraphUtilsKt.covertPaint(paintM8803m);
                    paintCovertPaint.setStrokeCap(Paint.Cap.ROUND);
                    paintCovertPaint.setStrokeJoin(Paint.Join.ROUND);
                    setPaint(paintCovertPaint);
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.group.IChangeField
    public void changeOriginalRectF(RectF newRectF) {
        AbstractC9133u.m16133g(newRectF, "newRectF");
        RectF rectF = new RectF(getOriginalRectF());
        super.changeOriginalRectF(newRectF);
        if (this.geometryType == null || this.pointList == null) {
            initData();
        }
        Integer num = this.geometryType;
        if (num != null && num.intValue() == 1) {
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, newRectF, Matrix.ScaleToFit.FILL);
            List<? extends PointF> list = this.pointList;
            if (list != null) {
                for (PointF pointF : list) {
                    pointF.set(PointUtils.INSTANCE.mapPoint(pointF, matrix));
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    public Graph copy() {
        GeometryGraph geometryGraph = new GeometryGraph(getId(), new RectF(getOriginalRectF()), this.sourceLoader, getSourceFileName(), getSourceId());
        Integer num = this.geometryType;
        if (num != null) {
            geometryGraph.geometryType = Integer.valueOf(num.intValue());
        }
        List<? extends PointF> list = this.pointList;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
            for (PointF pointF : list) {
                arrayList.add(new PointF(pointF.x, pointF.y));
            }
            geometryGraph.setPointList(arrayList);
        }
        Paint paint = this.paint;
        if (paint != null) {
            geometryGraph.setPaint(new Paint(paint));
        }
        geometryGraph.initMatrix(getRenderMatrix());
        Iterator<T> it = getChildGraph().iterator();
        while (it.hasNext()) {
            geometryGraph.addGraph(((IGraph) it.next()).copy());
        }
        return geometryGraph;
    }

    public final Integer getGeometryType() {
        return this.geometryType;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public RectF getMinOutRectF(Matrix matrix) {
        RectF rectF = new RectF(getOriginalRectF());
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(getRenderMatrix());
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(rectF);
        Paint paint = this.paint;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth() / 2;
            rectF.left -= strokeWidth;
            rectF.top -= strokeWidth;
            rectF.right += strokeWidth;
            rectF.bottom += strokeWidth;
        }
        return rectF;
    }

    public final List<PointF> getMovePointFList() {
        List<? extends PointF> list;
        if (this.geometryType == null || this.pointList == null) {
            initData();
        }
        if (this.geometryType == null || this.pointList == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList();
        Integer num = this.geometryType;
        if (num != null && num.intValue() == 1 && (list = this.pointList) != null && list.size() == 3) {
            PointF pointF = new PointF(getOriginalRectF().left, getOriginalRectF().bottom);
            PointF pointF2 = new PointF(getOriginalRectF().right, getOriginalRectF().bottom);
            List<? extends PointF> list2 = this.pointList;
            if (list2 != null) {
                for (PointF pointF3 : list2) {
                    if (!AbstractC9133u.m16128b(pointF3, pointF) && !AbstractC9133u.m16128b(pointF3, pointF2)) {
                        arrayList.add(new PointF(pointF3.x, pointF3.y));
                    }
                }
            }
        }
        return arrayList;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final List<PointF> getPointList() {
        return this.pointList;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b snapshot = super.getSnapshot();
        Paint paint = this.paint;
        if (paint != null) {
            snapshot.m8411P(GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f));
        }
        List<? extends PointF> list = this.pointList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                snapshot.m8417e(GraphUtilsKt.covertEzyPointF((PointF) it.next()));
            }
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public Integer getSourceId() {
        return this.sourceId;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(Canvas canvas, Matrix matrix) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
        if (this.geometryType == null || this.pointList == null || this.paint == null) {
            initData();
        }
        getTempMatrix().reset();
        getTempMatrix().postConcat(getRenderMatrix());
        getTempMatrix().postConcat(matrix);
        Paint paint = this.paint;
        if (paint != null) {
            this.tempPath.reset();
            Integer num = this.geometryType;
            if (num != null && num.intValue() == 0) {
                this.tempPath.addOval(getOriginalRectF(), Path.Direction.CW);
            } else if (num != null && num.intValue() == 1) {
                List<? extends PointF> list = this.pointList;
                if (list != null) {
                    int i10 = 0;
                    for (Object obj : list) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC8809v.m14780w();
                        }
                        PointF pointF = (PointF) obj;
                        if (i10 == 0) {
                            this.tempPath.moveTo(pointF.x, pointF.y);
                        } else {
                            this.tempPath.lineTo(pointF.x, pointF.y);
                        }
                        i10 = i11;
                    }
                }
                this.tempPath.close();
            }
            this.tempPath.transform(getTempMatrix());
            canvas.drawPath(this.tempPath, paint);
        }
    }

    public final void setGeometryType(Integer num) {
        this.geometryType = num;
    }

    public final void setPaint(Paint paint) {
        this.paint = paint;
        setNeedUpdate(true);
    }

    public final void setPointList(List<? extends PointF> list) {
        this.pointList = list;
        setNeedUpdate(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(Integer num) {
        this.sourceId = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeometryGraph(String id, RectF outRectF, SourceLoader sourceLoader, String str, Integer num) {
        super(id, outRectF, str, num);
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(outRectF, "outRectF");
        this.sourceLoader = sourceLoader;
        this.sourceFileName = str;
        this.sourceId = num;
        this.tempPath = new Path();
    }
}

package com.zykj.blackboard.core.graph.group;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.C4361d0;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyPointF$PointF;
import com.zykj.board.EzySource$GeometrySource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R:\u00108\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010(\"\u0004\b;\u0010<R$\u0010=\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010/\u001a\u0004\b>\u00101\"\u0004\b?\u00103R.\u0010A\u001a\u0004\u0018\u00010@2\b\u00107\u001a\u0004\u0018\u00010@8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006G"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/group/GeometryGraph;", "Lcom/zykj/blackboard/core/graph/group/GroupGraph;", "", "id", "Landroid/graphics/RectF;", "outRectF", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "sourceFileName", "", "sourceId", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V", "Ld6/s;", "initData", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Matrix;", "matrix", "render", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "newRectF", "changeOriginalRectF", "(Landroid/graphics/RectF;)V", "adapterMatrix", "getMinOutRectF", "(Landroid/graphics/Matrix;)Landroid/graphics/RectF;", "Lcom/zykj/board/d0;", "getSnapshot", "()Lcom/zykj/board/d0;", "Lcom/zykj/blackboard/core/graph/Graph;", "copy", "()Lcom/zykj/blackboard/core/graph/Graph;", "", "Landroid/graphics/PointF;", "getMovePointFList", "()Ljava/util/List;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "Ljava/lang/String;", "getSourceFileName", "()Ljava/lang/String;", "setSourceFileName", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getSourceId", "()Ljava/lang/Integer;", "setSourceId", "(Ljava/lang/Integer;)V", "Landroid/graphics/Path;", "tempPath", "Landroid/graphics/Path;", "value", "pointList", "Ljava/util/List;", "getPointList", "setPointList", "(Ljava/util/List;)V", "geometryType", "getGeometryType", "setGeometryType", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GeometryGraph extends GroupGraph {

    @Nullable
    private Integer geometryType;

    @Nullable
    private Paint paint;

    @Nullable
    private List<? extends PointF> pointList;

    @Nullable
    private String sourceFileName;

    @Nullable
    private Integer sourceId;

    @Nullable
    private final SourceLoader sourceLoader;

    @NotNull
    private final Path tempPath;

    public /* synthetic */ GeometryGraph(String str, RectF rectF, SourceLoader sourceLoader, String str2, Integer num, int i, AbstractC5824e abstractC5824e) {
        this(str, rectF, (i & 4) != 0 ? null : sourceLoader, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num);
    }

    private final void initData() {
        SourceLoader sourceLoader = this.sourceLoader;
        if (sourceLoader != null) {
            String sourceFileName = getSourceFileName();
            AbstractC5830k.m5327d(sourceFileName);
            Integer sourceId = getSourceId();
            AbstractC5830k.m5327d(sourceId);
            EzySource$GeometrySource.GeometryInfo geometryCache = sourceLoader.getGeometryCache(sourceFileName, sourceId.intValue());
            if (geometryCache != null) {
                if (this.geometryType == null) {
                    this.geometryType = Integer.valueOf(geometryCache.getGeometryTypeValue());
                }
                if (this.pointList == null) {
                    List<EzyPointF$PointF> pointsList = geometryCache.getPointsList();
                    AbstractC5830k.m5329f(pointsList, "it.pointsList");
                    ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(pointsList, 10));
                    for (EzyPointF$PointF it : pointsList) {
                        AbstractC5830k.m5329f(it, "it");
                        arrayList.add(GraphUtilsKt.covertPointF(it));
                    }
                    setPointList(arrayList);
                }
                if (this.paint == null) {
                    EzyPaint$Paint paint = geometryCache.getPaint();
                    AbstractC5830k.m5329f(paint, "it.paint");
                    Paint paintCovertPaint = GraphUtilsKt.covertPaint(paint);
                    paintCovertPaint.setStrokeCap(Paint.Cap.ROUND);
                    paintCovertPaint.setStrokeJoin(Paint.Join.ROUND);
                    setPaint(paintCovertPaint);
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.group.IChangeField
    public void changeOriginalRectF(@NotNull RectF newRectF) {
        AbstractC5830k.m5330g(newRectF, "newRectF");
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
    @NotNull
    public Graph copy() {
        GeometryGraph geometryGraph = new GeometryGraph(getId(), new RectF(getOriginalRectF()), this.sourceLoader, getSourceFileName(), getSourceId());
        Integer num = this.geometryType;
        if (num != null) {
            geometryGraph.geometryType = Integer.valueOf(num.intValue());
        }
        List<? extends PointF> list = this.pointList;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
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

    @Nullable
    public final Integer getGeometryType() {
        return this.geometryType;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public RectF getMinOutRectF(@Nullable Matrix adapterMatrix) {
        RectF rectF = new RectF(getOriginalRectF());
        Matrix matrix = new Matrix();
        matrix.postConcat(getRenderMatrix());
        if (adapterMatrix != null) {
            matrix.postConcat(adapterMatrix);
        }
        matrix.mapRect(rectF);
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

    @NotNull
    public final List<PointF> getMovePointFList() {
        List<? extends PointF> list;
        if (this.geometryType == null || this.pointList == null) {
            initData();
        }
        if (this.geometryType == null || this.pointList == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Integer num = this.geometryType;
        if (num != null && num.intValue() == 1 && (list = this.pointList) != null && list.size() == 3) {
            PointF pointF = new PointF(getOriginalRectF().left, getOriginalRectF().bottom);
            PointF pointF2 = new PointF(getOriginalRectF().right, getOriginalRectF().bottom);
            List<? extends PointF> list2 = this.pointList;
            if (list2 != null) {
                for (PointF pointF3 : list2) {
                    if (!AbstractC5830k.m5325b(pointF3, pointF) && !AbstractC5830k.m5325b(pointF3, pointF2)) {
                        arrayList.add(new PointF(pointF3.x, pointF3.y));
                    }
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public final Paint getPaint() {
        return this.paint;
    }

    @Nullable
    public final List<PointF> getPointList() {
        return this.pointList;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public C4361d0 getSnapshot() {
        C4361d0 snapshot = super.getSnapshot();
        Paint paint = this.paint;
        if (paint != null) {
            snapshot.m3719n(GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f));
        }
        List<? extends PointF> list = this.pointList;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EzyPointF$PointF ezyPointF$PointFCovertEzyPointF = GraphUtilsKt.covertEzyPointF((PointF) it.next());
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = snapshot.f5474q;
                if (repeatedFieldBuilderV3 == null) {
                    ezyPointF$PointFCovertEzyPointF.getClass();
                    snapshot.m3712g();
                    snapshot.f5473p.add(ezyPointF$PointFCovertEzyPointF);
                    snapshot.onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(ezyPointF$PointFCovertEzyPointF);
                }
            }
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    @Nullable
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    @Nullable
    public Integer getSourceId() {
        return this.sourceId;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public EzyGraphEnum$GraphEnum graphType() {
        return EzyGraphEnum$GraphEnum.GEOMETRY_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(@NotNull Canvas canvas, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
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
                    int i = 0;
                    for (Object obj : list) {
                        int i8 = i + 1;
                        if (i < 0) {
                            AbstractC5806u.m5258L();
                            throw null;
                        }
                        PointF pointF = (PointF) obj;
                        if (i == 0) {
                            this.tempPath.moveTo(pointF.x, pointF.y);
                        } else {
                            this.tempPath.lineTo(pointF.x, pointF.y);
                        }
                        i = i8;
                    }
                }
                this.tempPath.close();
            }
            this.tempPath.transform(getTempMatrix());
            canvas.drawPath(this.tempPath, paint);
        }
    }

    public final void setGeometryType(@Nullable Integer num) {
        this.geometryType = num;
    }

    public final void setPaint(@Nullable Paint paint) {
        this.paint = paint;
        setNeedUpdate(true);
    }

    public final void setPointList(@Nullable List<? extends PointF> list) {
        this.pointList = list;
        setNeedUpdate(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(@Nullable String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(@Nullable Integer num) {
        this.sourceId = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeometryGraph(@NotNull String id, @NotNull RectF outRectF, @Nullable SourceLoader sourceLoader, @Nullable String str, @Nullable Integer num) {
        super(id, outRectF, str, num);
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(outRectF, "outRectF");
        this.sourceLoader = sourceLoader;
        this.sourceFileName = str;
        this.sourceId = num;
        this.tempPath = new Path();
    }
}

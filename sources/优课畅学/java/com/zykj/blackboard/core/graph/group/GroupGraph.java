package com.zykj.blackboard.core.graph.group;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IDraw;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.root.BoundedContainerGraph;
import com.zykj.blackboard.utils.BitmapUtil;
import com.zykj.board.EzyGraphEnum;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public class GroupGraph extends BoundedContainerGraph implements IChangeField {
    private final RectF bitmapRenderRect;
    private Bitmap groupBitmap;
    private boolean needUpdate;
    private final Matrix prevMatrix;
    private float screenHeight;
    private float screenWidth;
    private String sourceFileName;
    private Integer sourceId;
    private Matrix tempMatrix;

    public /* synthetic */ GroupGraph(String str, RectF rectF, String str2, Integer num, int i10, AbstractC9126n abstractC9126n) {
        this(str, rectF, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num);
    }

    private final void renderGroupBitmap(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.groupBitmap;
        if (bitmap2 == null || bitmap2 == null || bitmap2.isRecycled() || (bitmap = this.groupBitmap) == null) {
            return;
        }
        RectF rectF = this.bitmapRenderRect;
        canvas.drawBitmap(bitmap, rectF.left, rectF.top, (Paint) null);
    }

    private final void updateGroupBitmap(boolean z10, Matrix matrix, InterfaceC10570l interfaceC10570l) {
        this.bitmapRenderRect.set(getMinOutRectF(matrix));
        if (!z10) {
            RectF rectF = new RectF(0.0f, 0.0f, this.screenWidth, this.screenHeight);
            if (!rectF.isEmpty()) {
                if (!this.bitmapRenderRect.intersect(rectF)) {
                    Bitmap bitmap = this.groupBitmap;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this.groupBitmap = null;
                    return;
                }
                if (this.bitmapRenderRect.width() == 0.0f || this.bitmapRenderRect.height() == 0.0f) {
                    Bitmap bitmap2 = this.groupBitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.groupBitmap = null;
                    return;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.bitmapRenderRect.width()) + 1, ((int) this.bitmapRenderRect.height()) + 1, Bitmap.Config.ARGB_8888);
        this.groupBitmap = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.save();
            RectF rectF2 = this.bitmapRenderRect;
            canvas.translate(-rectF2.left, -rectF2.top);
            render(canvas, matrix);
            for (IGraph it : getChildGraph()) {
                AbstractC9133u.m16132f(it, "it");
                IDraw.DefaultImpls.onDraw$default(it, canvas, matrix, interfaceC10570l, false, false, 24, null);
            }
            canvas.restore();
        }
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraphChange
    public void addGraph(IGraph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        super.addGraph(graph);
        this.needUpdate = true;
    }

    public void changeOriginalRectF(RectF newRectF) {
        AbstractC9133u.m16133g(newRectF, "newRectF");
        getOriginalRectF().set(newRectF);
        updateRenderRectF();
        this.needUpdate = true;
    }

    @Override // com.zykj.blackboard.core.graph.group.IChangeField
    public void changeRenderMatrix(Matrix newMatrix) {
        AbstractC9133u.m16133g(newMatrix, "newMatrix");
        getRenderMatrix().set(newMatrix);
        updateRenderRectF();
        this.needUpdate = true;
    }

    @Override // com.zykj.blackboard.core.graph.group.IChangeField
    public void changeUpdate(boolean z10) {
        this.needUpdate = z10;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraphChange
    public void concatMatrix(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        super.concatMatrix(matrix);
        this.needUpdate = true;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    public Graph copy() {
        GroupGraph groupGraph = new GroupGraph(getId(), new RectF(getOriginalRectF()), null, null, 12, null);
        groupGraph.initMatrix(getRenderMatrix());
        Iterator<T> it = getChildGraph().iterator();
        while (it.hasNext()) {
            groupGraph.addGraph(((IGraph) it.next()).copy());
        }
        return groupGraph;
    }

    public final boolean getNeedUpdate() {
        return this.needUpdate;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public Integer getSourceId() {
        return this.sourceId;
    }

    public final Matrix getTempMatrix() {
        return this.tempMatrix;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.GROUP_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public void onDestroy() {
        super.onDestroy();
        BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.groupBitmap}, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph.onDestroy.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27442invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27442invoke() {
                GroupGraph.this.groupBitmap = null;
            }
        });
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IDraw
    public void onDraw(Canvas canvas, Matrix matrix, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
        if (interfaceC10570l == null || !((Boolean) interfaceC10570l.invoke(this)).booleanValue()) {
            if (getRenderRectF().isEmpty() && getChildGraph().isEmpty()) {
                Bitmap bitmap = this.groupBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.groupBitmap = null;
                return;
            }
            if (!AbstractC9133u.m16128b(this.prevMatrix, matrix)) {
                this.prevMatrix.set(matrix);
                this.needUpdate = true;
            }
            Bitmap bitmap2 = this.groupBitmap;
            if (bitmap2 == null || ((bitmap2 != null && bitmap2.isRecycled()) || this.needUpdate || z11)) {
                if (z10) {
                    this.screenWidth = canvas.getWidth();
                    this.screenHeight = canvas.getHeight();
                }
                updateGroupBitmap(z11, matrix, interfaceC10570l);
                this.needUpdate = false;
            }
            renderGroupBitmap(canvas);
        }
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraphChange
    public void removeGraph(IGraph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        super.removeGraph(graph);
        this.needUpdate = true;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(Canvas canvas, Matrix matrix) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
    }

    public final void setNeedUpdate(boolean z10) {
        this.needUpdate = z10;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(Integer num) {
        this.sourceId = num;
    }

    public final void setTempMatrix(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "<set-?>");
        this.tempMatrix = matrix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupGraph(String id, RectF outRectF, String str, Integer num) {
        super(id, outRectF, str, num);
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(outRectF, "outRectF");
        this.sourceFileName = str;
        this.sourceId = num;
        this.bitmapRenderRect = new RectF();
        this.tempMatrix = new Matrix();
        this.prevMatrix = new Matrix();
    }
}

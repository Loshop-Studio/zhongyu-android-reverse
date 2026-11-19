package com.zykj.blackboard.core.graph.group;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IDraw;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.root.BoundedContainerGraph;
import com.zykj.blackboard.utils.BitmapUtil;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0016\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001^B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(JE\u0010*\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0006\u0010)\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00107J\u0017\u00109\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u00101J\u001f\u0010:\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0014H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u00104R\u0014\u0010P\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\"\u0010T\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u00101R\u0014\u0010Y\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010UR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\¨\u0006_"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/group/GroupGraph;", "Lcom/zykj/blackboard/core/graph/root/BoundedContainerGraph;", "Lcom/zykj/blackboard/core/graph/group/IChangeField;", "", "id", "Landroid/graphics/RectF;", "outRectF", "sourceFileName", "", "sourceId", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/Function1;", "Lcom/zykj/blackboard/core/graph/IGraph;", "", "interceptRendVoid", "Ld6/s;", "drawChildrenDirectly", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;)V", "isComplete", "updateGroupBitmap", "(ZLandroid/graphics/Matrix;Lr6/c;)Z", "updateReusableBitmapRenderRect", "(ZLandroid/graphics/Matrix;)Z", "getBitmapRenderRect", "(ZLandroid/graphics/Matrix;)Landroid/graphics/RectF;", "Landroid/graphics/Bitmap;", "bitmap", "canDrawBitmap", "(Landroid/graphics/Bitmap;)Z", "oldM", "newM", "shouldRebuildBitmapForMatrix", "(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "isScreenCanvas", "onDraw", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZ)V", "newRectF", "changeOriginalRectF", "(Landroid/graphics/RectF;)V", "newMatrix", "changeRenderMatrix", "(Landroid/graphics/Matrix;)V", "newUpdate", "changeUpdate", "(Z)V", "graph", "addGraph", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "removeGraph", "concatMatrix", "render", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "onDestroy", "()V", "Lcom/zykj/blackboard/core/graph/Graph;", "copy", "()Lcom/zykj/blackboard/core/graph/Graph;", "Ljava/lang/String;", "getSourceFileName", "()Ljava/lang/String;", "setSourceFileName", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getSourceId", "()Ljava/lang/Integer;", "setSourceId", "(Ljava/lang/Integer;)V", "needUpdate", "Z", "getNeedUpdate", "()Z", "setNeedUpdate", "bitmapRenderRect", "Landroid/graphics/RectF;", "groupBitmap", "Landroid/graphics/Bitmap;", "tempMatrix", "Landroid/graphics/Matrix;", "getTempMatrix", "()Landroid/graphics/Matrix;", "setTempMatrix", "prevMatrix", "", "screenWidth", "F", "screenHeight", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public class GroupGraph extends BoundedContainerGraph implements IChangeField {
    private static final float BITMAP_BUFFER = 200.0f;
    private static final float BITMAP_REBUILD_TRANSLATION_THRESHOLD = 100.0f;
    private static final int MAX_BITMAP_SIZE = 4096;
    private static final int MAX_DRAW_BITMAP_BYTES = 104857600;

    @NotNull
    private final RectF bitmapRenderRect;

    @Nullable
    private Bitmap groupBitmap;
    private boolean needUpdate;

    @NotNull
    private final Matrix prevMatrix;
    private float screenHeight;
    private float screenWidth;

    @Nullable
    private String sourceFileName;

    @Nullable
    private Integer sourceId;

    @NotNull
    private Matrix tempMatrix;

    public /* synthetic */ GroupGraph(String str, RectF rectF, String str2, Integer num, int i, AbstractC5824e abstractC5824e) {
        this(str, rectF, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }

    private final boolean canDrawBitmap(Bitmap bitmap) {
        return ((long) bitmap.getAllocationByteCount()) < 104857600;
    }

    private final void drawChildrenDirectly(Canvas canvas, Matrix matrix, InterfaceC6471c interceptRendVoid) {
        Bitmap bitmap = this.groupBitmap;
        if (bitmap != null) {
            BitmapUtil.INSTANCE.recycle(new Bitmap[]{bitmap}, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph.drawChildrenDirectly.1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13773invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13773invoke() {
                    GroupGraph.this.groupBitmap = null;
                }
            });
        }
        render(canvas, matrix);
        for (IGraph it : getChildGraph()) {
            AbstractC5830k.m5329f(it, "it");
            IDraw.DefaultImpls.onDraw$default(it, canvas, matrix, interceptRendVoid, false, false, 24, null);
        }
    }

    private final RectF getBitmapRenderRect(boolean isComplete, Matrix matrix) {
        RectF minOutRectF = getMinOutRectF(matrix);
        if (isComplete || this.screenWidth <= 0.0f || this.screenHeight <= 0.0f || minOutRectF.intersect(new RectF(-200.0f, -200.0f, this.screenWidth + 200.0f, this.screenHeight + 200.0f))) {
            return minOutRectF;
        }
        return null;
    }

    private final boolean shouldRebuildBitmapForMatrix(Matrix oldM, Matrix newM) {
        if (AbstractC5830k.m5325b(oldM, newM)) {
            return false;
        }
        float[] fArr = new float[9];
        oldM.getValues(fArr);
        float[] fArr2 = new float[9];
        newM.getValues(fArr2);
        if (fArr[0] == fArr2[0] && fArr[4] == fArr2[4]) {
            float fAbs = Math.abs(fArr[2] - fArr2[2]);
            float fAbs2 = Math.abs(fArr[5] - fArr2[5]);
            if (fAbs <= BITMAP_REBUILD_TRANSLATION_THRESHOLD && fAbs2 <= BITMAP_REBUILD_TRANSLATION_THRESHOLD) {
                return false;
            }
        }
        return true;
    }

    @SuppressLint({"UseKtx"})
    private final boolean updateGroupBitmap(boolean isComplete, Matrix matrix, InterfaceC6471c interceptRendVoid) {
        Bitmap bitmapCreateBitmap;
        RectF bitmapRenderRect = getBitmapRenderRect(isComplete, matrix);
        if (bitmapRenderRect == null) {
            BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.groupBitmap}, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph$updateGroupBitmap$nextRenderRect$1$1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13778invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13778invoke() {
                    this.$this_run.groupBitmap = null;
                }
            });
            return false;
        }
        this.bitmapRenderRect.set(bitmapRenderRect);
        int iWidth = ((int) this.bitmapRenderRect.width()) + 1;
        int iHeight = ((int) this.bitmapRenderRect.height()) + 1;
        long j7 = iWidth * iHeight * 4;
        if (iWidth <= 0 || iHeight <= 0 || iWidth > 4096 || iHeight > 4096) {
            BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.groupBitmap}, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph.updateGroupBitmap.1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13775invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13775invoke() {
                    GroupGraph.this.groupBitmap = null;
                }
            });
            return false;
        }
        if (j7 >= 104857600) {
            BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.groupBitmap}, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph.updateGroupBitmap.2
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13776invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13776invoke() {
                    GroupGraph.this.groupBitmap = null;
                }
            });
            return false;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        } catch (Throwable unused) {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.groupBitmap}, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph.updateGroupBitmap.3
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13777invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13777invoke() {
                    GroupGraph.this.groupBitmap = null;
                }
            });
            return false;
        }
        this.groupBitmap = bitmapCreateBitmap;
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = this.bitmapRenderRect;
        canvas.translate(-rectF.left, -rectF.top);
        render(canvas, matrix);
        for (IGraph it : getChildGraph()) {
            AbstractC5830k.m5329f(it, "it");
            IDraw.DefaultImpls.onDraw$default(it, canvas, matrix, interceptRendVoid, false, false, 24, null);
        }
        return true;
    }

    private final boolean updateReusableBitmapRenderRect(boolean isComplete, Matrix matrix) {
        RectF bitmapRenderRect;
        Bitmap bitmap = this.groupBitmap;
        if (bitmap == null || bitmap.isRecycled() || (bitmapRenderRect = getBitmapRenderRect(isComplete, matrix)) == null) {
            return false;
        }
        int iWidth = ((int) bitmapRenderRect.width()) + 1;
        int iHeight = ((int) bitmapRenderRect.height()) + 1;
        if (iWidth == bitmap.getWidth() && iHeight == bitmap.getHeight()) {
            this.bitmapRenderRect.set(bitmapRenderRect);
            return true;
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraphChange
    public void addGraph(@NotNull IGraph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        super.addGraph(graph);
        this.needUpdate = true;
    }

    public void changeOriginalRectF(@NotNull RectF newRectF) {
        AbstractC5830k.m5330g(newRectF, "newRectF");
        getOriginalRectF().set(newRectF);
        updateRenderRectF();
        this.needUpdate = true;
    }

    @Override // com.zykj.blackboard.core.graph.group.IChangeField
    public void changeRenderMatrix(@NotNull Matrix newMatrix) {
        AbstractC5830k.m5330g(newMatrix, "newMatrix");
        getRenderMatrix().set(newMatrix);
        updateRenderRectF();
        this.needUpdate = true;
    }

    @Override // com.zykj.blackboard.core.graph.group.IChangeField
    public void changeUpdate(boolean newUpdate) {
        this.needUpdate = newUpdate;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraphChange
    public void concatMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        super.concatMatrix(matrix);
        this.needUpdate = true;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
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
    @Nullable
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    @Nullable
    public Integer getSourceId() {
        return this.sourceId;
    }

    @NotNull
    public final Matrix getTempMatrix() {
        return this.tempMatrix;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public EzyGraphEnum$GraphEnum graphType() {
        return EzyGraphEnum$GraphEnum.GROUP_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public void onDestroy() {
        super.onDestroy();
        BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.groupBitmap}, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph.onDestroy.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13774invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13774invoke() {
                GroupGraph.this.groupBitmap = null;
            }
        });
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IDraw
    public void onDraw(@NotNull Canvas canvas, @NotNull Matrix matrix, @Nullable InterfaceC6471c interceptRendVoid, boolean isScreenCanvas, boolean isComplete) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
        if (interceptRendVoid == null || !((Boolean) interceptRendVoid.invoke(this)).booleanValue()) {
            if (shouldRebuildBitmapForMatrix(this.prevMatrix, matrix)) {
                this.needUpdate = true;
            }
            Bitmap bitmap = this.groupBitmap;
            if (bitmap == null || ((bitmap != null && bitmap.isRecycled()) || this.needUpdate || isComplete)) {
                if (isScreenCanvas) {
                    this.screenWidth = canvas.getWidth();
                    this.screenHeight = canvas.getHeight();
                }
                if (updateGroupBitmap(isComplete, matrix, interceptRendVoid)) {
                    this.prevMatrix.set(matrix);
                }
                this.needUpdate = false;
            } else if (!updateReusableBitmapRenderRect(isComplete, matrix) && updateGroupBitmap(isComplete, matrix, interceptRendVoid)) {
                this.prevMatrix.set(matrix);
            }
            Bitmap bitmap2 = this.groupBitmap;
            if (bitmap2 == null || bitmap2.isRecycled() || !canDrawBitmap(bitmap2)) {
                drawChildrenDirectly(canvas, matrix, interceptRendVoid);
            } else {
                RectF rectF = this.bitmapRenderRect;
                canvas.drawBitmap(bitmap2, rectF.left, rectF.top, (Paint) null);
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraphChange
    public void removeGraph(@NotNull IGraph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        super.removeGraph(graph);
        this.needUpdate = true;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(@NotNull Canvas canvas, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
    }

    public final void setNeedUpdate(boolean z8) {
        this.needUpdate = z8;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(@Nullable String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(@Nullable Integer num) {
        this.sourceId = num;
    }

    public final void setTempMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "<set-?>");
        this.tempMatrix = matrix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupGraph(@NotNull String id, @NotNull RectF outRectF, @Nullable String str, @Nullable Integer num) {
        super(id, outRectF, str, num);
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(outRectF, "outRectF");
        this.sourceFileName = str;
        this.sourceId = num;
        this.bitmapRenderRect = new RectF();
        this.tempMatrix = new Matrix();
        this.prevMatrix = new Matrix();
    }
}

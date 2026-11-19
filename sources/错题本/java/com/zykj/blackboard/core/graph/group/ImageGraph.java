package com.zykj.blackboard.core.graph.group;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.BitmapUtil;
import com.zykj.blackboard.utils.CanvasUtils;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "Lcom/zykj/blackboard/core/graph/group/FileGraph;", "", "id", "Landroid/graphics/RectF;", "outRectF", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "sourceFileName", "", "sourceId", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;I)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "renderBitmap", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "path", "updateFilePath", "(Ljava/lang/String;)V", "render", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "onDestroy", "()V", "Lcom/zykj/blackboard/core/graph/Graph;", "copy", "()Lcom/zykj/blackboard/core/graph/Graph;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ImageGraph extends FileGraph {

    @Nullable
    private Bitmap bitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageGraph(@NotNull String id, @NotNull RectF outRectF, @NotNull SourceLoader sourceLoader, @NotNull String sourceFileName, int i) {
        super(id, outRectF, sourceLoader, sourceFileName, Integer.valueOf(i));
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(outRectF, "outRectF");
        AbstractC5830k.m5330g(sourceLoader, "sourceLoader");
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
    }

    private final void renderBitmap(Canvas canvas, Matrix matrix) {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || (bitmap != null && bitmap.isRecycled())) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(getFilePath(), options);
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) (options.outWidth / getOriginalRectF().width());
                this.bitmap = BitmapFactory.decodeFile(getFilePath(), options);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        float fWidth = getOriginalRectF().width() / bitmap2.getWidth();
        getTempMatrix().reset();
        getTempMatrix().postScale(fWidth, fWidth);
        getTempMatrix().postConcat(getRenderMatrix());
        getTempMatrix().postConcat(matrix);
        CanvasUtils.INSTANCE.drawLargeBitmap(canvas, bitmap2, getTempMatrix());
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public Graph copy() {
        String id = getId();
        RectF rectF = new RectF(getOriginalRectF());
        SourceLoader sourceLoader = getSourceLoader();
        String sourceFileName = getSourceFileName();
        if (sourceFileName == null) {
            sourceFileName = "";
        }
        Integer sourceId = getSourceId();
        ImageGraph imageGraph = new ImageGraph(id, rectF, sourceLoader, sourceFileName, sourceId != null ? sourceId.intValue() : -1);
        imageGraph.setFilePath(getFilePath());
        imageGraph.initMatrix(getRenderMatrix());
        Iterator<T> it = getChildGraph().iterator();
        while (it.hasNext()) {
            imageGraph.addGraph(((IGraph) it.next()).copy());
        }
        return imageGraph;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public EzyGraphEnum$GraphEnum graphType() {
        return EzyGraphEnum$GraphEnum.IMAGE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public void onDestroy() {
        super.onDestroy();
        BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.bitmap}, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.graph.group.ImageGraph.onDestroy.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13779invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13779invoke() {
                ImageGraph.this.setBitmap(null);
            }
        });
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(@NotNull Canvas canvas, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
        if (getFilePath() == null) {
            initPath();
        }
        renderBitmap(canvas, matrix);
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // com.zykj.blackboard.core.graph.group.FileGraph
    public void updateFilePath(@NotNull String path) {
        AbstractC5830k.m5330g(path, "path");
        setFilePath(path);
        this.bitmap = null;
        setNeedUpdate(true);
    }
}

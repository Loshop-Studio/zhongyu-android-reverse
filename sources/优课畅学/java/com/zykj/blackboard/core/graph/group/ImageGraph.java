package com.zykj.blackboard.core.graph.group;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.BitmapUtil;
import com.zykj.blackboard.utils.CanvasUtils;
import com.zykj.board.EzyGraphEnum;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class ImageGraph extends FileGraph {
    private Bitmap bitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageGraph(String id, RectF outRectF, SourceLoader sourceLoader, String sourceFileName, int i10) {
        super(id, outRectF, sourceLoader, sourceFileName, Integer.valueOf(i10));
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(outRectF, "outRectF");
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
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
            } catch (Exception e10) {
                e10.printStackTrace();
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

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.IMAGE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public void onDestroy() {
        super.onDestroy();
        BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.bitmap}, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.graph.group.ImageGraph.onDestroy.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27443invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27443invoke() {
                ImageGraph.this.setBitmap(null);
            }
        });
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(Canvas canvas, Matrix matrix) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
        if (getFilePath() == null) {
            initPath();
        }
        renderBitmap(canvas, matrix);
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // com.zykj.blackboard.core.graph.group.FileGraph
    public void updateFilePath(String path) {
        AbstractC9133u.m16133g(path, "path");
        setFilePath(path);
        this.bitmap = null;
        setNeedUpdate(true);
    }
}

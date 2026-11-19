package com.zykj.sketch.core.graph;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.protobuf.Any;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;

/* loaded from: classes3.dex */
public final class ImageHistoryGraph extends ViewGraph {
    private Bitmap bitmap;
    private String fileName;
    private int height;
    private int viewHeight;
    private int viewWidth;
    private int width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageHistoryGraph(IControl actionControl, int i10, int i11, int i12, int i13, String fileName) {
        super(actionControl);
        AbstractC9133u.m16133g(actionControl, "actionControl");
        AbstractC9133u.m16133g(fileName, "fileName");
        this.width = i10;
        this.height = i11;
        this.viewWidth = i12;
        this.viewHeight = i13;
        this.fileName = fileName;
        StringBuilder sb = new StringBuilder();
        sb.append(getControl().getSketchConfig().getSourcePath());
        String str = File.separator;
        sb.append(str);
        sb.append(SourceRouterRecord.SOURCE_RES_IMAGE);
        sb.append(str);
        sb.append(this.fileName);
        String string = sb.toString();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        C8736p c8736p = C8736p.f16368a;
        this.bitmap = BitmapFactory.decodeFile(string, options);
        setMatrix(getSaleCenterMatrix(this.width, this.height, this.viewWidth, this.viewHeight));
        onMeasure();
    }

    private final Matrix getSaleCenterMatrix(int i10, int i11, int i12, int i13) {
        Matrix matrix = new Matrix();
        matrix.postTranslate((i12 / 2) - (i10 / 2), (i13 / 2) - (i11 / 2));
        return matrix;
    }

    public static /* synthetic */ Matrix getSaleCenterMatrix$default(ImageHistoryGraph imageHistoryGraph, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        return imageHistoryGraph.getSaleCenterMatrix(i10, i11, i12, i13);
    }

    public final String getFileName() {
        return this.fileName;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData.Builder snapshotBuild = getSnapshotBuild();
        GraphSnapshot.File.Builder builderNewBuilder = GraphSnapshot.File.newBuilder();
        builderNewBuilder.setFileName(this.fileName);
        builderNewBuilder.setWidth(this.width);
        builderNewBuilder.setHeight(this.height);
        builderNewBuilder.setViewWidth(this.viewWidth);
        builderNewBuilder.setViewHeight(this.viewHeight);
        snapshotBuild.setExtra(Any.pack(builderNewBuilder.build()));
        GraphSnapshot.GraphData graphDataBuild = snapshotBuild.build();
        AbstractC9133u.m16132f(graphDataBuild, "builder.build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.IMAGE_GRAPH;
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IDraw
    public void onDraw(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        if (!this.bitmap.isRecycled()) {
            Bitmap bitmap = this.bitmap;
            AbstractC9133u.m16132f(bitmap, "bitmap");
            synchronized (bitmap) {
                canvas.drawBitmap(this.bitmap, GraphExtKt.getFP2WPRendMatrix(this), getMPaint());
                C8736p c8736p = C8736p.f16368a;
            }
        }
        super.onDraw(canvas);
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public void onMeasure() {
        this.bitmap = Bitmap.createScaledBitmap(this.bitmap, this.width, this.height, false);
        getMOutRect().set(GraphExtKt.mapPoint(this, 0.0f, 0.0f, GraphExtKt.getWP2FPMatrix(this)).x, GraphExtKt.mapPoint(this, this.bitmap.getWidth(), 0.0f, GraphExtKt.getWP2FPMatrix(this)).y, GraphExtKt.mapPoint(this, this.bitmap.getWidth(), this.bitmap.getHeight(), GraphExtKt.getWP2FPMatrix(this)).x, GraphExtKt.mapPoint(this, 0.0f, this.bitmap.getHeight(), GraphExtKt.getWP2FPMatrix(this)).y);
    }
}

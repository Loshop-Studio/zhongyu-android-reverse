package com.zykj.sketch.core.graph;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.protobuf.Any;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000f\u001a\u00020\nJ,\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m13558d2 = {"Lcom/zykj/sketch/core/graph/ImageHistoryGraph;", "Lcom/zykj/sketch/core/graph/ViewGraph;", "actionControl", "Lcom/zykj/sketch/core/listener/IControl;", "width", "", "height", "viewWidth", "viewHeight", "fileName", "", "(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;)V", "bitmap", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "getFileName", "getSaleCenterMatrix", "Landroid/graphics/Matrix;", "getSnapshot", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "graphType", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "onDestroy", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
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
        Intrinsics.checkNotNullParameter(actionControl, "actionControl");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.width = i10;
        this.height = i11;
        this.viewWidth = i12;
        this.viewHeight = i13;
        this.fileName = fileName;
        StringBuilder sb = new StringBuilder();
        sb.append(getControl().getSketchConfig().getSourcePath());
        String str = File.separator;
        sb.append(str);
        sb.append("res");
        sb.append(str);
        sb.append(this.fileName);
        String string = sb.toString();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Unit unit = Unit.INSTANCE;
        this.bitmap = BitmapFactory.decodeFile(string, options);
        setMatrix(getSaleCenterMatrix(this.width, this.height, this.viewWidth, this.viewHeight));
        onMeasure();
    }

    private final Matrix getSaleCenterMatrix(int width, int height, int viewWidth, int viewHeight) {
        Matrix matrix = new Matrix();
        matrix.postTranslate((viewWidth / 2) - (width / 2), (viewHeight / 2) - (height / 2));
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
        Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
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
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.bitmap.isRecycled()) {
            Bitmap bitmap = this.bitmap;
            Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
            synchronized (bitmap) {
                canvas.drawBitmap(this.bitmap, GraphExtKt.getFP2WPRendMatrix(this), getMPaint());
                Unit unit = Unit.INSTANCE;
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

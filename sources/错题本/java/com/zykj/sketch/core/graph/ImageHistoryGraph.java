package com.zykj.sketch.core.graph;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Any;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u001e\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/ImageHistoryGraph;", "Lcom/zykj/sketch/core/graph/ViewGraph;", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "", "width", "height", "viewWidth", "viewHeight", "", "fileName", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;)V", "Landroid/graphics/Matrix;", "getSaleCenterMatrix", "(IIII)Landroid/graphics/Matrix;", "Landroid/graphics/Canvas;", "canvas", "Ld6/s;", "onDraw", "(Landroid/graphics/Canvas;)V", "onMeasure", "()V", "getFileName", "()Ljava/lang/String;", "onDestroy", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "getSnapshot", "()Lcom/zykj/sketch/GraphSnapshot$GraphData;", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "graphType", "()Lcom/zykj/sketch/GraphSnapshot$GraphType;", "I", "Ljava/lang/String;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "bitmap", "Landroid/graphics/Bitmap;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ImageHistoryGraph extends ViewGraph {
    private Bitmap bitmap;

    @NotNull
    private String fileName;
    private int height;
    private int viewHeight;
    private int viewWidth;
    private int width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageHistoryGraph(@NotNull IControl actionControl, int i, int i8, int i9, int i10, @NotNull String fileName) {
        super(actionControl);
        AbstractC5830k.m5330g(actionControl, "actionControl");
        AbstractC5830k.m5330g(fileName, "fileName");
        this.width = i;
        this.height = i8;
        this.viewWidth = i9;
        this.viewHeight = i10;
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
        this.bitmap = BitmapFactory.decodeFile(string, options);
        setMatrix(getSaleCenterMatrix(this.width, this.height, this.viewWidth, this.viewHeight));
        onMeasure();
    }

    private final Matrix getSaleCenterMatrix(int width, int height, int viewWidth, int viewHeight) {
        Matrix matrix = new Matrix();
        matrix.postTranslate((viewWidth / 2) - (width / 2), (viewHeight / 2) - (height / 2));
        return matrix;
    }

    public static /* synthetic */ Matrix getSaleCenterMatrix$default(ImageHistoryGraph imageHistoryGraph, int i, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = 0;
        }
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        return imageHistoryGraph.getSaleCenterMatrix(i, i8, i9, i10);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
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
        AbstractC5830k.m5329f(graphDataBuild, "builder.build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.IMAGE_GRAPH;
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IDraw
    public void onDraw(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        if (!this.bitmap.isRecycled()) {
            Bitmap bitmap = this.bitmap;
            AbstractC5830k.m5329f(bitmap, "bitmap");
            synchronized (bitmap) {
                canvas.drawBitmap(this.bitmap, GraphExtKt.getFP2WPRendMatrix(this), getMPaint());
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

package com.zykj.sketch.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.sketch.C7077R;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.graph.ImageHistoryGraph;
import com.zykj.sketch.core.graph.UnBoundedContainerGraph;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import com.zykj.sketch.core.listener.ImitateDraw;
import com.zykj.sketch.core.listener.RealDraw;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0&2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0&H\u0016J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020\fH\u0016J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020.J\u0006\u00100\u001a\u00020.J\u0006\u00101\u001a\u00020.J\b\u00102\u001a\u00020\u000eH\u0016J\b\u00103\u001a\u00020\u0014H\u0016J\n\u00104\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u00105\u001a\u00020\u0010H\u0016J\n\u00106\u001a\u0004\u0018\u00010\u0018H\u0016J\n\u00107\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u00108\u001a\u00020\u0012H\u0016J\b\u00109\u001a\u00020\u001fH\u0016J\b\u0010:\u001a\u00020!H\u0016J\b\u0010;\u001a\u00020\tH\u0016J\u0018\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001fH\u0002J\b\u0010?\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001b\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010@\u001a\u00020#H\u0016J\b\u0010A\u001a\u00020#H\u0016J\u0010\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020CH\u0016J\u0018\u0010D\u001a\u00020#2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0016J\u0012\u0010I\u001a\u00020#2\b\u0010J\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010K\u001a\u00020#H\u0016J\b\u0010L\u001a\u00020#H\u0016J\b\u0010M\u001a\u00020#H\u0016J\u0010\u0010N\u001a\u00020#2\u0006\u0010O\u001a\u00020\fH\u0016J\u0010\u0010P\u001a\u00020#2\u0006\u0010Q\u001a\u00020\u000eH\u0016J(\u0010P\u001a\u00020#2\u0006\u0010R\u001a\u00020\f2\u0006\u0010S\u001a\u00020\f2\u0006\u0010T\u001a\u00020\f2\u0006\u0010U\u001a\u00020\fH\u0016J\u0012\u0010V\u001a\u00020#2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010W\u001a\u00020#2\b\u0010=\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010X\u001a\u00020#2\b\u0010=\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010Y\u001a\u00020#2\u0006\u0010Z\u001a\u00020\u0012H\u0016J\u0010\u0010[\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\\\u001a\u00020#2\u0006\u0010>\u001a\u00020\u001fH\u0016J\u0010\u0010]\u001a\u00020#2\u0006\u0010^\u001a\u00020\u001cH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, m13558d2 = {"Lcom/zykj/sketch/core/GraphControl;", "Lcom/zykj/sketch/core/listener/IControl;", "context", "Landroid/content/Context;", "mDrawView", "Lcom/zykj/sketch/core/listener/RealDraw;", "mDrawTempView", "Lcom/zykj/sketch/core/listener/ImitateDraw;", "sketchConfig", "Lcom/zykj/sketch/core/config/SketchConfig;", "(Landroid/content/Context;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;Lcom/zykj/sketch/core/config/SketchConfig;)V", "backgroundColor", "", "cameraMatrix", "Landroid/graphics/Matrix;", "config", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "currentMode", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "deleteBitmap", "Landroid/graphics/Bitmap;", "drawArea", "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;", "graphMatrixListener", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "imageDeleteListener", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "isRender", "", "isTouch", "rootGraph", "Lcom/zykj/sketch/core/graph/Graph;", "scale", "", "clear", "", "clearTempPaint", "findGraph", "", "x", "y", TypedValues.CycleType.S_WAVE_OFFSET, "findSelectGraph", "forceRender", "getBackgroundColor", "getBaseAudioPath", "", "getBaseImagePath", "getBasePPTPath", "getBasePath", "getCameraMatrix", "getDeleteBitmap", "getDrawArea", "getGraphConfig", "getGraphMatrixListener", "getImageDeleteListener", "getMode", "getRootGraph", "getScale", "getSketchConfig", "handleDeleteListener", "listener", "graph", "initGraphConfig", "onDestroy", "render", "canvas", "Landroid/graphics/Canvas;", "renderTempPath", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "renderTempThumbnail", "bitmap", "reset", "resetGraph", "resetStatus", "setBackgroundColor", TypedValues.Custom.S_COLOR, "setCameraMatrix", "matrix", "targetWidth", "targetHeight", "width", "height", "setDrawArea", "setGraphMatrixListener", "setImageDeleteListener", "setMode", "mode", "setRecordConfig", "setRootGraph", "setTouch", "touch", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class GraphControl implements IControl {
    private int backgroundColor;
    private final Matrix cameraMatrix;
    private EzyDrawBoard.ActionGraphConfig.GraphConfig config;
    private EzyDrawBoard.ActionModeConfig.Mode currentMode;
    private Bitmap deleteBitmap;
    private EzyDrawBoard.DrawArea drawArea;
    private GraphMatrixListener graphMatrixListener;
    private ImageDeleteListener imageDeleteListener;
    private boolean isRender;
    private boolean isTouch;
    private final ImitateDraw mDrawTempView;
    private final RealDraw mDrawView;
    private Graph rootGraph;
    private float scale;
    private final SketchConfig sketchConfig;

    public GraphControl(Context context, RealDraw mDrawView, ImitateDraw mDrawTempView, SketchConfig sketchConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mDrawView, "mDrawView");
        Intrinsics.checkNotNullParameter(mDrawTempView, "mDrawTempView");
        Intrinsics.checkNotNullParameter(sketchConfig, "sketchConfig");
        this.mDrawView = mDrawView;
        this.mDrawTempView = mDrawTempView;
        this.sketchConfig = sketchConfig;
        this.scale = 1.0f;
        this.isRender = true;
        this.cameraMatrix = new Matrix();
        this.rootGraph = new UnBoundedContainerGraph(this);
        this.currentMode = EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING;
        this.backgroundColor = -1;
        this.config = initGraphConfig();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), C7077R.drawable.mark_delete);
        Graph.Companion companion = Graph.INSTANCE;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, (int) companion.getCornerSize().x, (int) companion.getCornerSize().y, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(\n    …y.toInt(), true\n        )");
        this.deleteBitmap = bitmapCreateScaledBitmap;
        mDrawView.drawGraph(this.rootGraph);
    }

    private final void handleDeleteListener(ImageDeleteListener listener, Graph graph) {
        if (graph instanceof ImageGraph) {
            listener.onDeleteImagePath(((ImageGraph) graph).getFileName());
        } else if (graph instanceof ImageHistoryGraph) {
            listener.onDeleteImagePath(((ImageHistoryGraph) graph).getFileName());
        }
        Iterator<T> it = graph.getChild().iterator();
        while (it.hasNext()) {
            handleDeleteListener(listener, (Graph) it.next());
        }
    }

    private final EzyDrawBoard.ActionGraphConfig.GraphConfig initGraphConfig() {
        EzyDrawBoard.ActionGraphConfig.GraphConfig.Builder builderNewBuilder = EzyDrawBoard.ActionGraphConfig.GraphConfig.newBuilder();
        builderNewBuilder.setColor(-16776961);
        builderNewBuilder.setWidth(5.0f);
        EzyDrawBoard.ActionGraphConfig.GraphConfig graphConfigBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(graphConfigBuild, "newBuilder.build()");
        return graphConfigBuild;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void clear() {
        ImageDeleteListener imageDeleteListener = this.imageDeleteListener;
        if (imageDeleteListener != null) {
            handleDeleteListener(imageDeleteListener, this.rootGraph);
        }
        this.rootGraph.clear();
        resetStatus();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void clearTempPaint() {
        this.mDrawTempView.clearGraph();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public List<Graph> findGraph(float x9, float y9, float offset) {
        return this.rootGraph.findGraph(x9, y9, offset);
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public List<Graph> findSelectGraph() {
        return this.rootGraph.findSelectGraph();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void forceRender() {
        this.mDrawView.drawGraph(this.rootGraph);
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBaseAudioPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSketchConfig().getSourcePath());
        String str = File.separator;
        sb.append(str);
        sb.append("res");
        sb.append(str);
        sb.append("audio");
        sb.append(str);
        return sb.toString();
    }

    public final String getBaseImagePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSketchConfig().getSourcePath());
        String str = File.separator;
        sb.append(str);
        sb.append("res");
        sb.append(str);
        return sb.toString();
    }

    public final String getBasePPTPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSketchConfig().getSourcePath());
        String str = File.separator;
        sb.append(str);
        sb.append("res");
        sb.append(str);
        sb.append("ppt");
        sb.append(str);
        return sb.toString();
    }

    public final String getBasePath() {
        return getSketchConfig().getSourcePath() + File.separator;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public Matrix getCameraMatrix() {
        return this.cameraMatrix;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public Bitmap getDeleteBitmap() {
        return this.deleteBitmap;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public EzyDrawBoard.DrawArea getDrawArea() {
        return this.drawArea;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    /* renamed from: getGraphConfig, reason: from getter */
    public EzyDrawBoard.ActionGraphConfig.GraphConfig getConfig() {
        return this.config;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public GraphMatrixListener getGraphMatrixListener() {
        return this.graphMatrixListener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public ImageDeleteListener getImageDeleteListener() {
        return this.imageDeleteListener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    /* renamed from: getMode, reason: from getter */
    public EzyDrawBoard.ActionModeConfig.Mode getCurrentMode() {
        return this.currentMode;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public Graph getRootGraph() {
        return this.rootGraph;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public float getScale() {
        return this.scale;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public SketchConfig getSketchConfig() {
        return this.sketchConfig;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    /* renamed from: isRender, reason: from getter */
    public boolean getIsRender() {
        return this.isRender;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    /* renamed from: isTouch, reason: from getter */
    public boolean getIsTouch() {
        return this.isTouch;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void onDestroy() {
        this.deleteBitmap.recycle();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void render() {
        if (this.isRender) {
            this.mDrawView.drawGraph(this.rootGraph);
        }
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void renderTempPath(Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (this.isRender) {
            Matrix matrix = new Matrix();
            matrix.postConcat(this.rootGraph.getMMatrix());
            matrix.postConcat(this.cameraMatrix);
            this.mDrawTempView.graphMatrix(matrix);
            this.mDrawTempView.drawPath(path, paint);
        }
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void renderTempThumbnail(Bitmap bitmap) {
        if (bitmap != null) {
            this.mDrawTempView.drawThumbnail(bitmap);
        }
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void reset() {
        this.mDrawTempView.clearGraph();
        this.rootGraph.clear();
        this.config = initGraphConfig();
        this.backgroundColor = -1;
        this.drawArea = null;
        this.mDrawView.setLimitDrawArea(null);
        this.mDrawView.setDrawBackground(this.backgroundColor);
        this.mDrawTempView.setLimitDrawArea(null);
        render();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void resetGraph() {
        this.config = initGraphConfig();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void resetStatus() {
        if (this.isRender) {
            this.mDrawTempView.clearGraph();
        }
        this.rootGraph.cancelSelected();
        render();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setBackgroundColor(int color) {
        this.backgroundColor = color;
        this.mDrawView.setDrawBackground(color);
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setCameraMatrix(int targetWidth, int targetHeight, int width, int height) {
        float f10 = targetWidth / width;
        float f11 = targetHeight / height;
        if (f10 > f11) {
            f10 = f11;
        }
        this.scale = f10;
        Matrix matrix = new Matrix();
        float f12 = this.scale;
        matrix.setScale(f12, f12, width / 2, height / 2);
        matrix.postTranslate((targetWidth / 2) - r6, (targetHeight / 2) - r7);
        this.cameraMatrix.set(matrix);
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setDrawArea(EzyDrawBoard.DrawArea drawArea) {
        this.drawArea = drawArea;
        if (drawArea == null) {
            this.mDrawTempView.setLimitDrawArea(null);
            this.mDrawView.setLimitDrawArea(null);
        }
        if (drawArea != null) {
            this.mDrawTempView.setLimitDrawArea(new RectF(drawArea.getLeftTopPoint().getX(), drawArea.getLeftTopPoint().getY(), drawArea.getRightBottomPoint().getX(), drawArea.getRightBottomPoint().getY()));
            this.mDrawView.setLimitDrawArea(new RectF(drawArea.getLeftTopPoint().getX(), drawArea.getLeftTopPoint().getY(), drawArea.getRightBottomPoint().getX(), drawArea.getRightBottomPoint().getY()));
        }
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setGraphMatrixListener(GraphMatrixListener listener) {
        this.graphMatrixListener = listener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setImageDeleteListener(ImageDeleteListener listener) {
        this.imageDeleteListener = listener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setMode(EzyDrawBoard.ActionModeConfig.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.currentMode = mode;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setRecordConfig(EzyDrawBoard.ActionGraphConfig.GraphConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setRootGraph(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.rootGraph = graph;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setTouch(boolean touch) {
        this.isTouch = touch;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void isRender(boolean isRender) {
        this.isRender = isRender;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void render(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.rootGraph.onDraw(canvas);
        this.mDrawTempView.clearGraph();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setCameraMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.cameraMatrix.set(matrix);
    }
}

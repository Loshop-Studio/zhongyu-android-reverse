package com.zykj.sketch.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.taobao.accs.common.Constants;
import com.zykj.sketch.C8705R;
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
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
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
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(mDrawView, "mDrawView");
        AbstractC9979u.m20294g(mDrawTempView, "mDrawTempView");
        AbstractC9979u.m20294g(sketchConfig, "sketchConfig");
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
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), C8705R.drawable.mark_delete);
        Graph.Companion companion = Graph.Companion;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, (int) companion.getCornerSize().x, (int) companion.getCornerSize().y, true);
        AbstractC9979u.m20293f(bitmapCreateScaledBitmap, "createScaledBitmap(\n    …y.toInt(), true\n        )");
        this.deleteBitmap = bitmapCreateScaledBitmap;
        mDrawView.drawGraph(this.rootGraph);
    }

    private final void handleDeleteListener(ImageDeleteListener imageDeleteListener, Graph graph) {
        if (graph instanceof ImageGraph) {
            imageDeleteListener.onDeleteImagePath(((ImageGraph) graph).getFileName());
        } else if (graph instanceof ImageHistoryGraph) {
            imageDeleteListener.onDeleteImagePath(((ImageHistoryGraph) graph).getFileName());
        }
        Iterator<T> it = graph.getChild().iterator();
        while (it.hasNext()) {
            handleDeleteListener(imageDeleteListener, (Graph) it.next());
        }
    }

    private final EzyDrawBoard.ActionGraphConfig.GraphConfig initGraphConfig() {
        EzyDrawBoard.ActionGraphConfig.GraphConfig.Builder builderNewBuilder = EzyDrawBoard.ActionGraphConfig.GraphConfig.newBuilder();
        builderNewBuilder.setColor(-16776961);
        builderNewBuilder.setWidth(5.0f);
        EzyDrawBoard.ActionGraphConfig.GraphConfig graphConfigBuild = builderNewBuilder.build();
        AbstractC9979u.m20293f(graphConfigBuild, "newBuilder.build()");
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
    public List<Graph> findGraph(float f10, float f11, float f12) {
        return this.rootGraph.findGraph(f10, f11, f12);
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getSketchConfig().getSourcePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(Constants.SEND_TYPE_RES);
        sb2.append(str);
        sb2.append("audio");
        sb2.append(str);
        return sb2.toString();
    }

    public final String getBaseImagePath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getSketchConfig().getSourcePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(Constants.SEND_TYPE_RES);
        sb2.append(str);
        return sb2.toString();
    }

    public final String getBasePPTPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getSketchConfig().getSourcePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(Constants.SEND_TYPE_RES);
        sb2.append(str);
        sb2.append("ppt");
        sb2.append(str);
        return sb2.toString();
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
    public EzyDrawBoard.ActionGraphConfig.GraphConfig getGraphConfig() {
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
    public EzyDrawBoard.ActionModeConfig.Mode getMode() {
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
    public boolean isRender() {
        return this.isRender;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public boolean isTouch() {
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
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(paint, "paint");
        if (this.isRender) {
            Matrix matrix = new Matrix();
            matrix.postConcat(this.rootGraph.getMatrix());
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
    public void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
        this.mDrawView.setDrawBackground(i10);
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setCameraMatrix(int i10, int i11, int i12, int i13) {
        float f10 = i10 / i12;
        float f11 = i11 / i13;
        if (f10 > f11) {
            f10 = f11;
        }
        this.scale = f10;
        Matrix matrix = new Matrix();
        float f12 = this.scale;
        matrix.setScale(f12, f12, i12 / 2, i13 / 2);
        matrix.postTranslate((i10 / 2) - r6, (i11 / 2) - r7);
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
    public void setGraphMatrixListener(GraphMatrixListener graphMatrixListener) {
        this.graphMatrixListener = graphMatrixListener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setImageDeleteListener(ImageDeleteListener imageDeleteListener) {
        this.imageDeleteListener = imageDeleteListener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setMode(EzyDrawBoard.ActionModeConfig.Mode mode) {
        AbstractC9979u.m20294g(mode, "mode");
        this.currentMode = mode;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setRecordConfig(EzyDrawBoard.ActionGraphConfig.GraphConfig config) {
        AbstractC9979u.m20294g(config, "config");
        this.config = config;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setRootGraph(Graph graph) {
        AbstractC9979u.m20294g(graph, "graph");
        this.rootGraph = graph;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setTouch(boolean z10) {
        this.isTouch = z10;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void isRender(boolean z10) {
        this.isRender = z10;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void render(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        this.rootGraph.onDraw(canvas);
        this.mDrawTempView.clearGraph();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setCameraMatrix(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        this.cameraMatrix.set(matrix);
    }
}

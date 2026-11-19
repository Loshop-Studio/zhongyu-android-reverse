package com.zykj.sketch.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v4.media.AbstractC0037f;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.sketch.C5180R;
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
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000203H\u0016¢\u0006\u0004\b7\u00108J-\u0010>\u001a\b\u0012\u0004\u0012\u0002030=2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u0002030=H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0010H\u0016¢\u0006\u0004\bB\u00102J\u000f\u0010C\u001a\u00020\u0010H\u0016¢\u0006\u0004\bC\u00102J\u0017\u0010B\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bB\u0010FJ\u001f\u0010K\u001a\u00020\u00102\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010O\u001a\u00020\u00102\b\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bO\u0010PJ/\u0010U\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\u00132\u0006\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010U\u001a\u00020\u00102\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bU\u0010YJ\u000f\u0010Z\u001a\u000209H\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020WH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020MH\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020%H\u0016¢\u0006\u0004\b`\u0010'J\u0017\u0010`\u001a\u00020\u00102\u0006\u0010`\u001a\u00020%H\u0016¢\u0006\u0004\b`\u0010*J\u000f\u0010a\u001a\u00020\u0010H\u0016¢\u0006\u0004\ba\u00102J\u000f\u0010b\u001a\u00020\u0010H\u0016¢\u0006\u0004\bb\u00102J\u000f\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bc\u00102J\u000f\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\bd\u00102J\u000f\u0010e\u001a\u00020\u0010H\u0016¢\u0006\u0004\be\u00102J\u0019\u0010g\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bg\u0010hJ\u0011\u0010i\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\bH\u0016¢\u0006\u0004\bk\u0010lJ\r\u0010n\u001a\u00020m¢\u0006\u0004\bn\u0010oJ\r\u0010p\u001a\u00020m¢\u0006\u0004\bp\u0010oJ\r\u0010q\u001a\u00020m¢\u0006\u0004\bq\u0010oJ\r\u0010r\u001a\u00020m¢\u0006\u0004\br\u0010oJ\u000f\u0010s\u001a\u00020+H\u0002¢\u0006\u0004\bs\u0010-J\u001f\u0010t\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u00106\u001a\u000203H\u0002¢\u0006\u0004\bt\u0010uR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010vR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010wR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010xR\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010yR\u0016\u0010z\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010`\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010~R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010~R\u0015\u0010\u007f\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010\u0087\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008c\u0001"}, m5110d2 = {"Lcom/zykj/sketch/core/GraphControl;", "Lcom/zykj/sketch/core/listener/IControl;", "Landroid/content/Context;", "context", "Lcom/zykj/sketch/core/listener/RealDraw;", "mDrawView", "Lcom/zykj/sketch/core/listener/ImitateDraw;", "mDrawTempView", "Lcom/zykj/sketch/core/config/SketchConfig;", "sketchConfig", "<init>", "(Landroid/content/Context;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;Lcom/zykj/sketch/core/config/SketchConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "getMode", "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "mode", "Ld6/s;", "setMode", "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V", "", "getBackgroundColor", "()I", TypedValues.Custom.S_COLOR, "setBackgroundColor", "(I)V", "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;", "getDrawArea", "()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;", "drawArea", "setDrawArea", "(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)V", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "listener", "setImageDeleteListener", "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V", "getImageDeleteListener", "()Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "", "isTouch", "()Z", "touch", "setTouch", "(Z)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "getGraphConfig", "()Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "config", "setRecordConfig", "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V", "resetGraph", "()V", "Lcom/zykj/sketch/core/graph/Graph;", "getRootGraph", "()Lcom/zykj/sketch/core/graph/Graph;", "graph", "setRootGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "", "x", "y", TypedValues.CycleType.S_WAVE_OFFSET, "", "findGraph", "(FFF)Ljava/util/List;", "findSelectGraph", "()Ljava/util/List;", "render", "forceRender", "Landroid/graphics/Canvas;", "canvas", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Path;", "path", "Landroid/graphics/Paint;", "paint", "renderTempPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "Landroid/graphics/Bitmap;", "bitmap", "renderTempThumbnail", "(Landroid/graphics/Bitmap;)V", "targetWidth", "targetHeight", "width", "height", "setCameraMatrix", "(IIII)V", "Landroid/graphics/Matrix;", "matrix", "(Landroid/graphics/Matrix;)V", "getScale", "()F", "getCameraMatrix", "()Landroid/graphics/Matrix;", "getDeleteBitmap", "()Landroid/graphics/Bitmap;", "isRender", "clearTempPaint", "resetStatus", "reset", "onDestroy", "clear", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "setGraphMatrixListener", "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V", "getGraphMatrixListener", "()Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "getSketchConfig", "()Lcom/zykj/sketch/core/config/SketchConfig;", "", "getBasePath", "()Ljava/lang/String;", "getBasePPTPath", "getBaseImagePath", "getBaseAudioPath", "initGraphConfig", "handleDeleteListener", "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;Lcom/zykj/sketch/core/graph/Graph;)V", "Lcom/zykj/sketch/core/listener/RealDraw;", "Lcom/zykj/sketch/core/listener/ImitateDraw;", "Lcom/zykj/sketch/core/config/SketchConfig;", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "deleteBitmap", "Landroid/graphics/Bitmap;", "scale", "F", "Z", "cameraMatrix", "Landroid/graphics/Matrix;", "rootGraph", "Lcom/zykj/sketch/core/graph/Graph;", "currentMode", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "backgroundColor", "I", "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;", "graphMatrixListener", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "imageDeleteListener", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphControl implements IControl {
    private int backgroundColor;

    @NotNull
    private final Matrix cameraMatrix;

    @NotNull
    private EzyDrawBoard.ActionGraphConfig.GraphConfig config;

    @NotNull
    private EzyDrawBoard.ActionModeConfig.Mode currentMode;

    @NotNull
    private Bitmap deleteBitmap;

    @Nullable
    private EzyDrawBoard.DrawArea drawArea;

    @Nullable
    private GraphMatrixListener graphMatrixListener;

    @Nullable
    private ImageDeleteListener imageDeleteListener;
    private boolean isRender;
    private boolean isTouch;

    @NotNull
    private final ImitateDraw mDrawTempView;

    @NotNull
    private final RealDraw mDrawView;

    @NotNull
    private Graph rootGraph;
    private float scale;

    @NotNull
    private final SketchConfig sketchConfig;

    public GraphControl(@NotNull Context context, @NotNull RealDraw mDrawView, @NotNull ImitateDraw mDrawTempView, @NotNull SketchConfig sketchConfig) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(mDrawView, "mDrawView");
        AbstractC5830k.m5330g(mDrawTempView, "mDrawTempView");
        AbstractC5830k.m5330g(sketchConfig, "sketchConfig");
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
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), C5180R.drawable.mark_delete);
        Graph.Companion companion = Graph.INSTANCE;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, (int) companion.getCornerSize().x, (int) companion.getCornerSize().y, true);
        AbstractC5830k.m5329f(bitmapCreateScaledBitmap, "createScaledBitmap(\n    …y.toInt(), true\n        )");
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
        AbstractC5830k.m5329f(graphConfigBuild, "newBuilder.build()");
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
    @NotNull
    public List<Graph> findGraph(float x3, float y2, float offset) {
        return this.rootGraph.findGraph(x3, y2, offset);
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @NotNull
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

    @NotNull
    public final String getBaseAudioPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSketchConfig().getSourcePath());
        String str = File.separator;
        AbstractC1923c.m1060x(sb, str, SourceRouterRecord.SOURCE_RES_IMAGE, str, "audio");
        sb.append(str);
        return sb.toString();
    }

    @NotNull
    public final String getBaseImagePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSketchConfig().getSourcePath());
        String str = File.separator;
        return AbstractC0037f.m92q(sb, str, SourceRouterRecord.SOURCE_RES_IMAGE, str);
    }

    @NotNull
    public final String getBasePPTPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(getSketchConfig().getSourcePath());
        String str = File.separator;
        AbstractC1923c.m1060x(sb, str, SourceRouterRecord.SOURCE_RES_IMAGE, str, "ppt");
        sb.append(str);
        return sb.toString();
    }

    @NotNull
    public final String getBasePath() {
        return getSketchConfig().getSourcePath() + File.separator;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @NotNull
    public Matrix getCameraMatrix() {
        return this.cameraMatrix;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @NotNull
    public Bitmap getDeleteBitmap() {
        return this.deleteBitmap;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @Nullable
    public EzyDrawBoard.DrawArea getDrawArea() {
        return this.drawArea;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @NotNull
    /* renamed from: getGraphConfig, reason: from getter */
    public EzyDrawBoard.ActionGraphConfig.GraphConfig getConfig() {
        return this.config;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @Nullable
    public GraphMatrixListener getGraphMatrixListener() {
        return this.graphMatrixListener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @Nullable
    public ImageDeleteListener getImageDeleteListener() {
        return this.imageDeleteListener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @NotNull
    /* renamed from: getMode, reason: from getter */
    public EzyDrawBoard.ActionModeConfig.Mode getCurrentMode() {
        return this.currentMode;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @NotNull
    public Graph getRootGraph() {
        return this.rootGraph;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public float getScale() {
        return this.scale;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    @NotNull
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
    public void renderTempPath(@NotNull Path path, @NotNull Paint paint) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(paint, "paint");
        if (this.isRender) {
            Matrix matrix = new Matrix();
            matrix.postConcat(this.rootGraph.getMMatrix());
            matrix.postConcat(this.cameraMatrix);
            this.mDrawTempView.graphMatrix(matrix);
            this.mDrawTempView.drawPath(path, paint);
        }
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void renderTempThumbnail(@Nullable Bitmap bitmap) {
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
        float f = targetWidth / width;
        float f7 = targetHeight / height;
        if (f > f7) {
            f = f7;
        }
        this.scale = f;
        Matrix matrix = new Matrix();
        float f8 = this.scale;
        matrix.setScale(f8, f8, width / 2, height / 2);
        matrix.postTranslate((targetWidth / 2) - r6, (targetHeight / 2) - r7);
        this.cameraMatrix.set(matrix);
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setDrawArea(@Nullable EzyDrawBoard.DrawArea drawArea) {
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
    public void setGraphMatrixListener(@Nullable GraphMatrixListener listener) {
        this.graphMatrixListener = listener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setImageDeleteListener(@Nullable ImageDeleteListener listener) {
        this.imageDeleteListener = listener;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setMode(@NotNull EzyDrawBoard.ActionModeConfig.Mode mode) {
        AbstractC5830k.m5330g(mode, "mode");
        this.currentMode = mode;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setRecordConfig(@NotNull EzyDrawBoard.ActionGraphConfig.GraphConfig config) {
        AbstractC5830k.m5330g(config, "config");
        this.config = config;
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setRootGraph(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "graph");
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
    public void render(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        this.rootGraph.onDraw(canvas);
        this.mDrawTempView.clearGraph();
    }

    @Override // com.zykj.sketch.core.listener.IControl
    public void setCameraMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        this.cameraMatrix.set(matrix);
    }
}

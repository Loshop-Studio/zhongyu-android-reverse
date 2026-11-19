package com.zykj.sketch.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.listener.RealDraw;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\fH\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00101R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0018\u00108\u001a\u000607R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00101R\u0016\u0010;\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010@\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, m5110d2 = {"Lcom/zykj/sketch/widgets/TextureDrawView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lcom/zykj/sketch/core/listener/RealDraw;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/zykj/sketch/core/graph/Graph;", "graph", "Ld6/s;", "drawGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "Landroid/view/View;", "changedView", "", "visibility", "dispatchVisibilityChanged", "(Landroid/view/View;I)V", "", "isRend", "(Z)V", "colorId", "setDrawBackground", "(I)V", "Landroid/graphics/RectF;", "rectF", "setLimitDrawArea", "(Landroid/graphics/RectF;)V", "Landroid/graphics/SurfaceTexture;", "surface", "width", "height", "onSurfaceTextureSizeChanged", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "onSurfaceTextureAvailable", "onDetachedFromWindow", "()V", "shutdown", "Ljava/util/concurrent/ScheduledExecutorService;", "execute", "Ljava/util/concurrent/ScheduledExecutorService;", "mIsDrawing", "Z", "isVisibility", "Landroid/view/Surface;", "mSurface", "Landroid/view/Surface;", "Lcom/zykj/sketch/core/graph/Graph;", "Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;", "paintThread", "Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;", "isLocked", "backgroundId", "I", "limitDrawArea", "Landroid/graphics/RectF;", "paintTableArea", "rendRectF", "Landroid/graphics/Paint;", "renderRectPaint", "Landroid/graphics/Paint;", "tempPaint", "Landroid/graphics/Matrix;", "tempMatrix", "Landroid/graphics/Matrix;", "PaintThread", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TextureDrawView extends TextureView implements TextureView.SurfaceTextureListener, RealDraw {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int backgroundId;

    @Nullable
    private ScheduledExecutorService execute;

    @Nullable
    private Graph graph;
    private boolean isLocked;
    private boolean isRend;
    private boolean isVisibility;

    @Nullable
    private RectF limitDrawArea;
    private boolean mIsDrawing;

    @Nullable
    private Surface mSurface;

    @Nullable
    private RectF paintTableArea;

    @NotNull
    private final PaintThread paintThread;

    @NotNull
    private RectF rendRectF;

    @NotNull
    private Paint renderRectPaint;

    @NotNull
    private Matrix tempMatrix;

    @NotNull
    private Paint tempPaint;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;", "Ljava/lang/Thread;", "<init>", "(Lcom/zykj/sketch/widgets/TextureDrawView;)V", "Ld6/s;", "run", "()V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class PaintThread extends Thread {
        public PaintThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            RectF rectF;
            super.run();
            if (TextureDrawView.this.mIsDrawing && !TextureDrawView.this.isLocked && TextureDrawView.this.isRend && TextureDrawView.this.isVisibility) {
                TextureDrawView.this.isLocked = true;
                Surface surface = TextureDrawView.this.mSurface;
                if (surface != null) {
                    TextureDrawView textureDrawView = TextureDrawView.this;
                    synchronized (surface) {
                        Canvas canvasLockCanvas = surface.lockCanvas(new Rect(0, 0, textureDrawView.getWidth(), textureDrawView.getHeight()));
                        canvasLockCanvas.drawPaint(textureDrawView.tempPaint);
                        try {
                            canvasLockCanvas.drawColor(textureDrawView.backgroundId);
                            if (textureDrawView.paintTableArea == null || ((rectF = textureDrawView.paintTableArea) != null && rectF.isEmpty())) {
                                textureDrawView.paintTableArea = new RectF(0.0f, 0.0f, canvasLockCanvas.getWidth(), canvasLockCanvas.getHeight());
                            }
                            Graph graph = textureDrawView.graph;
                            if (graph != null) {
                                if (textureDrawView.limitDrawArea == null) {
                                    graph.onDraw(canvasLockCanvas);
                                } else if (textureDrawView.limitDrawArea != null) {
                                    textureDrawView.tempMatrix.reset();
                                    textureDrawView.tempMatrix.postConcat(graph.getMMatrix());
                                    textureDrawView.tempMatrix.postConcat(graph.getControl().getCameraMatrix());
                                    if (textureDrawView.tempMatrix.mapRect(textureDrawView.rendRectF, textureDrawView.limitDrawArea) && textureDrawView.rendRectF.intersect(textureDrawView.paintTableArea)) {
                                        canvasLockCanvas.drawRect(textureDrawView.rendRectF, textureDrawView.renderRectPaint);
                                        canvasLockCanvas.clipRect(textureDrawView.rendRectF);
                                        graph.onDraw(canvasLockCanvas);
                                    }
                                }
                            }
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                }
                TextureDrawView.this.isLocked = false;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureDrawView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.isVisibility = true;
        this.isRend = true;
        this.paintThread = new PaintThread();
        this.backgroundId = -1;
        this.rendRectF = new RectF();
        this.renderRectPaint = new Paint();
        this.tempPaint = new Paint();
        this.tempMatrix = new Matrix();
        setSurfaceTextureListener(this);
        this.renderRectPaint.setStrokeWidth(2.0f);
        this.renderRectPaint.setAntiAlias(true);
        this.renderRectPaint.setDither(true);
        this.renderRectPaint.setColor(Color.parseColor("#797979"));
        this.renderRectPaint.setStyle(Paint.Style.STROKE);
        this.renderRectPaint.setStrokeJoin(Paint.Join.ROUND);
        this.renderRectPaint.setStrokeCap(Paint.Cap.ROUND);
        this.renderRectPaint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        this.tempPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    public void dispatchVisibilityChanged(@NotNull View changedView, int visibility) {
        AbstractC5830k.m5330g(changedView, "changedView");
        super.dispatchVisibilityChanged(changedView, visibility);
        this.isVisibility = visibility == 0;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void drawGraph(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        this.graph = graph;
    }

    public final void isRend(boolean isRend) {
        this.isRend = isRend;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIsDrawing = false;
        this.isLocked = true;
        ScheduledExecutorService scheduledExecutorService = this.execute;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.execute = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@Nullable SurfaceTexture surface, int width, int height) {
        this.mIsDrawing = true;
        this.isLocked = false;
        Surface surface2 = new Surface(surface);
        this.mSurface = surface2;
        try {
            Canvas canvasLockCanvas = surface2.lockCanvas(new Rect(0, 0, width, height));
            if (canvasLockCanvas != null) {
                canvasLockCanvas.drawColor(-1);
            }
            Surface surface3 = this.mSurface;
            if (surface3 != null) {
                surface3.unlockCanvasAndPost(canvasLockCanvas);
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            this.execute = scheduledExecutorServiceNewScheduledThreadPool;
            if (scheduledExecutorServiceNewScheduledThreadPool != null) {
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(this.paintThread, 0L, 24L, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@Nullable SurfaceTexture surface) {
        this.mIsDrawing = false;
        this.isLocked = true;
        try {
            ScheduledExecutorService scheduledExecutorService = this.execute;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.execute = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@Nullable SurfaceTexture surface, int width, int height) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@Nullable SurfaceTexture surface) {
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void setDrawBackground(int colorId) {
        this.backgroundId = colorId;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void setLimitDrawArea(@Nullable RectF rectF) {
        this.limitDrawArea = rectF;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void shutdown() {
        this.mIsDrawing = false;
        this.isLocked = true;
        this.graph = null;
        ScheduledExecutorService scheduledExecutorService = this.execute;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.execute = null;
    }
}

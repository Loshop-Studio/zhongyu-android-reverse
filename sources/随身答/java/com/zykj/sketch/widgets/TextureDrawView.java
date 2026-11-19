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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\nH\u0014J\u0010\u0010&\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010'\u001a\u00020\"H\u0014J\"\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0016J\u0012\u0010-\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\"\u0010.\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0016J\u0012\u0010/\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\nH\u0016J\u0012\u00102\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u00104\u001a\u00020\"H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, m13413d2 = {"Lcom/zykj/sketch/widgets/TextureDrawView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lcom/zykj/sketch/core/listener/RealDraw;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundId", "", "execute", "Ljava/util/concurrent/ScheduledExecutorService;", "graph", "Lcom/zykj/sketch/core/graph/Graph;", "isLocked", "", "isRend", "isVisibility", "limitDrawArea", "Landroid/graphics/RectF;", "mIsDrawing", "mSurface", "Landroid/view/Surface;", "paintTableArea", "paintThread", "Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;", "rendRectF", "renderRectPaint", "Landroid/graphics/Paint;", "tempMatrix", "Landroid/graphics/Matrix;", "tempPaint", "dispatchVisibilityChanged", "", "changedView", "Landroid/view/View;", "visibility", "drawGraph", "onDetachedFromWindow", "onSurfaceTextureAvailable", "surface", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "setDrawBackground", "colorId", "setLimitDrawArea", "rectF", "shutdown", "PaintThread", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class TextureDrawView extends TextureView implements TextureView.SurfaceTextureListener, RealDraw {
    public Map<Integer, View> _$_findViewCache;
    private int backgroundId;
    private ScheduledExecutorService execute;
    private Graph graph;
    private boolean isLocked;
    private boolean isRend;
    private boolean isVisibility;
    private RectF limitDrawArea;
    private boolean mIsDrawing;
    private Surface mSurface;
    private RectF paintTableArea;
    private final PaintThread paintThread;
    private RectF rendRectF;
    private Paint renderRectPaint;
    private Matrix tempMatrix;
    private Paint tempPaint;

    @Metadata(m13412d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m13413d2 = {"Lcom/zykj/sketch/widgets/TextureDrawView$PaintThread;", "Ljava/lang/Thread;", "(Lcom/zykj/sketch/widgets/TextureDrawView;)V", "run", "", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
                        Canvas lockCanvas = surface.lockCanvas(new Rect(0, 0, textureDrawView.getWidth(), textureDrawView.getHeight()));
                        lockCanvas.drawPaint(textureDrawView.tempPaint);
                        Intrinsics.checkNotNullExpressionValue(lockCanvas, "lockCanvas");
                        try {
                            lockCanvas.drawColor(textureDrawView.backgroundId);
                            if (textureDrawView.paintTableArea == null || ((rectF = textureDrawView.paintTableArea) != null && rectF.isEmpty())) {
                                textureDrawView.paintTableArea = new RectF(0.0f, 0.0f, lockCanvas.getWidth(), lockCanvas.getHeight());
                            }
                            Graph graph = textureDrawView.graph;
                            if (graph != null) {
                                if (textureDrawView.limitDrawArea == null) {
                                    graph.onDraw(lockCanvas);
                                    Unit unit = Unit.INSTANCE;
                                } else if (textureDrawView.limitDrawArea != null) {
                                    textureDrawView.tempMatrix.reset();
                                    textureDrawView.tempMatrix.postConcat(graph.getMMatrix());
                                    textureDrawView.tempMatrix.postConcat(graph.getControl().getCameraMatrix());
                                    if (textureDrawView.tempMatrix.mapRect(textureDrawView.rendRectF, textureDrawView.limitDrawArea) && textureDrawView.rendRectF.intersect(textureDrawView.paintTableArea)) {
                                        lockCanvas.drawRect(textureDrawView.rendRectF, textureDrawView.renderRectPaint);
                                        lockCanvas.clipRect(textureDrawView.rendRectF);
                                        graph.onDraw(lockCanvas);
                                    }
                                    Unit unit2 = Unit.INSTANCE;
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
    public TextureDrawView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
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

    public View _$_findCachedViewById(int i9) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i9));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i9);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i9), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    public void dispatchVisibilityChanged(View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.dispatchVisibilityChanged(changedView, visibility);
        this.isVisibility = visibility == 0;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void drawGraph(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
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
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
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
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
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
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void setDrawBackground(int colorId) {
        this.backgroundId = colorId;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void setLimitDrawArea(RectF rectF) {
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

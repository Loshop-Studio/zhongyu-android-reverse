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
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.listener.RealDraw;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;

/* loaded from: classes3.dex */
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
                        AbstractC9133u.m16132f(lockCanvas, "lockCanvas");
                        try {
                            lockCanvas.drawColor(textureDrawView.backgroundId);
                            if (textureDrawView.paintTableArea == null || ((rectF = textureDrawView.paintTableArea) != null && rectF.isEmpty())) {
                                textureDrawView.paintTableArea = new RectF(0.0f, 0.0f, lockCanvas.getWidth(), lockCanvas.getHeight());
                            }
                            Graph graph = textureDrawView.graph;
                            if (graph != null) {
                                if (textureDrawView.limitDrawArea == null) {
                                    graph.onDraw(lockCanvas);
                                    C8736p c8736p = C8736p.f16368a;
                                } else if (textureDrawView.limitDrawArea != null) {
                                    textureDrawView.tempMatrix.reset();
                                    textureDrawView.tempMatrix.postConcat(graph.getMatrix());
                                    textureDrawView.tempMatrix.postConcat(graph.getControl().getCameraMatrix());
                                    if (textureDrawView.tempMatrix.mapRect(textureDrawView.rendRectF, textureDrawView.limitDrawArea) && textureDrawView.rendRectF.intersect(textureDrawView.paintTableArea)) {
                                        lockCanvas.drawRect(textureDrawView.rendRectF, textureDrawView.renderRectPaint);
                                        lockCanvas.clipRect(textureDrawView.rendRectF);
                                        graph.onDraw(lockCanvas);
                                    }
                                    C8736p c8736p2 = C8736p.f16368a;
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
        AbstractC9133u.m16133g(context, "context");
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

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    public void dispatchVisibilityChanged(View changedView, int i10) {
        AbstractC9133u.m16133g(changedView, "changedView");
        super.dispatchVisibilityChanged(changedView, i10);
        this.isVisibility = i10 == 0;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void drawGraph(Graph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        this.graph = graph;
    }

    public final void isRend(boolean z10) {
        this.isRend = z10;
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
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.mIsDrawing = true;
        this.isLocked = false;
        Surface surface = new Surface(surfaceTexture);
        this.mSurface = surface;
        try {
            Canvas canvasLockCanvas = surface.lockCanvas(new Rect(0, 0, i10, i11));
            if (canvasLockCanvas != null) {
                canvasLockCanvas.drawColor(-1);
            }
            Surface surface2 = this.mSurface;
            if (surface2 != null) {
                surface2.unlockCanvasAndPost(canvasLockCanvas);
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
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
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
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void setDrawBackground(int i10) {
        this.backgroundId = i10;
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

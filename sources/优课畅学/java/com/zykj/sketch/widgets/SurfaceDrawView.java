package com.zykj.sketch.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.listener.RealDraw;
import com.zykj.sketch.utils.LogUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;

@InterfaceC8721a
/* loaded from: classes3.dex */
public final class SurfaceDrawView extends SurfaceView implements SurfaceHolder.Callback, RealDraw {
    public Map<Integer, View> _$_findViewCache;
    private int backgroundId;
    private Rect drawRect;
    private ScheduledExecutorService execute;
    private Graph graph;
    private boolean isLocked;
    private RectF limitDrawArea;
    private boolean mIsDrawing;
    private RectF paintTableArea;
    private final PaintThread paintThread;

    public final class PaintThread extends Thread {
        public PaintThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            RectF rectF;
            Canvas lockCanvas;
            SurfaceHolder holder;
            RectF rectF2;
            RectF rectF3;
            super.run();
            if (!SurfaceDrawView.this.mIsDrawing || SurfaceDrawView.this.isLocked) {
                return;
            }
            SurfaceDrawView.this.isLocked = true;
            SurfaceHolder holder2 = SurfaceDrawView.this.getHolder();
            AbstractC9133u.m16132f(holder2, "holder");
            SurfaceDrawView surfaceDrawView = SurfaceDrawView.this;
            synchronized (holder2) {
                try {
                    if (surfaceDrawView.paintTableArea == null || ((rectF3 = surfaceDrawView.paintTableArea) != null && rectF3.isEmpty())) {
                        surfaceDrawView.paintTableArea = new RectF(0.0f, 0.0f, surfaceDrawView.getWidth(), surfaceDrawView.getHeight());
                    }
                    if (surfaceDrawView.limitDrawArea == null || ((rectF2 = surfaceDrawView.limitDrawArea) != null && rectF2.isEmpty())) {
                        surfaceDrawView.limitDrawArea = new RectF(0.0f, 0.0f, surfaceDrawView.getWidth(), surfaceDrawView.getHeight());
                    }
                    RectF rectF4 = surfaceDrawView.limitDrawArea;
                    if (rectF4 != null && (rectF = surfaceDrawView.paintTableArea) != null) {
                        if (rectF.intersect(rectF4)) {
                            rectF.roundOut(surfaceDrawView.drawRect);
                            if (!surfaceDrawView.drawRect.isEmpty() && (lockCanvas = surfaceDrawView.getHolder().lockCanvas(new Rect(0, 0, surfaceDrawView.getWidth(), surfaceDrawView.getHeight()))) != null) {
                                AbstractC9133u.m16132f(lockCanvas, "lockCanvas");
                                try {
                                    lockCanvas.drawColor(surfaceDrawView.backgroundId);
                                    lockCanvas.clipRect(surfaceDrawView.drawRect);
                                    Graph graph = surfaceDrawView.graph;
                                    if (graph != null) {
                                        graph.onDraw(lockCanvas);
                                        C8736p c8736p = C8736p.f16368a;
                                    }
                                    holder = surfaceDrawView.getHolder();
                                } catch (Throwable th) {
                                    try {
                                        th.printStackTrace();
                                        C8736p c8736p2 = C8736p.f16368a;
                                        holder = surfaceDrawView.getHolder();
                                    } catch (Throwable th2) {
                                        surfaceDrawView.getHolder().unlockCanvasAndPost(lockCanvas);
                                        throw th2;
                                    }
                                }
                                holder.unlockCanvasAndPost(lockCanvas);
                            }
                        }
                        C8736p c8736p3 = C8736p.f16368a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            SurfaceDrawView.this.isLocked = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceDrawView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.paintThread = new PaintThread();
        this.backgroundId = -1;
        this.drawRect = new Rect(0, 0, 0, 0);
        getHolder().addCallback(this);
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

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void drawGraph(Graph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        this.graph = graph;
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
        ScheduledExecutorService scheduledExecutorService = this.execute;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.execute = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mIsDrawing = true;
        this.isLocked = false;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.execute = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool != null) {
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(this.paintThread, 0L, 8L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mIsDrawing = false;
        this.isLocked = true;
        SurfaceHolder holder = getHolder();
        AbstractC9133u.m16132f(holder, "this.holder");
        synchronized (holder) {
            LogUtils.Companion.m9789d("surfaceDestroyed");
            C8736p c8736p = C8736p.f16368a;
        }
        ScheduledExecutorService scheduledExecutorService = this.execute;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.execute = null;
    }
}

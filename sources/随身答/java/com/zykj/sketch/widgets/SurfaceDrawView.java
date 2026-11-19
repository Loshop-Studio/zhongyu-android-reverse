package com.zykj.sketch.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.listener.RealDraw;
import com.zykj.sketch.utils.LogUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "不适用在动画上")
@Metadata(m13412d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J*\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016J\u0012\u0010&\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010'\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m13413d2 = {"Lcom/zykj/sketch/widgets/SurfaceDrawView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Lcom/zykj/sketch/core/listener/RealDraw;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundId", "", "drawRect", "Landroid/graphics/Rect;", "execute", "Ljava/util/concurrent/ScheduledExecutorService;", "graph", "Lcom/zykj/sketch/core/graph/Graph;", "isLocked", "", "limitDrawArea", "Landroid/graphics/RectF;", "mIsDrawing", "paintTableArea", "paintThread", "Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;", "drawGraph", "", "setDrawBackground", "colorId", "setLimitDrawArea", "rectF", "shutdown", "surfaceChanged", "holder", "Landroid/view/SurfaceHolder;", "format", "width", "height", "surfaceCreated", "surfaceDestroyed", "PaintThread", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
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

    @Metadata(m13412d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m13413d2 = {"Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;", "Ljava/lang/Thread;", "(Lcom/zykj/sketch/widgets/SurfaceDrawView;)V", "run", "", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
            Intrinsics.checkNotNullExpressionValue(holder2, "holder");
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
                                Intrinsics.checkNotNullExpressionValue(lockCanvas, "lockCanvas");
                                try {
                                    lockCanvas.drawColor(surfaceDrawView.backgroundId);
                                    lockCanvas.clipRect(surfaceDrawView.drawRect);
                                    Graph graph = surfaceDrawView.graph;
                                    if (graph != null) {
                                        graph.onDraw(lockCanvas);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    holder = surfaceDrawView.getHolder();
                                } catch (Throwable th) {
                                    try {
                                        th.printStackTrace();
                                        Unit unit2 = Unit.INSTANCE;
                                        holder = surfaceDrawView.getHolder();
                                    } catch (Throwable th2) {
                                        surfaceDrawView.getHolder().unlockCanvasAndPost(lockCanvas);
                                        throw th2;
                                    }
                                }
                                holder.unlockCanvasAndPost(lockCanvas);
                            }
                        }
                        Unit unit3 = Unit.INSTANCE;
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
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.paintThread = new PaintThread();
        this.backgroundId = -1;
        this.drawRect = new Rect(0, 0, 0, 0);
        getHolder().addCallback(this);
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

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void drawGraph(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.graph = graph;
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
        ScheduledExecutorService scheduledExecutorService = this.execute;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.execute = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        this.mIsDrawing = true;
        this.isLocked = false;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.execute = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool != null) {
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(this.paintThread, 0L, 8L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        this.mIsDrawing = false;
        this.isLocked = true;
        SurfaceHolder holder2 = getHolder();
        Intrinsics.checkNotNullExpressionValue(holder2, "this.holder");
        synchronized (holder2) {
            LogUtils.INSTANCE.m9908d("surfaceDestroyed");
            Unit unit = Unit.INSTANCE;
        }
        ScheduledExecutorService scheduledExecutorService = this.execute;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.execute = null;
    }
}

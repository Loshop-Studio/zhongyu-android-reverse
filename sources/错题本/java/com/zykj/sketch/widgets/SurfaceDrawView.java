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
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "不适用在动画上")
@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00016B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001c\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u00060*R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105¨\u00067"}, m5110d2 = {"Lcom/zykj/sketch/widgets/SurfaceDrawView;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Lcom/zykj/sketch/core/listener/RealDraw;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "colorId", "Ld6/s;", "setDrawBackground", "(I)V", "Lcom/zykj/sketch/core/graph/Graph;", "graph", "drawGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "Landroid/graphics/RectF;", "rectF", "setLimitDrawArea", "(Landroid/graphics/RectF;)V", "Landroid/view/SurfaceHolder;", "holder", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "(Landroid/view/SurfaceHolder;)V", "surfaceCreated", "shutdown", "()V", "", "mIsDrawing", "Z", "isLocked", "Ljava/util/concurrent/ScheduledExecutorService;", "execute", "Ljava/util/concurrent/ScheduledExecutorService;", "Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;", "paintThread", "Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;", "backgroundId", "I", "limitDrawArea", "Landroid/graphics/RectF;", "paintTableArea", "Landroid/graphics/Rect;", "drawRect", "Landroid/graphics/Rect;", "Lcom/zykj/sketch/core/graph/Graph;", "PaintThread", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SurfaceDrawView extends SurfaceView implements SurfaceHolder.Callback, RealDraw {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int backgroundId;

    @NotNull
    private Rect drawRect;

    @Nullable
    private ScheduledExecutorService execute;

    @Nullable
    private Graph graph;
    private boolean isLocked;

    @Nullable
    private RectF limitDrawArea;
    private boolean mIsDrawing;

    @Nullable
    private RectF paintTableArea;

    @NotNull
    private final PaintThread paintThread;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/sketch/widgets/SurfaceDrawView$PaintThread;", "Ljava/lang/Thread;", "<init>", "(Lcom/zykj/sketch/widgets/SurfaceDrawView;)V", "Ld6/s;", "run", "()V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class PaintThread extends Thread {
        public PaintThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            RectF rectF;
            Canvas canvasLockCanvas;
            SurfaceHolder holder;
            RectF rectF2;
            RectF rectF3;
            super.run();
            if (!SurfaceDrawView.this.mIsDrawing || SurfaceDrawView.this.isLocked) {
                return;
            }
            SurfaceDrawView.this.isLocked = true;
            SurfaceHolder holder2 = SurfaceDrawView.this.getHolder();
            AbstractC5830k.m5329f(holder2, "holder");
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
                    if (rectF4 != null && (rectF = surfaceDrawView.paintTableArea) != null && rectF.intersect(rectF4)) {
                        rectF.roundOut(surfaceDrawView.drawRect);
                        if (!surfaceDrawView.drawRect.isEmpty() && (canvasLockCanvas = surfaceDrawView.getHolder().lockCanvas(new Rect(0, 0, surfaceDrawView.getWidth(), surfaceDrawView.getHeight()))) != null) {
                            try {
                                canvasLockCanvas.drawColor(surfaceDrawView.backgroundId);
                                canvasLockCanvas.clipRect(surfaceDrawView.drawRect);
                                Graph graph = surfaceDrawView.graph;
                                if (graph != null) {
                                    graph.onDraw(canvasLockCanvas);
                                }
                                holder = surfaceDrawView.getHolder();
                            } catch (Throwable th) {
                                try {
                                    th.printStackTrace();
                                    holder = surfaceDrawView.getHolder();
                                } catch (Throwable th2) {
                                    surfaceDrawView.getHolder().unlockCanvasAndPost(canvasLockCanvas);
                                    throw th2;
                                }
                            }
                            holder.unlockCanvasAndPost(canvasLockCanvas);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            SurfaceDrawView.this.isLocked = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceDrawView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.paintThread = new PaintThread();
        this.backgroundId = -1;
        this.drawRect = new Rect(0, 0, 0, 0);
        getHolder().addCallback(this);
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

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void drawGraph(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        this.graph = graph;
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
        ScheduledExecutorService scheduledExecutorService = this.execute;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.execute = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@Nullable SurfaceHolder holder, int format, int width, int height) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@Nullable SurfaceHolder holder) {
        this.mIsDrawing = true;
        this.isLocked = false;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.execute = scheduledExecutorServiceNewScheduledThreadPool;
        if (scheduledExecutorServiceNewScheduledThreadPool != null) {
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(this.paintThread, 0L, 8L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@Nullable SurfaceHolder holder) {
        this.mIsDrawing = false;
        this.isLocked = true;
        SurfaceHolder holder2 = getHolder();
        AbstractC5830k.m5329f(holder2, "this.holder");
        synchronized (holder2) {
            LogUtils.INSTANCE.m4519d("surfaceDestroyed");
        }
        ScheduledExecutorService scheduledExecutorService = this.execute;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        this.execute = null;
    }
}

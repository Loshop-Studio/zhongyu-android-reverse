package com.zykj.sketch.core.graph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.protobuf.Any;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.PPTControl;
import com.zykj.sketch.extensions.ExtensionsKt;
import com.zykj.sketch.widgets.PPTWebView;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\u0010\u0011J,\u0010!\u001a\u00020\"2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u0010H\u0016J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m13558d2 = {"Lcom/zykj/sketch/core/graph/WebViewGraph;", "Lcom/zykj/sketch/core/graph/ViewGraph;", "viewGroup", "Landroid/view/ViewGroup;", "fileName", "", "actionControl", "Lcom/zykj/sketch/core/listener/IControl;", "width", "", "height", "viewWidth", "viewHeight", "callBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/listener/PPTControl;", "", "(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILkotlin/jvm/functions/Function1;)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "compressbitmap", "getCompressbitmap", "setCompressbitmap", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "isPost", "", "webView", "Lcom/zykj/sketch/widgets/PPTWebView;", "getSaleCenterMatrix", "Landroid/graphics/Matrix;", "getSnapshot", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "graphType", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "onDestroy", "onMeasure", "render", "canvas", "Landroid/graphics/Canvas;", "startRefresh", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class WebViewGraph extends ViewGraph {
    private final IControl actionControl;
    private Bitmap bitmap;
    private final Function1<PPTControl, Unit> callBack;
    private Bitmap compressbitmap;
    private ScheduledExecutorService executor;
    private final String fileName;
    private final int height;
    private boolean isPost;
    private final ViewGroup viewGroup;
    private final int viewHeight;
    private final int viewWidth;
    private PPTWebView webView;
    private final int width;

    public /* synthetic */ WebViewGraph(ViewGroup viewGroup, String str, IControl iControl, int i10, int i11, int i12, int i13, Function1 function1, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, str, iControl, (i14 & 8) != 0 ? 0 : i10, (i14 & 16) != 0 ? 0 : i11, i12, i13, (i14 & 128) != 0 ? new Function1<PPTControl, Unit>() { // from class: com.zykj.sketch.core.graph.WebViewGraph.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PPTControl it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PPTControl pPTControl) {
                invoke2(pPTControl);
                return Unit.INSTANCE;
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m24259_init_$lambda1(final WebViewGraph this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "viewGroup.context");
        PPTWebView pPTWebView = new PPTWebView(context, null, 0, 6, null);
        this$0.webView = pPTWebView;
        pPTWebView.setLayoutParams(new RelativeLayout.LayoutParams(720, 450));
        ViewGroup viewGroup = this$0.viewGroup;
        PPTWebView pPTWebView2 = this$0.webView;
        PPTWebView pPTWebView3 = null;
        if (pPTWebView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            pPTWebView2 = null;
        }
        viewGroup.addView(pPTWebView2, 0);
        PPTWebView pPTWebView4 = this$0.webView;
        if (pPTWebView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            pPTWebView3 = pPTWebView4;
        }
        pPTWebView3.post(new Runnable() { // from class: com.zykj.sketch.core.graph.c
            @Override // java.lang.Runnable
            public final void run() {
                WebViewGraph.m24260lambda1$lambda0(this.f10746a);
            }
        });
    }

    private final Matrix getSaleCenterMatrix(int width, int height, int viewWidth, int viewHeight) {
        float fMin = Math.min(height / viewHeight, width / viewWidth);
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin, viewWidth / 2, viewHeight / 2);
        matrix.postTranslate(r6 - (width / 2), r7 - (height / 2));
        return matrix;
    }

    public static /* synthetic */ Matrix getSaleCenterMatrix$default(WebViewGraph webViewGraph, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        return webViewGraph.getSaleCenterMatrix(i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda-1$lambda-0, reason: not valid java name */
    public static final void m24260lambda1$lambda0(WebViewGraph this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PPTWebView pPTWebView = this$0.webView;
        PPTWebView pPTWebView2 = null;
        if (pPTWebView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            pPTWebView = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this$0.getControl().getSketchConfig().getSourcePath());
        String str = File.separator;
        sb.append(str);
        sb.append("res");
        sb.append(str);
        sb.append("ppt");
        sb.append(str);
        sb.append(this$0.fileName);
        pPTWebView.loadSlider(sb.toString());
        this$0.startRefresh();
        Function1<PPTControl, Unit> function1 = this$0.callBack;
        PPTWebView pPTWebView3 = this$0.webView;
        if (pPTWebView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        } else {
            pPTWebView2 = pPTWebView3;
        }
        function1.invoke(pPTWebView2);
    }

    private final void startRefresh() {
        if (this.executor == null) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            this.executor = scheduledExecutorServiceNewScheduledThreadPool;
            if (scheduledExecutorServiceNewScheduledThreadPool != null) {
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.zykj.sketch.core.graph.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebViewGraph.m24261startRefresh$lambda6(this.f10745a);
                    }
                }, 0L, 10L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startRefresh$lambda-6, reason: not valid java name */
    public static final void m24261startRefresh$lambda6(WebViewGraph this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.actionControl.getIsTouch() || this$0.isPost) {
                return;
            }
            this$0.isPost = true;
            PPTWebView pPTWebView = this$0.webView;
            if (pPTWebView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                pPTWebView = null;
            }
            Bitmap bitmapCapture = ExtensionsKt.capture(pPTWebView);
            if (bitmapCapture != null) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCapture, this$0.width, this$0.height, false);
                this$0.bitmap = bitmapCreateScaledBitmap;
                if (bitmapCreateScaledBitmap != null) {
                    this$0.compressbitmap = this$0.compressImage(bitmapCreateScaledBitmap);
                }
                bitmapCapture.recycle();
            }
            this$0.isPost = false;
            this$0.actionControl.render();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Bitmap getCompressbitmap() {
        return this.compressbitmap;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
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
        Intrinsics.checkNotNullExpressionValue(graphDataBuild, "builder.build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.WEB_VIEW_GRAPH;
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void onDestroy() {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onDestroy();
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        ViewGroup viewGroup = this.viewGroup;
        PPTWebView pPTWebView = this.webView;
        if (pPTWebView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            pPTWebView = null;
        }
        viewGroup.removeView(pPTWebView);
        Bitmap bitmap3 = this.bitmap;
        if (bitmap3 != null && !bitmap3.isRecycled() && (bitmap2 = this.bitmap) != null) {
            bitmap2.recycle();
        }
        Bitmap bitmap4 = this.compressbitmap;
        if (bitmap4 == null || bitmap4.isRecycled() || (bitmap = this.compressbitmap) == null) {
            return;
        }
        bitmap.recycle();
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public void onMeasure() {
        getMOutRect().set(GraphExtKt.mapPoint(this, 0.0f, 0.0f, GraphExtKt.getWP2FPMatrix(this)).x, GraphExtKt.mapPoint(this, this.width, 0.0f, GraphExtKt.getWP2FPMatrix(this)).y, GraphExtKt.mapPoint(this, this.width, this.height, GraphExtKt.getWP2FPMatrix(this)).x, GraphExtKt.mapPoint(this, 0.0f, this.height, GraphExtKt.getWP2FPMatrix(this)).y);
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IDraw
    public void render(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            if (!this.actionControl.getIsTouch()) {
                canvas.drawBitmap(bitmap, GraphExtKt.getFP2WPRendMatrix(this), getMPaint());
                return;
            }
            Bitmap bitmap2 = this.compressbitmap;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, GraphExtKt.getFP2WPRendMatrix(this), getMPaint());
            }
        }
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setCompressbitmap(Bitmap bitmap) {
        this.compressbitmap = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewGraph(ViewGroup viewGroup, String fileName, IControl actionControl, int i10, int i11, int i12, int i13, Function1<? super PPTControl, Unit> callBack) {
        super(actionControl);
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(actionControl, "actionControl");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.viewGroup = viewGroup;
        this.fileName = fileName;
        this.actionControl = actionControl;
        this.width = i10;
        this.height = i11;
        this.viewWidth = i12;
        this.viewHeight = i13;
        this.callBack = callBack;
        setMatrix(getSaleCenterMatrix(i10, i11, i12, i13));
        onMeasure();
        viewGroup.post(new Runnable() { // from class: com.zykj.sketch.core.graph.a
            @Override // java.lang.Runnable
            public final void run() {
                WebViewGraph.m24259_init_$lambda1(this.f10744a);
            }
        });
    }
}

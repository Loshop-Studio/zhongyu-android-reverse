package com.zykj.sketch.core.graph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.protobuf.Any;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.PPTControl;
import com.zykj.sketch.extensions.ExtensionsKt;
import com.zykj.sketch.widgets.PPTWebView;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class WebViewGraph extends ViewGraph {
    private final IControl actionControl;
    private Bitmap bitmap;
    private final InterfaceC10570l callBack;
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

    public /* synthetic */ WebViewGraph(ViewGroup viewGroup, String str, IControl iControl, int i10, int i11, int i12, int i13, InterfaceC10570l interfaceC10570l, int i14, AbstractC9126n abstractC9126n) {
        this(viewGroup, str, iControl, (i14 & 8) != 0 ? 0 : i10, (i14 & 16) != 0 ? 0 : i11, i12, i13, (i14 & 128) != 0 ? new InterfaceC10570l() { // from class: com.zykj.sketch.core.graph.WebViewGraph.1
            public final void invoke(PPTControl it) {
                AbstractC9133u.m16133g(it, "it");
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PPTControl) obj);
                return C8736p.f16368a;
            }
        } : interfaceC10570l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m27511_init_$lambda1(final WebViewGraph this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        Context context = this$0.viewGroup.getContext();
        AbstractC9133u.m16132f(context, "viewGroup.context");
        PPTWebView pPTWebView = new PPTWebView(context, null, 0, 6, null);
        this$0.webView = pPTWebView;
        pPTWebView.setLayoutParams(new RelativeLayout.LayoutParams(720, 450));
        ViewGroup viewGroup = this$0.viewGroup;
        PPTWebView pPTWebView2 = this$0.webView;
        PPTWebView pPTWebView3 = null;
        if (pPTWebView2 == null) {
            AbstractC9133u.m16151y("webView");
            pPTWebView2 = null;
        }
        viewGroup.addView(pPTWebView2, 0);
        PPTWebView pPTWebView4 = this$0.webView;
        if (pPTWebView4 == null) {
            AbstractC9133u.m16151y("webView");
        } else {
            pPTWebView3 = pPTWebView4;
        }
        pPTWebView3.post(new Runnable() { // from class: com.zykj.sketch.core.graph.c
            @Override // java.lang.Runnable
            public final void run() {
                WebViewGraph.m27512lambda1$lambda0(this.f10619a);
            }
        });
    }

    private final Matrix getSaleCenterMatrix(int i10, int i11, int i12, int i13) {
        float fMin = Math.min(i11 / i13, i10 / i12);
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin, i12 / 2, i13 / 2);
        matrix.postTranslate(r6 - (i10 / 2), r7 - (i11 / 2));
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
    public static final void m27512lambda1$lambda0(WebViewGraph this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        PPTWebView pPTWebView = this$0.webView;
        PPTWebView pPTWebView2 = null;
        if (pPTWebView == null) {
            AbstractC9133u.m16151y("webView");
            pPTWebView = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this$0.getControl().getSketchConfig().getSourcePath());
        String str = File.separator;
        sb.append(str);
        sb.append(SourceRouterRecord.SOURCE_RES_IMAGE);
        sb.append(str);
        sb.append("ppt");
        sb.append(str);
        sb.append(this$0.fileName);
        pPTWebView.loadSlider(sb.toString());
        this$0.startRefresh();
        InterfaceC10570l interfaceC10570l = this$0.callBack;
        PPTWebView pPTWebView3 = this$0.webView;
        if (pPTWebView3 == null) {
            AbstractC9133u.m16151y("webView");
        } else {
            pPTWebView2 = pPTWebView3;
        }
        interfaceC10570l.invoke(pPTWebView2);
    }

    private final void startRefresh() {
        if (this.executor == null) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            this.executor = scheduledExecutorServiceNewScheduledThreadPool;
            if (scheduledExecutorServiceNewScheduledThreadPool != null) {
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.zykj.sketch.core.graph.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebViewGraph.m27513startRefresh$lambda6(this.f10618a);
                    }
                }, 0L, 10L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startRefresh$lambda-6, reason: not valid java name */
    public static final void m27513startRefresh$lambda6(WebViewGraph this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        try {
            if (this$0.actionControl.isTouch() || this$0.isPost) {
                return;
            }
            this$0.isPost = true;
            PPTWebView pPTWebView = this$0.webView;
            if (pPTWebView == null) {
                AbstractC9133u.m16151y("webView");
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
        AbstractC9133u.m16132f(graphDataBuild, "builder.build()");
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
            AbstractC9133u.m16151y("webView");
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
        AbstractC9133u.m16133g(canvas, "canvas");
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            if (!this.actionControl.isTouch()) {
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
    public WebViewGraph(ViewGroup viewGroup, String fileName, IControl actionControl, int i10, int i11, int i12, int i13, InterfaceC10570l callBack) {
        super(actionControl);
        AbstractC9133u.m16133g(viewGroup, "viewGroup");
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(actionControl, "actionControl");
        AbstractC9133u.m16133g(callBack, "callBack");
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
                WebViewGraph.m27511_init_$lambda1(this.f10617a);
            }
        });
    }
}

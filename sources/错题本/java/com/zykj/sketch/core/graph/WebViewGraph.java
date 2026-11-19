package com.zykj.sketch.core.graph;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/WebViewGraph;", "Lcom/zykj/sketch/core/graph/ViewGraph;", "Landroid/view/ViewGroup;", "viewGroup", "", "fileName", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "", "width", "height", "viewWidth", "viewHeight", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/listener/PPTControl;", "Ld6/s;", "callBack", "<init>", "(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILr6/c;)V", "startRefresh", "()V", "Landroid/graphics/Matrix;", "getSaleCenterMatrix", "(IIII)Landroid/graphics/Matrix;", "Landroid/graphics/Canvas;", "canvas", "render", "(Landroid/graphics/Canvas;)V", "onMeasure", "onDestroy", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "getSnapshot", "()Lcom/zykj/sketch/GraphSnapshot$GraphData;", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "graphType", "()Lcom/zykj/sketch/GraphSnapshot$GraphType;", "Landroid/view/ViewGroup;", "Ljava/lang/String;", "Lcom/zykj/sketch/core/listener/IControl;", "I", "Lr6/c;", "Lcom/zykj/sketch/widgets/PPTWebView;", "webView", "Lcom/zykj/sketch/widgets/PPTWebView;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "compressbitmap", "getCompressbitmap", "setCompressbitmap", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "", "isPost", "Z", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class WebViewGraph extends ViewGraph {

    @NotNull
    private final IControl actionControl;

    @Nullable
    private Bitmap bitmap;

    @NotNull
    private final InterfaceC6471c callBack;

    @Nullable
    private Bitmap compressbitmap;

    @Nullable
    private ScheduledExecutorService executor;

    @NotNull
    private final String fileName;
    private final int height;
    private boolean isPost;

    @NotNull
    private final ViewGroup viewGroup;
    private final int viewHeight;
    private final int viewWidth;
    private PPTWebView webView;
    private final int width;

    public /* synthetic */ WebViewGraph(ViewGroup viewGroup, String str, IControl iControl, int i, int i8, int i9, int i10, InterfaceC6471c interfaceC6471c, int i11, AbstractC5824e abstractC5824e) {
        this(viewGroup, str, iControl, (i11 & 8) != 0 ? 0 : i, (i11 & 16) != 0 ? 0 : i8, i9, i10, (i11 & 128) != 0 ? new InterfaceC6471c() { // from class: com.zykj.sketch.core.graph.WebViewGraph.1
            public final void invoke(@NotNull PPTControl it) {
                AbstractC5830k.m5330g(it, "it");
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PPTControl) obj);
                return C5443s.f8405a;
            }
        } : interfaceC6471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m13852_init_$lambda1(WebViewGraph this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        Context context = this$0.viewGroup.getContext();
        AbstractC5830k.m5329f(context, "viewGroup.context");
        PPTWebView pPTWebView = new PPTWebView(context, null, 0, 6, null);
        this$0.webView = pPTWebView;
        pPTWebView.setLayoutParams(new RelativeLayout.LayoutParams(720, 450));
        ViewGroup viewGroup = this$0.viewGroup;
        PPTWebView pPTWebView2 = this$0.webView;
        if (pPTWebView2 == null) {
            AbstractC5830k.m5339p("webView");
            throw null;
        }
        viewGroup.addView(pPTWebView2, 0);
        PPTWebView pPTWebView3 = this$0.webView;
        if (pPTWebView3 != null) {
            pPTWebView3.post(new RunnableC5187a(this$0, 2));
        } else {
            AbstractC5830k.m5339p("webView");
            throw null;
        }
    }

    // DEX uses float division for the ratios and integer halves for pivots. For
    // 480x300 in 640x480 the original graph gives scale .625 and offset (200,180).
    private final Matrix getSaleCenterMatrix(int width, int height, int viewWidth, int viewHeight) {
        float fMin = Math.min(height / viewHeight, width / viewWidth);
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin, viewWidth / 2, viewHeight / 2);
        matrix.postTranslate(r6 - (width / 2), r7 - (height / 2));
        return matrix;
    }

    public static /* synthetic */ Matrix getSaleCenterMatrix$default(WebViewGraph webViewGraph, int i, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = 0;
        }
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        return webViewGraph.getSaleCenterMatrix(i, i8, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda-1$lambda-0, reason: not valid java name */
    public static final void m13853lambda1$lambda0(WebViewGraph this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        PPTWebView pPTWebView = this$0.webView;
        if (pPTWebView == null) {
            AbstractC5830k.m5339p("webView");
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this$0.getControl().getSketchConfig().getSourcePath());
        String str = File.separator;
        AbstractC1923c.m1060x(sb, str, SourceRouterRecord.SOURCE_RES_IMAGE, str, "ppt");
        sb.append(str);
        sb.append(this$0.fileName);
        pPTWebView.loadSlider(sb.toString());
        this$0.startRefresh();
        InterfaceC6471c interfaceC6471c = this$0.callBack;
        PPTWebView pPTWebView2 = this$0.webView;
        if (pPTWebView2 != null) {
            interfaceC6471c.invoke(pPTWebView2);
        } else {
            AbstractC5830k.m5339p("webView");
            throw null;
        }
    }

    private final void startRefresh() {
        if (this.executor == null) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            this.executor = scheduledExecutorServiceNewScheduledThreadPool;
            if (scheduledExecutorServiceNewScheduledThreadPool != null) {
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new RunnableC5187a(this, 1), 0L, 10L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startRefresh$lambda-6, reason: not valid java name */
    public static final void m13854startRefresh$lambda6(WebViewGraph this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        try {
            if (this$0.actionControl.getIsTouch() || this$0.isPost) {
                return;
            }
            this$0.isPost = true;
            PPTWebView pPTWebView = this$0.webView;
            if (pPTWebView == null) {
                AbstractC5830k.m5339p("webView");
                throw null;
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final Bitmap getCompressbitmap() {
        return this.compressbitmap;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
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
        AbstractC5830k.m5329f(graphDataBuild, "builder.build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
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
            AbstractC5830k.m5339p("webView");
            throw null;
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
    public void render(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
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

    public final void setBitmap(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setCompressbitmap(@Nullable Bitmap bitmap) {
        this.compressbitmap = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewGraph(@NotNull ViewGroup viewGroup, @NotNull String fileName, @NotNull IControl actionControl, int i, int i8, int i9, int i10, @NotNull InterfaceC6471c callBack) {
        super(actionControl);
        AbstractC5830k.m5330g(viewGroup, "viewGroup");
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(actionControl, "actionControl");
        AbstractC5830k.m5330g(callBack, "callBack");
        this.viewGroup = viewGroup;
        this.fileName = fileName;
        this.actionControl = actionControl;
        this.width = i;
        this.height = i8;
        this.viewWidth = i9;
        this.viewHeight = i10;
        this.callBack = callBack;
        setMatrix(getSaleCenterMatrix(i, i8, i9, i10));
        onMeasure();
        viewGroup.post(new RunnableC5187a(this, 0));
    }
}

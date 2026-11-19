.class public final Lcom/zykj/sketch/core/graph/WebViewGraph;
.super Lcom/zykj/sketch/core/graph/ViewGraph;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J3\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010&R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\'R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\'R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\'R\u0014\u0010\u000c\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\'R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00083\u0010.\u001a\u0004\u00084\u00100\"\u0004\u00085\u00102R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u0010;\u00a8\u0006<"
    }
    d2 = {
        "Lcom/zykj/sketch/core/graph/WebViewGraph;",
        "Lcom/zykj/sketch/core/graph/ViewGraph;",
        "Landroid/view/ViewGroup;",
        "viewGroup",
        "",
        "fileName",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "actionControl",
        "",
        "width",
        "height",
        "viewWidth",
        "viewHeight",
        "Lkotlin/Function1;",
        "Lcom/zykj/sketch/core/listener/PPTControl;",
        "Ld6/s;",
        "callBack",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILr6/c;)V",
        "startRefresh",
        "()V",
        "Landroid/graphics/Matrix;",
        "getSaleCenterMatrix",
        "(IIII)Landroid/graphics/Matrix;",
        "Landroid/graphics/Canvas;",
        "canvas",
        "render",
        "(Landroid/graphics/Canvas;)V",
        "onMeasure",
        "onDestroy",
        "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "getSnapshot",
        "()Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "Lcom/zykj/sketch/GraphSnapshot$GraphType;",
        "graphType",
        "()Lcom/zykj/sketch/GraphSnapshot$GraphType;",
        "Landroid/view/ViewGroup;",
        "Ljava/lang/String;",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "I",
        "Lr6/c;",
        "Lcom/zykj/sketch/widgets/PPTWebView;",
        "webView",
        "Lcom/zykj/sketch/widgets/PPTWebView;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "setBitmap",
        "(Landroid/graphics/Bitmap;)V",
        "compressbitmap",
        "getCompressbitmap",
        "setCompressbitmap",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "executor",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "",
        "isPost",
        "Z",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final actionControl:Lcom/zykj/sketch/core/listener/IControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private bitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final callBack:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private compressbitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private executor:Ljava/util/concurrent/ScheduledExecutorService;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final fileName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final height:I

.field private isPost:Z

.field private final viewGroup:Landroid/view/ViewGroup;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final viewHeight:I

.field private final viewWidth:I

.field private webView:Lcom/zykj/sketch/widgets/PPTWebView;

.field private final width:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILr6/c;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/sketch/core/listener/IControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Lcom/zykj/sketch/core/listener/IControl;",
            "IIII",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    const-string v0, "viewGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionControl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callBack"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p3}, Lcom/zykj/sketch/core/graph/ViewGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 4
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->viewGroup:Landroid/view/ViewGroup;

    .line 5
    iput-object p2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->fileName:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    iput p4, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->width:I

    .line 8
    iput p5, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->height:I

    .line 9
    iput p6, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->viewWidth:I

    .line 10
    iput p7, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->viewHeight:I

    .line 11
    iput-object p8, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->callBack:Lr6/c;

    .line 12
    invoke-direct {p0, p4, p5, p6, p7}, Lcom/zykj/sketch/core/graph/WebViewGraph;->getSaleCenterMatrix(IIII)Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 13
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->onMeasure()V

    .line 14
    new-instance p2, Lcom/zykj/sketch/core/graph/a;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/zykj/sketch/core/graph/a;-><init>(Lcom/zykj/sketch/core/graph/WebViewGraph;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILr6/c;ILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p10, p9, 0x8

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move p4, v0

    :cond_0
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_1

    move p5, v0

    :cond_1
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_2

    .line 1
    sget-object p8, Lcom/zykj/sketch/core/graph/WebViewGraph$1;->INSTANCE:Lcom/zykj/sketch/core/graph/WebViewGraph$1;

    :cond_2
    move-object p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 2
    invoke-direct/range {p1 .. p9}, Lcom/zykj/sketch/core/graph/WebViewGraph;-><init>(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILr6/c;)V

    return-void
.end method

.method private static final _init_$lambda-1(Lcom/zykj/sketch/core/graph/WebViewGraph;)V
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/sketch/widgets/PPTWebView;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->viewGroup:Landroid/view/ViewGroup;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v0, "viewGroup.context"

    .line 15
    .line 16
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x6

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-direct/range {v1 .. v6}, Lcom/zykj/sketch/widgets/PPTWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->webView:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 27
    .line 28
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 29
    .line 30
    const/16 v2, 0x2d0

    .line 31
    .line 32
    const/16 v3, 0x1c2

    .line 33
    .line 34
    invoke-direct {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->viewGroup:Landroid/view/ViewGroup;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->webView:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const-string v3, "webView"

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-virtual {v0, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->webView:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    new-instance v1, Lcom/zykj/sketch/core/graph/a;

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    invoke-direct {v1, p0, v2}, Lcom/zykj/sketch/core/graph/a;-><init>(Lcom/zykj/sketch/core/graph/WebViewGraph;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v2

    .line 71
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v2
.end method

.method public static synthetic a(Lcom/zykj/sketch/core/graph/WebViewGraph;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->_init_$lambda-1(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/sketch/core/graph/WebViewGraph;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->startRefresh$lambda-6(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/sketch/core/graph/WebViewGraph;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->lambda-1$lambda-0(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    return-void
.end method

.method private final getSaleCenterMatrix(IIII)Landroid/graphics/Matrix;
    .locals 3

    .line 1
    int-to-float v0, p1

    .line 2
    int-to-float v1, p3

    .line 3
    div-float/2addr v0, v1

    .line 4
    int-to-float v1, p2

    .line 5
    int-to-float v2, p4

    .line 6
    div-float/2addr v1, v2

    .line 7
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    div-int/lit8 p3, p3, 0x2

    .line 12
    .line 13
    div-int/lit8 p4, p4, 0x2

    .line 14
    .line 15
    div-int/lit8 p1, p1, 0x2

    .line 16
    .line 17
    sub-int p1, p3, p1

    .line 18
    .line 19
    div-int/lit8 p2, p2, 0x2

    .line 20
    .line 21
    sub-int p2, p4, p2

    .line 22
    .line 23
    new-instance v1, Landroid/graphics/Matrix;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 26
    .line 27
    .line 28
    int-to-float p3, p3

    .line 29
    int-to-float p4, p4

    .line 30
    invoke-virtual {v1, v0, v0, p3, p4}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 31
    .line 32
    .line 33
    int-to-float p1, p1

    .line 34
    int-to-float p2, p2

    .line 35
    invoke-virtual {v1, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 36
    .line 37
    .line 38
    return-object v1
.end method

.method public static synthetic getSaleCenterMatrix$default(Lcom/zykj/sketch/core/graph/WebViewGraph;IIIIILjava/lang/Object;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p2, v0

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/sketch/core/graph/WebViewGraph;->getSaleCenterMatrix(IIII)Landroid/graphics/Matrix;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static final lambda-1$lambda-0(Lcom/zykj/sketch/core/graph/WebViewGraph;)V
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->webView:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const-string v2, "webView"

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-interface {v4}, Lcom/zykj/sketch/core/listener/IControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 34
    .line 35
    const-string v5, "res"

    .line 36
    .line 37
    const-string v6, "ppt"

    .line 38
    .line 39
    invoke-static {v3, v4, v5, v4, v6}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v4, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->fileName:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v0, v3}, Lcom/zykj/sketch/widgets/PPTWebView;->loadSlider(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->startRefresh()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->callBack:Lr6/c;

    .line 61
    .line 62
    iget-object p0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->webView:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 63
    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    invoke-interface {v0, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v1
.end method

.method private final startRefresh()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v2, Lcom/zykj/sketch/core/graph/a;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {v2, p0, v0}, Lcom/zykj/sketch/core/graph/a;-><init>(Lcom/zykj/sketch/core/graph/WebViewGraph;I)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v5, 0xa

    .line 21
    .line 22
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method private static final startRefresh$lambda-6(Lcom/zykj/sketch/core/graph/WebViewGraph;)V
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/IControl;->isTouch()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->isPost:Z

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->isPost:Z

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->webView:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-static {v0}, Lcom/zykj/sketch/extensions/ExtensionsKt;->capture(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->width:I

    .line 33
    .line 34
    iget v3, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->height:I

    .line 35
    .line 36
    invoke-static {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lcom/zykj/sketch/core/graph/ViewGraph;->compressImage(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 49
    .line 50
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 51
    .line 52
    .line 53
    :cond_1
    iput-boolean v1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->isPost:Z

    .line 54
    .line 55
    iget-object p0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 56
    .line 57
    invoke-interface {p0}, Lcom/zykj/sketch/core/listener/IControl;->render()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    const-string p0, "webView"

    .line 62
    .line 63
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :cond_3
    return-void

    .line 69
    :catch_0
    move-exception p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCompressbitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getSnapshotBuild()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$File;->newBuilder()Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->fileName:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setFileName(Ljava/lang/String;)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 12
    .line 13
    .line 14
    iget v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->width:I

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setWidth(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 17
    .line 18
    .line 19
    iget v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->height:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setHeight(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 22
    .line 23
    .line 24
    iget v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->viewWidth:I

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setViewWidth(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 27
    .line 28
    .line 29
    iget v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->viewHeight:I

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->setViewHeight(I)Lcom/zykj/sketch/GraphSnapshot$File$Builder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$File$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$File;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setExtra(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v1, "builder.build()"

    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public graphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphType;->WEB_VIEW_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 2
    .line 3
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/graph/Graph;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->executor:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->viewGroup:Landroid/view/ViewGroup;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->webView:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void

    .line 55
    :cond_3
    const-string v0, "webView"

    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    throw v0
.end method

.method public onMeasure()V
    .locals 6

    .line 1
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p0, v1, v1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->width:I

    .line 11
    .line 12
    int-to-float v2, v2

    .line 13
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {p0, v2, v1, v3}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v3, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->width:I

    .line 22
    .line 23
    int-to-float v3, v3

    .line 24
    iget v4, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->height:I

    .line 25
    .line 26
    int-to-float v4, v4

    .line 27
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-static {p0, v3, v4, v5}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->height:I

    .line 36
    .line 37
    int-to-float v4, v4

    .line 38
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getWP2FPMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-static {p0, v1, v4, v5}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Lcom/zykj/sketch/core/graph/Graph;FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMOutRect()Landroid/graphics/RectF;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 51
    .line 52
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 55
    .line 56
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 57
    .line 58
    invoke-virtual {v4, v0, v2, v3, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public render(Landroid/graphics/Canvas;)V
    .locals 3
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 11
    .line 12
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/IControl;->isTouch()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPRendMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-static {p0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->getFP2WPRendMatrix(Lcom/zykj/sketch/core/graph/Graph;)Landroid/graphics/Matrix;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getMPaint()Landroid/graphics/Paint;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public final setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

.method public final setCompressbitmap(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

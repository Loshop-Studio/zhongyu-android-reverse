.class public final Lcom/zykj/sketch/core/graph/WebViewGraph;
.super Lcom/zykj/sketch/core/graph/ViewGraph;
.source "SourceFile"


# instance fields
.field private final actionControl:Lcom/zykj/sketch/core/listener/IControl;

.field private bitmap:Landroid/graphics/Bitmap;

.field private final callBack:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private compressbitmap:Landroid/graphics/Bitmap;

.field private executor:Ljava/util/concurrent/ScheduledExecutorService;

.field private final fileName:Ljava/lang/String;

.field private final height:I

.field private isPost:Z

.field private final viewGroup:Landroid/view/ViewGroup;

.field private final viewHeight:I

.field private final viewWidth:I

.field private webView:Lcom/zykj/sketch/widgets/PPTWebView;

.field private final width:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/lang/String;",
            "Lcom/zykj/sketch/core/listener/IControl;",
            "IIII",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    const-string v0, "viewGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionControl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callBack"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    iput-object p8, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->callBack:Lhd/l;

    .line 12
    invoke-direct {p0, p4, p5, p6, p7}, Lcom/zykj/sketch/core/graph/WebViewGraph;->getSaleCenterMatrix(IIII)Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/zykj/sketch/core/graph/Graph;->setMatrix(Landroid/graphics/Matrix;)V

    .line 13
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->onMeasure()V

    .line 14
    new-instance p2, Lcom/zykj/sketch/core/graph/a;

    invoke-direct {p2, p0}, Lcom/zykj/sketch/core/graph/a;-><init>(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILhd/l;ILkotlin/jvm/internal/n;)V
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
    invoke-direct/range {p1 .. p9}, Lcom/zykj/sketch/core/graph/WebViewGraph;-><init>(Landroid/view/ViewGroup;Ljava/lang/String;Lcom/zykj/sketch/core/listener/IControl;IIIILhd/l;)V

    return-void
.end method

.method private static final _init_$lambda-1(Lcom/zykj/sketch/core/graph/WebViewGraph;)V
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct/range {v1 .. v6}, Lcom/zykj/sketch/widgets/PPTWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

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
    if-nez v1, :cond_0

    .line 48
    .line 49
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v1, v2

    .line 53
    :cond_0
    const/4 v4, 0x0

    .line 54
    invoke-virtual {v0, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->webView:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-object v2, v0

    .line 66
    :goto_0
    new-instance v0, Lcom/zykj/sketch/core/graph/c;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lcom/zykj/sketch/core/graph/c;-><init>(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    return-void
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
    .locals 6

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v1

    .line 17
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getControl()Lcom/zykj/sketch/core/listener/IControl;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-interface {v4}, Lcom/zykj/sketch/core/listener/IControl;->getSketchConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Lcom/zykj/sketch/core/config/SketchConfig;->getSourcePath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v5, "res"

    .line 43
    .line 44
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v5, "ppt"

    .line 51
    .line 52
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->fileName:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v0, v3}, Lcom/zykj/sketch/widgets/PPTWebView;->loadSlider(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Lcom/zykj/sketch/core/graph/WebViewGraph;->startRefresh()V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->callBack:Lhd/l;

    .line 74
    .line 75
    iget-object p0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->webView:Lcom/zykj/sketch/widgets/PPTWebView;

    .line 76
    .line 77
    if-nez p0, :cond_1

    .line 78
    .line 79
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    move-object v1, p0

    .line 84
    :goto_0
    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    return-void
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
    new-instance v2, Lcom/zykj/sketch/core/graph/b;

    .line 15
    .line 16
    invoke-direct {v2, p0}, Lcom/zykj/sketch/core/graph/b;-><init>(Lcom/zykj/sketch/core/graph/WebViewGraph;)V

    .line 17
    .line 18
    .line 19
    const-wide/16 v5, 0xa

    .line 20
    .line 21
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method private static final startRefresh$lambda-6(Lcom/zykj/sketch/core/graph/WebViewGraph;)V
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "webView"

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    :cond_0
    invoke-static {v0}, Lcom/zykj/sketch/extensions/ExtensionsKt;->capture(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v1, 0x0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->width:I

    .line 39
    .line 40
    iget v3, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->height:I

    .line 41
    .line 42
    invoke-static {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iput-object v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lcom/zykj/sketch/core/graph/ViewGraph;->compressImage(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iput-object v2, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 55
    .line 56
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 57
    .line 58
    .line 59
    :cond_2
    iput-boolean v1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->isPost:Z

    .line 60
    .line 61
    iget-object p0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->actionControl:Lcom/zykj/sketch/core/listener/IControl;

    .line 62
    .line 63
    invoke-interface {p0}, Lcom/zykj/sketch/core/listener/IControl;->render()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    :cond_3
    return-void

    .line 67
    :catch_0
    move-exception p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 69
    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCompressbitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 3

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public graphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
    .locals 1

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
    if-nez v1, :cond_1

    .line 16
    .line 17
    const-string v1, "webView"

    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 58
    .line 59
    .line 60
    :cond_3
    return-void
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

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

.method public final setCompressbitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/graph/WebViewGraph;->compressbitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-void
.end method

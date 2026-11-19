.class public final Lcom/zykj/blackboard/core/play/PlayControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/play/IPlayControl;


# instance fields
.field private currentPageIndex:I

.field private final pageList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
            ">;"
        }
    .end annotation
.end field

.field private pageListener:Lcom/zykj/blackboard/listener/PageListener;

.field private final renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

.field private rootPath:Ljava/lang/String;

.field private final singleExecutor$delegate:Lh7/d;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
    .locals 1

    .line 1
    const-string v0, "renderLayer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    iput p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->currentPageIndex:I

    .line 20
    .line 21
    const-string p1, ""

    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->rootPath:Ljava/lang/String;

    .line 24
    .line 25
    sget-object p1, Lcom/zykj/blackboard/core/play/PlayControl$singleExecutor$2;->INSTANCE:Lcom/zykj/blackboard/core/play/PlayControl$singleExecutor$2;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->singleExecutor$delegate:Lh7/d;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic a(Lx7/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->loadPath$lambda-4$lambda-1$lambda-0(Lx7/l;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lx7/l;Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/play/PlayControl;->loadPath$lambda-4(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lx7/l;Lx7/l;)V

    return-void
.end method

.method public static synthetic c(Lx7/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->loadPath$lambda-4$lambda-3(Lx7/l;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lx7/l;Lcom/zykj/blackboard/core/play/PlayControl;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->loadPath$lambda-4$lambda-2(Lx7/l;Lcom/zykj/blackboard/core/play/PlayControl;)V

    return-void
.end method

.method private final getSingleExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->singleExecutor$delegate:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final loadPath$lambda-4(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lx7/l;Lx7/l;)V
    .locals 3

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$failCallBack"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$successCallBack"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "PlayControl:loadPath \u52a0\u8f7d\u64ad\u653e\u5fae\u8bfe"

    .line 22
    .line 23
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->rootPath:Ljava/lang/String;

    .line 31
    .line 32
    sget-object v0, Lcom/zykj/blackboard/core/data/SourceLoad;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceLoad;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/SourceLoad;->getPageRouter(Ljava/lang/String;)Lcom/zykj/board/EzyPageRouter$PageRouter;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageRouter$PageRouter;->g()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "SourceLoad.getPageRouter(path).pageInfoList"

    .line 43
    .line 44
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;

    .line 62
    .line 63
    new-instance v1, Lcom/zykj/blackboard/core/play/PlayPageControl;

    .line 64
    .line 65
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/PlayControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 66
    .line 67
    invoke-direct {v1, p0, v2}, Lcom/zykj/blackboard/core/play/PlayPageControl;-><init>(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    :try_start_1
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string v2, "info.name"

    .line 75
    .line 76
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1, v0}, Lcom/zykj/blackboard/core/play/IEditPlayPageControl;->loadPath(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    .line 81
    .line 82
    :try_start_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catch_0
    move-exception p1

    .line 89
    goto :goto_1

    .line 90
    :catch_1
    move-exception p1

    .line 91
    new-instance p3, Lcom/zykj/blackboard/core/play/g;

    .line 92
    .line 93
    invoke-direct {p3, p2, p1}, Lcom/zykj/blackboard/core/play/g;-><init>(Lx7/l;Ljava/lang/Exception;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, p3}, Lcom/zykj/blackboard/core/play/PlayControl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_0
    new-instance p1, Lcom/zykj/blackboard/core/play/h;

    .line 101
    .line 102
    invoke-direct {p1, p3, p0}, Lcom/zykj/blackboard/core/play/h;-><init>(Lx7/l;Lcom/zykj/blackboard/core/play/PlayControl;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->runOnMainThread(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 110
    .line 111
    .line 112
    new-instance p3, Lcom/zykj/blackboard/core/play/i;

    .line 113
    .line 114
    invoke-direct {p3, p2, p1}, Lcom/zykj/blackboard/core/play/i;-><init>(Lx7/l;Ljava/lang/Exception;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0, p3}, Lcom/zykj/blackboard/core/play/PlayControl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method private static final loadPath$lambda-4$lambda-1$lambda-0(Lx7/l;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "$failCallBack"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final loadPath$lambda-4$lambda-2(Lx7/l;Lcom/zykj/blackboard/core/play/PlayControl;)V
    .locals 1

    .line 1
    const-string v0, "$successCallBack"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final loadPath$lambda-4$lambda-3(Lx7/l;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "$failCallBack"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final runOnMainThread(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public getCurrentPlayPageControl()Lcom/zykj/blackboard/core/play/IPlayPageControl;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->currentPageIndex:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget v1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->currentPageIndex:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method public getCurrentPlayPageIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->currentPageIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public getPlayPageControlList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRootPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->rootPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadPath(Ljava/lang/String;Lx7/l;Lx7/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "failCallBack"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/zykj/blackboard/core/play/PlayControl;->getSingleExecutor()Ljava/util/concurrent/ExecutorService;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lcom/zykj/blackboard/core/play/f;

    .line 32
    .line 33
    invoke-direct {v1, p0, p1, p3, p2}, Lcom/zykj/blackboard/core/play/f;-><init>(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lx7/l;Lx7/l;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    new-instance p2, Ljava/io/FileNotFoundException;

    .line 41
    .line 42
    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p3, p2}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 18
    .line 19
    invoke-interface {v1}, Lcom/zykj/blackboard/core/play/IEditPlayPageControl;->release()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setPageListener(Lcom/zykj/blackboard/listener/PageListener;)V
    .locals 1

    .line 1
    const-string v0, "pageListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 7
    .line 8
    return-void
.end method

.method public switchCurrentPlayPage(ILx7/a;Lx7/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lx7/a;",
            "Lx7/a;",
            ")Z"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onError"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-ltz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ge p1, v0, :cond_1

    .line 20
    .line 21
    iget p3, p0, Lcom/zykj/blackboard/core/play/PlayControl;->currentPageIndex:I

    .line 22
    .line 23
    const/4 v0, -0x1

    .line 24
    if-eq p3, v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 33
    .line 34
    invoke-interface {p3}, Lcom/zykj/blackboard/core/play/IEditPlayPageControl;->hide()V

    .line 35
    .line 36
    .line 37
    :cond_0
    iput p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->currentPageIndex:I

    .line 38
    .line 39
    iget-object p3, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 46
    .line 47
    invoke-interface {p1, p2}, Lcom/zykj/blackboard/core/play/IEditPlayPageControl;->show(Lx7/a;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    invoke-interface {p3}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    return p1
.end method

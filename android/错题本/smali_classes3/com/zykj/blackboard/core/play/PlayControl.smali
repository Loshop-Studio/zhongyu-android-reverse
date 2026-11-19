.class public final Lcom/zykj/blackboard/core/play/PlayControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/play/IPlayControl;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJE\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00080\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00080\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J3\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001b2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001bH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010\'\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010)\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010+R$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u000f0,j\u0008\u0012\u0004\u0012\u00020\u000f`-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u00100\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u00102R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00104R#\u0010;\u001a\n 6*\u0004\u0018\u000105058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\u00a8\u0006<"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/play/PlayControl;",
        "Lcom/zykj/blackboard/core/play/IPlayControl;",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "renderLayer",
        "<init>",
        "(Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V",
        "Ljava/lang/Runnable;",
        "runnable",
        "Ld6/s;",
        "runOnMainThread",
        "(Ljava/lang/Runnable;)V",
        "",
        "path",
        "Lkotlin/Function1;",
        "",
        "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
        "successCallBack",
        "",
        "failCallBack",
        "loadPath",
        "(Ljava/lang/String;Lr6/c;Lr6/c;)V",
        "Lcom/zykj/blackboard/listener/PageListener;",
        "pageListener",
        "setPageListener",
        "(Lcom/zykj/blackboard/listener/PageListener;)V",
        "",
        "pageIndex",
        "Lkotlin/Function0;",
        "callback",
        "onError",
        "",
        "switchCurrentPlayPage",
        "(ILr6/a;Lr6/a;)Z",
        "getPlayPageControlList",
        "()Ljava/util/List;",
        "getCurrentPlayPageControl",
        "()Lcom/zykj/blackboard/core/play/IPlayPageControl;",
        "getCurrentPlayPageIndex",
        "()I",
        "getRootPath",
        "()Ljava/lang/String;",
        "release",
        "()V",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "pageList",
        "Ljava/util/ArrayList;",
        "currentPageIndex",
        "I",
        "Lcom/zykj/blackboard/listener/PageListener;",
        "rootPath",
        "Ljava/lang/String;",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "singleExecutor$delegate",
        "Ld6/e;",
        "getSingleExecutor",
        "()Ljava/util/concurrent/ExecutorService;",
        "singleExecutor",
        "blackboard_release"
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
.field private currentPageIndex:I

.field private final pageList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private pageListener:Lcom/zykj/blackboard/listener/PageListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private rootPath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final singleExecutor$delegate:Ld6/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "renderLayer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {p1}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->singleExecutor$delegate:Ld6/e;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic a(Lr6/c;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->loadPath$lambda-4$lambda-1$lambda-0(Lr6/c;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/play/PlayControl;->loadPath$lambda-4(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lr6/c;Lr6/c;)V

    return-void
.end method

.method public static synthetic c(Lr6/c;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->loadPath$lambda-4$lambda-3(Lr6/c;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lr6/c;Lcom/zykj/blackboard/core/play/PlayControl;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->loadPath$lambda-4$lambda-2(Lr6/c;Lcom/zykj/blackboard/core/play/PlayControl;)V

    return-void
.end method

.method private final getSingleExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->singleExecutor$delegate:Ld6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

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

.method private static final loadPath$lambda-4(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 3

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$failCallBack"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$successCallBack"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageRouter$PageRouter;->getPageInfoList()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "SourceLoad.getPageRouter(path).pageInfoList"

    .line 43
    .line 44
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    new-instance p3, Lcom/zykj/blackboard/core/play/d;

    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-direct {p3, p2, p1, v0}, Lcom/zykj/blackboard/core/play/d;-><init>(Lr6/c;Ljava/lang/Exception;I)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, p3}, Lcom/zykj/blackboard/core/play/PlayControl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_0
    new-instance p1, Lcom/zykj/blackboard/core/play/f;

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    invoke-direct {p1, v0, p3, p0}, Lcom/zykj/blackboard/core/play/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->runOnMainThread(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 112
    .line 113
    .line 114
    new-instance p3, Lcom/zykj/blackboard/core/play/d;

    .line 115
    .line 116
    const/4 v0, 0x1

    .line 117
    invoke-direct {p3, p2, p1, v0}, Lcom/zykj/blackboard/core/play/d;-><init>(Lr6/c;Ljava/lang/Exception;I)V

    .line 118
    .line 119
    .line 120
    invoke-direct {p0, p3}, Lcom/zykj/blackboard/core/play/PlayControl;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method private static final loadPath$lambda-4$lambda-1$lambda-0(Lr6/c;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "$failCallBack"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final loadPath$lambda-4$lambda-2(Lr6/c;Lcom/zykj/blackboard/core/play/PlayControl;)V
    .locals 1

    .line 1
    const-string v0, "$successCallBack"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final loadPath$lambda-4$lambda-3(Lr6/c;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "$failCallBack"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRootPath()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->rootPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadPath(Ljava/lang/String;Lr6/c;Lr6/c;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successCallBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "failCallBack"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    new-instance v1, La5/d;

    .line 32
    .line 33
    const/4 v6, 0x6

    .line 34
    move-object v2, p0

    .line 35
    move-object v3, p1

    .line 36
    move-object v5, p2

    .line 37
    move-object v4, p3

    .line 38
    invoke-direct/range {v1 .. v6}, La5/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    move-object v3, p1

    .line 46
    move-object v4, p3

    .line 47
    new-instance p1, Ljava/io/FileNotFoundException;

    .line 48
    .line 49
    invoke-direct {p1, v3}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v4, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public release()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Lcom/zykj/blackboard/core/play/IPlayPageControl;

    .line 17
    .line 18
    invoke-interface {v3}, Lcom/zykj/blackboard/core/play/IEditPlayPageControl;->release()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageList:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setPageListener(Lcom/zykj/blackboard/listener/PageListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/listener/PageListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pageListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 7
    .line 8
    return-void
.end method

.method public switchCurrentPlayPage(ILr6/a;Lr6/a;)Z
    .locals 1
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lr6/a;",
            "Lr6/a;",
            ")Z"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onError"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-interface {p1, p2}, Lcom/zykj/blackboard/core/play/IEditPlayPageControl;->show(Lr6/a;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    invoke-interface {p3}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    return p1
.end method

.class public final Lcom/zykj/merge/sketch/view/OldSketchProxyView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/merge/sketch/listener/Play;


# instance fields
.field public _$_findViewCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final loadDataExecutor$delegate:Lqc/d;

.field private path:Ljava/lang/String;

.field private final playActionListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/merge/sketch/listener/PlayStatusListener;",
            ">;"
        }
    .end annotation
.end field

.field private playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

.field private final seekExecutor$delegate:Lqc/d;

.field private final sketchPlayView:Lcom/zykj/paint/render/SketchViewer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/paint/render/SketchViewer;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lcom/zykj/paint/render/SketchViewer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 22
    .line 23
    sget-object p1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playActionListener:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lcom/zykj/paint/render/SketchViewer;->setPlayStatusListener(Lcom/zykj/paint/player/PlayStatusListener;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView$loadDataExecutor$2;->INSTANCE:Lcom/zykj/merge/sketch/view/OldSketchProxyView$loadDataExecutor$2;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadDataExecutor$delegate:Lqc/d;

    .line 52
    .line 53
    sget-object p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView$seekExecutor$2;->INSTANCE:Lcom/zykj/merge/sketch/view/OldSketchProxyView$seekExecutor$2;

    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekExecutor$delegate:Lqc/d;

    .line 60
    .line 61
    return-void
.end method

.method public static synthetic a(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4$lambda-3(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V

    return-void
.end method

.method public static final synthetic access$getPlayActionListener$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playActionListener:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setPlayStatus$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lcom/zykj/merge/sketch/constant/PlayStatus;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic b(Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4$lambda-1$lambda-0(Lhd/l;)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9$lambda-6(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;I)V

    return-void
.end method

.method public static synthetic d(Lhd/l;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9$lambda-6$lambda-5(Lhd/l;I)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILhd/l;Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILhd/l;Lhd/l;)V

    return-void
.end method

.method public static synthetic f(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4$lambda-1(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V

    return-void
.end method

.method public static synthetic g(Lhd/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4$lambda-3$lambda-2(Lhd/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    return-void
.end method

.method private final getLoadDataExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadDataExecutor$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

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

.method private final getSeekExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekExecutor$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

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

.method public static synthetic h(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9$lambda-8(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lhd/l;Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->loadData$lambda-4(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static synthetic j(Lhd/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->seekTo$lambda-9$lambda-8$lambda-7(Lhd/l;Ljava/lang/Exception;)V

    return-void
.end method

.method private static final loadData$lambda-4(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lhd/l;Lhd/l;)V
    .locals 2

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
    const-string v0, "$onFailure"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$onSuccess"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->path:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/sketch/utils/ProtoFileUtils;->Companion:Lcom/zykj/sketch/utils/ProtoFileUtils$Companion;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/utils/ProtoFileUtils$Companion;->readProtoFile(Ljava/lang/String;)[B

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/zykj/paint/Actions$EzyActionList;->parseFrom([B)Lcom/zykj/paint/Actions$EzyActionList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyActionList;->getActionList()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    new-instance p1, Lcom/zykj/merge/sketch/view/l;

    .line 44
    .line 45
    invoke-direct {p1, p0, p2}, Lcom/zykj/merge/sketch/view/l;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    iget-object p2, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyActionList;->getActionList()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p2, v0, p1}, Lcom/zykj/paint/render/SketchViewer;->setDataSource(Ljava/util/List;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, Lcom/zykj/merge/sketch/view/m;

    .line 62
    .line 63
    invoke-direct {p1, p0, p3}, Lcom/zykj/merge/sketch/view/m;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method private static final loadData$lambda-4$lambda-1(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onFailure"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/merge/sketch/view/p;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/zykj/merge/sketch/view/p;-><init>(Lhd/l;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final loadData$lambda-4$lambda-1$lambda-0(Lhd/l;)V
    .locals 2

    .line 1
    const-string v0, "$onFailure"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/exception/EmptyDataException;

    .line 7
    .line 8
    const-string v1, "\u627e\u4e0d\u5230\u6587\u4ef6"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/exception/EmptyDataException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final loadData$lambda-4$lambda-3(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onSuccess"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/merge/sketch/view/g;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0}, Lcom/zykj/merge/sketch/view/g;-><init>(Lhd/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final loadData$lambda-4$lambda-3$lambda-2(Lhd/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V
    .locals 2

    .line 1
    const-string v0, "$onSuccess"

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
    iget-object p1, p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/paint/render/SketchViewer;->getTotalTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    long-to-int p1, v0

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final runAtLeastCreated(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewKt;->findViewTreeLifecycleOwner(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 29
    .line 30
    .line 31
    :cond_0
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

.method private static final seekTo$lambda-9(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILhd/l;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$onFailure"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/paint/render/SketchViewer;->seekToCurrentIndex(I)J

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/zykj/merge/sketch/view/j;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2, p1}, Lcom/zykj/merge/sketch/view/j;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runOnMainThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    new-instance p2, Lcom/zykj/merge/sketch/view/k;

    .line 32
    .line 33
    invoke-direct {p2, p0, p3, p1}, Lcom/zykj/merge/sketch/view/k;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, p2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runOnMainThread(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private static final seekTo$lambda-9$lambda-6(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;I)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onSuccess"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/merge/sketch/view/h;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lcom/zykj/merge/sketch/view/h;-><init>(Lhd/l;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final seekTo$lambda-9$lambda-6$lambda-5(Lhd/l;I)V
    .locals 1

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final seekTo$lambda-9$lambda-8(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lhd/l;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onFailure"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$e"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/merge/sketch/view/o;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lcom/zykj/merge/sketch/view/o;-><init>(Lhd/l;Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->runAtLeastCreated(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private static final seekTo$lambda-9$lambda-8$lambda-7(Lhd/l;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    const-string v0, "$onFailure"

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
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->_$_findViewCache:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v1
.end method

.method public addPlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playActionListener:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public isRend(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/paint/render/SketchViewer;->isRend(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public loadData(Ljava/lang/String;Lhd/l;Lhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lhd/l;",
            "Lhd/l;",
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
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onFailure"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->getLoadDataExecutor()Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lcom/zykj/merge/sketch/view/n;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1, p3, p2}, Lcom/zykj/merge/sketch/view/n;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lhd/l;Lhd/l;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_PAUSE:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->pause()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->release()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playActionListener:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->reset()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->resume()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public seekTo(ILhd/l;Lhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailure"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->getSeekExecutor()Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/zykj/merge/sketch/view/i;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/zykj/merge/sketch/view/i;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILhd/l;Lhd/l;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setRate(D)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->play()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public status()Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public waiting()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_PAUSE:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->playStatus:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->sketchPlayView:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->pause()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

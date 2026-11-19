.class public final Lcom/zykj/merge/sketch/view/OldSketchProxyView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lx3/b;


# instance fields
.field public final a:Lcom/zykj/paint/render/SketchViewer;

.field public b:Lcom/zykj/merge/sketch/constant/PlayStatus;

.field public final c:Ljava/util/List;

.field public d:Ljava/lang/String;

.field public final e:Lh7/d;

.field public final f:Lh7/d;

.field public g:Ljava/util/Map;


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
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->g:Ljava/util/Map;

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
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 22
    .line 23
    sget-object p1, Lcom/zykj/merge/sketch/constant/PlayStatus;->f:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->b:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->c:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Lcom/zykj/paint/render/SketchViewer;->setPlayStatusListener(Lg4/a;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView$loadDataExecutor$2;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView$loadDataExecutor$2;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->e:Lh7/d;

    .line 52
    .line 53
    sget-object p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView$seekExecutor$2;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView$seekExecutor$2;

    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->f:Lh7/d;

    .line 60
    .line 61
    return-void
.end method

.method public static final A(Lx7/l;Ljava/lang/Exception;)V
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
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic d(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->s(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;)V

    return-void
.end method

.method public static synthetic e(Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->r(Lx7/l;)V

    return-void
.end method

.method public static synthetic f(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->x(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;I)V

    return-void
.end method

.method public static synthetic g(Lx7/l;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->y(Lx7/l;I)V

    return-void
.end method

.method private final getLoadDataExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->e:Lh7/d;

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

.method private final getSeekExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->f:Lh7/d;

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

.method public static synthetic h(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILx7/l;Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->w(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILx7/l;Lx7/l;)V

    return-void
.end method

.method public static synthetic i(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->q(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;)V

    return-void
.end method

.method public static synthetic j(Lx7/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->t(Lx7/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->z(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic l(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lx7/l;Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lx7/l;Lx7/l;)V

    return-void
.end method

.method public static synthetic m(Lx7/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->A(Lx7/l;Ljava/lang/Exception;)V

    return-void
.end method

.method public static final synthetic n(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lcom/zykj/merge/sketch/constant/PlayStatus;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->b:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    return-void
.end method

.method public static final p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lx7/l;Lx7/l;)V
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
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->d:Ljava/lang/String;

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
    invoke-static {v0}, Lcom/zykj/paint/Actions$EzyActionList;->n([B)Lcom/zykj/paint/Actions$EzyActionList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyActionList;->g()Ljava/util/List;

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
    new-instance p1, Ly3/g;

    .line 44
    .line 45
    invoke-direct {p1, p0, p2}, Ly3/g;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->v(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    iget-object p2, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyActionList;->g()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p2, v0, p1}, Lcom/zykj/paint/render/SketchViewer;->C(Ljava/util/List;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, Ly3/h;

    .line 62
    .line 63
    invoke-direct {p1, p0, p3}, Ly3/h;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->v(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static final q(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;)V
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
    new-instance v0, Ly3/l;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ly3/l;-><init>(Lx7/l;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->u(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final r(Lx7/l;)V
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
    invoke-interface {p0, v0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final s(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;)V
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
    new-instance v0, Ly3/i;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0}, Ly3/i;-><init>(Lx7/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->u(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final t(Lx7/l;Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V
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
    iget-object p1, p1, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

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
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final u(Ljava/lang/Runnable;)V
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

.method public static final w(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILx7/l;Lx7/l;)V
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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/zykj/paint/render/SketchViewer;->B(I)J

    .line 19
    .line 20
    .line 21
    new-instance v0, Ly3/e;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2, p1}, Ly3/e;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->v(Ljava/lang/Runnable;)V
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
    new-instance p2, Ly3/f;

    .line 32
    .line 33
    invoke-direct {p2, p0, p3, p1}, Ly3/f;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->v(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static final x(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;I)V
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
    new-instance v0, Ly3/j;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Ly3/j;-><init>(Lx7/l;I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->u(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final y(Lx7/l;I)V
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
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final z(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lx7/l;Ljava/lang/Exception;)V
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
    new-instance v0, Ly3/k;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Ly3/k;-><init>(Lx7/l;Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->u(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public a(Lx3/c;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(Lx3/c;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(D)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public destroy()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->f:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->b:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadData(Ljava/lang/String;Lx7/l;Lx7/l;)V
    .locals 2

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
    new-instance v1, Ly3/d;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1, p3, p2}, Ly3/d;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Ljava/lang/String;Lx7/l;Lx7/l;)V

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
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->d:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->b:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->s()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->f:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->b:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->v()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->e:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->b:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->A()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public seekTo(ILx7/l;Lx7/l;)V
    .locals 2

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
    new-instance v1, Ly3/c;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, p2, p3}, Ly3/c;-><init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILx7/l;Lx7/l;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->t()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public status()Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->b:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v(Ljava/lang/Runnable;)V
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

.method public waiting()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->d:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->b:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->a:Lcom/zykj/paint/render/SketchViewer;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/paint/render/SketchViewer;->s()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.class public final Lcom/zykj/blackboard/core/play/PlayControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lha/l;


# instance fields
.field public final a:Lw9/h;

.field public final b:Ljava/util/ArrayList;

.field public c:I

.field public d:Ljava/lang/String;

.field public final e:Lqc/d;


# direct methods
.method public constructor <init>(Lw9/h;)V
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->a:Lw9/h;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    iput p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->c:I

    .line 20
    .line 21
    const-string p1, ""

    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->d:Ljava/lang/String;

    .line 24
    .line 25
    sget-object p1, Lcom/zykj/blackboard/core/play/PlayControl$singleExecutor$2;->c:Lcom/zykj/blackboard/core/play/PlayControl$singleExecutor$2;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->e:Lqc/d;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic e(Lhd/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->k(Lhd/l;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic f(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lhd/l;Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/play/PlayControl;->j(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lhd/l;Lhd/l;)V

    return-void
.end method

.method public static synthetic g(Lhd/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->m(Lhd/l;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic h(Lhd/l;Lcom/zykj/blackboard/core/play/PlayControl;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->l(Lhd/l;Lcom/zykj/blackboard/core/play/PlayControl;)V

    return-void
.end method

.method public static final j(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lhd/l;Lhd/l;)V
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
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->d:Ljava/lang/String;

    .line 31
    .line 32
    sget-object v0, Lx9/b;->a:Lx9/b;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lx9/b;->l(Ljava/lang/String;)Lcom/zykj/board/EzyPageRouter$PageRouter;

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
    check-cast p1, Ljava/lang/Iterable;

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;

    .line 64
    .line 65
    new-instance v1, Lcom/zykj/blackboard/core/play/PlayPageControl;

    .line 66
    .line 67
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/PlayControl;->a:Lw9/h;

    .line 68
    .line 69
    invoke-direct {v1, p0, v2}, Lcom/zykj/blackboard/core/play/PlayPageControl;-><init>(Lha/l;Lw9/h;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    :try_start_1
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v2, "info.name"

    .line 77
    .line 78
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v1, v0}, Lha/k;->h(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    .line 83
    .line 84
    :try_start_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_0
    move-exception p1

    .line 91
    goto :goto_1

    .line 92
    :catch_1
    move-exception p1

    .line 93
    new-instance p3, Lha/o;

    .line 94
    .line 95
    invoke-direct {p3, p2, p1}, Lha/o;-><init>(Lhd/l;Ljava/lang/Exception;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p3}, Lcom/zykj/blackboard/core/play/PlayControl;->o(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_0
    new-instance p1, Lha/p;

    .line 103
    .line 104
    invoke-direct {p1, p3, p0}, Lha/p;-><init>(Lhd/l;Lcom/zykj/blackboard/core/play/PlayControl;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/play/PlayControl;->o(Ljava/lang/Runnable;)V
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
    new-instance p3, Lha/q;

    .line 115
    .line 116
    invoke-direct {p3, p2, p1}, Lha/q;-><init>(Lhd/l;Ljava/lang/Exception;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p3}, Lcom/zykj/blackboard/core/play/PlayControl;->o(Ljava/lang/Runnable;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public static final k(Lhd/l;Ljava/lang/Exception;)V
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
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final l(Lhd/l;Lcom/zykj/blackboard/core/play/PlayControl;)V
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
    iget-object p1, p1, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final m(Lhd/l;Ljava/lang/Exception;)V
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
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Lha/m;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->c:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget v1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->c:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lha/m;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Ljava/lang/String;Lhd/l;Lhd/l;)V
    .locals 2

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/PlayControl;->i()Ljava/util/concurrent/ExecutorService;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lha/n;

    .line 32
    .line 33
    invoke-direct {v1, p0, p1, p3, p2}, Lha/n;-><init>(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lhd/l;Lhd/l;)V

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
    invoke-interface {p3, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public d(ILhd/a;Lhd/a;)Z
    .locals 1

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

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
    iget p3, p0, Lcom/zykj/blackboard/core/play/PlayControl;->c:I

    .line 22
    .line 23
    const/4 v0, -0x1

    .line 24
    if-eq p3, v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Lha/m;

    .line 33
    .line 34
    invoke-interface {p3}, Lha/k;->hide()V

    .line 35
    .line 36
    .line 37
    :cond_0
    iput p1, p0, Lcom/zykj/blackboard/core/play/PlayControl;->c:I

    .line 38
    .line 39
    iget-object p3, p0, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lha/m;

    .line 46
    .line 47
    invoke-interface {p1, p2}, Lha/k;->b(Lhd/a;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    invoke-interface {p3}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    return p1
.end method

.method public final i()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->e:Lqc/d;

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

.method public n()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

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
    check-cast v3, Lha/m;

    .line 17
    .line 18
    invoke-interface {v3}, Lha/k;->release()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayControl;->b:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final o(Ljava/lang/Runnable;)V
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

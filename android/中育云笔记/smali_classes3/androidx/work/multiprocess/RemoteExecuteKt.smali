.class public final Landroidx/work/multiprocess/RemoteExecuteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final execute(Ljava/util/concurrent/Executor;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/work/multiprocess/RemoteDispatcher;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/IInterface;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;",
            "Landroidx/work/multiprocess/RemoteDispatcher<",
            "TT;>;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "[B>;"
        }
    .end annotation

    const-string v0, "executor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iInterface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Landroidx/concurrent/futures/SuspendToFutureAdapter;->INSTANCE:Landroidx/concurrent/futures/SuspendToFutureAdapter;

    invoke-static {p0}, Lsd/g1;->b(Ljava/util/concurrent/Executor;)Lsd/e0;

    move-result-object p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lsd/o1;->b(Lkotlinx/coroutines/g;ILjava/lang/Object;)Lsd/v;

    move-result-object v1

    invoke-virtual {p0, v1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    move-result-object p0

    new-instance v1, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;

    invoke-direct {v1, p1, p2, v2}, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;-><init>(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/work/multiprocess/RemoteDispatcher;Lvc/c;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Landroidx/concurrent/futures/SuspendToFutureAdapter;->launchFuture(Lkotlin/coroutines/d;ZLhd/p;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static final execute(Landroid/os/IInterface;Landroidx/work/multiprocess/RemoteDispatcher;Lvc/c;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/IInterface;",
            ">(TT;",
            "Landroidx/work/multiprocess/RemoteDispatcher<",
            "TT;>;",
            "Lvc/c<",
            "-[B>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;

    iget v1, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;

    invoke-direct {v0, p2}, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;-><init>(Lvc/c;)V

    :goto_0
    iget-object p2, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->result:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->label:I

    const-string v3, "binder"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->L$3:Ljava/lang/Object;

    check-cast p0, Landroid/os/IBinder;

    iget-object p1, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->L$2:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->L$1:Ljava/lang/Object;

    check-cast v1, Landroidx/work/multiprocess/RemoteDispatcher;

    iget-object v0, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->L$0:Ljava/lang/Object;

    check-cast v0, Landroid/os/IInterface;

    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 3
    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 4
    invoke-interface {p0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    .line 5
    :try_start_1
    iput-object p0, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->L$3:Ljava/lang/Object;

    iput v4, v0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$2;->label:I

    new-instance v4, Lvc/f;

    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    move-result-object v5

    invoke-direct {v4, v5}, Lvc/f;-><init>(Lvc/c;)V

    .line 6
    new-instance v5, Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$localRecipient$1;

    invoke-direct {v5, v4}, Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$localRecipient$1;-><init>(Lvc/c;)V

    .line 7
    iput-object v5, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    const/4 v6, 0x0

    .line 8
    invoke-interface {v2, v5, v6}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 9
    new-instance v5, Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$1;

    invoke-direct {v5, v4}, Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$1;-><init>(Lvc/c;)V

    .line 10
    invoke-interface {p1, p0, v5}, Landroidx/work/multiprocess/RemoteDispatcher;->execute(Ljava/lang/Object;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V

    .line 11
    invoke-virtual {v4}, Lvc/f;->a()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    invoke-static {v0}, Lxc/f;->c(Lvc/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    goto :goto_3

    :cond_3
    :goto_1
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_2
    :try_start_2
    check-cast p2, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 12
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast p1, Landroid/os/IBinder$DeathRecipient;

    if-eqz p1, :cond_5

    invoke-static {p0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Landroidx/work/multiprocess/RemoteExecuteKt;->unlinkToDeathSafely(Landroid/os/IBinder;Landroid/os/IBinder$DeathRecipient;)V

    :cond_5
    return-object p2

    .line 13
    :goto_3
    :try_start_3
    instance-of v0, p2, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_6

    .line 14
    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v0

    sget-object v1, Landroidx/work/multiprocess/ListenableWorkerImplClient;->TAG:Ljava/lang/String;

    const-string v2, "Unable to execute"

    invoke-virtual {v0, v1, v2, p2}, Landroidx/work/Logger;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :catchall_2
    move-exception p2

    goto :goto_5

    .line 15
    :cond_6
    :goto_4
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 16
    :goto_5
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast p1, Landroid/os/IBinder$DeathRecipient;

    if-eqz p1, :cond_7

    invoke-static {p0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Landroidx/work/multiprocess/RemoteExecuteKt;->unlinkToDeathSafely(Landroid/os/IBinder;Landroid/os/IBinder$DeathRecipient;)V

    :cond_7
    throw p2
.end method

.method private static final unlinkToDeathSafely(Landroid/os/IBinder;Landroid/os/IBinder$DeathRecipient;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-interface {p0, p1, v0}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    .line 4
    .line 5
    :catch_0
    return-void
.end method

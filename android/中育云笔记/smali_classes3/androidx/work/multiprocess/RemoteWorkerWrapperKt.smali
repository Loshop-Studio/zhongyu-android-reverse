.class public final Landroidx/work/multiprocess/RemoteWorkerWrapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final executeRemoteWorker(Landroid/content/Context;Landroidx/work/Configuration;Ljava/lang/String;Landroidx/work/WorkerParameters;Lkotlinx/coroutines/g;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/Configuration;",
            "Ljava/lang/String;",
            "Landroidx/work/WorkerParameters;",
            "Lkotlinx/coroutines/g;",
            "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Landroidx/work/ListenableWorker$Result;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "configuration"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "workerClassName"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "workerParameters"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "job"

    .line 22
    .line 23
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "taskExecutor"

    .line 27
    .line 28
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p5}, Landroidx/work/impl/utils/taskexecutor/TaskExecutor;->getMainThreadExecutor()Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "taskExecutor.mainThreadExecutor"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lsd/g1;->b(Ljava/util/concurrent/Executor;)Lsd/e0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Landroidx/concurrent/futures/SuspendToFutureAdapter;->INSTANCE:Landroidx/concurrent/futures/SuspendToFutureAdapter;

    .line 45
    .line 46
    invoke-virtual {v0, p4}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    new-instance v2, Landroidx/work/multiprocess/RemoteWorkerWrapperKt$executeRemoteWorker$future$1;

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    move-object v4, p0

    .line 54
    move-object v3, p1

    .line 55
    move-object v5, p2

    .line 56
    move-object v6, p3

    .line 57
    move-object v7, p5

    .line 58
    invoke-direct/range {v2 .. v8}, Landroidx/work/multiprocess/RemoteWorkerWrapperKt$executeRemoteWorker$future$1;-><init>(Landroidx/work/Configuration;Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Lvc/c;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    invoke-virtual {v1, p4, p0, v2}, Landroidx/concurrent/futures/SuspendToFutureAdapter;->launchFuture(Lkotlin/coroutines/d;ZLhd/p;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

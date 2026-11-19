.class final Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/multiprocess/RemoteExecuteKt;->execute(Ljava/util/concurrent/Executor;Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/work/multiprocess/RemoteDispatcher;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.work.multiprocess.RemoteExecuteKt$execute$1"
    f = "RemoteExecute.kt"
    l = {
        0x2b,
        0x32
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $dispatcher:Landroidx/work/multiprocess/RemoteDispatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/multiprocess/RemoteDispatcher<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $iInterface:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/work/multiprocess/RemoteDispatcher;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "TT;>;",
            "Landroidx/work/multiprocess/RemoteDispatcher<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->$iInterface:Lcom/google/common/util/concurrent/ListenableFuture;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->$dispatcher:Landroidx/work/multiprocess/RemoteDispatcher;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->$iInterface:Lcom/google/common/util/concurrent/ListenableFuture;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->$dispatcher:Landroidx/work/multiprocess/RemoteDispatcher;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;-><init>(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/work/multiprocess/RemoteDispatcher;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-[B>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :try_start_1
    iget-object p1, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->$iInterface:Lcom/google/common/util/concurrent/ListenableFuture;

    .line 37
    .line 38
    iput v3, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->label:I

    .line 39
    .line 40
    invoke-static {p1, p0}, Landroidx/concurrent/futures/ListenableFutureKt;->await(Lcom/google/common/util/concurrent/ListenableFuture;Lvc/c;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_0
    check-cast p1, Landroid/os/IInterface;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    iget-object v1, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->$dispatcher:Landroidx/work/multiprocess/RemoteDispatcher;

    .line 50
    .line 51
    iput v2, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$1;->label:I

    .line 52
    .line 53
    invoke-static {p1, v1, p0}, Landroidx/work/multiprocess/RemoteExecuteKt;->execute(Landroid/os/IInterface;Landroidx/work/multiprocess/RemoteDispatcher;Lvc/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_4

    .line 58
    .line 59
    :goto_1
    return-object v0

    .line 60
    :cond_4
    return-object p1

    .line 61
    :goto_2
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 62
    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget-object v1, Landroidx/work/multiprocess/ListenableWorkerImplClient;->TAG:Ljava/lang/String;

    .line 70
    .line 71
    const-string v2, "Unable to bind to service"

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2, p1}, Landroidx/work/Logger;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :cond_5
    throw p1
.end method

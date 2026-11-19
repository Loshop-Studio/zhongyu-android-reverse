.class public final Lio/reactivex/internal/schedulers/l;
.super Lq5/i;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledExecutorService;

.field public final b:Ls5/a;

.field public volatile c:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/internal/schedulers/l;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    new-instance p1, Ls5/a;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ls5/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lio/reactivex/internal/schedulers/l;->b:Ls5/a;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;)Ls5/b;
    .locals 1

    .line 1
    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-boolean p2, p0, Lio/reactivex/internal/schedulers/l;->c:Z

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    sget-object p1, Lio/reactivex/internal/disposables/EmptyDisposable;->INSTANCE:Lio/reactivex/internal/disposables/EmptyDisposable;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance p2, Lio/reactivex/internal/schedulers/ScheduledRunnable;

    .line 11
    .line 12
    iget-object v0, p0, Lio/reactivex/internal/schedulers/l;->b:Ls5/a;

    .line 13
    .line 14
    invoke-direct {p2, p1, v0}, Lio/reactivex/internal/schedulers/ScheduledRunnable;-><init>(Ljava/lang/Runnable;Lu5/a;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lio/reactivex/internal/schedulers/l;->b:Ls5/a;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ls5/a;->a(Ls5/b;)Z

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object p1, p0, Lio/reactivex/internal/schedulers/l;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2, p1}, Lio/reactivex/internal/schedulers/ScheduledRunnable;->setFuture(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-object p2

    .line 32
    :catch_0
    move-exception p1

    .line 33
    invoke-virtual {p0}, Lio/reactivex/internal/schedulers/l;->dispose()V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lv7/d;->q(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lio/reactivex/internal/disposables/EmptyDisposable;->INSTANCE:Lio/reactivex/internal/disposables/EmptyDisposable;

    .line 40
    .line 41
    return-object p1
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/internal/schedulers/l;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/internal/schedulers/l;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/internal/schedulers/l;->b:Ls5/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Ls5/a;->dispose()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

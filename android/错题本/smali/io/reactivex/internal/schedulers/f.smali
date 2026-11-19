.class public final Lio/reactivex/internal/schedulers/f;
.super Lq5/i;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ls5/a;

.field public final b:Lio/reactivex/internal/schedulers/e;

.field public final c:Lio/reactivex/internal/schedulers/g;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lio/reactivex/internal/schedulers/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/reactivex/internal/schedulers/f;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    iput-object p1, p0, Lio/reactivex/internal/schedulers/f;->b:Lio/reactivex/internal/schedulers/e;

    .line 12
    .line 13
    new-instance v0, Ls5/a;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Ls5/a;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lio/reactivex/internal/schedulers/f;->a:Ls5/a;

    .line 20
    .line 21
    iget-object v0, p1, Lio/reactivex/internal/schedulers/e;->c:Ls5/a;

    .line 22
    .line 23
    iget-boolean v0, v0, Ls5/a;->b:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    sget-object p1, Lio/reactivex/internal/schedulers/h;->f:Lio/reactivex/internal/schedulers/g;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v0, p1, Lio/reactivex/internal/schedulers/e;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p1, Lio/reactivex/internal/schedulers/e;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lio/reactivex/internal/schedulers/g;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    :goto_0
    move-object p1, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance v0, Lio/reactivex/internal/schedulers/g;

    .line 51
    .line 52
    iget-object v1, p1, Lio/reactivex/internal/schedulers/e;->f:Ljava/util/concurrent/ThreadFactory;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Lio/reactivex/internal/schedulers/g;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Lio/reactivex/internal/schedulers/e;->c:Ls5/a;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ls5/a;->a(Ls5/b;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :goto_1
    iput-object p1, p0, Lio/reactivex/internal/schedulers/f;->c:Lio/reactivex/internal/schedulers/g;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;)Ls5/b;
    .locals 2

    .line 1
    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-object v0, p0, Lio/reactivex/internal/schedulers/f;->a:Ls5/a;

    .line 4
    .line 5
    iget-boolean v0, v0, Ls5/a;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lio/reactivex/internal/disposables/EmptyDisposable;->INSTANCE:Lio/reactivex/internal/disposables/EmptyDisposable;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/schedulers/f;->c:Lio/reactivex/internal/schedulers/g;

    .line 13
    .line 14
    iget-object v1, p0, Lio/reactivex/internal/schedulers/f;->a:Ls5/a;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, v1}, Lio/reactivex/internal/schedulers/j;->c(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;Lu5/a;)Lio/reactivex/internal/schedulers/ScheduledRunnable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final dispose()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lio/reactivex/internal/schedulers/f;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lio/reactivex/internal/schedulers/f;->a:Ls5/a;

    .line 12
    .line 13
    invoke-virtual {v0}, Ls5/a;->dispose()V

    .line 14
    .line 15
    .line 16
    sget-boolean v0, Lio/reactivex/internal/schedulers/h;->g:Z

    .line 17
    .line 18
    iget-object v1, p0, Lio/reactivex/internal/schedulers/f;->c:Lio/reactivex/internal/schedulers/g;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v1, p0, v0, v2}, Lio/reactivex/internal/schedulers/j;->c(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;Lu5/a;)Lio/reactivex/internal/schedulers/ScheduledRunnable;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/schedulers/f;->b:Lio/reactivex/internal/schedulers/e;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    iget-wide v4, v0, Lio/reactivex/internal/schedulers/e;->a:J

    .line 39
    .line 40
    add-long/2addr v2, v4

    .line 41
    iput-wide v2, v1, Lio/reactivex/internal/schedulers/g;->c:J

    .line 42
    .line 43
    iget-object v0, v0, Lio/reactivex/internal/schedulers/e;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void
.end method

.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/schedulers/f;->b:Lio/reactivex/internal/schedulers/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    iget-wide v3, v0, Lio/reactivex/internal/schedulers/e;->a:J

    .line 11
    .line 12
    add-long/2addr v1, v3

    .line 13
    iget-object v3, p0, Lio/reactivex/internal/schedulers/f;->c:Lio/reactivex/internal/schedulers/g;

    .line 14
    .line 15
    iput-wide v1, v3, Lio/reactivex/internal/schedulers/g;->c:J

    .line 16
    .line 17
    iget-object v0, v0, Lio/reactivex/internal/schedulers/e;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.class public final Lio/reactivex/internal/schedulers/a;
.super Lq5/i;
.source "SourceFile"


# instance fields
.field public final a:Ls5/a;

.field public final b:Ls5/a;

.field public final c:Ls5/a;

.field public final d:Lio/reactivex/internal/schedulers/c;

.field public volatile e:Z


# direct methods
.method public constructor <init>(Lio/reactivex/internal/schedulers/c;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/internal/schedulers/a;->d:Lio/reactivex/internal/schedulers/c;

    .line 5
    .line 6
    new-instance p1, Ls5/a;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0}, Ls5/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lio/reactivex/internal/schedulers/a;->a:Ls5/a;

    .line 13
    .line 14
    new-instance v0, Ls5/a;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1}, Ls5/a;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lio/reactivex/internal/schedulers/a;->b:Ls5/a;

    .line 21
    .line 22
    new-instance v1, Ls5/a;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, v2}, Ls5/a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lio/reactivex/internal/schedulers/a;->c:Ls5/a;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ls5/a;->a(Ls5/b;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ls5/a;->a(Ls5/b;)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;)Ls5/b;
    .locals 2

    .line 1
    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-boolean v0, p0, Lio/reactivex/internal/schedulers/a;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lio/reactivex/internal/disposables/EmptyDisposable;->INSTANCE:Lio/reactivex/internal/disposables/EmptyDisposable;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/schedulers/a;->d:Lio/reactivex/internal/schedulers/c;

    .line 11
    .line 12
    iget-object v1, p0, Lio/reactivex/internal/schedulers/a;->b:Ls5/a;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lio/reactivex/internal/schedulers/j;->c(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;Lu5/a;)Lio/reactivex/internal/schedulers/ScheduledRunnable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final b(Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lio/reactivex/internal/schedulers/a;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lio/reactivex/internal/schedulers/a;->d:Lio/reactivex/internal/schedulers/c;

    .line 7
    .line 8
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    iget-object v2, p0, Lio/reactivex/internal/schedulers/a;->a:Ls5/a;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1, v2}, Lio/reactivex/internal/schedulers/j;->c(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;Lu5/a;)Lio/reactivex/internal/schedulers/ScheduledRunnable;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/internal/schedulers/a;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lio/reactivex/internal/schedulers/a;->e:Z

    .line 7
    .line 8
    iget-object v0, p0, Lio/reactivex/internal/schedulers/a;->c:Ls5/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Ls5/a;->dispose()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

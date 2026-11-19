.class public final Lio/reactivex/internal/schedulers/h;
.super Lq5/j;
.source "SourceFile"


# static fields
.field public static final b:Lio/reactivex/internal/schedulers/RxThreadFactory;

.field public static final c:Lio/reactivex/internal/schedulers/RxThreadFactory;

.field public static final d:J

.field public static final e:Ljava/util/concurrent/TimeUnit;

.field public static final f:Lio/reactivex/internal/schedulers/g;

.field public static final g:Z

.field public static final h:Lio/reactivex/internal/schedulers/e;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    sput-object v0, Lio/reactivex/internal/schedulers/h;->e:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    const-string/jumbo v0, "rx2.io-keep-alive-time"

    .line 6
    .line 7
    .line 8
    const-wide/16 v1, 0x3c

    .line 9
    .line 10
    invoke-static {v0, v1, v2}, Ljava/lang/Long;->getLong(Ljava/lang/String;J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sput-wide v0, Lio/reactivex/internal/schedulers/h;->d:J

    .line 19
    .line 20
    new-instance v0, Lio/reactivex/internal/schedulers/g;

    .line 21
    .line 22
    new-instance v1, Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 23
    .line 24
    const-string v2, "RxCachedThreadSchedulerShutdown"

    .line 25
    .line 26
    invoke-direct {v1, v2}, Lio/reactivex/internal/schedulers/RxThreadFactory;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lio/reactivex/internal/schedulers/g;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lio/reactivex/internal/schedulers/h;->f:Lio/reactivex/internal/schedulers/g;

    .line 33
    .line 34
    invoke-virtual {v0}, Lio/reactivex/internal/schedulers/j;->dispose()V

    .line 35
    .line 36
    .line 37
    const-string/jumbo v0, "rx2.io-priority"

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/16 v1, 0xa

    .line 50
    .line 51
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    new-instance v2, Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 61
    .line 62
    const-string v3, "RxCachedThreadScheduler"

    .line 63
    .line 64
    invoke-direct {v2, v3, v0}, Lio/reactivex/internal/schedulers/RxThreadFactory;-><init>(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    sput-object v2, Lio/reactivex/internal/schedulers/h;->b:Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 68
    .line 69
    new-instance v3, Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 70
    .line 71
    const-string v4, "RxCachedWorkerPoolEvictor"

    .line 72
    .line 73
    invoke-direct {v3, v4, v0}, Lio/reactivex/internal/schedulers/RxThreadFactory;-><init>(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    sput-object v3, Lio/reactivex/internal/schedulers/h;->c:Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 77
    .line 78
    const-string/jumbo v0, "rx2.io-scheduled-release"

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    sput-boolean v0, Lio/reactivex/internal/schedulers/h;->g:Z

    .line 86
    .line 87
    new-instance v0, Lio/reactivex/internal/schedulers/e;

    .line 88
    .line 89
    const-wide/16 v3, 0x0

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    invoke-direct {v0, v3, v4, v5, v2}, Lio/reactivex/internal/schedulers/e;-><init>(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ThreadFactory;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lio/reactivex/internal/schedulers/h;->h:Lio/reactivex/internal/schedulers/e;

    .line 96
    .line 97
    iget-object v2, v0, Lio/reactivex/internal/schedulers/e;->c:Ls5/a;

    .line 98
    .line 99
    invoke-virtual {v2}, Ls5/a;->dispose()V

    .line 100
    .line 101
    .line 102
    iget-object v2, v0, Lio/reactivex/internal/schedulers/e;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 103
    .line 104
    if-eqz v2, :cond_0

    .line 105
    .line 106
    invoke-interface {v2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 107
    .line 108
    .line 109
    :cond_0
    iget-object v0, v0, Lio/reactivex/internal/schedulers/e;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 110
    .line 111
    if-eqz v0, :cond_1

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    :cond_1
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    sget-object v1, Lio/reactivex/internal/schedulers/h;->h:Lio/reactivex/internal/schedulers/e;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/reactivex/internal/schedulers/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    new-instance v2, Lio/reactivex/internal/schedulers/e;

    .line 14
    .line 15
    sget-wide v3, Lio/reactivex/internal/schedulers/h;->d:J

    .line 16
    .line 17
    sget-object v5, Lio/reactivex/internal/schedulers/h;->e:Ljava/util/concurrent/TimeUnit;

    .line 18
    .line 19
    sget-object v6, Lio/reactivex/internal/schedulers/h;->b:Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 20
    .line 21
    invoke-direct {v2, v3, v4, v5, v6}, Lio/reactivex/internal/schedulers/e;-><init>(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ThreadFactory;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eq v3, v1, :cond_0

    .line 36
    .line 37
    iget-object v0, v2, Lio/reactivex/internal/schedulers/e;->c:Ls5/a;

    .line 38
    .line 39
    invoke-virtual {v0}, Ls5/a;->dispose()V

    .line 40
    .line 41
    .line 42
    iget-object v0, v2, Lio/reactivex/internal/schedulers/e;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v0, v2, Lio/reactivex/internal/schedulers/e;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()Lq5/i;
    .locals 2

    .line 1
    new-instance v0, Lio/reactivex/internal/schedulers/f;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/internal/schedulers/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lio/reactivex/internal/schedulers/e;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lio/reactivex/internal/schedulers/f;-><init>(Lio/reactivex/internal/schedulers/e;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

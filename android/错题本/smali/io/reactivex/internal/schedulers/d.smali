.class public final Lio/reactivex/internal/schedulers/d;
.super Lq5/j;
.source "SourceFile"


# static fields
.field public static final b:Lio/reactivex/internal/schedulers/b;

.field public static final c:Lio/reactivex/internal/schedulers/RxThreadFactory;

.field public static final d:I

.field public static final e:Lio/reactivex/internal/schedulers/c;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string/jumbo v1, "rx2.computation-threads"

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_1

    .line 22
    .line 23
    if-le v1, v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v1

    .line 27
    :cond_1
    :goto_0
    sput v0, Lio/reactivex/internal/schedulers/d;->d:I

    .line 28
    .line 29
    new-instance v0, Lio/reactivex/internal/schedulers/c;

    .line 30
    .line 31
    new-instance v1, Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 32
    .line 33
    const-string v3, "RxComputationShutdown"

    .line 34
    .line 35
    invoke-direct {v1, v3}, Lio/reactivex/internal/schedulers/RxThreadFactory;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Lio/reactivex/internal/schedulers/j;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lio/reactivex/internal/schedulers/d;->e:Lio/reactivex/internal/schedulers/c;

    .line 42
    .line 43
    invoke-virtual {v0}, Lio/reactivex/internal/schedulers/j;->dispose()V

    .line 44
    .line 45
    .line 46
    const-string/jumbo v0, "rx2.computation-priority"

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/16 v1, 0xa

    .line 59
    .line 60
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x1

    .line 65
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    new-instance v3, Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 70
    .line 71
    const-string v4, "RxComputationThreadPool"

    .line 72
    .line 73
    invoke-direct {v3, v4, v0, v1}, Lio/reactivex/internal/schedulers/RxThreadFactory;-><init>(Ljava/lang/String;IZ)V

    .line 74
    .line 75
    .line 76
    sput-object v3, Lio/reactivex/internal/schedulers/d;->c:Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 77
    .line 78
    new-instance v0, Lio/reactivex/internal/schedulers/b;

    .line 79
    .line 80
    invoke-direct {v0, v2, v3}, Lio/reactivex/internal/schedulers/b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lio/reactivex/internal/schedulers/d;->b:Lio/reactivex/internal/schedulers/b;

    .line 84
    .line 85
    iget-object v0, v0, Lio/reactivex/internal/schedulers/b;->b:[Lio/reactivex/internal/schedulers/c;

    .line 86
    .line 87
    array-length v1, v0

    .line 88
    :goto_1
    if-ge v2, v1, :cond_2

    .line 89
    .line 90
    aget-object v3, v0, v2

    .line 91
    .line 92
    invoke-virtual {v3}, Lio/reactivex/internal/schedulers/j;->dispose()V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    sget-object v1, Lio/reactivex/internal/schedulers/d;->b:Lio/reactivex/internal/schedulers/b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/reactivex/internal/schedulers/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    new-instance v2, Lio/reactivex/internal/schedulers/b;

    .line 14
    .line 15
    sget v3, Lio/reactivex/internal/schedulers/d;->d:I

    .line 16
    .line 17
    sget-object v4, Lio/reactivex/internal/schedulers/d;->c:Lio/reactivex/internal/schedulers/RxThreadFactory;

    .line 18
    .line 19
    invoke-direct {v2, v3, v4}, Lio/reactivex/internal/schedulers/b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eq v3, v1, :cond_0

    .line 34
    .line 35
    iget-object v0, v2, Lio/reactivex/internal/schedulers/b;->b:[Lio/reactivex/internal/schedulers/c;

    .line 36
    .line 37
    array-length v1, v0

    .line 38
    const/4 v2, 0x0

    .line 39
    :goto_0
    if-ge v2, v1, :cond_2

    .line 40
    .line 41
    aget-object v3, v0, v2

    .line 42
    .line 43
    invoke-virtual {v3}, Lio/reactivex/internal/schedulers/j;->dispose()V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final a()Lq5/i;
    .locals 8

    .line 1
    new-instance v0, Lio/reactivex/internal/schedulers/a;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/internal/schedulers/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lio/reactivex/internal/schedulers/b;

    .line 10
    .line 11
    iget v2, v1, Lio/reactivex/internal/schedulers/b;->a:I

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    sget-object v1, Lio/reactivex/internal/schedulers/d;->e:Lio/reactivex/internal/schedulers/c;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v3, v1, Lio/reactivex/internal/schedulers/b;->b:[Lio/reactivex/internal/schedulers/c;

    .line 19
    .line 20
    iget-wide v4, v1, Lio/reactivex/internal/schedulers/b;->c:J

    .line 21
    .line 22
    const-wide/16 v6, 0x1

    .line 23
    .line 24
    add-long/2addr v6, v4

    .line 25
    iput-wide v6, v1, Lio/reactivex/internal/schedulers/b;->c:J

    .line 26
    .line 27
    int-to-long v1, v2

    .line 28
    rem-long/2addr v4, v1

    .line 29
    long-to-int v1, v4

    .line 30
    aget-object v1, v3, v1

    .line 31
    .line 32
    :goto_0
    invoke-direct {v0, v1}, Lio/reactivex/internal/schedulers/a;-><init>(Lio/reactivex/internal/schedulers/c;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public final b(Lio/reactivex/internal/operators/observable/i;)Ls5/b;
    .locals 7

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-object v0, p0, Lio/reactivex/internal/schedulers/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lio/reactivex/internal/schedulers/b;

    .line 10
    .line 11
    iget v1, v0, Lio/reactivex/internal/schedulers/b;->a:I

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object v0, Lio/reactivex/internal/schedulers/d;->e:Lio/reactivex/internal/schedulers/c;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v2, v0, Lio/reactivex/internal/schedulers/b;->b:[Lio/reactivex/internal/schedulers/c;

    .line 19
    .line 20
    iget-wide v3, v0, Lio/reactivex/internal/schedulers/b;->c:J

    .line 21
    .line 22
    const-wide/16 v5, 0x1

    .line 23
    .line 24
    add-long/2addr v5, v3

    .line 25
    iput-wide v5, v0, Lio/reactivex/internal/schedulers/b;->c:J

    .line 26
    .line 27
    int-to-long v0, v1

    .line 28
    rem-long/2addr v3, v0

    .line 29
    long-to-int v0, v3

    .line 30
    aget-object v0, v2, v0

    .line 31
    .line 32
    :goto_0
    iget-object v0, v0, Lio/reactivex/internal/schedulers/j;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 33
    .line 34
    new-instance v1, Lio/reactivex/internal/schedulers/ScheduledDirectTask;

    .line 35
    .line 36
    invoke-direct {v1, p1}, Lio/reactivex/internal/schedulers/ScheduledDirectTask;-><init>(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    :try_start_0
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p1}, Lio/reactivex/internal/schedulers/AbstractDirectTask;->setFuture(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :catch_0
    move-exception p1

    .line 48
    invoke-static {p1}, Lv7/d;->q(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lio/reactivex/internal/disposables/EmptyDisposable;->INSTANCE:Lio/reactivex/internal/disposables/EmptyDisposable;

    .line 52
    .line 53
    return-object p1
.end method

.class public Lh7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/concurrent/TimeUnit;


# instance fields
.field public a:I

.field public b:Li7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    sput-object v0, Lh7/c;->c:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Lh7/c;->a:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a()Li7/c;
    .locals 11

    .line 1
    iget-object v0, p0, Lh7/c;->b:Li7/c;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v1, Lh7/c;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v0, p0, Lh7/c;->b:Li7/c;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v2, Li7/c;

    .line 13
    .line 14
    iget v3, p0, Lh7/c;->a:I

    .line 15
    .line 16
    sget-object v7, Lh7/c;->c:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    new-instance v8, Lcom/lzy/okserver/task/PriorityBlockingQueue;

    .line 19
    .line 20
    invoke-direct {v8}, Lcom/lzy/okserver/task/PriorityBlockingQueue;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;

    .line 28
    .line 29
    invoke-direct {v10}, Ljava/util/concurrent/ThreadPoolExecutor$AbortPolicy;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x5

    .line 33
    const-wide/16 v5, 0x1

    .line 34
    .line 35
    invoke-direct/range {v2 .. v10}, Li7/c;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lh7/c;->b:Li7/c;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    monitor-exit v1

    .line 44
    goto :goto_2

    .line 45
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v0

    .line 47
    :cond_1
    :goto_2
    iget-object v0, p0, Lh7/c;->b:Li7/c;

    .line 48
    .line 49
    return-object v0
.end method

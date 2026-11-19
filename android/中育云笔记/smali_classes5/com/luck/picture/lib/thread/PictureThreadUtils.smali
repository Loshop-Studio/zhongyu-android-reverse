.class public abstract Lcom/luck/picture/lib/thread/PictureThreadUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/thread/PictureThreadUtils$e;,
        Lcom/luck/picture/lib/thread/PictureThreadUtils$d;,
        Lcom/luck/picture/lib/thread/PictureThreadUtils$UtilsThreadFactory;,
        Lcom/luck/picture/lib/thread/PictureThreadUtils$LinkedBlockingQueue4Util;,
        Lcom/luck/picture/lib/thread/PictureThreadUtils$f;
    }
.end annotation


# static fields
.field public static final a:Landroid/os/Handler;

.field public static final b:Ljava/util/Map;

.field public static final c:Ljava/util/Map;

.field public static final d:I

.field public static final e:Ljava/util/Timer;

.field public static f:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
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
    sput-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->a:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->b:Ljava/util/Map;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->c:Ljava/util/Map;

    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sput v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d:I

    .line 35
    .line 36
    new-instance v0, Ljava/util/Timer;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->e:Ljava/util/Timer;

    .line 42
    .line 43
    return-void
.end method

.method public static synthetic a()I
    .locals 1

    .line 1
    sget v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic b()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->i()Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic c()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->b()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static e(Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    .line 1
    instance-of v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$f;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->c:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-ne v2, p0, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;

    .line 38
    .line 39
    invoke-static {v1}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->d(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-void

    .line 44
    :cond_2
    const-string p0, "ThreadUtils"

    .line 45
    .line 46
    const-string v0, "The executorService is not ThreadUtils\'s pool."

    .line 47
    .line 48
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static f(Ljava/util/concurrent/ExecutorService;Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V
    .locals 7

    .line 1
    const-wide/16 v4, 0x0

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    invoke-static/range {v0 .. v6}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->g(Ljava/util/concurrent/ExecutorService;Lcom/luck/picture/lib/thread/PictureThreadUtils$e;JJLjava/util/concurrent/TimeUnit;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static g(Ljava/util/concurrent/ExecutorService;Lcom/luck/picture/lib/thread/PictureThreadUtils$e;JJLjava/util/concurrent/TimeUnit;)V
    .locals 3

    .line 1
    sget-object v1, Lcom/luck/picture/lib/thread/PictureThreadUtils;->c:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string p0, "ThreadUtils"

    .line 11
    .line 12
    const-string p1, "Task can only be executed once."

    .line 13
    .line 14
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    monitor-exit v1

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    move-object p0, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {v1, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    cmp-long v2, p4, v0

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    cmp-long p4, p2, v0

    .line 33
    .line 34
    if-nez p4, :cond_1

    .line 35
    .line 36
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    new-instance p4, Lcom/luck/picture/lib/thread/PictureThreadUtils$a;

    .line 41
    .line 42
    invoke-direct {p4, p0, p1}, Lcom/luck/picture/lib/thread/PictureThreadUtils$a;-><init>(Ljava/util/concurrent/ExecutorService;Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->e:Ljava/util/Timer;

    .line 46
    .line 47
    invoke-virtual {p6, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    invoke-virtual {p0, p4, p1, p2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    const/4 v0, 0x1

    .line 56
    invoke-static {p1, v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->a(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;Z)V

    .line 57
    .line 58
    .line 59
    move-object v0, p1

    .line 60
    new-instance p1, Lcom/luck/picture/lib/thread/PictureThreadUtils$b;

    .line 61
    .line 62
    invoke-direct {p1, p0, v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$b;-><init>(Ljava/util/concurrent/ExecutorService;Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->e:Ljava/util/Timer;

    .line 66
    .line 67
    invoke-virtual {p6, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide p2

    .line 71
    invoke-virtual {p6, p4, p5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 72
    .line 73
    .line 74
    move-result-wide p4

    .line 75
    invoke-virtual/range {p0 .. p5}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw p0
.end method

.method public static h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V
    .locals 1

    .line 1
    const/4 v0, -0x4

    .line 2
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->k(I)Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {v0, p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->f(Ljava/util/concurrent/ExecutorService;Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static i()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    sget-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->f:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/luck/picture/lib/thread/PictureThreadUtils$c;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$c;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->f:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->f:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    return-object v0
.end method

.method public static j()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    const/4 v0, -0x4

    .line 2
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->k(I)Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public static k(I)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-static {p0, v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->l(II)Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static l(II)Ljava/util/concurrent/ExecutorService;
    .locals 3

    .line 1
    sget-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->b:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/Map;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, Lcom/luck/picture/lib/thread/PictureThreadUtils$f;->a(II)Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/util/concurrent/ExecutorService;

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    invoke-static {p0, p1}, Lcom/luck/picture/lib/thread/PictureThreadUtils$f;->a(II)Ljava/util/concurrent/ExecutorService;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_0
    monitor-exit v0

    .line 66
    return-object v2

    .line 67
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p0
.end method

.method public static m()Z
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public static n(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/thread/PictureThreadUtils;->a:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

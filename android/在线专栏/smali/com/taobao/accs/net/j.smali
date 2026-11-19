.class public Lcom/taobao/accs/net/j;
.super Lcom/taobao/accs/net/b;
.source "SourceFile"

# interfaces
.implements Lanet/channel/DataFrameCb;
.implements Lanet/channel/ISessionListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/taobao/accs/net/j$a;
    }
.end annotation


# instance fields
.field private n:Z

.field private o:J

.field private p:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private q:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private r:Z

.field private s:Lcom/alibaba/sdk/android/error/ErrorCode;

.field private final t:Lcom/alibaba/sdk/android/logger/ILog;

.field private final u:Ljava/lang/Runnable;

.field private final v:Ljava/lang/Runnable;

.field private final w:Ljava/lang/Runnable;

.field private final x:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;)V
    .locals 8

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/taobao/accs/net/b;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    const/4 p2, 0x1

    .line 2
    iput-boolean p2, p0, Lcom/taobao/accs/net/j;->n:Z

    const-wide/32 v0, 0x36ee80

    .line 3
    iput-wide v0, p0, Lcom/taobao/accs/net/j;->o:J

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/taobao/accs/net/j;->r:Z

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/taobao/accs/net/j;->s:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 6
    new-instance v0, Lcom/taobao/accs/net/k;

    invoke-direct {v0, p0}, Lcom/taobao/accs/net/k;-><init>(Lcom/taobao/accs/net/j;)V

    iput-object v0, p0, Lcom/taobao/accs/net/j;->u:Ljava/lang/Runnable;

    .line 7
    new-instance v0, Lcom/taobao/accs/net/l;

    invoke-direct {v0, p0}, Lcom/taobao/accs/net/l;-><init>(Lcom/taobao/accs/net/j;)V

    iput-object v0, p0, Lcom/taobao/accs/net/j;->v:Ljava/lang/Runnable;

    .line 8
    new-instance v2, Lcom/taobao/accs/net/q;

    invoke-direct {v2, p0}, Lcom/taobao/accs/net/q;-><init>(Lcom/taobao/accs/net/j;)V

    iput-object v2, p0, Lcom/taobao/accs/net/j;->w:Ljava/lang/Runnable;

    .line 9
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/accs/net/j;->x:Ljava/util/Set;

    .line 10
    invoke-virtual {p0}, Lcom/taobao/accs/net/j;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/taobao/accs/utl/AccsLogger;->getLogger(Ljava/lang/Object;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    .line 11
    invoke-static {p2}, Lcom/taobao/accs/utl/OrangeAdapter;->isTnetLogOff(Z)Z

    move-result p2

    if-nez p2, :cond_0

    .line 12
    iget-object p2, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    const-string v1, "inapp"

    invoke-static {p2, v1}, Lcom/taobao/accs/utl/UtilityImpl;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "config tnet log path:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    .line 14
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const/high16 v1, 0x500000

    const/4 v3, 0x5

    .line 15
    invoke-static {p1, p2, v1, v3}, Lanet/channel/Session;->configTnetALog(Landroid/content/Context;Ljava/lang/String;II)V

    .line 16
    :cond_0
    invoke-static {p3}, Lcom/taobao/accs/AccsClientConfig;->getConfigByTag(Ljava/lang/String;)Lcom/taobao/accs/AccsClientConfig;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 17
    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->isChannelLoopStart()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "channel loop start"

    .line 18
    invoke-interface {v0, p2}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v1

    const-wide/32 v3, 0x1d4c0

    .line 20
    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->getLoopInterval()J

    move-result-wide v5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 21
    invoke-virtual/range {v1 .. v7}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :cond_1
    const-string p1, "channel delay start"

    .line 22
    invoke-interface {v0, p1}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    .line 23
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object p1

    const-wide/32 p2, 0x1d4c0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v2, p2, p3, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    return-object p0
.end method

.method private a(ZLcom/alibaba/sdk/android/error/ErrorCode;)V
    .locals 4

    .line 95
    :try_start_0
    iget-object v0, p0, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/taobao/accs/ACCSClient;->getAccsClient(Ljava/lang/String;)Lcom/taobao/accs/ACCSClient;

    move-result-object v0

    .line 96
    invoke-virtual {v0}, Lcom/taobao/accs/ACCSClient;->getConnectionListeners()Ljava/util/List;

    move-result-object v0

    .line 97
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/taobao/accs/ConnectionListener;

    if-eqz p1, :cond_0

    .line 98
    invoke-interface {v1}, Lcom/taobao/accs/ConnectionListener;->onConnect()V

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p2}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v2

    invoke-virtual {p2}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/taobao/accs/ConnectionListener;->onDisconnect(ILjava/lang/String;)V
    :try_end_0
    .catch Lcom/taobao/accs/AccsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 100
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/taobao/accs/net/j;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/taobao/accs/net/j;->o:J

    return-wide v0
.end method

.method static synthetic c(Lcom/taobao/accs/net/j;)V
    .locals 0

    invoke-direct {p0}, Lcom/taobao/accs/net/j;->q()V

    return-void
.end method

.method static synthetic d(Lcom/taobao/accs/net/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/taobao/accs/net/j;->r()V

    return-void
.end method

.method private q()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v0}, Lcom/taobao/accs/AccsClientConfig;->isAccsHeartbeatEnable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v1

    iget-object v2, p0, Lcom/taobao/accs/net/j;->v:Ljava/lang/Runnable;

    iget-wide v5, p0, Lcom/taobao/accs/net/j;->o:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v3, v5

    .line 3
    invoke-virtual/range {v1 .. v7}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/accs/net/j;->p:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method private r()V
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/taobao/accs/net/j;->s()V

    .line 2
    iget-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "startReconnectTask"

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v2

    iget-object v3, p0, Lcom/taobao/accs/net/j;->u:Ljava/lang/Runnable;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x78

    const-wide/16 v6, 0x78

    .line 4
    invoke-virtual/range {v2 .. v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/accs/net/j;->q:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method private s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/j;->q:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 2
    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/taobao/accs/net/j;->q:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "start"

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/taobao/accs/net/j;->n:Z

    .line 4
    iget-object v0, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/taobao/accs/net/j;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected a(Landroid/content/Context;)V
    .locals 4

    .line 57
    :try_start_0
    iget-boolean v0, p0, Lcom/taobao/accs/net/b;->g:Z

    if-eqz v0, :cond_0

    return-void

    .line 58
    :cond_0
    invoke-super {p0, p1}, Lcom/taobao/accs/net/b;->a(Landroid/content/Context;)V

    .line 59
    iget-object p1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->getInappHost()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 60
    invoke-virtual {p0}, Lcom/taobao/accs/net/b;->h()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v1}, Lcom/taobao/accs/AccsClientConfig;->isKeepalive()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    .line 61
    :cond_1
    iget-object v1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v3, "initAwcn close keep alive"

    invoke-interface {v1, v3}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    .line 62
    :goto_0
    iget-object v1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v1}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lanet/channel/SessionCenter;->getInstance(Ljava/lang/String;)Lanet/channel/SessionCenter;

    move-result-object v1

    invoke-virtual {p0, v1, p1, v0}, Lcom/taobao/accs/net/j;->a(Lanet/channel/SessionCenter;Ljava/lang/String;Z)V

    .line 63
    iput-boolean v2, p0, Lcom/taobao/accs/net/b;->g:Z

    .line 64
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v0, "initAwcn success!"

    invoke-interface {p1, v0}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 65
    iget-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "initAwcn"

    invoke-interface {v0, v1, p1}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public a(Lanet/channel/SessionCenter;Ljava/lang/String;Z)V
    .locals 7

    .line 66
    iget-object v0, p0, Lcom/taobao/accs/net/j;->x:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x1

    .line 67
    new-instance v4, Lcom/taobao/accs/net/j$a;

    invoke-direct {v4, p0, p2}, Lcom/taobao/accs/net/j$a;-><init>(Lcom/taobao/accs/net/b;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p2

    move v2, p3

    move-object v6, p0

    invoke-static/range {v1 .. v6}, Lanet/channel/SessionInfo;->create(Ljava/lang/String;ZZLanet/channel/IAuth;Lanet/channel/heartbeat/IHeartbeat;Lanet/channel/DataFrameCb;)Lanet/channel/SessionInfo;

    move-result-object p3

    .line 68
    invoke-virtual {p1, p0}, Lanet/channel/SessionCenter;->registerAccsSessionListener(Lanet/channel/ISessionListener;)V

    .line 69
    iget-object v0, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v0}, Lcom/taobao/accs/AccsClientConfig;->getInappPubKey()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Lanet/channel/SessionCenter;->registerPublicKey(Ljava/lang/String;I)V

    .line 70
    invoke-virtual {p1, p3}, Lanet/channel/SessionCenter;->registerSessionInfo(Lanet/channel/SessionInfo;)V

    .line 71
    iget-object p1, p0, Lcom/taobao/accs/net/j;->x:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 72
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 p3, 0x3

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "registerSessionInfo"

    aput-object v1, p3, v0

    const/4 v0, 0x1

    const-string v1, "host"

    aput-object v1, p3, v0

    const/4 v0, 0x2

    aput-object p2, p3, v0

    invoke-interface {p1, p3}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/taobao/accs/AccsClientConfig;)V
    .locals 7

    const-string v0, "updateConfig"

    if-nez p1, :cond_0

    .line 73
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v0, "updateConfig null"

    invoke-interface {p1, v0}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    return-void

    .line 74
    :cond_0
    iget-object v1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {p1, v1}, Lcom/taobao/accs/AccsClientConfig;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 75
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v0, "updateConfig not any changed"

    invoke-interface {p1, v0}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    return-void

    .line 76
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v4, "old"

    const/4 v5, 0x1

    aput-object v4, v2, v5

    const/4 v4, 0x2

    iget-object v6, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    aput-object v6, v2, v4

    const/4 v4, 0x3

    const-string v6, "new"

    aput-object v6, v2, v4

    const/4 v4, 0x4

    aput-object p1, v2, v4

    invoke-interface {v1, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 77
    iget-object v1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v1}, Lcom/taobao/accs/AccsClientConfig;->getInappHost()Ljava/lang/String;

    move-result-object v1

    .line 78
    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->getInappHost()Ljava/lang/String;

    move-result-object v2

    .line 79
    iget-object v4, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v4}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lanet/channel/SessionCenter;->getInstance(Ljava/lang/String;)Lanet/channel/SessionCenter;

    move-result-object v4

    if-nez v4, :cond_2

    .line 80
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "old session not exist, no need update"

    invoke-interface {p1, v1}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    return-void

    .line 81
    :cond_2
    invoke-virtual {v4, v1}, Lanet/channel/SessionCenter;->unregisterSessionInfo(Ljava/lang/String;)V

    .line 82
    iget-object v6, p0, Lcom/taobao/accs/net/j;->x:Ljava/util/Set;

    invoke-interface {v6, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 83
    iget-object v6, p0, Lcom/taobao/accs/net/j;->x:Ljava/util/Set;

    invoke-interface {v6, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 84
    :cond_3
    iget-object v1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v1}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object v1

    .line 85
    iput-object p1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    .line 86
    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    .line 87
    iget-object p1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->getTag()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    .line 88
    iget-object p1, p0, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 89
    iget-object p1, p0, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    invoke-static {p1}, Lanet/channel/SessionCenter;->getInstance(Ljava/lang/String;)Lanet/channel/SessionCenter;

    move-result-object v4

    .line 90
    :cond_4
    invoke-virtual {p0}, Lcom/taobao/accs/net/b;->h()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {p1}, Lcom/taobao/accs/AccsClientConfig;->isKeepalive()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 v3, 0x1

    goto :goto_0

    .line 91
    :cond_5
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "updateConfig close keepalive"

    invoke-interface {p1, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 92
    :goto_0
    invoke-virtual {p0, v4, v2, v3}, Lcom/taobao/accs/net/j;->a(Lanet/channel/SessionCenter;Ljava/lang/String;Z)V

    .line 93
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "updateConfig done"

    invoke-interface {p1, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 94
    iget-object v1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    invoke-interface {v1, v0, p1}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method protected a(Lcom/taobao/accs/data/Message;Z)V
    .locals 5

    .line 6
    iget-boolean p2, p0, Lcom/taobao/accs/net/j;->n:Z

    if-eqz p2, :cond_6

    if-nez p1, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 p2, 0x1

    .line 7
    :try_start_0
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getSendScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    const/16 v1, 0x3e8

    if-gt v0, v1, :cond_4

    .line 8
    iget-wide v0, p1, Lcom/taobao/accs/data/Message;->Q:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    const-wide/16 v0, 0x1

    .line 9
    :cond_1
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getSendScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v2

    new-instance v3, Lcom/taobao/accs/net/m;

    invoke-direct {v3, p0, p1}, Lcom/taobao/accs/net/m;-><init>(Lcom/taobao/accs/net/j;Lcom/taobao/accs/data/Message;)V

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    invoke-virtual {v2, v3, v0, v1, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->a()I

    move-result v1

    if-ne v1, p2, :cond_3

    iget-object v1, p1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 13
    iget-object v1, p1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/taobao/accs/net/j;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 14
    iget-object v1, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {v1, p1}, Lcom/taobao/accs/data/d;->b(Lcom/taobao/accs/data/Message;)V

    .line 15
    :cond_2
    iget-object v1, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    iget-object v1, v1, Lcom/taobao/accs/data/d;->a:Ljava/util/concurrent/ConcurrentMap;

    iget-object v2, p1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_3
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 17
    iget-object v1, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    .line 18
    invoke-static {v1}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setDeviceId(Ljava/lang/String;)V

    .line 20
    iget v1, p0, Lcom/taobao/accs/net/b;->c:I

    invoke-virtual {v0, v1}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setConnType(I)V

    .line 21
    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onEnterQueueData()V

    goto :goto_0

    .line 22
    :cond_4
    new-instance v0, Ljava/util/concurrent/RejectedExecutionException;

    const-string v1, "accs"

    invoke-direct {v0, v1}, Ljava/util/concurrent/RejectedExecutionException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p2

    .line 23
    iget-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "send error"

    invoke-interface {v0, v1, p2}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    iget-object v0, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->SEND_LOCAL_EXCEPTION:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 25
    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    invoke-static {p2}, Lcom/taobao/accs/AccsErrorCode;->getExceptionInfo(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p2

    .line 26
    invoke-virtual {p2}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p2

    .line 27
    invoke-virtual {v0, p1, p2}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    goto :goto_0

    .line 28
    :catch_0
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getSendScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    .line 29
    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->MESSAGE_QUEUE_FULL:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inapp "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {v1, p1, v0}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 32
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "send queue full"

    aput-object v3, v1, v2

    const-string v2, "err"

    aput-object v2, v1, p2

    const/4 p2, 0x2

    aput-object v0, v1, p2

    invoke-interface {p1, v1}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    :cond_5
    :goto_0
    return-void

    .line 33
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "not running or msg null! "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/taobao/accs/net/j;->n:Z

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/alibaba/sdk/android/logger/ILog;->w(Ljava/lang/String;)V

    return-void
.end method

.method protected a(Ljava/lang/String;ZJ)V
    .locals 7

    .line 34
    new-instance v6, Lcom/taobao/accs/net/n;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p3

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/taobao/accs/net/n;-><init>(Lcom/taobao/accs/net/j;Ljava/lang/String;JZ)V

    .line 35
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object p1

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v6, p3, p4, p2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method protected a(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 2

    .line 36
    :try_start_0
    iget-object p3, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {p3, p1}, Lcom/taobao/accs/data/d;->b(Ljava/lang/String;)Lcom/taobao/accs/data/Message;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 37
    iget-object p3, p1, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    if-eqz p3, :cond_1

    .line 38
    iget-object p3, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {p3}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lanet/channel/SessionCenter;->getInstance(Ljava/lang/String;)Lanet/channel/SessionCenter;

    move-result-object p3

    iget-object p1, p1, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    .line 39
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object p1

    const-wide/16 v0, 0x0

    .line 40
    invoke-virtual {p3, p1, v0, v1}, Lanet/channel/SessionCenter;->get(Ljava/lang/String;J)Lanet/channel/Session;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p3, 0x1

    if-eqz p2, :cond_0

    .line 41
    invoke-virtual {p1, p3}, Lanet/channel/Session;->close(Z)V

    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p1, p3}, Lanet/channel/Session;->ping(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 43
    iget-object p2, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p3, "onTimeOut"

    invoke-interface {p2, p3, p1}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 13

    if-nez p1, :cond_0

    .line 47
    iget-object p1, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v0, "onReceiveAccsHeartbeatResp response data is null"

    invoke-interface {p1, v0}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    return-void

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "onReceiveAccsHeartbeatResp"

    aput-object v3, v1, v2

    const-string v2, "data"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    :try_start_0
    const-string v0, "timeInterval"

    .line 49
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 50
    iget-object p1, p0, Lcom/taobao/accs/net/j;->p:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p1, :cond_3

    .line 51
    invoke-interface {p1, v4}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    goto :goto_0

    .line 52
    :cond_1
    iget-wide v0, p0, Lcom/taobao/accs/net/j;->o:J

    mul-int/lit16 v2, p1, 0x3e8

    int-to-long v4, v2

    cmp-long v2, v0, v4

    if-eqz v2, :cond_3

    if-nez p1, :cond_2

    const-wide/32 v4, 0x36ee80

    .line 53
    :cond_2
    iput-wide v4, p0, Lcom/taobao/accs/net/j;->o:J

    .line 54
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v6

    iget-object v7, p0, Lcom/taobao/accs/net/j;->v:Ljava/lang/Runnable;

    iget-wide v10, p0, Lcom/taobao/accs/net/j;->o:J

    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v8, v10

    .line 55
    invoke-virtual/range {v6 .. v12}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/taobao/accs/net/j;->p:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 56
    iget-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    invoke-interface {v0, v3, p1}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public a(ZZ)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 44
    :cond_0
    iget-object v1, p0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    iget-object v1, v1, Lcom/taobao/accs/data/d;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_1

    .line 45
    invoke-interface {v1, v0}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 46
    iget-object v2, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "cancel"

    aput-object v4, v3, v0

    const/4 v0, 0x1

    const-string v4, "customDataId"

    aput-object v4, v3, v0

    const/4 v0, 0x2

    aput-object p1, v3, v0

    invoke-interface {v2, v3}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    :cond_2
    return v1
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/taobao/accs/net/b;->f:I

    return-void
.end method

.method public c()Lcom/taobao/accs/ut/a/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected d()Ljava/lang/String;
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InAppConn_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "shut down"

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/taobao/accs/net/j;->n:Z

    return-void
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/taobao/accs/net/j;->r:Z

    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/j;->s:Lcom/alibaba/sdk/android/error/ErrorCode;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public n()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v0}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lanet/channel/SessionCenter;->getInstance(Ljava/lang/String;)Lanet/channel/SessionCenter;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v1}, Lcom/taobao/accs/AccsClientConfig;->getInappHost()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lanet/channel/SessionCenter;->unregisterSessionInfo(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/taobao/accs/net/j;->x:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/taobao/accs/net/j;->x:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "reconnect begin"

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/taobao/accs/net/b;->g:Z

    .line 3
    iget-object v0, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/taobao/accs/net/j;->a(Landroid/content/Context;)V

    .line 4
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getSendScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/taobao/accs/net/r;

    invoke-direct {v1, p0}, Lcom/taobao/accs/net/r;-><init>(Lcom/taobao/accs/net/j;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onConnectionChanged(Landroid/content/Intent;)V
    .locals 8

    const-string v0, "connect_avail"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "host"

    .line 2
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {p1}, Lcom/taobao/accs/common/Constants;->getErrorCode(Landroid/content/Intent;)Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p1

    .line 4
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-nez v0, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v5

    sget-object v6, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v6}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v6

    if-ne v5, v6, :cond_1

    .line 6
    iget-object p1, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/taobao/accs/utl/UtilityImpl;->g(Landroid/content/Context;)Z

    move-result p1

    const-string v5, "lost connect"

    if-eqz p1, :cond_0

    .line 7
    sget-object p1, Lcom/taobao/accs/AccsErrorCode;->INAPP_CON_DISCONNECTED:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p1

    .line 8
    invoke-static {v5}, Lcom/taobao/accs/AccsErrorCode;->getAllDetails(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 9
    invoke-virtual {p1, v5}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p1

    goto :goto_0

    .line 11
    :cond_0
    sget-object p1, Lcom/taobao/accs/AccsErrorCode;->NO_NETWORK:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p1

    .line 12
    invoke-static {v5}, Lcom/taobao/accs/AccsErrorCode;->getAllDetails(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 13
    invoke-virtual {p1, v5}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object p1

    .line 15
    :cond_1
    :goto_0
    iget-object v5, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "InAppConnection Not Available "

    aput-object v7, v6, v1

    const-string v1, "error"

    aput-object v1, v6, v3

    aput-object p1, v6, v4

    invoke-interface {v5, v6}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    .line 16
    invoke-direct {p0}, Lcom/taobao/accs/net/j;->r()V

    goto :goto_1

    .line 17
    :cond_2
    iget-object v5, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    new-array v4, v4, [Ljava/lang/Object;

    const-string v6, "InAppConnection Available. last status"

    aput-object v6, v4, v1

    iget-boolean v1, p0, Lcom/taobao/accs/net/j;->r:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v4, v3

    invoke-interface {v5, v4}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 18
    invoke-direct {p0}, Lcom/taobao/accs/net/j;->s()V

    .line 19
    iget-boolean v1, p0, Lcom/taobao/accs/net/j;->r:Z

    if-nez v1, :cond_3

    .line 20
    iget-object v1, p0, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/taobao/accs/net/b;->b(Landroid/content/Context;)V

    .line 21
    :cond_3
    :goto_1
    iput-boolean v0, p0, Lcom/taobao/accs/net/j;->r:Z

    .line 22
    iput-object p1, p0, Lcom/taobao/accs/net/j;->s:Lcom/alibaba/sdk/android/error/ErrorCode;

    const-string v1, "a"

    const-string v3, "h"

    const-string v4, "cc"

    if-eqz p1, :cond_4

    .line 23
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v5

    sget-object v6, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v6}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v6

    if-eq v5, v6, :cond_4

    .line 24
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "c"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 26
    invoke-virtual {v5, v4, v1}, Lcom/taobao/accs/AccsState;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object v1

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "re"

    invoke-virtual {v1, v3, v2}, Lcom/taobao/accs/AccsState;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    .line 28
    :cond_4
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v4, v1}, Lcom/taobao/accs/AccsState;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    :goto_2
    invoke-direct {p0, v0, p1}, Lcom/taobao/accs/net/j;->a(ZLcom/alibaba/sdk/android/error/ErrorCode;)V

    :cond_5
    return-void
.end method

.method public onDataReceive(Lanet/channel/session/TnetSpdySession;[BII)V
    .locals 8

    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    new-instance v7, Lcom/taobao/accs/net/o;

    move-object v1, v7

    move-object v2, p0

    move v3, p4

    move v4, p3

    move-object v5, p2

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/taobao/accs/net/o;-><init>(Lcom/taobao/accs/net/j;II[BLanet/channel/session/TnetSpdySession;)V

    invoke-virtual {v0, v7}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onException(IIZLjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/net/j;->t:Lcom/alibaba/sdk/android/logger/ILog;

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "onException"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "dataId"

    aput-object v3, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    const-string v3, "errorId"

    aput-object v3, v1, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    const-string v3, "needRetry"

    aput-object v3, v1, v2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    const-string v3, "detail"

    aput-object v3, v1, v2

    const/16 v2, 0x8

    aput-object p4, v1, v2

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    new-instance v7, Lcom/taobao/accs/net/p;

    move-object v1, v7

    move-object v2, p0

    move v3, p2

    move-object v4, p4

    move v5, p1

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/taobao/accs/net/p;-><init>(Lcom/taobao/accs/net/j;ILjava/lang/String;IZ)V

    invoke-virtual {v0, v7}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

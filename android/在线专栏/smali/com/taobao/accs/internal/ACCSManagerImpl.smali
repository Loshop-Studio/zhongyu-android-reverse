.class public Lcom/taobao/accs/internal/ACCSManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/taobao/accs/IACCSManager;


# instance fields
.field public a:Lcom/taobao/accs/net/b;

.field private b:I

.field private c:Z

.field private final d:Ljava/lang/String;

.field private final e:Lcom/alibaba/sdk/android/logger/ILog;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    .line 3
    iput-boolean v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->c:Z

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/taobao/accs/client/GlobalClientInfo;->a:Landroid/content/Context;

    .line 5
    new-instance v1, Lcom/taobao/accs/net/j;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2, p2}, Lcom/taobao/accs/net/j;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    iput-object v1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    .line 6
    iput-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->d:Ljava/lang/String;

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ACCSMgrImpl_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iget-object v1, v1, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/taobao/accs/utl/AccsLogger;->getLogger(Ljava/lang/Object;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    .line 9
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/taobao/accs/internal/a;

    invoke-direct {v1, p0, p2, p1}, Lcom/taobao/accs/internal/a;-><init>(Lcom/taobao/accs/internal/ACCSManagerImpl;Ljava/lang/String;Landroid/content/Context;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x40

    invoke-virtual {v0, v1, v2, v3, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method private a(Landroid/content/Context;I)Landroid/content/Intent;
    .locals 3

    .line 47
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.taobao.accs.intent.action.COMMAND"

    .line 48
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/taobao/accs/utl/AdapterUtilityImpl;->channelService:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "packageName"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "command"

    .line 51
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 52
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iget-object p1, p1, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    const-string p2, "appKey"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 53
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->d:Ljava/lang/String;

    const-string p2, "configTag"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method private a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 54
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.taobao.accs.intent.action.RECEIVE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "command"

    .line 56
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "serviceId"

    .line 57
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p3, "dataId"

    .line 58
    invoke-virtual {v0, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iget-object p3, p3, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    const-string p4, "appKey"

    invoke-virtual {v0, p4, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 60
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->d:Ljava/lang/String;

    const-string p4, "configTag"

    invoke-virtual {v0, p4, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p3, 0x2

    if-ne p2, p3, :cond_0

    .line 61
    sget-object p2, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/taobao/accs/AccsErrorCode;->APP_NOT_BIND:Lcom/alibaba/sdk/android/error/ErrorCode;

    :goto_0
    const-string p3, "errorObj"

    invoke-virtual {v0, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 62
    invoke-static {p1, v0}, Lcom/taobao/accs/data/g;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method private a(Landroid/content/Context;Lcom/taobao/accs/data/Message;IZ)V
    .locals 5

    .line 25
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->a()V

    if-nez p2, :cond_0

    .line 26
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p4, "message is null"

    invoke-interface {p2, p4}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    .line 28
    invoke-static {p1, p3}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object p1

    .line 29
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    sget-object p3, Lcom/taobao/accs/AccsErrorCode;->PARAMETER_ERROR:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p2, p1, p3}, Lcom/taobao/accs/net/b;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    goto/16 :goto_3

    :cond_0
    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p3, v1, :cond_2

    if-eq p3, p1, :cond_1

    goto :goto_1

    .line 30
    :cond_1
    iget-object p4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p4}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object p4

    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Lcom/taobao/accs/client/c;->e(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_5

    .line 31
    iget-object p4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v2, "unbind app, already unbind"

    invoke-interface {p4, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 32
    iget-object p4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    sget-object v2, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p4, p2, v2}, Lcom/taobao/accs/net/b;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    :goto_0
    const/4 p4, 0x0

    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->f()Ljava/lang/String;

    move-result-object v2

    .line 34
    iget-object v3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v3}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/taobao/accs/client/c;->d(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez p4, :cond_3

    .line 35
    iget-object p4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v2, "bind app from cache"

    invoke-interface {p4, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 36
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object p4

    iget-object v2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->d:Ljava/lang/String;

    .line 37
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v4, "bfc"

    .line 38
    invoke-virtual {p4, v2, v4, v3}, Lcom/taobao/accs/AccsState;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    iget-object p4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    sget-object v2, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p4, p2, v2}, Lcom/taobao/accs/net/b;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    goto :goto_0

    .line 40
    :cond_3
    iget-object v3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v3}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/taobao/accs/client/c;->f(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-nez p4, :cond_4

    goto :goto_0

    .line 41
    :cond_4
    iget-object p4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p4}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object p4

    invoke-virtual {p4, v2}, Lcom/taobao/accs/client/c;->c(Ljava/lang/String;)V

    :cond_5
    :goto_1
    const/4 p4, 0x1

    :goto_2
    if-eqz p4, :cond_6

    .line 42
    iget-object p4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendControlMessage"

    aput-object v3, v2, v0

    const-string v0, "command"

    aput-object v0, v2, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v2, p1

    invoke-interface {p4, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 43
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p1, p2, v1}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    :cond_6
    :goto_3
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object v1

    .line 4
    :try_start_0
    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/taobao/accs/client/GlobalClientInfo;->getPackageInfo()Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/taobao/accs/utl/UtilityImpl;->c(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "EMAS_ACCS_SDK"

    .line 6
    invoke-static {v3, p1}, Lcom/taobao/accs/utl/UtilityImpl;->utdidChanged(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_2

    .line 7
    iget-object v4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v5, "force bindApp"

    invoke-interface {v4, v5}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    const-string v4, "fouce_bind"

    .line 8
    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_2
    const-string v4, "appKey"

    .line 9
    invoke-virtual {v1, v4, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "ttid"

    .line 10
    invoke-virtual {v1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "appVersion"

    .line 11
    invoke-virtual {v1, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "app_sercet"

    .line 12
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iget-object p3, p3, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {p3}, Lcom/taobao/accs/AccsClientConfig;->getAppSecret()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 14
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-static {p2, p1, v1}, Lcom/taobao/accs/data/Message;->a(Lcom/taobao/accs/net/b;Landroid/content/Context;Landroid/content/Intent;)Lcom/taobao/accs/data/Message;

    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p3

    if-eqz p3, :cond_4

    .line 16
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p3

    iget-object v1, p2, Lcom/taobao/accs/data/Message;->q:Ljava/lang/String;

    invoke-virtual {p3, v1}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setDataId(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p3

    invoke-virtual {p3, v0}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setMsgType(I)V

    .line 18
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p3

    iget-object v1, p2, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    if-eqz v1, :cond_3

    .line 19
    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    const-string v1, ""

    .line 20
    :goto_2
    invoke-virtual {p3, v1}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setHost(Ljava/lang/String;)V

    .line 21
    :cond_4
    invoke-direct {p0, p1, p2, v0, v3}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;Lcom/taobao/accs/data/Message;IZ)V

    goto :goto_3

    .line 22
    :cond_5
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p3, "bindApp only allow in target process"

    invoke-interface {p2, p3}, Lcom/alibaba/sdk/android/logger/ILog;->w(Ljava/lang/String;)V

    .line 23
    :goto_3
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/taobao/accs/net/b;->b(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p1

    .line 24
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p3, "bindApp exception"

    invoke-interface {p2, p3, p1}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    return-void
.end method

.method static synthetic a(Lcom/taobao/accs/internal/ACCSManagerImpl;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Landroid/content/Context;)Z
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object v0

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    .line 46
    invoke-virtual {v0, p1}, Lcom/taobao/accs/client/c;->d(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method static synthetic a(Lcom/taobao/accs/internal/ACCSManagerImpl;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->c:Z

    return p0
.end method


# virtual methods
.method public bindApp(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/accs/IAppReceiver;)V
    .locals 6

    const-string v3, "accs"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/taobao/accs/internal/ACCSManagerImpl;->bindApp(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/accs/IAppReceiver;)V

    return-void
.end method

.method public bindApp(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/accs/IAppReceiver;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p3, 0x1

    .line 2
    iput-boolean p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->c:Z

    .line 3
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "bindApp"

    aput-object v3, v1, v2

    const-string v2, "appKey"

    aput-object v2, v1, p3

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->d([Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object p3

    .line 5
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v0}, Lcom/taobao/accs/AccsClientConfig;->getAppSecret()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p2, "isSecurityOff and null secret"

    invoke-interface {p1, p2}, Lcom/alibaba/sdk/android/logger/ILog;->w(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    sget-object p2, Lcom/taobao/accs/AccsErrorCode;->APPSECRET_NULL:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p1, p3, p2}, Lcom/taobao/accs/net/b;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    return-void

    .line 8
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p2, "appKey is null"

    invoke-interface {p1, p2}, Lcom/alibaba/sdk/android/logger/ILog;->w(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    sget-object p2, Lcom/taobao/accs/AccsErrorCode;->APPKEY_NULL:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p1, p3, p2}, Lcom/taobao/accs/net/b;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    return-void

    .line 11
    :cond_2
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iput-object p4, p3, Lcom/taobao/accs/net/b;->a:Ljava/lang/String;

    .line 12
    iput-object p2, p3, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    .line 13
    iget-object p3, p3, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {p3}, Lcom/taobao/accs/AccsClientConfig;->getAppSecret()Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/taobao/accs/utl/UtilityImpl;->e(Landroid/content/Context;Ljava/lang/String;)V

    if-eqz p5, :cond_3

    .line 14
    invoke-static {}, Lcom/taobao/accs/client/a;->a()Lcom/taobao/accs/client/a;

    move-result-object p3

    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->d:Ljava/lang/String;

    .line 15
    invoke-static {p5}, Lcom/taobao/accs/utl/c;->a(Lcom/taobao/accs/IAppReceiver;)Lcom/taobao/accs/IAppReceiver;

    move-result-object p5

    .line 16
    invoke-virtual {p3, v0, p5}, Lcom/taobao/accs/client/a;->a(Ljava/lang/String;Lcom/taobao/accs/IAppReceiver;)V

    .line 17
    :cond_3
    invoke-direct {p0, p1, p2, p4}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bindService(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v1, 0x3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "bindService"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    const-string v5, "serviceId"

    aput-object v5, v2, v3

    const/4 v3, 0x2

    aput-object p2, v2, v3

    invoke-interface {v0, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;)Z

    move-result v0

    const/4 v2, 0x5

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v2, p2, v0}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-direct {p0, p1, v2}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object v0

    .line 5
    iget-object v3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v3}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 7
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p2, "appKey null"

    invoke-interface {p1, p2}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v6, "appKey"

    .line 8
    invoke-virtual {v0, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    invoke-virtual {v0, v5, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 10
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 11
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-static {p2, v0}, Lcom/taobao/accs/data/Message;->b(Lcom/taobao/accs/net/b;Landroid/content/Intent;)Lcom/taobao/accs/data/Message;

    move-result-object p2

    .line 12
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 13
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    iget-object v3, p2, Lcom/taobao/accs/data/Message;->q:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setDataId(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setMsgType(I)V

    .line 15
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    iget-object v1, p2, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    if-eqz v1, :cond_2

    .line 16
    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setHost(Ljava/lang/String;)V

    .line 18
    :cond_3
    invoke-direct {p0, p1, p2, v2, v4}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;Lcom/taobao/accs/data/Message;IZ)V

    goto :goto_1

    .line 19
    :cond_4
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v0, "bindService not target process, ignored"

    invoke-interface {p2, v0}, Lcom/alibaba/sdk/android/logger/ILog;->w(Ljava/lang/String;)V

    .line 20
    :goto_1
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/taobao/accs/net/b;->b(Landroid/content/Context;)V

    return-void
.end method

.method public bindUser(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/taobao/accs/internal/ACCSManagerImpl;->bindUser(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public bindUser(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 8

    const-string v0, "bindUser"

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const-string v3, "userId"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object p2, v2, v3

    const-string v5, "force"

    const/4 v6, 0x3

    aput-object v5, v2, v6

    const/4 v5, 0x4

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    aput-object v7, v2, v5

    invoke-interface {v1, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p2, 0x0

    .line 4
    invoke-direct {p0, p1, v6, p2, p2}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    invoke-direct {p0, p1, v6}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object v1

    .line 6
    iget-object v2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v2}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 8
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p2, "appkey null"

    invoke-interface {p1, p2}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    return-void

    .line 9
    :cond_1
    invoke-static {p1}, Lcom/taobao/accs/utl/UtilityImpl;->c(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz p3, :cond_3

    .line 10
    :cond_2
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v5, "force bind user"

    invoke-interface {p3, v5}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    const-string p3, "fouce_bind"

    .line 11
    invoke-virtual {v1, p3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/4 p3, 0x1

    :cond_3
    const-string v4, "appKey"

    .line 12
    invoke-virtual {v1, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "userInfo"

    .line 13
    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 15
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-static {p2, v1}, Lcom/taobao/accs/data/Message;->d(Lcom/taobao/accs/net/b;Landroid/content/Intent;)Lcom/taobao/accs/data/Message;

    move-result-object p2

    .line 16
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 17
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v1

    iget-object v2, p2, Lcom/taobao/accs/data/Message;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setDataId(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setMsgType(I)V

    .line 19
    invoke-virtual {p2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v1

    iget-object v2, p2, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    if-eqz v2, :cond_4

    .line 20
    invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    const-string v2, ""

    .line 21
    :goto_0
    invoke-virtual {v1, v2}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setHost(Ljava/lang/String;)V

    .line 22
    :cond_5
    invoke-direct {p0, p1, p2, v6, p3}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;Lcom/taobao/accs/data/Message;IZ)V

    goto :goto_1

    .line 23
    :cond_6
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p3, "bindUser not target process, ignored"

    invoke-interface {p2, p3}, Lcom/alibaba/sdk/android/logger/ILog;->w(Ljava/lang/String;)V

    .line 24
    :goto_1
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/taobao/accs/net/b;->b(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 25
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    invoke-interface {p2, v0, p1}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public cancel(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p1, p2}, Lcom/taobao/accs/net/b;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public cleanLocalBindInfo()V
    .locals 1

    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/client/c;->a()V

    return-void
.end method

.method public clearLoginInfo(Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->clearLoginInfoImpl()V

    return-void
.end method

.method public disconnect()V
    .locals 1

    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->n()V

    return-void
.end method

.method public forceDisableService(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public forceEnableService(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public forceReConnectChannel()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v0}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lanet/channel/SessionCenter;->getInstance(Ljava/lang/String;)Lanet/channel/SessionCenter;

    move-result-object v0

    invoke-virtual {v0}, Lanet/channel/SessionCenter;->forceRecreateAccsSession()V

    .line 2
    invoke-virtual {p0}, Lcom/taobao/accs/internal/ACCSManagerImpl;->getChannelState()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getChannelState()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 3
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iget-object v2, v2, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {v2}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lanet/channel/SessionCenter;->getInstance(Ljava/lang/String;)Lanet/channel/SessionCenter;

    move-result-object v2

    const-wide/32 v3, 0xea60

    .line 5
    invoke-virtual {v2, v0, v3, v4}, Lanet/channel/SessionCenter;->getThrowsException(Ljava/lang/String;J)Lanet/channel/Session;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 6
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "getChannelState"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-interface {v0, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    return-object v1
.end method

.method public getLastConnectErrorCode()I
    .locals 1

    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->m()I

    move-result v0

    return v0
.end method

.method public getUserUnit()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isChannelError(I)Z
    .locals 0

    invoke-static {p1}, Lcom/taobao/accs/AccsErrorCode;->isChannelError(I)Z

    move-result p1

    return p1
.end method

.method public isConnected()Z
    .locals 1

    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->l()Z

    move-result v0

    return v0
.end method

.method public isNetworkReachable(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lcom/taobao/accs/utl/UtilityImpl;->g(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public reconnect()V
    .locals 1

    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->o()V

    return-void
.end method

.method public registerDataListener(Landroid/content/Context;Ljava/lang/String;Lcom/taobao/accs/base/AccsAbstractDataListener;)V
    .locals 0

    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/taobao/accs/client/GlobalClientInfo;->registerListener(Ljava/lang/String;Lcom/taobao/accs/base/AccsAbstractDataListener;)V

    return-void
.end method

.method public registerService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/taobao/accs/client/GlobalClientInfo;->registerService(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public reset()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->p()V

    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lcom/taobao/accs/client/GlobalClientInfo;->a:Landroid/content/Context;

    const-string v2, "EMAS_ACCS_SDK"

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 4
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 5
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 7
    :goto_0
    invoke-static {}, Lcom/taobao/accs/client/a;->a()Lcom/taobao/accs/client/a;

    move-result-object v1

    iget-object v2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/taobao/accs/client/a;->b(Ljava/lang/String;)V

    .line 8
    iput-boolean v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->c:Z

    return-void
.end method

.method public sendBusinessAck(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;SLjava/lang/String;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "S",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->a()V

    .line 2
    iget-object v1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    const/4 v5, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-static/range {v1 .. v8}, Lcom/taobao/accs/data/Message;->a(Lcom/taobao/accs/net/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZSLjava/lang/String;Ljava/util/Map;)Lcom/taobao/accs/data/Message;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    const/4 p3, 0x1

    invoke-virtual {p2, p1, p3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    return-void
.end method

.method public sendData(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;)Ljava/lang/String;
    .locals 10

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 5
    :try_start_0
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    .line 6
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v4, "sendData not in target process"

    invoke-interface {p1, v4}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    return-object v5

    :cond_0
    if-nez p2, :cond_1

    const-string p1, "accs"

    const-string v4, "send_fail"

    const-string v6, ""

    const-string v7, "1"

    const-string v8, "data null"

    .line 7
    invoke-static {p1, v4, v6, v7, v8}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v4, "sendData dataInfo null"

    invoke-interface {p1, v4}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    return-object v5

    .line 9
    :cond_1
    iget-object v4, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 10
    const-class v4, Lcom/taobao/accs/internal/ACCSManagerImpl;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    iget v6, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    add-int/2addr v6, v3

    iput v6, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    .line 12
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget v7, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    .line 13
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1

    .line 14
    :cond_2
    :goto_0
    iget-object v4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v4}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string p1, "accs"

    const-string v4, "send_fail"

    .line 16
    iget-object v6, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->serviceId:Ljava/lang/String;

    const-string v7, "1"

    const-string v8, "data appkey null"

    invoke-static {p1, v4, v6, v7, v8}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    new-array v4, v0, [Ljava/lang/Object;

    const-string v6, "sendData appkey null"

    aput-object v6, v4, v2

    const-string v6, "dataId"

    aput-object v6, v4, v3

    iget-object v6, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    aput-object v6, v4, v1

    invoke-interface {p1, v4}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    return-object v5

    .line 18
    :cond_3
    iget-object v4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v4}, Lcom/taobao/accs/net/b;->a()V

    .line 19
    iget-object v4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, p1, v5, p2}, Lcom/taobao/accs/data/Message;->a(Lcom/taobao/accs/net/b;Landroid/content/Context;Ljava/lang/String;Lcom/taobao/accs/ACCSManager$AccsRequest;)Lcom/taobao/accs/data/Message;

    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 21
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v4

    invoke-virtual {v4}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onSend()V

    .line 22
    :cond_4
    iget-object v4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v4, p1, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    const-string v4, "accs"

    const-string v5, "send_fail"

    .line 23
    iget-object v6, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->serviceId:Ljava/lang/String;

    const-string v7, "1"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "data "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 25
    invoke-static {v4, v5, v6, v7, v8}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iget-object v4, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "sendData"

    aput-object v6, v5, v2

    const-string v2, "dataId"

    aput-object v2, v5, v3

    iget-object v2, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    aput-object v2, v5, v1

    aput-object p1, v5, v0

    invoke-interface {v4, v5}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    .line 27
    :goto_1
    iget-object p1, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    return-object p1
.end method

.method public sendData(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/taobao/accs/internal/ACCSManagerImpl;->sendData(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public sendData(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 2
    invoke-virtual/range {v0 .. v7}, Lcom/taobao/accs/internal/ACCSManagerImpl;->sendData(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public sendData(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/String;
    .locals 9

    .line 3
    new-instance v8, Lcom/taobao/accs/ACCSManager$AccsRequest;

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v7}, Lcom/taobao/accs/ACCSManager$AccsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    .line 4
    invoke-virtual {p0, p1, v8}, Lcom/taobao/accs/internal/ACCSManagerImpl;->sendData(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public sendPushResponse(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)Ljava/lang/String;
    .locals 11

    const/4 v0, 0x5

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    :try_start_0
    const-string v7, "accs"

    const-string v8, "send_fail"

    const-string v9, "push response total"

    .line 1
    invoke-static {v7, v8, v9}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmSuccess(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v7, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v7}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v7

    .line 3
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string p1, "accs"

    const-string p3, "send_fail"

    .line 4
    iget-object v0, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->serviceId:Ljava/lang/String;

    const-string v7, "1"

    const-string v8, "sendPushResponse appkey null"

    invoke-static {p1, p3, v0, v7, v8}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    new-array p3, v3, [Ljava/lang/Object;

    const-string v0, "sendPushResponse appkey null"

    aput-object v0, p3, v5

    const-string v0, "dataid"

    aput-object v0, p3, v6

    iget-object v0, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    aput-object v0, p3, v4

    invoke-interface {p1, p3}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    return-object v2

    .line 6
    :cond_1
    iget-object v7, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 7
    const-class v7, Lcom/taobao/accs/internal/ACCSManagerImpl;

    monitor-enter v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    :try_start_1
    iget v8, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    add-int/2addr v8, v6

    iput v8, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    .line 9
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget v9, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ""

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    iput-object v8, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    .line 10
    monitor-exit v7

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1

    :cond_2
    :goto_0
    if-nez p3, :cond_3

    .line 11
    new-instance p3, Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;

    invoke-direct {p3}, Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;-><init>()V

    .line 12
    :cond_3
    iput-object v2, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->host:Ljava/net/URL;

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p3, Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;->fromPackage:Ljava/lang/String;

    .line 14
    iget-object v8, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v9, 0x7

    new-array v9, v9, [Ljava/lang/Object;

    const-string v10, "sendPushResponse"

    aput-object v10, v9, v5

    const-string v10, "host"

    aput-object v10, v9, v6

    iget-object v10, p3, Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;->fromHost:Ljava/lang/String;

    aput-object v10, v9, v4

    const-string v10, "pkg"

    aput-object v10, v9, v3

    aput-object v7, v9, v1

    const-string v7, "dataId"

    aput-object v7, v9, v0

    const/4 v0, 0x6

    iget-object v7, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    aput-object v7, v9, v0

    invoke-interface {v8, v9}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object p3, p3, Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;->fromPackage:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 16
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, v6}, Lcom/taobao/accs/internal/ACCSManagerImpl;->sendRequest(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;Ljava/lang/String;Z)Ljava/lang/String;

    goto :goto_2

    .line 18
    :cond_4
    :goto_1
    iget-object v7, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    new-array v0, v0, [Ljava/lang/Object;

    const-string v8, "sendPushResponse input null"

    aput-object v8, v0, v5

    aput-object p1, v0, v6

    aput-object p2, v0, v4

    const-string p1, "extraInfo"

    aput-object p1, v0, v3

    aput-object p3, v0, v1

    invoke-interface {v7, v0}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    const-string p1, "accs"

    const-string p3, "send_fail"

    const-string v0, ""

    const-string v7, "1"

    const-string v8, "sendPushResponse null"

    .line 19
    invoke-static {p1, p3, v0, v7, v8}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v2

    :catchall_1
    move-exception p1

    const-string p3, "accs"

    const-string v0, "send_fail"

    .line 20
    iget-object v7, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->serviceId:Ljava/lang/String;

    const-string v8, "1"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "push response "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 22
    invoke-static {p3, v0, v7, v8, v9}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "sendPushResponse"

    aput-object v1, v0, v5

    const-string v1, "dataId"

    aput-object v1, v0, v6

    iget-object p2, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    aput-object p2, v0, v4

    aput-object p1, v0, v3

    invoke-interface {p3, v0}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    :cond_5
    :goto_2
    return-object v2
.end method

.method public sendRequest(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 28
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/taobao/accs/internal/ACCSManagerImpl;->sendRequest(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public sendRequest(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 11

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez p2, :cond_0

    .line 4
    :try_start_0
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p3, "sendRequest request null"

    invoke-interface {p1, p3}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    const-string p1, "accs"

    const-string p3, "send_fail"

    const-string p4, "1"

    const-string v5, "request null"

    .line 5
    invoke-static {p1, p3, v3, p4, v5}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    .line 6
    :cond_0
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 7
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p3, "sendRequest not in target process"

    invoke-interface {p1, p3}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    return-object v3

    .line 8
    :cond_1
    iget-object v5, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 9
    const-class v5, Lcom/taobao/accs/internal/ACCSManagerImpl;

    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    :try_start_1
    iget v6, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    add-int/2addr v6, v4

    iput v6, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    .line 11
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget v7, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->b:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    .line 12
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1

    .line 13
    :cond_2
    :goto_0
    iget-object v5, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v5}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v5

    .line 14
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string p1, "accs"

    const-string p3, "send_fail"

    .line 15
    iget-object p4, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->serviceId:Ljava/lang/String;

    const-string v5, "1"

    const-string v6, "request appkey null"

    invoke-static {p1, p3, p4, v5, v6}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    new-array p3, v0, [Ljava/lang/Object;

    const-string p4, "sendRequest appkey null"

    aput-object p4, p3, v2

    const-string p4, "dataId"

    aput-object p4, p3, v4

    iget-object p4, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    aput-object p4, p3, v1

    invoke-interface {p1, p3}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    return-object v3

    .line 17
    :cond_3
    iget-object v3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v3}, Lcom/taobao/accs/net/b;->a()V

    if-nez p3, :cond_4

    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    :cond_4
    move-object v7, p3

    .line 19
    iget-object v5, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    const-string v8, "2|"

    move-object v6, p1

    move-object v9, p2

    move v10, p4

    invoke-static/range {v5 .. v10}, Lcom/taobao/accs/data/Message;->a(Lcom/taobao/accs/net/b;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/accs/ACCSManager$AccsRequest;Z)Lcom/taobao/accs/data/Message;

    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p3

    if-eqz p3, :cond_5

    .line 21
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object p3

    invoke-virtual {p3}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onSend()V

    .line 22
    :cond_5
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p3, p1, v4}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    if-eqz p2, :cond_6

    const-string p3, "accs"

    const-string p4, "send_fail"

    .line 23
    iget-object v3, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->serviceId:Ljava/lang/String;

    const-string v5, "1"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "request "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 25
    invoke-static {p3, p4, v3, v5, v6}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 p4, 0x4

    new-array p4, p4, [Ljava/lang/Object;

    const-string v3, "sendRequest"

    aput-object v3, p4, v2

    const-string v2, "dataId"

    aput-object v2, p4, v4

    iget-object v2, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    aput-object v2, p4, v1

    aput-object p1, p4, v0

    invoke-interface {p3, p4}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    .line 27
    :cond_6
    :goto_1
    iget-object p1, p2, Lcom/taobao/accs/ACCSManager$AccsRequest;->dataId:Ljava/lang/String;

    return-object p1
.end method

.method public sendRequest(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 1
    invoke-virtual/range {v0 .. v7}, Lcom/taobao/accs/internal/ACCSManagerImpl;->sendRequest(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public sendRequest(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/net/URL;)Ljava/lang/String;
    .locals 9

    .line 2
    new-instance v8, Lcom/taobao/accs/ACCSManager$AccsRequest;

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v7}, Lcom/taobao/accs/ACCSManager$AccsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    .line 3
    invoke-virtual {p0, p1, v8}, Lcom/taobao/accs/internal/ACCSManagerImpl;->sendRequest(Landroid/content/Context;Lcom/taobao/accs/ACCSManager$AccsRequest;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public setLoginInfo(Landroid/content/Context;Lcom/taobao/accs/ILoginInfo;)V
    .locals 1

    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object p1

    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lcom/taobao/accs/client/GlobalClientInfo;->setLoginInfoImpl(Ljava/lang/String;Lcom/taobao/accs/ILoginInfo;)V

    return-void
.end method

.method public setMode(Landroid/content/Context;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1, p2}, Lcom/taobao/accs/ACCSClient;->setEnvironment(Landroid/content/Context;I)V

    return-void
.end method

.method public setProxy(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 2

    const-string v0, "EMAS_ACCS_SDK"

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "proxy_host"

    .line 3
    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_0
    const-string p2, "proxy_port"

    .line 4
    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 5
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public startInAppConnection(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/accs/IAppReceiver;)V
    .locals 6

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/taobao/accs/internal/ACCSManagerImpl;->startInAppConnection(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/accs/IAppReceiver;)V

    return-void
.end method

.method public startInAppConnection(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/accs/IAppReceiver;)V
    .locals 2

    if-eqz p5, :cond_0

    .line 2
    invoke-static {}, Lcom/taobao/accs/client/a;->a()Lcom/taobao/accs/client/a;

    move-result-object p3

    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->d:Ljava/lang/String;

    .line 3
    invoke-static {p5}, Lcom/taobao/accs/utl/c;->a(Lcom/taobao/accs/IAppReceiver;)Lcom/taobao/accs/IAppReceiver;

    move-result-object p5

    .line 4
    invoke-virtual {p3, v0, p5}, Lcom/taobao/accs/client/a;->a(Ljava/lang/String;Lcom/taobao/accs/IAppReceiver;)V

    .line 5
    :cond_0
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result p3

    if-nez p3, :cond_1

    .line 6
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p2, "inapp only init in target process!"

    invoke-interface {p1, p2}, Lcom/alibaba/sdk/android/logger/ILog;->w(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_1
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 p5, 0x2

    new-array p5, p5, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "startInAppConnection"

    aput-object v1, p5, v0

    const/4 v0, 0x1

    aput-object p2, p5, v0

    invoke-interface {p3, p5}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 8
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_2

    return-void

    .line 9
    :cond_2
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p3}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_3

    .line 10
    iget-object p3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    iput-object p4, p3, Lcom/taobao/accs/net/b;->a:Ljava/lang/String;

    .line 11
    iput-object p2, p3, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    .line 12
    iget-object p3, p3, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    invoke-virtual {p3}, Lcom/taobao/accs/AccsClientConfig;->getAppSecret()Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/taobao/accs/utl/UtilityImpl;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    :cond_3
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {p1}, Lcom/taobao/accs/net/b;->a()V

    return-void
.end method

.method public unRegisterDataListener(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/taobao/accs/client/GlobalClientInfo;->unregisterListener(Ljava/lang/String;)V

    return-void
.end method

.method public unRegisterService(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/taobao/accs/client/GlobalClientInfo;->unRegisterService(Ljava/lang/String;)V

    return-void
.end method

.method public unbindApp(Landroid/content/Context;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "unbindApp"

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->c:Z

    .line 3
    invoke-direct {p0, p1}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v2, v0, v0}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    invoke-direct {p0, p1, v2}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object v1

    .line 6
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    iget-object v3, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-static {v3, v1}, Lcom/taobao/accs/data/Message;->a(Lcom/taobao/accs/net/b;Landroid/content/Intent;)Lcom/taobao/accs/data/Message;

    move-result-object v1

    .line 8
    invoke-direct {p0, p1, v1, v2, v0}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;Lcom/taobao/accs/data/Message;IZ)V

    :cond_1
    return-void
.end method

.method public unbindService(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unbindService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    const-string v4, "serviceId"

    aput-object v4, v1, v2

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x6

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v1, p2, v0}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-direct {p0, p1, v1}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object v0

    .line 5
    iget-object v2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v2}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 7
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p2, "appKey null"

    invoke-interface {p1, p2}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v5, "appKey"

    .line 8
    invoke-virtual {v0, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    invoke-virtual {v0, v4, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 10
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 11
    iget-object p2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-static {p2, v0}, Lcom/taobao/accs/data/Message;->c(Lcom/taobao/accs/net/b;Landroid/content/Intent;)Lcom/taobao/accs/data/Message;

    move-result-object p2

    .line 12
    invoke-direct {p0, p1, p2, v1, v3}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;Lcom/taobao/accs/data/Message;IZ)V

    goto :goto_0

    .line 13
    :cond_2
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string p2, "unbindService not target process, ignored"

    invoke-interface {p1, p2}, Lcom/alibaba/sdk/android/logger/ILog;->w(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public unbindUser(Landroid/content/Context;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "unBindUse"

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v1, v0, v0}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    invoke-direct {p0, p1, v1}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;I)Landroid/content/Intent;

    move-result-object v0

    .line 5
    iget-object v2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-virtual {v2}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 7
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v0, "appKey null"

    invoke-interface {p1, v0}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v3, "appKey"

    .line 8
    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 10
    iget-object v2, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    invoke-static {v2, v0}, Lcom/taobao/accs/data/Message;->e(Lcom/taobao/accs/net/b;Landroid/content/Intent;)Lcom/taobao/accs/data/Message;

    move-result-object v0

    const/4 v2, 0x0

    .line 11
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/taobao/accs/internal/ACCSManagerImpl;->a(Landroid/content/Context;Lcom/taobao/accs/data/Message;IZ)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->e:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v0, "unBindUser not target process, ignored"

    invoke-interface {p1, v0}, Lcom/alibaba/sdk/android/logger/ILog;->w(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public updateConfig(Lcom/taobao/accs/AccsClientConfig;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/internal/ACCSManagerImpl;->a:Lcom/taobao/accs/net/b;

    instance-of v1, v0, Lcom/taobao/accs/net/j;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Lcom/taobao/accs/net/j;

    invoke-virtual {v0, p1}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/AccsClientConfig;)V

    :cond_0
    return-void
.end method

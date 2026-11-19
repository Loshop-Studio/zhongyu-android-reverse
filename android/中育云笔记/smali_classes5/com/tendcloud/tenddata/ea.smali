.class public Lcom/tendcloud/tenddata/ea;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/ea$a;,
        Lcom/tendcloud/tenddata/ea$b;
    }
.end annotation


# static fields
.field private static a:Ljava/util/concurrent/ScheduledThreadPoolExecutor; = null

.field private static final b:J = 0x7530L

.field private static c:J = 0x0L

.field private static d:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:J = 0x2L

.field private static volatile f:Lcom/tendcloud/tenddata/ea;

.field private static g:Z

.field private static h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/tendcloud/tenddata/ea;->a()Lcom/tendcloud/tenddata/ea;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/cr;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    :catchall_0
    const/4 v0, 0x0

    .line 13
    sput-object v0, Lcom/tendcloud/tenddata/ea;->f:Lcom/tendcloud/tenddata/ea;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-boolean v0, Lcom/tendcloud/tenddata/ea;->g:Z

    .line 17
    .line 18
    sput-boolean v0, Lcom/tendcloud/tenddata/ea;->h:Z

    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/ea;
    .locals 2

    .line 17
    sget-object v0, Lcom/tendcloud/tenddata/ea;->f:Lcom/tendcloud/tenddata/ea;

    if-nez v0, :cond_1

    .line 18
    const-class v0, Lcom/tendcloud/tenddata/ea;

    monitor-enter v0

    .line 19
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ea;->f:Lcom/tendcloud/tenddata/ea;

    if-nez v1, :cond_0

    .line 20
    new-instance v1, Lcom/tendcloud/tenddata/ea;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/ea;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/ea;->f:Lcom/tendcloud/tenddata/ea;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 22
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/ea;->f:Lcom/tendcloud/tenddata/ea;

    return-object v0
.end method

.method private a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 2
    sget-boolean v0, Lcom/tendcloud/tenddata/ea;->h:Z

    if-nez v0, :cond_2

    .line 3
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TalkingData SDK init...\n\tSDK_VERSION is: Android+TD+V5.0.17 gp Type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-static {}, Lcom/tendcloud/tenddata/ab;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  Build_Num:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "2408"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\tApp ID is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\tApp Channel is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->b(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n\tApp Custom is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ab;->c(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n\tSDK_OVC is: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "TDOVC+bef651f672024af5c1311114a8e8ed16+SaaS"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    sget-boolean p2, Lcom/tendcloud/tenddata/ab;->b:Z

    if-nez p2, :cond_0

    sget-boolean p2, Lcom/tendcloud/tenddata/ca;->a:Z

    if-eqz p2, :cond_1

    .line 9
    :cond_0
    const-string p2, "TDLog"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 p1, 0x1

    .line 10
    sput-boolean p1, Lcom/tendcloud/tenddata/ea;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/ea;->d(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 11
    :try_start_0
    const-string p0, "[ModuleInit] current context is null..."

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->eForInternal([Ljava/lang/String;)V

    return v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x1000

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 14
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    .line 15
    array-length v1, p0

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    .line 16
    const-string v4, "android.permission.READ_PHONE_STATE"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    :cond_2
    return v0
.end method

.method public static synthetic b()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/tendcloud/tenddata/ea;->e()V

    return-void
.end method

.method public static synthetic b(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/tendcloud/tenddata/ea;->g(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static synthetic c()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/ea;->d:Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic c(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/tendcloud/tenddata/ea;->h(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method public static synthetic d()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/tendcloud/tenddata/ea;->c:J

    return-wide v0
.end method

.method private static d(Lcom/tendcloud/tenddata/a;)V
    .locals 4

    if-nez p0, :cond_0

    .line 2
    :try_start_0
    const-string p0, "TDFeatures is null..."

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->eForInternal([Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/cb;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Lcom/tendcloud/tenddata/cb;->b(JLcom/tendcloud/tenddata/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method private static e()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/cb;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tendcloud/tenddata/cb;->setInitTime(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private static e(Lcom/tendcloud/tenddata/a;)V
    .locals 4

    .line 3
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/cb;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/cb;->d(Lcom/tendcloud/tenddata/a;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long p0, v0, v2

    if-lez p0, :cond_1

    const/4 p0, 0x1

    .line 6
    sput-boolean p0, Lcom/tendcloud/tenddata/cq;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method private static f()V
    .locals 9

    .line 6
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/tendcloud/tenddata/ea;->c:J

    .line 7
    new-instance v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v0, Lcom/tendcloud/tenddata/ea$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/ea$b;-><init>(Lcom/tendcloud/tenddata/ea$1;)V

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v2, Lcom/tendcloud/tenddata/ea;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 8
    new-instance v3, Lcom/tendcloud/tenddata/ea$a;

    invoke-direct {v3, v1}, Lcom/tendcloud/tenddata/ea$a;-><init>(Lcom/tendcloud/tenddata/ea$1;)V

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x2

    invoke-virtual/range {v2 .. v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static f(Lcom/tendcloud/tenddata/a;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 2
    new-instance v1, Lcom/tendcloud/tenddata/ea$1;

    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/ea$1;-><init>(Lcom/tendcloud/tenddata/a;)V

    .line 3
    sget-wide v2, Lcom/tendcloud/tenddata/ab;->r:J

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/ea;->g(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method private static g()V
    .locals 4

    .line 31
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/el;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/el;-><init>()V

    .line 32
    const-string v1, "env"

    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->b:Ljava/lang/String;

    .line 33
    const-string v1, "getProp"

    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->c:Ljava/lang/String;

    .line 34
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 35
    const-string v2, "sysproperty"

    invoke-static {}, Lcom/tendcloud/tenddata/cq;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->d:Ljava/util/Map;

    .line 37
    sget-object v1, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->a:Lcom/tendcloud/tenddata/a;

    .line 38
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static g(Lcom/tendcloud/tenddata/a;)V
    .locals 9

    .line 1
    const-string v0, "isDeclareIMEI"

    const-string v1, "targetAPI"

    if-nez p0, :cond_0

    .line 2
    :try_start_0
    const-string p0, "TDFeatures is null..."

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->eForInternal([Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 4
    invoke-static {p0}, Lcom/tendcloud/tenddata/ab;->a(Lcom/tendcloud/tenddata/a;)Z

    move-result v3

    .line 5
    const-string v4, "first"

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    sget-object v4, Lcom/tendcloud/tenddata/zz;->a:Ljava/lang/String;

    invoke-static {v4}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 7
    const-string v4, "custom"

    sget-object v5, Lcom/tendcloud/tenddata/zz;->a:Ljava/lang/String;

    invoke-static {v5}, Lcom/tendcloud/tenddata/cq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 8
    :cond_1
    :try_start_1
    sget-object v4, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v4}, Lcom/tendcloud/tenddata/cq;->c(Landroid/content/Context;)I

    move-result v4

    .line 9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "TRACKING"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    move-result-object v5

    const-string v6, "SDK"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    if-eqz v3, :cond_3

    .line 11
    sget-object v5, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v5}, Lcom/tendcloud/tenddata/ea;->a(Landroid/content/Context;)Z

    move-result v5

    .line 12
    sget-object v6, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    const-string v7, "android.permission.READ_PHONE_STATE"

    invoke-static {v6, v7}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    .line 13
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-interface {v2, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    const-string v7, "isGetIMEI"

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-interface {v2, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v5, :cond_3

    if-nez v6, :cond_3

    const/16 v6, 0x17

    if-lt v4, v6, :cond_3

    .line 15
    new-instance v6, Ljava/util/TreeMap;

    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    sput-object v6, Lcom/tendcloud/tenddata/ea;->d:Ljava/util/Map;

    .line 16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    sget-object v1, Lcom/tendcloud/tenddata/ea;->d:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    invoke-static {}, Lcom/tendcloud/tenddata/ea;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    :catchall_0
    :cond_3
    :try_start_2
    new-instance v0, Lcom/tendcloud/tenddata/el;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/el;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 20
    :try_start_3
    const-string v1, "app"

    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->b:Ljava/lang/String;

    .line 21
    const-string v1, "init"

    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->c:Ljava/lang/String;

    .line 22
    iput-object v2, v0, Lcom/tendcloud/tenddata/el;->d:Ljava/util/Map;

    .line 23
    iput-object p0, v0, Lcom/tendcloud/tenddata/el;->a:Lcom/tendcloud/tenddata/a;

    if-eqz v3, :cond_4

    .line 24
    new-instance v1, Lcom/tendcloud/tenddata/ea$2;

    invoke-direct {v1, p0}, Lcom/tendcloud/tenddata/ea$2;-><init>(Lcom/tendcloud/tenddata/a;)V

    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->f:Lcom/tendcloud/tenddata/fe;

    .line 25
    :cond_4
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 26
    :catchall_1
    :try_start_4
    new-instance v0, Lcom/tendcloud/tenddata/ek;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/ek;-><init>()V

    .line 27
    iput-object p0, v0, Lcom/tendcloud/tenddata/ek;->a:Lcom/tendcloud/tenddata/a;

    .line 28
    sget-object p0, Lcom/tendcloud/tenddata/ek$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/ek$a;

    iput-object p0, v0, Lcom/tendcloud/tenddata/ek;->b:Lcom/tendcloud/tenddata/ek$a;

    .line 29
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V

    if-eqz v3, :cond_5

    .line 30
    invoke-static {}, Lcom/tendcloud/tenddata/ea;->g()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    :cond_5
    return-void
.end method

.method private static h(Lcom/tendcloud/tenddata/a;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/el;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tendcloud/tenddata/el;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "app"

    .line 7
    .line 8
    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->b:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, "getIMEI"

    .line 11
    .line 12
    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->c:Ljava/lang/String;

    .line 13
    .line 14
    sget-object v1, Lcom/tendcloud/tenddata/ea;->d:Ljava/util/Map;

    .line 15
    .line 16
    iput-object v1, v0, Lcom/tendcloud/tenddata/el;->d:Ljava/util/Map;

    .line 17
    .line 18
    iput-object p0, v0, Lcom/tendcloud/tenddata/el;->a:Lcom/tendcloud/tenddata/a;

    .line 19
    .line 20
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lcom/tendcloud/tenddata/ek;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/tendcloud/tenddata/ek;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p0, v0, Lcom/tendcloud/tenddata/ek;->a:Lcom/tendcloud/tenddata/a;

    .line 33
    .line 34
    sget-object p0, Lcom/tendcloud/tenddata/ek$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/ek$a;

    .line 35
    .line 36
    iput-object p0, v0, Lcom/tendcloud/tenddata/ek;->b:Lcom/tendcloud/tenddata/ek$a;

    .line 37
    .line 38
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lcom/tendcloud/tenddata/ea;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :catchall_0
    return-void
.end method


# virtual methods
.method public final onTDEBEventInitEvent(Lcom/tendcloud/tenddata/zz$a;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "apiType"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    iget-object v0, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 23
    .line 24
    const-string v2, "action"

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v2, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 35
    .line 36
    const-string v3, "service"

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lcom/tendcloud/tenddata/a;

    .line 43
    .line 44
    const-string v3, "install"

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    const-string v4, "SDK"

    .line 51
    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    :try_start_1
    const-string v3, "deeplink"

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    :cond_1
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-string v5, "TRACKING"

    .line 67
    .line 68
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_5

    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    const-string p1, "init"

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_7

    .line 92
    .line 93
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 94
    .line 95
    invoke-static {}, Lcom/tendcloud/tenddata/ef;->a()Lcom/tendcloud/tenddata/ef;

    .line 96
    .line 97
    .line 98
    invoke-static {}, Lcom/tendcloud/tenddata/dr;->a()Lcom/tendcloud/tenddata/dr;

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/tendcloud/tenddata/dx;->a()Lcom/tendcloud/tenddata/dx;

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lcom/tendcloud/tenddata/ds;->a()Lcom/tendcloud/tenddata/ds;

    .line 105
    .line 106
    .line 107
    invoke-static {}, Lcom/tendcloud/tenddata/ec;->a()Lcom/tendcloud/tenddata/ec;

    .line 108
    .line 109
    .line 110
    invoke-static {}, Lcom/tendcloud/tenddata/dt;->a()Lcom/tendcloud/tenddata/dt;

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lcom/tendcloud/tenddata/dy;->a()Lcom/tendcloud/tenddata/dy;

    .line 114
    .line 115
    .line 116
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->a(Landroid/content/Context;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_3

    .line 121
    .line 122
    invoke-static {}, Lcom/tendcloud/tenddata/ee;->b()Lcom/tendcloud/tenddata/ee;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/ee;->a()V

    .line 127
    .line 128
    .line 129
    invoke-static {}, Lcom/tendcloud/tenddata/dq;->a()Lcom/tendcloud/tenddata/dq;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/dq;->b()V

    .line 134
    .line 135
    .line 136
    :cond_3
    sput-boolean v1, Lcom/tendcloud/tenddata/ab;->b:Z

    .line 137
    .line 138
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    invoke-direct {p0, p1, v2}, Lcom/tendcloud/tenddata/ea;->a(Landroid/content/Context;Lcom/tendcloud/tenddata/a;)V

    .line 149
    .line 150
    .line 151
    :cond_4
    invoke-static {v2}, Lcom/tendcloud/tenddata/ea;->e(Lcom/tendcloud/tenddata/a;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v2}, Lcom/tendcloud/tenddata/ea;->f(Lcom/tendcloud/tenddata/a;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_5
    :goto_0
    new-instance v1, Lcom/tendcloud/tenddata/el;

    .line 159
    .line 160
    invoke-direct {v1}, Lcom/tendcloud/tenddata/el;-><init>()V

    .line 161
    .line 162
    .line 163
    iget-object v3, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 164
    .line 165
    const-string v4, "data"

    .line 166
    .line 167
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    iget-object p1, p1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 172
    .line 173
    const-string v4, "domain"

    .line 174
    .line 175
    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    iput-object p1, v1, Lcom/tendcloud/tenddata/el;->b:Ljava/lang/String;

    .line 184
    .line 185
    iput-object v0, v1, Lcom/tendcloud/tenddata/el;->c:Ljava/lang/String;

    .line 186
    .line 187
    if-eqz v3, :cond_6

    .line 188
    .line 189
    instance-of p1, v3, Ljava/util/Map;

    .line 190
    .line 191
    if-eqz p1, :cond_6

    .line 192
    .line 193
    check-cast v3, Ljava/util/Map;

    .line 194
    .line 195
    iput-object v3, v1, Lcom/tendcloud/tenddata/el;->d:Ljava/util/Map;

    .line 196
    .line 197
    :cond_6
    iput-object v2, v1, Lcom/tendcloud/tenddata/el;->a:Lcom/tendcloud/tenddata/a;

    .line 198
    .line 199
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1, v1}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 204
    .line 205
    .line 206
    :catchall_0
    :cond_7
    :goto_1
    return-void
.end method

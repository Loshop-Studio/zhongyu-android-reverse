.class public abstract Lcom/taobao/accs/net/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static volatile b:Lcom/taobao/accs/net/f;

.field private static final c:[I


# instance fields
.field protected a:Landroid/content/Context;

.field private d:I

.field private e:J

.field private f:Z

.field private g:[I

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/taobao/accs/net/f;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10e
        0x168
        0x1e0
    .end array-data
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/taobao/accs/net/f;->f:Z

    const/4 v1, 0x3

    new-array v1, v1, [I

    .line 3
    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/taobao/accs/net/f;->g:[I

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/taobao/accs/net/f;->h:Z

    .line 5
    :try_start_0
    iput-object p1, p0, Lcom/taobao/accs/net/f;->a:Landroid/content/Context;

    .line 6
    iput v0, p0, Lcom/taobao/accs/net/f;->d:I

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/taobao/accs/net/f;->e:J

    .line 8
    invoke-static {}, Lcom/taobao/accs/utl/OrangeAdapter;->isSmartHb()Z

    move-result p1

    iput-boolean p1, p0, Lcom/taobao/accs/net/f;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "HeartbeatManager"

    .line 9
    invoke-static {v1, v1, p1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public static a(Landroid/content/Context;)Lcom/taobao/accs/net/f;
    .locals 4

    .line 1
    sget-object v0, Lcom/taobao/accs/net/f;->b:Lcom/taobao/accs/net/f;

    if-nez v0, :cond_3

    .line 2
    const-class v0, Lcom/taobao/accs/net/f;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/taobao/accs/net/f;->b:Lcom/taobao/accs/net/f;

    if-nez v1, :cond_2

    .line 4
    invoke-static {p0}, Lcom/taobao/accs/net/f;->b(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v1, "HeartbeatManager"

    const-string v3, "hb use job"

    new-array v2, v2, [Ljava/lang/Object;

    .line 5
    invoke-static {v1, v3, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    new-instance v1, Lcom/taobao/accs/net/t;

    invoke-direct {v1, p0}, Lcom/taobao/accs/net/t;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/taobao/accs/net/f;->b:Lcom/taobao/accs/net/f;

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p0}, Lcom/taobao/accs/net/f;->c(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "HeartbeatManager"

    const-string v3, "hb use alarm"

    new-array v2, v2, [Ljava/lang/Object;

    .line 8
    invoke-static {v1, v3, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    new-instance v1, Lcom/taobao/accs/net/a;

    invoke-direct {v1, p0}, Lcom/taobao/accs/net/a;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/taobao/accs/net/f;->b:Lcom/taobao/accs/net/f;

    goto :goto_0

    :cond_1
    const-string v1, "HeartbeatManager"

    const-string v3, "hb use thread"

    new-array v2, v2, [Ljava/lang/Object;

    .line 10
    invoke-static {v1, v3, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    new-instance v1, Lcom/taobao/accs/net/u;

    invoke-direct {v1, p0}, Lcom/taobao/accs/net/u;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/taobao/accs/net/f;->b:Lcom/taobao/accs/net/f;

    .line 12
    :cond_2
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 13
    :cond_3
    :goto_1
    sget-object p0, Lcom/taobao/accs/net/f;->b:Lcom/taobao/accs/net/f;

    return-object p0
.end method

.method private static b(Landroid/content/Context;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const-class v2, Lcom/taobao/accs/internal/AccsJobService;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static c(Landroid/content/Context;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const-class v2, Lcom/taobao/accs/ServiceReceiver;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 6

    monitor-enter p0

    const/4 v0, 0x0

    .line 14
    :try_start_0
    iget-wide v1, p0, Lcom/taobao/accs/net/f;->e:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/taobao/accs/net/f;->e:J

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/taobao/accs/net/f;->b()I

    move-result v1

    .line 17
    sget-object v2, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v2}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "HeartbeatManager"

    .line 18
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "set "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    :cond_1
    invoke-virtual {p0, v1}, Lcom/taobao/accs/net/f;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_1
    const-string v2, "HeartbeatManager"

    const-string v3, "set"

    new-array v0, v0, [Ljava/lang/Object;

    .line 20
    invoke-static {v2, v3, v1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :goto_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected abstract a(I)V
.end method

.method public b()I
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/taobao/accs/net/f;->h:Z

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/taobao/accs/net/f;->c:[I

    iget v1, p0, Lcom/taobao/accs/net/f;->d:I

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    const/16 v0, 0x10e

    .line 4
    :goto_0
    invoke-static {}, Lcom/taobao/accs/utl/OrangeAdapter;->isSmartHb()Z

    move-result v1

    iput-boolean v1, p0, Lcom/taobao/accs/net/f;->h:Z

    return v0
.end method

.method public c()V
    .locals 3

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/taobao/accs/net/f;->e:J

    .line 3
    iget-boolean v0, p0, Lcom/taobao/accs/net/f;->f:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/taobao/accs/net/f;->g:[I

    iget v1, p0, Lcom/taobao/accs/net/f;->d:I

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    .line 5
    :cond_0
    iget v0, p0, Lcom/taobao/accs/net/f;->d:I

    const/4 v1, 0x0

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput v0, p0, Lcom/taobao/accs/net/f;->d:I

    new-array v0, v1, [Ljava/lang/Object;

    const-string v1, "HeartbeatManager"

    const-string v2, "onNetworkTimeout"

    .line 6
    invoke-static {v1, v2, v0}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public d()V
    .locals 3

    const-wide/16 v0, -0x1

    .line 1
    iput-wide v0, p0, Lcom/taobao/accs/net/f;->e:J

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "HeartbeatManager"

    const-string v2, "onNetworkFail"

    .line 2
    invoke-static {v1, v2, v0}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public e()V
    .locals 7

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "HeartbeatManager"

    const-string v3, "onHeartbeatSucc"

    .line 1
    invoke-static {v2, v3, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/taobao/accs/net/f;->e:J

    sub-long/2addr v3, v5

    const-wide/32 v5, 0x6dd918

    cmp-long v1, v3, v5

    if-lez v1, :cond_0

    .line 3
    iget v1, p0, Lcom/taobao/accs/net/f;->d:I

    sget-object v3, Lcom/taobao/accs/net/f;->c:[I

    array-length v3, v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    if-ge v1, v3, :cond_1

    iget-object v3, p0, Lcom/taobao/accs/net/f;->g:[I

    aget v1, v3, v1

    const/4 v3, 0x2

    if-gt v1, v3, :cond_1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "upgrade"

    .line 4
    invoke-static {v2, v1, v0}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    iget v0, p0, Lcom/taobao/accs/net/f;->d:I

    add-int/2addr v0, v4

    iput v0, p0, Lcom/taobao/accs/net/f;->d:I

    .line 6
    iput-boolean v4, p0, Lcom/taobao/accs/net/f;->f:Z

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/taobao/accs/net/f;->e:J

    goto :goto_0

    .line 8
    :cond_0
    iput-boolean v0, p0, Lcom/taobao/accs/net/f;->f:Z

    .line 9
    iget-object v1, p0, Lcom/taobao/accs/net/f;->g:[I

    iget v2, p0, Lcom/taobao/accs/net/f;->d:I

    aput v0, v1, v2

    :cond_1
    :goto_0
    return-void
.end method

.method public f()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput v0, p0, Lcom/taobao/accs/net/f;->d:I

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/taobao/accs/net/f;->e:J

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "HeartbeatManager"

    const-string v2, "resetLevel"

    .line 3
    invoke-static {v1, v2, v0}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

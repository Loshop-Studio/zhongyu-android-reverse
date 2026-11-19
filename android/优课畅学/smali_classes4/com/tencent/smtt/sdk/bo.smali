.class Lcom/tencent/smtt/sdk/bo;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/tencent/smtt/sdk/bo;

.field private static e:Ljava/nio/channels/FileLock;


# instance fields
.field private b:Lcom/tencent/smtt/sdk/bp;

.field private c:Z

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lcom/tencent/smtt/sdk/bo;
    .locals 2

    sget-object v0, Lcom/tencent/smtt/sdk/bo;->a:Lcom/tencent/smtt/sdk/bo;

    if-nez v0, :cond_1

    const-class v0, Lcom/tencent/smtt/sdk/bo;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tencent/smtt/sdk/bo;->a:Lcom/tencent/smtt/sdk/bo;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tencent/smtt/sdk/bo;

    invoke-direct {v1}, Lcom/tencent/smtt/sdk/bo;-><init>()V

    sput-object v1, Lcom/tencent/smtt/sdk/bo;->a:Lcom/tencent/smtt/sdk/bo;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/smtt/sdk/bo;->a:Lcom/tencent/smtt/sdk/bo;

    return-object v0
.end method


# virtual methods
.method public a(Z)Lcom/tencent/smtt/sdk/bp;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/tencent/smtt/sdk/bo;->b:Lcom/tencent/smtt/sdk/bp;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/tencent/smtt/sdk/bo;->d()Lcom/tencent/smtt/sdk/bp;

    move-result-object p1

    return-object p1
.end method

.method public a()Ljava/nio/channels/FileLock;
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/smtt/sdk/bo;->e:Ljava/nio/channels/FileLock;

    return-object v0
.end method

.method public declared-synchronized a(Landroid/content/Context;)Ljava/nio/channels/FileLock;
    .locals 2

    .line 3
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/tencent/smtt/sdk/bo;->e:Ljava/nio/channels/FileLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    const-string v0, "tbs_rename_lock.txt"

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lcom/tencent/smtt/utils/k;->b(Landroid/content/Context;ZLjava/lang/String;)Ljava/io/FileOutputStream;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Lcom/tencent/smtt/utils/k;->a(Landroid/content/Context;Ljava/io/FileOutputStream;)Ljava/nio/channels/FileLock;

    move-result-object p1

    sput-object p1, Lcom/tencent/smtt/sdk/bo;->e:Ljava/nio/channels/FileLock;

    :goto_0
    sget-object p1, Lcom/tencent/smtt/sdk/bo;->e:Ljava/nio/channels/FileLock;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Landroid/content/Context;Lcom/tencent/smtt/sdk/aj;)V
    .locals 10

    .line 4
    monitor-enter p0

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    :try_start_0
    const-string v1, "x5_core_engine_init_sync"

    invoke-virtual {p2, v1, v0}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_0
    :goto_0
    const/4 v1, 0x1

    invoke-static {v1}, Lcom/tencent/smtt/sdk/l;->a(Z)Lcom/tencent/smtt/sdk/l;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3, v3, p2}, Lcom/tencent/smtt/sdk/l;->a(Landroid/content/Context;ZZLcom/tencent/smtt/sdk/aj;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_1

    const-string v5, "init_x5_core"

    invoke-virtual {p2, v5, v1}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_1
    invoke-virtual {v2}, Lcom/tencent/smtt/sdk/l;->a()Lcom/tencent/smtt/sdk/bd;

    move-result-object v5

    invoke-virtual {v2}, Lcom/tencent/smtt/sdk/l;->b()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    if-eqz v5, :cond_4

    iget-boolean v6, p0, Lcom/tencent/smtt/sdk/bo;->d:Z

    if-nez v6, :cond_5

    if-eqz p2, :cond_2

    iput-boolean v1, p2, Lcom/tencent/smtt/sdk/aj;->a:Z

    :cond_2
    new-instance v6, Lcom/tencent/smtt/sdk/bp;

    invoke-virtual {v5}, Lcom/tencent/smtt/sdk/bd;->b()Lcom/tencent/smtt/export/external/DexLoader;

    move-result-object v8

    invoke-direct {v6, v8}, Lcom/tencent/smtt/sdk/bp;-><init>(Lcom/tencent/smtt/export/external/DexLoader;)V

    iput-object v6, p0, Lcom/tencent/smtt/sdk/bo;->b:Lcom/tencent/smtt/sdk/bp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v6}, Lcom/tencent/smtt/sdk/bp;->a()Z

    move-result v6

    iput-boolean v6, p0, Lcom/tencent/smtt/sdk/bo;->c:Z

    if-nez v6, :cond_3

    const-string v6, "can not use X5 by x5corewizard return false"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v6

    :try_start_2
    iput-boolean v3, p0, Lcom/tencent/smtt/sdk/bo;->c:Z

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "can not use x5 by throwable "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :catch_0
    iput-boolean v1, p0, Lcom/tencent/smtt/sdk/bo;->c:Z

    :cond_3
    :goto_1
    move-object v6, v7

    :goto_2
    iget-boolean v8, p0, Lcom/tencent/smtt/sdk/bo;->c:Z

    if-eqz v8, :cond_6

    invoke-static {}, Lcom/tencent/smtt/sdk/CookieManager;->getInstance()Lcom/tencent/smtt/sdk/CookieManager;

    move-result-object v8

    invoke-virtual {v8, p1, v1, v1}, Lcom/tencent/smtt/sdk/CookieManager;->a(Landroid/content/Context;ZZ)V

    invoke-static {}, Lcom/tencent/smtt/sdk/CookieManager;->getInstance()Lcom/tencent/smtt/sdk/CookieManager;

    move-result-object v8

    invoke-virtual {v8}, Lcom/tencent/smtt/sdk/CookieManager;->a()V

    goto :goto_3

    :cond_4
    iput-boolean v3, p0, Lcom/tencent/smtt/sdk/bo;->c:Z

    const-string v6, "can not use X5 by !tbs available"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    move-object v6, v7

    :cond_6
    :goto_3
    iget-boolean v8, p0, Lcom/tencent/smtt/sdk/bo;->c:Z

    if-nez v8, :cond_d

    const-string v8, "X5CoreEngine"

    const-string v9, "mCanUseX5 is false --> report"

    invoke-static {v8, v9}, Lcom/tencent/smtt/utils/TbsLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/tencent/smtt/sdk/l;->b()Z

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v8, :cond_b

    if-eqz v5, :cond_b

    if-nez v6, :cond_b

    :try_start_3
    invoke-virtual {v5}, Lcom/tencent/smtt/sdk/bd;->b()Lcom/tencent/smtt/export/external/DexLoader;

    move-result-object v2

    if-eqz v2, :cond_7

    const-string v5, "com.tencent.tbs.tbsshell.TBSShell"

    const-string v6, "getLoadFailureDetails"

    new-array v7, v3, [Ljava/lang/Class;

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v5, v6, v7, v3}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_4

    :catchall_2
    move-exception v2

    goto :goto_5

    :cond_7
    :goto_4
    instance-of v2, v7, Ljava/lang/Throwable;

    if-eqz v2, :cond_8

    move-object v2, v7

    check-cast v2, Ljava/lang/Throwable;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "#"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "; cause: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "; th: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    instance-of v2, v7, Ljava/lang/String;

    if-eqz v2, :cond_9

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "failure detail:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_6

    :goto_5
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_9
    :goto_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "isPreloadX5Disabled:-10000"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->getInstance()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;

    move-result-object v2

    new-instance v3, Ljava/lang/Throwable;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "X5CoreEngine::init, mCanUseX5=false, available true, details: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    const/16 v4, 0x198

    invoke-virtual {v2, p1, v4, v3}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->a(Landroid/content/Context;ILjava/lang/Throwable;)V

    goto :goto_7

    :cond_a
    invoke-static {}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->getInstance()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;

    move-result-object v2

    new-instance v3, Ljava/lang/Throwable;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "X5CoreEngine::init, mCanUseX5=false, available true, details: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    const/16 v4, 0x197

    invoke-virtual {v2, p1, v4, v3}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->a(Landroid/content/Context;ILjava/lang/Throwable;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v2}, Lcom/tencent/smtt/sdk/l;->b()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->getInstance()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;

    move-result-object v2

    new-instance v3, Ljava/lang/Throwable;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mCanUseX5=false, available true, reason: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    const/16 v4, 0x199

    invoke-virtual {v2, p1, v4, v3}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->a(Landroid/content/Context;ILjava/lang/Throwable;)V

    goto :goto_7

    :cond_c
    invoke-static {}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->getInstance()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;

    move-result-object v2

    new-instance v3, Ljava/lang/Throwable;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mCanUseX5=false, available false, reason: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    const/16 v4, 0x19a

    invoke-virtual {v2, p1, v4, v3}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->a(Landroid/content/Context;ILjava/lang/Throwable;)V

    goto :goto_7

    :cond_d
    sget-object v2, Lcom/tencent/smtt/sdk/bo;->e:Ljava/nio/channels/FileLock;

    if-nez v2, :cond_e

    invoke-virtual {p0, p1}, Lcom/tencent/smtt/sdk/bo;->a(Landroid/content/Context;)Ljava/nio/channels/FileLock;

    :cond_e
    :goto_7
    iput-boolean v1, p0, Lcom/tencent/smtt/sdk/bo;->d:Z

    if-eqz p2, :cond_f

    const-string p1, "init_x5_core"

    invoke-virtual {p2, p1, v0}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_f
    monitor-exit p0

    return-void

    :goto_8
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public c()Z
    .locals 1

    sget-boolean v0, Lcom/tencent/smtt/sdk/QbSdk;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/tencent/smtt/sdk/bo;->c:Z

    return v0
.end method

.method public d()Lcom/tencent/smtt/sdk/bp;
    .locals 1

    sget-boolean v0, Lcom/tencent/smtt/sdk/QbSdk;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/tencent/smtt/sdk/bo;->b:Lcom/tencent/smtt/sdk/bp;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tencent/smtt/sdk/bo;->d:Z

    return v0
.end method

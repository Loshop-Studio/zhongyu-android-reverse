.class Lcom/tencent/smtt/sdk/l;
.super Ljava/lang/Object;


# static fields
.field static a:Z = false

.field private static c:Lcom/tencent/smtt/sdk/l; = null

.field private static f:I = 0x0

.field private static g:I = 0x0

.field private static h:I = 0x3

.field private static j:Ljava/lang/String;


# instance fields
.field private b:Lcom/tencent/smtt/sdk/bd;

.field private d:Z

.field private e:Z

.field private i:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/smtt/sdk/l;->b:Lcom/tencent/smtt/sdk/bd;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/tencent/smtt/sdk/l;->d:Z

    iput-boolean v1, p0, Lcom/tencent/smtt/sdk/l;->e:Z

    iput-object v0, p0, Lcom/tencent/smtt/sdk/l;->i:Ljava/io/File;

    return-void
.end method

.method public static a(Z)Lcom/tencent/smtt/sdk/l;
    .locals 1

    .line 2
    sget-object v0, Lcom/tencent/smtt/sdk/l;->c:Lcom/tencent/smtt/sdk/l;

    if-nez v0, :cond_1

    if-eqz p0, :cond_1

    const-class p0, Lcom/tencent/smtt/sdk/l;

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/tencent/smtt/sdk/l;->c:Lcom/tencent/smtt/sdk/l;

    if-nez v0, :cond_0

    new-instance v0, Lcom/tencent/smtt/sdk/l;

    invoke-direct {v0}, Lcom/tencent/smtt/sdk/l;-><init>()V

    sput-object v0, Lcom/tencent/smtt/sdk/l;->c:Lcom/tencent/smtt/sdk/l;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    sget-object p0, Lcom/tencent/smtt/sdk/l;->c:Lcom/tencent/smtt/sdk/l;

    return-object p0
.end method

.method public static a(I)V
    .locals 0

    .line 3
    sput p0, Lcom/tencent/smtt/sdk/l;->f:I

    return-void
.end method

.method private b(I)V
    .locals 4

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    sget-object v1, Lcom/tencent/smtt/sdk/l;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/tencent/smtt/sdk/l;->i:Ljava/io/File;

    const-string v3, "count.prop"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p1, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/util/Properties;->store(Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static d()I
    .locals 1

    sget v0, Lcom/tencent/smtt/sdk/l;->f:I

    return v0
.end method

.method private i()I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/tencent/smtt/sdk/l;->i:Ljava/io/File;

    const-string v4, "count.prop"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    return v0

    :cond_0
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-direct {v2, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v1, Ljava/util/Properties;

    invoke-direct {v1}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v1, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    sget-object v3, Lcom/tencent/smtt/sdk/l;->j:Ljava/lang/String;

    const-string v4, "1"

    invoke-virtual {v1, v3, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return v0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    return v0

    :catchall_0
    move-exception v0

    move-object v1, v2

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v2

    move-object v5, v2

    move-object v2, v1

    move-object v1, v5

    :goto_0
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v2, :cond_1

    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1

    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_1
    return v0

    :goto_2
    if-eqz v1, :cond_2

    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_3

    :catch_4
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_3
    throw v0
.end method


# virtual methods
.method public a()Lcom/tencent/smtt/sdk/bd;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/smtt/sdk/l;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/smtt/sdk/l;->b:Lcom/tencent/smtt/sdk/bd;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public declared-synchronized a(Landroid/content/Context;ZZLcom/tencent/smtt/sdk/aj;)V
    .locals 11

    .line 4
    move-object v8, p4

    monitor-enter p0

    const/4 v9, 0x0

    :try_start_0
    new-array v0, v9, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/16 v3, 0x3e7

    invoke-static {v3, v1, v0}, Lcom/tencent/smtt/utils/TbsLog;->addLog(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/tencent/smtt/utils/TbsLog;->initIfNeed(Landroid/content/Context;)V

    sget v0, Lcom/tencent/smtt/sdk/l;->g:I

    const/4 v10, 0x1

    add-int/2addr v0, v10

    sput v0, Lcom/tencent/smtt/sdk/l;->g:I

    if-eqz v8, :cond_1

    if-ne v0, v10, :cond_0

    move v0, v10

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    iput-boolean v0, v8, Lcom/tencent/smtt/sdk/aj;->b:Z

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_1
    :goto_1
    invoke-static {}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->getInstance()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->a()V

    if-eqz v8, :cond_2

    const-string v0, "tbs_rename_task"

    invoke-virtual {p4, v0, v10}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_2
    invoke-static {}, Lcom/tencent/smtt/sdk/ak;->a()Lcom/tencent/smtt/sdk/ak;

    move-result-object v0

    sget v3, Lcom/tencent/smtt/sdk/l;->g:I

    if-ne v3, v10, :cond_3

    move v3, v10

    goto :goto_2

    :cond_3
    move v3, v9

    :goto_2
    invoke-virtual {v0, p1, v3}, Lcom/tencent/smtt/sdk/ak;->b(Landroid/content/Context;Z)V

    const/4 v0, 0x2

    if-eqz v8, :cond_4

    const-string v3, "tbs_rename_task"

    invoke-virtual {p4, v3, v0}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_4
    invoke-static {p1, v10}, Lcom/tencent/smtt/sdk/TbsShareManager;->forceToLoadX5ForThirdApp(Landroid/content/Context;Z)V

    if-eqz v8, :cond_5

    const-string v3, "can_load_x5"

    invoke-virtual {p4, v3, v10}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_5
    invoke-static/range {p1 .. p3}, Lcom/tencent/smtt/sdk/QbSdk;->a(Landroid/content/Context;ZZ)Z

    move-result v3

    if-eqz v8, :cond_6

    const-string v4, "can_load_x5"

    invoke-virtual {p4, v4, v0}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_6
    if-eqz v3, :cond_12

    iget-boolean v3, p0, Lcom/tencent/smtt/sdk/l;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_7

    monitor-exit p0

    return-void

    :cond_7
    :try_start_1
    invoke-static {p1}, Lcom/tencent/smtt/sdk/TbsShareManager;->isThirdPartyApp(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_b

    new-array v3, v9, [Ljava/lang/Object;

    const/16 v4, 0x3e3

    invoke-static {v4, v1, v3}, Lcom/tencent/smtt/utils/TbsLog;->addLog(ILjava/lang/String;[Ljava/lang/Object;)V

    if-eqz v8, :cond_8

    const-string v1, "read_core_info"

    invoke-virtual {p4, v1, v10}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto/16 :goto_9

    :cond_8
    :goto_3
    invoke-static {p1}, Lcom/tencent/smtt/sdk/TbsShareManager;->i(Landroid/content/Context;)Z

    move-result v1

    if-eqz v8, :cond_9

    const-string v3, "read_core_info"

    invoke-virtual {p4, v3, v0}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_9
    if-eqz v1, :cond_a

    new-instance v0, Ljava/io/File;

    invoke-static {p1}, Lcom/tencent/smtt/sdk/TbsShareManager;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/tencent/smtt/sdk/ak;->a()Lcom/tencent/smtt/sdk/ak;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/tencent/smtt/sdk/ak;->n(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    invoke-static {p1}, Lcom/tencent/smtt/sdk/TbsShareManager;->e(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v3

    if-nez v1, :cond_f

    iput-boolean v9, p0, Lcom/tencent/smtt/sdk/l;->d:Z

    const-string v0, "SDKEngine::useSystemWebView by error_tbs_core_dexopt_dir null!"

    invoke-static {p1, v0}, Lcom/tencent/smtt/sdk/QbSdk;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    return-void

    :cond_a
    :try_start_2
    iput-boolean v9, p0, Lcom/tencent/smtt/sdk/l;->d:Z

    const-string v0, "SDKEngine::useSystemWebView by error_host_unavailable"

    invoke-static {p1, v0}, Lcom/tencent/smtt/sdk/QbSdk;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :cond_b
    :try_start_3
    new-array v0, v9, [Ljava/lang/Object;

    const/16 v3, 0x3e4

    invoke-static {v3, v1, v0}, Lcom/tencent/smtt/utils/TbsLog;->addLog(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lcom/tencent/smtt/sdk/ak;->a()Lcom/tencent/smtt/sdk/ak;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/tencent/smtt/sdk/ak;->n(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    sget v1, Lcom/tencent/smtt/sdk/l;->f:I

    const/16 v3, 0x635c

    if-eq v1, v3, :cond_d

    const/16 v3, 0x635d

    if-ne v1, v3, :cond_c

    goto :goto_4

    :cond_c
    move-object v3, p1

    goto :goto_5

    :cond_d
    :goto_4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    move-object v3, v1

    :goto_5
    if-nez v0, :cond_e

    iput-boolean v9, p0, Lcom/tencent/smtt/sdk/l;->d:Z

    const-string v0, "SDKEngine::useSystemWebView by tbs_core_share_dir null!"

    invoke-static {p1, v0}, Lcom/tencent/smtt/sdk/QbSdk;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    return-void

    :cond_e
    move-object v1, v0

    :cond_f
    :try_start_4
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v3, v4}, Lcom/tencent/smtt/sdk/QbSdk;->getDexLoaderFileList(Landroid/content/Context;Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    move v4, v9

    :goto_6
    array-length v5, v6

    if-ge v4, v5, :cond_10

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_10
    invoke-static {}, Lcom/tencent/smtt/sdk/TbsShareManager;->getHostCorePathAppDefined()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_11

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsShareManager;->getHostCorePathAppDefined()Ljava/lang/String;

    move-result-object v1

    :goto_7
    move-object v5, v1

    goto :goto_8

    :cond_11
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :goto_8
    new-instance v1, Lcom/tencent/smtt/sdk/bd;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lcom/tencent/smtt/sdk/QbSdk;->d:Ljava/lang/String;

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lcom/tencent/smtt/sdk/bd;-><init>(Landroid/content/Context;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lcom/tencent/smtt/sdk/aj;)V

    iput-object v1, p0, Lcom/tencent/smtt/sdk/l;->b:Lcom/tencent/smtt/sdk/bd;

    iput-boolean v10, p0, Lcom/tencent/smtt/sdk/l;->d:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_a

    :goto_9
    :try_start_5
    const-string v1, "SDKEngine"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "useSystemWebView by exception: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/tencent/smtt/utils/TbsLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->getInstance()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;

    move-result-object v1

    const/16 v3, 0x147

    invoke-virtual {v1, p1, v3, v0}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->a(Landroid/content/Context;ILjava/lang/Throwable;)V

    iput-boolean v9, p0, Lcom/tencent/smtt/sdk/l;->d:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SDKEngine::useSystemWebView by exception: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/smtt/sdk/QbSdk;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_a

    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "can_load_x5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "; is_compatible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SDKEngine"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SDKEngine.init canLoadTbs=false; failure: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/tencent/smtt/utils/TbsLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-boolean v1, Lcom/tencent/smtt/sdk/QbSdk;->a:Z

    if-eqz v1, :cond_13

    iget-boolean v1, p0, Lcom/tencent/smtt/sdk/l;->d:Z

    if-eqz v1, :cond_13

    goto :goto_a

    :cond_13
    iput-boolean v9, p0, Lcom/tencent/smtt/sdk/l;->d:Z

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->getInstance()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;

    move-result-object v1

    new-instance v3, Ljava/lang/Throwable;

    invoke-direct {v3, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x195

    invoke-virtual {v1, p1, v0, v3}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->a(Landroid/content/Context;ILjava/lang/Throwable;)V

    :goto_a
    invoke-static {p1}, Lcom/tencent/smtt/sdk/ak;->p(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/smtt/sdk/l;->i:Ljava/io/File;

    iput-boolean v10, p0, Lcom/tencent/smtt/sdk/l;->e:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return-void

    :goto_b
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 5
    sput-object p1, Lcom/tencent/smtt/sdk/l;->j:Ljava/lang/String;

    return-void
.end method

.method public b()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/tencent/smtt/sdk/l;->d:Z

    return v0
.end method

.method public b(Z)Z
    .locals 0

    .line 3
    sput-boolean p1, Lcom/tencent/smtt/sdk/l;->a:Z

    return p1
.end method

.method public c()Lcom/tencent/smtt/sdk/bd;
    .locals 1

    iget-object v0, p0, Lcom/tencent/smtt/sdk/l;->b:Lcom/tencent/smtt/sdk/bd;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/tencent/smtt/sdk/l;->b:Lcom/tencent/smtt/sdk/bd;

    if-eqz v0, :cond_1

    sget-boolean v1, Lcom/tencent/smtt/sdk/QbSdk;->a:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/tencent/smtt/sdk/bd;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const-string v0, "system webview get nothing..."

    return-object v0
.end method

.method public f()Z
    .locals 3

    sget-boolean v0, Lcom/tencent/smtt/sdk/l;->a:Z

    if-eqz v0, :cond_3

    sget-object v0, Lcom/tencent/smtt/sdk/l;->j:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, Lcom/tencent/smtt/sdk/l;->i()I

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-direct {p0, v2}, Lcom/tencent/smtt/sdk/l;->b(I)V

    goto :goto_0

    :cond_1
    add-int/2addr v0, v2

    sget v2, Lcom/tencent/smtt/sdk/l;->h:I

    if-gt v0, v2, :cond_2

    invoke-direct {p0, v0}, Lcom/tencent/smtt/sdk/l;->b(I)V

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    sget-boolean v0, Lcom/tencent/smtt/sdk/l;->a:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tencent/smtt/sdk/l;->e:Z

    return v0
.end method

.method public h()Z
    .locals 1

    invoke-static {}, Lcom/tencent/smtt/sdk/QbSdk;->useSoftWare()Z

    move-result v0

    return v0
.end method

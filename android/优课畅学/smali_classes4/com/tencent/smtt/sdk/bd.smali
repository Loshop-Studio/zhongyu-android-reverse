.class Lcom/tencent/smtt/sdk/bd;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:[Ljava/lang/String;

.field private e:Lcom/tencent/smtt/export/external/DexLoader;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lcom/tencent/smtt/sdk/aj;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/smtt/sdk/bd;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/tencent/smtt/sdk/bd;->b:Landroid/content/Context;

    iput-object v0, p0, Lcom/tencent/smtt/sdk/bd;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/smtt/sdk/bd;->d:[Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const-string v1, "TbsDexOpt"

    iput-object v1, p0, Lcom/tencent/smtt/sdk/bd;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/smtt/sdk/bd;->g:Ljava/lang/String;

    const-string v0, "construction start..."

    const-string v1, "TbsWizard"

    invoke-static {v1, v0}, Lcom/tencent/smtt/utils/TbsLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_8

    if-nez p2, :cond_0

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsShareManager;->getHostCorePathAppDefined()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    if-eqz p5, :cond_8

    array-length v0, p5

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/smtt/sdk/bd;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/tencent/smtt/sdk/bd;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/tencent/smtt/sdk/bd;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/tencent/smtt/sdk/bd;->d:[Ljava/lang/String;

    iput-object p4, p0, Lcom/tencent/smtt/sdk/bd;->f:Ljava/lang/String;

    const/4 p3, 0x1

    const-string p5, "load_tbs_dex"

    if-eqz p7, :cond_1

    invoke-virtual {p7, p5, p3}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_1
    new-instance v2, Lcom/tencent/smtt/export/external/DexLoader;

    iget-object v4, p0, Lcom/tencent/smtt/sdk/bd;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/tencent/smtt/sdk/bd;->d:[Ljava/lang/String;

    sget-object v7, Lcom/tencent/smtt/sdk/QbSdk;->l:Ljava/util/Map;

    move-object v6, p4

    move-object v3, p6

    invoke-direct/range {v2 .. v7}, Lcom/tencent/smtt/export/external/DexLoader;-><init>(Ljava/lang/String;Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    iput-object v2, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const/4 p4, 0x2

    if-eqz p7, :cond_2

    invoke-virtual {p7, p5, p4}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_2
    iget-object p5, p0, Lcom/tencent/smtt/sdk/bd;->c:Ljava/lang/String;

    invoke-static {p2, p5}, Lcom/tencent/smtt/export/external/libwebp;->loadWepLibraryIfNeed(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/tencent/smtt/sdk/bd;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p2

    iget-object p2, p2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string p5, "com.nd.android.pandahome2"

    invoke-virtual {p5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const-class p5, Landroid/content/Context;

    filled-new-array {p5}, [Ljava/lang/Class;

    move-result-object p5

    iget-object p6, p0, Lcom/tencent/smtt/sdk/bd;->a:Landroid/content/Context;

    filled-new-array {p6}, [Ljava/lang/Object;

    move-result-object p6

    const-string v0, "com.tencent.tbs.common.beacon.X5CoreBeaconUploader"

    const-string v2, "getInstance"

    invoke-virtual {p2, v0, v2, p5, p6}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p2, Lcom/tencent/smtt/sdk/QbSdk;->l:Ljava/util/Map;

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const-class p6, Ljava/util/Map;

    filled-new-array {p6}, [Ljava/lang/Class;

    move-result-object p6

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "com.tencent.tbs.tbsshell.TBSShell"

    const-string v2, "initTbsSettings"

    invoke-virtual {p5, v0, v2, p6, p2}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const-string p2, "init_tbs"

    if-eqz p7, :cond_5

    invoke-virtual {p7, p2, p3}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_5
    invoke-direct {p0, p1}, Lcom/tencent/smtt/sdk/bd;->a(Landroid/content/Context;)I

    move-result p1

    if-eqz p7, :cond_6

    invoke-virtual {p7, p2, p4}, Lcom/tencent/smtt/sdk/aj;->a(Ljava/lang/String;B)V

    :cond_6
    if-ltz p1, :cond_7

    const-string p1, "construction end..."

    invoke-static {v1, p1}, Lcom/tencent/smtt/utils/TbsLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_7
    new-instance p2, Ljava/lang/Exception;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "TbsWizard init error: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; msg: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/smtt/sdk/bd;->g:Ljava/lang/String;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    new-instance p4, Ljava/lang/Exception;

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string p7, "TbsWizard paramter error:-1callerContext:"

    invoke-virtual {p6, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "hostcontext"

    invoke-virtual {p6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "isEmpty"

    invoke-virtual {p6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    invoke-virtual {p6, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "dexfileList"

    invoke-virtual {p6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p4, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p4
.end method

.method private a(Landroid/content/Context;)I
    .locals 23

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0xa9ec

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v2, v0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const-class v10, Landroid/content/Context;

    const-class v11, Ljava/lang/String;

    filled-new-array {v10, v11, v11, v11, v11}, [Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lcom/tencent/smtt/utils/b;->a:Ljava/lang/String;

    sget-object v5, Lcom/tencent/smtt/utils/b;->b:Ljava/lang/String;

    sget-object v6, Lcom/tencent/smtt/utils/b;->c:Ljava/lang/String;

    sget-object v8, Lcom/tencent/smtt/utils/b;->d:Ljava/lang/String;

    filled-new-array {v1, v4, v5, v6, v8}, [Ljava/lang/Object;

    move-result-object v4

    const-string v12, "com.tencent.tbs.tbsshell.TBSShell"

    const-string v5, "putInfo"

    invoke-virtual {v2, v12, v5, v3, v4}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lcom/tencent/smtt/sdk/bd;->b:Landroid/content/Context;

    const-string v13, "initTesRuntimeEnvironment"

    if-nez v2, :cond_0

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsShareManager;->getHostCorePathAppDefined()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, v0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const-class v21, Ljava/lang/String;

    const-class v22, Ljava/lang/String;

    const-class v14, Landroid/content/Context;

    const-class v15, Landroid/content/Context;

    const-class v16, Lcom/tencent/smtt/export/external/DexLoader;

    const-class v17, Ljava/lang/String;

    const-class v18, Ljava/lang/String;

    const-class v19, Ljava/lang/String;

    sget-object v20, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array/range {v14 .. v22}, [Ljava/lang/Class;

    move-result-object v14

    iget-object v2, v0, Lcom/tencent/smtt/sdk/bd;->b:Landroid/content/Context;

    iget-object v4, v0, Lcom/tencent/smtt/sdk/bd;->c:Ljava/lang/String;

    iget-object v5, v0, Lcom/tencent/smtt/sdk/bd;->f:Ljava/lang/String;

    invoke-static {}, Lcom/tencent/smtt/sdk/QbSdk;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsShareManager;->getHostCorePathAppDefined()Ljava/lang/String;

    move-result-object v9

    const-string v6, "3.5.0.1063"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v12, v13, v14, v2}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    move-object/from16 v1, p1

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    sget-object v20, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v21, Ljava/lang/String;

    const-class v14, Landroid/content/Context;

    const-class v15, Landroid/content/Context;

    const-class v16, Lcom/tencent/smtt/export/external/DexLoader;

    const-class v17, Ljava/lang/String;

    const-class v18, Ljava/lang/String;

    const-class v19, Ljava/lang/String;

    filled-new-array/range {v14 .. v21}, [Ljava/lang/Class;

    move-result-object v9

    iget-object v2, v0, Lcom/tencent/smtt/sdk/bd;->b:Landroid/content/Context;

    iget-object v4, v0, Lcom/tencent/smtt/sdk/bd;->c:Ljava/lang/String;

    iget-object v5, v0, Lcom/tencent/smtt/sdk/bd;->f:Ljava/lang/String;

    const-string v6, "3.5.0.1063"

    invoke-static {}, Lcom/tencent/smtt/sdk/QbSdk;->a()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v1, p1

    filled-new-array/range {v1 .. v8}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v12, v13, v9, v2}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    invoke-direct {v0}, Lcom/tencent/smtt/sdk/bd;->c()V

    invoke-direct {v0}, Lcom/tencent/smtt/sdk/bd;->d()V

    iget-object v2, v0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const-class v3, Lcom/tencent/smtt/export/external/DexLoader;

    filled-new-array {v10, v10, v3, v11, v11}, [Ljava/lang/Class;

    move-result-object v3

    iget-object v4, v0, Lcom/tencent/smtt/sdk/bd;->b:Landroid/content/Context;

    iget-object v5, v0, Lcom/tencent/smtt/sdk/bd;->c:Ljava/lang/String;

    iget-object v6, v0, Lcom/tencent/smtt/sdk/bd;->f:Ljava/lang/String;

    filled-new-array {v1, v4, v2, v5, v6}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v12, v13, v3, v1}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :cond_1
    if-nez v2, :cond_2

    const/4 v1, -0x3

    goto :goto_1

    :cond_2
    instance-of v1, v2, Ljava/lang/Integer;

    if-eqz v1, :cond_3

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_3
    instance-of v1, v2, Ljava/lang/Throwable;

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->getInstance()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;

    move-result-object v1

    iget-object v3, v0, Lcom/tencent/smtt/sdk/bd;->a:Landroid/content/Context;

    const/16 v4, 0x148

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v1, v3, v4, v2}, Lcom/tencent/smtt/sdk/TbsCoreLoadStat;->a(Landroid/content/Context;ILjava/lang/Throwable;)V

    const/4 v1, -0x5

    goto :goto_1

    :cond_4
    const/4 v1, -0x4

    :goto_1
    if-gez v1, :cond_7

    iget-object v2, v0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    new-array v3, v3, [Ljava/lang/Object;

    const-string v5, "getLoadFailureDetails"

    invoke-virtual {v2, v12, v5, v4, v3}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Throwable;

    if-eqz v3, :cond_5

    move-object v3, v2

    check-cast v3, Ljava/lang/Throwable;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "#"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "; cause: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "; th: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/tencent/smtt/sdk/bd;->g:Ljava/lang/String;

    :cond_5
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_6

    check-cast v2, Ljava/lang/String;

    :goto_2
    iput-object v2, v0, Lcom/tencent/smtt/sdk/bd;->g:Ljava/lang/String;

    :cond_6
    return v1

    :cond_7
    const/4 v2, 0x0

    goto :goto_2
.end method

.method private c()V
    .locals 5

    iget-object v0, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const-class v1, Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    const-string v2, "3.5.0.1063"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "com.tencent.tbs.tbsshell.TBSShell"

    const-string v4, "setTesSdkVersionName"

    invoke-virtual {v0, v3, v4, v1, v2}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const v1, 0xa9ec

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "com.tencent.tbs.tbsshell.TBSShell"

    const-string v3, "VERSION"

    invoke-virtual {v0, v2, v3, v1}, Lcom/tencent/smtt/export/external/DexLoader;->setStaticField(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 9

    .line 2
    iget-object v0, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const-class v1, [Ljava/lang/Class;

    const-class v2, [Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    filled-new-array {v3, v4, v4, v1, v2}, [Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "com.tencent.smtt.util.CrashTracker"

    const-string v6, "getCrashExtraInfo"

    const/4 v7, 0x0

    filled-new-array {v2, v5, v6, v7, v4}, [Ljava/lang/Object;

    move-result-object v2

    const-string v4, "com.tencent.tbs.tbsshell.WebCoreProxy"

    const-string v8, "invokeStaticMethod"

    invoke-virtual {v0, v4, v8, v1, v2}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v5, v6, v7, v1}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ReaderPackName="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/tencent/smtt/sdk/TbsReaderView;->gReaderPackName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ReaderPackVersion="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/tencent/smtt/sdk/TbsReaderView;->gReaderPackVersion:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_1
    if-nez v7, :cond_2

    const-string v0, "X5 core get nothing..."

    return-object v0

    :cond_2
    return-object v7
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    const-class v1, Ljava/lang/String;

    const-class v2, Landroid/os/Bundle;

    const-class v3, Landroid/content/Context;

    filled-new-array {v3, v1, v1, v2}, [Ljava/lang/Class;

    move-result-object v1

    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "com.tencent.tbs.tbsshell.WebCoreProxy"

    const-string p3, "installLocalQbApk"

    invoke-virtual {v0, p2, p3, v1, p1}, Lcom/tencent/smtt/export/external/DexLoader;->invokeStaticMethod(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public b()Lcom/tencent/smtt/export/external/DexLoader;
    .locals 1

    iget-object v0, p0, Lcom/tencent/smtt/sdk/bd;->e:Lcom/tencent/smtt/export/external/DexLoader;

    return-object v0
.end method

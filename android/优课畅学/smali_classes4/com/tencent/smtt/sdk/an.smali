.class Lcom/tencent/smtt/sdk/an;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/tencent/smtt/sdk/ak;


# direct methods
.method public constructor <init>(Lcom/tencent/smtt/sdk/ak;Landroid/content/Context;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/smtt/sdk/an;->c:Lcom/tencent/smtt/sdk/ak;

    iput-object p2, p0, Lcom/tencent/smtt/sdk/an;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/tencent/smtt/sdk/an;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const-string v0, "TbsInstaller--quickDexOptForThirdPartyApp thread start"

    const-string v1, "TbsInstaller"

    invoke-static {v1, v0}, Lcom/tencent/smtt/utils/TbsLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/tencent/smtt/sdk/an;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/tencent/smtt/sdk/TbsShareManager;->getHostCorePathAppDefined()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/tencent/smtt/sdk/an;->c:Lcom/tencent/smtt/sdk/ak;

    invoke-virtual {v2, v0}, Lcom/tencent/smtt/sdk/ak;->n(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lcom/tencent/smtt/sdk/an;->c:Lcom/tencent/smtt/sdk/ak;

    iget-object v3, p0, Lcom/tencent/smtt/sdk/an;->b:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/tencent/smtt/sdk/ak;->n(Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    new-instance v3, Lcom/tencent/smtt/sdk/ap;

    invoke-direct {v3, p0}, Lcom/tencent/smtt/sdk/ap;-><init>(Lcom/tencent/smtt/sdk/an;)V

    invoke-static {v0, v2, v3}, Lcom/tencent/smtt/utils/k;->a(Ljava/io/File;Ljava/io/File;Ljava/io/FileFilter;)Z

    const-string v0, "TbsInstaller--quickDexOptForThirdPartyApp thread done"

    invoke-static {v1, v0}, Lcom/tencent/smtt/utils/TbsLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

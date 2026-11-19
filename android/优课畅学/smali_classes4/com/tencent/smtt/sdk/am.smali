.class Lcom/tencent/smtt/sdk/am;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/tencent/smtt/sdk/ak;


# direct methods
.method public constructor <init>(Lcom/tencent/smtt/sdk/ak;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/smtt/sdk/am;->a:Lcom/tencent/smtt/sdk/ak;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/tencent/smtt/sdk/QbSdk;->setTBSInstallingStatus(Z)V

    iget v1, p1, Landroid/os/Message;->what:I

    const-string v2, "TbsInstaller"

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v1, v0, :cond_2

    if-eq v1, v3, :cond_1

    const/4 v3, 0x3

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE_EX"

    invoke-static {v2, v1}, Lcom/tencent/smtt/utils/TbsLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/tencent/smtt/sdk/am;->a:Lcom/tencent/smtt/sdk/ak;

    aget-object v3, v1, v4

    check-cast v3, Landroid/content/Context;

    aget-object v0, v1, v0

    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {v2, v3, v0}, Lcom/tencent/smtt/sdk/ak;->b(Landroid/content/Context;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    const-string v1, "TbsInstaller--handleMessage--MSG_COPY_TBS_CORE"

    invoke-static {v2, v1}, Lcom/tencent/smtt/utils/TbsLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/tencent/smtt/sdk/am;->a:Lcom/tencent/smtt/sdk/ak;

    aget-object v5, v1, v4

    check-cast v5, Landroid/content/Context;

    aget-object v0, v1, v0

    check-cast v0, Landroid/content/Context;

    aget-object v1, v1, v3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v5, v0, v1}, Lcom/tencent/smtt/sdk/ak;->a(Lcom/tencent/smtt/sdk/ak;Landroid/content/Context;Landroid/content/Context;I)V

    goto :goto_0

    :cond_2
    const-string v1, "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE"

    invoke-static {v2, v1}, Lcom/tencent/smtt/utils/TbsLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/tencent/smtt/sdk/am;->a:Lcom/tencent/smtt/sdk/ak;

    aget-object v5, v1, v4

    check-cast v5, Landroid/content/Context;

    aget-object v0, v1, v0

    check-cast v0, Ljava/lang/String;

    aget-object v1, v1, v3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v2, v5, v0, v1}, Lcom/tencent/smtt/sdk/ak;->a(Lcom/tencent/smtt/sdk/ak;Landroid/content/Context;Ljava/lang/String;I)V

    :goto_0
    invoke-static {v4}, Lcom/tencent/smtt/sdk/QbSdk;->setTBSInstallingStatus(Z)V

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void
.end method

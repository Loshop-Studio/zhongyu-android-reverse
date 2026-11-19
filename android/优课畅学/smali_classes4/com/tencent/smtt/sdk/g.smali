.class final Lcom/tencent/smtt/sdk/g;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/smtt/sdk/g;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/tencent/smtt/sdk/g;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    invoke-static {}, Lcom/tencent/smtt/sdk/ak;->a()Lcom/tencent/smtt/sdk/ak;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/smtt/sdk/g;->a:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/tencent/smtt/sdk/ak;->a(ZLandroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/tencent/smtt/sdk/ak;->a()Lcom/tencent/smtt/sdk/ak;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/smtt/sdk/g;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/tencent/smtt/sdk/ak;->b(Landroid/content/Context;Z)V

    :cond_0
    invoke-static {v2}, Lcom/tencent/smtt/sdk/l;->a(Z)Lcom/tencent/smtt/sdk/l;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/smtt/sdk/g;->a:Landroid/content/Context;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v3, v4}, Lcom/tencent/smtt/sdk/l;->a(Landroid/content/Context;ZZLcom/tencent/smtt/sdk/aj;)V

    invoke-static {}, Lcom/tencent/smtt/sdk/bo;->b()Lcom/tencent/smtt/sdk/bo;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/smtt/sdk/g;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v4}, Lcom/tencent/smtt/sdk/bo;->a(Landroid/content/Context;Lcom/tencent/smtt/sdk/aj;)V

    invoke-virtual {v0}, Lcom/tencent/smtt/sdk/bo;->c()Z

    move-result v0

    iget-object v1, p0, Lcom/tencent/smtt/sdk/g;->b:Landroid/os/Handler;

    const/4 v3, 0x3

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/tencent/smtt/sdk/g;->b:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/tencent/smtt/sdk/g;->b:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

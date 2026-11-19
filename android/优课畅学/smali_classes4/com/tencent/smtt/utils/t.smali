.class Lcom/tencent/smtt/utils/t;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/tencent/smtt/utils/s;


# direct methods
.method public constructor <init>(Lcom/tencent/smtt/utils/s;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/smtt/utils/t;->a:Lcom/tencent/smtt/utils/s;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/tencent/smtt/utils/t;->a:Lcom/tencent/smtt/utils/s;

    aget-object v1, v0, v1

    check-cast v1, Landroid/content/Context;

    aget-object v0, v0, v2

    check-cast v0, Ljava/lang/String;

    invoke-static {v3, v1, v0}, Lcom/tencent/smtt/utils/s;->a(Lcom/tencent/smtt/utils/s;Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/tencent/smtt/utils/t;->a:Lcom/tencent/smtt/utils/s;

    aget-object v0, v0, v1

    check-cast v0, Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/tencent/smtt/utils/s;->a(Lcom/tencent/smtt/utils/s;Landroid/content/Context;)V

    goto :goto_1

    :cond_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v1, v0, v1

    check-cast v1, Landroid/content/Context;

    aget-object v0, v0, v2

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/tencent/smtt/utils/s;->b(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    return-void
.end method

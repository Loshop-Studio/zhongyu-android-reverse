.class Lcom/tencent/smtt/sdk/ai;
.super Landroid/os/HandlerThread;


# static fields
.field private static a:Lcom/tencent/smtt/sdk/ai;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized a()Lcom/tencent/smtt/sdk/ai;
    .locals 3

    const-class v0, Lcom/tencent/smtt/sdk/ai;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tencent/smtt/sdk/ai;->a:Lcom/tencent/smtt/sdk/ai;

    if-nez v1, :cond_0

    new-instance v1, Lcom/tencent/smtt/sdk/ai;

    const-string v2, "TbsHandlerThread"

    invoke-direct {v1, v2}, Lcom/tencent/smtt/sdk/ai;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/tencent/smtt/sdk/ai;->a:Lcom/tencent/smtt/sdk/ai;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/tencent/smtt/sdk/ai;->a:Lcom/tencent/smtt/sdk/ai;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

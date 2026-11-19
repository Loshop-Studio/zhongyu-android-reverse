.class public Lb/d/b/i/d;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:Lb/d/b/i/f;


# direct methods
.method public constructor <init>(Lb/d/b/i/f;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lb/d/b/i/d;->d:Lb/d/b/i/f;

    iput-object p2, p0, Lb/d/b/i/d;->b:Ljava/lang/String;

    iput p3, p0, Lb/d/b/i/d;->c:I

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    iget-object v0, p0, Lb/d/b/i/d;->d:Lb/d/b/i/f;

    iget-object v1, p0, Lb/d/b/i/d;->b:Ljava/lang/String;

    iget v2, p0, Lb/d/b/i/d;->c:I

    .line 1
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v4, 0x1

    :try_start_0
    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    const/16 v6, 0x400

    new-array v6, v6, [B

    :goto_0
    invoke-virtual {v1, v6}, Ljava/io/InputStream;->read([B)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_0

    new-instance v8, Ljava/lang/String;

    const/4 v9, 0x0

    invoke-direct {v8, v6, v9, v7}, Ljava/lang/String;-><init>([BII)V

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "UpdateVersionManager"

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lb/b/b/i;

    invoke-direct {v1}, Lb/b/b/i;-><init>()V

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-class v6, Lcom/zykj/satisfaction/update/UpdateResp;

    invoke-virtual {v1, v5, v6}, Lb/b/b/i;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/satisfaction/update/UpdateResp;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/zykj/satisfaction/update/UpdateResp;->getResult()Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lcom/zykj/satisfaction/update/UpdateResp;->getResult()Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;

    move-result-object v1

    iput-object v1, v0, Lb/d/b/i/f;->f:Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->getVersionCode()I

    move-result v1

    if-le v1, v2, :cond_1

    iget-object v1, v0, Lb/d/b/i/f;->d:Lb/d/b/i/f$d;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v4, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    goto :goto_2

    :cond_1
    iget-object v1, v0, Lb/d/b/i/f;->d:Lb/d/b/i/f$d;

    :goto_1
    invoke-static {v1, v4, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    goto :goto_2

    :cond_2
    iget-object v1, v0, Lb/d/b/i/f;->d:Lb/d/b/i/f$d;

    goto :goto_1

    :goto_2
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v1

    iget-object v0, v0, Lb/d/b/i/f;->d:Lb/d/b/i/f$d;

    invoke-static {v0, v4, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    return-void
.end method

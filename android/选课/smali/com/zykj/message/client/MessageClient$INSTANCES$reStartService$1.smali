.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$reStartService$1;
.super Ljava/util/TimerTask;
.source "MessageClient.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->reStartService()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/zykj/message/client/MessageClient$INSTANCES$reStartService$1",
        "Ljava/util/TimerTask;",
        "run",
        "",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 158
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$reStartService$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u91cd\u542f\u670d\u52a1 1S\u540e\u7684\u8d85\u65f6\u4efb\u52a1\u542f\u52a8"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessageClient"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.zykj.action.zykj.message.service"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "com.zykj.manage"

    .line 162
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 163
    iget-object v2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$reStartService$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {v2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMContext$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;

    move-result-object v2

    .line 165
    iget-object v3, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$reStartService$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {v3}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMConnection$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    move-result-object v3

    check-cast v3, Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    .line 163
    invoke-virtual {v2, v0, v3, v4}, Landroid/app/Application;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u670d\u52a1\u6ca1\u5728\u8fd0\u884c\uff1f\u7ed1\u5b9a\u5931\u8d25\u4e86 "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$reStartService$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMHandler$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method

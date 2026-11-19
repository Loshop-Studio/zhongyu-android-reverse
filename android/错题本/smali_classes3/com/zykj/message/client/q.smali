.class public final Lcom/zykj/message/client/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/client/q;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/q;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Ld4/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v1, Ld4/b;

    .line 12
    .line 13
    invoke-virtual {v1}, Ld4/b;->f()Lcom/zykj/message/server/bean/ServerInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMHandler$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v2, Lcom/zykj/message/client/p;

    .line 26
    .line 27
    invoke-direct {v2, p0, v1}, Lcom/zykj/message/client/p;-><init>(Lcom/zykj/message/client/q;Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method

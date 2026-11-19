.class public final Lcom/zykj/message/client/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES;

.field public final synthetic b:Lr6/c;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/message/client/o;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/message/client/o;->b:Lr6/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/o;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Ld4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v1, Ld4/b;

    .line 10
    .line 11
    invoke-virtual {v1}, Ld4/b;->f()Lcom/zykj/message/server/bean/ServerInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMHandler$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v2, Lcom/zykj/message/client/n;

    .line 22
    .line 23
    invoke-direct {v2, p0, v1}, Lcom/zykj/message/client/n;-><init>(Lcom/zykj/message/client/o;Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

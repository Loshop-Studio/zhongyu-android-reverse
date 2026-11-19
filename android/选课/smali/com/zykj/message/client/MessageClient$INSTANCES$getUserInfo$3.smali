.class final Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3;
.super Ljava/lang/Object;
.source "MessageClient.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->getUserInfo(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field final synthetic $callBack:Lkotlin/jvm/functions/Function1;

.field final synthetic this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3;->$callBack:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 229
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Lcom/zykj/message/server/MessageServer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->getUserInfo()Lcom/zykj/message/server/bean/UserInfo;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 230
    :goto_0
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMHandler$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3$1;

    invoke-direct {v2, p0, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3;Lcom/zykj/message/server/bean/UserInfo;)V

    check-cast v2, Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

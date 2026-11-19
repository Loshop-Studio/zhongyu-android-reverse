.class final Lcom/zykj/message/client/MessageClient$INSTANCES$unRegisterListener$1;
.super Ljava/lang/Object;
.source "MessageClient.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->unRegisterListener(Lcom/zykj/message/listener/BaseMessageCallBack;)V
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
.field final synthetic $messageCallBack:Lcom/zykj/message/listener/BaseMessageCallBack;

.field final synthetic this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/listener/BaseMessageCallBack;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$unRegisterListener$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$unRegisterListener$1;->$messageCallBack:Lcom/zykj/message/listener/BaseMessageCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 444
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$unRegisterListener$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Lcom/zykj/message/server/MessageServer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$unRegisterListener$1;->$messageCallBack:Lcom/zykj/message/listener/BaseMessageCallBack;

    check-cast v1, Lcom/zykj/message/server/MessageCallBack;

    invoke-interface {v0, v1}, Lcom/zykj/message/server/MessageServer;->unRegisterCallBack(Lcom/zykj/message/server/MessageCallBack;)V

    :cond_0
    return-void
.end method

.class final Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$2;
.super Ljava/lang/Object;
.source "MessageClient.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->registerListener(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
.field final synthetic $serverCallBack:Lkotlin/jvm/functions/Function1;

.field final synthetic $userCallBack:Lkotlin/jvm/functions/Function1;

.field final synthetic this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$2;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$2;->$serverCallBack:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$2;->$userCallBack:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 406
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$2;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Lcom/zykj/message/server/MessageServer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 407
    new-instance v1, Lcom/zykj/message/listener/DefaultMessageCallBack;

    .line 408
    iget-object v2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$2;->$serverCallBack:Lkotlin/jvm/functions/Function1;

    .line 409
    iget-object v3, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$2;->$userCallBack:Lkotlin/jvm/functions/Function1;

    .line 407
    invoke-direct {v1, v2, v3}, Lcom/zykj/message/listener/DefaultMessageCallBack;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lcom/zykj/message/server/MessageCallBack;

    .line 406
    invoke-interface {v0, v1}, Lcom/zykj/message/server/MessageServer;->registerCallBack(Lcom/zykj/message/server/MessageCallBack;)V

    :cond_0
    return-void
.end method

.class final Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1;
.super Ljava/lang/Object;
.source "MessageClient.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->registerServerListener(Lkotlin/jvm/functions/Function1;)V
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

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1;->$callBack:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 422
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Lcom/zykj/message/server/MessageServer;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/zykj/message/listener/DefaultMessageCallBack;

    iget-object v2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1;->$callBack:Lkotlin/jvm/functions/Function1;

    sget-object v3, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1$1;->INSTANCE:Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1$1;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v2, v3}, Lcom/zykj/message/listener/DefaultMessageCallBack;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lcom/zykj/message/server/MessageCallBack;

    invoke-interface {v0, v1}, Lcom/zykj/message/server/MessageServer;->registerCallBack(Lcom/zykj/message/server/MessageCallBack;)V

    :cond_0
    return-void
.end method

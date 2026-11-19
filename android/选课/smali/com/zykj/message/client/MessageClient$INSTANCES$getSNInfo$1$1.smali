.class final Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1$1;
.super Ljava/lang/Object;
.source "MessageClient.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;->run()V
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
.field final synthetic this$0:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;


# direct methods
.method constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 308
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;

    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;->$callBack:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;

    iget-object v1, v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-virtual {v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Lcom/zykj/message/server/MessageServer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/zykj/message/server/MessageServer;->getSNInfo()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

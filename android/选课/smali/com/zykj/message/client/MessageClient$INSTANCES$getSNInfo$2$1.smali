.class final Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2$1;
.super Ljava/lang/Object;
.source "MessageClient.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;->invoke()V
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
.field final synthetic this$0:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;


# direct methods
.method constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 314
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;

    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-static {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMHandler$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2$1$1;

    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2$1$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2$1;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

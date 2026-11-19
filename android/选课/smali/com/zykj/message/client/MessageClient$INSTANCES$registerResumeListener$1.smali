.class final Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;
.super Ljava/lang/Object;
.source "MessageClient.kt"

# interfaces
.implements Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->registerResumeListener()V
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
        "onResume"
    }
    k = 0x3
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

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResume()V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1$1;

    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getServerInfo(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

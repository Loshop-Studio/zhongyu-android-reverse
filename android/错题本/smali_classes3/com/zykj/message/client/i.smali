.class public final Lcom/zykj/message/client/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/client/i;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/i;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMHandler$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/zykj/message/client/h;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/zykj/message/client/h;-><init>(Lcom/zykj/message/client/i;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

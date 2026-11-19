.class public final Lcom/zykj/message/client/g;
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
    iput-object p1, p0, Lcom/zykj/message/client/g;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/message/client/g;->b:Lr6/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/g;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->access$getMHandler$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/zykj/message/client/f;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/zykj/message/client/f;-><init>(Lcom/zykj/message/client/g;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

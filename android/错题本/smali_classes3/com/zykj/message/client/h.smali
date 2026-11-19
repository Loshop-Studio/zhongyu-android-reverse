.class public final Lcom/zykj/message/client/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/i;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/client/h;->a:Lcom/zykj/message/client/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/h;->a:Lcom/zykj/message/client/i;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/i;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;->$callBack:Lr6/c;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;->this$0:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Ld4/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast v0, Ld4/b;

    .line 16
    .line 17
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void
.end method
